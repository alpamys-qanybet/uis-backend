
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
object email_template extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <h1 class="page-title txt-color-blueDark">

                    <!-- PAGE HEADER -->
                <i class="icon-fixed-width icon-home"></i>
                Email Template
                <span>&gt;
                    Responsive Email templates!
                </span>
            </h1>
        </div>

    </div>

            <!-- row -->
        <div class="row">

            <div class="col-sm-12">
                <div class="alert alert-info">
                    <h4><strong>Preview of these email templates are only available after purchase!</strong></h4>
                </div>
            </div>

            <div class="col-xs-12 col-sm-4 col-md-3 col-lg-2">
                <img src="img/demo/basic.png" alt="Basic Email Template" style="width:100%; height:auto;">
                <br>
                <br>
                <a href="javascript:void(0);" target="_blank" class="btn btn-primary btn-block">Basic Email Template</a>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-3 col-lg-2">
                <img src="img/demo/sidebar.png" alt="Sidebar Email Template" style="width:100%; height:auto;">
                <br>
                <br>
                <a href="javascript:void(0);" target="_blank" class="btn btn-primary btn-block">Sidebar Email Template</a>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-3 col-lg-2">
                <img src="img/demo/hero.png" alt="Hero Email Template" style="width:100%; height:auto;">
                <br>
                <br>
                <a href="javascript:void(0);" target="_blank" class="btn btn-primary btn-block">Hero Email Template</a>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-3 col-lg-2">
                <img src="img/demo/sidebarhero.png" alt="Sidebar with Hero" style="width:100%; height:auto;">
                <br>
                <br>
                <a href="javascript:void(0);" target="_blank" class="btn btn-primary btn-block">Sidebar with Hero</a>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-3 col-lg-2">
                <img src="img/demo/newsletter.png" alt="Newsletter Email Template" style="width:100%; height:auto;">
                <br>
                <br>
                <a href="javascript:void(0);" target="_blank" class="btn btn-primary btn-block">Newsletter Template</a>
            </div>

        </div>
            <!-- end row -->


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
         * $("[rel=popover-hover]").popover("""),format.raw/*76.45*/("""{"""),format.raw/*76.46*/(""" """),format.raw/*76.47*/("""trigger: "hover" """),format.raw/*76.64*/("""}"""),format.raw/*76.65*/(""");
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
         * var pagefunction = function() """),format.raw/*101.42*/("""{"""),format.raw/*101.43*/("""
         """),format.raw/*102.10*/("""*   ...
         * """),format.raw/*103.12*/("""}"""),format.raw/*103.13*/("""
         """),format.raw/*104.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*107.42*/("""{"""),format.raw/*107.43*/("""
         """),format.raw/*108.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*109.12*/("""}"""),format.raw/*109.13*/("""
         """),format.raw/*110.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */


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
                  DATE: Thu Aug 28 21:08:47 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/email_template.scala.html
                  HASH: 6213cec1490b4749930992a79f66de8ffbe35e71
                  MATRIX: 519->1|624->18|652->21|673->34|712->36|743->41|3760->3030|3789->3031|3818->3032|3863->3049|3892->3050|4581->3710|4611->3711|4650->3721|4698->3740|4728->3741|4767->3751|4935->3890|4965->3891|5004->3901|5094->3962|5124->3963|5163->3973
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|97->76|97->76|97->76|97->76|97->76|122->101|122->101|123->102|124->103|124->103|125->104|128->107|128->107|129->108|130->109|130->109|131->110
                  -- GENERATED --
              */
          