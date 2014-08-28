// @SOURCE:/home/sulta/Dropbox/git/uis/ui/conf/routes
// @HASH:55626712d3ee60e74f018a1173c03dfa503b2a2a
// @DATE:Thu Aug 28 22:26:59 ALMT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Demo_dashboard1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
private[this] lazy val controllers_Demo_dashboard1_invoker = createInvoker(
controllers.Demo.dashboard,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dashboard", Nil,"GET", """""", Routes.prefix + """dashboard"""))
        

// @LINE:8
private[this] lazy val controllers_Demo_inbox2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inbox"))))
private[this] lazy val controllers_Demo_inbox2_invoker = createInvoker(
controllers.Demo.inbox,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "inbox", Nil,"GET", """""", Routes.prefix + """inbox"""))
        

// @LINE:9
private[this] lazy val controllers_Demo_flot3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("flot"))))
private[this] lazy val controllers_Demo_flot3_invoker = createInvoker(
controllers.Demo.flot,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "flot", Nil,"GET", """""", Routes.prefix + """flot"""))
        

// @LINE:10
private[this] lazy val controllers_Demo_morris4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("morris"))))
private[this] lazy val controllers_Demo_morris4_invoker = createInvoker(
controllers.Demo.morris,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "morris", Nil,"GET", """""", Routes.prefix + """morris"""))
        

// @LINE:11
private[this] lazy val controllers_Demo_inline_charts5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inline_charts"))))
private[this] lazy val controllers_Demo_inline_charts5_invoker = createInvoker(
controllers.Demo.inline_charts,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "inline_charts", Nil,"GET", """""", Routes.prefix + """inline_charts"""))
        

// @LINE:12
private[this] lazy val controllers_Demo_dygraphs6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dygraphs"))))
private[this] lazy val controllers_Demo_dygraphs6_invoker = createInvoker(
controllers.Demo.dygraphs,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dygraphs", Nil,"GET", """""", Routes.prefix + """dygraphs"""))
        

// @LINE:13
private[this] lazy val controllers_Demo_table7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("table"))))
private[this] lazy val controllers_Demo_table7_invoker = createInvoker(
controllers.Demo.table,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "table", Nil,"GET", """""", Routes.prefix + """table"""))
        

// @LINE:14
private[this] lazy val controllers_Demo_datatables8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("datatables"))))
private[this] lazy val controllers_Demo_datatables8_invoker = createInvoker(
controllers.Demo.datatables,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "datatables", Nil,"GET", """""", Routes.prefix + """datatables"""))
        

// @LINE:15
private[this] lazy val controllers_Demo_jqgrid9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jqgrid"))))
private[this] lazy val controllers_Demo_jqgrid9_invoker = createInvoker(
controllers.Demo.jqgrid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "jqgrid", Nil,"GET", """""", Routes.prefix + """jqgrid"""))
        

// @LINE:17
private[this] lazy val controllers_Demo_form_elements10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("form_elements"))))
private[this] lazy val controllers_Demo_form_elements10_invoker = createInvoker(
controllers.Demo.form_elements,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "form_elements", Nil,"GET", """""", Routes.prefix + """form_elements"""))
        

// @LINE:18
private[this] lazy val controllers_Demo_form_templates11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("form_templates"))))
private[this] lazy val controllers_Demo_form_templates11_invoker = createInvoker(
controllers.Demo.form_templates,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "form_templates", Nil,"GET", """""", Routes.prefix + """form_templates"""))
        

// @LINE:19
private[this] lazy val controllers_Demo_validation12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validation"))))
private[this] lazy val controllers_Demo_validation12_invoker = createInvoker(
controllers.Demo.validation,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "validation", Nil,"GET", """""", Routes.prefix + """validation"""))
        

// @LINE:20
private[this] lazy val controllers_Demo_bootstrap_forms13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bootstrap_forms"))))
private[this] lazy val controllers_Demo_bootstrap_forms13_invoker = createInvoker(
controllers.Demo.bootstrap_forms,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "bootstrap_forms", Nil,"GET", """""", Routes.prefix + """bootstrap_forms"""))
        

// @LINE:21
private[this] lazy val controllers_Demo_plugins14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("plugins"))))
private[this] lazy val controllers_Demo_plugins14_invoker = createInvoker(
controllers.Demo.plugins,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "plugins", Nil,"GET", """""", Routes.prefix + """plugins"""))
        

// @LINE:22
private[this] lazy val controllers_Demo_wizard15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wizard"))))
private[this] lazy val controllers_Demo_wizard15_invoker = createInvoker(
controllers.Demo.wizard,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "wizard", Nil,"GET", """""", Routes.prefix + """wizard"""))
        

// @LINE:23
private[this] lazy val controllers_Demo_other_editors16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("other_editors"))))
private[this] lazy val controllers_Demo_other_editors16_invoker = createInvoker(
controllers.Demo.other_editors,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "other_editors", Nil,"GET", """""", Routes.prefix + """other_editors"""))
        

// @LINE:24
private[this] lazy val controllers_Demo_dropzone17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dropzone"))))
private[this] lazy val controllers_Demo_dropzone17_invoker = createInvoker(
controllers.Demo.dropzone,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "dropzone", Nil,"GET", """""", Routes.prefix + """dropzone"""))
        

// @LINE:25
private[this] lazy val controllers_Demo_image_editor18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("image_editor"))))
private[this] lazy val controllers_Demo_image_editor18_invoker = createInvoker(
controllers.Demo.image_editor,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "image_editor", Nil,"GET", """""", Routes.prefix + """image_editor"""))
        

// @LINE:27
private[this] lazy val controllers_Demo_general_elements19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("general_elements"))))
private[this] lazy val controllers_Demo_general_elements19_invoker = createInvoker(
controllers.Demo.general_elements,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "general_elements", Nil,"GET", """""", Routes.prefix + """general_elements"""))
        

// @LINE:28
private[this] lazy val controllers_Demo_buttons20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buttons"))))
private[this] lazy val controllers_Demo_buttons20_invoker = createInvoker(
controllers.Demo.buttons,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "buttons", Nil,"GET", """""", Routes.prefix + """buttons"""))
        

// @LINE:29
private[this] lazy val controllers_Demo_fa21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("fa"))))
private[this] lazy val controllers_Demo_fa21_invoker = createInvoker(
controllers.Demo.fa,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "fa", Nil,"GET", """""", Routes.prefix + """fa"""))
        

// @LINE:30
private[this] lazy val controllers_Demo_glyph22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("glyph"))))
private[this] lazy val controllers_Demo_glyph22_invoker = createInvoker(
controllers.Demo.glyph,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "glyph", Nil,"GET", """""", Routes.prefix + """glyph"""))
        

// @LINE:31
private[this] lazy val controllers_Demo_flags23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("flags"))))
private[this] lazy val controllers_Demo_flags23_invoker = createInvoker(
controllers.Demo.flags,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "flags", Nil,"GET", """""", Routes.prefix + """flags"""))
        

// @LINE:33
private[this] lazy val controllers_Demo_grid24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("grid"))))
private[this] lazy val controllers_Demo_grid24_invoker = createInvoker(
controllers.Demo.grid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "grid", Nil,"GET", """""", Routes.prefix + """grid"""))
        

// @LINE:34
private[this] lazy val controllers_Demo_treeview25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("treeview"))))
private[this] lazy val controllers_Demo_treeview25_invoker = createInvoker(
controllers.Demo.treeview,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "treeview", Nil,"GET", """""", Routes.prefix + """treeview"""))
        

// @LINE:35
private[this] lazy val controllers_Demo_nestable_list26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("nestable_list"))))
private[this] lazy val controllers_Demo_nestable_list26_invoker = createInvoker(
controllers.Demo.nestable_list,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "nestable_list", Nil,"GET", """""", Routes.prefix + """nestable_list"""))
        

// @LINE:36
private[this] lazy val controllers_Demo_jqui27_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jqui"))))
private[this] lazy val controllers_Demo_jqui27_invoker = createInvoker(
controllers.Demo.jqui,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "jqui", Nil,"GET", """""", Routes.prefix + """jqui"""))
        

// @LINE:37
private[this] lazy val controllers_Demo_typography28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("typography"))))
private[this] lazy val controllers_Demo_typography28_invoker = createInvoker(
controllers.Demo.typography,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "typography", Nil,"GET", """""", Routes.prefix + """typography"""))
        

// @LINE:38
private[this] lazy val controllers_Demo_calendar29_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("calendar"))))
private[this] lazy val controllers_Demo_calendar29_invoker = createInvoker(
controllers.Demo.calendar,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "calendar", Nil,"GET", """""", Routes.prefix + """calendar"""))
        

// @LINE:39
private[this] lazy val controllers_Demo_widgets30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("widgets"))))
private[this] lazy val controllers_Demo_widgets30_invoker = createInvoker(
controllers.Demo.widgets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "widgets", Nil,"GET", """""", Routes.prefix + """widgets"""))
        

// @LINE:40
private[this] lazy val controllers_Demo_gallery31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("gallery"))))
private[this] lazy val controllers_Demo_gallery31_invoker = createInvoker(
controllers.Demo.gallery,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "gallery", Nil,"GET", """""", Routes.prefix + """gallery"""))
        

// @LINE:41
private[this] lazy val controllers_Demo_gmap_xml32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("gmap_xml"))))
private[this] lazy val controllers_Demo_gmap_xml32_invoker = createInvoker(
controllers.Demo.gmap_xml,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "gmap_xml", Nil,"GET", """""", Routes.prefix + """gmap_xml"""))
        

// @LINE:42
private[this] lazy val controllers_Demo_forum33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum"))))
private[this] lazy val controllers_Demo_forum33_invoker = createInvoker(
controllers.Demo.forum,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "forum", Nil,"GET", """""", Routes.prefix + """forum"""))
        

// @LINE:43
private[this] lazy val controllers_Demo_profile34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_Demo_profile34_invoker = createInvoker(
controllers.Demo.profile,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:44
private[this] lazy val controllers_Demo_timeline35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timeline"))))
private[this] lazy val controllers_Demo_timeline35_invoker = createInvoker(
controllers.Demo.timeline,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "timeline", Nil,"GET", """""", Routes.prefix + """timeline"""))
        

// @LINE:45
private[this] lazy val controllers_Demo_pricing_table36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pricing_table"))))
private[this] lazy val controllers_Demo_pricing_table36_invoker = createInvoker(
controllers.Demo.pricing_table,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "pricing_table", Nil,"GET", """""", Routes.prefix + """pricing_table"""))
        

// @LINE:46
private[this] lazy val controllers_Demo_invoice37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("invoice"))))
private[this] lazy val controllers_Demo_invoice37_invoker = createInvoker(
controllers.Demo.invoice,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "invoice", Nil,"GET", """""", Routes.prefix + """invoice"""))
        

// @LINE:47
private[this] lazy val controllers_Demo_login38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Demo_login38_invoker = createInvoker(
controllers.Demo.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:49
private[this] lazy val controllers_Demo_register39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Demo_register39_invoker = createInvoker(
controllers.Demo.register,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "register", Nil,"GET", """""", Routes.prefix + """register"""))
        

// @LINE:50
private[this] lazy val controllers_Demo_lock40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lock"))))
private[this] lazy val controllers_Demo_lock40_invoker = createInvoker(
controllers.Demo.lock,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "lock", Nil,"GET", """""", Routes.prefix + """lock"""))
        

// @LINE:51
private[this] lazy val controllers_Demo_error50041_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("error500"))))
private[this] lazy val controllers_Demo_error50041_invoker = createInvoker(
controllers.Demo.error500,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "error500", Nil,"GET", """""", Routes.prefix + """error500"""))
        

// @LINE:52
private[this] lazy val controllers_Demo_error40442_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("error404"))))
private[this] lazy val controllers_Demo_error40442_invoker = createInvoker(
controllers.Demo.error404,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "error404", Nil,"GET", """""", Routes.prefix + """error404"""))
        

// @LINE:53
private[this] lazy val controllers_Demo_blank43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blank"))))
private[this] lazy val controllers_Demo_blank43_invoker = createInvoker(
controllers.Demo.blank,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "blank", Nil,"GET", """""", Routes.prefix + """blank"""))
        

// @LINE:54
private[this] lazy val controllers_Demo_email_template44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("email_template"))))
private[this] lazy val controllers_Demo_email_template44_invoker = createInvoker(
controllers.Demo.email_template,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "email_template", Nil,"GET", """""", Routes.prefix + """email_template"""))
        

// @LINE:55
private[this] lazy val controllers_Demo_search45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
private[this] lazy val controllers_Demo_search45_invoker = createInvoker(
controllers.Demo.search,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "search", Nil,"GET", """""", Routes.prefix + """search"""))
        

// @LINE:56
private[this] lazy val controllers_Demo_ckeditor46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("ckeditor"))))
private[this] lazy val controllers_Demo_ckeditor46_invoker = createInvoker(
controllers.Demo.ckeditor,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "ckeditor", Nil,"GET", """""", Routes.prefix + """ckeditor"""))
        

// @LINE:57
private[this] lazy val controllers_Demo_difver47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("difver"))))
private[this] lazy val controllers_Demo_difver47_invoker = createInvoker(
controllers.Demo.difver,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "difver", Nil,"GET", """""", Routes.prefix + """difver"""))
        

// @LINE:58
private[this] lazy val controllers_Demo_applayout48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("applayout"))))
private[this] lazy val controllers_Demo_applayout48_invoker = createInvoker(
controllers.Demo.applayout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "applayout", Nil,"GET", """""", Routes.prefix + """applayout"""))
        

// @LINE:59
private[this] lazy val controllers_Demo_forgotpassword49_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forgotpassword"))))
private[this] lazy val controllers_Demo_forgotpassword49_invoker = createInvoker(
controllers.Demo.forgotpassword,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "forgotpassword", Nil,"GET", """""", Routes.prefix + """forgotpassword"""))
        

// @LINE:65
private[this] lazy val controllers_Assets_at50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at50_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:66
private[this] lazy val controllers_Assets_versioned51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned51_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[Asset]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Demo.dashboard"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inbox""","""controllers.Demo.inbox"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """flot""","""controllers.Demo.flot"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """morris""","""controllers.Demo.morris"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inline_charts""","""controllers.Demo.inline_charts"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dygraphs""","""controllers.Demo.dygraphs"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """table""","""controllers.Demo.table"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """datatables""","""controllers.Demo.datatables"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jqgrid""","""controllers.Demo.jqgrid"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """form_elements""","""controllers.Demo.form_elements"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """form_templates""","""controllers.Demo.form_templates"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validation""","""controllers.Demo.validation"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bootstrap_forms""","""controllers.Demo.bootstrap_forms"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """plugins""","""controllers.Demo.plugins"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wizard""","""controllers.Demo.wizard"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """other_editors""","""controllers.Demo.other_editors"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dropzone""","""controllers.Demo.dropzone"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """image_editor""","""controllers.Demo.image_editor"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """general_elements""","""controllers.Demo.general_elements"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buttons""","""controllers.Demo.buttons"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fa""","""controllers.Demo.fa"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """glyph""","""controllers.Demo.glyph"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """flags""","""controllers.Demo.flags"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """grid""","""controllers.Demo.grid"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """treeview""","""controllers.Demo.treeview"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """nestable_list""","""controllers.Demo.nestable_list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jqui""","""controllers.Demo.jqui"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """typography""","""controllers.Demo.typography"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """calendar""","""controllers.Demo.calendar"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """widgets""","""controllers.Demo.widgets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gallery""","""controllers.Demo.gallery"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """gmap_xml""","""controllers.Demo.gmap_xml"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Demo.forum"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Demo.profile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timeline""","""controllers.Demo.timeline"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pricing_table""","""controllers.Demo.pricing_table"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """invoice""","""controllers.Demo.invoice"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Demo.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Demo.register"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lock""","""controllers.Demo.lock"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error500""","""controllers.Demo.error500"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """error404""","""controllers.Demo.error404"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blank""","""controllers.Demo.blank"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """email_template""","""controllers.Demo.email_template"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Demo.search"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ckeditor""","""controllers.Demo.ckeditor"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """difver""","""controllers.Demo.difver"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """applayout""","""controllers.Demo.applayout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forgotpassword""","""controllers.Demo.forgotpassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:Asset)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Demo_dashboard1_route(params) => {
   call { 
        controllers_Demo_dashboard1_invoker.call(controllers.Demo.dashboard)
   }
}
        

