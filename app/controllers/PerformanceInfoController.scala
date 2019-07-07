package controllers

import javax.inject._
import play.api.mvc._

import play.api.data._
import play.api.data.Forms._

import services._

class PerformanceInfoController @Inject()(performanceInfoService: PerformanceInfoService, mcc: MessagesControllerComponents) extends MessagesAbstractController(mcc) {

  def list() = Action { implicit request: MessagesRequest[AnyContent] =>
    val items: Seq[PerformanceInfo] = performanceInfoService.list()
    Ok(views.html.list(items))
  }

  val performanceInfoForm = Form(
    mapping(
      "id" -> optional(number),
    "date" -> nonEmptyText,
    "time" -> nonEmptyText
    )(PerformanceInfo.apply)(PerformanceInfo.unapply)
  )

  def performanceInfoNew() = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.createForm(performanceInfoForm))
  }

  def performanceInfoAdd() = Action { implicit request: MessagesRequest[AnyContent] =>
    val performanceInfo: PerformanceInfo = performanceInfoForm.bindFromRequest().get
    performanceInfoService.insert(performanceInfo)
    Redirect(routes.PerformanceInfoController.list())
  }

  def performanceInfoEdit(performanceInfoId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    performanceInfoService.findById(performanceInfoId).map { performanceInfo =>
      Ok(views.html.editForm(performanceInfoId, performanceInfoForm.fill(performanceInfo)))
    }.getOrElse(NotFound)
  }

  def performanceInfoUpdate(performanceInfoId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    val performanceInfo: PerformanceInfo = performanceInfoForm.bindFromRequest.get
    performanceInfoService.update(performanceInfoId, performanceInfo)
    Redirect(routes.PerformanceInfoController.list())
  }

  def performanceInfoDelete(performanceInfoId: Int) = Action { implicit request: MessagesRequest[AnyContent] =>
    performanceInfoService.delete(performanceInfoId)
    Redirect(routes.PerformanceInfoController.list())
  }
}
