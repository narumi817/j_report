
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[PerformanceInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(items: Seq[PerformanceInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>ジャニーズ みんなのコンサートレポ</title>
    </head>
    <body>
        <section>
            <h1>公演 一覧</h1>
            <table>
                <thead>
                    <tr>
                        <th>日程</th>
                        <th>開演時間</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*20.22*/items/*20.27*/.map/*20.31*/ { performanceInfo =>_display_(Seq[Any](format.raw/*20.52*/("""
                        """),format.raw/*21.25*/("""<tr>
                            <td>"""),_display_(/*22.34*/performanceInfo/*22.49*/.date),format.raw/*22.54*/("""</td>
                            <td>"""),_display_(/*23.34*/performanceInfo/*23.49*/.time),format.raw/*23.54*/("""</td>
                            <td><a href=""""),_display_(/*24.43*/controllers/*24.54*/.routes.PerformanceInfoController.performanceInfoEdit(performanceInfo.id.get)),format.raw/*24.131*/("""">公演情報 編集</a></td>
                            <td><a href="">詳細</a></td>
                        </tr>
                    """)))}),format.raw/*27.22*/("""
                """),format.raw/*28.17*/("""</tbody>
            </table>
            <br>
            <a href=""""),_display_(/*31.23*/controllers/*31.34*/.routes.PerformanceInfoController.performanceInfoNew()),format.raw/*31.88*/("""">登録画面</a>
        </section>
    </body>
</html>"""))
      }
    }
  }

  def render(items:Seq[PerformanceInfo]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((Seq[PerformanceInfo]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-08T14:11:24.130
                  SOURCE: /home/j-report/app/views/list.scala.html
                  HASH: 875d8d58677591d938ebcc055c639f1b29895606
                  MATRIX: 432->1|767->20|890->50|917->51|1346->453|1360->458|1373->462|1432->483|1485->508|1550->546|1574->561|1600->566|1666->605|1690->620|1716->625|1791->673|1811->684|1910->761|2066->886|2111->903|2207->972|2227->983|2302->1037
                  LINES: 17->1|22->2|27->3|28->4|44->20|44->20|44->20|44->20|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|51->27|52->28|55->31|55->31|55->31
                  -- GENERATED --
              */
          