
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
object timeline extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
                <h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-home"></i> Other Pages <span>&gt;
                    Timeline </span></h1>
            </div>
                <!-- end col -->

                <!-- right side of the page with the sparkline graphs -->
                <!-- col -->
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
                    <!-- sparks -->
                <ul id="sparks">
                    <li class="sparks-info">
                        <h5> My Income <span class="txt-color-blue">$47,171</span></h5>
                        <div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm"><canvas width="89" height="26" style="display: inline-block; width: 89px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                    <li class="sparks-info">
                        <h5> Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip" title="Increased"></i>&nbsp;45%</span></h5>
                        <div class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display: inline-block; width: 82px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                    <li class="sparks-info">
                        <h5> Site Orders <span class="txt-color-greenDark"><i class="fa fa-shopping-cart"></i>&nbsp;2447</span></h5>
                        <div class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display: inline-block; width: 82px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                </ul>
                    <!-- end sparks -->
            </div>
                <!-- end col -->

        </div>
            <!-- end row -->

            <!-- row -->
        <div class="row">

            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                <div class="well well-sm">
                        <!-- Timeline Content -->
                    <div class="smart-timeline">
                        <ul class="smart-timeline-list">
                            <li>
                                <div class="smart-timeline-icon">
                                    <img src="img/avatars/sunny.png" width="32" height="32">
                                </div>
                                <div class="smart-timeline-time">
                                    <small>just now</small>
                                </div>
                                <div class="smart-timeline-content">
                                    <p>
                                        <a href="javascript:void(0);"><strong>Trip to Adalaskar</strong></a>
                                    </p>
                                    <p>
                                        Check out my tour to Adalaskar
                                    </p>
                                    <p>
                                        <a href="javascript:void(0);" class="btn btn-xs btn-primary"><i class="fa fa-file"></i> Read the post</a>
                                    </p>
                                    <img src="img/superbox/superbox-thumb-4.jpg" alt="img" width="150">



                                </div>
                            </li>
                            <li>
                                <div class="smart-timeline-icon">
                                    <i class="fa fa-file-text"></i>
                                </div>
                                <div class="smart-timeline-time">
                                    <small>1 min ago</small>
                                </div>
                                <div class="smart-timeline-content">
                                    <p>
                                        <strong>Meeting invite for "GENERAL GNU" [<a href="javascript:void(0);"><i>Go to my calendar</i></a>]</strong>
                                    </p>

                                    <div class="well well-sm display-inline">
                                        <p>Will you be able to attend the meeting - <strong> 10:00 am</strong> tomorrow?</p>
                                        <button class="btn btn-xs btn-default">Confirm Attendance</button>
                                    </div>

                                </div>
                            </li>
                            <li>
                                <div class="smart-timeline-icon bg-color-greenDark">
                                    <i class="fa fa-bar-chart-o"></i>
                                </div>
                                <div class="smart-timeline-time">
                                    <small>5 hrs ago</small>
                                </div>
                                <div class="smart-timeline-content">
                                    <p>
                                        <strong class="txt-color-greenDark">24hrs User Feed</strong>
                                    </p>

                                    <div class="sparkline" data-sparkline-type="compositeline" data-sparkline-spotradius-top="5" data-sparkline-color-top="#3a6965" data-sparkline-line-width-top="3" data-sparkline-color-bottom="#2b5c59" data-sparkline-spot-color="#2b5c59" data-sparkline-minspot-color-top="#97bfbf" data-sparkline-maxspot-color-top="#c2cccc" data-sparkline-highlightline-color-top="#cce8e4" data-sparkline-highlightspot-color-top="#9dbdb9" data-sparkline-width="170px" data-sparkline-height="40px" data-sparkline-line-val="[6,4,7,8,4,3,2,2,5,6,7,4,1,5,7,9,9,8,7,6]" data-sparkline-bar-val="[4,1,5,7,9,9,8,7,6,6,4,7,8,4,3,2,2,5,6,7]"><canvas width="170" height="40" style="display: inline-block; width: 170px; height: 40px; vertical-align: top;"></canvas></div>

                                    <br>
                                </div>
                            </li>
                            <li>
                                <div class="smart-timeline-icon">
                                    <i class="fa fa-user"></i>
                                </div>
                                <div class="smart-timeline-time">
                                    <small>yesterday</small>
                                </div>
                                <div class="smart-timeline-content">
                                    <p>
                                        <a href="javascript:void(0);"><strong>Update user information</strong></a>
                                    </p>
                                    <p>
                                        Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus.
                                    </p>

                                    Tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit

                                    <ul class="list-inline">
                                        <li>
                                            <img src="img/superbox/superbox-thumb-6.jpg" alt="img" width="50">
                                        </li>
                                        <li>
                                            <img src="img/superbox/superbox-thumb-5.jpg" alt="img" width="50">
                                        </li>
                                        <li>
                                            <img src="img/superbox/superbox-thumb-7.jpg" alt="img" width="50">
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li>
                                <div class="smart-timeline-icon">
                                    <i class="fa fa-pencil"></i>
                                </div>
                                <div class="smart-timeline-time">
                                    <small>12 Mar, 2013</small>
                                </div>
                                <div class="smart-timeline-content">
                                    <p>
                                        <a href="javascript:void(0);"><strong>Nabi Resource Report</strong></a>
                                    </p>
                                    <p>
                                        Ean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis.
                                    </p>
                                    <a href="javascript:void(0);" class="btn btn-xs btn-default">Read more</a>
                                </div>
                            </li>
                            <li class="text-center">
                                <a href="javascript:void(0)" class="btn btn-sm btn-default"><i class="fa fa-arrow-down text-muted"></i> LOAD MORE</a>
                            </li>
                        </ul>
                    </div>
                        <!-- END Timeline Content -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*183.45*/("""{"""),format.raw/*183.46*/(""" """),format.raw/*183.47*/("""trigger: "hover" """),format.raw/*183.64*/("""}"""),format.raw/*183.65*/(""");
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
         */

        // pagefunction

        var pagefunction = function() """),format.raw/*211.39*/("""{"""),format.raw/*211.40*/("""

        """),format.raw/*213.9*/("""}"""),format.raw/*213.10*/(""";

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/timeline.scala.html
                  HASH: c6dc75ac9a609a775055ffca8a9dc1e2c9ffe931
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|11055->10330|11085->10331|11115->10332|11161->10349|11191->10350|11904->11034|11934->11035|11972->11045|12002->11046
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|204->183|204->183|204->183|204->183|204->183|232->211|232->211|234->213|234->213
                  -- GENERATED --
              */
          