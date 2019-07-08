package services

import javax.inject.Inject

import anorm.SqlParser._
import anorm._
import play.api.db.DBApi

import scala.language.postfixOps

case class PerformanceInfo(id: Option[Int], date: String, time: String)

@javax.inject.Singleton
class PerformanceInfoService @Inject() (dbApi: DBApi) {

  private val db = dbApi.database("default")

  val simple = {
    get[Option[Int]]("performanceInfo.id") ~
    get[String]("performanceInfo.date") ~
    get[String]("performanceInfo.time") map {
      case id ~ date ~ time => PerformanceInfo(id, date, time)
    }
  }

  def list(): Seq[PerformanceInfo] = {

    db.withConnection { implicit connection =>

      SQL(
        """
          SELECT * FROM performance_info
        """
      ).as(simple *)

    }

  }

  def findById(id: Int): Option[PerformanceInfo] = {
    db.withConnection { implicit connection =>
      SQL(
        """
          SELECT * FROM performance_info WHERE id = {id}
        """
      ).on(
        'id -> id
      ).as(simple.singleOpt)
    }
  }

  def insert(performanceInfo: PerformanceInfo): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          INSERT INTO performance_info (date, time) VALUES ({date}, {time})
        """
      ).on(
        'date -> performanceInfo.date,
        'time -> performanceInfo.time
      ).executeUpdate()
    }
  }

  def update(id: Int, performanceInfo: PerformanceInfo): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          UPDATE performance_info SET date = {date}, time = {time} WHERE id = {id}
        """
      ).on(
        'date -> performanceInfo.date,
        'time -> performanceInfo.time,
        'id -> id
      ).executeUpdate()
    }
  }

  def delete(id: Int): Int = {
    db.withConnection { implicit connection =>
      SQL(
        """
          DELETE FROM performance_info WHERE id = {id}
        """
      ).on(
        'id -> id
      ).executeUpdate()
    }
  }

}