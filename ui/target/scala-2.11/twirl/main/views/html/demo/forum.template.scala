
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
object forum extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                <h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-file-o"></i> Other Pages <span>&gt;
                    Forum Layout </span></h1>
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

            <div class="col-sm-12">

                <div class="well">

                    <table class="table table-striped table-forum">
                        <thead>
                            <tr>
                                <th colspan="2">Introduction</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Topics</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Posts</th>
                                <th class="hidden-xs hidden-sm" style="width: 200px;">Last Post</th>
                            </tr>
                        </thead>
                        <tbody>

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-globe fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Hello, welcome to SmartAdmin Forum!
                                    </a>
                                        <small>You can introduce yourself here</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-microphone fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        News &amp; Announcements
                                    </a>
                                        <small>Latest news and reports</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-pencil fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Forum Rules
                                    </a>
                                        <small>Please read carefully our forum rules before you post</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                        </tbody>
                    </table>

                    <table class="table table-striped table-forum">
                        <thead>
                            <tr>
                                <th colspan="2">Projects</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Topics</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Posts</th>
                                <th class="hidden-xs hidden-sm" style="width: 200px;">Last Post</th>
                            </tr>
                        </thead>
                        <tbody>

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-table fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Business Requirement Docs
                                    </a>
                                        <small>Latest BRD docs</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-bar-chart-o fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Project Discussions
                                    </a>
                                        <small>Post all project related topics here</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-user fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Clients
                                    </a>
                                        <small>Client forum posts</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-dollar fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Budget Meetings
                                    </a>
                                        <small>Project budget discussions</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                        </tbody>
                    </table>


                    <table class="table table-striped table-forum">
                        <thead>
                            <tr>
                                <th colspan="2">Support</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Topics</th>
                                <th class="text-center hidden-xs hidden-sm" style="width: 100px;">Posts</th>
                                <th class="hidden-xs hidden-sm" style="width: 200px;">Last Post</th>
                            </tr>
                        </thead>
                        <tbody>

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-book fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        How to...
                                    </a>
                                        <small>Maecenas nec odio et</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-question-circle fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        Questions and FAQs
                                    </a>
                                        <small>Luctus pulvinar hendrerit id lorem</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                                <!-- TR -->
                            <tr>
                                <td class="text-center" style="width: 40px;"><i class="fa fa-user-md fa-2x text-muted"></i></td>
                                <td>
                                    <h4><a href="#ajax/forum-topic.html">
                                        User Guideline
                                    </a>
                                        <small>Cras dapibus vivamus elementum semper nisi</small>
                                    </h4>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">431</a>
                                </td>
                                <td class="text-center hidden-xs hidden-sm">
                                    <a href="javascript:void(0);">1342</a>
                                </td>
                                <td class="hidden-xs hidden-sm">by
                                    <a href="javascript:void(0);">John Doe</a>
                                    <br>
                                    <small><i>January 1, 2014</i></small>
                                </td>
                            </tr>
                                <!-- end TR -->

                        </tbody>
                    </table>


                </div>
            </div>

        </div>

            <!-- end row -->

            <!-- row -->

        <div class="row">

                <!-- a blank row to get started -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*360.45*/("""{"""),format.raw/*360.46*/(""" """),format.raw/*360.47*/("""trigger: "hover" """),format.raw/*360.64*/("""}"""),format.raw/*360.65*/(""");
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

        var pagefunction = function() """),format.raw/*388.39*/("""{"""),format.raw/*388.40*/("""

        """),format.raw/*390.9*/("""}"""),format.raw/*390.10*/(""";

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
                  DATE: Thu Aug 28 21:08:45 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/forum.scala.html
                  HASH: 0c7e240e71aedd38decb64062dbbdd605959b68a
                  MATRIX: 510->1|615->18|643->21|664->34|703->36|734->41|19171->18449|19201->18450|19231->18451|19277->18468|19307->18469|20020->19153|20050->19154|20088->19164|20118->19165
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|381->360|381->360|381->360|381->360|381->360|409->388|409->388|411->390|411->390
                  -- GENERATED --
              */
          