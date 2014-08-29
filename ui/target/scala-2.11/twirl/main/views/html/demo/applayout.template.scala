
package views.html.demo

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object applayout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa fa-lg fa-fw fa-cube"></i> SmartAdmin Intel <span>&gt;
                    App Settings </span></h1>
            </div>
                <!-- end col -->

        </div>
            <!-- end row -->

            <!--
The ID "widget-grid" will start to initialize all widgets below
You do not need to use widgets if you dont want to. Simply remove
the <section></section> and you can use wells or panels instead
-->

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-7 sortable-grid ui-sortable">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-sortable" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" role="widget">
                        <header role="heading">
                            <h2> Menu Toggle / Collapse / Minify </h2>
                            <span class="badge pull-right margin-right-5 margin-top-5">new</span>
                            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

                            <!-- widget div-->
                        <div role="content">

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input class="form-control" type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                    <!-- this is what the user will see -->
                                <div class="padding-gutter">
                                    To toggle minify menu manually add the class <code>
                                    minified</code>
                                    to the <b><i>BODY</i></b> element. To collapse the main menu on desktops, add class <code>
                                    hidden-menu</code>
                                    to the <b><i>BODY</i></b> element.
                                    <br>
                                    <br>

                                    <span class="btn btn-default" data-action="minifyMenu"> Toggle .minify class </span>
                                        &nbsp;&nbsp;
                                    <button class="btn btn-default" data-action="toggleMenu">
                                        Toggle .collapse class
                                    </button>

                                </div>

                                <div class="table-responsive no-margin">

                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th><b><i>attribute*</i></b></th>
                                                <th>Description</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="userLogout"
                                                    </code></td>
                                                <td>Logout message popup, use it with <code>
                                                    data-logout-msg = "..."</code></td>
                                                <td><a href="login.html" class="btn btn-default btn-xs" data-action="userLogout" data-logout-msg="Your message here..."> action </a></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="resetWidgets"
                                                    </code></td>
                                                <td>Resets all localStorage <i>(restores all app settings and widgets)</i></td>
                                                <td>
                                                    <button class="btn btn-default btn-xs" data-action="resetWidgets">
                                                        action
                                                    </button></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="launchFullscreen"
                                                    </code></td>
                                                <td>Launch full screen view <i>(works only in Chrome, Safari, Firefox and Latest IE)</i></td>
                                                <td>
                                                    <button class="btn btn-default btn-xs" data-action="launchFullscreen">
                                                        action
                                                    </button></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="minifyMenu"
                                                    </code></td>
                                                <td>Minify main nav <i>(works only with vertical menu case)</i></td>
                                                <td>
                                                    <button class="btn btn-default btn-xs" data-action="minifyMenu">
                                                        action
                                                    </button></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="toggleMenu"
                                                    </code></td>
                                                <td>Collapse left menu <i>(but still accessable by hovering left edge of screen)</i></td>
                                                <td>
                                                    <button class="btn btn-default btn-xs" data-action="toggleMenu">
                                                        action
                                                    </button></td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <code>
                                                        data-action="toggleShortcut"
                                                    </code></td>
                                                <td>Top slidedown / Metro menu toggle</td>
                                                <td>
                                                    <button class="btn btn-default btn-xs" data-action="toggleShortcut">
                                                        action
                                                    </button></td>
                                            </tr>
                                        </tbody>
                                    </table>

                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-sortable" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" role="widget">
                        <header role="heading">
                            <h2>App Settings</h2>

                            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

                            <!-- widget div-->
                        <div role="content">

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input class="form-control" type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                    <!-- this is what the user will see -->
                                <div class="padding-gutter">
                                    <span class="badge bg-color-green">Note:</span> You can adjust these settings inside <span class="text-primary">app.js</span> file to your comfort.
                                </div>

                                <div class="table-responsive">

                                    <table class="table table-bordered margin-top-10">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Default/Value</th>
                                                <th>Description</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td><b><i>$.throttle_delay</i></b></td>
                                                <td>
                                                    <code>
                                                        350
                                                    </code></td>
                                                <td>Impacts the responce rate of some of the responsive elements (lower value affects CPU but improves speed)</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>$.menu_speed</i></b></td>
                                                <td>
                                                    <code>
                                                        235
                                                    </code></td>
                                                <td>The rate at which the menu expands revealing child elements on click</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>$.navAsAjax</i></b></td>
                                                <td>
                                                    <code>
                                                        true/false
                                                    </code></td>
                                                <td>Your left nav in your app will no longer fire ajax calls, set it to false for HTML version</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>$.enableJarvisWidgets</i></b></td>
                                                <td>
                                                    <code>
                                                        true/false
                                                    </code></td>
                                                <td>Please make sure you have included "jarvis.widget.min.js" in your page for this below feature to work</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>$.enableMobileWidgets</i></b></td>
                                                <td>
                                                    <code>
                                                        true/false
                                                    </code></td>
                                                <td>Warning: Enabling mobile widgets could potentially crash your webApp if you have too many widgets running at once (<i>must have <b><i>$.enableJarvisWidgets</i></b> to
                                                    <code>true</code></i>)</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>closedSign</i></b></td>
                                                <td>
                                                    <code>
                                                        fa-plus-square-o
                                                    </code></td>
                                                <td>Menu open icon</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>openedSign</i></b></td>
                                                <td>
                                                    <code>
                                                        fa-minus-square-o
                                                    </code></td>
                                                <td>Menu close icon</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>setup_widgets_desktop()</i></b></td>
                                                <td><i>function<b>()</b></i></td>
                                                <td>Setup widgets for desktop (<i>must have <b><i>$.enableJarvisWidgets</i></b> to
                                                    <code>
                                                        true
                                                    </code></i>) </td>
                                            </tr>
                                            <tr>
                                                <td><b><i>setup_widgets_mobile()</i></b></td>
                                                <td><i>function<b>()</b></i></td>
                                                <td>Setup widgets for desktop <i>(must have <b>$.enableJarvisWidgets</b> and <b>$.enableMobileWidgets</b> to <code>true</code>)</i></td>
                                            </tr>
                                            <tr>
                                                <td><b><i>runAllCharts()</i></b></td>
                                                <td><i>function<b>()</b></i></td>
                                                <td>Runs all inline charts including: $.sparkline and $.easyPieChart</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>runAllForms()</i></b></td>
                                                <td><i>function<b>()</b></i></td>
                                                <td>Runs all form related scripts such as $.select2, $.mask, $.datepicker and $.autocomplete</td>
                                            </tr>
                                            <tr>
                                                <td><b><i>pageSetUp()</i></b></td>
                                                <td><i>function<b>()</b></i></td>
                                                <td>Runs the following functions all at once: <i>setup_widgets_desktop<b>()</b>, setup_widgets_mobile<b>()</b>, runAllCharts<b>()</b>, runAllForms<b>()</b></i> - and also activates all tooltip and popovers</td>
                                            </tr>
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-5 sortable-grid ui-sortable">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-sortable" id="wid-id-2" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" role="widget">
                        <header role="heading">
                            <h2> Page layout options </h2>
                            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

                            <!-- widget div-->
                        <div role="content">

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input class="form-control" type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <div class="padding-gutter padding-bottom-0">
                                    Possible classes for the <b><i>BODY</i></b> tag: <code>
                                    smart-skin-"""),format.raw/*320.48*/("""{"""),format.raw/*320.49*/("""SKIN_NUMBER"""),format.raw/*320.60*/("""}"""),format.raw/*320.61*/("""</code>
                                    , <code>
                                    smart-rtl</code>
                                    , <code>
                                    fixed-header</code>
                                    , <code>
                                    fixed-navigation</code>
                                    , <code>
                                    fixed-ribbon</code>
                                    , <code>
                                    fixed-footer</code>
                                    , <code>
                                    container</code>

                                </div>

                                    <!-- this is what the user will see -->
                                <div class="padding-gutter">
                                    <div style="background: #f1f1f1;border-radius:3px;overflow: hidden">
                                        <div style="width: 100%;height: auto;background:#ddd;font-size:11px;font-weight: bold;padding:13px 10px">
                                            <img src="img/logo.png" alt="SmartAdmin" style="width:75px;">
                                        </div>
                                        <div style="width: 25%;height: 296px; background:#949291;" class="pull-left"></div>
                                        <div style="width: 75%;height: 255px; background:#f1f1f1;" class="pull-left">
                                            <div style="width: 100% height:20px; padding:3px; background:#C5C5C5; font-size:10px; font-weight: bold;">
                                                <i class="fa fa-home"></i> breadcrumb &gt;
                                            </div>
                                        </div>
                                        <div style="width: 75%;height: auto;background:#ddd;font-size:11px;font-weight: bold;padding:13px 10px" class="text-right pull-right">
                                            Footer
                                        </div>
                                    </div>
                                </div>

                                <hr>

                                <div class="padding-gutter padding-top-0 padding-bottom-0">
                                    Switch to top menu by adding class <code>
                                    .menu-on-top</code>
                                </div>

                                <div class="padding-gutter">

                                    <div style="background: #f1f1f1;border-radius:3px;overflow: hidden">
                                        <div style="width: 100%;height: auto;background:#ddd;font-size:11px;font-weight: bold;padding:13px 10px">
                                            <img src="img/logo.png" alt="SmartAdmin" style="width:75px;">
                                        </div>
                                        <div style="width: 100%;height: 50px; background:#949291;" class="pull-left"></div>
                                        <div style="width: 100%;height: 255px; background:#f1f1f1;" class="pull-left">
                                            <div style="width: 100% height:20px; padding:3px; background:#C5C5C5; font-size:10px; font-weight: bold;">
                                                <i class="fa fa-home"></i> breadcrumb &gt;
                                            </div>
                                        </div>
                                        <div style="width: 100%;height: auto;background:#ddd;font-size:11px;font-weight: bold;padding:13px 10px" class="text-right pull-right">
                                            Footer
                                        </div>
                                    </div>

                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>

            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

                    <!-- a blank row to get started -->
                <div class="col-sm-12">
                        <!-- your contents here -->
                </div>

            </div>

                <!-- end row -->

        </section>
            <!-- end widget grid -->

        <script type="text/javascript">
        /* DO NOT REMOVE : GLOBAL FUNCTIONS!
         *
         * pageSetUp(); WILL CALL THE FOLLOWING FUNCTIONS
         *
         * // activate tooltips
         * $("[rel=tooltip]").tooltip();
         *
         * // activate popovers
         * $("[rel=popover]").popover();
         *
         * // activate popovers with hover states
         * $("[rel=popover-hover]").popover("""),format.raw/*423.45*/("""{"""),format.raw/*423.46*/(""" """),format.raw/*423.47*/("""trigger: "hover" """),format.raw/*423.64*/("""}"""),format.raw/*423.65*/(""");
         *
         * // activate inline charts
         * runAllCharts();
         *
         * // setup widgets
         * setup_widgets_desktop();
         *
         * // run form elements
         * runAllForms();
         *
         ********************************
         *
         * pageSetUp() is needed whenever you load a page.
         * It initializes and checks for all basic elements of the page
         * and makes rendering easier.
         *
         */

        pageSetUp();

        /*
         * ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
         * eg alert("my home function");
         *
         * var pagefunction = function() """),format.raw/*448.42*/("""{"""),format.raw/*448.43*/("""
         """),format.raw/*449.10*/("""*   ...
         * """),format.raw/*450.12*/("""}"""),format.raw/*450.13*/("""
         """),format.raw/*451.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*454.42*/("""{"""),format.raw/*454.43*/("""
         """),format.raw/*455.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*456.12*/("""}"""),format.raw/*456.13*/("""
         """),format.raw/*457.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // pagefunction

        var pagefunction = function() """),format.raw/*465.39*/("""{"""),format.raw/*465.40*/("""

        """),format.raw/*467.9*/("""}"""),format.raw/*467.10*/(""";

        // end pagefunction

        // run pagefunction on load

        pagefunction();

        </script>
    </div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:48 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/applayout.scala.html
                  HASH: 8b9bdafdc8b8ce4753b5a667acd20272fa66ca44
                  MATRIX: 514->1|619->18|647->21|668->34|707->36|738->41|20159->19433|20189->19434|20229->19445|20259->19446|25236->24394|25266->24395|25296->24396|25342->24413|25372->24414|26061->25074|26091->25075|26130->25085|26178->25104|26208->25105|26247->25115|26415->25254|26445->25255|26484->25265|26574->25326|26604->25327|26643->25337|26833->25498|26863->25499|26901->25509|26931->25510
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|341->320|341->320|341->320|341->320|444->423|444->423|444->423|444->423|444->423|469->448|469->448|470->449|471->450|471->450|472->451|475->454|475->454|476->455|477->456|477->456|478->457|486->465|486->465|488->467|488->467
                  -- GENERATED --
              */
          