// @LINE:8
case controllers_Demo_inbox2_route(params) => {
   call { 
        controllers_Demo_inbox2_invoker.call(controllers.Demo.inbox)
   }
}
        

// @LINE:9
case controllers_Demo_flot3_route(params) => {
   call { 
        controllers_Demo_flot3_invoker.call(controllers.Demo.flot)
   }
}
        

// @LINE:10
case controllers_Demo_morris4_route(params) => {
   call { 
        controllers_Demo_morris4_invoker.call(controllers.Demo.morris)
   }
}
        

// @LINE:11
case controllers_Demo_inline_charts5_route(params) => {
   call { 
        controllers_Demo_inline_charts5_invoker.call(controllers.Demo.inline_charts)
   }
}
        

// @LINE:12
case controllers_Demo_dygraphs6_route(params) => {
   call { 
        controllers_Demo_dygraphs6_invoker.call(controllers.Demo.dygraphs)
   }
}
        

// @LINE:13
case controllers_Demo_table7_route(params) => {
   call { 
        controllers_Demo_table7_invoker.call(controllers.Demo.table)
   }
}
        

// @LINE:14
case controllers_Demo_datatables8_route(params) => {
   call { 
        controllers_Demo_datatables8_invoker.call(controllers.Demo.datatables)
   }
}
        

