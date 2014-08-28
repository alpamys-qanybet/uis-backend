
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
object plugins extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-pencil-square-o fa-fw "></i>
                Forms
                <span>&gt;
                    Form Plugins
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

                    <!-- NEW COL START -->
                <article class="col-sm-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>x-ediable </h2>

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
                                <div class="widget-body-toolbar">

                                    <div class="row">

                                        <div class="col-sm-6">
                                            <button id="enable" class="btn btn btn-default">
                                                enable / disable
                                            </button>
                                        </div>
                                        <div class="col-sm-6 text-right">

                                            <div class="onoffswitch-container">
                                                <span class="onoffswitch-title">Auto Open Next</span>
                                                <span class="onoffswitch">
                                                    <input type="checkbox" class="onoffswitch-checkbox" id="autoopen">
                                                    <label class="onoffswitch-label" for="autoopen">
                                                        <span class="onoffswitch-inner" data-swchon-text="ON" data-swchoff-text="OFF"></span>
                                                        <span class="onoffswitch-switch"></span>
                                                    </label>
                                                </span>


                                            </div>

                                            <div class="onoffswitch-container">
                                                <span class="onoffswitch-title">Open Inline</span>
                                                <span class="onoffswitch">
                                                    <input type="checkbox" class="onoffswitch-checkbox" id="inline">
                                                    <label class="onoffswitch-label" for="inline">
                                                        <span class="onoffswitch-inner" data-swchon-text="ON" data-swchoff-text="OFF"></span>
                                                        <span class="onoffswitch-switch"></span>
                                                    </label>
                                                </span>
                                            </div>

                                        </div>

                                    </div>


                                </div>

                                <table id="user" class="table table-bordered table-striped" style="clear: both">
                                    <tbody>
                                        <tr>
                                            <td style="width:35%;">Simple text field</td>
                                            <td style="width:65%"><a href="form-x-editable.html#" id="username" data-type="text" data-pk="1" data-original-title="Enter username" class="editable editable-click">superuser</a></td>
                                        </tr>
                                        <tr>
                                            <td>Empty text field, required</td>
                                            <td><a href="form-x-editable.html#" id="firstname" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-original-title="Enter your firstname" class="editable editable-click editable-empty">Empty</a></td>
                                        </tr>
                                        <tr>
                                            <td>Select, local array, custom display</td>
                                            <td><a href="form-x-editable.html#" id="sex" data-type="select" data-pk="1" data-value="" data-original-title="Select sex" class="editable editable-click" style="color: rgb(128, 128, 128);">not selected</a></td>
                                        </tr>
                                        <tr>
                                            <td>Select, remote array, no buttons</td>
                                            <td><a href="form-x-editable.html#" id="group" data-type="select" data-pk="1" data-value="5" data-source="/groups" data-original-title="Select group" class="editable editable-click">Admin</a></td>
                                        </tr>
                                        <tr>
                                            <td>Select, error while loading</td>
                                            <td><a href="form-x-editable.html#" id="status" data-type="select" data-pk="1" data-value="0" data-source="/status" data-original-title="Select status" class="editable editable-click">Active</a></td>
                                        </tr>

                                        <tr>
                                            <td>Datepicker</td>
                                            <td><a href="#" id="vacation" data-type="date" data-viewformat="dd.mm.yyyy" data-pk="1" data-placement="right" data-original-title="When you want vacation to start?" class="editable editable-click">25.02.2013</a></td>
                                        </tr>
                                        <tr>
                                            <td>Combodate (date)</td>
                                            <td><a href="form-x-editable.html#" id="dob" data-type="combodate" data-value="1984-05-15" data-format="YYYY-MM-DD" data-viewformat="DD/MM/YYYY" data-template="D / MMM / YYYY" data-pk="1" data-original-title="Select Date of birth" class="editable editable-click">15/05/1984</a></td>
                                        </tr>
                                        <tr>
                                            <td>Combodate (datetime)</td>
                                            <td><a href="form-x-editable.html#" id="event" data-type="combodate" data-template="D MMM YYYY  HH:mm" data-format="YYYY-MM-DD HH:mm" data-viewformat="MMM D, YYYY, HH:mm" data-pk="1" data-original-title="Setup event date and time" class="editable editable-click editable-empty">Empty</a></td>
                                        </tr>

                                        <tr>
                                            <td>Textarea, buttons below. Submit by <i>ctrl+enter</i></td>
                                            <td><a href="form-x-editable.html#" id="comments" data-type="textarea" data-pk="1" data-placeholder="Your comments here..." data-original-title="Enter comments" class="editable editable-pre-wrapped editable-click">awesome user!</a></td>
                                        </tr>

                                        <tr>
                                            <td>Twitter typeahead.js</td>
                                            <td><a href="form-x-editable.html#" id="state2" data-type="typeaheadjs" data-pk="1" data-placement="right" data-original-title="Start typing State.." class="editable editable-click">California</a></td>
                                        </tr>

                                        <tr>
                                            <td>Checklist</td>
                                            <td><a href="form-x-editable.html#" id="fruits" data-type="checklist" data-value="2,3" data-original-title="Select fruits" class="editable editable-click">peach<br>apple</a></td>
                                        </tr>

                                        <tr>
                                            <td>Select2 (tags mode)</td>
                                            <td><a href="form-x-editable.html#" id="tags" data-type="select2" data-pk="1" data-original-title="Enter tags" class="editable editable-click">html, javascript</a></td>
                                        </tr>

                                        <tr>
                                            <td>Select2 (dropdown mode)</td>
                                            <td><a href="form-x-editable.html#" id="country" data-type="select2" data-pk="1" data-select-search="true" data-value="BS" data-original-title="Select country" class="editable editable-click">Bahamas</a></td>
                                        </tr>

                                        <tr>
                                            <td>Custom input, several fields</td>
                                            <td><a href="form-x-editable.html#" id="address" data-type="address" data-pk="1" data-original-title="Please, fill address" class="editable editable-click"><b>Moscow</b>, Lenina st., bld. 12</a></td>
                                        </tr>

                                    </tbody>
                                </table>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Sliders </h2>

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

                                <form>

                                    <fieldset>
                                        <legend>
                                            Smart Scale Slider
                                        </legend>
                                        <div class="row">
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <span class="irs irs-with-grid" id="irs-1"><span class="irs"><span class="irs-line"><span class="irs-line-left"></span><span class="irs-line-mid"></span><span class="irs-line-right"></span></span><span class="irs-min" style="display: block;">$0</span><span class="irs-max" style="display: block;">$5000</span><span class="irs-from" style="left: 81px; display: block;">$1000</span><span class="irs-to" style="left: 371px; display: block;">$4000</span><span class="irs-single" style="left: 203px; display: none;">$1000 — $4000</span><span class="irs-diapason" style="left: 101px; width: 290px;"></span><span class="irs-slider from" style="left: 97px;"></span><span class="irs-slider to" style="left: 387px;"></span></span><span class="irs-grid"><span class="irs-grid-pol small" style="left: 0px;"></span><span class="irs-grid-pol small" style="left: 24px;"></span><span class="irs-grid-pol small" style="left: 49px;"></span><span class="irs-grid-pol small" style="left: 73px;"></span><span class="irs-grid-pol small" style="left: 98px;"></span><span class="irs-grid-pol small" style="left: 123px;"></span><span class="irs-grid-pol small" style="left: 147px;"></span><span class="irs-grid-pol small" style="left: 172px;"></span><span class="irs-grid-pol small" style="left: 196px;"></span><span class="irs-grid-pol small" style="left: 221px;"></span><span class="irs-grid-pol small" style="left: 246px;"></span><span class="irs-grid-pol small" style="left: 270px;"></span><span class="irs-grid-pol small" style="left: 295px;"></span><span class="irs-grid-pol small" style="left: 319px;"></span><span class="irs-grid-pol small" style="left: 344px;"></span><span class="irs-grid-pol small" style="left: 369px;"></span><span class="irs-grid-pol small" style="left: 393px;"></span><span class="irs-grid-pol small" style="left: 418px;"></span><span class="irs-grid-pol small" style="left: 442px;"></span><span class="irs-grid-pol small" style="left: 467px;"></span><span class="irs-grid-pol small" style="left: 491px;"></span><span class="irs-grid-pol" style="left: 0px;"></span><span class="irs-grid-text" style="left: 0px; text-align: left;">0</span><span class="irs-grid-pol" style="left: 123px;"></span><span class="irs-grid-text" style="left: 73px;">1250</span><span class="irs-grid-pol" style="left: 246px;"></span><span class="irs-grid-text" style="left: 196px;">2500</span><span class="irs-grid-pol" style="left: 369px;"></span><span class="irs-grid-text" style="left: 319px;">3750</span><span class="irs-grid-pol" style="left: 491px;"></span><span class="irs-grid-text" style="left: 391px; text-align: right;">5000</span></span></span><input id="range-slider-1" type="text" name="range_1" value="1000;4000" style="display: none;">
                                                </div>
                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <span class="irs irs-with-grid" id="irs-2"><span class="irs"><span class="irs-line"><span class="irs-line-left"></span><span class="irs-line-mid"></span><span class="irs-line-right"></span></span><span class="irs-min" style="display: block;">1 000 €</span><span class="irs-max" style="display: none;">100 000 €</span><span class="irs-from" style="left: 120px; display: block;">30 000 €</span><span class="irs-to" style="left: 413px; display: block;">90 000 €</span><span class="irs-single" style="left: 242px; display: none;">30 000 — 90 000 €</span><span class="irs-diapason" style="left: 146px; width: 293px;"></span><span class="irs-slider from" style="left: 142px;"></span><span class="irs-slider to" style="left: 435px;"></span></span><span class="irs-grid"><span class="irs-grid-pol small" style="left: 0px;"></span><span class="irs-grid-pol small" style="left: 24px;"></span><span class="irs-grid-pol small" style="left: 49px;"></span><span class="irs-grid-pol small" style="left: 73px;"></span><span class="irs-grid-pol small" style="left: 98px;"></span><span class="irs-grid-pol small" style="left: 123px;"></span><span class="irs-grid-pol small" style="left: 147px;"></span><span class="irs-grid-pol small" style="left: 172px;"></span><span class="irs-grid-pol small" style="left: 196px;"></span><span class="irs-grid-pol small" style="left: 221px;"></span><span class="irs-grid-pol small" style="left: 246px;"></span><span class="irs-grid-pol small" style="left: 270px;"></span><span class="irs-grid-pol small" style="left: 295px;"></span><span class="irs-grid-pol small" style="left: 319px;"></span><span class="irs-grid-pol small" style="left: 344px;"></span><span class="irs-grid-pol small" style="left: 369px;"></span><span class="irs-grid-pol small" style="left: 393px;"></span><span class="irs-grid-pol small" style="left: 418px;"></span><span class="irs-grid-pol small" style="left: 442px;"></span><span class="irs-grid-pol small" style="left: 467px;"></span><span class="irs-grid-pol small" style="left: 491px;"></span><span class="irs-grid-pol" style="left: 0px;"></span><span class="irs-grid-text" style="left: 0px; text-align: left;">1 000</span><span class="irs-grid-pol" style="left: 123px;"></span><span class="irs-grid-text" style="left: 73px;">26 000</span><span class="irs-grid-pol" style="left: 246px;"></span><span class="irs-grid-text" style="left: 196px;">50 500</span><span class="irs-grid-pol" style="left: 369px;"></span><span class="irs-grid-text" style="left: 319px;">75 500</span><span class="irs-grid-pol" style="left: 491px;"></span><span class="irs-grid-text" style="left: 391px; text-align: right;">100 000</span></span></span><input id="range-slider-2" type="text" name="range_2" value="30000;90000" data-type="double" data-step="500" data-p"""),
format.raw("""ostfix=" €" data-from="30000" data-to="90000" data-hasgrid="true" style="display: none;">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <span class="irs irs-with-grid" id="irs-3"><span class="irs"><span class="irs-line"><span class="irs-line-left"></span><span class="irs-line-mid"></span><span class="irs-line-right"></span></span><span class="irs-min" style="display: block;">0 mm</span><span class="irs-max" style="display: block;">10 mm</span><span class="irs-from" style="display: none;">0</span><span class="irs-to" style="display: none;">0</span><span class="irs-single" style="left: 92px;">2.3 mm</span><span class="irs-slider single" style="left: 111px;"></span></span><span class="irs-grid"><span class="irs-grid-pol small" style="left: 0px;"></span><span class="irs-grid-pol small" style="left: 24px;"></span><span class="irs-grid-pol small" style="left: 49px;"></span><span class="irs-grid-pol small" style="left: 73px;"></span><span class="irs-grid-pol small" style="left: 98px;"></span><span class="irs-grid-pol small" style="left: 123px;"></span><span class="irs-grid-pol small" style="left: 147px;"></span><span class="irs-grid-pol small" style="left: 172px;"></span><span class="irs-grid-pol small" style="left: 196px;"></span><span class="irs-grid-pol small" style="left: 221px;"></span><span class="irs-grid-pol small" style="left: 246px;"></span><span class="irs-grid-pol small" style="left: 270px;"></span><span class="irs-grid-pol small" style="left: 295px;"></span><span class="irs-grid-pol small" style="left: 319px;"></span><span class="irs-grid-pol small" style="left: 344px;"></span><span class="irs-grid-pol small" style="left: 369px;"></span><span class="irs-grid-pol small" style="left: 393px;"></span><span class="irs-grid-pol small" style="left: 418px;"></span><span class="irs-grid-pol small" style="left: 442px;"></span><span class="irs-grid-pol small" style="left: 467px;"></span><span class="irs-grid-pol small" style="left: 491px;"></span><span class="irs-grid-pol" style="left: 0px;"></span><span class="irs-grid-text" style="left: 0px; text-align: left;">0</span><span class="irs-grid-pol" style="left: 123px;"></span><span class="irs-grid-text" style="left: 73px;">2.5</span><span class="irs-grid-pol" style="left: 246px;"></span><span class="irs-grid-text" style="left: 196px;">5</span><span class="irs-grid-pol" style="left: 369px;"></span><span class="irs-grid-text" style="left: 319px;">7.5</span><span class="irs-grid-pol" style="left: 491px;"></span><span class="irs-grid-text" style="left: 391px; text-align: right;">10</span></span></span><input id="range-slider-3" type="text" name="range_2a" value="2" style="display: none;">
                                                </div>
                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <span class="irs irs-with-grid" id="irs-4"><span class="irs"><span class="irs-line"><span class="irs-line-left"></span><span class="irs-line-mid"></span><span class="irs-line-right"></span></span><span class="irs-min" style="display: block;">-50°</span><span class="irs-max" style="display: block;">50°</span><span class="irs-from" style="left: 260px; display: block;">5°</span><span class="irs-to" style="left: 354px; display: block;">25°</span><span class="irs-single" style="left: 294.5px; display: none;">5 — 25°</span><span class="irs-diapason" style="left: 270px; width: 97px;"></span><span class="irs-slider from" style="left: 266px;"></span><span class="irs-slider to" style="left: 363px;"></span></span><span class="irs-grid"><span class="irs-grid-pol small" style="left: 0px;"></span><span class="irs-grid-pol small" style="left: 24px;"></span><span class="irs-grid-pol small" style="left: 49px;"></span><span class="irs-grid-pol small" style="left: 73px;"></span><span class="irs-grid-pol small" style="left: 98px;"></span><span class="irs-grid-pol small" style="left: 123px;"></span><span class="irs-grid-pol small" style="left: 147px;"></span><span class="irs-grid-pol small" style="left: 172px;"></span><span class="irs-grid-pol small" style="left: 196px;"></span><span class="irs-grid-pol small" style="left: 221px;"></span><span class="irs-grid-pol small" style="left: 246px;"></span><span class="irs-grid-pol small" style="left: 270px;"></span><span class="irs-grid-pol small" style="left: 295px;"></span><span class="irs-grid-pol small" style="left: 319px;"></span><span class="irs-grid-pol small" style="left: 344px;"></span><span class="irs-grid-pol small" style="left: 369px;"></span><span class="irs-grid-pol small" style="left: 393px;"></span><span class="irs-grid-pol small" style="left: 418px;"></span><span class="irs-grid-pol small" style="left: 442px;"></span><span class="irs-grid-pol small" style="left: 467px;"></span><span class="irs-grid-pol small" style="left: 491px;"></span><span class="irs-grid-pol" style="left: 0px;"></span><span class="irs-grid-text" style="left: 0px; text-align: left;">-50</span><span class="irs-grid-pol" style="left: 123px;"></span><span class="irs-grid-text" style="left: 73px;">-25</span><span class="irs-grid-pol" style="left: 246px;"></span><span class="irs-grid-text" style="left: 196px;">0</span><span class="irs-grid-pol" style="left: 369px;"></span><span class="irs-grid-text" style="left: 319px;">25</span><span class="irs-grid-pol" style="left: 491px;"></span><span class="irs-grid-text" style="left: 391px; text-align: right;">50</span></span></span><input id="range-slider-4" type="text" name="range_4" value="5;25" style="display: none;">
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-12">

                                                <div class="form-group">
                                                    <span class="irs irs-with-grid" id="irs-5"><span class="irs"><span class="irs-line"><span class="irs-line-left"></span><span class="irs-line-mid"></span><span class="irs-line-right"></span></span><span class="irs-min" style="display: none;">0 mm</span><span class="irs-max" style="display: block;">10 mm</span><span class="irs-from" style="display: none;">0</span><span class="irs-to" style="display: none;">0</span><span class="irs-single" style="left: 0px;">0 mm</span><span class="irs-slider single" style="left: 0px;"></span></span><span class="irs-grid"><span class="irs-grid-pol small" style="left: 0px;"></span><span class="irs-grid-pol small" style="left: 50px;"></span><span class="irs-grid-pol small" style="left: 101px;"></span><span class="irs-grid-pol small" style="left: 151px;"></span><span class="irs-grid-pol small" style="left: 202px;"></span><span class="irs-grid-pol small" style="left: 252px;"></span><span class="irs-grid-pol small" style="left: 303px;"></span><span class="irs-grid-pol small" style="left: 353px;"></span><span class="irs-grid-pol small" style="left: 404px;"></span><span class="irs-grid-pol small" style="left: 454px;"></span><span class="irs-grid-pol small" style="left: 505px;"></span><span class="irs-grid-pol small" style="left: 555px;"></span><span class="irs-grid-pol small" style="left: 606px;"></span><span class="irs-grid-pol small" style="left: 656px;"></span><span class="irs-grid-pol small" style="left: 707px;"></span><span class="irs-grid-pol small" style="left: 757px;"></span><span class="irs-grid-pol small" style="left: 808px;"></span><span class="irs-grid-pol small" style="left: 858px;"></span><span class="irs-grid-pol small" style="left: 909px;"></span><span class="irs-grid-pol small" style="left: 959px;"></span><span class="irs-grid-pol small" style="left: 1009px;"></span><span class="irs-grid-pol" style="left: 0px;"></span><span class="irs-grid-text" style="left: 0px; text-align: left;">0</span><span class="irs-grid-pol" style="left: 252px;"></span><span class="irs-grid-text" style="left: 202px;">2.5</span><span class="irs-grid-pol" style="left: 505px;"></span><span class="irs-grid-text" style="left: 455px;">5</span><span class="irs-grid-pol" style="left: 757px;"></span><span class="irs-grid-text" style="left: 707px;">7.5</span><span class="irs-grid-pol" style="left: 1009px;"></span><span class="irs-grid-text" style="left: 909px; text-align: right;">10</span></span></span><input id="range-slider-5" type="text" name="range_5a" value="0" style="display: none;">
                                                </div>
                                            </div>
                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            noScale Slider
                                        </legend>
                                        <div class="row">
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <label>Default</label>
                                                    <div id="nouislider-1" class="noUiSlider noUi-target"><div class="noUi-base noUi-background noUi-connect-upper noUi-horizontal"><div class="noUi-origin noUi-origin-lower noUi-connect" style="left: 54.08163265306123%;"><div class="noUi-handle noUi-handle-lower"></div></div></div></div>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <label>Range slider (<span class="nouislider-value">20 - 60</span>)</label>
                                                    <div id="nouislider-3" class="noUiSlider noUi-target"><div class="noUi-base noUi-background noUi-connect-upper noUi-horizontal"><div class="noUi-origin noUi-origin-lower noUi-connect" style="left: 26.400000000000002%;"><div class="noUi-handle noUi-handle-lower"></div></div><div class="noUi-origin noUi-origin-upper" style="left: 77.60000000000001%;"><div class="noUi-handle noUi-handle-upper"></div></div></div></div>
                                                </div>

                                            </div>
                                        </div>


                                        <div class="row">
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <label>Default Slider (disabled)</label>
                                                    <div id="nouislider-4" class="noUiSlider noUi-target" disabled="disabled"><div class="noUi-base noUi-background noUi-horizontal"><div class="noUi-origin noUi-origin-lower" style="left: 50%;"><div class="noUi-handle noUi-handle-lower"></div></div></div></div>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <label>Skips a beat</label>
                                                    <div id="nouislider-2" class="noUiSlider noUi-target"><div class="noUi-base noUi-background noUi-connect-upper noUi-horizontal"><div class="noUi-origin noUi-origin-lower noUi-connect" style="left: 20%;"><div class="noUi-handle noUi-handle-lower"></div></div><div class="noUi-origin noUi-origin-upper" style="left: 40%;"><div class="noUi-handle noUi-handle-upper"></div></div></div></div>
                                                </div>

                                            </div>
                                        </div>
                                    </fieldset>

                                    <fieldset class="margin-top-10">

                                        <legend>
                                            JQuery UI Slider
                                        </legend>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <label><code>.slider .slider-danger</code></label>
                                                <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-danger" id="sal" value="" data-slider-min="10" data-slider-max="1000" data-slider-step="1" data-slider-value="[50,450]" data-slider-handle="round"><div class="slider-track"><div class="slider-selection" style="left: 4.040404040404041%; width: 40.4040404040404%;"></div><div class="slider-handle round" style="left: 4.040404040404041%;"></div><div class="slider-handle round" style="left: 44.44444444444444%;"></div></div><div class="tooltip top" style="top: -34px; left: 89.27272727272728px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">50 : 450</div></div></div>
                                            </div>
                                            <div class="col-sm-6">
                                                <label><code>.slider .slider-success</code></label>
                                                <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-success" id="sa2" value="" data-slider-min="10" data-slider-max="1000" data-slider-step="1" data-slider-value="[150,760]" data-slider-handle="triangle"><div class="slider-track"><div class="slider-selection" style="left: 14.141414141414142%; width: 61.616161616161605%;"></div><div class="slider-handle triangle" style="left: 14.141414141414142%;"></div><div class="slider-handle triangle" style="left: 75.75757575757575%;"></div></div><div class="tooltip top" style="top: -34px; left: 188.15151515151516px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">150 : 760</div></div></div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <label><code>.slider .slider-warning</code></label>
                                                <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-warning" id="sa3" value="" data-slider-min="1" data-slider-max="300" data-slider-value="150" data-slider-selection="before" data-slider-handle="squar"><div class="slider-track"><div class="slider-selection" style="left: 0%; width: 49.83277591973244%;"></div><div class="slider-handle" style="left: 49.83277591973244%;"></div><div class="slider-handle hide" style="left: 0%;"></div></div><div class="tooltip top" style="top: -34px; left: 226.17725752508363px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">150</div></div></div>
                                            </div>
                                            <div class="col-sm-6">
                                                <label><code>.slider .slider-info</code></label>
                                                <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-info" id="sa4" value="" data-slider-min="1" data-slider-max="300" data-slider-value="150" data-slider-selection="after" data-slider-handle="round"><div class="slider-track"><div class="slider-selection" style="left: 49.83277591973244%; width: 50.16722408026756%;"></div><div class="slider-handle round" style="left: 49.83277591973244%;"></div><div class="slider-handle round hide" style="left: 100%;"></div></div><div class="tooltip top" style="top: -34px; left: 226.17725752508363px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">150</div></div></div>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-12">
                                                <label><code>.slider .slider-primary</code></label>
                                                <div class="slider slider-horizontal" style="width: 179px;"><input type="text" class="slider slider-primary" id="sa5" value="" data-slider-min="1" data-slider-max="300" data-slider-value="150" data-slider-selection="before" data-slider-handle="round"><div class="slider-track"><div class="slider-selection" style="left: 0%; width: 49.83277591973244%;"></div><div class="slider-handle round" style="left: 49.83277591973244%;"></div><div class="slider-handle round hide" style="left: 0%;"></div></div><div class="tooltip top" style="top: -34px; left: 484.31103678929765px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">150</div></div></div>
                                            </div>
                                        </div>

                                        <div class="row">

                                            <div class="col-sm-6">

                                                <pre><strong class="margin-top-10 margin-bottom-10 font-lg">Usage</strong><br>
                                                    <code><strong>&lt;input data-slider-min="10" ..  /&gt;</strong></code>
                                                    data-slider-orientation="vertical" <span class="text-muted"> // vertical or horizontal</span>
                                                    data-slider-step="1"               <span class="text-muted"> // increment step</span>
                                                    data-slider-min="10"               <span class="text-muted"> // slider min value</span>
                                                    data-slider-max="500"              <span class="text-muted"> // slider max value</span>
                                                    data-slider-value="315"            <span class="text-muted"> // handler position on slider</span>
                                                    data-slider-selection = "after"    <span class="text-muted"> // handler position on slider</span>
                                                    data-slider-handle="round"         <span class="text-muted"> // round or square</span>
                                                    data-slider-tooltip = "show"       <span class="text-muted"> // show or hide</span>
                                                </pre>
                                            </div>

                                            <div class="col-sm-6">

                                                <div class="well">

                                                    <table>
                                                        <tbody>
                                                            <tr>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider slider-danger" value="" data-slider-min="-2"""),
format.raw("""0" data-slider-max="20" data-slider-step="1" data-slider-value="-13" data-slider-orientation="vertical" data-slider-selection="after" data-slider-handle="square" data-slider-tooltip="hide"><div class="slider-track"><div class="slider-selection" style="top: 17.5%; height: 82.5%;"></div><div class="slider-handle" style="top: 17.5%;"></div><div class="slider-handle hide" style="top: 100%;"></div></div><div class="tooltip right hide" style="left: 100%; top: 24.25px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-13</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="-11" data-slider-orientation="vertical" data-slider-selection="after" data-slider-handle="triangle" data-slider-tooltip="hide"><div class="slider-track"><div class="slider-selection" style="top: 22.5%; height: 77.5%;"></div><div class="slider-handle triangle" style="top: 22.5%;"></div><div class="slider-handle triangle hide" style="top: 100%;"></div></div><div class="tooltip right hide" style="left: 100%; top: 34.75px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-11</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="-6" data-slider-orientation="vertical" data-slider-selection="after" data-slider-tooltip="hide"><div class="slider-track"><div class="slider-selection" style="top: 35%; height: 65%;"></div><div class="slider-handle round" style="top: 35%;"></div><div class="slider-handle round hide" style="top: 100%;"></div></div><div class="tooltip right hide" style="left: 100%; top: 61px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-6</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="-4" data-slider-orientation="vertical" data-slider-selection="after" data-slider-tooltip="hide"><div class="slider-track"><div class="slider-selection" style="top: 40%; height: 60%;"></div><div class="slider-handle round" style="top: 40%;"></div><div class="slider-handle round hide" style="top: 100%;"></div></div><div class="tooltip right hide" style="left: 100%; top: 71.5px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-4</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="-6" data-slider-orientation="vertical" data-slider-selection="after" data-slider-tooltip="hide"><div class="slider-track"><div class="slider-selection" style="top: 35%; height: 65%;"></div><div class="slider-handle round" style="top: 35%;"></div><div class="slider-handle round hide" style="top: 100%;"></div></div><div class="tooltip right hide" style="left: 100%; top: 61px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-6</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider slider-warning" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="[-11, 19]" data-slider-orientation="vertical" data-slider-selection="after" data-slider-handle="triangle" data-slider-tooltip="show"><div class="slider-track"><div class="slider-selection" style="top: 22.5%; height: 75%;"></div><div class="slider-handle triangle" style="top: 22.5%;"></div><div class="slider-handle triangle" style="top: 97.5%;"></div></div><div class="tooltip right" style="left: 100%; top: 113.5px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-11 : 19</div></div></div>
                                                                </td>
                                                                <td>
                                                                    <div class="slider slider-vertical"><input type="text" class="slider slider-success" value="" data-slider-min="-20" data-slider-max="20" data-slider-step="1" data-slider-value="-17" data-slider-orientation="vertical" data-slider-selection="after" data-slider-tooltip="show"><div class="slider-track"><div class="slider-selection" style="top: 7.5%; height: 92.5%;"></div><div class="slider-handle round" style="top: 7.5%;"></div><div class="slider-handle round hide" style="top: 100%;"></div></div><div class="tooltip right" style="left: 100%; top: 3.25px;"><div class="tooltip-arrow"></div><div class="tooltip-inner">-17</div></div></div>
                                                                </td>
                                                            </tr>
                                                        </tbody>
                                                    </table>

                                                </div>

                                            </div>

                                        </div>
                                    </fieldset>


                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- END COL -->

            </div>

                <!-- end row -->

                <!-- START ROW -->

            <div class="row">

                    <!-- NEW COL START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-2" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Plugins &amp; Enhancers </h2>

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

                                <form class="">

                                    <fieldset>
                                        <legend>
                                            Select 2
                                        </legend>

                                        <div class="form-group">
                                            <label>Select2 Plugin (select)</label>
                                            <div class="select2-container select2" id="s2id_autogen7" style="width: 100%;"><a href="javascript:void(0)" class="select2-choice" tabindex="-1">   <span class="select2-chosen" id="select2-chosen-8">Alaska</span><abbr class="select2-search-choice-close"></abbr>   <span class="select2-arrow" role="presentation"><b role="presentation"></b></span></a><label for="s2id_autogen8" class="select2-offscreen"></label><input class="select2-focusser select2-offscreen" type="text" aria-haspopup="true" role="button" aria-labelledby="select2-chosen-8" id="s2id_autogen8"><div class="select2-drop select2-display-none select2-with-searchbox">   <div class="select2-search">       <label for="s2id_autogen8_search" class="select2-offscreen"></label>       <input type="text" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" class="select2-input" role="combobox" aria-expanded="true" aria-autocomplete="list" aria-owns="select2-results-8" id="s2id_autogen8_search" placeholder="">   </div>   <ul class="select2-results" role="listbox" id="select2-results-8">   </ul></div></div><select style="width:100%" class="select2 select2-offscreen" tabindex="-1" title="">
                                            <optgroup label="Alaskan/Hawaiian Time Zone">
                                                <option value="AK">Alaska</option>
                                                <option value="HI">Hawaii</option>
                                            </optgroup>
                                            <optgroup label="Pacific Time Zone">
                                                <option value="CA">California</option>
                                                <option value="NV">Nevada</option>
                                                <option value="OR">Oregon</option>
                                                <option value="WA">Washington</option>
                                            </optgroup>
                                            <optgroup label="Mountain Time Zone">
                                                <option value="AZ">Arizona</option>
                                                <option value="CO">Colorado</option>
                                                <option value="ID">Idaho</option>
                                                <option value="MT">Montana</option><option value="NE">Nebraska</option>
                                                <option value="NM">New Mexico</option>
                                                <option value="ND">North Dakota</option>
                                                <option value="UT">Utah</option>
                                                <option value="WY">Wyoming</option>
                                            </optgroup>
                                            <optgroup label="Central Time Zone">
                                                <option value="AL">Alabama</option>
                                                <option value="AR">Arkansas</option>
                                                <option value="IL">Illinois</option>
                                                <option value="IA">Iowa</option>
                                                <option value="KS">Kansas</option>
                                                <option value="KY">Kentucky</option>
                                                <option value="LA">Louisiana</option>
                                                <option value="MN">Minnesota</option>
                                                <option value="MS">Mississippi</option>
                                                <option value="MO">Missouri</option>
                                                <option value="OK">Oklahoma</option>
                                                <option value="SD">South Dakota</option>
                                                <option value="TX">Texas</option>
                                                <option value="TN">Tennessee</option>
                                                <option value="WI">Wisconsin</option>
                                            </optgroup>
                                            <optgroup label="Eastern Time Zone">
                                                <option value="CT">Connecticut</option>
                                                <option value="DE">Delaware</option>
                                                <option value="FL">Florida</option>
                                                <option value="GA">Georgia</option>
                                                <option value="IN">Indiana</option>
                                                <option value="ME">Maine</option>
                                                <option value="MD">Maryland</option>
                                                <option value="MA">Massachusetts</option>
                                                <option value="MI">Michigan</option>
                                                <option value="NH">New Hampshire</option><option value="NJ">New Jersey</option>
                                                <option value="NY">New York</option>
                                                <option value="NC">North Carolina</option>
                                                <option value="OH">Ohio</option>
                                                <option value="PA">Pennsylvania</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option>
                                                <option value="VT">Vermont</option><option value="VA">Virginia</option>
                                                <option value="WV">West Virginia</option>
                                            </optgroup>
                                        </select>

                                            <div class="note">
                                                <strong>Usage:</strong> &lt;select style="width:100%" class="select2" "&gt;...&lt;/select&gt;
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label>Select2 Plugin (multi-select)</label>
                                            <div class="select2-container select2-container-multi select2" id="s2id_autogen9" style="width: 100%;"><ul class="select2-choices">  <li class="select2-search-choice">    <div>Nevada</div>    <a href="#" class="select2-search-choice-close" tabindex="-1"></a></li><li class="select2-search-choice">    <div>Montana</div>    <a href="#" class="select2-search-choice-close" tabindex="-1"></a></li><li class="select2-search-choice">    <div>Michigan</div>    <a href="#" class="select2-search-choice-close" tabindex="-1"></a></li><li class="select2-search-field">    <label for="s2id_autogen10" class="select2-offscreen"></label>    <input type="text" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" class="select2-input" id="s2id_autogen10" placeholder="" style="width: 20px;">  </li></ul><div class="select2-drop select2-drop-multi select2-display-none">   <ul class="select2-results">   <li class="select2-no-results">No matches found</li></ul></div></div><select multiple="" style="width:100%" class="select2 select2-offscreen" tabindex="-1">
                                            <optgroup label="Alaskan/Hawaiian Time Zone">
                                                <option value="AK">Alaska</option>
                                                <option value="HI">Hawaii</option>
                                            </optgroup>
                                            <optgroup label="Pacific Time Zone">
                                                <option value="CA">California</option>
                                                <option value="NV" selected="selected">Nevada</option>
                                                <option value="OR">Oregon</option>
                                                <option value="WA">Washington</option>
                                            </optgroup>
                                            <optgroup label="Mountain Time Zone">
                                                <option value="AZ">Arizona</option>
                                                <option value="CO">Colorado</option>
                                                <option value="ID">Idaho</option>
                                                <option value="MT" selected="selected">Montana</option><option value="NE">Nebraska</option>
                                                <option value="NM">New Mexico</option>
                                                <option value="ND">North Dakota</option>
                                                <option value="UT">Utah</option>
                                                <option value="WY">Wyoming</option>
                                            </optgroup>
                                            <optgroup label="Central Time Zone">
                                                <option value="AL">Alabama</option>
                                                <option value="AR">Arkansas</option>
                                                <option value="IL">Illinois</option>
                                                <option value="IA">Iowa</option>
                                                <option value="KS">Kansas</option>
                                                <option value="KY">Kentucky</option>
                                                <option value="LA">Louisiana</option>
                                                <option value="MN">Minnesota</option>
                                                <option value="MS">Mississippi</option>
                                                <option value="MO">Missouri</option>
                                                <option value="OK">Oklahoma</option>
                                                <option value="SD">South Dakota</option>
                                                <option value="TX">Texas</option>
                                                <option value="TN">Tennessee</option>
                                                <option value="WI">Wisconsin</option>
                                            </optgroup>
                                            <optgroup label="Eastern Time Zone">
                                                <option value="CT">Connecticut</option>
                                                <option value="DE">Delaware</option>
                                                <option value="FL">Florida</option>
                                                <option value="GA">Georgia</option>
                                                <option value="IN">Indiana</option>
                                                <option value="ME">Maine</option>
                                                <option value="MD">Maryland</option>
                                                <option value="MA">Massachusetts</option>
                                                <option value="MI" selected="selected">Michigan</option>"""),
format.raw("""
                                                <option value="NH">New Hampshire</option>
                                                <option value="NJ">New Jersey</option>
                                                <option value="NY">New York</option>
                                                <option value="NC">North Carolina</option>
                                                <option value="OH">Ohio</option>
                                                <option value="PA">Pennsylvania</option>
                                                <option value="RI">Rhode Island</option>
                                                <option value="SC">South Carolina</option>
                                                <option value="VT">Vermont</option>
                                                <option value="VA">Virginia</option>
                                                <option value="WV">West Virginia</option>
                                            </optgroup>
                                        </select>

                                            <div class="note">
                                                <strong>Usage:</strong> &lt;select multiple style="width:100%" class="select2" &gt;...&lt;/select&gt;
                                            </div>
                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Date Picker (Jquery UI)
                                        </legend>

                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <label>Select a date (single):</label>
                                                    <div class="input-group">
                                                        <input type="text" name="mydate" placeholder="Select a date" class="form-control datepicker hasDatepicker" data-dateformat="dd/mm/yy" id="dp1408942959519">
                                                        <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-sm-12">
                                                <label>Select a date (range):</label>
                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <div class="input-group">
                                                        <input class="form-control hasDatepicker" id="from" type="text" placeholder="From">
                                                        <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <div class="input-group">
                                                        <input class="form-control hasDatepicker" id="to" type="text" placeholder="Select a date">
                                                        <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    </div>
                                                </div>

                                            </div>

                                        </div>
                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Bootstrap Timepicker
                                        </legend>

                                        <div class="row">

                                            <div class="col-sm-12">
                                                <div class="row">

                                                    <div class="col-sm-12">
                                                        <div class="form-group">
                                                            <label>Timepicker (default):</label>
                                                            <div class="input-group">
                                                                <input class="form-control" id="timepicker" type="text" placeholder="Select time">
                                                                <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>

                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Clockpicker
                                        </legend>

                                        <div class="row">

                                            <div class="col-sm-12">
                                                <div class="row">

                                                    <div class="col-sm-12">
                                                        <div class="form-group">
                                                            <label>Clockpicker:</label>
                                                            <div class="input-group">
                                                                <input class="form-control" id="clockpicker" type="text" placeholder="Select time" data-autoclose="true">
                                                                <span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>

                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Spinners
                                        </legend>

                                        <div class="row">

                                            <div class="col-sm-6 col-md-4 col-lg-4">

                                                <div class="form-group">
                                                    <label>Default</label>
                                                    <span class="ui-spinner ui-widget ui-widget-content ui-corner-all"><input class="form-control spinner-left ui-spinner-input" id="spinner" name="spinner" value="1" type="text" aria-valuenow="1" autocomplete="off" role="spinbutton"><a class="ui-spinner-button ui-spinner-up ui-corner-tr" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-n">▲</span></a><a class="ui-spinner-button ui-spinner-down ui-corner-br" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-s">▼</span></a></span>
                                                </div>

                                            </div>
                                            <div class="col-sm-6 col-md-4 col-lg-4">
                                                <div class="form-group">
                                                    <label>Decimal spinner</label>
                                                    <span class="ui-spinner ui-widget ui-widget-content ui-corner-all"><input class="form-control ui-spinner-input" id="spinner-decimal" name="spinner-decimal" value="7.99" aria-valuenow="7.99" autocomplete="off" role="spinbutton"><a class="ui-spinner-button ui-spinner-up ui-corner-tr" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-n">▲</span></a><a class="ui-spinner-button ui-spinner-down ui-corner-br" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-s">▼</span></a></span>
                                                </div>
                                            </div>
                                            <div class="col-sm-12 col-md-4 col-lg-4">
                                                <div class="form-group">
                                                    <label>Increment spinner</label>
                                                    <span class="ui-spinner ui-widget ui-widget-content ui-corner-all" style="height: 32px;"><input class="form-control spinner-both ui-spinner-input" id="spinner-currency" name="spinner-currency" value="5" aria-valuemin="5" aria-valuemax="2500" aria-valuenow="5" autocomplete="off" role="spinbutton"><a class="ui-spinner-button ui-spinner-up ui-corner-tr" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-n">▲</span></a><a class="ui-spinner-button ui-spinner-down ui-corner-br" tabindex="-1"><span class="ui-icon ui-icon-triangle-1-s">▼</span></a></span>
                                                </div>
                                            </div>
                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Color Pickers
                                        </legend>

                                        <div class="row">

                                            <div class="col-sm-6">

                                                <div class="form-group">
                                                    <label>Color Picker (HEX)</label>
                                                    <input class="form-control" id="colorpicker-1" type="text" value="#8fff00">
                                                </div>

                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group">
                                                    <label>Color Picker (RGBA)</label>
                                                    <input class="form-control" id="colorpicker-2" type="text" value="rgba(0,194,255,0.78)" data-color-format="rgba">
                                                </div>
                                            </div>
                                        </div>

                                    </fieldset>

                                    <fieldset>
                                        <legend>
                                            Tags
                                        </legend>

                                        <div class="row">

                                            <div class="col-sm-12">
                                                <div class="form-group">
                                                    <label>Type and enter to add tag</label>
                                                    <input class="form-control tagsinput" value="Amsterdam,Washington,Sydney,Beijing,Cairo" data-role="tagsinput" style="display: none;"><div class="bootstrap-tagsinput"><span class="tag label label-info">Amsterdam<span data-role="remove"></span></span> <span class="tag label label-info">Washington<span data-role="remove"></span></span> <span class="tag label label-info">Sydney<span data-role="remove"></span></span> <span class="tag label label-info">Beijing<span data-role="remove"></span></span> <span class="tag label label-info">Cairo<span data-role="remove"></span></span> <input size="1" type="text" placeholder=""></div>
                                                </div>
                                            </div>

                                        </div>

                                    </fieldset>

                                    <div class="form-actions">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <button class="btn btn-default" type="submit">
                                                    Cancel
                                                </button>
                                                <button class="btn btn-primary" type="submit">
                                                    <i class="fa fa-save"></i>
                                                    Submit
                                                </button>
                                            </div>
                                        </div>
                                    </div>

                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- END COL -->

                    <!-- NEW COL START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-3" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>All Masking </h2>

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
                                <p class="alert alert-info text-align-center">
                                    USAGE: &lt;input type="text" <strong>data-mask="99/99/9999" data-mask-placeholder= "-"&gt;</strong>
                                </p>

                                <form>

                                    <fieldset>
                                        <legend>
                                            Input Masking made easier!
                                        </legend>

                                        <div class="form-group">
                                            <label>Date masking</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" data-mask="99/99/9999" data-mask-placeholder="-">
                                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                            </div>
                                            <p class="note">
                                                Data format **/**/****
                                            </p>
                                        </div>

                                        <div class="form-group">
                                            <label>Phone masking</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" data-mask="(999) 999-9999" data-mask-placeholder="X">
                                                <span class="input-group-addon"><i class="fa fa-phone"></i></span>
                                            </div>
                                            <p class="note">
                                                Data format (XXX) XXX-XXXX
                                            </p>
                                        </div>

                                        <div class="form-group">
                                            <label>Credit card masking</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" data-mask="9999-9999-9999-9999" data-mask-placeholder="*">
                                                <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                            </div>
                                            <p class="note">
                                                Data format ****-****-****-****
                                            </p>
                                        </div>

                                        <div class="form-group">
                                            <label>Serial number masking</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" data-mask="***-***-***-***-***-***" data-mask-placeholder="_">
                                                <span class="input-group-addon"><i class="fa fa-asterisk"></i></span>
                                            </div>
                                            <p class="note">
                                                Data format ***-***-***-***-***-***
                                            </p>
                                        </div>

                                        <div class="form-group">
                                            <label>Tax ID masking</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" data-mask="99-9999999" data-mask-placeholder="X">
                                                <span class="input-group-addon"><i class="fa fa-briefcase"></i></span>
                                            </div>
                                            <p class="note">
                                                Data format 99-9999999
                                            </p>
                                        </div>

                                        <div class="form-actions">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <button class="btn btn-default" type="""),
format.raw(""""submit">
                                                        Cancel
                                                    </button>
                                                    <button class="btn btn-primary" type="submit">
                                                        <i class="fa fa-save"></i>
                                                        Submit
                                                    </button>
                                                </div>
                                            </div>
                                        </div>

                                    </fieldset>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-5" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>JS Knob </h2>

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

                                <form>

                                    <fieldset>
                                        <legend>
                                            JS Knob Input
                                        </legend>

                                        <div class="knobs-demo">

                                            <div>
                                                <div style="display: inline; width: 120px; height: 120px;"><canvas width="120" height="120"></canvas><input class="knob" data-width="120" data-height="120" data-displayinput="true" value="35" data-displayprevious="true" data-fgcolor="#428BCA" style="width: 64px; height: 40px; position: absolute; vertical-align: middle; margin-top: 40px; margin-left: -92px; border: 0px; background-image: none; font-weight: bold; font-style: normal; font-variant: normal; font-size: 24px; line-height: normal; font-family: Arial; text-align: center; color: rgb(66, 139, 202); padding: 0px; -webkit-appearance: none; background-position: initial initial; background-repeat: initial initial;"></div>
                                            </div>

                                            <div>
                                                <div style="display: inline; width: 180px; height: 180px;"><canvas width="180" height="180"></canvas><input class="knob" data-width="180" data-height="180" data-cursor="true" data-fgcolor="#222222" data-thickness=".3" value="29" style="width: 94px; height: 60px; position: absolute; vertical-align: middle; margin-top: 60px; margin-left: -137px; border: 0px; background-image: none; font-weight: bold; font-style: normal; font-variant: normal; font-size: 36px; line-height: normal; font-family: Arial; text-align: center; color: rgb(34, 34, 34); padding: 0px; -webkit-appearance: none; background-position: initial initial; background-repeat: initial initial;"></div>
                                            </div>

                                            <div>
                                                <div style="display: inline; width: 80px; height: 80px;"><canvas width="80" height="80"></canvas><input class="knob" data-width="80" data-height="80" data-fgcolor="#71843F" data-angleoffset="-125" data-anglearc="250" value="33" data-thickness=".3" style="width: 44px; height: 26px; position: absolute; vertical-align: middle; margin-top: 26px; margin-left: -62px; border: 0px; background-image: none; font-weight: bold; font-style: normal; font-variant: normal; font-size: 16px; line-height: normal; font-family: Arial; text-align: center; color: rgb(113, 132, 63); padding: 0px; -webkit-appearance: none; background-position: initial initial; background-repeat: initial initial;"></div>
                                            </div>

                                        </div>

                                    </fieldset>
                                    <div class="form-actions">

                                        <div class="row">
                                            <div class="col-md-12">
                                                <button class="btn btn-default" type="submit">
                                                    Cancel
                                                </button>
                                                <button class="btn btn-primary" type="submit">
                                                    <i class="fa fa-save"></i>
                                                    Submit
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- END COL -->

            </div>

                <!-- END ROW -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*1041.45*/("""{"""),format.raw/*1041.46*/(""" """),format.raw/*1041.47*/("""trigger: "hover" """),format.raw/*1041.64*/("""}"""),format.raw/*1041.65*/(""");
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
         * var pagefunction = function() """),format.raw/*1066.42*/("""{"""),format.raw/*1066.43*/("""
         """),format.raw/*1067.10*/("""*   ...
         * """),format.raw/*1068.12*/("""}"""),format.raw/*1068.13*/("""
         """),format.raw/*1069.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*1072.42*/("""{"""),format.raw/*1072.43*/("""
         """),format.raw/*1073.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*1074.12*/("""}"""),format.raw/*1074.13*/("""
         """),format.raw/*1075.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // pagefunction

        var pagefunction = function() """),format.raw/*1083.39*/("""{"""),format.raw/*1083.40*/("""

        """),format.raw/*1085.9*/("""// Spinners
        $("#spinner").spinner();
        $("#spinner-decimal").spinner("""),format.raw/*1087.39*/("""{"""),format.raw/*1087.40*/("""
        """),format.raw/*1088.9*/("""step: 0.01,
        numberFormat: "n"
        """),format.raw/*1090.9*/("""}"""),format.raw/*1090.10*/(""");

        $("#spinner-currency").spinner("""),format.raw/*1092.40*/("""{"""),format.raw/*1092.41*/("""
        """),format.raw/*1093.9*/("""min: 5,
        max: 2500,
        step: 25,
        start: 1000,
        numberFormat: "C"
        """),format.raw/*1098.9*/("""}"""),format.raw/*1098.10*/(""");

        //Maxlength
        loadScript("js/plugin/maxlength/bootstrap-maxlength.min.js", runMaxLength);

        function runMaxLength() """),format.raw/*1103.33*/("""{"""),format.raw/*1103.34*/("""
        """),format.raw/*1104.9*/("""$('input[maxlength]').maxlength("""),format.raw/*1104.41*/("""{"""),format.raw/*1104.42*/("""
        """),format.raw/*1105.9*/("""warningClass: "label label-success",
        limitReachedClass: "label label-important",
        """),format.raw/*1107.9*/("""}"""),format.raw/*1107.10*/(""");

        """),format.raw/*1109.9*/("""}"""),format.raw/*1109.10*/("""

        """),format.raw/*1111.9*/("""// START AND FINISH DATE
        $('#startdate').datepicker("""),format.raw/*1112.36*/("""{"""),format.raw/*1112.37*/("""
        """),format.raw/*1113.9*/("""dateFormat: 'dd.mm.yy',
        prevText: '<i class="fa fa-chevron-left"></i>',
        nextText: '<i class="fa fa-chevron-right"></i>',
        onSelect: function (selectedDate) """),format.raw/*1116.43*/("""{"""),format.raw/*1116.44*/("""
        """),format.raw/*1117.9*/("""$('#finishdate').datepicker('option', 'minDate', selectedDate);
        """),format.raw/*1118.9*/("""}"""),format.raw/*1118.10*/("""
        """),format.raw/*1119.9*/("""}"""),format.raw/*1119.10*/(""");
        $('#finishdate').datepicker("""),format.raw/*1120.37*/("""{"""),format.raw/*1120.38*/("""
        """),format.raw/*1121.9*/("""dateFormat: 'dd.mm.yy',
        prevText: '<i class="fa fa-chevron-left"></i>',
        nextText: '<i class="fa fa-chevron-right"></i>',
        onSelect: function (selectedDate) """),format.raw/*1124.43*/("""{"""),format.raw/*1124.44*/("""
        """),format.raw/*1125.9*/("""$('#startdate').datepicker('option', 'maxDate', selectedDate);
        """),format.raw/*1126.9*/("""}"""),format.raw/*1126.10*/("""
        """),format.raw/*1127.9*/("""}"""),format.raw/*1127.10*/(""");

        // Date Range Picker
        $("#from").datepicker("""),format.raw/*1130.31*/("""{"""),format.raw/*1130.32*/("""
        """),format.raw/*1131.9*/("""defaultDate: "+1w",
        changeMonth: true,
        numberOfMonths: 3,
        prevText: '<i class="fa fa-chevron-left"></i>',
        nextText: '<i class="fa fa-chevron-right"></i>',
        onClose: function (selectedDate) """),format.raw/*1136.42*/("""{"""),format.raw/*1136.43*/("""
        """),format.raw/*1137.9*/("""$("#to").datepicker("option", "maxDate", selectedDate);
        """),format.raw/*1138.9*/("""}"""),format.raw/*1138.10*/("""

        """),format.raw/*1140.9*/("""}"""),format.raw/*1140.10*/(""");
        $("#to").datepicker("""),format.raw/*1141.29*/("""{"""),format.raw/*1141.30*/("""
        """),format.raw/*1142.9*/("""defaultDate: "+1w",
        changeMonth: true,
        numberOfMonths: 3,
        prevText: '<i class="fa fa-chevron-left"></i>',
        nextText: '<i class="fa fa-chevron-right"></i>',
        onClose: function (selectedDate) """),format.raw/*1147.42*/("""{"""),format.raw/*1147.43*/("""
        """),format.raw/*1148.9*/("""$("#from").datepicker("option", "minDate", selectedDate);
        """),format.raw/*1149.9*/("""}"""),format.raw/*1149.10*/("""
        """),format.raw/*1150.9*/("""}"""),format.raw/*1150.10*/(""");

        /*
         * TIMEPICKER
         */

        //Load time picker script

        loadScript("js/plugin/bootstrap-timepicker/bootstrap-timepicker.min.js", runTimePicker);

        function runTimePicker() """),format.raw/*1160.34*/("""{"""),format.raw/*1160.35*/("""
        """),format.raw/*1161.9*/("""$('#timepicker').timepicker();
        """),format.raw/*1162.9*/("""}"""),format.raw/*1162.10*/("""

        """),format.raw/*1164.9*/("""/*
         * CLOCKPICKER
         */

        // load clockpicker script

        loadScript("js/plugin/clockpicker/clockpicker.min.js", runClockPicker);

        function runClockPicker()"""),format.raw/*1172.34*/("""{"""),format.raw/*1172.35*/("""
        """),format.raw/*1173.9*/("""$('#clockpicker').clockpicker("""),format.raw/*1173.39*/("""{"""),format.raw/*1173.40*/("""
        """),format.raw/*1174.9*/("""placement: 'top',
        donetext: 'Done'
        """),format.raw/*1176.9*/("""}"""),format.raw/*1176.10*/(""");
        """),format.raw/*1177.9*/("""}"""),format.raw/*1177.10*/("""

        """),format.raw/*1179.9*/("""/*
         * JS SLIDER
         */

        loadScript("js/plugin/noUiSlider/jquery.nouislider.min.js", noUiSlider);

        function noUiSlider() """),format.raw/*1185.31*/("""{"""),format.raw/*1185.32*/("""

        """),format.raw/*1187.9*/("""//* noUi Sliders
        $("#nouislider-1").noUiSlider("""),format.raw/*1188.39*/("""{"""),format.raw/*1188.40*/("""
        """),format.raw/*1189.9*/("""range: [2, 100],
        start: 55,
        handles: 1,
        connect: true,
        """),format.raw/*1193.9*/("""}"""),format.raw/*1193.10*/(""");

        $("#nouislider-2").noUiSlider("""),format.raw/*1195.39*/("""{"""),format.raw/*1195.40*/("""
        """),format.raw/*1196.9*/("""range: [0, 300],
        start: [55, 130],
        step: 60,
        handles: 2,
        connect: true
        """),format.raw/*1201.9*/("""}"""),format.raw/*1201.10*/(""");

        $("#nouislider-3").noUiSlider("""),format.raw/*1203.39*/("""{"""),format.raw/*1203.40*/("""
        """),format.raw/*1204.9*/("""range: [0, 1000],
        start: [264, 776],
        step: 1,
        connect: true,
        slide: function () """),format.raw/*1208.28*/("""{"""),format.raw/*1208.29*/("""
        """),format.raw/*1209.9*/("""var values = $(this).val();
        $(".nouislider-value").text(values[0] + " - " + values[1]);
        """),format.raw/*1211.9*/("""}"""),format.raw/*1211.10*/("""
        """),format.raw/*1212.9*/("""}"""),format.raw/*1212.10*/(""");

        $("#nouislider-4").noUiSlider("""),format.raw/*1214.39*/("""{"""),format.raw/*1214.40*/("""
        """),format.raw/*1215.9*/("""range: [0, 100],
        start: 50,
        handles: 1
        """),format.raw/*1218.9*/("""}"""),format.raw/*1218.10*/(""").attr("disabled", "disabled");

        """),format.raw/*1220.9*/("""}"""),format.raw/*1220.10*/(""" """),format.raw/*1220.11*/("""// end noUISlider

        /*
         * ION SLIDER
         */
        loadScript("js/plugin/ion-slider/ion.rangeSlider.min.js", ion_slider);

        function ion_slider() """),format.raw/*1227.31*/("""{"""),format.raw/*1227.32*/("""

        """),format.raw/*1229.9*/("""//* ion Range Sliders

        $("#range-slider-1").ionRangeSlider("""),format.raw/*1231.45*/("""{"""),format.raw/*1231.46*/("""
        """),format.raw/*1232.9*/("""min: 0,
        max: 5000,
        from: 1000,
        to: 4000,
        type: 'double',
        step: 1,
        prefix: "$",
        prettify: false,
        hasGrid: true
        """),format.raw/*1241.9*/("""}"""),format.raw/*1241.10*/(""");

        $("#range-slider-2").ionRangeSlider();

        $("#range-slider-3").ionRangeSlider("""),format.raw/*1245.45*/("""{"""),format.raw/*1245.46*/("""
        """),format.raw/*1246.9*/("""min: 0,
        from: 2.3,
        max: 10,
        type: 'single',
        step: 0.1,
        postfix: " mm",
        prettify: false,
        hasGrid: true
        """),format.raw/*1254.9*/("""}"""),format.raw/*1254.10*/(""");

        $("#range-slider-4").ionRangeSlider("""),format.raw/*1256.45*/("""{"""),format.raw/*1256.46*/("""
        """),format.raw/*1257.9*/("""min: -50,
        max: 50,
        from: 5,
        to: 25,
        type: 'double',
        step: 1,
        postfix: "°",
        prettify: false,
        hasGrid: true
        """),format.raw/*1266.9*/("""}"""),format.raw/*1266.10*/(""");

        $("#range-slider-5").ionRangeSlider("""),format.raw/*1268.45*/("""{"""),format.raw/*1268.46*/("""
        """),format.raw/*1269.9*/("""min: 0,
        from: 0,
        max: 10,
        type: 'single',
        step: 0.1,
        postfix: " mm",
        prettify: false,
        hasGrid: true
        """),format.raw/*1277.9*/("""}"""),format.raw/*1277.10*/(""");

        """),format.raw/*1279.9*/("""}"""),format.raw/*1279.10*/("""

        """),format.raw/*1281.9*/("""/*
         * COLOR PICKER
         */
        loadScript("js/plugin/colorpicker/bootstrap-colorpicker.min.js", initializeColorpicker);

        function initializeColorpicker() """),format.raw/*1286.42*/("""{"""),format.raw/*1286.43*/("""

        """),format.raw/*1288.9*/("""if($('.colorpicker.dropdown-menu').length)"""),format.raw/*1288.51*/("""{"""),format.raw/*1288.52*/("""
        """),format.raw/*1289.9*/("""$('.colorpicker.dropdown-menu').remove();
        """),format.raw/*1290.9*/("""}"""),format.raw/*1290.10*/("""

        """),format.raw/*1292.9*/("""$('#colorpicker-1').colorpicker()
        $('#colorpicker-2').colorpicker()

        """),format.raw/*1295.9*/("""}"""),format.raw/*1295.10*/("""

        """),format.raw/*1297.9*/("""/*
         * TAGS
         */

        loadScript("js/plugin/bootstrap-tags/bootstrap-tagsinput.min.js");


        /*
         * KNOB
         */
        loadScript("js/plugin/knob/jquery.knob.min.js", startKnob);

        function startKnob() """),format.raw/*1309.30*/("""{"""),format.raw/*1309.31*/("""

        """),format.raw/*1311.9*/("""$('.knob').knob("""),format.raw/*1311.25*/("""{"""),format.raw/*1311.26*/("""
        """),format.raw/*1312.9*/("""change: function (value) """),format.raw/*1312.34*/("""{"""),format.raw/*1312.35*/("""
        """),format.raw/*1313.9*/("""//console.log("change : " + value);
        """),format.raw/*1314.9*/("""}"""),format.raw/*1314.10*/(""",
        release: function (value) """),format.raw/*1315.35*/("""{"""),format.raw/*1315.36*/("""
        """),format.raw/*1316.9*/("""//console.log(this.$.attr('value'));
        //console.log("release : " + value);
        """),format.raw/*1318.9*/("""}"""),format.raw/*1318.10*/(""",
        cancel: function () """),format.raw/*1319.29*/("""{"""),format.raw/*1319.30*/("""
        """),format.raw/*1320.9*/("""//console.log("cancel : ", this);
        """),format.raw/*1321.9*/("""}"""),format.raw/*1321.10*/("""
        """),format.raw/*1322.9*/("""}"""),format.raw/*1322.10*/(""");
        """),format.raw/*1323.9*/("""}"""),format.raw/*1323.10*/("""

        """),format.raw/*1325.9*/("""/*
         * X-Ediable
         */

        loadScript("js/plugin/x-editable/moment.min.js", loadMockJax);

        function loadMockJax() """),format.raw/*1331.32*/("""{"""),format.raw/*1331.33*/("""
        """),format.raw/*1332.9*/("""loadScript("js/plugin/x-editable/jquery.mockjax.min.js", loadXeditable);
        """),format.raw/*1333.9*/("""}"""),format.raw/*1333.10*/("""

        """),format.raw/*1335.9*/("""function loadXeditable() """),format.raw/*1335.34*/("""{"""),format.raw/*1335.35*/("""
        """),format.raw/*1336.9*/("""loadScript("js/plugin/x-editable/x-editable.min.js", loadTypeHead);
        """),format.raw/*1337.9*/("""}"""),format.raw/*1337.10*/("""

        """),format.raw/*1339.9*/("""function loadTypeHead() """),format.raw/*1339.33*/("""{"""),format.raw/*1339.34*/("""
        """),format.raw/*1340.9*/("""loadScript("js/plugin/typeahead/typeahead.min.js", loadTypeaheadjs);
        """),format.raw/*1341.9*/("""}"""),format.raw/*1341.10*/("""

        """),format.raw/*1343.9*/("""function loadTypeaheadjs() """),format.raw/*1343.36*/("""{"""),format.raw/*1343.37*/("""
        """),format.raw/*1344.9*/("""loadScript("js/plugin/typeahead/typeaheadjs.min.js", runXEditDemo);
        """),format.raw/*1345.9*/("""}"""),format.raw/*1345.10*/("""

        """),format.raw/*1347.9*/("""function runXEditDemo() """),format.raw/*1347.33*/("""{"""),format.raw/*1347.34*/("""

        """),format.raw/*1349.9*/("""(function (e) """),format.raw/*1349.23*/("""{"""),format.raw/*1349.24*/("""
        """),format.raw/*1350.9*/(""""use strict";
        var t = function (e) """),format.raw/*1351.30*/("""{"""),format.raw/*1351.31*/("""
        """),format.raw/*1352.9*/("""this.init("address", e, t.defaults)
        """),format.raw/*1353.9*/("""}"""),format.raw/*1353.10*/(""";
        e.fn.editableutils.inherit(t, e.fn.editabletypes.abstractinput);
        e.extend(t.prototype, """),format.raw/*1355.31*/("""{"""),format.raw/*1355.32*/("""
        """),format.raw/*1356.9*/("""render: function () """),format.raw/*1356.29*/("""{"""),format.raw/*1356.30*/("""
        """),format.raw/*1357.9*/("""this.$input = this.$tpl.find("input")
        """),format.raw/*1358.9*/("""}"""),format.raw/*1358.10*/(""",
        value2html: function (t, n) """),format.raw/*1359.37*/("""{"""),format.raw/*1359.38*/("""
        """),format.raw/*1360.9*/("""if (!t) """),format.raw/*1360.17*/("""{"""),format.raw/*1360.18*/("""
        """),format.raw/*1361.9*/("""e(n).empty();
        return
        """),format.raw/*1363.9*/("""}"""),format.raw/*1363.10*/("""
        """),format.raw/*1364.9*/("""var r = e("<div>").text(t.city).html() + ", " + e("<div>").text(t.street).html() +
        " st., bld. " + e("<div>").text(t.building).html();
        e(n).html(r)
        """),format.raw/*1367.9*/("""}"""),format.raw/*1367.10*/(""",
        html2value: function (e) """),format.raw/*1368.34*/("""{"""),format.raw/*1368.35*/("""
        """),format.raw/*1369.9*/("""return null
        """),format.raw/*1370.9*/("""}"""),format.raw/*1370.10*/(""",
        value2str: function (e) """),format.raw/*1371.33*/("""{"""),format.raw/*1371.34*/("""
        """),format.raw/*1372.9*/("""var t = "";
        if (e)
        for (var n in e)
        t = t + n + ":" + e[n] + ";";
        return t
        """),format.raw/*1377.9*/("""}"""),format.raw/*1377.10*/(""",
        str2value: function (e) """),format.raw/*1378.33*/("""{"""),format.raw/*1378.34*/("""
        """),format.raw/*1379.9*/("""return e
        """),format.raw/*1380.9*/("""}"""),format.raw/*1380.10*/(""",
        value2input: function (e) """),format.raw/*1381.35*/("""{"""),format.raw/*1381.36*/("""
        """),format.raw/*1382.9*/("""if (!e)
        return;
        this.$input.filter('[name="city"]').val(e.city);
        this.$input.filter('[name="street"]').val(e.street);
        this.$input.filter('[name="building"]').val(e.building)
        """),format.raw/*1387.9*/("""}"""),format.raw/*1387.10*/(""",
        input2value: function () """),format.raw/*1388.34*/("""{"""),format.raw/*1388.35*/("""
        """),format.raw/*1389.9*/("""return """),format.raw/*1389.16*/("""{"""),format.raw/*1389.17*/("""
        """),format.raw/*1390.9*/("""city: this.$input.filter('[name="city"]').val(),
        street: this.$input.filter('[name="street"]').val(),
        building: this.$input.filter('[name="building"]').val()
        """),format.raw/*1393.9*/("""}"""),format.raw/*1393.10*/("""
        """),format.raw/*1394.9*/("""}"""),format.raw/*1394.10*/(""",
        activate: function () """),format.raw/*1395.31*/("""{"""),format.raw/*1395.32*/("""
        """),format.raw/*1396.9*/("""this.$input.filter('[name="city"]').focus()
        """),format.raw/*1397.9*/("""}"""),format.raw/*1397.10*/(""",
        autosubmit: function () """),format.raw/*1398.33*/("""{"""),format.raw/*1398.34*/("""
        """),format.raw/*1399.9*/("""this.$input.keydown(function (t) """),format.raw/*1399.42*/("""{"""),format.raw/*1399.43*/("""
        """),format.raw/*1400.9*/("""t.which === 13 && e(this).closest("form").submit()
        """),format.raw/*1401.9*/("""}"""),format.raw/*1401.10*/(""")
        """),format.raw/*1402.9*/("""}"""),format.raw/*1402.10*/("""
        """),format.raw/*1403.9*/("""}"""),format.raw/*1403.10*/(""");
        t.defaults = e.extend("""),format.raw/*1404.31*/("""{"""),format.raw/*1404.32*/("""}"""),format.raw/*1404.33*/(""", e.fn.editabletypes.abstractinput.defaults, """),format.raw/*1404.78*/("""{"""),format.raw/*1404.79*/("""
        """),format.raw/*1405.9*/("""tpl: '<div class="editable-address"><label><span>City: </span><input type="text" name="city" class="form-control"></label></div><div class="editable-address"><label><span>Street: </span><input type="text" name="street" class="form-control"></label></div><div class="editable-address"><label><span>Building: </span><input type="text" name="building" class="form-control"></label></div>',
        inputclass: ""
        """),format.raw/*1407.9*/("""}"""),format.raw/*1407.10*/(""");
        e.fn.editabletypes.address = t
        """),format.raw/*1409.9*/("""}"""),format.raw/*1409.10*/(""")(window.jQuery);

        //ajax mocks
        $.mockjaxSettings.responseTime = 500;

        $.mockjax("""),format.raw/*1414.19*/("""{"""),format.raw/*1414.20*/("""
        """),format.raw/*1415.9*/("""url: '/post',
        response: function (settings) """),format.raw/*1416.39*/("""{"""),format.raw/*1416.40*/("""
        """),format.raw/*1417.9*/("""log(settings, this);
        """),format.raw/*1418.9*/("""}"""),format.raw/*1418.10*/("""
        """),format.raw/*1419.9*/("""}"""),format.raw/*1419.10*/(""");

        $.mockjax("""),format.raw/*1421.19*/("""{"""),format.raw/*1421.20*/("""
        """),format.raw/*1422.9*/("""url: '/error',
        status: 400,
        statusText: 'Bad Request',
        response: function (settings) """),format.raw/*1425.39*/("""{"""),format.raw/*1425.40*/("""
        """),format.raw/*1426.9*/("""this.responseText = 'Please input correct value';
        log(settings, this);
        """),format.raw/*1428.9*/("""}"""),format.raw/*1428.10*/("""
        """),format.raw/*1429.9*/("""}"""),format.raw/*1429.10*/(""");

        $.mockjax("""),format.raw/*1431.19*/("""{"""),format.raw/*1431.20*/("""
        """),format.raw/*1432.9*/("""url: '/status',
        status: 500,
        response: function (settings) """),format.raw/*1434.39*/("""{"""),format.raw/*1434.40*/("""
        """),format.raw/*1435.9*/("""this.responseText = 'Internal Server Error';
        log(settings, this);
        """),format.raw/*1437.9*/("""}"""),format.raw/*1437.10*/("""
        """),format.raw/*1438.9*/("""}"""),format.raw/*1438.10*/(""");

        $.mockjax("""),format.raw/*1440.19*/("""{"""),format.raw/*1440.20*/("""
        """),format.raw/*1441.9*/("""url: '/groups',
        response: function (settings) """),format.raw/*1442.39*/("""{"""),format.raw/*1442.40*/("""
        """),format.raw/*1443.9*/("""this.responseText = ["""),format.raw/*1443.30*/("""{"""),format.raw/*1443.31*/("""
        """),format.raw/*1444.9*/("""value: 0,
        text: 'Guest'
        """),format.raw/*1446.9*/("""}"""),format.raw/*1446.10*/(""", """),format.raw/*1446.12*/("""{"""),format.raw/*1446.13*/("""
        """),format.raw/*1447.9*/("""value: 1,
        text: 'Service'
        """),format.raw/*1449.9*/("""}"""),format.raw/*1449.10*/(""", """),format.raw/*1449.12*/("""{"""),format.raw/*1449.13*/("""
        """),format.raw/*1450.9*/("""value: 2,
        text: 'Customer'
        """),format.raw/*1452.9*/("""}"""),format.raw/*1452.10*/(""", """),format.raw/*1452.12*/("""{"""),format.raw/*1452.13*/("""
        """),format.raw/*1453.9*/("""value: 3,
        text: 'Operator'
        """),format.raw/*1455.9*/("""}"""),format.raw/*1455.10*/(""", """),format.raw/*1455.12*/("""{"""),format.raw/*1455.13*/("""
        """),format.raw/*1456.9*/("""value: 4,
        text: 'Support'
        """),format.raw/*1458.9*/("""}"""),format.raw/*1458.10*/(""", """),format.raw/*1458.12*/("""{"""),format.raw/*1458.13*/("""
        """),format.raw/*1459.9*/("""value: 5,
        text: 'Admin'
        """),format.raw/*1461.9*/("""}"""),format.raw/*1461.10*/("""];
        log(settings, this);
        """),format.raw/*1463.9*/("""}"""),format.raw/*1463.10*/("""
        """),format.raw/*1464.9*/("""}"""),format.raw/*1464.10*/(""");

        //TODO: add this div to page
        function log(settings, response) """),format.raw/*1467.42*/("""{"""),format.raw/*1467.43*/("""
        """),format.raw/*1468.9*/("""var s = [],
        str;
        s.push(settings.type.toUpperCase() + ' url = "' + settings.url + '"');
        for (var a in settings.data) """),format.raw/*1471.38*/("""{"""),format.raw/*1471.39*/("""
        """),format.raw/*1472.9*/("""if (settings.data[a] && typeof settings.data[a] === 'object') """),format.raw/*1472.71*/("""{"""),format.raw/*1472.72*/("""
        """),format.raw/*1473.9*/("""str = [];
        for (var j in settings.data[a]) """),format.raw/*1474.41*/("""{"""),format.raw/*1474.42*/("""
        """),format.raw/*1475.9*/("""str.push(j + ': "' + settings.data[a][j] + '"');
        """),format.raw/*1476.9*/("""}"""),format.raw/*1476.10*/("""
        """),format.raw/*1477.9*/("""str = '"""),format.raw/*1477.16*/("""{"""),format.raw/*1477.17*/(""" """),format.raw/*1477.18*/("""' + str.join(', ') + ' """),format.raw/*1477.41*/("""}"""),format.raw/*1477.42*/("""';
        """),format.raw/*1478.9*/("""}"""),format.raw/*1478.10*/(""" """),format.raw/*1478.11*/("""else """),format.raw/*1478.16*/("""{"""),format.raw/*1478.17*/("""
        """),format.raw/*1479.9*/("""str = '"' + settings.data[a] + '"';
        """),format.raw/*1480.9*/("""}"""),format.raw/*1480.10*/("""
        """),format.raw/*1481.9*/("""s.push(a + ' = ' + str);
        """),format.raw/*1482.9*/("""}"""),format.raw/*1482.10*/("""
        """),format.raw/*1483.9*/("""s.push('RESPONSE: status = ' + response.status);

        if (response.responseText) """),format.raw/*1485.36*/("""{"""),format.raw/*1485.37*/("""
        """),format.raw/*1486.9*/("""if ($.isArray(response.responseText)) """),format.raw/*1486.47*/("""{"""),format.raw/*1486.48*/("""
        """),format.raw/*1487.9*/("""s.push('[');
        $.each(response.responseText, function (i, v) """),format.raw/*1488.55*/("""{"""),format.raw/*1488.56*/("""
        """),format.raw/*1489.9*/("""s.push('"""),format.raw/*1489.17*/("""{"""),format.raw/*1489.18*/("""value: ' + v.value + ', text: "' + v.text + '""""),format.raw/*1489.64*/("""}"""),format.raw/*1489.65*/("""');
        """),format.raw/*1490.9*/("""}"""),format.raw/*1490.10*/(""");
        s.push(']');
        """),format.raw/*1492.9*/("""}"""),format.raw/*1492.10*/(""" """),format.raw/*1492.11*/("""else """),format.raw/*1492.16*/("""{"""),format.raw/*1492.17*/("""
        """),format.raw/*1493.9*/("""s.push($.trim(response.responseText));
        """),format.raw/*1494.9*/("""}"""),format.raw/*1494.10*/("""
        """),format.raw/*1495.9*/("""}"""),format.raw/*1495.10*/("""
        """),format.raw/*1496.9*/("""s.push('--------------------------------------\n');
        $('#console').val(s.join('\n') + $('#console').val());
        """),format.raw/*1498.9*/("""}"""),format.raw/*1498.10*/("""

        """),format.raw/*1500.9*/("""/*
         * X-EDITABLES
         */

        $('#inline').on('change', function (e) """),format.raw/*1504.48*/("""{"""),format.raw/*1504.49*/("""
        """),format.raw/*1505.9*/("""if ($(this).prop('checked')) """),format.raw/*1505.38*/("""{"""),format.raw/*1505.39*/("""
        """),format.raw/*1506.9*/("""window.location.href = '?mode=inline#ajax/plugins.html';
        """),format.raw/*1507.9*/("""}"""),format.raw/*1507.10*/(""" """),format.raw/*1507.11*/("""else """),format.raw/*1507.16*/("""{"""),format.raw/*1507.17*/("""
        """),format.raw/*1508.9*/("""window.location.href = '?#ajax/plugins.html';
        """),format.raw/*1509.9*/("""}"""),format.raw/*1509.10*/("""
        """),format.raw/*1510.9*/("""}"""),format.raw/*1510.10*/(""");

        if (window.location.href.indexOf("?mode=inline") > -1) """),format.raw/*1512.64*/("""{"""),format.raw/*1512.65*/("""
        """),format.raw/*1513.9*/("""$('#inline').prop('checked', true);
        $.fn.editable.defaults.mode = 'inline';
        """),format.raw/*1515.9*/("""}"""),format.raw/*1515.10*/(""" """),format.raw/*1515.11*/("""else """),format.raw/*1515.16*/("""{"""),format.raw/*1515.17*/("""
        """),format.raw/*1516.9*/("""$('#inline').prop('checked', false);
        $.fn.editable.defaults.mode = 'popup';
        """),format.raw/*1518.9*/("""}"""),format.raw/*1518.10*/("""

        """),format.raw/*1520.9*/("""//defaults
        $.fn.editable.defaults.url = '/post';
        //$.fn.editable.defaults.mode = 'inline'; use this to edit inline

        //enable / disable
        $('#enable').click(function () """),format.raw/*1525.40*/("""{"""),format.raw/*1525.41*/("""
        """),format.raw/*1526.9*/("""$('#user .editable').editable('toggleDisabled');
        """),format.raw/*1527.9*/("""}"""),format.raw/*1527.10*/(""");

        //editables
        $('#username').editable("""),format.raw/*1530.33*/("""{"""),format.raw/*1530.34*/("""
        """),format.raw/*1531.9*/("""url: '/post',
        type: 'text',
        pk: 1,
        name: 'username',
        title: 'Enter username'
        """),format.raw/*1536.9*/("""}"""),format.raw/*1536.10*/(""");

        $('#firstname').editable("""),format.raw/*1538.34*/("""{"""),format.raw/*1538.35*/("""
        """),format.raw/*1539.9*/("""validate: function (value) """),format.raw/*1539.36*/("""{"""),format.raw/*1539.37*/("""
        """),format.raw/*1540.9*/("""if ($.trim(value) == '')
        return 'This field is required';
        """),format.raw/*1542.9*/("""}"""),format.raw/*1542.10*/("""
        """),format.raw/*1543.9*/("""}"""),format.raw/*1543.10*/(""");

        $('#sex').editable("""),format.raw/*1545.28*/("""{"""),format.raw/*1545.29*/("""
        """),format.raw/*1546.9*/("""prepend: "not selected",
        source: ["""),format.raw/*1547.18*/("""{"""),format.raw/*1547.19*/("""
        """),format.raw/*1548.9*/("""value: 1,
        text: 'Male'
        """),format.raw/*1550.9*/("""}"""),format.raw/*1550.10*/(""", """),format.raw/*1550.12*/("""{"""),format.raw/*1550.13*/("""
        """),format.raw/*1551.9*/("""value: 2,
        text: 'Female'
        """),format.raw/*1553.9*/("""}"""),format.raw/*1553.10*/("""],
        display: function (value, sourceData) """),format.raw/*1554.47*/("""{"""),format.raw/*1554.48*/("""
        """),format.raw/*1555.9*/("""var colors = """),format.raw/*1555.22*/("""{"""),format.raw/*1555.23*/("""
        """),format.raw/*1556.9*/(""""": "gray",
        1: "green",
        2: "blue"
        """),format.raw/*1559.9*/("""}"""),format.raw/*1559.10*/(""", elem = $.grep(sourceData, function (o) """),format.raw/*1559.51*/("""{"""),format.raw/*1559.52*/("""
        """),format.raw/*1560.9*/("""return o.value == value;
        """),format.raw/*1561.9*/("""}"""),format.raw/*1561.10*/(""");

        if (elem.length) """),format.raw/*1563.26*/("""{"""),format.raw/*1563.27*/("""
        """),format.raw/*1564.9*/("""$(this).text(elem[0].text).css("color", colors[value]);
        """),format.raw/*1565.9*/("""}"""),format.raw/*1565.10*/(""" """),format.raw/*1565.11*/("""else """),format.raw/*1565.16*/("""{"""),format.raw/*1565.17*/("""
        """),format.raw/*1566.9*/("""$(this).empty();
        """),format.raw/*1567.9*/("""}"""),format.raw/*1567.10*/("""
        """),format.raw/*1568.9*/("""}"""),format.raw/*1568.10*/("""
        """),format.raw/*1569.9*/("""}"""),format.raw/*1569.10*/(""");

        $('#status').editable();

        $('#group').editable("""),format.raw/*1573.30*/("""{"""),format.raw/*1573.31*/("""
        """),format.raw/*1574.9*/("""showbuttons: false
        """),format.raw/*1575.9*/("""}"""),format.raw/*1575.10*/(""");

        $('#vacation').editable("""),format.raw/*1577.33*/("""{"""),format.raw/*1577.34*/("""
        """),format.raw/*1578.9*/("""datepicker: """),format.raw/*1578.21*/("""{"""),format.raw/*1578.22*/("""
        """),format.raw/*1579.9*/("""todayBtn: 'linked'
        """),format.raw/*1580.9*/("""}"""),format.raw/*1580.10*/("""
        """),format.raw/*1581.9*/("""}"""),format.raw/*1581.10*/(""");

        $('#dob').editable();

        $('#event').editable("""),format.raw/*1585.30*/("""{"""),format.raw/*1585.31*/("""
        """),format.raw/*1586.9*/("""placement: 'right',
        combodate: """),format.raw/*1587.20*/("""{"""),format.raw/*1587.21*/("""
        """),format.raw/*1588.9*/("""firstItem: 'name'
        """),format.raw/*1589.9*/("""}"""),format.raw/*1589.10*/("""
        """),format.raw/*1590.9*/("""}"""),format.raw/*1590.10*/(""");

        $('#meeting_start').editable("""),format.raw/*1592.38*/("""{"""),format.raw/*1592.39*/("""
        """),format.raw/*1593.9*/("""format: 'yyyy-mm-dd hh:ii',
        viewformat: 'dd/mm/yyyy hh:ii',
        validate: function (v) """),format.raw/*1595.32*/("""{"""),format.raw/*1595.33*/("""
        """),format.raw/*1596.9*/("""if (v && v.getDate() == 10)
        return 'Day cant be 10!';
        """),format.raw/*1598.9*/("""}"""),format.raw/*1598.10*/(""",
        datetimepicker: """),format.raw/*1599.25*/("""{"""),format.raw/*1599.26*/("""
        """),format.raw/*1600.9*/("""todayBtn: 'linked',
        weekStart: 1
        """),format.raw/*1602.9*/("""}"""),format.raw/*1602.10*/("""
        """),format.raw/*1603.9*/("""}"""),format.raw/*1603.10*/(""");

        $('#comments').editable("""),format.raw/*1605.33*/("""{"""),format.raw/*1605.34*/("""
        """),format.raw/*1606.9*/("""showbuttons: 'bottom'
        """),format.raw/*1607.9*/("""}"""),format.raw/*1607.10*/(""");

        $('#note').editable();
        $('#pencil').click(function (e) """),format.raw/*1610.41*/("""{"""),format.raw/*1610.42*/("""
        """),format.raw/*1611.9*/("""e.stopPropagation();
        e.preventDefault();
        $('#note').editable('toggle');
        """),format.raw/*1614.9*/("""}"""),format.raw/*1614.10*/(""");

        $('#state').editable("""),format.raw/*1616.30*/("""{"""),format.raw/*1616.31*/("""
        """),format.raw/*1617.9*/("""source: ["Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
        "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
        "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
        "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
        "New Mexico", "New York", "North Dakota", "North Carolina", "Ohio", "Oklahoma", "Oregon",
        "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
        "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
        ]
        """),format.raw/*1625.9*/("""}"""),format.raw/*1625.10*/(""");

        $('#state2').editable("""),format.raw/*1627.31*/("""{"""),format.raw/*1627.32*/("""
        """),format.raw/*1628.9*/("""value: 'California',
        typeahead: """),format.raw/*1629.20*/("""{"""),format.raw/*1629.21*/("""
        """),format.raw/*1630.9*/("""name: 'state',
        local: ["Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
        "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
        "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
        "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
        "New Jersey", "New Mexico", "New York", "North Dakota", "North Carolina", "Ohio",
        "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
        "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
        "Wisconsin", "Wyoming"
        ]
        """),format.raw/*1640.9*/("""}"""),format.raw/*1640.10*/("""
        """),format.raw/*1641.9*/("""}"""),format.raw/*1641.10*/(""");

        $('#fruits').editable("""),format.raw/*1643.31*/("""{"""),format.raw/*1643.32*/("""
        """),format.raw/*1644.9*/("""pk: 1,
        limit: 3,
        source: ["""),format.raw/*1646.18*/("""{"""),format.raw/*1646.19*/("""
        """),format.raw/*1647.9*/("""value: 1,
        text: 'banana'
        """),format.raw/*1649.9*/("""}"""),format.raw/*1649.10*/(""", """),format.raw/*1649.12*/("""{"""),format.raw/*1649.13*/("""
        """),format.raw/*1650.9*/("""value: 2,
        text: 'peach'
        """),format.raw/*1652.9*/("""}"""),format.raw/*1652.10*/(""", """),format.raw/*1652.12*/("""{"""),format.raw/*1652.13*/("""
        """),format.raw/*1653.9*/("""value: 3,
        text: 'apple'
        """),format.raw/*1655.9*/("""}"""),format.raw/*1655.10*/(""", """),format.raw/*1655.12*/("""{"""),format.raw/*1655.13*/("""
        """),format.raw/*1656.9*/("""value: 4,
        text: 'watermelon'
        """),format.raw/*1658.9*/("""}"""),format.raw/*1658.10*/(""", """),format.raw/*1658.12*/("""{"""),format.raw/*1658.13*/("""
        """),format.raw/*1659.9*/("""value: 5,
        text: 'orange'
        """),format.raw/*1661.9*/("""}"""),format.raw/*1661.10*/("""]
        """),format.raw/*1662.9*/("""}"""),format.raw/*1662.10*/(""");

        $('#tags').editable("""),format.raw/*1664.29*/("""{"""),format.raw/*1664.30*/("""
        """),format.raw/*1665.9*/("""inputclass: 'input-large',
        select2: """),format.raw/*1666.18*/("""{"""),format.raw/*1666.19*/("""
        """),format.raw/*1667.9*/("""tags: ['html', 'javascript', 'css', 'ajax'],
        tokenSeparators: [",", " "]
        """),format.raw/*1669.9*/("""}"""),format.raw/*1669.10*/("""
        """),format.raw/*1670.9*/("""}"""),format.raw/*1670.10*/(""");

        var countries = [];
        $.each("""),format.raw/*1673.16*/("""{"""),format.raw/*1673.17*/("""
        """),format.raw/*1674.9*/(""""BD": "Bangladesh",
        "BE": "Belgium",
        "BF": "Burkina Faso",
        "BG": "Bulgaria",
        "BA": "Bosnia and Herzegovina",
        "BB": "Barbados",
        "WF": "Wallis and Futuna",
        "BL": "Saint Bartelemey",
        "BM": "Bermuda",
        "BN": "Brunei Darussalam",
        "BO": "Bolivia",
        "BH": "Bahrain",
        "BI": "Burundi",
        "BJ": "Benin",
        "BT": "Bhutan",
        "JM": "Jamaica",
        "BV": "Bouvet Island",
        "BW": "Botswana",
        "WS": "Samoa",
        "BR": "Brazil",
        "BS": "Bahamas",
        "JE": "Jersey",
        "BY": "Belarus",
        "O1": "Other Country",
        "LV": "Latvia",
        "RW": "Rwanda",
        "RS": "Serbia",
        "TL": "Timor-Leste",
        "RE": "Reunion",
        "LU": "Luxembourg",
        "TJ": "Tajikistan",
        "RO": "Romania",
        "PG": "Papua New Guinea",
        "GW": "Guinea-Bissau",
        "GU": "Guam",
        "GT": "Guatemala",
        "GS": "South Georgia and the South Sandwich Islands",
        "GR": "Greece",
        "GQ": "Equatorial Guinea",
        "GP": "Guadeloupe",
        "JP": "Japan",
        "GY": "Guyana",
        "GG": "Guernsey",
        "GF": "French Guiana",
        "GE": "Georgia",
        "GD": "Grenada",
        "GB": "United Kingdom",
        "GA": "Gabon",
        "SV": "El Salvador",
        "GN": "Guinea",
        "GM": "Gambia",
        "GL": "Greenland",
        "GI": "Gibraltar",
        "GH": "Ghana",
        "OM": "Oman",
        "TN": "Tunisia",
        "JO": "Jordan",
        "HR": "Croatia",
        "HT": "Haiti",
        "HU": "Hungary",
        "HK": "Hong Kong",
        "HN": "Honduras",
        "HM": "Heard Island and McDonald Islands",
        "VE": "Venezuela",
        "PR": "Puerto Rico",
        "PS": "Palestinian Territory",
        "PW": "Palau",
        "PT": "Portugal",
        "SJ": "Svalbard and Jan Mayen",
        "PY": "Paraguay",
        "IQ": "Iraq",
        "PA": "Panama",
        "PF": "French Polynesia",
        "BZ": "Belize",
        "PE": "Peru",
        "PK": "Pakistan",
        "PH": "Philippines",
        "PN": "Pitcairn",
        "TM": "Turkmenistan",
        "PL": "Poland",
        "PM": "Saint Pierre and Miquelon",
        "ZM": "Zambia",
        "EH": "Western Sahara",
        "RU": "Russian Federation",
        "EE": "Estonia",
        "EG": "Egypt",
        "TK": "Tokelau",
        "ZA": "South Africa",
        "EC": "Ecuador",
        "IT": "Italy",
        "VN": "Vietnam",
        "SB": "Solomon Islands",
        "EU": "Europe",
        "ET": "Ethiopia",
        "SO": "Somalia",
        "ZW": "Zimbabwe",
        "SA": "Saudi Arabia",
        "ES": "Spain",
        "ER": "Eritrea",
        "ME": "Montenegro",
        "MD": "Moldova, Republic of",
        "MG": "Madagascar",
        "MF": "Saint Martin",
        "MA": "Morocco",
        "MC": "Monaco",
        "UZ": "Uzbekistan",
        "MM": "Myanmar",
        "ML": "Mali",
        "MO": "Macao",
        "MN": "Mongolia",
        "MH": "Marshall Islands",
        "MK": "Macedonia",
        "MU": "Mauritius",
        "MT": "Malta",
        "MW": "Malawi",
        "MV": "Maldives",
        "MQ": "Martinique",
        "MP": "Northern Mariana Islands",
        "MS": "Montserrat",
        "MR": "Mauritania",
        "IM": "Isle of Man",
        "UG": "Uganda",
        "TZ": "Tanzania, United Republic of",
        "MY": "Malaysia",
        "MX": "Mexico",
        "IL": "Israel",
        "FR": "France",
        "IO": "British Indian Ocean Territory",
        "FX": "France, Metropolitan",
        "SH": "Saint Helena",
        "FI": "Finland",
        "FJ": "Fiji",
        "FK": "Falkland Islands (Malvinas)",
        "FM": "Micronesia, Federated States of",
        "FO": "Faroe Islands",
        "NI": "Nicaragua",
        "NL": "Netherlands",
        "NO": "Norway",
        "NA": "Namibia",
        "VU": "Vanuatu",
        "NC": "New Caledonia",
        "NE": "Niger",
        "NF": "Norfolk Island",
        "NG": "Nigeria",
        "NZ": "New Zealand",
        "NP": "Nepal",
        "NR": "Nauru",
        "NU": "Niue",
        "CK": "Cook Islands",
        "CI": "Cote d'Ivoire",
        "CH": "Switzerland",
        "CO": "Colombia",
        "CN": "China",
        "CM": "Cameroon",
        "CL": "Chile",
        "CC": "Cocos (Keeling) Islands",
        "CA": "Canada",
        "CG": "Congo",
        "CF": "Central African Republic",
        "CD": "Congo, The Democratic Republic of the",
        "CZ": "Czech Republic",
        "CY": "Cyprus",
        "CX": "Christmas Island",
        "CR": "Costa Rica",
        "CV": "Cape Verde",
        "CU": "Cuba",
        "SZ": "Swaziland",
        "SY": "Syrian Arab Republic",
        "KG": "Kyrgyzstan",
        "KE": "Kenya",
        "SR": "Suriname",
        "KI": "Kiribati",
        "KH": "Cambodia",
        "KN": "Saint Kitts and Nevis",
        "KM": "Comoros",
        "ST": "Sao Tome and Principe",
        "SK": "Slovakia",
        "KR": "Korea, Republic of",
        "SI": "Slovenia",
        "KP": "Korea, Democratic People's Republic of",
        "KW": "Kuwait",
        "SN": "Senegal",
        "SM": "San Marino",
        "SL": "Sierra Leone",
        "SC": "Seychelles",
        "KZ": "Kazakhstan",
        "KY": "Cayman Islands",
        "SG": "Singapore",
        "SE": "Sweden",
        "SD": "Sudan",
        "DO": "Dominican Republic",
        "DM": "Dominica",
        "DJ": "Djibouti",
        "DK": "Denmark",
        "VG": "Virgin Islands, British",
        "DE": "Germany",
        "YE": "Yemen",
        "DZ": "Algeria",
        "US": "United States",
        "UY": "Uruguay",
        "YT": "Mayotte",
        "UM": "United States Minor Outlying Islands",
        "LB": "Lebanon",
        "LC": "Saint Lucia",
        "LA": "Lao People's Democratic Republic",
        "TV": "Tuvalu",
        "TW": "Taiwan",
        "TT": "Trinidad and Tobago",
        "TR": "Turkey",
        "LK": "Sri Lanka",
        "LI": "Liechtenstein",
        "A1": "Anonymous Proxy",
        "TO": "Tonga",
        "LT": "Lithuania",
        "A2": "Satellite Provider",
        "LR": "Liberia",
        "LS": "Lesotho",
        "TH": "Thailand",
        "TF": "French Southern Territories",
        "TG": "Togo",
        "TD": "Chad",
        "TC": "Turks and Caicos Islands",
        "LY": "Libyan Arab Jamahiriya",
        "VA": "Holy See (Vatican City State)",
        "VC": "Saint Vincent and the Grenadines",
        "AE": "United Arab Emirates",
        "AD": "Andorra",
        "AG": "Antigua and Barbuda",
        "AF": "Afghanistan",
        "AI": "Anguilla",
        "VI": "Virgin Islands, U.S.",
        "IS": "Iceland",
        "IR": "Iran, Islamic Republic of",
        "AM": "Armenia",
        "AL": "Albania",
        "AO": "Angola",
        "AN": "Netherlands Antilles",
        "AQ": "Antarctica",
        "AP": "Asia/Pacific Region",
        "AS": "American Samoa",
        "AR": "Argentina",
        "AU": "Australia",
        "AT": "Austria",
        "AW": "Aruba",
        "IN": "India",
        "AX": "Aland Islands",
        "AZ": "Azerbaijan",
        "IE": "Ireland",
        "ID": "Indonesia",
        "UA": "Ukraine",
        "QA": "Qatar",
        "MZ": "Mozambique"
        """),format.raw/*1926.9*/("""}"""),format.raw/*1926.10*/(""", function (k, v) """),format.raw/*1926.28*/("""{"""),format.raw/*1926.29*/("""
        """),format.raw/*1927.9*/("""countries.push("""),format.raw/*1927.24*/("""{"""),format.raw/*1927.25*/("""
        """),format.raw/*1928.9*/("""id: k,
        text: v
        """),format.raw/*1930.9*/("""}"""),format.raw/*1930.10*/(""");
        """),format.raw/*1931.9*/("""}"""),format.raw/*1931.10*/(""");

        $('#country').editable("""),format.raw/*1933.32*/("""{"""),format.raw/*1933.33*/("""
        """),format.raw/*1934.9*/("""source: countries,
        select2: """),format.raw/*1935.18*/("""{"""),format.raw/*1935.19*/("""
        """),format.raw/*1936.9*/("""width: 200
        """),format.raw/*1937.9*/("""}"""),format.raw/*1937.10*/("""
        """),format.raw/*1938.9*/("""}"""),format.raw/*1938.10*/(""");

        $('#address').editable("""),format.raw/*1940.32*/("""{"""),format.raw/*1940.33*/("""
        """),format.raw/*1941.9*/("""url: '/post',
        value: """),format.raw/*1942.16*/("""{"""),format.raw/*1942.17*/("""
        """),format.raw/*1943.9*/("""city: "Moscow",
        street: "Lenina",
        building: "12"
        """),format.raw/*1946.9*/("""}"""),format.raw/*1946.10*/(""",
        validate: function (value) """),format.raw/*1947.36*/("""{"""),format.raw/*1947.37*/("""
        """),format.raw/*1948.9*/("""if (value.city == '')
        return 'city is required!';
        """),format.raw/*1950.9*/("""}"""),format.raw/*1950.10*/(""",
        display: function (value) """),format.raw/*1951.35*/("""{"""),format.raw/*1951.36*/("""
        """),format.raw/*1952.9*/("""if (!value) """),format.raw/*1952.21*/("""{"""),format.raw/*1952.22*/("""
        """),format.raw/*1953.9*/("""$(this).empty();
        return;
        """),format.raw/*1955.9*/("""}"""),format.raw/*1955.10*/("""
        """),format.raw/*1956.9*/("""var html = '<b>' + $('<div>').text(value.city).html() + '</b>, ' + $('<div>').text(value.street)
        .html() + ' st., bld. ' + $('<div>').text(value.building).html();
        $(this).html(html);
        """),format.raw/*1959.9*/("""}"""),format.raw/*1959.10*/("""
        """),format.raw/*1960.9*/("""}"""),format.raw/*1960.10*/(""");

        $('#user .editable').on('hidden', function (e, reason) """),format.raw/*1962.64*/("""{"""),format.raw/*1962.65*/("""
        """),format.raw/*1963.9*/("""if (reason === 'save' || reason === 'nochange') """),format.raw/*1963.57*/("""{"""),format.raw/*1963.58*/("""
        """),format.raw/*1964.9*/("""var $next = $(this).closest('tr').next().find('.editable');
        if ($('#autoopen').is(':checked')) """),format.raw/*1965.44*/("""{"""),format.raw/*1965.45*/("""
        """),format.raw/*1966.9*/("""setTimeout(function () """),format.raw/*1966.32*/("""{"""),format.raw/*1966.33*/("""
        """),format.raw/*1967.9*/("""$next.editable('show');
        """),format.raw/*1968.9*/("""}"""),format.raw/*1968.10*/(""", 300);
        """),format.raw/*1969.9*/("""}"""),format.raw/*1969.10*/(""" """),format.raw/*1969.11*/("""else """),format.raw/*1969.16*/("""{"""),format.raw/*1969.17*/("""
        """),format.raw/*1970.9*/("""$next.focus();
        """),format.raw/*1971.9*/("""}"""),format.raw/*1971.10*/("""
        """),format.raw/*1972.9*/("""}"""),format.raw/*1972.10*/("""
        """),format.raw/*1973.9*/("""}"""),format.raw/*1973.10*/(""");

        """),format.raw/*1975.9*/("""}"""),format.raw/*1975.10*/("""


        """),format.raw/*1978.9*/("""}"""),format.raw/*1978.10*/(""";

        // end pagefunction

        // run pagefunction

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
                  DATE: Thu Aug 28 21:08:59 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/plugins.scala.html
                  HASH: ad9744da94df11421c40ced0fad29ce7b59c1fcc
                  MATRIX: 512->1|617->18|645->21|666->34|705->36|736->41|87792->86987|87823->86988|87854->86989|87901->87006|87932->87007|88622->87667|88653->87668|88693->87678|88742->87697|88773->87698|88813->87708|88982->87847|89013->87848|89053->87858|89144->87919|89175->87920|89215->87930|89406->88091|89437->88092|89476->88102|89589->88185|89620->88186|89658->88195|89733->88241|89764->88242|89837->88285|89868->88286|89906->88295|90035->88395|90066->88396|90237->88537|90268->88538|90306->88547|90368->88579|90399->88580|90437->88589|90563->88686|90594->88687|90635->88699|90666->88700|90705->88710|90795->88770|90826->88771|90864->88780|91073->88959|91104->88960|91142->88969|91243->89041|91274->89042|91312->89051|91343->89052|91412->89091|91443->89092|91481->89101|91690->89280|91721->89281|91759->89290|91859->89361|91890->89362|91928->89371|91959->89372|92052->89435|92083->89436|92121->89445|92379->89673|92410->89674|92448->89683|92541->89747|92572->89748|92611->89758|92642->89759|92703->89790|92734->89791|92772->89800|93030->90028|93061->90029|93099->90038|93194->90104|93225->90105|93263->90114|93294->90115|93540->90331|93571->90332|93609->90341|93677->90380|93708->90381|93747->90391|93966->90580|93997->90581|94035->90590|94095->90620|94126->90621|94164->90630|94244->90681|94275->90682|94315->90693|94346->90694|94385->90704|94564->90853|94595->90854|94634->90864|94719->90919|94750->90920|94788->90929|94904->91016|94935->91017|95007->91059|95038->91060|95076->91069|95216->91180|95247->91181|95319->91223|95350->91224|95388->91233|95530->91345|95561->91346|95599->91355|95732->91459|95763->91460|95801->91469|95832->91470|95904->91512|95935->91513|95973->91522|96065->91585|96096->91586|96166->91627|96197->91628|96228->91629|96432->91803|96463->91804|96502->91814|96599->91881|96630->91882|96668->91891|96879->92073|96910->92074|97036->92170|97067->92171|97105->92180|97300->92346|97331->92347|97409->92395|97440->92396|97478->92405|97685->92583|97716->92584|97794->92632|97825->92633|97863->92642|98056->92806|98087->92807|98128->92819|98159->92820|98198->92830|98406->93008|98437->93009|98476->93019|98548->93061|98579->93062|98617->93071|98696->93121|98727->93122|98766->93132|98880->93217|98911->93218|98950->93228|99226->93474|99257->93475|99296->93485|99342->93501|99373->93502|99411->93511|99466->93536|99497->93537|99535->93546|99608->93590|99639->93591|99705->93627|99736->93628|99774->93637|99893->93727|99924->93728|99984->93758|100015->93759|100053->93768|100124->93810|100155->93811|100193->93820|100224->93821|100264->93832|100295->93833|100334->93843|100504->93983|100535->93984|100573->93993|100683->94074|100714->94075|100753->94085|100808->94110|100839->94111|100877->94120|100982->94196|101013->94197|101052->94207|101106->94231|101137->94232|101175->94241|101281->94318|101312->94319|101351->94329|101408->94356|101439->94357|101477->94366|101582->94442|101613->94443|101652->94453|101706->94477|101737->94478|101776->94488|101820->94502|101851->94503|101889->94512|101962->94555|101993->94556|102031->94565|102104->94609|102135->94610|102270->94715|102301->94716|102339->94725|102389->94745|102420->94746|102458->94755|102533->94801|102564->94802|102632->94840|102663->94841|102701->94850|102739->94858|102770->94859|102808->94868|102874->94905|102905->94906|102943->94915|103144->95087|103175->95088|103240->95123|103271->95124|103309->95133|103358->95153|103389->95154|103453->95188|103484->95189|103522->95198|103666->95313|103697->95314|103761->95348|103792->95349|103830->95358|103876->95375|103907->95376|103973->95412|104004->95413|104042->95422|104285->95636|104316->95637|104381->95672|104412->95673|104450->95682|104487->95689|104518->95690|104556->95699|104767->95881|104798->95882|104836->95891|104867->95892|104929->95924|104960->95925|104998->95934|105079->95986|105110->95987|105174->96021|105205->96022|105243->96031|105306->96064|105337->96065|105375->96074|105463->96133|105494->96134|105533->96144|105564->96145|105602->96154|105633->96155|105696->96188|105727->96189|105758->96190|105833->96235|105864->96236|105902->96245|106349->96663|106380->96664|106459->96714|106490->96715|106625->96820|106656->96821|106694->96830|106776->96882|106807->96883|106845->96892|106903->96921|106934->96922|106972->96931|107003->96932|107055->96954|107086->96955|107124->96964|107263->97073|107294->97074|107332->97083|107448->97170|107479->97171|107517->97180|107548->97181|107600->97203|107631->97204|107669->97213|107774->97288|107805->97289|107843->97298|107954->97380|107985->97381|108023->97390|108054->97391|108106->97413|108137->97414|108175->97423|108259->97477|108290->97478|108328->97487|108379->97508|108410->97509|108448->97518|108517->97558|108548->97559|108580->97561|108611->97562|108649->97571|108720->97613|108751->97614|108783->97616|108814->97617|108852->97626|108924->97669|108955->97670|108987->97672|109018->97673|109056->97682|109128->97725|109159->97726|109191->97728|109222->97729|109260->97738|109331->97780|109362->97781|109394->97783|109425->97784|109463->97793|109532->97833|109563->97834|109632->97874|109663->97875|109701->97884|109732->97885|109844->97967|109875->97968|109913->97977|110084->98118|110115->98119|110153->98128|110245->98190|110276->98191|110314->98200|110394->98250|110425->98251|110463->98260|110549->98317|110580->98318|110618->98327|110655->98334|110686->98335|110717->98336|110770->98359|110801->98360|110841->98371|110872->98372|110903->98373|110938->98378|110969->98379|111007->98388|111080->98432|111111->98433|111149->98442|111211->98475|111242->98476|111280->98485|111395->98570|111426->98571|111464->98580|111532->98618|111563->98619|111601->98628|111698->98695|111729->98696|111767->98705|111805->98713|111836->98714|111912->98760|111943->98761|111984->98773|112015->98774|112076->98806|112107->98807|112138->98808|112173->98813|112204->98814|112242->98823|112318->98870|112349->98871|112387->98880|112418->98881|112456->98890|112608->99013|112639->99014|112678->99024|112794->99110|112825->99111|112863->99120|112922->99149|112953->99150|112991->99159|113085->99224|113116->99225|113147->99226|113182->99231|113213->99232|113251->99241|113334->99295|113365->99296|113403->99305|113434->99306|113531->99373|113562->99374|113600->99383|113721->99475|113752->99476|113783->99477|113818->99482|113849->99483|113887->99492|114008->99584|114039->99585|114078->99595|114306->99793|114337->99794|114375->99803|114461->99860|114492->99861|114578->99917|114609->99918|114647->99927|114793->100044|114824->100045|114891->100082|114922->100083|114960->100092|115017->100119|115048->100120|115086->100129|115189->100203|115220->100204|115258->100213|115289->100214|115350->100245|115381->100246|115419->100255|115491->100297|115522->100298|115560->100307|115628->100346|115659->100347|115691->100349|115722->100350|115760->100359|115830->100400|115861->100401|115940->100450|115971->100451|116009->100460|116052->100473|116083->100474|116121->100483|116208->100541|116239->100542|116310->100583|116341->100584|116379->100593|116441->100626|116472->100627|116531->100656|116562->100657|116600->100666|116693->100730|116724->100731|116755->100732|116790->100737|116821->100738|116859->100747|116913->100772|116944->100773|116982->100782|117013->100783|117051->100792|117082->100793|117179->100860|117210->100861|117248->100870|117304->100897|117335->100898|117401->100934|117432->100935|117470->100944|117512->100956|117543->100957|117581->100966|117637->100993|117668->100994|117706->101003|117737->101004|117831->101068|117862->101069|117900->101078|117969->101117|118000->101118|118038->101127|118093->101153|118124->101154|118162->101163|118193->101164|118264->101205|118295->101206|118333->101215|118462->101314|118493->101315|118531->101324|118630->101394|118661->101395|118717->101421|118748->101422|118786->101431|118864->101480|118895->101481|118933->101490|118964->101491|119030->101527|119061->101528|119099->101537|119158->101567|119189->101568|119294->101643|119325->101644|119363->101653|119488->101749|119519->101750|119582->101783|119613->101784|119651->101793|120376->102489|120407->102490|120471->102524|120502->102525|120540->102534|120610->102574|120641->102575|120679->102584|121434->103310|121465->103311|121503->103320|121534->103321|121598->103355|121629->103356|121667->103365|121739->103407|121770->103408|121808->103417|121878->103458|121909->103459|121941->103461|121972->103462|122010->103471|122079->103511|122110->103512|122142->103514|122173->103515|122211->103524|122280->103564|122311->103565|122343->103567|122374->103568|122412->103577|122486->103622|122517->103623|122549->103625|122580->103626|122618->103635|122688->103676|122719->103677|122758->103687|122789->103688|122851->103720|122882->103721|122920->103730|122994->103774|123025->103775|123063->103784|123181->103873|123212->103874|123250->103883|123281->103884|123358->103931|123389->103932|123427->103941|130726->111211|130757->111212|130805->111230|130836->111231|130874->111240|130919->111255|130950->111256|130988->111265|131048->111296|131079->111297|131119->111308|131150->111309|131215->111344|131246->111345|131284->111354|131350->111390|131381->111391|131419->111400|131467->111419|131498->111420|131536->111429|131567->111430|131632->111465|131663->111466|131701->111475|131760->111504|131791->111505|131829->111514|131931->111587|131962->111588|132029->111625|132060->111626|132098->111635|132193->111701|132224->111702|132290->111738|132321->111739|132359->111748|132401->111760|132432->111761|132470->111770|132540->111811|132571->111812|132609->111821|132845->112028|132876->112029|132914->112038|132945->112039|133042->112106|133073->112107|133111->112116|133189->112164|133220->112165|133258->112174|133391->112277|133422->112278|133460->112287|133513->112310|133544->112311|133582->112320|133643->112352|133674->112353|133719->112369|133750->112370|133781->112371|133816->112376|133847->112377|133885->112386|133937->112409|133968->112410|134006->112419|134037->112420|134075->112429|134106->112430|134147->112442|134178->112443|134218->112454|134249->112455
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|1066->1041|1066->1041|1066->1041|1066->1041|1066->1041|1091->1066|1091->1066|1092->1067|1093->1068|1093->1068|1094->1069|1097->1072|1097->1072|1098->1073|1099->1074|1099->1074|1100->1075|1108->1083|1108->1083|1110->1085|1112->1087|1112->1087|1113->1088|1115->1090|1115->1090|1117->1092|1117->1092|1118->1093|1123->1098|1123->1098|1128->1103|1128->1103|1129->1104|1129->1104|1129->1104|1130->1105|1132->1107|1132->1107|1134->1109|1134->1109|1136->1111|1137->1112|1137->1112|1138->1113|1141->1116|1141->1116|1142->1117|1143->1118|1143->1118|1144->1119|1144->1119|1145->1120|1145->1120|1146->1121|1149->1124|1149->1124|1150->1125|1151->1126|1151->1126|1152->1127|1152->1127|1155->1130|1155->1130|1156->1131|1161->1136|1161->1136|1162->1137|1163->1138|1163->1138|1165->1140|1165->1140|1166->1141|1166->1141|1167->1142|1172->1147|1172->1147|1173->1148|1174->1149|1174->1149|1175->1150|1175->1150|1185->1160|1185->1160|1186->1161|1187->1162|1187->1162|1189->1164|1197->1172|1197->1172|1198->1173|1198->1173|1198->1173|1199->1174|1201->1176|1201->1176|1202->1177|1202->1177|1204->1179|1210->1185|1210->1185|1212->1187|1213->1188|1213->1188|1214->1189|1218->1193|1218->1193|1220->1195|1220->1195|1221->1196|1226->1201|1226->1201|1228->1203|1228->1203|1229->1204|1233->1208|1233->1208|1234->1209|1236->1211|1236->1211|1237->1212|1237->1212|1239->1214|1239->1214|1240->1215|1243->1218|1243->1218|1245->1220|1245->1220|1245->1220|1252->1227|1252->1227|1254->1229|1256->1231|1256->1231|1257->1232|1266->1241|1266->1241|1270->1245|1270->1245|1271->1246|1279->1254|1279->1254|1281->1256|1281->1256|1282->1257|1291->1266|1291->1266|1293->1268|1293->1268|1294->1269|1302->1277|1302->1277|1304->1279|1304->1279|1306->1281|1311->1286|1311->1286|1313->1288|1313->1288|1313->1288|1314->1289|1315->1290|1315->1290|1317->1292|1320->1295|1320->1295|1322->1297|1334->1309|1334->1309|1336->1311|1336->1311|1336->1311|1337->1312|1337->1312|1337->1312|1338->1313|1339->1314|1339->1314|1340->1315|1340->1315|1341->1316|1343->1318|1343->1318|1344->1319|1344->1319|1345->1320|1346->1321|1346->1321|1347->1322|1347->1322|1348->1323|1348->1323|1350->1325|1356->1331|1356->1331|1357->1332|1358->1333|1358->1333|1360->1335|1360->1335|1360->1335|1361->1336|1362->1337|1362->1337|1364->1339|1364->1339|1364->1339|1365->1340|1366->1341|1366->1341|1368->1343|1368->1343|1368->1343|1369->1344|1370->1345|1370->1345|1372->1347|1372->1347|1372->1347|1374->1349|1374->1349|1374->1349|1375->1350|1376->1351|1376->1351|1377->1352|1378->1353|1378->1353|1380->1355|1380->1355|1381->1356|1381->1356|1381->1356|1382->1357|1383->1358|1383->1358|1384->1359|1384->1359|1385->1360|1385->1360|1385->1360|1386->1361|1388->1363|1388->1363|1389->1364|1392->1367|1392->1367|1393->1368|1393->1368|1394->1369|1395->1370|1395->1370|1396->1371|1396->1371|1397->1372|1402->1377|1402->1377|1403->1378|1403->1378|1404->1379|1405->1380|1405->1380|1406->1381|1406->1381|1407->1382|1412->1387|1412->1387|1413->1388|1413->1388|1414->1389|1414->1389|1414->1389|1415->1390|1418->1393|1418->1393|1419->1394|1419->1394|1420->1395|1420->1395|1421->1396|1422->1397|1422->1397|1423->1398|1423->1398|1424->1399|1424->1399|1424->1399|1425->1400|1426->1401|1426->1401|1427->1402|1427->1402|1428->1403|1428->1403|1429->1404|1429->1404|1429->1404|1429->1404|1429->1404|1430->1405|1432->1407|1432->1407|1434->1409|1434->1409|1439->1414|1439->1414|1440->1415|1441->1416|1441->1416|1442->1417|1443->1418|1443->1418|1444->1419|1444->1419|1446->1421|1446->1421|1447->1422|1450->1425|1450->1425|1451->1426|1453->1428|1453->1428|1454->1429|1454->1429|1456->1431|1456->1431|1457->1432|1459->1434|1459->1434|1460->1435|1462->1437|1462->1437|1463->1438|1463->1438|1465->1440|1465->1440|1466->1441|1467->1442|1467->1442|1468->1443|1468->1443|1468->1443|1469->1444|1471->1446|1471->1446|1471->1446|1471->1446|1472->1447|1474->1449|1474->1449|1474->1449|1474->1449|1475->1450|1477->1452|1477->1452|1477->1452|1477->1452|1478->1453|1480->1455|1480->1455|1480->1455|1480->1455|1481->1456|1483->1458|1483->1458|1483->1458|1483->1458|1484->1459|1486->1461|1486->1461|1488->1463|1488->1463|1489->1464|1489->1464|1492->1467|1492->1467|1493->1468|1496->1471|1496->1471|1497->1472|1497->1472|1497->1472|1498->1473|1499->1474|1499->1474|1500->1475|1501->1476|1501->1476|1502->1477|1502->1477|1502->1477|1502->1477|1502->1477|1502->1477|1503->1478|1503->1478|1503->1478|1503->1478|1503->1478|1504->1479|1505->1480|1505->1480|1506->1481|1507->1482|1507->1482|1508->1483|1510->1485|1510->1485|1511->1486|1511->1486|1511->1486|1512->1487|1513->1488|1513->1488|1514->1489|1514->1489|1514->1489|1514->1489|1514->1489|1515->1490|1515->1490|1517->1492|1517->1492|1517->1492|1517->1492|1517->1492|1518->1493|1519->1494|1519->1494|1520->1495|1520->1495|1521->1496|1523->1498|1523->1498|1525->1500|1529->1504|1529->1504|1530->1505|1530->1505|1530->1505|1531->1506|1532->1507|1532->1507|1532->1507|1532->1507|1532->1507|1533->1508|1534->1509|1534->1509|1535->1510|1535->1510|1537->1512|1537->1512|1538->1513|1540->1515|1540->1515|1540->1515|1540->1515|1540->1515|1541->1516|1543->1518|1543->1518|1545->1520|1550->1525|1550->1525|1551->1526|1552->1527|1552->1527|1555->1530|1555->1530|1556->1531|1561->1536|1561->1536|1563->1538|1563->1538|1564->1539|1564->1539|1564->1539|1565->1540|1567->1542|1567->1542|1568->1543|1568->1543|1570->1545|1570->1545|1571->1546|1572->1547|1572->1547|1573->1548|1575->1550|1575->1550|1575->1550|1575->1550|1576->1551|1578->1553|1578->1553|1579->1554|1579->1554|1580->1555|1580->1555|1580->1555|1581->1556|1584->1559|1584->1559|1584->1559|1584->1559|1585->1560|1586->1561|1586->1561|1588->1563|1588->1563|1589->1564|1590->1565|1590->1565|1590->1565|1590->1565|1590->1565|1591->1566|1592->1567|1592->1567|1593->1568|1593->1568|1594->1569|1594->1569|1598->1573|1598->1573|1599->1574|1600->1575|1600->1575|1602->1577|1602->1577|1603->1578|1603->1578|1603->1578|1604->1579|1605->1580|1605->1580|1606->1581|1606->1581|1610->1585|1610->1585|1611->1586|1612->1587|1612->1587|1613->1588|1614->1589|1614->1589|1615->1590|1615->1590|1617->1592|1617->1592|1618->1593|1620->1595|1620->1595|1621->1596|1623->1598|1623->1598|1624->1599|1624->1599|1625->1600|1627->1602|1627->1602|1628->1603|1628->1603|1630->1605|1630->1605|1631->1606|1632->1607|1632->1607|1635->1610|1635->1610|1636->1611|1639->1614|1639->1614|1641->1616|1641->1616|1642->1617|1650->1625|1650->1625|1652->1627|1652->1627|1653->1628|1654->1629|1654->1629|1655->1630|1665->1640|1665->1640|1666->1641|1666->1641|1668->1643|1668->1643|1669->1644|1671->1646|1671->1646|1672->1647|1674->1649|1674->1649|1674->1649|1674->1649|1675->1650|1677->1652|1677->1652|1677->1652|1677->1652|1678->1653|1680->1655|1680->1655|1680->1655|1680->1655|1681->1656|1683->1658|1683->1658|1683->1658|1683->1658|1684->1659|1686->1661|1686->1661|1687->1662|1687->1662|1689->1664|1689->1664|1690->1665|1691->1666|1691->1666|1692->1667|1694->1669|1694->1669|1695->1670|1695->1670|1698->1673|1698->1673|1699->1674|1951->1926|1951->1926|1951->1926|1951->1926|1952->1927|1952->1927|1952->1927|1953->1928|1955->1930|1955->1930|1956->1931|1956->1931|1958->1933|1958->1933|1959->1934|1960->1935|1960->1935|1961->1936|1962->1937|1962->1937|1963->1938|1963->1938|1965->1940|1965->1940|1966->1941|1967->1942|1967->1942|1968->1943|1971->1946|1971->1946|1972->1947|1972->1947|1973->1948|1975->1950|1975->1950|1976->1951|1976->1951|1977->1952|1977->1952|1977->1952|1978->1953|1980->1955|1980->1955|1981->1956|1984->1959|1984->1959|1985->1960|1985->1960|1987->1962|1987->1962|1988->1963|1988->1963|1988->1963|1989->1964|1990->1965|1990->1965|1991->1966|1991->1966|1991->1966|1992->1967|1993->1968|1993->1968|1994->1969|1994->1969|1994->1969|1994->1969|1994->1969|1995->1970|1996->1971|1996->1971|1997->1972|1997->1972|1998->1973|1998->1973|2000->1975|2000->1975|2003->1978|2003->1978
                  -- GENERATED --
              */
          