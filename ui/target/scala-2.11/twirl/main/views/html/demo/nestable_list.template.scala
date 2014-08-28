
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
object nestable_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                    Nestable Lists
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
                <article class="col-sm-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well" id="wid-id-0">
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
                            <span class="widget-icon"> <i class="fa fa-comments"></i> </span>
                            <h2>My Data </h2>

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

                                <div id="nestable-menu">
                                    <button type="button" class="btn btn-default" data-action="expand-all">
                                        Expand All
                                    </button>
                                    <button type="button" class="btn btn-default" data-action="collapse-all">
                                        Collapse All
                                    </button>
                                </div>
                                <div class="row">

                                    <div class="col-sm-6 col-lg-4">

                                        <h6>Nestable List #1</h6>

                                        <div class="dd" id="nestable">
                                            <ol class="dd-list">
                                                <li class="dd-item" data-id="1">
                                                    <div class="dd-handle">
                                                        Item 1 <span>- Description Field</span>
                                                    </div>
                                                </li>
                                                <li class="dd-item" data-id="2"><button data-action="collapse" type="button">Collapse</button><button data-action="expand" type="button" style="display: none;">Expand</button>
                                                    <div class="dd-handle">
                                                        <h4><span class="semi-bold">Item 2 </span> - Big Header</h4>
                                                        <span>Description with piechart</span>
                                                        <span class="air air-top-right padding-7">
                                                            <div class="easy-pie-chart text-danger easyPieChart" data-percent="33" data-pie-size="40" data-pie-track-color="rgba(169, 3, 41,0.07)" style="width: 40px; height: 40px; line-height: 40px;">
                                                                <span class="percent percent-sign txt-color-red font-xs">32</span>
                                                                <canvas width="40" height="40"></canvas></div>
                                                        </span>

                                                    </div>
                                                    <ol class="dd-list">
                                                        <li class="dd-item" data-id="3">
                                                            <div class="dd-handle">
                                                                Item 3
                                                            </div>
                                                        </li>
                                                        <li class="dd-item" data-id="4">
                                                            <div class="dd-handle">
                                                                Item 4
                                                                <em class="label pull-right label-primary">
                                                                    Label ID
                                                                </em>
                                                            </div>
                                                        </li>
                                                        <li class="dd-item" data-id="5"><button data-action="collapse" type="button">Collapse</button><button data-action="expand" type="button" style="display: none;">Expand</button>
                                                            <div class="dd-handle">
                                                                Item 5

                                                            </div>
                                                            <ol class="dd-list">
                                                                <li class="dd-item" data-id="6">
                                                                    <div class="dd-handle bg-color-blue txt-color-white">
                                                                        <i>Item 6 (italic)</i>
                                                                    </div>
                                                                </li>
                                                                <li class="dd-item" data-id="7">
                                                                    <div class="dd-handle bg-color-pink txt-color-white">
                                                                        <strong>Item 7 (bold)</strong>
                                                                    </div>
                                                                </li>
                                                                <li class="dd-item" data-id="8">
                                                                    <div class="dd-handle bg-color-greenLight txt-color-white">
                                                                        <strong><i>Item 8 (Bold + Italic)</i></strong>
                                                                    </div>
                                                                </li>
                                                            </ol>
                                                        </li>
                                                        <li class="dd-item" data-id="9">
                                                            <div class="dd-handle">
                                                                Item 9

                                                                <em class="badge pull-right bg-color-purple">
                                                                    99
                                                                </em>
                                                            </div>
                                                        </li>
                                                        <li class="dd-item" data-id="10">
                                                            <div class="dd-handle">
                                                                Item 10
                                                            </div>
                                                        </li>
                                                    </ol>
                                                </li>
                                                <li class="dd-item" data-id="11">
                                                    <div class="dd-handle">

                                                        <div class="row">
                                                            <div class="col-xs-8">
                                                                Item 11
                                                                <span class="font-xs text-muted">
                                                                    - with progress bar
                                                                </span>
                                                            </div>
                                                            <div class="col-xs-4">
                                                                <div class="progress progress-striped active no-margin">
                                                                    <div class="progress-bar progress-bar-primary" role="progressbar" style="width: 37%">37%</div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </li>
                                                <li class="dd-item" data-id="12">
                                                    <div class="dd-handle">

                                                        <div class="row">
                                                            <div class="col-xs-8 text-success">
                                                                <strong>Item 12 </strong>
                                                                <span class="font-xs text-muted">
                                                                    - success text
                                                                </span>
                                                            </div>
                                                            <div class="col-xs-4">
                                                                <div class="progress progress-striped active no-margin">
                                                                    <div class="progress-bar progress-bar-success" role="progressbar" style="width: 85%">85%</div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </li>
                                            </ol>
                                        </div>

                                    </div>

                                    <div class="col-sm-6 col-lg-4">

                                        <h6>Nestable List #2</h6>

                                        <div class="dd" id="nestable2">
                                            <ol class="dd-list">
                                                <li class="dd-item" data-id="13">
                                                    <div class="dd-handle">
                                                        Item 13

                                                        <em class="pull-right badge bg-color-orange padding-5" rel="tooltip" title="" data-placement="left" data-original-title="Warning Icon Text"><i class="fa fa-warning fa-lg txt-color-white"></i></em>
                                                    </div>
                                                </li>
                                                <li class="dd-item" data-id="14">
                                                    <div class="dd-handle">
                                                        Item 14
                                                    </div>
                                                </li>
                                                <li class="dd-item" data-id="15"><button data-action="collapse" type="button">Collapse</button><button data-action="expand" type="button" style="display: none;">Expand</button>
                                                    <div class="dd-handle">
                                                        Item 15
                                                    </div>
                                                    <ol class="dd-list">
                                                        <li class="dd-item" data-id="16">
                                                            <div class="dd-handle">
                                                                Item 16
                                                            </div>
                                                        </li>
                                                        <li class="dd-item" data-id="17">
                                                            <div class="dd-handle text-right">
                                                                Item 17 (text-right)
                                                            </div>
                                                        </li>
                                                        <li class="dd-item" data-id="18">
                                                            <div class="dd-handle">
                                                                <i class="fa fa-check text-success"></i> Item 18 <br>

                                                            </div>
                                                        </li>
                                                    </ol>
                                                </li>
                                            </ol>
                                        </div>

                                    </div>

                                    <div class="col-sm-6 col-lg-4">

                                        <h6>Nestable List #3 (with drag handle)</h6>

                                        <div class="dd" id="nestable3">
                                            <ol class="dd-list">
                                                <li class="dd-item dd3-item" data-id="13">
                                                    <div class="dd-handle dd3-handle">
                                                        Drag
                                                    </div>
                                                    <div class="dd3-content">
                                                        Item 13

                                                        <div class="pull-right">
                                                            <div class="checkbox no-margin">
                                                                <label>
                                                                    <input type="checkbox" class="checkbox style-0" checked="checked">
                                                                    <span class="font-xs">Checkbox 1</span>
                                                                </label>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </li>
                                                <li class="dd-item dd3-item" data-id="14">
                                                    <div class="dd-handle dd3-handle">
                                                        Drag
                                                    </div>
                                                    <div class="dd3-content">
                                                        Item 14
                                                    </div>
                                                </li>
                                                <li class="dd-item dd3-item" data-id="15"><button data-action="collapse" type="button">Collapse</button><button data-action="expand" type="button" style="display: none;">Expand</button>
                                                    <div class="dd-handle dd3-handle">
                                                        Drag
                                                    </div>
                                                    <div class="dd3-content">
                                                        With a switch

                                                        <span class="pull-right">

                                                            <span class="onoffswitch">
                                                                <input type="checkbox" name="start_interval" class="onoffswitch-checkbox" id="start_interval">
                                                                <label class="onoffswitch-label" for="start_interval">
                                                                    <div class="onoffswitch-inner" data-swchon-text="ON" data-swchoff-text="OFF"></div>
                                                                    <div class="onoffswitch-switch"></div>
                                                                </label>
                                                            </span>
                                                        </span>

                                                    </div>
                                                    <ol class="dd-list">
                                                        <li class="dd-item dd3-item" data-id="16">
                                                            <div class="dd-handle dd3-handle">
                                                      """),
format.raw("""          Drag
                                                            </div>
                                                            <div class="dd3-content">
                                                                Item 16
                                                            </div>
                                                        </li>
                                                        <li class="dd-item dd3-item" data-id="17">
                                                            <div class="dd-handle dd3-handle">
                                                                Drag
                                                            </div>
                                                            <div class="dd3-content">
                                                                Item 17
                                                            </div>
                                                        </li>
                                                        <li class="dd-item dd3-item" data-id="18">
                                                            <div class="dd-handle dd3-handle">
                                                                Drag
                                                            </div>
                                                            <div class="dd3-content">
                                                                Item 18
                                                            </div>
                                                        </li>
                                                    </ol>
                                                </li>
                                            </ol>
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
                    <!-- WIDGET END -->

            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

                <div class="col-sm-12">

                    <div class="well well-sm well-light">
                        <p>
                            <strong>Serialised Output (per list)</strong>
                        </p>
                        <p class="alert alert-info">
                            Preview of the lists update DB input.
                        </p>
                        <textarea id="nestable-output" rows="3" class="form-control font-md"></textarea>
                        <br>
                        <textarea id="nestable2-output" rows="3" class="form-control font-md"></textarea>


                    </div>


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
         * $("[rel=popover-hover]").popover("""),format.raw/*391.45*/("""{"""),format.raw/*391.46*/(""" """),format.raw/*391.47*/("""trigger: "hover" """),format.raw/*391.64*/("""}"""),format.raw/*391.65*/(""");
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

        var pagefunction = function() """),format.raw/*416.39*/("""{"""),format.raw/*416.40*/("""

        """),format.raw/*418.9*/("""var updateOutput = function(e) """),format.raw/*418.40*/("""{"""),format.raw/*418.41*/("""
        """),format.raw/*419.9*/("""var list = e.length ? e : $(e.target), output = list.data('output');
        if (window.JSON) """),format.raw/*420.26*/("""{"""),format.raw/*420.27*/("""
        """),format.raw/*421.9*/("""output.val(window.JSON.stringify(list.nestable('serialize')));
        //, null, 2));
        """),format.raw/*423.9*/("""}"""),format.raw/*423.10*/(""" """),format.raw/*423.11*/("""else """),format.raw/*423.16*/("""{"""),format.raw/*423.17*/("""
        """),format.raw/*424.9*/("""output.val('JSON browser support required for this demo.');
        """),format.raw/*425.9*/("""}"""),format.raw/*425.10*/("""
        """),format.raw/*426.9*/("""}"""),format.raw/*426.10*/(""";

        // activate Nestable for list 1
        $('#nestable').nestable("""),format.raw/*429.33*/("""{"""),format.raw/*429.34*/("""
        """),format.raw/*430.9*/("""group : 1
        """),format.raw/*431.9*/("""}"""),format.raw/*431.10*/(""").on('change', updateOutput);

        // activate Nestable for list 2
        $('#nestable2').nestable("""),format.raw/*434.34*/("""{"""),format.raw/*434.35*/("""
        """),format.raw/*435.9*/("""group : 1
        """),format.raw/*436.9*/("""}"""),format.raw/*436.10*/(""").on('change', updateOutput);

        // output initial serialised data
        updateOutput($('#nestable').data('output', $('#nestable-output')));
        updateOutput($('#nestable2').data('output', $('#nestable2-output')));

        $('#nestable-menu').on('click', function(e) """),format.raw/*442.53*/("""{"""),format.raw/*442.54*/("""
        """),format.raw/*443.9*/("""var target = $(e.target), action = target.data('action');
        if (action === 'expand-all') """),format.raw/*444.38*/("""{"""),format.raw/*444.39*/("""
        """),format.raw/*445.9*/("""$('.dd').nestable('expandAll');
        """),format.raw/*446.9*/("""}"""),format.raw/*446.10*/("""
        """),format.raw/*447.9*/("""if (action === 'collapse-all') """),format.raw/*447.40*/("""{"""),format.raw/*447.41*/("""
        """),format.raw/*448.9*/("""$('.dd').nestable('collapseAll');
        """),format.raw/*449.9*/("""}"""),format.raw/*449.10*/("""
        """),format.raw/*450.9*/("""}"""),format.raw/*450.10*/(""");

        $('#nestable3').nestable();

        """),format.raw/*454.9*/("""}"""),format.raw/*454.10*/(""";

        // end pagefunction

        // load nestable.min.js then run pagefunction
        loadScript("js/plugin/jquery-nestable/jquery.nestable.min.js", pagefunction);

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/nestable_list.scala.html
                  HASH: 5b5a6adc953f3c2f1eb6bcad3c1edca3c1e5fe75
                  MATRIX: 518->1|623->18|651->21|672->34|711->36|742->41|24334->23584|24364->23585|24394->23586|24440->23603|24470->23604|25097->24202|25127->24203|25165->24213|25225->24244|25255->24245|25292->24254|25415->24348|25445->24349|25482->24358|25604->24452|25634->24453|25664->24454|25698->24459|25728->24460|25765->24469|25861->24537|25891->24538|25928->24547|25958->24548|26062->24623|26092->24624|26129->24633|26175->24651|26205->24652|26338->24756|26368->24757|26405->24766|26451->24784|26481->24785|26790->25065|26820->25066|26857->25075|26981->25170|27011->25171|27048->25180|27116->25220|27146->25221|27183->25230|27243->25261|27273->25262|27310->25271|27380->25313|27410->25314|27447->25323|27477->25324|27554->25373|27584->25374
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|413->391|413->391|413->391|413->391|413->391|438->416|438->416|440->418|440->418|440->418|441->419|442->420|442->420|443->421|445->423|445->423|445->423|445->423|445->423|446->424|447->425|447->425|448->426|448->426|451->429|451->429|452->430|453->431|453->431|456->434|456->434|457->435|458->436|458->436|464->442|464->442|465->443|466->444|466->444|467->445|468->446|468->446|469->447|469->447|469->447|470->448|471->449|471->449|472->450|472->450|476->454|476->454
                  -- GENERATED --
              */
          