// @LINE:15
case controllers_Demo_jqgrid9_route(params) => {
   call { 
        controllers_Demo_jqgrid9_invoker.call(controllers.Demo.jqgrid)
   }
}
        

// @LINE:17
case controllers_Demo_form_elements10_route(params) => {
   call { 
        controllers_Demo_form_elements10_invoker.call(controllers.Demo.form_elements)
   }
}
        

// @LINE:18
case controllers_Demo_form_templates11_route(params) => {
   call { 
        controllers_Demo_form_templates11_invoker.call(controllers.Demo.form_templates)
   }
}
        

// @LINE:19
case controllers_Demo_validation12_route(params) => {
   call { 
        controllers_Demo_validation12_invoker.call(controllers.Demo.validation)
   }
}
        

// @LINE:20
case controllers_Demo_bootstrap_forms13_route(params) => {
   call { 
        controllers_Demo_bootstrap_forms13_invoker.call(controllers.Demo.bootstrap_forms)
   }
}
        

// @LINE:21
case controllers_Demo_plugins14_route(params) => {
   call { 
        controllers_Demo_plugins14_invoker.call(controllers.Demo.plugins)
   }
}
        

// @LINE:22
case controllers_Demo_wizard15_route(params) => {
   call { 
        controllers_Demo_wizard15_invoker.call(controllers.Demo.wizard)
   }
}
        

