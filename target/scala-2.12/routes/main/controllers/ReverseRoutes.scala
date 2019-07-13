// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Sat Jul 13 08:32:43 UTC 2019

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
  class ReverseArtistController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def artistNew(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "artists/new")
    }
  
    // @LINE:12
    def artistEdit(artistId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "artists/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("artistId", artistId)))
    }
  
    // @LINE:16
    def artistDelete(artistId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "artists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("artistId", artistId)) + "/delete")
    }
  
    // @LINE:5
    def artistList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "artists")
    }
  
    // @LINE:9
    def artistAdd(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "artists")
    }
  
    // @LINE:13
    def artistUpdate(artistId:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "artists/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("artistId", artistId)))
    }
  
  }


}
