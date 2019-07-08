
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import services._

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Int,Form[PerformanceInfo],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(id: Int, performanceInfoForm: Form[PerformanceInfo])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
<head>
    <title>ジャニーズ　みんなのコンサートレポ</title>
</head>
<body>
<h1>公演 編集</h1>

"""),_display_(/*11.2*/helper/*11.8*/.form(action = routes.PerformanceInfoController.performanceInfoUpdate(id))/*11.82*/ {_display_(Seq[Any](format.raw/*11.84*/("""
"""),_display_(/*12.2*/helper/*12.8*/.CSRF.formField),format.raw/*12.23*/("""

    """),format.raw/*14.5*/("""<fieldset>

        """),_display_(/*16.10*/helper/*16.16*/.inputText(performanceInfoForm("date"), '_label -> "日程")),format.raw/*16.72*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(performanceInfoForm("time"), '_label -> "開演時間")),format.raw/*17.74*/("""

    """),format.raw/*19.5*/("""</fieldset>

    <input type="submit" value="登録">

""")))}),format.raw/*23.2*/("""

"""),_display_(/*25.2*/helper/*25.8*/.form(action = routes.PerformanceInfoController.performanceInfoDelete(id))/*25.82*/ {_display_(Seq[Any](format.raw/*25.84*/("""
"""),_display_(/*26.2*/helper/*26.8*/.CSRF.formField),format.raw/*26.23*/("""

    """),format.raw/*28.5*/("""<input type="submit" value="削除" class="btn danger">

""")))}),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(id:Int,performanceInfoForm:Form[PerformanceInfo],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(id,performanceInfoForm)(request)

  def f:((Int,Form[PerformanceInfo]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (id,performanceInfoForm) => (request) => apply(id,performanceInfoForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-08T14:11:24.160
                  SOURCE: /home/j-report/app/views/editForm.scala.html
                  HASH: acd74c1fd68e60b3c4d5326cdd9ed053b1d2176e
                  MATRIX: 432->1|798->20|986->115|1013->116|1122->199|1136->205|1219->279|1259->281|1287->283|1301->289|1337->304|1370->310|1418->331|1433->337|1510->393|1547->403|1562->409|1641->467|1674->473|1756->525|1785->528|1799->534|1882->608|1922->610|1950->612|1964->618|2000->633|2033->639|2117->693|2145->694
                  LINES: 17->1|22->2|27->3|28->4|35->11|35->11|35->11|35->11|36->12|36->12|36->12|38->14|40->16|40->16|40->16|41->17|41->17|41->17|43->19|47->23|49->25|49->25|49->25|49->25|50->26|50->26|50->26|52->28|54->30|55->31
                  -- GENERATED --
              */
          