// @LINE:23
case controllers_Demo_other_editors16_route(params) => {
   call { 
        controllers_Demo_other_editors16_invoker.call(controllers.Demo.other_editors)
   }
}
        

// @LINE:24
case controllers_Demo_dropzone17_route(params) => {
   call { 
        controllers_Demo_dropzone17_invoker.call(controllers.Demo.dropzone)
   }
}
        

// @LINE:25
case controllers_Demo_image_editor18_route(params) => {
   call { 
        controllers_Demo_image_editor18_invoker.call(controllers.Demo.image_editor)
   }
}
        

// @LINE:27
case controllers_Demo_general_elements19_route(params) => {
   call { 
        controllers_Demo_general_elements19_invoker.call(controllers.Demo.general_elements)
   }
}
        

// @LINE:28
case controllers_Demo_buttons20_route(params) => {
   call { 
        controllers_Demo_buttons20_invoker.call(controllers.Demo.buttons)
   }
}
        

// @LINE:29
case controllers_Demo_fa21_route(params) => {
   call { 
        controllers_Demo_fa21_invoker.call(controllers.Demo.fa)
   }
}
        

// @LINE:30
case controllers_Demo_glyph22_route(params) => {
   call { 
        controllers_Demo_glyph22_invoker.call(controllers.Demo.glyph)
   }
}
        

