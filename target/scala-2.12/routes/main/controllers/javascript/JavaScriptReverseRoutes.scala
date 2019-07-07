// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mizukoshinarumi/workspace/scala_workspace/play-hands-on/conf/routes
// @DATE:Sat Jul 06 17:27:32 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReversePerformanceInfoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def performanceInfoAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.performanceInfoAdd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "performance"})
        }
      """
    )
  
    // @LINE:13
    def performanceInfoUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.performanceInfoUpdate",
      """
        function(performanceId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "performance/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("performanceId", performanceId0))})
        }
      """
    )
  
    // @LINE:16
    def performanceInfoDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.performanceInfoDelete",
      """
        function(performanceId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "performance/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("performanceId", performanceId0)) + "/delete"})
        }
      """
    )
  
    // @LINE:12
    def performanceInfoEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.performanceInfoEdit",
      """
        function(performanceId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "performance/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("performanceId", performanceId0))})
        }
      """
    )
  
    // @LINE:8
    def performanceInfoNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.performanceInfoNew",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "performance/new"})
        }
      """
    )
  
    // @LINE:5
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PerformanceInfoController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "performance"})
        }
      """
    )
  
  }


}
