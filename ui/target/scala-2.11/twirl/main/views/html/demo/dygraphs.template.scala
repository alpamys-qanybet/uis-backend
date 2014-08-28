
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
object dygraphs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""



    """),format.raw/*6.5*/("""<script type="text/javascript">

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
     * $("[rel=popover-hover]").popover("""),format.raw/*19.41*/("""{"""),format.raw/*19.42*/(""" """),format.raw/*19.43*/("""trigger: "hover" """),format.raw/*19.60*/("""}"""),format.raw/*19.61*/(""");
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
     * var pagefunction = function() """),format.raw/*44.38*/("""{"""),format.raw/*44.39*/("""
     """),format.raw/*45.6*/("""*   ...
     * """),format.raw/*46.8*/("""}"""),format.raw/*46.9*/("""
     """),format.raw/*47.6*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
     *
     * TO LOAD A SCRIPT:
     * var pagefunction = function ()"""),format.raw/*50.38*/("""{"""),format.raw/*50.39*/("""
     """),format.raw/*51.6*/("""*  loadScript(".../plugin.js", run_after_loaded);
     * """),format.raw/*52.8*/("""}"""),format.raw/*52.9*/("""
     """),format.raw/*53.6*/("""*
     * OR
     *
     * loadScript(".../plugin.js", run_after_loaded);
     */

    var pagefunction = function ()"""),format.raw/*59.35*/("""{"""),format.raw/*59.36*/("""

    """),format.raw/*61.5*/("""loadScript("assets/javascripts/plugin/dygraphs/demo-data.min.js", draw_g_1);

    function draw_g_1() """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""

    """),format.raw/*65.5*/("""g1 = new Dygraph(document.getElementById("noroll"), data_temp, """),format.raw/*65.68*/("""{"""),format.raw/*65.69*/("""
    """),format.raw/*66.5*/("""customBars : true,
    title : 'Daily Temperatures in New York vs. San Francisco',
    ylabel : 'Temperature (F)',
    legend : 'always',
    labelsDivStyles : """),format.raw/*70.23*/("""{"""),format.raw/*70.24*/("""
    """),format.raw/*71.5*/("""'textAlign' : 'right'
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""",
    showRangeSelector : true
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""");

    g2 = new Dygraph(document.getElementById("roll14"), data_temp, """),format.raw/*76.68*/("""{"""),format.raw/*76.69*/("""
    """),format.raw/*77.5*/("""rollPeriod : 14,
    showRoller : true,
    customBars : true,
    ylabel : 'Temperature (F)',
    legend : 'always',
    labelsDivStyles : """),format.raw/*82.23*/("""{"""),format.raw/*82.24*/("""
    """),format.raw/*83.5*/("""'textAlign' : 'right'
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""",
    showRangeSelector : true,
    rangeSelectorHeight : 30,
    rangeSelectorPlotStrokeColor : 'yellow',
    rangeSelectorPlotFillColor : 'lightyellow'
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""");
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""

    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""

    """),format.raw/*94.5*/("""loadScript("assets/javascripts/plugin/dygraphs/dygraph-combined.min.js", pagefunction);

    </script>
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*97.2*/("""
"""),_display_(/*98.2*/main(message,scripts)/*98.23*/ {_display_(Seq[Any](format.raw/*98.25*/("""
    """),format.raw/*99.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
                <h1 class="page-title txt-color-blueDark">

                        <!-- PAGE HEADER -->
                    <i class="fa fa-fw fa-bar-chart-o"></i>
                    Graphs
                    <span>&gt;
                        Dygraphs
                    </span>
                </h1>
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
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                    <div class="alert alert-info">

                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-8 col-lg-9">
                                <h3 class="no-margin">Dygraphs is a fast, flexible open source JavaScript charting library.</h3>



                                <h5>Features</h5>
                                <ul>
                                    <li>Handles <strong>huge data sets</strong>: dygraphs plots millions of points without getting bogged down.
                                    </li><li><strong>Interactive out of the box</strong>: zoom, pan and mouseover are on by default.
                                </li><li>Strong support for <strong>error bars</strong> / confidence intervals.
                                </li><li><strong>Highly customizable</strong>: using options and custom callbacks, you can make dygraphs do almost anything.
                                </li><li>dygraphs is <strong>highly compatible</strong>: it works in all major browsers (including IE8). You can even <strong>pinch to zoom</strong> on mobile/tablet devices!
                                </li><li>There's an <strong>active community</strong> developing and supporting dygraphs.</li>
                                </ul>
                            </div>

                            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-3">
                                <h4>JavaScript Example</h4>
                                <pre class="prettyprint margin-top-10">new Dygraph(div, "ny-vs-sf.txt", """),format.raw/*179.105*/("""{"""),format.raw/*179.106*/("""
                                    """),format.raw/*180.37*/("""legend: 'always',
                                    title: 'NYC vs. SF',
                                    showRoller: true,
                                    rollPeriod: 14,
                                    customBars: true,
                                    ylabel: 'Temperature (F)',
                                    """),format.raw/*186.37*/("""}"""),format.raw/*186.38*/(""");</pre>
                            </div>

                        </div>




                    </div>

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-0">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>No roll period </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input class="form-control" type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body">

                                    <!-- this is what the user will see -->
                                <div id="noroll" style="width:100%; height:300px;"><div style="text-align: left; width: 1010px; height: 300px; position: relative;"><canvas width="1010" height="300" style="position: absolute; width: 1010px; height: 300px;"></canvas><canvas width="1010" height="300" style="position: absolute; width: 1010px; height: 300px;"></canvas><canvas class="dygraph-rangesel-bgcanvas" width="949" height="40" style="position: absolute; z-index: 9; top: 260px; left: 56px; width: 949px; height: 40px;"></canvas><canvas class="dygraph-rangesel-fgcanvas" width="949" height="40" style="position: absolute; z-index: 9; cursor: default; top: 260px; left: 56px; width: 949px; height: 40px;"></canvas><img class="dygraph-rangesel-zoomhandle" width="18" height="32" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAQCAYAAADESFVDAAAAAXNSR0IArs4c6QAAAAZiS0dEANAAzwDP4Z7KegAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAAd0SU1FB9sHGw0cMqdt1UwAAAAZdEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVBXgQ4XAAAAaElEQVQoz+3SsRFAQBCF4Z9WJM8KCDVwownl6YXsTmCUsyKGkZzcl7zkz3YLkypgAnreFmDEpHkIwVOMfpdi9CEEN2nGpFdwD03yEqDtOgCaun7sqSTDH32I1pQA2Pb9sZecAxc5r3IAb21d6878xsAAAAAASUVORK5CYII=" style="position: absolute; z-index: 10; visibility: visible; cursor: col-resize; left: 47px; top: 264px;"><img class="dygraph-rangesel-zoomhandle" width="18" height="32" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAQCAYAAADESFVDAAAAAXNSR0IArs4c6QAAAAZiS0dEANAAzwDP4Z7KegAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAAd0SU1FB9sHGw0cMqdt1UwAAAAZdEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVBXgQ4XAAAAaElEQVQoz+3SsRFAQBCF4Z9WJM8KCDVwownl6YXsTmCUsyKGkZzcl7zkz3YLkypgAnreFmDEpHkIwVOMfpdi9CEEN2nGpFdwD03yEqDtOgCaun7sqSTDH32I1pQA2Pb9sZecAxc5r3IAb21d6878xsAAAAAASUVORK5CYII=" style="position: absolute; z-index: 10; visibility: visible; cursor: col-resize; left: 996px; top: 264px;"><div style="position: absolute; left: 0px; top: 0px; width: 1005px; height: 28px; text-align: center; font-size: 20px; font-weight: bold; z-index: 10;"><div class="dygraph-label dygraph-title">Daily Temperatures in New York vs. San Francisco</div></div><div style="position: absolute; left: 0px; top: 28px; width: 0px; height: 272px; font-size: 16px;"><div style="position: absolute; width: 272px; height: 0px; top: 136px; left: -136px; text-align: center; -webkit-transform: rotate(-90deg);"><div class="dygraph-label dygraph-ylabel">Temperature (F)</div></div></div><input type="text" size="2" style="display: none; position: absolute; z-index: 10; top: 211px; left: 57px;"><div class="dygraph-legend" style="position: absolute; font-size: 14px; z-index: 10; width: 250px; top: 28px; left: 754px; background-color: white; line-height: normal; text-align: right; overflow: hidden; background-position: initial initial; background-repeat: initial initial;"><span style="font-weight: bold; color: rgb(0,128,0);"><div style="display: inline-block; position: relative; bottom: .5ex; padding-left: 1em; height: 1px; border-bottom: 2px solid rgb(0,128,0);"></div> NY</span> <span style="font-weight: bold; color: rgb(0,0,128);"><div style="display: inline-block; position: relative; bottom: .5ex; padding-left: 1em; height: 1px; border-bottom: 2px solid rgb(0,0,128);"></div> SF</span></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 229px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">0</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 191.65709156193896px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">20</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 154.3141831238779px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">40</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 116.97127468581688px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">60</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 79.62836624775585px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">80</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 42.285457809694805px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">100</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 31px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 110.89710009354536px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 191.68194574368567px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 273.354536950421px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 355.02712815715626px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 435.81197380729657px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 516.5968194574368px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 598.2694106641721px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 679.9420018709073px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 759.8391019644528px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 840.6239476145931px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 239px; left: 922.2965388213283px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 09</div></div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-1">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>No roll (timestamp)</h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input class="form-control" type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body">
                                <p class="alert alert-success">Roll period of 14 timesteps, custom range selector height and plot color.</p>
                                    <!-- this is what the user will see -->
                                <div id="roll14" style="width:100%; height:300px;"><div style="text-align: left; width: 1010px; height: 300px; position: relative;"><canvas width="1010" height="300" style="position: absolute; width: 1010px; height: 300px;"></canvas><canvas width="1010" height="300" style="position: absolute; width: 1010px; height: 300px;"></canvas><canvas class="dygraph-rangesel-bgcanvas" width="949" height="30" style="position: absolute; z-index: 9; top: 270px; left: 56px; width: 949px; height: 30px;"></canvas><canvas class="dygraph-rangesel-fgcanvas" width="949" height="30" style="position: absolute; z-index: 9; cursor: default; top: 270px; left: 56px; width: 949px; height: 30px;"></canvas><img class="dygraph-rangesel-zoomhandle" width="18" height="32" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAQCAYAAADESFVDAAAAAXNSR0IArs4c6QAAAAZiS0dEANAAzwDP4Z7KegAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAAd0SU1FB9sHGw0cMqdt1UwAAAAZdEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVBXgQ4XAAAAaElEQVQoz+3SsRFAQBCF4Z9WJM8KCDVwownl6YXsTmCUsyKGkZzcl7zkz3YLkypgAnreFmDEpHkIwVOMfpdi9CEEN2nGpFdwD03yEqDtOgCaun7sqSTDH32I1pQA2Pb9sZecAxc5r3IAb21d6878xsAAAAAASUVORK5CYII=" style="position: absolute; z-index: 10; visibility: visible; cursor: col-resize; left: 47px; top: 270px;"><img class="dygraph-rangesel-zoomhandle" width="18" height="32" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAQCAYAAADESFVDAAAAAXNSR0IArs4c6QAAAAZiS0dEANAAzwDP4Z7KegAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAAd0SU1FB9sHGw0cMqdt1UwAAAAZdEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVBXgQ4XAAAAaElEQVQoz+3SsRFAQBCF4Z9WJM8KCDVwownl6YXsTmCUsyKGkZzcl7zkz3YLkypgAnreFmDEpHkIwVOMfpdi9CEEN2nGpFdwD03yEqDtOgCaun7sqSTDH32I1pQA2Pb9sZecAxc5r3IAb21d6878xsAAAAAASUVORK5CYII=" style="position: absolute; z-index: 10; visibility: visible; cursor: col-resize; left: 996px; top: 270px;"><div style="position: absolute; left: 0px; top: 0px; width: 0px; height: 300px; font-size: 16px;"><div style="position: absolute; width: 300px; height: 0px; top: 150px; left: -150px; text-align: center; -webkit-transform: rotate(-90deg);"><div class="dygraph-label dygraph-ylabel">Temperature (F)</div></div></div><input type="text" size="2" style="display: block; position: absolute; z-index: 10; top: 221px; left: 57px;"><div class="dygraph-legend" style="position: absolute; font-size: 14px; z-index: 10; width: 250px; top: 0px; left: 754px; background-color: white; line-height: normal; text-align: right; overflow: hidden; background-position: initial initial; background-repeat: initial initial;"><span style="font-weight: bold; color: rgb(0,128,0);"><div style="display: inline-block; position: relative; bottom: .5ex; padding-left: 1em; height: 1px; border-bottom: 2px solid rgb(0,128,0);"></div> NY</span> <span style="font-weight: bold; color: rgb(0,0,128);"><div style="display: inline-block; position: relative; bottom: .5ex; padding-left: 1em; height: 1px; border-bottom: 2px solid rgb(0,0,128);"></div> SF</span></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 215.40954773869345px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">20</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 186.56532663316582px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">30</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 157.7211055276382px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">40</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 128.87688442211055px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">50</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 100.03266331658291px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">60</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 71.18844221105527px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">70</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 42.344221105527645px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">80</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; top: 13.50000000000001px; left: 3px; text-align: right;"><div class="dygraph-axis-label dygraph-axis-label-y">90</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 31px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 110.89710009354536px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 191.68194574368567px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 273.354536950421px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 07</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 355.02712815715626px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 435.81197380729657px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 516.5968194574368px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 598.2694106641721px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 08</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 679.9420018709073px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jan 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 759.8391019644528px;"><div class="dygraph-axis-label dygraph-axis-label-x">Apr 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 840.6239476145931px;"><div class="dygraph-axis-label dygraph-axis-label-x">Jul 09</div></div><div style="position: absolute; font-size: 14px; z-index: 10; color: black; width: 50px; line-height: normal; overflow: hidden; text-align: center; top: 249px; left: 922.2965388213283px;"><div class="dygraph-axis-label dygraph-axis-label-x">Oct 09</div></div></div></div>

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

                    <!-- a blank row to get started -->
                <div class="col-sm-12">
                        <!-- your contents here -->
                </div>

            </div>

                <!-- end row -->

        </section>
            <!-- end"""),
format.raw(""" widget grid -->

    </div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:42 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/dygraphs.scala.html
                  HASH: 828e9667f50d9291d61ed7fea83bb460459228ed
                  MATRIX: 513->1|601->20|615->27|695->31|729->39|1129->411|1158->412|1187->413|1232->430|1261->431|1857->999|1886->1000|1919->1006|1961->1021|1989->1022|2022->1028|2177->1155|2206->1156|2239->1162|2323->1219|2351->1220|2384->1226|2528->1342|2557->1343|2590->1349|2720->1451|2749->1452|2782->1458|2873->1521|2902->1522|2934->1527|3122->1687|3151->1688|3183->1693|3236->1719|3264->1720|3326->1755|3354->1756|3453->1827|3482->1828|3514->1833|3682->1973|3711->1974|3743->1979|3796->2005|3824->2006|4009->2164|4037->2165|4071->2172|4099->2173|4132->2179|4160->2180|4193->2186|4336->18|4364->2290|4392->2292|4422->2313|4462->2315|4494->2320|8857->6653|8888->6654|8954->6691|9317->7025|9347->7026
                  LINES: 19->1|21->2|21->2|23->2|27->6|40->19|40->19|40->19|40->19|40->19|65->44|65->44|66->45|67->46|67->46|68->47|71->50|71->50|72->51|73->52|73->52|74->53|80->59|80->59|82->61|84->63|84->63|86->65|86->65|86->65|87->66|91->70|91->70|92->71|93->72|93->72|95->74|95->74|97->76|97->76|98->77|103->82|103->82|104->83|105->84|105->84|110->89|110->89|111->90|111->90|113->92|113->92|115->94|119->1|120->97|121->98|121->98|121->98|122->99|202->179|202->179|203->180|209->186|209->186
                  -- GENERATED --
              */
          