// @LINE:31
case controllers_Demo_flags23_route(params) => {
   call { 
        controllers_Demo_flags23_invoker.call(controllers.Demo.flags)
   }
}
        

// @LINE:33
case controllers_Demo_grid24_route(params) => {
   call { 
        controllers_Demo_grid24_invoker.call(controllers.Demo.grid)
   }
}
        

// @LINE:34
case controllers_Demo_treeview25_route(params) => {
   call { 
        controllers_Demo_treeview25_invoker.call(controllers.Demo.treeview)
   }
}
        

// @LINE:35
case controllers_Demo_nestable_list26_route(params) => {
   call { 
        controllers_Demo_nestable_list26_invoker.call(controllers.Demo.nestable_list)
   }
}
        

// @LINE:36
case controllers_Demo_jqui27_route(params) => {
   call { 
        controllers_Demo_jqui27_invoker.call(controllers.Demo.jqui)
   }
}
        

// @LINE:37
case controllers_Demo_typography28_route(params) => {
   call { 
        controllers_Demo_typography28_invoker.call(controllers.Demo.typography)
   }
}
        

// @LINE:38
case controllers_Demo_calendar29_route(params) => {
   call { 
        controllers_Demo_calendar29_invoker.call(controllers.Demo.calendar)
   }
}
        

