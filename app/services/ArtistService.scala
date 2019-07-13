package services

import javax.inject.Inject

import anorm.SqlParser._
import anorm._
import play.api.db.DBApi

import scala.language.postfixOps

case class Artist(id: Option[Int], name: String, name_read: Option[String])

@javax.inject.Singleton
class ArtistService @Inject() (dbApi: DBApi) {

  private val db = dbApi.database("default")

  val artist = {
    get[Option[Int]]("id") ~
    get[String]("name") ~
    get[Option[String]]("name_read") map {
      case id ~ name ~ name_read => Artist(id, name, name_read)
    }
  }

  def artistList(): Seq[Artist] = {

    db.withConnection { implicit connection =>

      SQL(
        """
          SELECT * FROM artist_group WHERE delete_flg = false ORDER BY id;
        """
      ).as(artist.*)

    }

  }

  def artistFindById(id: Int): Option[Artist] = {
    db.withConnection { implicit connection =>
      SQL(
        """
          SELECT * FROM artist_group WHERE id = {id}
        """
      ).on(
        'id -> id
      ).as(artist.singleOpt)
    }
  }

  def artistInsert(artist: Artist): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          INSERT INTO artist_group (name, name_read) VALUES ({name}, {name_read})
        """
      ).on(
        'name -> artist.name,
        'name_read -> artist.name_read
      ).executeUpdate()
    }
  }

  def artistUpdate(id: Int, artist: Artist): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          UPDATE artist_group SET name = {name}, name_read = {name_read} WHERE id = {id}
        """
      ).on(
        'name -> artist.name,
        'name_read -> artist.name_read,
        'id -> id
      ).executeUpdate()
    }
  }

  def artistDelete(id: Int): Int = {
    db.withConnection { implicit connection =>
      SQL(
        """
          UPDATE artist_group SET delete_flg = true WHERE id = {id}
        """
      ).on(
        'id -> id
      ).executeUpdate()
    }
  }

}