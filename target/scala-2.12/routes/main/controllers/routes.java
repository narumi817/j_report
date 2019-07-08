// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Mon Jul 08 14:11:23 UTC 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePerformanceInfoController PerformanceInfoController = new controllers.ReversePerformanceInfoController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePerformanceInfoController PerformanceInfoController = new controllers.javascript.ReversePerformanceInfoController(RoutesPrefix.byNamePrefix());
  }

}
