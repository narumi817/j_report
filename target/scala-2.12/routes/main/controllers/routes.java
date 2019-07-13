// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Sat Jul 13 08:32:43 UTC 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseArtistController ArtistController = new controllers.ReverseArtistController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseArtistController ArtistController = new controllers.javascript.ReverseArtistController(RoutesPrefix.byNamePrefix());
  }

}
