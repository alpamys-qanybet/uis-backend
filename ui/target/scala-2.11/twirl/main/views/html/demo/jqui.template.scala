
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
object jqui extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                    JQuery UI
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

            <div class="col-sm-6 col-md-6 col-lg-6">

                <div class="well well-sm well-light">
                    <h3>Dialogue</h3>
                    <a href="#" id="dialog_link" class="btn btn-info"> Open Dialog </a>
                        &nbsp;
                    <a href="#" id="modal_link" class="btn bg-color-purple txt-color-white"> Open Modal Dialog </a>
                </div>

                <div class="well well-sm well-light">
                    <h3>Jquery Tabs
                        <br>
                        <small>Simple Tabs</small></h3>

                    <div id="tabs" class="ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-a" aria-labelledby="ui-id-24" aria-selected="true">
                                <a href="#tabs-a" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-24">First</a>
                            </li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-b" aria-labelledby="ui-id-25" aria-selected="false">
                                <a href="#tabs-b" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-25">Second</a>
                            </li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-c" aria-labelledby="ui-id-26" aria-selected="false">
                                <a href="#tabs-c" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-26">Third</a>
                            </li>
                        </ul>
                        <div id="tabs-a" aria-labelledby="ui-id-24" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                            </p>
                        </div>
                        <div id="tabs-b" aria-labelledby="ui-id-25" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="false" aria-hidden="true" style="display: none;">
                            <p>
                                Phasellus mattis tincidunt nibh. Cras orci urna, blandit id, pretium vel, aliquet ornare, felis. Maecenas scelerisque sem non nisl. Fusce sed lorem in enim dictum bibendum.
                            </p>
                        </div>
                        <div id="tabs-c" aria-labelledby="ui-id-26" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="false" aria-hidden="true" style="display: none;">
                            <p>
                                Nam dui erat, auctor a, dignissim quis, sollicitudin eu, felis. Pellentesque nisi urna, interdum eget, sagittis et, consequat vestibulum, lacus. Mauris porttitor ullamcorper augue.
                            </p>
                        </div>
                    </div>

                    <hr class="simple">
                    <h3>Dynamic Tabs
                        <br>
                        <small>Click button to add another tab</small></h3>

                    <p>
                        <button id="add_tab" class="btn btn-primary">
                            Add Tab
                        </button>
                    </p>

                    <div id="tabs2" class="ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-27" aria-selected="true">
                                <a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-27">Nunc tincidunt</a>
                            </li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-27" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false">
                            <p>
                                Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris. Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo. Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat. Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.
                            </p>
                        </div>
                    </div>

                        <!-- Demo -->


                </div>

                <div class="well well-sm well-light">
                    <h3>Slider
                        <br>
                        <small>Horizontal Slider with tooltip</small></h3>


                    <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-primary" id="g1" value="" data-slider-max="500" data-slider-value="185" data-slider-selection="before" data-slider-handle="round"><div class="slider-track"><div class="slider-selection" style="left: 0%; width: 37%;"></div><div class="slider-handle round" style="left: 37%;"></div><div class="slider-handle round hide" style="left: 0%;"></div></div><div class="tooltip top" style="top: -34px; left: 160.82px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">185</div></div></div>

                    <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-success" id="g2" value="" data-slider-max="1000" data-slider-step="1" data-slider-value="[150,760]" data-slider-handle="squar"><div class="slider-track"><div class="slider-selection" style="left: 15%; width: 61%;"></div><div class="slider-handle" style="left: 15%;"></div><div class="slider-handle" style="left: 76%;"></div></div><div class="tooltip top" style="top: -34px; left: 188.13px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">150 : 760</div></div></div>


                    <h3>Usage <small>Its so simple...</small> </h3>
                    <pre><code><strong>&lt;input class="slider slider-primary" data-slider-min="10" ..  /&gt;</strong></code>

                        data-slider-min="10"       <span class="text-muted"> // slider min value</span>
                        data-slider-max="500"      <span class="text-muted"> // slider max value</span>
                        data-slider-value="315"    <span class="text-muted"> // handler position on slider</span>
                        data-slider-handle="round" <span class="text-muted"> // round or square</span> </pre>


                </div>

                <div class="well well-sm well-light">
                    <h3>Spinner</h3>

                    <div class="row">

                        <div class="col-sm-6 col-md-6 col-lg-6">

                            <div class="form-group">
                                <label for="h-input">Spinner Right</label>
                                <span class="ui-spinner ui-widget ui-widget-content ui-corner-all"><input class="form-control ui-spinner-input" id="spinner-decimal" name="spinner-decimal" value="7.99" aria-valuenow="7.99" autocomplete="off" role="spinbutton"><a class="ui-spinner-button ui-spinner-up ui-corner-tr" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-n">▲</span></a><a class="ui-spinner-button ui-spinner-down ui-corner-br" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-s">▼</span></a></span>
                            </div>

                        </div>

                        <div class="col-sm-6 col-md-6 col-lg-6">

                            <div class="form-group">
                                <label for="h-input">Spinner Left</label>
                                <span class="ui-spinner ui-widget ui-widget-content ui-corner-all"><input class="form-control spinner-left ui-spinner-input" id="spinner" name="spinner" value="1" type="text" aria-valuenow="1" autocomplete="off" role="spinbutton"><a class="ui-spinner-button ui-spinner-up ui-corner-tr" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-n">▲</span></a><a class="ui-spinner-button ui-spinner-down ui-corner-br" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-s">▼</span></a></span>
                            </div>

                        </div>

                    </div>

                </div>

            </div>

            <div class="col-sm-6 col-md-6 col-lg-6">

                <div class="well well-sm well-light">

                    <h3>Menu <br> <small>Easy Menu List</small></h3>

                    <ul id="menu" class="ui-menu ui-widget ui-widget-content ui-corner-all" role="menu" tabindex="0">
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" class="ui-state-disabled ui-corner-all" id="ui-id-2" tabindex="-1" role="menuitem">Aberdeen (disabled)</a>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" id="ui-id-3" class="ui-corner-all" tabindex="-1" role="menuitem">Ada</a>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" id="ui-id-4" class="ui-corner-all" tabindex="-1" role="menuitem">Adamsville</a>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" id="ui-id-5" class="ui-corner-all" tabindex="-1" role="menuitem">Addyston</a>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" aria-haspopup="true" id="ui-id-6" class="ui-corner-all" tabindex="-1" role="menuitem"><span class="ui-menu-icon ui-icon ui-icon-carat-1-e"></span>Delphi</a>
                            <ul class="ui-menu ui-widget ui-widget-content ui-corner-all" role="menu" aria-hidden="true" aria-expanded="false" style="display: none;">
                                <li class="ui-menu-item" role="presentation">
                                    <a href="javascript:void(0);" id="ui-id-9" class="ui-corner-all" tabindex="-1" role="menuitem">Ada</a>
                                </li>
                                <li class="ui-menu-item" role="presentation">
                                    <a href="javascript:void(0);" id="ui-id-10" class="ui-corner-all" tabindex="-1" role="menuitem">Saarland</a>
                                </li>
                                <li class="ui-menu-item" role="presentation">
                                    <a href="javascript:void(0);" id="ui-id-11" class="ui-corner-all" tabindex="-1" role="menuitem">Salzburg</a>
                                </li>
                            </ul>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" id="ui-id-7" class="ui-corner-all" tabindex="-1" role="menuitem">Saarland</a>
                        </li>
                        <li class="ui-menu-item" role="presentation">
                            <a href="javascript:void(0);" aria-haspopup="true" id="ui-id-8" class="ui-corner-all" tabindex="-1" role="menuitem"><span class="ui-menu-icon ui-icon ui-icon-carat-1-e"></span>Salzburg</a>
                            <ul class="ui-menu ui-widget ui-widget-content ui-corner-all" role="menu" aria-hidden="true" aria-expanded="false" style="display: none;">
                                <li class="ui-menu-item" role="presentation">
                                    <a href="javascript:void(0);" aria-haspopup="true" id="ui-id-12" class="ui-corner-all" tabindex="-1" role="menuitem"><span class="ui-menu-icon ui-icon ui-icon-carat-1-e"></span>Delphi</a>
                                    <ul class="ui-menu ui-widget ui-widget-content ui-corner-all" role="menu" aria-hidden="true" aria-expanded="false" style="display: none;">
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" class="ui-state-disabled ui-corner-all" id="ui-id-15" tabindex="-1" role="menuitem">Ada</a>
                                        </li>
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" id="ui-id-16" class="ui-corner-all" tabindex="-1" role="menuitem">Saarland</a>
                                        </li>
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" id="ui-id-17" class="ui-corner-all" tabindex="-1" role="menuitem">Salzburg</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="ui-menu-item" role="presentation">
                                    <a href="?Delphi" aria-haspopup="true" id="ui-id-13" class="ui-corner-all" tabindex="-1" role="menuitem"><span class="ui-menu-icon ui-icon ui-icon-carat-1-e"></span>Delphi</a>
                                    <ul class="ui-menu ui-widget ui-widget-content ui-corner-all" role="menu" aria-hidden="true" aria-expanded="false" style="display: none;">
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" id="ui-id-18" class="ui-corner-all" tabindex="-1" role="menuitem">Ada</a>
                                        </li>
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" id="ui-id-19" class="ui-corner-all" tabindex="-1" role="menuitem">Saarland</a>
                                        </li>
                                        <li class="ui-menu-item" role="presentation">
                                            <a href="javascript:void(0);" id="ui-id-20" class="ui-corner-all" tabindex="-1" role="menuitem">Salzburg</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="ui-menu-item" role="presentation">
                                    <a href="javascript:void(0);" id="ui-id-14" class="ui-corner-all" tabindex="-1" role="menuitem">Perch</a>
                                </li>
                            </ul>
                        </li>
                    </ul>

                </div>


                <div class="well well-sm well-light">
                    <h3>Auto Complete
                        <br>
                        <small>Type something to reveal autocompelete tags</small></h3>

                    <span role="status" aria-live="polite" class="ui-helper-hidden-accessible"></span><input class="form-control ui-autocomplete-input" placeholder="Type something..." type="text" data-autocomplete="[
			&quot;ActionScript&quot;,
			&quot;AppleScript&quot;,
			&quot;Asp&quot;,
			&quot;BASIC&quot;,
			&quot;C&quot;,
			&quot;C++&quot;,
			&quot;Clojure&quot;,
			&quot;COBOL&quot;,
			&quot;ColdFusion&quot;,
			&quot;Erlang&quot;,
			&quot;Fortran&quot;,
			&quot;Groovy&quot;,
			&quot;Haskell&quot;,
			&quot;Java&quot;,
			&quot;JavaScript&quot;,
			&quot;Lisp&quot;,
			&quot;Perl&quot;,
			&quot;PHP&quot;,
			&quot;Python&quot;,
			&quot;Ruby&quot;,
			&quot;Scala&quot;,
			&quot;Scheme&quot;]" autocomplete="off">

                    <p class="note">
                        Usage: data-autocomplete= ' ["this", "message", "bold", "text"] '
                    </p>

                    <h3>Auto Complete Ajax
                        <br>
                        <small>Fetches data from JSON url</small></h3>

                    <span role="status" aria-live="polite" class="ui-helper-hidden-accessible"></span><input class="form-control ui-autocomplete-input" placeholder="City..." type="text" id="city" autocomplete="off">
                    <div id="log" class="font-xs margin-top-10 text-danger"></div>

                </div>

                <div class="well well-sm well-light">
                    <h3>Accordion
                        <br>
                        <small>With fontawesome icons</small></h3>
                    <div id="accordion" class="ui-accordion ui-widget ui-helper-reset" role="tablist">
                        <div>
                            <h4 class="ui-accordion-header ui-helper-reset ui-state-default ui-accordion-header-active ui-state-active ui-corner-top ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-0" aria-controls="ui-accordion-accordion-panel-0" aria-selected="true" tabindex="0"><span class="ui-accordion-header-icon ui-icon fa fa-minus"></span>First</h4>
                            <div class="padding-10 ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active" style="" id="ui-accordion-accordion-panel-0" aria-labelledby="ui-accordion-accordion-header-0" role="tabpanel" aria-expanded="true" aria-h"""),
format.raw("""idden="false">
                                Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris.
                                Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo.
                                Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat.
                                Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.
                            </div>
                        </div>

                        <div>
                            <h4 class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-1" aria-controls="ui-accordion-accordion-panel-1" aria-selected="false" tabindex="-1"><span class="ui-accordion-header-icon ui-icon fa fa-plus"></span>Second</h4>
                            <div class="padding-10 ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom" style="display: none;" id="ui-accordion-accordion-panel-1" aria-labelledby="ui-accordion-accordion-header-1" role="tabpanel" aria-expanded="false" aria-hidden="true">
                                Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris.
                                Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo.
                                Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat.
                                Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.
                            </div>
                        </div>
                        <div>
                            <h4 class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all ui-accordion-icons" role="tab" id="ui-accordion-accordion-header-2" aria-controls="ui-accordion-accordion-panel-2" aria-selected="false" tabindex="-1"><span class="ui-accordion-header-icon ui-icon fa fa-plus"></span>Third</h4>
                            <div class="padding-10 ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom" style="display: none;" id="ui-accordion-accordion-panel-2" aria-labelledby="ui-accordion-accordion-header-2" role="tabpanel" aria-expanded="false" aria-hidden="true">
                                Proin elit arcu, rutrum commodo, vehicula tempus, commodo a, risus. Curabitur nec arcu. Donec sollicitudin mi sit amet mauris.
                                Nam elementum quam ullamcorper ante. Etiam aliquet massa et lorem. Mauris dapibus lacus auctor risus. Aenean tempor ullamcorper leo.
                                Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat.
                                Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.
                            </div>
                        </div>
                    </div>

                </div>

                <div class="well well-sm well-light">
                    <h3>Progress Bar
                        <br>
                        <small>Default progress bar.</small></h3>

                    <div id="progressbar"></div>
                </div>

            </div>

        </div>

            <!-- end row -->

            <!-- ui-dialog -->


            <!-- #dialog-message -->

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

        /*
         * ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
         * eg alert("my home function");
         *
         * var pagefunction = function() """),format.raw/*369.42*/("""{"""),format.raw/*369.43*/("""
         """),format.raw/*370.10*/("""*   ...
         * """),format.raw/*371.12*/("""}"""),format.raw/*371.13*/("""
         """),format.raw/*372.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*375.42*/("""{"""),format.raw/*375.43*/("""
         """),format.raw/*376.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*377.12*/("""}"""),format.raw/*377.13*/("""
         """),format.raw/*378.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */


        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*389.39*/("""{"""),format.raw/*389.40*/("""

        """),format.raw/*391.9*/("""// menu
        $("#menu").menu();

        /*
         * AUTO COMPLETE AJAX
         */

        function log(message) """),format.raw/*398.31*/("""{"""),format.raw/*398.32*/("""
        """),format.raw/*399.9*/("""$("<div>").text(message).prependTo("#log");
        $("#log").scrollTop(0);
        """),format.raw/*401.9*/("""}"""),format.raw/*401.10*/("""

        """),format.raw/*403.9*/("""$("#city").autocomplete("""),format.raw/*403.33*/("""{"""),format.raw/*403.34*/("""
        """),format.raw/*404.9*/("""source : function(request, response) """),format.raw/*404.46*/("""{"""),format.raw/*404.47*/("""
        """),format.raw/*405.9*/("""$.ajax("""),format.raw/*405.16*/("""{"""),format.raw/*405.17*/("""
        """),format.raw/*406.9*/("""url : "http://ws.geonames.org/searchJSON",
        dataType : "jsonp",
        data : """),format.raw/*408.16*/("""{"""),format.raw/*408.17*/("""
        """),format.raw/*409.9*/("""featureClass : "P",
        style : "full",
        maxRows : 12,
        name_startsWith : request.term
        """),format.raw/*413.9*/("""}"""),format.raw/*413.10*/(""",
        success : function(data) """),format.raw/*414.34*/("""{"""),format.raw/*414.35*/("""
        """),format.raw/*415.9*/("""response($.map(data.geonames, function(item) """),format.raw/*415.54*/("""{"""),format.raw/*415.55*/("""
        """),format.raw/*416.9*/("""return """),format.raw/*416.16*/("""{"""),format.raw/*416.17*/("""
        """),format.raw/*417.9*/("""label : item.name + (item.adminName1 ? ", " + item.adminName1 : "") + ", " + item.countryName,
        value : item.name
        """),format.raw/*419.9*/("""}"""),format.raw/*419.10*/("""
        """),format.raw/*420.9*/("""}"""),format.raw/*420.10*/("""));
        """),format.raw/*421.9*/("""}"""),format.raw/*421.10*/("""
        """),format.raw/*422.9*/("""}"""),format.raw/*422.10*/(""");
        """),format.raw/*423.9*/("""}"""),format.raw/*423.10*/(""",
        minLength : 2,
        select : function(event, ui) """),format.raw/*425.38*/("""{"""),format.raw/*425.39*/("""
        """),format.raw/*426.9*/("""log(ui.item ? "Selected: " + ui.item.label : "Nothing selected, input was " + this.value);
        """),format.raw/*427.9*/("""}"""),format.raw/*427.10*/("""
        """),format.raw/*428.9*/("""}"""),format.raw/*428.10*/(""");

        /*
         * Spinners
         */
        $("#spinner").spinner();
        $("#spinner-decimal").spinner("""),format.raw/*434.39*/("""{"""),format.raw/*434.40*/("""
        """),format.raw/*435.9*/("""step : 0.01,
        numberFormat : "n"
        """),format.raw/*437.9*/("""}"""),format.raw/*437.10*/(""");

        $("#spinner-currency").spinner("""),format.raw/*439.40*/("""{"""),format.raw/*439.41*/("""
        """),format.raw/*440.9*/("""min : 5,
        max : 2500,
        step : 25,
        start : 1000,
        numberFormat : "C"
        """),format.raw/*445.9*/("""}"""),format.raw/*445.10*/(""");

        /*
         * CONVERT DIALOG TITLE TO HTML
         * REF: http://stackoverflow.com/questions/14488774/using-html-in-a-dialogs-title-in-jquery-ui-1-10
         */
        $.widget("ui.dialog", $.extend("""),format.raw/*451.40*/("""{"""),format.raw/*451.41*/("""}"""),format.raw/*451.42*/(""", $.ui.dialog.prototype, """),format.raw/*451.67*/("""{"""),format.raw/*451.68*/("""
        """),format.raw/*452.9*/("""_title : function(title) """),format.raw/*452.34*/("""{"""),format.raw/*452.35*/("""
        """),format.raw/*453.9*/("""if (!this.options.title) """),format.raw/*453.34*/("""{"""),format.raw/*453.35*/("""
        """),format.raw/*454.9*/("""title.html("&#160;");
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/(""" """),format.raw/*455.11*/("""else """),format.raw/*455.16*/("""{"""),format.raw/*455.17*/("""
        """),format.raw/*456.9*/("""title.html(this.options.title);
        """),format.raw/*457.9*/("""}"""),format.raw/*457.10*/("""
        """),format.raw/*458.9*/("""}"""),format.raw/*458.10*/("""
        """),format.raw/*459.9*/("""}"""),format.raw/*459.10*/("""));

        /*
        * DIALOG SIMPLE
        */

        // Dialog click
        $('#dialog_link').click(function() """),format.raw/*466.44*/("""{"""),format.raw/*466.45*/("""
        """),format.raw/*467.9*/("""$('#dialog_simple').dialog('open');
        return false;

        """),format.raw/*470.9*/("""}"""),format.raw/*470.10*/(""");

        $('#dialog_simple').dialog("""),format.raw/*472.36*/("""{"""),format.raw/*472.37*/("""
        """),format.raw/*473.9*/("""autoOpen : false,
        width : 600,
        resizable : false,
        modal : true,
        title : "<div class='widget-header'><h4><i class='fa fa-warning'></i> Empty the recycle bin?</h4></div>",
        buttons : ["""),format.raw/*478.20*/("""{"""),format.raw/*478.21*/("""
        """),format.raw/*479.9*/("""html : "<i class='fa fa-trash-o'></i>&nbsp; Delete all items",
        "class" : "btn btn-danger",
        click : function() """),format.raw/*481.28*/("""{"""),format.raw/*481.29*/("""
        """),format.raw/*482.9*/("""$(this).dialog("close");
        """),format.raw/*483.9*/("""}"""),format.raw/*483.10*/("""
        """),format.raw/*484.9*/("""}"""),format.raw/*484.10*/(""", """),format.raw/*484.12*/("""{"""),format.raw/*484.13*/("""
        """),format.raw/*485.9*/("""html : "<i class='fa fa-times'></i>&nbsp; Cancel",
        "class" : "btn btn-default",
        click : function() """),format.raw/*487.28*/("""{"""),format.raw/*487.29*/("""
        """),format.raw/*488.9*/("""$(this).dialog("close");
        """),format.raw/*489.9*/("""}"""),format.raw/*489.10*/("""
        """),format.raw/*490.9*/("""}"""),format.raw/*490.10*/("""]
        """),format.raw/*491.9*/("""}"""),format.raw/*491.10*/(""");

        /*
        * DIALOG HEADER ICON
        */

        // Modal Link
        $('#modal_link').click(function() """),format.raw/*498.43*/("""{"""),format.raw/*498.44*/("""
        """),format.raw/*499.9*/("""$('#dialog-message').dialog('open');
        return false;
        """),format.raw/*501.9*/("""}"""),format.raw/*501.10*/(""");

        $("#dialog-message").dialog("""),format.raw/*503.37*/("""{"""),format.raw/*503.38*/("""
        """),format.raw/*504.9*/("""autoOpen : false,
        modal : true,
        title : "<div class='widget-header'><h4><i class='icon-ok'></i> jQuery UI Dialog</h4></div>",
        buttons : ["""),format.raw/*507.20*/("""{"""),format.raw/*507.21*/("""
        """),format.raw/*508.9*/("""html : "Cancel",
        "class" : "btn btn-default",
        click : function() """),format.raw/*510.28*/("""{"""),format.raw/*510.29*/("""
        """),format.raw/*511.9*/("""$(this).dialog("close");
        """),format.raw/*512.9*/("""}"""),format.raw/*512.10*/("""
        """),format.raw/*513.9*/("""}"""),format.raw/*513.10*/(""", """),format.raw/*513.12*/("""{"""),format.raw/*513.13*/("""
        """),format.raw/*514.9*/("""html : "<i class='fa fa-check'></i>&nbsp; OK",
        "class" : "btn btn-primary",
        click : function() """),format.raw/*516.28*/("""{"""),format.raw/*516.29*/("""
        """),format.raw/*517.9*/("""$(this).dialog("close");
        """),format.raw/*518.9*/("""}"""),format.raw/*518.10*/("""
        """),format.raw/*519.9*/("""}"""),format.raw/*519.10*/("""]

        """),format.raw/*521.9*/("""}"""),format.raw/*521.10*/(""");

        /*
         * Remove focus from buttons
         */
        $('.ui-dialog :button').blur();

        /*
         * Just Tabs
         */

        $('#tabs').tabs();

        /*
         *  Simple tabs adding and removing
         */

        $('#tabs2').tabs();

        // Dynamic tabs
        var tabTitle = $("#tab_title"), tabContent = $("#tab_content"), tabTemplate = "<li style='position:relative;'> <span class='air air-top-left delete-tab' style='top:7px; left:7px;'><button class='btn btn-xs font-xs btn-default hover-transparent'><i class='fa fa-times'></i></button></span></span><a href='#"""),format.raw/*541.314*/("""{"""),format.raw/*541.315*/("""href"""),format.raw/*541.319*/("""}"""),format.raw/*541.320*/("""'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; #"""),format.raw/*541.354*/("""{"""),format.raw/*541.355*/("""label"""),format.raw/*541.360*/("""}"""),format.raw/*541.361*/("""</a></li>", tabCounter = 2;

        var tabs = $("#tabs2").tabs();

        // modal dialog init: custom buttons and a "close" callback reseting the form inside
        var dialog = $("#addtab").dialog("""),format.raw/*546.42*/("""{"""),format.raw/*546.43*/("""
        """),format.raw/*547.9*/("""autoOpen : false,
        width : 600,
        resizable : false,
        modal : true,
        buttons : ["""),format.raw/*551.20*/("""{"""),format.raw/*551.21*/("""
        """),format.raw/*552.9*/("""html : "<i class='fa fa-times'></i>&nbsp; Cancel",
        "class" : "btn btn-default",
        click : function() """),format.raw/*554.28*/("""{"""),format.raw/*554.29*/("""
        """),format.raw/*555.9*/("""$(this).dialog("close");

        """),format.raw/*557.9*/("""}"""),format.raw/*557.10*/("""
        """),format.raw/*558.9*/("""}"""),format.raw/*558.10*/(""", """),format.raw/*558.12*/("""{"""),format.raw/*558.13*/("""

        """),format.raw/*560.9*/("""html : "<i class='fa fa-plus'></i>&nbsp; Add",
        "class" : "btn btn-danger",
        click : function() """),format.raw/*562.28*/("""{"""),format.raw/*562.29*/("""
        """),format.raw/*563.9*/("""addTab();
        $(this).dialog("close");
        """),format.raw/*565.9*/("""}"""),format.raw/*565.10*/("""
        """),format.raw/*566.9*/("""}"""),format.raw/*566.10*/("""]
        """),format.raw/*567.9*/("""}"""),format.raw/*567.10*/(""");

        // addTab form: calls addTab function on submit and closes the dialog
        var form = dialog.find("form").submit(function(event) """),format.raw/*570.63*/("""{"""),format.raw/*570.64*/("""
        """),format.raw/*571.9*/("""addTab();
        dialog.dialog("close");
        event.preventDefault();
        """),format.raw/*574.9*/("""}"""),format.raw/*574.10*/(""");

        // actual addTab function: adds new tab using the input from the form above
        function addTab() """),format.raw/*577.27*/("""{"""),format.raw/*577.28*/("""
        """),format.raw/*578.9*/("""var label = tabTitle.val() || "Tab " + tabCounter, id = "tabs-" + tabCounter, li = $(tabTemplate.replace(/#\"""),format.raw/*578.117*/("""{"""),format.raw/*578.118*/("""href\"""),format.raw/*578.123*/("""}"""),format.raw/*578.124*/("""/g, "#" + id).replace(/#\"""),format.raw/*578.149*/("""{"""),format.raw/*578.150*/("""label\"""),format.raw/*578.156*/("""}"""),format.raw/*578.157*/("""/g, label)), tabContentHtml = tabContent.val() || "Tab " + tabCounter + " content.";

        tabs.find(".ui-tabs-nav").append(li);
        tabs.append("<div id='" + id + "'><p>" + tabContentHtml + "</p></div>");
        tabs.tabs("refresh");
        tabCounter++;

        // clear fields
        $("#tab_title").val("");
        $("#tab_content").val("");
        """),format.raw/*588.9*/("""}"""),format.raw/*588.10*/("""

        """),format.raw/*590.9*/("""// addTab button: just opens the dialog
        $("#add_tab").button().click(function() """),format.raw/*591.49*/("""{"""),format.raw/*591.50*/("""
        """),format.raw/*592.9*/("""dialog.dialog("open");
        """),format.raw/*593.9*/("""}"""),format.raw/*593.10*/(""");

        // close icon: removing the tab on click
        $("#tabs2").on("click", 'span.delete-tab', function() """),format.raw/*596.63*/("""{"""),format.raw/*596.64*/("""

        """),format.raw/*598.9*/("""var panelId = $(this).closest("li").remove().attr("aria-controls");
        $("#" + panelId).remove();
        tabs.tabs("refresh");
        """),format.raw/*601.9*/("""}"""),format.raw/*601.10*/(""");

        /*
        * ACCORDION
        */
        //jquery accordion

        var accordionIcons = """),format.raw/*608.30*/("""{"""),format.raw/*608.31*/("""
        """),format.raw/*609.9*/("""header: "fa fa-plus",    // custom icon class
        activeHeader: "fa fa-minus" // custom icon class
        """),format.raw/*611.9*/("""}"""),format.raw/*611.10*/(""";

        $("#accordion").accordion("""),format.raw/*613.35*/("""{"""),format.raw/*613.36*/("""
        """),format.raw/*614.9*/("""autoHeight : false,
        heightStyle : "content",
        collapsible : true,
        animate : 300,
        icons: accordionIcons,
        header : "h4",
        """),format.raw/*620.9*/("""}"""),format.raw/*620.10*/(""")

        /*
         * PROGRESS BAR
         */
        $("#progressbar").progressbar("""),format.raw/*625.39*/("""{"""),format.raw/*625.40*/("""
        """),format.raw/*626.9*/("""value: 25,
        create: function( event, ui ) """),format.raw/*627.39*/("""{"""),format.raw/*627.40*/("""
        """),format.raw/*628.9*/("""$(this).removeClass("ui-corner-all").addClass('progress').find(">:first-child").removeClass("ui-corner-left").addClass('progress-bar progress-bar-success');
        """),format.raw/*629.9*/("""}"""),format.raw/*629.10*/("""
        """),format.raw/*630.9*/("""}"""),format.raw/*630.10*/(""");


        """),format.raw/*633.9*/("""}"""),format.raw/*633.10*/(""";

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
                  DATE: Thu Aug 28 21:08:42 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/jqui.scala.html
                  HASH: cdde3a9445d4253bdbb105ab5a0e6e1e5eef8993
                  MATRIX: 509->1|614->18|642->21|663->34|702->36|733->41|25164->24423|25194->24424|25224->24425|25270->24442|25300->24443|25989->25103|26019->25104|26058->25114|26106->25133|26136->25134|26175->25144|26343->25283|26373->25284|26412->25294|26502->25355|26532->25356|26571->25366|26795->25561|26825->25562|26863->25572|27012->25692|27042->25693|27079->25702|27191->25786|27221->25787|27259->25797|27312->25821|27342->25822|27379->25831|27445->25868|27475->25869|27512->25878|27548->25885|27578->25886|27615->25895|27730->25981|27760->25982|27797->25991|27938->26104|27968->26105|28032->26140|28062->26141|28099->26150|28173->26195|28203->26196|28240->26205|28276->26212|28306->26213|28343->26222|28500->26351|28530->26352|28567->26361|28597->26362|28637->26374|28667->26375|28704->26384|28734->26385|28773->26396|28803->26397|28894->26459|28924->26460|28961->26469|29088->26568|29118->26569|29155->26578|29185->26579|29332->26697|29362->26698|29399->26707|29475->26755|29505->26756|29577->26799|29607->26800|29644->26809|29777->26914|29807->26915|30050->27129|30080->27130|30110->27131|30164->27156|30194->27157|30231->27166|30285->27191|30315->27192|30352->27201|30406->27226|30436->27227|30473->27236|30531->27266|30561->27267|30591->27268|30625->27273|30655->27274|30692->27283|30760->27323|30790->27324|30827->27333|30857->27334|30894->27343|30924->27344|31072->27463|31102->27464|31139->27473|31234->27540|31264->27541|31332->27580|31362->27581|31399->27590|31649->27811|31679->27812|31716->27821|31871->27947|31901->27948|31938->27957|31999->27990|32029->27991|32066->28000|32096->28001|32127->28003|32157->28004|32194->28013|32338->28128|32368->28129|32405->28138|32466->28171|32496->28172|32533->28181|32563->28182|32601->28192|32631->28193|32780->28313|32810->28314|32847->28323|32942->28390|32972->28391|33041->28431|33071->28432|33108->28441|33298->28602|33328->28603|33365->28612|33475->28693|33505->28694|33542->28703|33603->28736|33633->28737|33670->28746|33700->28747|33731->28749|33761->28750|33798->28759|33938->28870|33968->28871|34005->28880|34066->28913|34096->28914|34133->28923|34163->28924|34202->28935|34232->28936|34874->29548|34905->29549|34939->29553|34970->29554|35034->29588|35065->29589|35100->29594|35131->29595|35363->29798|35393->29799|35430->29808|35566->29915|35596->29916|35633->29925|35777->30040|35807->30041|35844->30050|35906->30084|35936->30085|35973->30094|36003->30095|36034->30097|36064->30098|36102->30108|36241->30218|36271->30219|36308->30228|36387->30279|36417->30280|36454->30289|36484->30290|36522->30300|36552->30301|36725->30445|36755->30446|36792->30455|36902->30537|36932->30538|37075->30652|37105->30653|37142->30662|37280->30770|37311->30771|37346->30776|37377->30777|37432->30802|37463->30803|37499->30809|37530->30810|37924->31176|37954->31177|37992->31187|38109->31275|38139->31276|38176->31285|38235->31316|38265->31317|38409->31432|38439->31433|38477->31443|38646->31584|38676->31585|38808->31688|38838->31689|38875->31698|39014->31809|39044->31810|39110->31847|39140->31848|39177->31857|39371->32023|39401->32024|39518->32112|39548->32113|39585->32122|39663->32171|39693->32172|39730->32181|39923->32346|39953->32347|39990->32356|40020->32357|40061->32370|40091->32371
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|366->344|366->344|366->344|366->344|366->344|391->369|391->369|392->370|393->371|393->371|394->372|397->375|397->375|398->376|399->377|399->377|400->378|411->389|411->389|413->391|420->398|420->398|421->399|423->401|423->401|425->403|425->403|425->403|426->404|426->404|426->404|427->405|427->405|427->405|428->406|430->408|430->408|431->409|435->413|435->413|436->414|436->414|437->415|437->415|437->415|438->416|438->416|438->416|439->417|441->419|441->419|442->420|442->420|443->421|443->421|444->422|444->422|445->423|445->423|447->425|447->425|448->426|449->427|449->427|450->428|450->428|456->434|456->434|457->435|459->437|459->437|461->439|461->439|462->440|467->445|467->445|473->451|473->451|473->451|473->451|473->451|474->452|474->452|474->452|475->453|475->453|475->453|476->454|477->455|477->455|477->455|477->455|477->455|478->456|479->457|479->457|480->458|480->458|481->459|481->459|488->466|488->466|489->467|492->470|492->470|494->472|494->472|495->473|500->478|500->478|501->479|503->481|503->481|504->482|505->483|505->483|506->484|506->484|506->484|506->484|507->485|509->487|509->487|510->488|511->489|511->489|512->490|512->490|513->491|513->491|520->498|520->498|521->499|523->501|523->501|525->503|525->503|526->504|529->507|529->507|530->508|532->510|532->510|533->511|534->512|534->512|535->513|535->513|535->513|535->513|536->514|538->516|538->516|539->517|540->518|540->518|541->519|541->519|543->521|543->521|563->541|563->541|563->541|563->541|563->541|563->541|563->541|563->541|568->546|568->546|569->547|573->551|573->551|574->552|576->554|576->554|577->555|579->557|579->557|580->558|580->558|580->558|580->558|582->560|584->562|584->562|585->563|587->565|587->565|588->566|588->566|589->567|589->567|592->570|592->570|593->571|596->574|596->574|599->577|599->577|600->578|600->578|600->578|600->578|600->578|600->578|600->578|600->578|600->578|610->588|610->588|612->590|613->591|613->591|614->592|615->593|615->593|618->596|618->596|620->598|623->601|623->601|630->608|630->608|631->609|633->611|633->611|635->613|635->613|636->614|642->620|642->620|647->625|647->625|648->626|649->627|649->627|650->628|651->629|651->629|652->630|652->630|655->633|655->633
                  -- GENERATED --
              */
          