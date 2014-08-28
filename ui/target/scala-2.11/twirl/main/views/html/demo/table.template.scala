
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
object table extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
     * $("[rel=popover-hover]").popover("""),format.raw/*16.41*/("""{"""),format.raw/*16.42*/(""" """),format.raw/*16.43*/("""trigger: "hover" """),format.raw/*16.60*/("""}"""),format.raw/*16.61*/(""");
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
     * var pagefunction = function() """),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
     """),format.raw/*42.6*/("""*   ...
     * """),format.raw/*43.8*/("""}"""),format.raw/*43.9*/("""
     """),format.raw/*44.6*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
     *
     * TO LOAD A SCRIPT:
     * var pagefunction = function ()"""),format.raw/*47.38*/("""{"""),format.raw/*47.39*/("""
     """),format.raw/*48.6*/("""*  loadScript(".../plugin.js", run_after_loaded);
     * """),format.raw/*49.8*/("""}"""),format.raw/*49.9*/("""
     """),format.raw/*50.6*/("""*
     * OR
     *
     * loadScript(".../plugin.js", run_after_loaded);
     */

    // PAGE RELATED SCRIPTS

    // pagefunction

    var pagefunction = function() """),format.raw/*60.35*/("""{"""),format.raw/*60.36*/("""

    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""";

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
                <i class="fa fa-table fa-fw "></i>
                Table
                <span>&gt;
                    Normal Tables
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
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-0" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Normal Table</h2>

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
                                <p>Adds borders to any table row within <code>&lt;table&gt;</code> by adding the <code>.table-bordered</code> with the base class</p>

                                <div class="table-responsive">

                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
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
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-1" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>No Padding</h2>
                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <div class="alert alert-info no-margin fade in">
                                    <button class="close" data-dismiss="alert">
                                        ×
                                    </button>
                                    <i class="fa-fw fa fa-info"></i>
                                    Adds zebra-striping to table row within <code>&lt;table&gt;</code> by adding the <code>.table-striped</code> with the base class
                                </div>
                                <div class="table-responsive">

                                    <table class="table table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                                <th>Column name</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
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

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-greenDark" id="wid-id-2" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Table hover states </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <div class="alert alert-info no-margin fade in">
                                    <button class="close" data-dismiss="alert">
                                        ×
                                    </button>
                                    <i class="fa-fw fa fa-info"></i>
                                    Enables hover effect <code>&lt;table&gt;</code> by adding the <code>.table-hover</code> with the base class
                                </div>
                                <div class="table-responsive">

                                    <table class="table table-hover">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>First Name</th>
                                                <th>Last Name</th>
                                                <th>Username</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>Mark</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
                                            </tr>
                                            <tr>
                                                <td>2</td>
                                                <td>Jacob</td>
                                                <td>Thornton</td>
                                                <td>@fat</td>
                                            </tr>
                                            <tr>
                                                <td>3</td>
                                                <td>Larry</td>
                                                <td>the Bird</td>
                                                <td>@twitter</td>
                                            </tr>
                                            <tr>
                                                <td>4</td>
                                                <td>Wise</td>
                                                <td>Man</td>
                                                <td>@myorange</td>
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

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-greenLight" id="wid-id-3" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Table TR with colors </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <div class="alert alert-info no-margin fade in">
                                    <button class="close" data-dismiss="alert">
                                        ×
                                    </button>
                                    <i class="fa-fw fa fa-info"></i>
                                    Add custom colors to your TR and TD <code>&lt;tr&gt;</code> by adding <code>.success</code>, <code>.danger</code>, <code>.warning</code> and <code>.info</code> respectively
                                </div>
                                <div class="table-responsive">

                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th> <i class="fa fa-building"></i> Product</th>
                                                <th> <i class="fa fa-calendar"></i> Payment Taken</th>
                                                <th> <i class="glyphicon glyphicon-send"></i> Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="success">
                                                <td>1</td>
                                                <td>TB - Monthly</td>
                                                <td>01/04/2012</td>
                                                <td>Approved</td>
                                            </tr>
                                            <tr class="danger">
                                                <td>2</td>
                                                <td>TB - Monthly</td>
                                                <td>02/04/2012</td>
                                                <td>Declined</td>
                                            </tr>
                                            <tr class="warning">
                                                <td>3</td>
                                                <td>TB - Monthly</td>
                                                <td>03/04/2012</td>
                                                <td>Pending</td>"""),
format.raw("""
                                            </tr>
                                            <tr class="info">
                                                <td>4</td>
                                                <td>TB - Monthly</td>
                                                <td>04/04/2012</td>
                                                <td>Call in to confirm</td>
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

            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-4" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Condenced table + combined prev. classes </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">
                                <div class="alert alert-warning no-margin fade in">
                                    <button class="close" data-dismiss="alert">
                                        ×
                                    </button>
                                    <i class="fa-fw fa fa-info"></i>
                                    A combined table effect with all classes mentioned above added to <code>&lt;table&gt;</code>. <code> .table-bordered .table-striped .table-condensed .table-hover .smart-form .has-tickbox </code>
                                </div>

                                <div class="table-responsive">

                                    <table class="table table-bordered table-striped table-condensed table-hover smart-form has-tickbox">
                                        <thead>
                                            <tr>
                                                <th>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </th>
                                                <th>Column name <a href="javascript:void(0);" class="btn btn-xs btn-default pull-right"><i class="fa fa-filter"></i></a> </th>
                                                <th>Column name <a href="javascript:void(0);" class="btn btn-xs btn-default pull-right"><i class="fa fa-filter"></i></a></th>
                                                <th>Column name <a href="javascript:void(0);" class="btn btn-xs btn-default pull-right"><i class="fa fa-filter"></i></a></th>
                                                <th>Column name <a href="javascript:void(0);" class="btn btn-xs btn-default pull-right"><i class="fa fa-filter"></i></a></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <label class="checkbox">
                                                        <input type="checkbox" name="checkbox-inline">
                                                        <i></i>
                                                    </label>
                                                </td>
                                                <td>Row 1</td>
                                                <td>Row 2</td>
                                                <td>Row 3</td>
                                                <td>Row 4</td>
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

            </div>

                <!-- end row -->

        </section>
            <!-- end widget grid -->
   </div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:57 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/table.scala.html
                  HASH: a56a8c98ab1df2cba96a3c0cdebb6c0b3e676ddf
                  MATRIX: 510->1|598->20|612->27|692->31|724->37|1123->408|1152->409|1181->410|1226->427|1255->428|1851->996|1880->997|1913->1003|1955->1018|1983->1019|2016->1025|2171->1152|2200->1153|2233->1159|2317->1216|2345->1217|2378->1223|2572->1389|2601->1390|2634->1396|2662->1397|2799->18|2827->1495|2855->1497|2885->1518|2925->1520|2957->1525
                  LINES: 19->1|21->2|21->2|23->2|25->4|37->16|37->16|37->16|37->16|37->16|62->41|62->41|63->42|64->43|64->43|65->44|68->47|68->47|69->48|70->49|70->49|71->50|81->60|81->60|83->62|83->62|94->1|95->72|96->73|96->73|96->73|97->74
                  -- GENERATED --
              */
          