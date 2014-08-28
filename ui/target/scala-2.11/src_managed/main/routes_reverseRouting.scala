// @SOURCE:/home/sulta/Dropbox/git/uis/ui/conf/routes
// @HASH:55626712d3ee60e74f018a1173c03dfa503b2a2a
// @DATE:Thu Aug 28 22:26:59 ALMT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:66
// @LINE:65
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDemo {
    

// @LINE:14
def datatables(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "datatables")
}
                        

// @LINE:52
def error404(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "error404")
}
                        

// @LINE:50
def lock(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "lock")
}
                        

// @LINE:37
def typography(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "typography")
}
                        

// @LINE:54
def email_template(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "email_template")
}
                        

// @LINE:23
def other_editors(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "other_editors")
}
                        

// @LINE:19
def validation(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validation")
}
                        

// @LINE:58
def applayout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "applayout")
}
                        

// @LINE:51
def error500(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "error500")
}
                        

// @LINE:35
def nestable_list(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "nestable_list")
}
                        

// @LINE:25
def image_editor(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "image_editor")
}
                        

// @LINE:43
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:20
def bootstrap_forms(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "bootstrap_forms")
}
                        

// @LINE:34
def treeview(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "treeview")
}
                        

// @LINE:31
def flags(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "flags")
}
                        

// @LINE:7
def dashboard(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                        

// @LINE:45
def pricing_table(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "pricing_table")
}
                        

// @LINE:22
def wizard(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "wizard")
}
                        

// @LINE:18
def form_templates(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "form_templates")
}
                        

// @LINE:28
def buttons(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "buttons")
}
                        

// @LINE:42
def forum(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "forum")
}
                        

// @LINE:39
def widgets(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "widgets")
}
                        

// @LINE:44
def timeline(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "timeline")
}
                        

// @LINE:59
def forgotpassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "forgotpassword")
}
                        

// @LINE:41
def gmap_xml(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "gmap_xml")
}
                        

// @LINE:36
def jqui(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "jqui")
}
                        

// @LINE:21
def plugins(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "plugins")
}
                        

// @LINE:24
def dropzone(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dropzone")
}
                        

// @LINE:29
def fa(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "fa")
}
                        

// @LINE:12
def dygraphs(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dygraphs")
}
                        

// @LINE:56
def ckeditor(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "ckeditor")
}
                        

// @LINE:11
def inline_charts(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "inline_charts")
}
                        

// @LINE:49
def register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

// @LINE:8
def inbox(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "inbox")
}
                        

// @LINE:33
def grid(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "grid")
}
                        

// @LINE:15
def jqgrid(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "jqgrid")
}
                        

// @LINE:17
def form_elements(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "form_elements")
}
                        

// @LINE:57
def difver(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "difver")
}
                        

// @LINE:27
def general_elements(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "general_elements")
}
                        

// @LINE:55
def search(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "search")
}
                        

// @LINE:46
def invoice(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "invoice")
}
                        

// @LINE:53
def blank(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blank")
}
                        

// @LINE:10
def morris(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "morris")
}
                        

// @LINE:30
def glyph(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "glyph")
}
                        

// @LINE:9
def flot(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "flot")
}
                        

// @LINE:38
def calendar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "calendar")
}
                        

// @LINE:13
def table(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "table")
}
                        

// @LINE:47
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:40
def gallery(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "gallery")
}
                        
    
}
                          

// @LINE:66
// @LINE:65
class ReverseAssets {
    

// @LINE:65
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

// @LINE:66
def versioned(file:Asset): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
}
                        
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        
    
}
                          
}
                  


// @LINE:66
// @LINE:65
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDemo {
    

// @LINE:14
def datatables : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.datatables",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datatables"})
      }
   """
)
                        

// @LINE:52
def error404 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.error404",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error404"})
      }
   """
)
                        

// @LINE:50
def lock : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.lock",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lock"})
      }
   """
)
                        

// @LINE:37
def typography : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.typography",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "typography"})
      }
   """
)
                        

// @LINE:54
def email_template : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.email_template",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email_template"})
      }
   """
)
                        

// @LINE:23
def other_editors : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.other_editors",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "other_editors"})
      }
   """
)
                        

// @LINE:19
def validation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.validation",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validation"})
      }
   """
)
                        

// @LINE:58
def applayout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.applayout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "applayout"})
      }
   """
)
                        

// @LINE:51
def error500 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.error500",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "error500"})
      }
   """
)
                        

// @LINE:35
def nestable_list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.nestable_list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nestable_list"})
      }
   """
)
                        

// @LINE:25
def image_editor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.image_editor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "image_editor"})
      }
   """
)
                        

// @LINE:43
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:20
def bootstrap_forms : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.bootstrap_forms",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bootstrap_forms"})
      }
   """
)
                        

