// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Sat Jul 13 08:32:43 UTC 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Assets_0: controllers.Assets,
  // @LINE:5
  ArtistController_1: controllers.ArtistController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Assets_0: controllers.Assets,
    // @LINE:5
    ArtistController_1: controllers.ArtistController
  ) = this(errorHandler, Assets_0, ArtistController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, ArtistController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists""", """controllers.ArtistController.artistList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists/new""", """controllers.ArtistController.artistNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists""", """controllers.ArtistController.artistAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists/edit/""" + "$" + """artistId<[^/]+>""", """controllers.ArtistController.artistEdit(artistId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists/""" + "$" + """artistId<[^/]+>""", """controllers.ArtistController.artistUpdate(artistId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """artists/""" + "$" + """artistId<[^/]+>/delete""", """controllers.ArtistController.artistDelete(artistId:Int)"""),
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
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_ArtistController_artistList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists")))
  )
  private[this] lazy val controllers_ArtistController_artistList1_invoker = createInvoker(
    ArtistController_1.artistList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistList",
      Nil,
      "GET",
      this.prefix + """artists""",
      """ artist List display""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ArtistController_artistNew2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists/new")))
  )
  private[this] lazy val controllers_ArtistController_artistNew2_invoker = createInvoker(
    ArtistController_1.artistNew(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistNew",
      Nil,
      "GET",
      this.prefix + """artists/new""",
      """ artist input form""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ArtistController_artistAdd3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists")))
  )
  private[this] lazy val controllers_ArtistController_artistAdd3_invoker = createInvoker(
    ArtistController_1.artistAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistAdd",
      Nil,
      "POST",
      this.prefix + """artists""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ArtistController_artistEdit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists/edit/"), DynamicPart("artistId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtistController_artistEdit4_invoker = createInvoker(
    ArtistController_1.artistEdit(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistEdit",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """artists/edit/""" + "$" + """artistId<[^/]+>""",
      """ update data""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ArtistController_artistUpdate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists/"), DynamicPart("artistId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ArtistController_artistUpdate5_invoker = createInvoker(
    ArtistController_1.artistUpdate(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistUpdate",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """artists/""" + "$" + """artistId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ArtistController_artistDelete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("artists/"), DynamicPart("artistId", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_ArtistController_artistDelete6_invoker = createInvoker(
    ArtistController_1.artistDelete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ArtistController",
      "artistDelete",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """artists/""" + "$" + """artistId<[^/]+>/delete""",
      """ delete data""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:5
    case controllers_ArtistController_artistList1_route(params@_) =>
      call { 
        controllers_ArtistController_artistList1_invoker.call(ArtistController_1.artistList())
      }
  
    // @LINE:8
    case controllers_ArtistController_artistNew2_route(params@_) =>
      call { 
        controllers_ArtistController_artistNew2_invoker.call(ArtistController_1.artistNew())
      }
  
    // @LINE:9
    case controllers_ArtistController_artistAdd3_route(params@_) =>
      call { 
        controllers_ArtistController_artistAdd3_invoker.call(ArtistController_1.artistAdd())
      }
  
    // @LINE:12
    case controllers_ArtistController_artistEdit4_route(params@_) =>
      call(params.fromPath[Int]("artistId", None)) { (artistId) =>
        controllers_ArtistController_artistEdit4_invoker.call(ArtistController_1.artistEdit(artistId))
      }
  
    // @LINE:13
    case controllers_ArtistController_artistUpdate5_route(params@_) =>
      call(params.fromPath[Int]("artistId", None)) { (artistId) =>
        controllers_ArtistController_artistUpdate5_invoker.call(ArtistController_1.artistUpdate(artistId))
      }
  
    // @LINE:16
    case controllers_ArtistController_artistDelete6_route(params@_) =>
      call(params.fromPath[Int]("artistId", None)) { (artistId) =>
        controllers_ArtistController_artistDelete6_invoker.call(ArtistController_1.artistDelete(artistId))
      }
  }
}
