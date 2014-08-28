
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
object grid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><style>
    .show-grid [class^="col-"] """),format.raw/*5.32*/("""{"""),format.raw/*5.33*/("""
    """),format.raw/*6.5*/("""padding-top: 10px;
    padding-bottom: 10px;
    background-color: rgba(61, 106, 124, 0.15);
    border: 1px solid rgba(61, 106, 124, 0.2);
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""

    """),format.raw/*12.5*/(""".show-grid """),format.raw/*12.16*/("""{"""),format.raw/*12.17*/("""
    """),format.raw/*13.5*/("""margin-bottom: 15px;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""th small """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/("""
    """),format.raw/*17.5*/("""font-size:12px;
    display:block;
    color:#8D8D8D;
    font-weight:normal;
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""

    """),format.raw/*23.5*/("""/*
     * Responsive tests
     *
     * Generate a set of tests to show the responsive utilities in action.
     */

    /* Responsive (scrollable) doc tables */
    .table-responsive .highlight pre """),format.raw/*30.38*/("""{"""),format.raw/*30.39*/("""
    """),format.raw/*31.5*/("""white-space: normal;
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""

    """),format.raw/*34.5*/("""/* Utility classes table  */
    .bs-table th small,
    .responsive-utilities th small """),format.raw/*36.36*/("""{"""),format.raw/*36.37*/("""
    """),format.raw/*37.5*/("""display: block;
    font-weight: normal;
    color: #999;
    font-size:12px;
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""
    """),format.raw/*42.5*/(""".responsive-utilities tbody th """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
    """),format.raw/*43.5*/("""font-weight: normal;
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""
    """),format.raw/*45.5*/(""".responsive-utilities td """),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""
    """),format.raw/*46.5*/("""text-align: center;
    """),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""
    """),format.raw/*48.5*/(""".responsive-utilities td.is-visible """),format.raw/*48.41*/("""{"""),format.raw/*48.42*/("""
    """),format.raw/*49.5*/("""color: rgba(61, 106, 124, 1);
    background-color: rgba(61, 106, 124, 0.07) !important;
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""
    """),format.raw/*52.5*/(""".responsive-utilities td.is-hidden """),format.raw/*52.40*/("""{"""),format.raw/*52.41*/("""
    """),format.raw/*53.5*/("""color: #ccc;
    background-color: #f9f9f9 !important;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""/* Responsive tests */
    .responsive-utilities-test """),format.raw/*58.32*/("""{"""),format.raw/*58.33*/("""
    """),format.raw/*59.5*/("""margin-top: 5px;
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""
    """),format.raw/*61.5*/(""".responsive-utilities-test .col-xs-6 """),format.raw/*61.42*/("""{"""),format.raw/*61.43*/("""
    """),format.raw/*62.5*/("""margin-bottom: 10px;
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
    """),format.raw/*64.5*/(""".responsive-utilities-test span """),format.raw/*64.37*/("""{"""),format.raw/*64.38*/("""
    """),format.raw/*65.5*/("""padding: 15px 10px;
    font-size: 14px;
    font-weight: bold;
    line-height: 1.1;
    text-align: center;
    border-radius: 4px;
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
    """),format.raw/*72.5*/(""".visible-on .col-xs-6 .hidden-xs,
    .visible-on .col-xs-6 .hidden-sm,
    .visible-on .col-xs-6 .hidden-md,
    .visible-on .col-xs-6 .hidden-lg,
    .hidden-on .col-xs-6 .visible-xs,
    .hidden-on .col-xs-6 .visible-sm,
    .hidden-on .col-xs-6 .visible-md,
    .hidden-on .col-xs-6 .visible-lg """),format.raw/*79.38*/("""{"""),format.raw/*79.39*/("""
    """),format.raw/*80.5*/("""color: #999;
    border: 1px solid #ddd;
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""
    """),format.raw/*83.5*/(""".visible-on .col-xs-6 .visible-xs,
    .visible-on .col-xs-6 .visible-sm,
    .visible-on .col-xs-6 .visible-md,
    .visible-on .col-xs-6 .visible-lg,
    .hidden-on .col-xs-6 .hidden-xs,
    .hidden-on .col-xs-6 .hidden-sm,
    .hidden-on .col-xs-6 .hidden-md,
    .hidden-on .col-xs-6 .hidden-lg """),format.raw/*90.37*/("""{"""),format.raw/*90.38*/("""
    """),format.raw/*91.5*/("""color: #468847;
    background-color: #dff0d8;
    border: 1px solid #d6e9c6;
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
    """),format.raw/*95.5*/("""</style>

        <div class="well">
            <h1>Grid options</h1>
            <p>
                See how aspects of the Bootstrap grid system work across multiple devices with a handy table.
                <br>
                <br>
            </p>

            <div class="row">

                <div class="col-sm-3">

                    <img src="img/demo/responseimg.png" style="max-width:300px; width:100%;">
                    <p>
                        <br>
                    </p><h3>BuiltWith Bootstrap</h3>
                    Bootstrap is made to not only look and behave great in the latest desktop browsers,
                    but in tablet and smartphone browsers too. It’s packed with great features. Such as the 12-column responsive mobile first grid,
                    dozens of components, plugins and more!
                    <p></p>
                </div>
                <div class="col-sm-9">
                    <div class="table-responsive">

                        <table class="table table-bordered table-striped">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th> Extra small devices <small>Phones (&lt;768px)</small></th>
                                    <th> Small devices <small>Tablets (≥768px)</small></th>
                                    <th> Medium devices <small>Desktops (≥992px)</small></th>
                                    <th> Large devices <small>Desktops (≥1200px)</small></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>Grid behavior</th>
                                    <td>Horizontal at all times</td>
                                    <td colspan="3">Collapsed to start, horizontal above breakpoints</td>
                                </tr>
                                <tr>
                                    <th>Max container width</th>
                                    <td>None (auto)</td>
                                    <td>750px</td>
                                    <td>970px</td>
                                    <td>1170px</td>
                                </tr>
                                <tr>
                                    <th>Class prefix</th>
                                    <td>
                                        <code>
                                            .col-xs-
                                        </code></td>
                                    <td>
                                        <code>
                                            .col-sm-
                                        </code></td>
                                    <td>
                                        <code>
                                            .col-md-
                                        </code></td>
                                    <td>
                                        <code>
                                            .col-lg-
                                        </code></td>
                                </tr>
                                <tr>
                                    <th># of columns</th>
                                    <td colspan="4">12</td>
                                </tr>
                                <tr>
                                    <th>Max column width</th>
                                    <td class="text-muted">Auto</td>
                                    <td>60px</td>
                                    <td>78px</td>
                                    <td>95px</td>
                                </tr>
                                <tr>
                                    <th>Gutter width</th>
                                    <td colspan="4">30px (15px on each side of a column)</td>
                                </tr>
                                <tr>
                                    <th>Nestable</th>
                                    <td colspan="4">Yes</td>
                                </tr>
                                <tr>
                                    <th>Offsets</th>
                                    <td colspan="1" class="text-muted">N/A</td>
                                    <td colspan="3">Yes</td>
                                </tr>
                                <tr>
                                    <th>Column ordering</th>
                                    <td class="text-muted">N/A</td>
                                    <td colspan="3">Yes</td>
                                </tr>
                            </tbody>
                        </table>

                    </div>
                </div>

            </div>


        </div>

        <h6>Example: Stacked-to-horizontal</h6>
        <p>
            Using a single set of <code>
            .col-md-*</code>
            grid classes, you can create a basic grid system that starts out stacked on mobile devices and tablet devices (the extra small to small range) before becoming horizontal on desktop (medium) devices.
        </p>

        <div class="well">

            <div class="row show-grid">
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
                <div class="col-md-1">
                    .col-md-1
                </div>
            </div>

            <div class="row show-grid">
                <div class="col-md-8">
                    .col-md-8
                </div>
                <div class="col-md-4">
                    .col-md-4
                </div>
            </div>

            <div class="row show-grid">
                <div class="col-md-4">
                    .col-md-4
                </div>
                <div class="col-md-4">
                    .col-md-4
                </div>
                <div class="col-md-4">
                    .col-md-4
                </div>
            </div>

            <div class="row show-grid">
                <div class="col-md-6">
                    .col-md-6
                </div>
                <div class="col-md-6">
                    .col-md-6
                </div>
            </div>

        </div>

        <h6>Example: Mobile and desktop</h6>
        <p>Don't want your columns to simply stack in smaller devices? Use the extra small and medium device grid classes by adding <code>.col-xs-*</code> <code>.col-md-*</code> to your columns. See the example below for a better idea of how it all works.</p>

        <div class="well">

            <div class="row show-grid">
                <div class="col-xs-12 col-md-8">.col-xs-12 col-md-8</div>
                <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
            </div>

            <div class="row show-grid">
                <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
                <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
                <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
            </div>

            <div class="row show-grid">
                <div class="col-xs-6">.col-xs-6</div>
                <div class="col-xs-6">.col-xs-6</div>
            </div>

        </div>

        <h6>Example: Mobile, tablet, desktops</h6>
        <p>Build on the previous example by creating even more dynamic and powerful layouts with tablet <code>.col-sm-*</code> classes.</p>

        <div class="well">
            <div class="row show-grid">
                <div class="col-xs-12 col-sm-6 col-md-8">.col-xs-12 .col-sm-6 .col-md-8</div>
                <div class="col-xs-6 col-sm-6 col-md-4">.col-xs-6 .col-sm-6 .col-md-4</div>
            </div>

            <div class="row show-grid">
                <div class="col-xs-6 col-sm-4 col-md-4">.col-xs-6 .col-sm-4 .col-md-4</div>
                <div class="col-xs-6 col-sm-4 col-md-4">.col-xs-6 .col-sm-4 .col-md-4</div>
                    <!-- Optional: clear the XS cols if their content doesn't match in height -->
                <div class="clearfix visible-xs"></div>
                <div class="col-xs-6 col-sm-4 col-md-4">.col-xs-6 .col-sm-4 .col-md-4</div>
            </div>
        </div>

        <h6>Offsetting columns</h6>
        <p>Move columns to the right using <code>.col-md-offset-*</code> classes. These classes increase the left margin of a column by <code>*</code> columns. For example, <code>.col-md-offset-4</code> moves <code>.col-md-4</code> over four columns.</p>

        <div class="well">

            <div class="row show-grid">
                <div class="col-md-4">.col-md-4</div>
                <div class="col-md-4 col-md-offset-4">.col-md-4 .col-md-offset-4</div>
            </div>

            <div class="row show-grid">
                <div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
                <div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
            </div>

            <div class="row show-grid">
                <div class="col-md-6 col-md-offset-3">.col-md-6 .col-md-offset-3</div>
            </div>

        </div>

        <h6>Nesting columns</h6>
        <p>To nest your content with the default grid, add a new <code>.row</code> and set of <code>.col-md-*</code> columns within an existing <code>.col-md-*</code> column. Nested rows should include a set of columns that add up to 12.</p>

        <div class="well">

            <div class="row show-grid">
                <div class="col-md-12">
                    Level 1: .col-md-12
                    <div class="row show-grid">
                        <div class="col-md-6">
                            Level 2: .col-md-6
                        </div>
                        <div class="col-md-6">
                            Level 2: .col-md-6
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <hr class="simple">

        <div class="well">

            <h1>Responsive utilities</h1>

            <p class="alert alert-info">
                <strong>
                    For faster mobile-friendly development, use these utility classes for showing and hiding content by device via media query. Also included are utility classes for toggling content when printed.
                </strong>
            </p>

            <p>Try to use these on a limited basis and avoid creating entirely different versions of the same site. Instead, use them to complement each device's presentation. <strong>Responsive utilities are currently only available for block and table toggling.</strong> Use with inline and table elements is currently not supported.</p>


            <h3>Available classes</h3>

            <p>Use a single or combination of the available classes for toggling content across viewport breakpoints.</p>

            <div class="table-responsive">

                <table class="table table-bordered table-striped responsive-utilities">
                    <thead>
                        <tr>
                            <th></th>
                            <th>
                                Extra small devices
                                <small>Phones (&lt;768px)</small>
                            </th>
                            <th>
                                Small devices
                                <small>Tablets (≥768px)</small>
                            </th>
                            <th>
                                Medium devices
                                <small>Desktops (≥992px)</small>
                            </th>
                            <th>
                                Large devices
                                <small>Desktops (≥1200px)</small>
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th><code>.visible-xs</code></th>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                        </tr>
                        <tr>
                            <th><code>.visible-sm</code></th>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                        </tr>
                        <tr>
                            <th><code>.visible-md</code></th>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                        </tr>
                        <tr>
                            <th><code>.visible-lg</code></th>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                        </tr>
                    </tbody>
                    <tbody>
                        <tr>
                            <th><code>.hidden-xs</code></th>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                        </tr>
                        <tr>
                            <th><code>.hidden-sm</code></th>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                        </tr>
                        <tr>
                            <th><code>.hidden-md</code></th>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                            <td class="is-visible">Visible</td>
                        </tr>
                        <tr>
                            <th><code>.hidden-lg</code></th>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-visible">Visible</td>
                            <td class="is-hidden">Hidden</td>
                        </tr>
                    </tbody>
                </table>

            </div>

        </div>

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->


                <!-- end row -->

                <!-- row -->

            <div class="row">

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
         * $("[rel=popover-hover]").popover("""),format.raw/*506.45*/("""{"""),format.raw/*506.46*/(""" """),format.raw/*506.47*/("""trigger: "hover" """),format.raw/*506.64*/("""}"""),format.raw/*506.65*/(""");
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

        var pagefunction = function() """),format.raw/*531.39*/("""{"""),format.raw/*531.40*/("""

        """),format.raw/*533.9*/("""}"""),format.raw/*533.10*/(""";

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/grid.scala.html
                  HASH: 6352a3774100d46aab36497b5079db2bb7ee76eb
                  MATRIX: 509->1|614->18|642->21|663->34|702->36|733->41|837->118|865->119|896->124|1067->268|1095->269|1128->275|1167->286|1196->287|1228->292|1280->317|1308->318|1341->324|1378->333|1407->334|1439->339|1548->421|1576->422|1609->428|1837->628|1866->629|1898->634|1950->659|1978->660|2011->666|2127->754|2156->755|2188->760|2297->842|2325->843|2357->848|2416->879|2445->880|2477->885|2529->910|2557->911|2589->916|2642->941|2671->942|2703->947|2754->971|2782->972|2814->977|2878->1013|2907->1014|2939->1019|3059->1112|3087->1113|3119->1118|3182->1153|3211->1154|3243->1159|3329->1218|3357->1219|3390->1225|3472->1279|3501->1280|3533->1285|3581->1306|3609->1307|3641->1312|3706->1349|3735->1350|3767->1355|3819->1380|3847->1381|3879->1386|3939->1418|3968->1419|4000->1424|4165->1562|4193->1563|4225->1568|4552->1867|4581->1868|4613->1873|4685->1918|4713->1919|4745->1924|5072->2223|5101->2224|5133->2229|5242->2311|5270->2312|5302->2317|22145->19131|22175->19132|22205->19133|22251->19150|22281->19151|22908->19749|22938->19750|22976->19760|23006->19761
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|31->10|31->10|33->12|33->12|33->12|34->13|35->14|35->14|37->16|37->16|37->16|38->17|42->21|42->21|44->23|51->30|51->30|52->31|53->32|53->32|55->34|57->36|57->36|58->37|62->41|62->41|63->42|63->42|63->42|64->43|65->44|65->44|66->45|66->45|66->45|67->46|68->47|68->47|69->48|69->48|69->48|70->49|72->51|72->51|73->52|73->52|73->52|74->53|76->55|76->55|78->57|79->58|79->58|80->59|81->60|81->60|82->61|82->61|82->61|83->62|84->63|84->63|85->64|85->64|85->64|86->65|92->71|92->71|93->72|100->79|100->79|101->80|103->82|103->82|104->83|111->90|111->90|112->91|115->94|115->94|116->95|527->506|527->506|527->506|527->506|527->506|552->531|552->531|554->533|554->533
                  -- GENERATED --
              */
          