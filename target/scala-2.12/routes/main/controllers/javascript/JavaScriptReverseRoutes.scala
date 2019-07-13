// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Sat Jul 13 08:32:43 UTC 2019

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
  class ReverseArtistController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def artistNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistNew",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artists/new"})
        }
      """
    )
  
    // @LINE:12
    def artistEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistEdit",
      """
        function(artistId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artists/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("artistId", artistId0))})
        }
      """
    )
  
    // @LINE:16
    def artistDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistDelete",
      """
        function(artistId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("artistId", artistId0)) + "/delete"})
        }
      """
    )
  
    // @LINE:5
    def artistList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "artists"})
        }
      """
    )
  
    // @LINE:9
    def artistAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistAdd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artists"})
        }
      """
    )
  
    // @LINE:13
    def artistUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ArtistController.artistUpdate",
      """
        function(artistId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "artists/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("artistId", artistId0))})
        }
      """
    )
  
  }


}
