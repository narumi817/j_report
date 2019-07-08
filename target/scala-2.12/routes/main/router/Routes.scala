// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Mon Jul 08 14:11:23 UTC 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Assets_1: controllers.Assets,
  // @LINE:5
  PerformanceInfoController_0: controllers.PerformanceInfoController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Assets_1: controllers.Assets,
    // @LINE:5
    PerformanceInfoController_0: controllers.PerformanceInfoController
  ) = this(errorHandler, Assets_1, PerformanceInfoController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, PerformanceInfoController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance""", """controllers.PerformanceInfoController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance/new""", """controllers.PerformanceInfoController.performanceInfoNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance""", """controllers.PerformanceInfoController.performanceInfoAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance/edit/""" + "$" + """performanceId<[^/]+>""", """controllers.PerformanceInfoController.performanceInfoEdit(performanceId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance/""" + "$" + """performanceId<[^/]+>""", """controllers.PerformanceInfoController.performanceInfoUpdate(performanceId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """performance/""" + "$" + """performanceId<[^/]+>/delete""", """controllers.PerformanceInfoController.performanceInfoDelete(performanceId:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_PerformanceInfoController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance")))
  )
  private[this] lazy val controllers_PerformanceInfoController_list1_invoker = createInvoker(
    PerformanceInfoController_0.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "list",
      Nil,
      "GET",
      this.prefix + """performance""",
      """ List display""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoNew2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance/new")))
  )
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoNew2_invoker = createInvoker(
    PerformanceInfoController_0.performanceInfoNew(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "performanceInfoNew",
      Nil,
      "GET",
      this.prefix + """performance/new""",
      """ input form""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoAdd3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance")))
  )
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoAdd3_invoker = createInvoker(
    PerformanceInfoController_0.performanceInfoAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "performanceInfoAdd",
      Nil,
      "POST",
      this.prefix + """performance""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoEdit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance/edit/"), DynamicPart("performanceId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoEdit4_invoker = createInvoker(
    PerformanceInfoController_0.performanceInfoEdit(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "performanceInfoEdit",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """performance/edit/""" + "$" + """performanceId<[^/]+>""",
      """ update data""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoUpdate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance/"), DynamicPart("performanceId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoUpdate5_invoker = createInvoker(
    PerformanceInfoController_0.performanceInfoUpdate(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "performanceInfoUpdate",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """performance/""" + "$" + """performanceId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoDelete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("performance/"), DynamicPart("performanceId", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_PerformanceInfoController_performanceInfoDelete6_invoker = createInvoker(
    PerformanceInfoController_0.performanceInfoDelete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PerformanceInfoController",
      "performanceInfoDelete",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """performance/""" + "$" + """performanceId<[^/]+>/delete""",
      """ delete data""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:5
    case controllers_PerformanceInfoController_list1_route(params@_) =>
      call { 
        controllers_PerformanceInfoController_list1_invoker.call(PerformanceInfoController_0.list())
      }
  
    // @LINE:8
    case controllers_PerformanceInfoController_performanceInfoNew2_route(params@_) =>
      call { 
        controllers_PerformanceInfoController_performanceInfoNew2_invoker.call(PerformanceInfoController_0.performanceInfoNew())
      }
  
    // @LINE:9
    case controllers_PerformanceInfoController_performanceInfoAdd3_route(params@_) =>
      call { 
        controllers_PerformanceInfoController_performanceInfoAdd3_invoker.call(PerformanceInfoController_0.performanceInfoAdd())
      }
  
    // @LINE:12
    case controllers_PerformanceInfoController_performanceInfoEdit4_route(params@_) =>
      call(params.fromPath[Int]("performanceId", None)) { (performanceId) =>
        controllers_PerformanceInfoController_performanceInfoEdit4_invoker.call(PerformanceInfoController_0.performanceInfoEdit(performanceId))
      }
  
    // @LINE:13
    case controllers_PerformanceInfoController_performanceInfoUpdate5_route(params@_) =>
      call(params.fromPath[Int]("performanceId", None)) { (performanceId) =>
        controllers_PerformanceInfoController_performanceInfoUpdate5_invoker.call(PerformanceInfoController_0.performanceInfoUpdate(performanceId))
      }
  
    // @LINE:16
    case controllers_PerformanceInfoController_performanceInfoDelete6_route(params@_) =>
      call(params.fromPath[Int]("performanceId", None)) { (performanceId) =>
        controllers_PerformanceInfoController_performanceInfoDelete6_invoker.call(PerformanceInfoController_0.performanceInfoDelete(performanceId))
      }
  }
}
