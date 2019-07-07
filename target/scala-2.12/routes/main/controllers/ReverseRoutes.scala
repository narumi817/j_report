// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sat Jul 06 17:27:32 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReversePerformanceInfoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def performanceInfoAdd(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "performance")
    }
  
    // @LINE:13
    def performanceInfoUpdate(performanceId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "performance/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("performanceId", performanceId)))
    }
  
    // @LINE:16
    def performanceInfoDelete(performanceId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "performance/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("performanceId", performanceId)) + "/delete")
    }
  
    // @LINE:12
    def performanceInfoEdit(performanceId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "performance/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("performanceId", performanceId)))
    }
  
    // @LINE:8
    def performanceInfoNew(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "performance/new")
    }
  
    // @LINE:5
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "performance")
    }
  
  }


}