// @LINE:34
def treeview : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.treeview",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "treeview"})
      }
   """
)
                        

// @LINE:31
def flags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.flags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "flags"})
      }
   """
)
                        

// @LINE:7
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

// @LINE:45
def pricing_table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.pricing_table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pricing_table"})
      }
   """
)
                        

// @LINE:22
def wizard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.wizard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wizard"})
      }
   """
)
                        

// @LINE:18
def form_templates : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.form_templates",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form_templates"})
      }
   """
)
                        

// @LINE:28
def buttons : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.buttons",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buttons"})
      }
   """
)
                        

// @LINE:42
def forum : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.forum",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum"})
      }
   """
)
                        

// @LINE:39
def widgets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.widgets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
      }
   """
)
                        

// @LINE:44
def timeline : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.timeline",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timeline"})
      }
   """
)
                        

// @LINE:59
def forgotpassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.forgotpassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotpassword"})
      }
   """
)
                        

// @LINE:41
def gmap_xml : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.gmap_xml",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gmap_xml"})
      }
   """
)
                        

// @LINE:36
def jqui : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.jqui",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jqui"})
      }
   """
)
                        

// @LINE:21
def plugins : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.plugins",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plugins"})
      }
   """
)
                        

// @LINE:24
def dropzone : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.dropzone",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dropzone"})
      }
   """
)
                        

// @LINE:29
def fa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.fa",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fa"})
      }
   """
)
                        

// @LINE:12
def dygraphs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.dygraphs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dygraphs"})
      }
   """
)
                        

// @LINE:56
def ckeditor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.ckeditor",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckeditor"})
      }
   """
)
                        

// @LINE:11
def inline_charts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.inline_charts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inline_charts"})
      }
   """
)
                        

// @LINE:49
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:8
def inbox : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.inbox",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inbox"})
      }
   """
)
                        

// @LINE:33
def grid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.grid",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grid"})
      }
   """
)
                        

// @LINE:15
def jqgrid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.jqgrid",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jqgrid"})
      }
   """
)
                        

// @LINE:17
def form_elements : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.form_elements",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form_elements"})
      }
   """
)
                        

// @LINE:57
def difver : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.difver",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "difver"})
      }
   """
)
                        

// @LINE:27
def general_elements : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.general_elements",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "general_elements"})
      }
   """
)
                        

// @LINE:55
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:46
def invoice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.invoice",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "invoice"})
      }
   """
)
                        

// @LINE:53
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blank"})
      }
   """
)
                        

// @LINE:10
def morris : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.morris",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "morris"})
      }
   """
)
                        

// @LINE:30
def glyph : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.glyph",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "glyph"})
      }
   """
)
                        

// @LINE:9
def flot : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.flot",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "flot"})
      }
   """
)
                        

// @LINE:38
def calendar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.calendar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calendar"})
      }
   """
)
                        

// @LINE:13
def table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "table"})
      }
   """
)
                        

// @LINE:47
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:40
def gallery : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.gallery",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gallery"})
      }
   """
)
                        
    
}
              

// @LINE:66
// @LINE:65
class ReverseAssets {
    

// @LINE:65
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

// @LINE:66
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:66
// @LINE:65
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseDemo {
    

// @LINE:14
def datatables(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.datatables(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "datatables", Seq(), "GET", """""", _prefix + """datatables""")
)
                      

// @LINE:52
def error404(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.error404(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "error404", Seq(), "GET", """""", _prefix + """error404""")
)
                      

// @LINE:50
def lock(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.lock(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "lock", Seq(), "GET", """""", _prefix + """lock""")
)
                      

// @LINE:37
def typography(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.typography(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "typography", Seq(), "GET", """""", _prefix + """typography""")
)
                      

// @LINE:54
def email_template(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.email_template(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "email_template", Seq(), "GET", """""", _prefix + """email_template""")
)
                      

// @LINE:23
def other_editors(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.other_editors(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "other_editors", Seq(), "GET", """""", _prefix + """other_editors""")
)
                      

// @LINE:19
def validation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.validation(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "validation", Seq(), "GET", """""", _prefix + """validation""")
)
                      

// @LINE:58
def applayout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.applayout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "applayout", Seq(), "GET", """""", _prefix + """applayout""")
)
                      

// @LINE:51
def error500(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.error500(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "error500", Seq(), "GET", """""", _prefix + """error500""")
)
                      

// @LINE:35
def nestable_list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.nestable_list(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "nestable_list", Seq(), "GET", """""", _prefix + """nestable_list""")
)
                      

// @LINE:25
def image_editor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.image_editor(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "image_editor", Seq(), "GET", """""", _prefix + """image_editor""")
)
                      

// @LINE:43
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:20
def bootstrap_forms(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.bootstrap_forms(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "bootstrap_forms", Seq(), "GET", """""", _prefix + """bootstrap_forms""")
)
                      

