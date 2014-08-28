
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
object error500 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><!--[if IE 9]>
	<style>
		.error-text """),format.raw/*6.15*/("""{"""),format.raw/*6.16*/("""
			"""),format.raw/*7.4*/("""color: #333 !important;
		"""),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""
	"""),format.raw/*9.2*/("""</style>
<![endif]-->

        <!-- row -->
        <div class="row">

            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="text-center error-box">
                            <h1 class="error-text tada animated"><i class="fa fa-times-circle text-danger error-icon-shadow"></i> Error 500</h1>
                            <h2 class="font-xl"><strong>Oooops, Something went wrong!</strong></h2>
                            <br>
                            <p class="lead semi-bold">
                                <strong>You have experienced a technical error. We apologize.</strong><br><br>
                                <small>
                                    We are working hard to correct this issue. Please wait a few moments and try your search again. <br> In the meantime, check out whats new on SmartAdmin:
                                </small>
                            </p>
                            <ul class="error-search text-left font-md">
                                <li><a href="javascript:void(0);"><small>Go to My Dashboard <i class="fa fa-arrow-right"></i></small></a></li>
                                <li><a href="javascript:void(0);"><small>Contact SmartAdmin IT Staff <i class="fa fa-mail-forward"></i></small></a></li>
                                <li><a href="javascript:void(0);"><small>Report error!</small></a></li>
                                <li><a href="javascript:void(0);"><small>Go back</small></a></li>
                            </ul>
                        </div>

                    </div>

                </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*58.45*/("""{"""),format.raw/*58.46*/(""" """),format.raw/*58.47*/("""trigger: "hover" """),format.raw/*58.64*/("""}"""),format.raw/*58.65*/(""");
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
         * var pagefunction = function() """),format.raw/*83.42*/("""{"""),format.raw/*83.43*/("""
         """),format.raw/*84.10*/("""*   ...
         * """),format.raw/*85.12*/("""}"""),format.raw/*85.13*/("""
         """),format.raw/*86.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*89.42*/("""{"""),format.raw/*89.43*/("""
         """),format.raw/*90.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*91.12*/("""}"""),format.raw/*91.13*/("""
         """),format.raw/*92.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS


        // pagefunction

        var pagefunction = function() """),format.raw/*103.39*/("""{"""),format.raw/*103.40*/("""
        """),format.raw/*104.9*/("""$("#search-error").focus();
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/(""";

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/error500.scala.html
                  HASH: c61a95e8809534006b5982bbfdbf0820d0533f05
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|840->117|868->118|898->122|950->148|977->149|1005->151|3236->2354|3265->2355|3294->2356|3339->2373|3368->2374|4056->3034|4085->3035|4123->3045|4170->3064|4199->3065|4237->3075|4404->3214|4433->3215|4471->3225|4560->3286|4589->3287|4627->3297|4851->3492|4881->3493|4918->3502|4982->3538|5012->3539
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|27->6|27->6|28->7|29->8|29->8|30->9|79->58|79->58|79->58|79->58|79->58|104->83|104->83|105->84|106->85|106->85|107->86|110->89|110->89|111->90|112->91|112->91|113->92|124->103|124->103|125->104|126->105|126->105
                  -- GENERATED --
              */
          