// @LINE:39
case controllers_Demo_widgets30_route(params) => {
   call { 
        controllers_Demo_widgets30_invoker.call(controllers.Demo.widgets)
   }
}
        

// @LINE:40
case controllers_Demo_gallery31_route(params) => {
   call { 
        controllers_Demo_gallery31_invoker.call(controllers.Demo.gallery)
   }
}
        

// @LINE:41
case controllers_Demo_gmap_xml32_route(params) => {
   call { 
        controllers_Demo_gmap_xml32_invoker.call(controllers.Demo.gmap_xml)
   }
}
        

// @LINE:42
case controllers_Demo_forum33_route(params) => {
   call { 
        controllers_Demo_forum33_invoker.call(controllers.Demo.forum)
   }
}
        

// @LINE:43
case controllers_Demo_profile34_route(params) => {
   call { 
        controllers_Demo_profile34_invoker.call(controllers.Demo.profile)
   }
}
        

// @LINE:44
case controllers_Demo_timeline35_route(params) => {
   call { 
        controllers_Demo_timeline35_invoker.call(controllers.Demo.timeline)
   }
}
        

// @LINE:45
case controllers_Demo_pricing_table36_route(params) => {
   call { 
        controllers_Demo_pricing_table36_invoker.call(controllers.Demo.pricing_table)
   }
}
        

// @LINE:46
case controllers_Demo_invoice37_route(params) => {
   call { 
        controllers_Demo_invoice37_invoker.call(controllers.Demo.invoice)
   }
}
        

// @LINE:47
case controllers_Demo_login38_route(params) => {
   call { 
        controllers_Demo_login38_invoker.call(controllers.Demo.login)
   }
}
        

// @LINE:49
case controllers_Demo_register39_route(params) => {
   call { 
        controllers_Demo_register39_invoker.call(controllers.Demo.register)
   }
}
        

// @LINE:50
case controllers_Demo_lock40_route(params) => {
   call { 
        controllers_Demo_lock40_invoker.call(controllers.Demo.lock)
   }
}
        

// @LINE:51
case controllers_Demo_error50041_route(params) => {
   call { 
        controllers_Demo_error50041_invoker.call(controllers.Demo.error500)
   }
}
        

// @LINE:52
case controllers_Demo_error40442_route(params) => {
   call { 
        controllers_Demo_error40442_invoker.call(controllers.Demo.error404)
   }
}
        

// @LINE:53
case controllers_Demo_blank43_route(params) => {
   call { 
        controllers_Demo_blank43_invoker.call(controllers.Demo.blank)
   }
}
        

// @LINE:54
case controllers_Demo_email_template44_route(params) => {
   call { 
        controllers_Demo_email_template44_invoker.call(controllers.Demo.email_template)
   }
}
        

// @LINE:55
case controllers_Demo_search45_route(params) => {
   call { 
        controllers_Demo_search45_invoker.call(controllers.Demo.search)
   }
}
        

// @LINE:56
case controllers_Demo_ckeditor46_route(params) => {
   call { 
        controllers_Demo_ckeditor46_invoker.call(controllers.Demo.ckeditor)
   }
}
        

// @LINE:57
case controllers_Demo_difver47_route(params) => {
   call { 
        controllers_Demo_difver47_invoker.call(controllers.Demo.difver)
   }
}
        

// @LINE:58
case controllers_Demo_applayout48_route(params) => {
   call { 
        controllers_Demo_applayout48_invoker.call(controllers.Demo.applayout)
   }
}
        

// @LINE:59
case controllers_Demo_forgotpassword49_route(params) => {
   call { 
        controllers_Demo_forgotpassword49_invoker.call(controllers.Demo.forgotpassword)
   }
}
        

// @LINE:65
case controllers_Assets_at50_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at50_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:66
case controllers_Assets_versioned51_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned51_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     