// @LINE:34
def treeview(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.treeview(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "treeview", Seq(), "GET", """""", _prefix + """treeview""")
)
                      

// @LINE:31
def flags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.flags(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "flags", Seq(), "GET", """""", _prefix + """flags""")
)
                      

// @LINE:7
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.dashboard(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dashboard", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

// @LINE:45
def pricing_table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.pricing_table(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "pricing_table", Seq(), "GET", """""", _prefix + """pricing_table""")
)
                      

// @LINE:22
def wizard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.wizard(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "wizard", Seq(), "GET", """""", _prefix + """wizard""")
)
                      

// @LINE:18
def form_templates(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.form_templates(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "form_templates", Seq(), "GET", """""", _prefix + """form_templates""")
)
                      

// @LINE:28
def buttons(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.buttons(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "buttons", Seq(), "GET", """""", _prefix + """buttons""")
)
                      

// @LINE:42
def forum(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.forum(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "forum", Seq(), "GET", """""", _prefix + """forum""")
)
                      

// @LINE:39
def widgets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.widgets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "widgets", Seq(), "GET", """""", _prefix + """widgets""")
)
                      

// @LINE:44
def timeline(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.timeline(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "timeline", Seq(), "GET", """""", _prefix + """timeline""")
)
                      

// @LINE:59
def forgotpassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.forgotpassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "forgotpassword", Seq(), "GET", """""", _prefix + """forgotpassword""")
)
                      

// @LINE:41
def gmap_xml(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.gmap_xml(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "gmap_xml", Seq(), "GET", """""", _prefix + """gmap_xml""")
)
                      

// @LINE:36
def jqui(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.jqui(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "jqui", Seq(), "GET", """""", _prefix + """jqui""")
)
                      

// @LINE:21
def plugins(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.plugins(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "plugins", Seq(), "GET", """""", _prefix + """plugins""")
)
                      

// @LINE:24
def dropzone(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.dropzone(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dropzone", Seq(), "GET", """""", _prefix + """dropzone""")
)
                      

// @LINE:29
def fa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.fa(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "fa", Seq(), "GET", """""", _prefix + """fa""")
)
                      

// @LINE:12
def dygraphs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.dygraphs(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dygraphs", Seq(), "GET", """""", _prefix + """dygraphs""")
)
                      

// @LINE:56
def ckeditor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.ckeditor(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "ckeditor", Seq(), "GET", """""", _prefix + """ckeditor""")
)
                      

// @LINE:11
def inline_charts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.inline_charts(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "inline_charts", Seq(), "GET", """""", _prefix + """inline_charts""")
)
                      

// @LINE:49
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:8
def inbox(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.inbox(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "inbox", Seq(), "GET", """""", _prefix + """inbox""")
)
                      

// @LINE:33
def grid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.grid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "grid", Seq(), "GET", """""", _prefix + """grid""")
)
                      

// @LINE:15
def jqgrid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.jqgrid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "jqgrid", Seq(), "GET", """""", _prefix + """jqgrid""")
)
                      

// @LINE:17
def form_elements(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.form_elements(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "form_elements", Seq(), "GET", """""", _prefix + """form_elements""")
)
                      

// @LINE:57
def difver(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.difver(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "difver", Seq(), "GET", """""", _prefix + """difver""")
)
                      

// @LINE:27
def general_elements(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.general_elements(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "general_elements", Seq(), "GET", """""", _prefix + """general_elements""")
)
                      

// @LINE:55
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.search(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "search", Seq(), "GET", """""", _prefix + """search""")
)
                      

// @LINE:46
def invoice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.invoice(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "invoice", Seq(), "GET", """""", _prefix + """invoice""")
)
                      

// @LINE:53
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.blank(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "blank", Seq(), "GET", """""", _prefix + """blank""")
)
                      

// @LINE:10
def morris(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.morris(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "morris", Seq(), "GET", """""", _prefix + """morris""")
)
                      

// @LINE:30
def glyph(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.glyph(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "glyph", Seq(), "GET", """""", _prefix + """glyph""")
)
                      

// @LINE:9
def flot(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.flot(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "flot", Seq(), "GET", """""", _prefix + """flot""")
)
                      

// @LINE:38
def calendar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.calendar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "calendar", Seq(), "GET", """""", _prefix + """calendar""")
)
                      

// @LINE:13
def table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.table(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "table", Seq(), "GET", """""", _prefix + """table""")
)
                      

// @LINE:47
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:40
def gallery(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.gallery(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "gallery", Seq(), "GET", """""", _prefix + """gallery""")
)
                      
    
}
                          

// @LINE:66
// @LINE:65
class ReverseAssets {
    

// @LINE:65
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

// @LINE:66
def versioned(path:String, file:Asset): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    