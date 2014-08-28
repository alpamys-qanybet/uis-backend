
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
object inline_charts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""

    """),format.raw/*4.5*/("""<script type="text/javascript">

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
     * $("[rel=popover-hover]").popover("""),format.raw/*17.41*/("""{"""),format.raw/*17.42*/(""" """),format.raw/*17.43*/("""trigger: "hover" """),format.raw/*17.60*/("""}"""),format.raw/*17.61*/(""");
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
     * var pagefunction = function() """),format.raw/*42.38*/("""{"""),format.raw/*42.39*/("""
     """),format.raw/*43.6*/("""*   ...
     * """),format.raw/*44.8*/("""}"""),format.raw/*44.9*/("""
     """),format.raw/*45.6*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
     *
     * TO LOAD A SCRIPT:
     * var pagefunction = function ()"""),format.raw/*48.38*/("""{"""),format.raw/*48.39*/("""
     """),format.raw/*49.6*/("""*  loadScript(".../plugin.js", run_after_loaded);
     * """),format.raw/*50.8*/("""}"""),format.raw/*50.9*/("""
     """),format.raw/*51.6*/("""*
     * OR
     *
     * loadScript(".../plugin.js", run_after_loaded);
     */

    // PAGE RELATED SCRIPTS

    // pagefunction

    var pagefunction = function() """),format.raw/*61.35*/("""{"""),format.raw/*61.36*/("""

    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""";

    // end pagefunction

    // run pagefunction on load

    pagefunction();

    </script>
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*72.2*/("""
"""),_display_(/*73.2*/main(message,scripts)/*73.23*/ {_display_(Seq[Any](format.raw/*73.25*/("""
    """),format.raw/*74.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-bar-chart-o fa-fw "></i>
                Graph
                <span>&gt;
                    Inline Charts
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

            <!-- row -->
        <div class="row">

            <div class="col-sm-12">

                <div class="well">

                    <h1>JQuery <span class="semi-bold">Sparklines</span> <small>Modified for easier usage</small></h1>
                    <p>Sparklines are light weight, easy to use, inline charts. We have modified sparklines so you can use it with just <code>data-*</code> values, without the use of javascript</p>
                    <br>
                    <div class="row">
                        <div class="col-sm-6">
                            <ul>
                                <li>
                                    Inline Graphs &nbsp;
                                    <span class="sparkline" data-sparkline-type="line" data-sparkline-width="50px" data-sparkline-height="18px"><canvas width="50" height="18" style="display: inline-block; width: 50px; height: 18px; vertical-align: top;"></canvas></span>&nbsp;
                                    also change width, height, and color &nbsp;
                                    <span class="sparkline txt-color-green" data-sparkline-type="line" data-sparkline-width="80px" data-fill-color="transparent" data-sparkline-spotradius="3" data-sparkline-height="15px"><canvas width="80" height="15" style="display: inline-block; width: 80px; height: 15px; vertical-align: top;"></canvas></span>
                                    <p class="note">
                                            &lt;span data-sparkline-type="line" data-sparkline-width="50px" data-sparkline-height="18px"&gt;90,30,60,...&lt;/span&gt;
                                    </p>
                                </li>
                                <li>
                                    Compose inline charts
                                    <span class="sparkline display-inline" data-sparkline-type="compositeline" data-sparkline-barcolor="#aafaaf" data-sparkline-linecolor="#ed1c24" data-sparkline-height="15px" data-sparkline-line-val="[6,4,7,8,4,3,2,2,5,6,7,4,1,5,7,9,9,8,7,6]" data-sparkline-bar-val="[4,1,5,7,9,9,8,7,6,6,4,7,8,4,3,2,2,5,6,7]"><canvas width="90" height="15" style="display: inline-block; width: 90px; height: 15px; vertical-align: top;"></canvas></span>
                                    and Composite Bar charts&nbsp;
                                    <span class="sparkline display-inline" data-sparkline-type="compositebar" data-sparkline-height="15px" data-sparkline-color-bottom="#57889C" data-sparkline-barcolor="#aafaaf" data-sparkline-line-width="1.5" data-sparkline-linecolor="#ed1c24" data-sparkline-line-val="[6,4,7,8,4,3,2,2,5,6,7,4,1,5,7,9,9,8,7,6]" data-sparkline-bar-val="[4,1,5,7,9,9,8,7,6,6,4,7,8,4]"><canvas width="55" height="15" style="display: inline-block; width: 55px; height: 15px; vertical-align: top;"></canvas></span>
                                    <p class="note">
                                            &lt;span data-sparkline-type="compositeline" data-sparkline-height="15px" data-sparkline-line-val="[9,8,7...]" data-sparkline-bar-val="[4,1,5...]"&gt;&lt;/span&gt;
                                    </p>

                                </li>
                                <li>
                                    Discrete bars &nbsp;&nbsp; <span class="sparkline txt-color-blue" data-sparkline-type="discrete" data-sparkline-height="18px" data-sparkline-width="30"><canvas width="30" height="18" style="display: inline-block; width: 30px; height: 18px; vertical-align: top;"></canvas></span> &nbsp;
                                    and with threshhold  &nbsp;
                                    <span class="sparkline txt-color-blue" data-sparkline-type="discrete" data-sparkline-height="18px" data-sparkline-width="30" data-sparkline-threshold="4"><canvas width="30" height="18" style="display: inline-block; width: 30px; height: 18px; vertical-align: top;"></canvas></span>
                                    <p class="note">
                                            &lt;span data-sparkline-type="discrete" data-sparkline-height="18px" data-sparkline-width="30" data-sparkline-threshold="4"&gt;4,6,7,...&lt;/span&gt;
                                    </p>
                                </li>
                            </ul>


                        </div>
                        <div class="col-sm-6">
                            <ul>
                                <li>
                                    Nifty Bar Charts &nbsp;&nbsp;
                                    <span class="sparkline txt-color-blue" data-sparkline-type="bar" data-sparkline-width="50px" data-sparkline-barwidth="3" data-sparkline-height="15px"><canvas width="28" height="15" style="display: inline-block; width: 28px; height: 15px; vertical-align: top;"></canvas></span> &nbsp;
                                    with negatives and thicker bars &nbsp;
                                    <span class="sparkline txt-color-blue" data-sparkline-type="bar" data-sparkline-width="50px" data-sparkline-barwidth="5" data-sparkline-height="18px"><canvas width="54" height="18" style="display: inline-block; width: 54px; height: 18px; vertical-align: top;"></canvas></span> and stacked bars &nbsp;
                                    <span class="sparkline txt-color-blue" data-sparkline-type="bar" data-sparkline-width="50px" data-sparkline-barwidth="5" data-sparkline-height="15px"><canvas width="33" height="15" style="display: inline-block; width: 33px; height: 15px; vertical-align: top;"></canvas></span>
                                    <p class="note">
                                            &lt;span data-sparkline-type="bar" data-sparkline-width="50px" data-sparkline-bar data-sparkline-height="15px"&gt;50,40,70,...&lt;/span&gt;
                                    </p>
                                </li>
                                <li>
                                    Box plots&nbsp;
                                    <span class="sparkline display-inline" data-sparkline-type="bullet" data-sparkline-height="14px" data-sparkline-bulletrange-color="[&quot;#CCD7DB&quot;, &quot;#92A2A8&quot;, &quot;#57889C&quot;]" data-sparkline-performance-color="#A4CBDB" data-sparkline-bullet-color="#143644"><canvas width="52" height="14" style="display: inline-block; width: 52px; height: 14px; vertical-align: top;"></canvas></span>
                                        &nbsp; and bullet plots &nbsp;
                                    <span class="sparkline display-inline" data-sparkline-type="box" data-sparkline-height="14px"><canvas width="52" height="14" style="display: inline-block; width: 52px; height: 14px; vertical-align: top;"></canvas></span>



                                    <p class="note">
                                            &lt;span data-sparkline-type="compositebar" data-sparkline-line-width="1.5" data-sparkline-line-val="[6,4,7...]" data-sparkline-bar-val="[4,1,5...]"&gt;&lt;/span&gt;
                                    </p>
                                </li>
                                <li>
                                    Pie Charts &nbsp; <span class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-offset="90" data-sparkline-piesize="18px"><canvas width="18" height="18" style="display: inline-block; width: 18px; height: 18px; vertical-align: top;"></canvas></span>
                                    <p class="note">
                                            &lt;span data-sparkline-type="pie" data-sparkline-offset="90" data-sparkline-piesize="18px"&gt;3,5,2&lt;/span&gt;
                                    </p>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <div class="row">
                        <h2 class="row-seperator-header"><small>Examples below are done <strong>without</strong> any javascript!</small></h2>
                        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                            <div class="well well-sm well-light">
                                <h4 class="txt-color-blue">Pie <span class="semi-bold">Chart</span> <a href="javascript:void(0);" class="pull-right"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="text-center">
                                    <div class="sparkline txt-color-blue display-inline" data-sparkline-type="pie" data-sparkline-offset="90" data-sparkline-piesize="75px"><canvas width="75" height="75" style="display: inline-block; width: 75px; height: 75px; vertical-align: top;"></canvas></div>
                                    <div class="sparkline txt-color-blue display-inline" data-sparkline-type="pie" data-sparkline-offset="90" data-sparkline-piesize="75px"><canvas width="75" height="75" style="display: inline-block; width: 75px; height: 75px; vertical-align: top;"></canvas></div>
                                </div>

                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                            <div class="well well-sm well-light padding-10">
                                <h4 class="txt-color-green">Composite <span class="semi-bold">Chart</span> <a href="javascript:void(0);" class="pull-right txt-color-green"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="sparkline" data-sparkline-type="compositeline" data-sparkline-spotradius-top="5" data-sparkline-color-top="#3a6965" data-sparkline-line-width-top="3" data-sparkline-color-bottom="#2b5c59" data-sparkline-spot-color="#2b5c59" data-sparkline-minspot-color-top="#97bfbf" data-sparkline-maxspot-color-top="#c2cccc" data-sparkline-highlightline-color-top="#cce8e4" data-sparkline-highlightspot-color-top="#9dbdb9" data-sparkline-width="96%" data-sparkline-height="78px" data-sparkline-line-val="[6,4,7,8,4,3,2,2,5,6,7,4,1,5,7,9,9,8,7,6]" data-sparkline-bar-val="[4,1,5,7,9,9,8,7,6,6,4,7,8,4,3,2,2,5,6,7]"><canvas width="200" height="78" style="display: inline-block; width: 200px; height: 78px; vertical-align: top;"></canvas></div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                            <div class="well well-sm well-light">
                                <h4 class="txt-color-blueLight">Bar <span class="semi-bold">Chart</span> <a href="javascript:void(0);" class="pull-right txt-color-blueLight"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="sparkline txt-color-blueLight text-center" data-sparkline-type="bar" data-sparkline-width="96%" data-sparkline-barwidth="11" data-sparkline-barspacing="5" data-sparkline-height="80px"><canvas width="219" height="80" style="display: inline-block; width: 219px; height: 80px; vertical-align: top;"></canvas></div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                            <div class="well well-sm well-light">
                                <h4 class="txt-color-blueLight">Bar <span class="semi-bold">Stacked Chart</span> <a href="javascript:void(0);" class="pull-right txt-color-blueLight"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="sparkline txt-color-blue text-center" data-sparkline-type="bar" data-sparkline-width="96%" data-sparkline-barwidth="11" data-sparkline-barspacing="5" data-sparkline-barstacked-color="[&quot;#92A2A8&quot;, &quot;#4493B1&quot;]" data-sparkline-height="80px"><canvas width="219" height="80" style="display: inline-block; width: 219px; height: 80px; vertical-align: top;"></canvas></div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                            <div class="well padding-10">
                                <h4 class="txt-color-blue">Composite Line with fills <a href="javascript:void(0);" class="pull-right txt-color-white"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="sparkline txt-color-darken" data-sparkline-line-val="[3,2,3,4,3,2,4,2,3]" data-sparkline-bar-val="[5,3,3,1,5,3,2,2,3]" data-sparkline-type="compositeline" data-sparkline-line-width="1" data-sparkline-width="100%" data-sparkline-height="180px" data-sparkline-fillcolor-top="rgba(87, 136, 156, 0.30)" data-sparkline-fillcolor-bottom="rgba(0, 141, 214, 0.10)" data-sparkline-color-top="#fff" data-sparkline-color-bottom="#fff" data-sparkline-spotradius-top="4" data-data-sparkline-bar-val-spots-top="[5,3,3,1,4,3,2,2,3]" data-sparkline-bar-val-spots-bottom="[3,2,3,4,3,2,4,1,3]" data-sparkline-minspot-color-top="#d1dade" data-sparkline-minspot-color-bottom="#167db2" data-sparkline-maxspot-color-top="#d1dade" data-sparkline-maxspot-color-bottom="#167db2" data-sparkline-highlightspot-color-top="#d1dade" data-sparkline-highlightspot-color-bottom="#8fcded" data-sparkline-highlightline-color-top="#bec6ca" data-sparkline-highlightline-color-bottom="#bec6ca"><canvas width="464" height="180" style="display: inline-block; width: 464px; height: 180px; vertical-align: top;"></canvas></div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
                            <div class="well padding-10">
                                <h4 class="txt-color-teal">Line chart variation <a href="javascript:void(0);" class="pull-right txt-color-white"><i class="fa fa-refresh"></i></a></h4>
                                <br>
                                <div class="sparkline" data-sparkline-type="line" data-fill-color="#e6f6f5" data-sparkline-line-color="#0aa699" data-sparkline-spotradius="5" data-sparkline-width="100%" data-sparkline-height="180px"><canvas width="464" height="180" style="display: inline-block; width: 464px; height: 180px; vertical-align: top;"></canvas></div>
                                <h4 class="air air-top-right padding-10 font-xl txt-color-teal">+ 39.<small class="ultra-light txt-color-teal">57 <i class="fa fa-caret-up fa-lg"></i></small></h4>
                                <h5 class="air air-bottom-left padding-10 font-md text-danger">-12.<small class="ultra-light text-danger">45 <i class="fa fa-caret-down fa-lg"></i></small></h5>
                            </div>

                        </div>
                    </div>

                </div>

            </div>

            <div class="col-sm-12">

                <div class="well">
                    <h1>Easy <span class="semi-bold">Pie Charts</span> <small>Simplified for faster production</small></h1>
                    <p>Easy Pie Charts gives you a nice animation twist to your pie charts - they are also dynamic, which will make it a really nice ajax based live charts for your project</p>
                    <p class="note">&lt;div class="easy-pie-chart txt-color-blue easyPieChart" data-percent="36" data-size="180"&gt; data-pie-size="50"&gt;
                        &lt;span class="percent percent-sign txt-color-blue font-xl semi-bold"&gt;36&lt;/span&gt;
                        &lt;/div&gt;</p>
                    <ul class="list-inline">
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-red easyPieChart" data-percent="50" data-size="180" data-pie-size="50" style="width: 180px; height: 180px; line-height: 180px;">
                                <span class="percent percent-sign txt-color-red font-xl semi-bold">49</span>
                                <canvas width="180" height="180"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-blue easyPieChart" data-percent="36" data-pie-size="180" style="width: 180px; height: 180px; line-height: 180px;">
                                <span class="percent percent-sign txt-color-blue font-xl semi-bold">35</span>
                                <canvas width="180" height="180"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-pinkDark easyPieChart" data-percent="46" data-pie-size="160" style="width: 160px; height: 160px; line-height: 160px;">
                                <span class="percent percent-sign txt-color-pinkDark font-lg semi-bold">45</span>
                                <canvas width="160" height="160"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-greenLight easyPieChart" data-percent="56" data-pie-size="110" style="width: 110px; height: 110px; line-height: 110px;">
                                <span class="percent percent-sign txt-color-greenLight font-md">55</span>
                                <canvas width="110" height="110"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-orange easyPieChart" data-percent="66" data-pie-size="60" style="width: 60px; height: 60px; line-height: 60px;">
                                <span class="percent percent-sign txt-color-orange">65</span>
                                <canvas width="60" height="60"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-darken easyPieChart" data-percent="76" data-pie-size="45" style"""),
format.raw("""="width: 45px; height: 45px; line-height: 45px;">
                                <span class="percent percent-sign font-sm">75</span>
                                <canvas width="45" height="45"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                        <li>&nbsp;&nbsp;&nbsp;
                            <div class="easy-pie-chart txt-color-blue easyPieChart" data-percent="86" data-pie-size="35" style="width: 35px; height: 35px; line-height: 35px;">
                                <span class="percent percent-sign font-xs">85</span>
                                <canvas width="35" height="35"></canvas></div>
                                &nbsp;&nbsp;&nbsp;
                        </li>
                    </ul>

                </div>

            </div>
        </div>

            <!-- end row -->

            <!-- row -->

        <div class="row">


        </div>

            <!-- end row -->
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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/inline_charts.scala.html
                  HASH: 0584572537da89466cb3687861a0d8947f26c45d
                  MATRIX: 518->1|606->20|620->27|700->31|732->37|1132->409|1161->410|1190->411|1235->428|1264->429|1860->997|1889->998|1922->1004|1964->1019|1992->1020|2025->1026|2180->1153|2209->1154|2242->1160|2326->1217|2354->1218|2387->1224|2581->1390|2610->1391|2643->1397|2671->1398|2807->18|2835->1495|2863->1497|2893->1518|2933->1520|2965->1525
                  LINES: 19->1|21->2|21->2|23->2|25->4|38->17|38->17|38->17|38->17|38->17|63->42|63->42|64->43|65->44|65->44|66->45|69->48|69->48|70->49|71->50|71->50|72->51|82->61|82->61|84->63|84->63|94->1|95->72|96->73|96->73|96->73|97->74
                  -- GENERATED --
              */
          