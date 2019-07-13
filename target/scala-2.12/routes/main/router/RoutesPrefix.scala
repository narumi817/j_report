// @GENERATOR:play-routes-compiler
// @SOURCE:/home/j-report/conf/routes
// @DATE:Sat Jul 13 08:32:43 UTC 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
