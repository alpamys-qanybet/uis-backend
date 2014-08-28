
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
object validation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.6*/scripts/*2.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.17*/("""

        """),format.raw/*4.9*/("""<script type="text/javascript">

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
         * $("[rel=popover-hover]").popover("""),format.raw/*17.45*/("""{"""),format.raw/*17.46*/(""" """),format.raw/*17.47*/("""trigger: "hover" """),format.raw/*17.64*/("""}"""),format.raw/*17.65*/(""");
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

        pageSetUp ( ) ;

        /*
         * ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
         * eg alert("my home function");
         *
         * var pagefunction = function() """),format.raw/*42.42*/("""{"""),format.raw/*42.43*/("""
         """),format.raw/*43.10*/("""*   ...
         * """),format.raw/*44.12*/("""}"""),format.raw/*44.13*/("""
         """),format.raw/*45.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*48.42*/("""{"""),format.raw/*48.43*/("""
         """),format.raw/*49.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*50.12*/("""}"""),format.raw/*50.13*/("""
         """),format.raw/*51.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */


        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function ( ) """),format.raw/*62.41*/("""{"""),format.raw/*62.42*/("""

        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""" """),format.raw/*64.11*/(""";

        // end pagefunction

        // run pagefunction on load

        pagefunction ( ) ;

        </script>

    """)))};
Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*74.6*/("""
"""),_display_(/*75.2*/main(message,scripts)/*75.23*/ {_display_(Seq[Any](format.raw/*75.25*/("""
    """),format.raw/*76.5*/("""<div id="content" style="opacity : 1 ;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-edit fa-fw "></i>
                Forms
                <span>&gt;
                    Validation Sample look
                </span>
            </h1>
        </div>
        <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
            <ul id="sparks" class="">
                <li class="sparks-info">
                    <h5> My Income <span class="txt-color-blue">$47,171</span></h5>
                    <div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm"><canvas width="89" height="26" style="display : inline-block ; width : 89 px ; height : 26 px ; vertical-align : top ;"></canvas></div>
                </li>
                <li class="sparks-info">
                    <h5>
                        Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip" title="Increased"></i>&nbsp;45%</span></h5>
                    <div class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display : inline-block ; width : 82 px ; height : 26 px ; vertical-align : top ;"></canvas></div>
                </li>
                <li class="sparks-info">
                    <h5>
                        Site Orders <span class="txt-color-greenDark"><i class="fa fa-shopping-cart"></i>&nbsp;2447</span></h5>
                    <div class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display : inline-block ; width : 82 px ; height : 26 px ; vertical-align : top ;"></canvas></div>
                </li>
            </ul>
        </div>
    </div>

        <div class="alert alert-block alert-info">
            <a class="close" data-dismiss="alert" href="#">×</a>
            <h4 class="alert-heading">Please Note!</h4>
            <p>
                This page only shows various form element states for error and success. For a full list of error validations and examples click on the link below to go to the <strong>
                Smart Form Layouts</strong> page
            </p>
            <br>
            <a href="#ajax/form-templates.html" class="btn btn-primary"><strong><i class="fa fa-arrow-circle-right"></i>
                Form Layouts Page </strong></a>
        </div>

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-exclamation txt-color-red"></i> </span>
                            <h2>Error States </h2>

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

                                    <!-- Error states for elements -->
                                <form action="" class="smart-form">
                                    <header>Error states for elements</header>

                                    <fieldset>
                                        <section>
                                            <label class="label">Text input</label>
                                            <label class="input state-error">
                                                <input type="text">
                                            </label>
                                            <div class="note note-error">This is a required field.</div>
                                        </section>

                                        <section>
                                            <label class="label">File input</label>
                                            <label for="file" class="input input-file state-error">
                                                <div class="button"><input type="file" id="file" onchange="this.parentNode.nextSibling.value = this.value">
                                                    Browse</div><input type="text" readonly="">
                                            </label>
                                            <div class="note note-error">File size must be less than 3Mb.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Select</label>
                                            <label class="select state-error">
                                                <select name="" id="">
                                                    <option value="0">Choose name</option>
                                                    <option value="1">Alexandra</option>
                                                    <option value="2">Alice</option>
                                                    <option value="3">Anastasia</option>
                                                    <option value="4">Avelina</option>
                                                </select>
                                                <i></i>
                                            </label>
                                            <div class="note note-error">You must select an option.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Textarea</label>
                                            <label class="textarea state-error">
                                                <textarea rows="3"></textarea>
                                            </label>
                                            <div class="note note-error">This is a required field.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Radios</label>
                                            <div class="row">
                                                <div class="col col-4">
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Alexandra</label>
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Alice</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Avelina</label>
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Basilia</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Cassandra</label>
                                                    <label class="radio state-error"><input type="radio" name="radio"><i></i>
                                                        Clemencia</label>
                                                </div>
                                            </div>
                                            <div class="note note-error">You must select one option.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Checkboxes</label>
                                            <div class="row">
                                                <div class="col col-4">
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Alexandra</label>
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Alice</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Avelina</label>
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Basilia</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Cassandra</label>
                                                    <label class="checkbox state-error"><input type="checkbox" name="checkbox"><i></i>
                                                        Clemencia</label>
                                                </div>
                                            </div>
                                            <div class="note note-error">You must select at least one option.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-5">
                                                <label class="label">Toggles based on radios</label>
                                                <label class="toggle state-error"><input type="radio" name="radio-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Alexandra</label>
                                                <label class="toggle state-error"><input type="radio" name="radio-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Anastasia</label>
                                                <label class="toggle state-error"><input type="radio" name="radio-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Avelina</label>
                                                <div class="note note-error">You must select one option.</div>
                                            </section>

                                            <div class="col col-2"></div>

                                            <section class="col col-5">
                                                <label class="label">Toggles based on checkboxes</label>
                                                <label class="toggle state-error"><input type="checkbox" name="checkbox-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Cassandra</label>
                                                <label class="toggle state-error"><input type="checkbox" name="checkbox-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Clemencia</label>
                                                <label class="toggle state-error"><input type="checkbox" name="checkbox-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Desiderata</label>
                                                <div class="note note-error">You must select at least one option.</div>
                                            </section>
                                        </div>
                                    </fieldset>

                                    <footer>
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                        <button type="button" class="btn btn-default" onclick="window.history.back ( ) ;">
                                            Back</button>
                                    </footer>
                                </form>
                                    <!--/ Error states for elements -->

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
                    <div class="jarviswidget" id="wid-id-2" data-widget-colorbutton="false" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-check txt-color-green"></i> </span>
                            <h2>Success States </h2>

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

                                    <!-- Success states for elements -->
                                <form action="" class="smart-form">
                                    <header>Success states for elements</header>

                                    <fieldset>
                                        <section>
                                            <label class="label">Text input</label>
                                            <label class="input state-success">
                                                <input type="text">
                                            </label>
                                            <div class="note note-success">This is a required field.</div>
                                        </section>

                                        <section>
                                            <label class="label">File input</label>
                                            <label for="file" class="input input-file state-success">
                                                <div class="button"><input type="file" id="file" onchange="this.parentNode.nextSibling.value = this.value">
                                                    Browse</div><input type="text" readonly="">
                                            </label>
                                            <div class="note note-success">This is a required field.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Select</label>
                                            <label class="select state-success">
                                                <select name="" id="">
                                                    <option value="0">Choose name</option>
                                                    <option value="1">Alexandra</option>
                                                    <option value="2">Alice</option>
                                                    <option value="3" selected="">Anastasia</option>
                                                    <option value="4">Avelina</option>
                                                </select>
                                                <i></i>
                                            </label>
                                            <div class="note note-success">Thanks for your selection.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Textarea</label>
                                            <label class="textarea state-success">
                                                <textarea rows="3"></textarea>
                                            </label>
                                            <div class="note note-success">Thanks for your text.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Radios</label>
                                            <div class="row">
                                                <div class="col col-4">
                                                    <label class="radio state-success"><input type="radio" name="radio"><i></i>
          """),
format.raw("""                                              Alexandra</label>
                                                    <label class="radio state-success"><input type="radio" name="radio"><i></i>
                                                        Alice</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="radio state-success"><input type="radio" name="radio" checked=""><i></i>
                                                        Avelina</label>
                                                    <label class="radio state-success"><input type="radio" name="radio"><i></i>
                                                        Basilia</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="radio state-success"><input type="radio" name="radio"><i></i>
                                                        Cassandra</label>
                                                    <label class="radio state-success"><input type="radio" name="radio"><i></i>
                                                        Clemencia</label>
                                                </div>
                                            </div>
                                            <div class="note note-success">Thanks for your selection.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <label class="label">Checkboxes</label>
                                            <div class="row">
                                                <div class="col col-4">
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox"><i></i>
                                                        Alexandra</label>
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox" checked=""><i></i>
                                                        Alice</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox"><i></i>
                                                        Avelina</label>
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox"><i></i>
                                                        Basilia</label>
                                                </div>
                                                <div class="col col-4">
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox" checked=""><i></i>
                                                        Cassandra</label>
                                                    <label class="checkbox state-success"><input type="checkbox" name="checkbox"><i></i>
                                                        Clemencia</label>
                                                </div>
                                            </div>
                                            <div class="note note-success">Thanks for your selection.</div>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-5">
                                                <label class="label">Toggles based on radios</label>
                                                <label class="toggle state-success"><input type="radio" name="radio-toggle" checked=""><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Alexandra</label>
                                                <label class="toggle state-success"><input type="radio" name="radio-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Anastasia</label>
                                                <label class="toggle state-success"><input type="radio" name="radio-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Avelina</label>
                                                <div class="note note-success">Thanks for your selection.</div>
                                            </section>

                                            <div class="col col-2"></div>

                                            <section class="col col-5">
                                                <label class="label">Toggles based on checkboxes</label>
                                                <label class="toggle state-success"><input type="checkbox" name="checkbox-toggle" checked=""><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Cassandra</label>
                                                <label class="toggle state-success"><input type="checkbox" name="checkbox-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Clemencia</label>
                                                <label class="toggle state-success"><input type="checkbox" name="checkbox-toggle"><i data-swchon-text="ON" data-swchoff-text="OFF"></i>
                                                    Desiderata</label>
                                                <div class="note note-success">Thanks for your selection.</div>
                                            </section>
                                        </div>
                                    </fieldset>

                                    <footer>
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                        <button type="button" class="btn btn-default" onclick="window.history.back ( ) ;">
                                            Back</button>
                                    </footer>
                                </form>
                                    <!--/ Success states for elements -->

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
                  DATE: Thu Aug 28 21:08:48 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/validation.scala.html
                  HASH: a7960cface53d00db1b4f95d016034d0cc5f69d9
                  MATRIX: 515->1|603->24|618->31|698->35|734->45|1182->465|1211->466|1240->467|1285->484|1314->485|2005->1148|2034->1149|2072->1159|2119->1178|2148->1179|2186->1189|2353->1328|2382->1329|2420->1339|2509->1400|2538->1401|2576->1411|2801->1608|2830->1609|2867->1619|2896->1620|2925->1621|3085->18|3117->1742|3145->1744|3175->1765|3215->1767|3247->1772
                  LINES: 19->1|21->2|21->2|23->2|25->4|38->17|38->17|38->17|38->17|38->17|63->42|63->42|64->43|65->44|65->44|66->45|69->48|69->48|70->49|71->50|71->50|72->51|83->62|83->62|85->64|85->64|85->64|96->1|97->74|98->75|98->75|98->75|99->76
                  -- GENERATED --
              */
          