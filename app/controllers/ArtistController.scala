package controllers

import javax.inject._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._

import services._

class ArtistController @Inject()(artistService: ArtistService, mcc: MessagesControllerComponents) extends MessagesAbstractController(mcc) {

  def artistList() = Action { implicit request: MessagesRequest[AnyContent] =>
    val items: Seq[Artist] = artistService.artistList()
    Ok(views.html.artistList(items))
  }

  val artistForm = Form(
    mapping(
      "id" -> optional(number),
    "name" -> nonEmptyText,
    "name_read" -> optional(text)
    )(Artist.apply)(Artist.unapply)
  )

  def artistNew() = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.artistCreateForm(artistForm))
  }

  def artistAdd() = Action { implicit request: MessagesRequest[AnyContent] =>
    val artist: Artist = artistForm.bindFromRequest().get
    artistService.artistInsert(artist)
    Redirect(routes.ArtistController.artistList())
  }

  def artistEdit(artistId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    artistService.artistFindById(artistId).map { artist =>
      Ok(views.html.artistEditForm(artistId, artistForm.fill(artist)))
    }.getOrElse(NotFound)
  }

  def artistUpdate(artistId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    val artist: Artist = artistForm.bindFromRequest.get
    artistService.artistUpdate(artistId, artist)
    Redirect(routes.ArtistController.artistList())
  }

  def artistDelete(artistId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    artistService.artistDelete(artistId)
    Redirect(routes.ArtistController.artistList())
  }
}
