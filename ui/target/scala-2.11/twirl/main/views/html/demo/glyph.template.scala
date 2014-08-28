
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
object glyph extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><style>
    /*
     * Glyphicons
     *
     * Special styles for displaying the icons and their classes in the docs.
     */

    .bs-glyphicons """),format.raw/*11.20*/("""{"""),format.raw/*11.21*/("""
    """),format.raw/*12.5*/("""padding-left: 0;
    padding-bottom: 1px;
    margin-bottom: 20px;
    list-style: none;
    overflow: hidden;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
    """),format.raw/*18.5*/(""".bs-glyphicons li """),format.raw/*18.23*/("""{"""),format.raw/*18.24*/("""
    """),format.raw/*19.5*/("""float: left;
    width: 25%;
    height: 115px;
    padding: 10px;
    margin: 0 -1px -1px 0;
    font-size: 12px;
    line-height: 1.4;
    text-align: center;
    border: 1px solid #ddd;
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/("""
    """),format.raw/*29.5*/(""".bs-glyphicons .glyphicon """),format.raw/*29.31*/("""{"""),format.raw/*29.32*/("""
    """),format.raw/*30.5*/("""margin-top: 5px;
    margin-bottom: 10px;
    font-size: 24px;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
    """),format.raw/*34.5*/(""".bs-glyphicons .glyphicon-class """),format.raw/*34.37*/("""{"""),format.raw/*34.38*/("""
    """),format.raw/*35.5*/("""display: block;
    text-align: center;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
    """),format.raw/*38.5*/(""".bs-glyphicons li:hover """),format.raw/*38.29*/("""{"""),format.raw/*38.30*/("""
    """),format.raw/*39.5*/("""background-color: rgba(86,61,124,.1);
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/("""

        """),format.raw/*42.9*/("""@media (min-width: 768px) """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
    """),format.raw/*43.5*/(""".bs-glyphicons li """),format.raw/*43.23*/("""{"""),format.raw/*43.24*/("""
    """),format.raw/*44.5*/("""width: 12.5%;
    """),format.raw/*45.5*/("""}"""),format.raw/*45.6*/("""
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""

    """),format.raw/*48.5*/("""</style>

        <div class="row">
            <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
                <h1 class="page-title txt-color-blueDark"><i class="fa fa-desktop fa-fw "></i>
                    UI Elements
                    <span>&gt;
                        Icons &gt; Glyph Icons
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

            <div class="well well-sm">
                <div class="input-group">
                    <input class="form-control input-lg" type="text" id="glyph-search" placeholder="Search for an icon...">
                    <span class="input-group-addon"><i class="fa fa-fw fa-lg fa-search"></i></span>
                </div>
            </div>

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-purple" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false">
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
                            <h2>Glyph Icons </h2>
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

                                <ul class="bs-glyphicons">
                                    <li>
                                        <span class="glyphicon glyphicon-adjust"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-adjust</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-align-center"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-align-center</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-align-justify"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-align-justify</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-align-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-align-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-align-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-align-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-arrow-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-arrow-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-arrow-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-arrow-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-asterisk"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-asterisk</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-backward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-backward</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-ban-circle"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-ban-circle</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-barcode"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-barcode</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-bell"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-bell</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-bold"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-bold</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-book"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-book</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-bookmark"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-bookmark</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-briefcase"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-briefcase</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-bullhorn"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-bullhorn</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-calendar"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-calendar</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-camera"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-camera</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-certificate"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-certificate</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-check"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-check</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-chevron-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-chevron-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-chevron-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-chevron-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-circle-arrow-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-circle-arrow-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-circle-arrow-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-circle-arrow-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-cloud"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-cloud</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-cloud-download"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-cloud-download</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-cloud-upload"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-cloud-upload</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-cog"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-cog</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-collapse-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-collapse-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-collapse-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-collapse-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-comment"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-comment</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-compressed"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-compressed</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-copyright-mark"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-copyright-mark</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-credit-card"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-credit-card</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-cutlery"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-cutlery</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-dashboard"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-dashboard</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-download"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-download</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-download-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-download-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-earphone"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-earphone</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-edit"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-edit</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-eject"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-eject</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-envelope"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-envelope</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-euro"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-euro</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-exclamation-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-exclamation-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-expand"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-expand</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-export"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-export</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-eye-close"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-eye-close</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-eye-open"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-eye-open</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-facetime-video"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-facetime-video</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-fast-backward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-fast-backward</span>
          """),
format.raw("""                          </li>
                                    <li>
                                        <span class="glyphicon glyphicon-fast-forward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-fast-forward</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-file"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-file</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-film"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-film</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-filter"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-filter</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-fire"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-fire</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-flag"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-flag</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-flash"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-flash</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-floppy-disk"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-disk</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-floppy-open"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-open</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-floppy-remove"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-remove</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-floppy-save"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-save</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-floppy-saved"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-saved</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-folder-close"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-folder-close</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-folder-open"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-folder-open</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-font"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-font</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-forward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-forward</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-fullscreen"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-fullscreen</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-gbp"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-gbp</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-gift"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-gift</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-glass"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-glass</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-globe"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-globe</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hand-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hand-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hand-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hand-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hand-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hand-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hand-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hand-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hd-video"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hd-video</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-hdd"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-hdd</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-header"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-header</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-headphones"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-headphones</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-heart"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-heart</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-heart-empty"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-heart-empty</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-home"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-home</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-import"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-import</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-inbox"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-inbox</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-indent-left"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-indent-left</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-indent-right"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-indent-right</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-info-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-info-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-italic"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-italic</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-leaf"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-leaf</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-link"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-link</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-list"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-list</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-list-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-list-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-lock"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-lock</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-log-in"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-log-in</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-log-out"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-log-out</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-magnet"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-magnet</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-map-marker"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-map-marker</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-minus"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-minus</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-minus-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-minus-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-move"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-move</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-music"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-music</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-new-window"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-new-window</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-off"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-off</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-ok"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-ok</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-ok-circle"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-ok-circle</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-ok-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-ok-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-open"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-open</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-paperclip"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-paperclip</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-pause"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-pause</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-pencil"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-pencil</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-phone"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-phone</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-phone-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-phone-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-picture"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-picture</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-plane"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-plane</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-play"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-play</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-play-circle"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-play-circle</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-plus"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-plus</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-plus-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-plus-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-print"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-print</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-pushpin"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-pushpin</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-qrcode"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-qrcode</span>
                                    </li>
                                    <li>
                                        <span class="gl"""),
format.raw("""yphicon glyphicon-question-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-question-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-random"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-random</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-record"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-record</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-refresh"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-refresh</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-registration-mark"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-registration-mark</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-remove"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-remove</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-remove-circle"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-remove-circle</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-remove-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-remove-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-repeat"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-repeat</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-resize-full"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-resize-full</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-resize-horizontal"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-resize-horizontal</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-resize-small"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-resize-small</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-resize-vertical"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-resize-vertical</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-retweet"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-retweet</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-road"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-road</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-save"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-save</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-saved"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-saved</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-screenshot"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-screenshot</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sd-video"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sd-video</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-search"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-search</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-send"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-send</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-share"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-share</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-share-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-share-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-shopping-cart"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-shopping-cart</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-signal"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-signal</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-alphabet</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-alphabet-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-alphabet-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-attributes"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-attributes</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-attributes-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-attributes-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-order"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-order</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sort-by-order-alt"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-order-alt</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sound-5-1"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sound-5-1</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sound-6-1"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sound-6-1</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sound-7-1"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sound-7-1</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sound-dolby"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sound-dolby</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-sound-stereo"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-sound-stereo</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-star"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-star</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-star-empty"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-star-empty</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-stats"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-stats</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-step-backward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-step-backward</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-step-forward"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-step-forward</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-stop"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-stop</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-subtitles"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-subtitles</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tag"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tag</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tags"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tags</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tasks"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tasks</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-text-height"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-text-height</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-text-width"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-text-width</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-th"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-th</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-th-large"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-th-large</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-th-list"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-th-list</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-thumbs-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-thumbs-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-thumbs-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-thumbs-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-time"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-time</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tint"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tint</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tower"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tower</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-transfer"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-transfer</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-trash"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-trash</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tree-conifer"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tree-conifer</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-tree-deciduous"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-tree-deciduous</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-unchecked"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-unchecked</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-upload"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-upload</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-usd"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-usd</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-user"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-user</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-volume-down"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-volume-down</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-volume-off"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-volume-off</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-volume-up"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-volume-up</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-warning-sign"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-warning-sign</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-wrench"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-wrench</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-zoom-in"></span>
                                        <span class="glyphicon-class">.glyphicon .gly"""),
format.raw("""phicon-zoom-in</span>
                                    </li>
                                    <li>
                                        <span class="glyphicon glyphicon-zoom-out"></span>
                                        <span class="glyphicon-class">.glyphicon .glyphicon-zoom-out</span>
                                    </li>
                                </ul>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*968.45*/("""{"""),format.raw/*968.46*/(""" """),format.raw/*968.47*/("""trigger: "hover" """),format.raw/*968.64*/("""}"""),format.raw/*968.65*/(""");
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
         * var pagefunction = function() """),format.raw/*993.42*/("""{"""),format.raw/*993.43*/("""
         """),format.raw/*994.10*/("""*   ...
         * """),format.raw/*995.12*/("""}"""),format.raw/*995.13*/("""
         """),format.raw/*996.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*999.42*/("""{"""),format.raw/*999.43*/("""
         """),format.raw/*1000.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*1001.12*/("""}"""),format.raw/*1001.13*/("""
         """),format.raw/*1002.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*1012.39*/("""{"""),format.raw/*1012.40*/("""

        """),format.raw/*1014.9*/("""function hide_divs(search) """),format.raw/*1014.36*/("""{"""),format.raw/*1014.37*/("""
        """),format.raw/*1015.9*/("""$(".bs-glyphicons li").hide(); // hide all divs
        $('.bs-glyphicons li > span[class*="'+search+'"]').parent().show(); // show the ones that match
        """),format.raw/*1017.9*/("""}"""),format.raw/*1017.10*/("""

        """),format.raw/*1019.9*/("""function show_all() """),format.raw/*1019.29*/("""{"""),format.raw/*1019.30*/("""
        """),format.raw/*1020.9*/("""$(".bs-glyphicons li").show()
        """),format.raw/*1021.9*/("""}"""),format.raw/*1021.10*/("""

        """),format.raw/*1023.9*/("""$("#glyph-search").keyup(function() """),format.raw/*1023.45*/("""{"""),format.raw/*1023.46*/("""
        """),format.raw/*1024.9*/("""var search = $.trim(this.value);
        if (search === "") """),format.raw/*1025.28*/("""{"""),format.raw/*1025.29*/("""
        """),format.raw/*1026.9*/("""show_all();
        """),format.raw/*1027.9*/("""}"""),format.raw/*1027.10*/("""
        """),format.raw/*1028.9*/("""else """),format.raw/*1028.14*/("""{"""),format.raw/*1028.15*/("""
        """),format.raw/*1029.9*/("""hide_divs(search);
        """),format.raw/*1030.9*/("""}"""),format.raw/*1030.10*/("""
        """),format.raw/*1031.9*/("""}"""),format.raw/*1031.10*/(""");

        """),format.raw/*1033.9*/("""}"""),format.raw/*1033.10*/(""";

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
                  DATE: Thu Aug 28 21:08:57 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/glyph.scala.html
                  HASH: 3848434168a1b286b55c624e7ca84a7e5279c670
                  MATRIX: 510->1|615->18|643->21|664->34|703->36|734->41|946->225|975->226|1007->231|1149->346|1177->347|1209->352|1255->370|1284->371|1316->376|1536->569|1564->570|1596->575|1650->601|1679->602|1711->607|1805->674|1833->675|1865->680|1925->712|1954->713|1986->718|2057->762|2085->763|2117->768|2169->792|2198->793|2230->798|2299->840|2327->841|2364->851|2418->878|2447->879|2479->884|2525->902|2554->903|2586->908|2631->926|2659->927|2691->932|2719->933|2752->939|64200->62298|64230->62299|64260->62300|64306->62317|64336->62318|65025->62978|65055->62979|65094->62989|65142->63008|65172->63009|65211->63019|65379->63158|65409->63159|65449->63169|65540->63230|65571->63231|65611->63241|65835->63435|65866->63436|65905->63446|65962->63473|65993->63474|66031->63483|66220->63643|66251->63644|66290->63654|66340->63674|66371->63675|66409->63684|66476->63722|66507->63723|66546->63733|66612->63769|66643->63770|66681->63779|66771->63839|66802->63840|66840->63849|66889->63869|66920->63870|66958->63879|66993->63884|67024->63885|67062->63894|67118->63921|67149->63922|67187->63931|67218->63932|67259->63944|67290->63945
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|32->11|32->11|33->12|38->17|38->17|39->18|39->18|39->18|40->19|49->28|49->28|50->29|50->29|50->29|51->30|54->33|54->33|55->34|55->34|55->34|56->35|58->37|58->37|59->38|59->38|59->38|60->39|61->40|61->40|63->42|63->42|63->42|64->43|64->43|64->43|65->44|66->45|66->45|67->46|67->46|69->48|992->968|992->968|992->968|992->968|992->968|1017->993|1017->993|1018->994|1019->995|1019->995|1020->996|1023->999|1023->999|1024->1000|1025->1001|1025->1001|1026->1002|1036->1012|1036->1012|1038->1014|1038->1014|1038->1014|1039->1015|1041->1017|1041->1017|1043->1019|1043->1019|1043->1019|1044->1020|1045->1021|1045->1021|1047->1023|1047->1023|1047->1023|1048->1024|1049->1025|1049->1025|1050->1026|1051->1027|1051->1027|1052->1028|1052->1028|1052->1028|1053->1029|1054->1030|1054->1030|1055->1031|1055->1031|1057->1033|1057->1033
                  -- GENERATED --
              */
          