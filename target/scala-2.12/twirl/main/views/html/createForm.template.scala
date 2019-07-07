
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

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[PerformanceInfo],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(performanceInfoForm: Form[PerformanceInfo])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>ジャニーズ　みんなのコンサートレポ</title>
    </head>
    <body>
        <h1>公演 登録</h1>

        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.PerformanceInfoController.performanceInfoAdd())/*11.85*/ {_display_(Seq[Any](format.raw/*11.87*/("""
        """),_display_(/*12.10*/helper/*12.16*/.CSRF.formField),format.raw/*12.31*/("""

        """),format.raw/*14.9*/("""<fieldset>

            """),_display_(/*16.14*/helper/*16.20*/.inputText(performanceInfoForm("date"), '_label -> "日程")),format.raw/*16.76*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(performanceInfoForm("time"), '_label -> "開演時間")),format.raw/*17.78*/("""

        """),format.raw/*19.9*/("""</fieldset>

        <input type="submit" value="登録">

        """)))}),format.raw/*23.10*/("""

    """),format.raw/*25.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(performanceInfoForm:Form[PerformanceInfo],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(performanceInfoForm)(request)

  def f:((Form[PerformanceInfo]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (performanceInfoForm) => (request) => apply(performanceInfoForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-06T17:25:29.098
                  SOURCE: /Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/app/views/createForm.scala.html
                  HASH: 1ef5e1c0384c0ab81a8498537ba7c2dc2720bdef
                  MATRIX: 432->1|796->20|975->106|1002->107|1144->222|1159->228|1237->297|1277->299|1314->309|1329->315|1365->330|1402->340|1454->365|1469->371|1546->427|1587->441|1602->447|1681->505|1718->515|1813->579|1846->585
                  LINES: 17->1|22->2|27->3|28->4|35->11|35->11|35->11|35->11|36->12|36->12|36->12|38->14|40->16|40->16|40->16|41->17|41->17|41->17|43->19|47->23|49->25
                  -- GENERATED --
              */
          