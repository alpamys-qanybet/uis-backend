
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
object treeview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa fa-desktop fa-fw "></i>
                UI Elements
                <span>&gt;
                    Tree View
                </span>
            </h1>
        </div>
        <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
            <ul id="sparks" class="">
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
        </div>
    </div>
            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-orange" id="wid-id-0" data-widget-editbutton="false">
                            <!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
                        <header>
                            <span class="widget-icon"> <i class="fa fa-lg fa-calendar"></i> </span>
                            <h2>Organizing view </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body">

                                <div class="widget-body-toolbar bg-color-white">

                                    <form class="form-inline" role="form">

                                        <div class="row">

                                            <div class="col-sm-12 col-md-10">

                                                <div class="form-group">
                                                    <label class="sr-only">Task title</label>
                                                    <input type="email" class="form-control input-sm" placeholder="My Task">
                                                </div>
                                                <div class="form-group">
                                                    <label class="sr-only">Pick Week</label>
                                                    <select class="form-control input-sm">
                                                        <option>Week 1</option>
                                                        <option>Week 2</option>
                                                    </select>
                                                </div>
                                                <div class="form-group">
                                                    <label class="sr-only">Days</label>
                                                    <select class="form-control input-sm">
                                                        <option>Monday</option>
                                                        <option>Tuesday</option>
                                                        <option>Wednesday</option>
                                                        <option>Thursday</option>
                                                        <option>Friday</option>
                                                        <option>Saturday</option>
                                                        <option>Sunday</option>
                                                    </select>
                                                </div>

                                            </div>

                                            <div class="col-sm-12 col-md-2 text-align-right">

                                                <button type="submit" class="btn btn-warning btn-xs">
                                                    <i class="fa fa-plus"></i> Add
                                                </button>

                                            </div>

                                        </div>

                                    </form>

                                </div>

                                <div class="tree">
                                    <ul role="tree">
                                        <li class="parent_li" role="treeitem">
                                            <span title="Collapse this branch"><i class="fa fa-lg fa-calendar"></i> 2013, Week 2</span>
                                            <ul role="group">
                                                <li class="parent_li" role="treeitem">
                                                    <span class="label label-success" title="Collapse this branch"><i class="fa fa-lg fa-plus-circle"></i> Monday, January 7: 8.00 hours</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 8.00</span> – <a href="javascript:void(0);">Changed CSS to accomodate...</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="parent_li" role="treeitem">
                                                    <span class="label label-success" title="Collapse this branch"><i class="fa fa-lg fa-minus-circle"></i> Tuesday, January 8: 8.00 hours</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 6.00</span> – <a href="javascript:void(0);">Altered code...</a>
                                                        </li>
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 2.00</span> – <a href="javascript:void(0);">Simplified our approach to...</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="parent_li" role="treeitem">
                                                    <span class="label label-warning" title="Collapse this branch"><i class="fa fa-lg fa-minus-circle"></i> Wednesday, January 9: 6.00 hours</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 3.00</span> – <a href="javascript:void(0);">Fixed bug caused by...</a>
                                                        </li>
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 3.00</span> – <a href="javascript:void(0);">Comitting latest code to Git...</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="parent_li" role="treeitem">
                                                    <span class="label label-danger" title="Collapse this branch"><i class="fa fa-lg fa-minus-circle"></i> Wednesday, January 9: 4.00 hours</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 2.00</span> – <a href="javascript:void(0);">Create component that...</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="parent_li" role="treeitem">
                                            <span title="Collapse this branch"><i class="fa fa-lg fa-calendar"></i> 2013, Week 3</span>
                                            <ul role="group">
                                                <li class="parent_li" role="treeitem">
                                                    <span class="label label-success" title="Collapse this branch"><i class="fa fa-lg fa-minus-circle"></i> Monday, January 14: 8.00 hours</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 7.75</span> – <a href="javascript:void(0);">Writing documentation...</a>
                                                        </li>
                                                        <li>
                                                            <span><i class="fa fa-clock-o"></i> 0.25</span> – <a href="javascript:void(0);">Reverting code back to...</a>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blue" id="wid-id-1" data-widget-editbutton="false">
                            <!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
                        <header>
                            <span class="widget-icon"> <i class="fa fa-sitemap"></i> </span>
                            <h2>Simple View </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body">

                                <div class="tree smart-form">
                                    <ul role="tree">
                                        <li class="parent_li" role="treeitem">
                                            <span title="Collapse this branch"><i class="fa fa-lg fa-folder-open"></i> Parent</span>
                                            <ul role="group">
                                                <li class="parent_li" role="treeitem">
                                                    <span title="Collapse this branch"><i class="fa fa-lg fa-plus-circle"></i> Administrators</span>
                                                    <ul role="group">
                                                        <li style="display:none">
                                                            <span> <label class="checkbox inline-block">
                                                                <input type="checkbox" name="checkbox-inline">
                                                                <i></i>Michael.Jackson</label> </span>
                                                        </li>
                                                        <li style="display:none">
                                                            <span> <label class="checkbox inline-block">
                                                                <input type="checkbox" checked="checked" name="checkbox-inline">
                                                                <i></i>Sunny.Ahmed</label> </span>
                                                        </li>
                                                        <li style="display:none">
                                                            <span> <label class="checkbox inline-block">
                                                                <input type="checkbox" checked="checked" name="checkbox-inline">
                                                                <i></i>Jackie.Chan</label> </span>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="parent_li" role="treeitem">
                                                    <span title="Collapse this branch"><i class="fa fa-lg fa-minus-circle"></i> Child</span>
                                                    <ul role="group">
                                                        <li>
                                                            <span><i class="icon-leaf"></i> Grand Child</span>
                                                        </li>
                                                        <li>
                                                            <span><i class="icon-leaf"></i> Grand Child</span>
                                                        </li>
                                                        <li class="parent_li" role="treeitem">
                                                            <span title="Collapse this branch"><i class="fa fa-lg fa-plus-circle"></i> Grand Child</span>
                                                            <ul role="group">
                                                                <li style="display:none" class="parent_li" role="treeitem">
                                                                    <span title="Collapse this branch"><i class="fa fa-lg fa-plus-circle"></i> Great Grand Child</span>
                                                                    <ul role="group">
                                                                        <li style="display:none">
                                                                            <span><i class="icon-leaf"></i> Great great Grand Child</span>
                                                                        </li>
                                                                        <li style="display:none">
                                                                            <span><i class="icon-leaf"></i> Great great Grand Child</span>
                                                                        </li>
                                                                    </ul>
                                                                </li>
                                                                <li style="display:none">
                                                                    <span><i class="icon-leaf"></i> Great Grand Child</span>
                                                                </li>
                                                                <li style="display:none">
                                                                    <span><i class="icon-leaf"></i> Great Grand Child</span>
                                                                </li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="parent_li" role="treeitem">
                                            <span title="Collapse this branch"><i class="fa fa-lg fa-folder-open"></i> Parent2</span>
                                            <ul role="group">
                                                <li>
                                                    <span><i class="icon-leaf"></i> Child</span>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

            </div>

                <!-- end row -->

        </section>
            <!-- end widget grid -->

        <script type="text/javascript">
        /* DO NOT REMOVE : GLOBAL FUN"""),
format.raw("""CTIONS!
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
         * $("[rel=popover-hover]").popover("""),format.raw/*344.45*/("""{"""),format.raw/*344.46*/(""" """),format.raw/*344.47*/("""trigger: "hover" """),format.raw/*344.64*/("""}"""),format.raw/*344.65*/(""");
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

        // PAGE RELATED SCRIPTS
        // pagefunction

        var pagefunction = function() """),format.raw/*368.39*/("""{"""),format.raw/*368.40*/("""

        """),format.raw/*370.9*/("""loadScript("js/plugin/bootstraptree/bootstrap-tree.min.js");

        """),format.raw/*372.9*/("""}"""),format.raw/*372.10*/(""";

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/treeview.scala.html
                  HASH: b7985ddd843c9be513a324f0c5eab05a166dec04
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|21136->20391|21166->20392|21196->20393|21242->20410|21272->20411|21898->21008|21928->21009|21966->21019|22064->21089|22094->21090
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|366->344|366->344|366->344|366->344|366->344|390->368|390->368|392->370|394->372|394->372
                  -- GENERATED --
              */
          