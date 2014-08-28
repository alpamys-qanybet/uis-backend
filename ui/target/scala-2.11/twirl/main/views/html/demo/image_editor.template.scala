
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
object image_editor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-pencil-square-o"></i> Forms <span>&gt;
                    Image Editor </span></h1>
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

                    <div class="alert alert-danger hidden-lg hidden-md hidden-sm">
                        <b>Please note:</b>
                        This plugin is non-responsive
                    </div>

                        <!-- Widget ID (each widget will need unique ID)-->

                    <div class="jarviswidget jarviswidget-sortable" id="wid-id-0" data-widget-togglebutton="false" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" role="widget" style="">
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
                        <header role="heading">
                            <span class="widget-icon"> <i class="fa fa-file-image-o txt-color-darken"></i> </span>
                            <h2 class="hidden-xs hidden-sm">jcrop </h2>

                            <ul class="nav nav-tabs pull-right in" id="myTab">

                                <li class="active">
                                    <a data-toggle="tab" href="#s1"><i class="fa fa-crop text-success"></i> <span class="hidden-mobile hidden-tablet">API</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s2"><i class="fa fa-crop text-primary"></i> <span class="hidden-mobile hidden-tablet">Default</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s3"><i class="fa fa-crop text-warning"></i> <span class="hidden-mobile hidden-tablet">Basic</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s4"><i class="fa fa-crop text-danger"></i> <span class="hidden-mobile hidden-tablet">Aspect Ratio</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s5"><i class="fa fa-crop txt-color-purple"></i> <span class="hidden-mobile hidden-tablet">Animations</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s6"><i class="fa fa-crop txt-color-pink"></i> <span class="hidden-mobile hidden-tablet">Styling</span></a>
                                </li>

                            </ul>

                            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span>
                        </header>

                            <!-- widget div-->
                        <div role="content">
                                <!-- widget edit box -->

                            <div class="widget-body">
                                    <!-- content -->
                                <div id="myTabContent" class="tab-content">

                                        <!-- new tab: API interface -->
                                    <div class="tab-pane fade active in" id="s1">

                                        <h4 class="margin-bottom-10">API Interface — real-time API example</h4>

                                        <div class="alert alert-info">
                                            <b>Experimental shader active.</b>
                                            Jcrop now includes a shading mode that facilitates building
                                            better transparent Jcrop instances. The experimental shader is less
                                            robust than Jcrop's default shading method and should only be
                                            used if you require this functionality.
                                            <br>
                                            View jcrop's documentation by going to: <a href="http://deepliquid.com/content/Jcrop.html" target="_blank">http://deepliquid.com/content/Jcrop.html</a>
                                        </div>

                                        <style type="text/css">
                                        .optdual """),format.raw/*113.50*/("""{"""),format.raw/*113.51*/("""
                                        """),format.raw/*114.41*/("""position: relative;
                                        """),format.raw/*115.41*/("""}"""),format.raw/*115.42*/("""
                                        """),format.raw/*116.41*/(""".optdual .offset """),format.raw/*116.58*/("""{"""),format.raw/*116.59*/("""
                                        """),format.raw/*117.41*/("""position: absolute;
                                        left: 18em;
                                        """),format.raw/*119.41*/("""}"""),format.raw/*119.42*/("""
                                        """),format.raw/*120.41*/(""".optlist label """),format.raw/*120.56*/("""{"""),format.raw/*120.57*/("""
                                        """),format.raw/*121.41*/("""width: 16em;
                                        display: block;
                                        """),format.raw/*123.41*/("""}"""),format.raw/*123.42*/("""
                                        """),format.raw/*124.41*/("""#dl_links """),format.raw/*124.51*/("""{"""),format.raw/*124.52*/("""
                                        """),format.raw/*125.41*/("""margin-top: .5em;
                                        """),format.raw/*126.41*/("""}"""),format.raw/*126.42*/("""

                                        """),format.raw/*128.41*/("""</style>

                                        <img src="img/superbox/superbox-full-7.jpg" id="target-5" alt="[Jcrop Example]" class="pull-left" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder" style="width: 600px; height: 400px; position: relative; background-color: rgb(0, 0, 0);"><div style="position: absolute; z-index: 600; width: 299px; height: 199px; top: 100px; left: 100px;"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-7.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: -100px; left: -100px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: block;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-7.jpg" alt="[Jcrop Example]" class="pull-left" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; opacity: 0.6;"></div>

                                        <div class="pull-left padding-gutter padding-top-0 padding-bottom-0">

                                            <fieldset>

                                                <legend>
                                                    Option Toggles
                                                </legend>

                                                <span class="requiresjcrop" style="display: inline;">
                                                    <button id="setSelect" class="btn btn-default btn-sm">
                                                        setSelect
                                                    </button>
                                                    <button id="animateTo" class="btn btn-default btn-sm">
                                                        animateTo
                                                    </button>
                                                    <button id="release" class="btn btn-default btn-sm">
                                                        Release
                                                    </button>
                                                    <button id="disable" class="btn btn-default btn-sm">
                                                        Disable
                                                    </button>
                                                </span>
                                                <button id="enable" class="btn btn-default btn-sm" style="display:none;">
                                                    Re-Enable
                                                </button>
                                                <button id="unhook" class="btn btn-default btn-sm">
                                                    Destroy!
                                                </button>
                                                <button id="rehook" class="btn btn-default btn-sm" style="display:none;">
                                                    Attach Jcrop
                                                </button>
                                            </fieldset>

                                            <fieldset class="optdual requiresjcrop" style="display: block;">
                                                <legend>
                                                    Option Toggles
                                                </legend>
                                                <div class="optlist offset">
                                                    <label class="margin-top-0">
                                                        <input type="checkbox" class="checkbox style-0" id="ar_lock">
                                                        <span>Aspect ratio</span>
                                                    </label>

                                                    <label class="">
                                                        <input type="checkbox" class="checkbox style-0" id="size_lock">
                                                        <span>minSize/maxSize setting</span>
                                                    </label>
                                                </div>
                                                <div class="optlist">
                                                    <label class="margin-top-0">
                                                        <input type="checkbox" class="checkbox style-0" id="can_click" checked="checked">
                                                        <span>Allow new selections</span>
                                                    </label>

                                                    <label class="">
                                                        <input type="checkbox" class="checkbox style-0" id="can_move" checked="checked">
                                                        <span>Selection can be moved</span>
                                                    </label>

                                                    <label class="">
                                                        <input type="checkbox" class="checkbox style-0" id="can_size" checked="checked">
                                                        <span>Resizable selection</span>
                                                    </label>

                                                </div>
                                            </fieldset>

                                            <fieldset class="requiresjcrop" style="display: block;">
                                                <legend>
                                                    Change Image
                                                </legend>
                                                <div class="btn-group">
                                                    <button class="btn btn-default" id="img2">
                                                        Lego
                                                    </button>
                                                    <button class="btn btn-default active" id="img1">
                                                        Breakdance
                                                    </button>
                                                    <button class="btn btn-default" id="img3">
                                                        Dragon Fly
                                                    </button>
                                                </div>
                                            </fieldset>

                                        </div>

                                    </div>
                                        <!-- end s1 tab pane -->

                                        <!-- new tab: Default -->
                                    <div class="tab-pane fade" id="s2">

                                        <h4 class="margin-bottom-10">Default Behaviour</h4>

                                        <div class="alert alert-info">
                                            <b>This example demonstrates the default behavior of Jcrop.</b>
                                            <br>
                                            Since no event handlers have been attached it only performs
                                            the cropping behavior.
                                        </div>

                                        <img src="img/superbox/superbox-full-11.jpg" id="target" alt="[Jcrop Example]" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder" style="width: 600px; height: 400px; position: relative; background-color: rgb(0, 0, 0);"><div style="position: absolute; z-index: 600;"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-11.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: none;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-11.jpg" alt="[Jcrop Example]" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px;"></div>

                                    </div>
                                        <!-- end s1 tab pane -->

                                        <!-- new tab: Basic handler -->
                                    <div class="tab-pane fade" id="s3">

                                        <h4 class="margin-bottom-10">Basic Handler — basic form integration</h4>

                                        <div class="alert alert-info">
                                            <b>An example with a basic event handler.</b> Here we've tied
                                            several form values together with a simple event handler invocation.
                                            The result is that the form values are updated in real-time as
                                            the selection is changed using Jcrop's <em>onChange</em> handler.
                                        </div>

                                            <!-- This is the image we're attaching Jcrop to -->
                                        <img src="img/superbox/superbox-full-10.jpg" id="target-2" alt="[Jcrop Example]" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder" style="width: 600px; height: 400px; position: relative; background-color: rgb(0, 0, 0);"><div style="position: absolute; z-index: 600;"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-10.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: none;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-10.jpg" alt="[Jcrop Example]" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px;"></div>

                                            <!-- This is the form that our event handler fills -->
                                        <form id="coords" class="coords margin-top-10" onsubmit="return false;" action="http://example.com/post.php">

                                            <div class="inline-labels">
                                                <label>X1
                                                    <input type="text" size="4" id="x1" name="x1">
                                                </label>
                                                <label>Y1
                                                    <input type="text" size="4" id="y1" name="y1">
                                                </label>
                                                <label>X2
                                                    <input type="text" size="4" id="x2" name="x2">
                                                </label>
                                                <label>Y2
                                                    <input type="text" size="4" id="y2" name="y2">
                                                </label>
                                                <label>W
                                                    <input type="text" size="4" id="w" name="w">
                                                </label>
                                                <label>H
                                                    <input type="text" size="4" id="h" name="h">
                                                </label>
                                            </div>
                                        </form>

                                    </div>
                                        <!-- end s2 tab pane -->

                                        <!-- new tab: Aspect ratio -->
                                    <div class="tab-pane fade" id="s4">

                                        <style type="text/css">
                                        /* Apply these styles only when #preview-pane has
                                         been placed within the Jcrop widget */
                                        .jcrop-holder #preview-pane """),format.raw/*287.69*/("""{"""),format.raw/*287.70*/("""
                                        """),format.raw/*288.41*/("""display: block;
                                        position: absolute;
                                        z-index: 200;
                                        right: -280px;
                                        padding: 3px;
                                        border: 1px rgba(0,0,0,.4) solid;
                                        background-color: white;
                                        -webkit-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.1);
                                        -moz-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.1);
                                        box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.1);
                                        """),format.raw/*298.41*/("""}"""),format.raw/*298.42*/("""

                                        """),format.raw/*300.41*/("""/* The Javascript code will set the aspect ratio of the crop
                                         area based on the size of the thumbnail preview,
                                         specified here */
                                        #preview-pane .preview-container """),format.raw/*303.74*/("""{"""),format.raw/*303.75*/("""
                                        """),format.raw/*304.41*/("""width: 250px;
                                        height: 170px;
                                        overflow: hidden;
                                        """),format.raw/*307.41*/("""}"""),format.raw/*307.42*/("""

                                        """),format.raw/*309.41*/("""</style>

                                        <h4 class="margin-bottom-10">Aspect Ratio w/ Preview Pane — nice visual example</h4>

                                        <div class="alert alert-info">
                                            <b>An example implementing a preview pane.</b>
                                            Obviously the most visual demo, the preview pane is accomplished
                                            entirely outside of Jcrop with a simple jQuery-flavored callback.
                                            This type of interface could be useful for creating a thumbnail
                                            or avatar. The onChange event handler is used to update the
                                            view in the preview pane.
                                        </div>

                                        <img src="img/superbox/superbox-full-9.jpg" id="target-3" alt="[Jcrop Example]" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder" style="width: 600px; height: 400px; position: relative; background-color: rgb(0, 0, 0);"><div style="position: absolute; z-index: 600;"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-9.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: none;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-9.jpg" alt="[Jcrop Example]" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px;"><div id="preview-pane">
                                        <div class="preview-container">
                                            <img src="img/superbox/superbox-full-9.jpg" class="jcrop-preview" id="target-3" alt="Preview">
                                        </div>
                                    </div></div>



                                    </div>
                                        <!-- end s3 tab pane -->

                                        <!-- new tab: animation/transitions -->
                                    <div class="tab-pane fade" id="s5">

                                        <h4 class="margin-bottom-10">Animation/Transitions — animation/fading demo</h4>

                                        <div class="alert alert-info">
                                            <b>Experimental shader active.</b>
                                            Jcrop now includes a shading mode that facilitates building
                                            better transparent Jcrop instances. The experimental shader is less
                                            robust than Jcrop's default shading method and should only be
                                            used if you require this functionality.
                                        </div>

                                        <div class="row">

                                            <div class="col-sm-12 col-md-12 col-lg-12">

                                                <img src="img/superbox/superbox-full-7.jpg" id="target-4" alt="Jcrop Image" class="pull-left" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder" style="width: 600px; height: 400px; position: relative; background-color: rgb(0, 0, 0);"><div style="position: absolute; z-index: 600; width: 480px; height: 260px; top: 70px; left: 60px;"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-7.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: -70px; left: -60px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: block;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-7.jpg" alt="Jcrop Image" class="pull-left" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; opacity: 0.19999999999999996;"></div>


                                                <div id="interface" class="pull-left padding-gutter padding-top-0 padding-bottom-0"><fieldset id="anim_buttons"><legend>Animate Selection</legend><div class="btn-toolbar"><div class="btn-group"><button class="btn btn-default btn-small">1</button> <button class="btn btn-default btn-small">2</button> <button class="btn btn-default btn-small">3</button> <button class="btn btn-default btn-small">4</button> <button class="btn btn-default btn-small">5</button> <button class="btn btn-default btn-small">Bye!</button></div></div></fieldset><fieldset id="bgo_buttons"><legend>Change bgOpacity</legend><div class="btn-toolbar"><div class="btn-group"><button class="btn btn-default btn-small active">Low</button> <button class="btn btn-default btn-small">Mid</button> <button class="btn btn-default btn-small">High</button> <button class="btn btn-default btn-small">Full</button> </div></div></fieldset><fieldset id="bgc_buttons"><legend>Change bgColor</legend><div class="btn-toolbar"><div class="btn-group"><button class="btn btn-default btn-small" style="background-color: rgb(153, 0, 0); color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">R</button> <button class="btn btn-default btn-small" style="background-color: rgb(75, 182, 240); color: rgb(0, 0, 0); background-position: initial initial; background-repeat: initial initial;">B</button> <button class="btn btn-default btn-small" style="background-color: rgb(240, 178, 7); color: rgb(0, 0, 0); background-position: initial initial; background-repeat: initial initial;">Y</button> <button class="btn btn-default btn-small" style="background-color: rgb(70, 184, 28); color: rgb(0, 0, 0); background-position: initial initial; background-repeat: initial initial;">G</button> <button class="btn btn-default btn-small" style="background-color: white; color: rgb(0, 0, 0); background-position: initial initial; background-repeat: initial initial;">W</button> <button class="btn btn-default btn-small active" style="background-color: black; color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">K</button> </div></div></fieldset>

                                                    <label class="checkbox">
                                                        <input type="checkbox" class="checkbox style-0" id="fadetog" checked="checked">
                                                        <span>Enable fading (bgFade: true)</span>
                                                    </label>
                                                    <label class="checkbox">
                                                        <input type="checkbox" class="checkbox style-0" id="shadetog">
                                                        <span>Use experimental shader (shade: true)</span>
                                                    </label>

                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                        <!-- end s4 tab pane -->

                                        <!-- new tab: Styling -->
                                    <div class="tab-pane fade padding-10 no-padding-bottom" id="s6">

                                        <h4 class="margin-bottom-10">Styling Example — style Jcrop dynamically with CSS</h4>

                                        <img src="img/superbox/superbox-full-16.jpg" id="target-6" alt="[Jcrop Example]" style="display: none; visibility: hidden; width: 600px; height: 400px;"><div class="jcrop-holder jcrop-light" style="width: 600px; height: 400px; position: relative; background-color: rgb(255, 255, 255);"><div style="position: absolute; z-index: 600; width: 350px; height: 285px; top: 65px; left: 130px;" class="jcrop-selection"><div style="width: 100%; height: 100%; z-index: 310; position: absolute; overflow: hidden;"><img src="img/superbox/superbox-full-16.jpg" style="border: none; visibility: visible; margin: 0px; padding: 0px; position: absolute; top: -65px; left: -130px; width: 600px; height: 400px;"><div class="jcrop-hline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-hline bottom" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline right" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-vline" style="position: absolute; opacity: 0.4;"></div><div class="jcrop-tracker" style="cursor: move; position: absolute; z-index: 360;"></div></div><div style="width: 100%; height: 100%; z-index: 320; display: block;"><div class="ord-n jcrop-dragbar" style="cursor: n-resize; position: absolute; z-index: 370;"></div><div class="ord-s jcrop-dragbar" style="cursor: s-resize; position: absolute; z-index: 371;"></div><div class="ord-e jcrop-dragbar" style="cursor: e-resize; position: absolute; z-index: 372;"></div><div class="ord-w jcrop-dragbar" style="cursor: w-resize; position: absolute; z-index: 373;"></div><div class="ord-n jcrop-handle" style="cursor: n-resize; position: absolute; z-index: 374; opacity: 0.5;"></div><div class="ord-s jcrop-handle" style="cursor: s-resize; position: absolute; z-index: 375; opacity: 0.5;"></div><div class="ord-e jcrop-handle" style="cursor: e-resize; position: absolute; z-index: 376; opacity: 0.5;"></div><div class="ord-w jcrop-handle" style="cursor: w-resize; position: absolute; z-index: 377; opacity: 0.5;"></div><div class="ord-nw jcrop-handle" style="cursor: nw-resize; position: absolute; z-index: 378; opacity: 0.5;"></div><div class="ord-ne jcrop-handle" style="cursor: ne-resize; position: absolute; z-index: 379; opacity: 0.5;"></div><div class="ord-se jcrop-handle" style="cursor: se-resize; position: absolute; z-index: 380; opacity: 0.5;"></div><div class="ord-sw jcrop-handle" style="cursor: sw-resize; position: absolute; z-index: 381; opacity: 0.5;"></div></div></div><div class="jcrop-tracker" style="width: 604px; height: 404px; position: absolute; top: -2px; left: -2px; z-index: 290; cursor: crosshair;"></div><input type="radio" class="jcrop-keymgr" style="position: fixed; left: -120px; width: 12px;"><img src="img/superbox/superbox-full-16.jpg" alt="[Jcrop Example]" style="display: block; visibility: visible; width: 600px; height: 400px; border: none; margin: 0px; padding: 0px; position: absolute; top: 0px; left: 0px; opacity: 0.5;"></div>

                                        <div class="pull-left pull-left padding-gutter padding-top-0 padding-bottom-0">
                                            <fieldset>
                                                <legend>
                                                    Manipulate classes
                                                </legend>
                                                <div class="btn-group" id="buttonbar">
                                                    <button class="btn btn-default active" data-setclass="jcrop-light" id="radio1">
                                                        jcrop-light
                                                    </button>
                                                    <button class="btn btn-default" data-setclass="jcrop-dark" id="radio2">
                                                        jcrop-dark
                                                    </button>
                                                    <button class="btn btn-default" data-setclass="jcrop-normal" id="radio3">
                                                        normal
                                                    </button>
                                                </div>
                                            </fieldset>
                                        </div>

                                    </div>
                                        <!-- end s6 tab pane -->

                                </div>

                                    <!-- end content -->
                            </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*433.45*/("""{"""),format.raw/*433.46*/(""" """),format.raw/*433.47*/("""trigger: "hover" """),format.raw/*433.64*/("""}"""),format.raw/*433.65*/(""");
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
         * var pagefunction = function() """),format.raw/*458.42*/("""{"""),format.raw/*458.43*/("""
         """),format.raw/*459.10*/("""*   ...
         * """),format.raw/*460.12*/("""}"""),format.raw/*460.13*/("""
         """),format.raw/*461.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*464.42*/("""{"""),format.raw/*464.43*/("""
         """),format.raw/*465.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*466.12*/("""}"""),format.raw/*466.13*/("""
         """),format.raw/*467.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        var pagefunction = function() """),format.raw/*473.39*/("""{"""),format.raw/*473.40*/("""
        """),format.raw/*474.9*/("""//console.log("load and ready");


        // api_handler

        var api_handler = function() """),format.raw/*479.38*/("""{"""),format.raw/*479.39*/("""

        """),format.raw/*481.9*/("""// The variable jcrop_api will hold a reference to the
        // Jcrop API once Jcrop is instantiated.
        var jcrop_api;


        // The function is pretty simple
        var initJcrop = function()"""),format.raw/*487.35*/("""{"""),format.raw/*487.36*/("""
        """),format.raw/*488.9*/("""// Hide any interface elements that require Jcrop
        // (This is for the local user interface portion.)
        $('.requiresjcrop').hide();

        // Invoke Jcrop in typical fashion
        $('#target-5').Jcrop("""),format.raw/*493.30*/("""{"""),format.raw/*493.31*/("""
        """),format.raw/*494.9*/("""onRelease : releaseCheck
        """),format.raw/*495.9*/("""}"""),format.raw/*495.10*/(""", function() """),format.raw/*495.23*/("""{"""),format.raw/*495.24*/("""

        """),format.raw/*497.9*/("""jcrop_api = this;
        jcrop_api.animateTo([100, 100, 400, 300]);

        // Setup and dipslay the interface for "enabled"
        $('#can_click,#can_move,#can_size').attr('checked', 'checked');
        $('#ar_lock,#size_lock,#bg_swap').attr('checked', false);
        $('.requiresjcrop').show();

        """),format.raw/*505.9*/("""}"""),format.raw/*505.10*/(""");

        """),format.raw/*507.9*/("""}"""),format.raw/*507.10*/(""";

        // In this example, since Jcrop may be attached or detached
        // at the whim of the user, I've wrapped the call into a function
        initJcrop();

        // Use the API to find cropping dimensions
        // Then generate a random selection
        // This function is used by setSelect and animateTo buttons
        // Mainly for demonstration purposes
        function getRandom() """),format.raw/*517.30*/("""{"""),format.raw/*517.31*/("""
        """),format.raw/*518.9*/("""var dim = jcrop_api.getBounds();
        return [Math.round(Math.random() * dim[0]), Math.round(Math.random() * dim[1]), Math.round(Math.random() * dim[0]), Math.round(Math.random() * dim[1])];
        """),format.raw/*520.9*/("""}"""),format.raw/*520.10*/(""";

        // This function is bound to the onRelease handler...
        // In certain circumstances (such as if you set minSize
        // and aspectRatio together), you can inadvertently lose
        // the selection. This callback re-enables creating selections
        // in such a case. Although the need to do this is based on a
        // buggy behavior, it's recommended that you in some way trap
        // the onRelease callback if you use allowSelect: false
        function releaseCheck() """),format.raw/*529.33*/("""{"""),format.raw/*529.34*/("""
        """),format.raw/*530.9*/("""jcrop_api.setOptions("""),format.raw/*530.30*/("""{"""),format.raw/*530.31*/("""
        """),format.raw/*531.9*/("""allowSelect : true
        """),format.raw/*532.9*/("""}"""),format.raw/*532.10*/(""");
        $('#can_click').attr('checked', false);
        """),format.raw/*534.9*/("""}"""),format.raw/*534.10*/(""";

        // Attach interface buttons
        // This may appear to be a lot of code but it's simple stuff
        $('#setSelect').click(function(e) """),format.raw/*538.43*/("""{"""),format.raw/*538.44*/("""
        """),format.raw/*539.9*/("""// Sets a random selection
        jcrop_api.setSelect(getRandom());
        """),format.raw/*541.9*/("""}"""),format.raw/*541.10*/(""");
        $('#animateTo').click(function(e) """),format.raw/*542.43*/("""{"""),format.raw/*542.44*/("""
        """),format.raw/*543.9*/("""// Animates to a random selection
        jcrop_api.animateTo(getRandom());
        """),format.raw/*545.9*/("""}"""),format.raw/*545.10*/(""");
        $('#release').click(function(e) """),format.raw/*546.41*/("""{"""),format.raw/*546.42*/("""
        """),format.raw/*547.9*/("""// Release method clears the selection
        jcrop_api.release();
        """),format.raw/*549.9*/("""}"""),format.raw/*549.10*/(""");
        $('#disable').click(function(e) """),format.raw/*550.41*/("""{"""),format.raw/*550.42*/("""
        """),format.raw/*551.9*/("""// Disable Jcrop instance
        jcrop_api.disable();
        // Update the interface to reflect disabled state
        $('#enable').show();
        $('.requiresjcrop').hide();
        """),format.raw/*556.9*/("""}"""),format.raw/*556.10*/(""");
        $('#enable').click(function(e) """),format.raw/*557.40*/("""{"""),format.raw/*557.41*/("""
        """),format.raw/*558.9*/("""// Re-enable Jcrop instance
        jcrop_api.enable();
        // Update the interface to reflect enabled state
        $('#enable').hide();
        $('.requiresjcrop').show();
        """),format.raw/*563.9*/("""}"""),format.raw/*563.10*/(""");
        $('#rehook').click(function(e) """),format.raw/*564.40*/("""{"""),format.raw/*564.41*/("""
        """),format.raw/*565.9*/("""// This button is visible when Jcrop has been destroyed
        // It performs the re-attachment and updates the UI
        $('#rehook,#enable').hide();
        initJcrop();
        $('#unhook,.requiresjcrop').show();
        return false;
        """),format.raw/*571.9*/("""}"""),format.raw/*571.10*/(""");
        $('#unhook').click(function(e) """),format.raw/*572.40*/("""{"""),format.raw/*572.41*/("""
        """),format.raw/*573.9*/("""// Destroy Jcrop widget, restore original state
        jcrop_api.destroy();
        // Update the interface to reflect un-attached state
        $('#unhook,#enable,.requiresjcrop').hide();
        $('#rehook').show();
        return false;
        """),format.raw/*579.9*/("""}"""),format.raw/*579.10*/(""");

        // Hook up the three image-swapping buttons
        $('#img1').click(function(e) """),format.raw/*582.38*/("""{"""),format.raw/*582.39*/("""
        """),format.raw/*583.9*/("""$(this).addClass('active').closest('.btn-group').find('button.active').not(this).removeClass('active');

        jcrop_api.setImage('img/superbox/superbox-full-7.jpg');
        jcrop_api.setOptions("""),format.raw/*586.30*/("""{"""),format.raw/*586.31*/("""
        """),format.raw/*587.9*/("""bgOpacity : .6
        """),format.raw/*588.9*/("""}"""),format.raw/*588.10*/(""");
        return false;
        """),format.raw/*590.9*/("""}"""),format.raw/*590.10*/(""");
        $('#img2').click(function(e) """),format.raw/*591.38*/("""{"""),format.raw/*591.39*/("""
        """),format.raw/*592.9*/("""$(this).addClass('active').closest('.btn-group').find('button.active').not(this).removeClass('active');

        jcrop_api.setImage('img/superbox/superbox-full-24.jpg');
        jcrop_api.setOptions("""),format.raw/*595.30*/("""{"""),format.raw/*595.31*/("""
        """),format.raw/*596.9*/("""bgOpacity : .6
        """),format.raw/*597.9*/("""}"""),format.raw/*597.10*/(""");
        return false;
        """),format.raw/*599.9*/("""}"""),format.raw/*599.10*/(""");
        $('#img3').click(function(e) """),format.raw/*600.38*/("""{"""),format.raw/*600.39*/("""
        """),format.raw/*601.9*/("""$(this).addClass('active').closest('.btn-group').find('button.active').not(this).removeClass('active');

        jcrop_api.setImage('img/superbox/superbox-full-20.jpg', function() """),format.raw/*603.76*/("""{"""),format.raw/*603.77*/("""
        """),format.raw/*604.9*/("""this.setOptions("""),format.raw/*604.25*/("""{"""),format.raw/*604.26*/("""
        """),format.raw/*605.9*/("""bgOpacity : 1,
        outerImage : 'img/superbox/superbox-full-20-bw.jpg'
        """),format.raw/*607.9*/("""}"""),format.raw/*607.10*/(""");
        this.animateTo(getRandom());
        """),format.raw/*609.9*/("""}"""),format.raw/*609.10*/(""");
        return false;
        """),format.raw/*611.9*/("""}"""),format.raw/*611.10*/(""");

        // The checkboxes simply set options based on it's checked value
        // Options are changed by passing a new options object

        // Also, to prevent strange behavior, they are initially checked
        // This matches the default initial state of Jcrop

        $('#can_click').change(function(e) """),format.raw/*619.44*/("""{"""),format.raw/*619.45*/("""
        """),format.raw/*620.9*/("""jcrop_api.setOptions("""),format.raw/*620.30*/("""{"""),format.raw/*620.31*/("""
        """),format.raw/*621.9*/("""allowSelect : !!this.checked
        """),format.raw/*622.9*/("""}"""),format.raw/*622.10*/(""");
        jcrop_api.focus();
        """),format.raw/*624.9*/("""}"""),format.raw/*624.10*/(""");
        $('#can_move').change(function(e) """),format.raw/*625.43*/("""{"""),format.raw/*625.44*/("""
        """),format.raw/*626.9*/("""jcrop_api.setOptions("""),format.raw/*626.30*/("""{"""),format.raw/*626.31*/("""
        """),format.raw/*627.9*/("""allowMove : !!this.checked
        """),format.raw/*628.9*/("""}"""),format.raw/*628.10*/(""");
        jcrop_api.focus();
        """),format.raw/*630.9*/("""}"""),format.raw/*630.10*/(""");
        $('#can_size').change(function(e) """),format.raw/*631.43*/("""{"""),format.raw/*631.44*/("""
        """),format.raw/*632.9*/("""jcrop_api.setOptions("""),format.raw/*632.30*/("""{"""),format.raw/*632.31*/("""
        """),format.raw/*633.9*/("""allowResize : !!this.checked
        """),format.raw/*634.9*/("""}"""),format.raw/*634.10*/(""");
        jcrop_api.focus();
        """),format.raw/*636.9*/("""}"""),format.raw/*636.10*/(""");
        $('#ar_lock').change(function(e) """),format.raw/*637.42*/("""{"""),format.raw/*637.43*/("""
        """),format.raw/*638.9*/("""jcrop_api.setOptions(this.checked ? """),format.raw/*638.45*/("""{"""),format.raw/*638.46*/("""
        """),format.raw/*639.9*/("""aspectRatio : 4 / 3
        """),format.raw/*640.9*/("""}"""),format.raw/*640.10*/(""" """),format.raw/*640.11*/(""": """),format.raw/*640.13*/("""{"""),format.raw/*640.14*/("""
        """),format.raw/*641.9*/("""aspectRatio : 0
        """),format.raw/*642.9*/("""}"""),format.raw/*642.10*/(""");
        jcrop_api.focus();
        """),format.raw/*644.9*/("""}"""),format.raw/*644.10*/(""");
        $('#size_lock').change(function(e) """),format.raw/*645.44*/("""{"""),format.raw/*645.45*/("""
        """),format.raw/*646.9*/("""jcrop_api.setOptions(this.checked ? """),format.raw/*646.45*/("""{"""),format.raw/*646.46*/("""
        """),format.raw/*647.9*/("""minSize : [80, 80],
        maxSize : [350, 350]
        """),format.raw/*649.9*/("""}"""),format.raw/*649.10*/(""" """),format.raw/*649.11*/(""": """),format.raw/*649.13*/("""{"""),format.raw/*649.14*/("""
        """),format.raw/*650.9*/("""minSize : [0, 0],
        maxSize : [0, 0]
        """),format.raw/*652.9*/("""}"""),format.raw/*652.10*/(""");
        jcrop_api.focus();
        """),format.raw/*654.9*/("""}"""),format.raw/*654.10*/(""");

        """),format.raw/*656.9*/("""}"""),format.raw/*656.10*/("""

        """),format.raw/*658.9*/("""// end api_handler

        // default

        var default_handler = function()"""),format.raw/*662.41*/("""{"""),format.raw/*662.42*/("""
        """),format.raw/*663.9*/("""$('#target').Jcrop();
        """),format.raw/*664.9*/("""}"""),format.raw/*664.10*/("""

        """),format.raw/*666.9*/("""// basic handler

        var basic_handler = function() """),format.raw/*668.40*/("""{"""),format.raw/*668.41*/("""

        """),format.raw/*670.9*/("""var jcrop_api;

        $('#target-2').Jcrop("""),format.raw/*672.30*/("""{"""),format.raw/*672.31*/("""
        """),format.raw/*673.9*/("""onChange : showCoords,
        onSelect : showCoords,
        onRelease : clearCoords
        """),format.raw/*676.9*/("""}"""),format.raw/*676.10*/(""", function() """),format.raw/*676.23*/("""{"""),format.raw/*676.24*/("""
        """),format.raw/*677.9*/("""jcrop_api = this;
        """),format.raw/*678.9*/("""}"""),format.raw/*678.10*/(""");

        $('#coords').on('change', 'input', function(e) """),format.raw/*680.56*/("""{"""),format.raw/*680.57*/("""
        """),format.raw/*681.9*/("""var x1 = $('#x1').val(), x2 = $('#x2').val(), y1 = $('#y1').val(), y2 = $('#y2').val();
        jcrop_api.setSelect([x1, y1, x2, y2]);
        """),format.raw/*683.9*/("""}"""),format.raw/*683.10*/(""");

        // Simple event handler, called from onChange and onSelect
        // event handlers, as per the Jcrop invocation above
        function showCoords(c) """),format.raw/*687.32*/("""{"""),format.raw/*687.33*/("""
        """),format.raw/*688.9*/("""$('#x1').val(c.x);
        $('#y1').val(c.y);
        $('#x2').val(c.x2);
        $('#y2').val(c.y2);
        $('#w').val(c.w);
        $('#h').val(c.h);
        """),format.raw/*694.9*/("""}"""),format.raw/*694.10*/(""";

        function clearCoords() """),format.raw/*696.32*/("""{"""),format.raw/*696.33*/("""
        """),format.raw/*697.9*/("""$('#coords input').val('');
        """),format.raw/*698.9*/("""}"""),format.raw/*698.10*/(""";

        """),format.raw/*700.9*/("""}"""),format.raw/*700.10*/(""";

        // end basic_handler

        // aspect ratio

        var aspect_ratio = function() """),format.raw/*706.39*/("""{"""),format.raw/*706.40*/("""

        """),format.raw/*708.9*/("""// Create variables (in this scope) to hold the API and image size
        var jcrop_api, boundx, boundy,

        // Grab some information about the preview pane
        $preview = $('#preview-pane'), $pcnt = $('#preview-pane .preview-container'), $pimg = $('#preview-pane .preview-container img'), xsize = $pcnt.width(), ysize = $pcnt.height();

        console.log('init', [xsize, ysize]);
        $('#target-3').Jcrop("""),format.raw/*715.30*/("""{"""),format.raw/*715.31*/("""
        """),format.raw/*716.9*/("""onChange : updatePreview,
        onSelect : updatePreview,
        aspectRatio : xsize / ysize
        """),format.raw/*719.9*/("""}"""),format.raw/*719.10*/(""", function() """),format.raw/*719.23*/("""{"""),format.raw/*719.24*/("""
        """),format.raw/*720.9*/("""// Use the API to get the real image size
        var bounds = this.getBounds();
        boundx = bounds[0];
        boundy = bounds[1];
        // Store the API in the jcrop_api variable
        jcrop_api = this;

        // Move the preview into the jcrop container for css positioning
        $preview.appendTo(jcrop_api.ui.holder);
        """),format.raw/*729.9*/("""}"""),format.raw/*729.10*/(""");

        function updatePreview(c) """),format.raw/*731.35*/("""{"""),format.raw/*731.36*/("""
        """),format.raw/*732.9*/("""if (parseInt(c.w) > 0) """),format.raw/*732.32*/("""{"""),format.raw/*732.33*/("""
        """),format.raw/*733.9*/("""var rx = xsize / c.w;
        var ry = ysize / c.h;

        $pimg.css("""),format.raw/*736.19*/("""{"""),format.raw/*736.20*/("""
        """),format.raw/*737.9*/("""width : Math.round(rx * boundx) + 'px',
        height : Math.round(ry * boundy) + 'px',
        marginLeft : '-' + Math.round(rx * c.x) + 'px',
        marginTop : '-' + Math.round(ry * c.y) + 'px'
        """),format.raw/*741.9*/("""}"""),format.raw/*741.10*/(""");
        """),format.raw/*742.9*/("""}"""),format.raw/*742.10*/("""
        """),format.raw/*743.9*/("""}"""),format.raw/*743.10*/(""";

        """),format.raw/*745.9*/("""}"""),format.raw/*745.10*/("""
        """),format.raw/*746.9*/("""// end aspect_ratio

        // animation_handler

        var animation_handler = function() """),format.raw/*750.44*/("""{"""),format.raw/*750.45*/("""

        """),format.raw/*752.9*/("""var jcrop_api;

        $('#target-4').Jcrop("""),format.raw/*754.30*/("""{"""),format.raw/*754.31*/("""
        """),format.raw/*755.9*/("""bgFade : true,
        bgOpacity : .2,
        setSelect : [60, 70, 540, 330]
        """),format.raw/*758.9*/("""}"""),format.raw/*758.10*/(""", function() """),format.raw/*758.23*/("""{"""),format.raw/*758.24*/("""
        """),format.raw/*759.9*/("""jcrop_api = this;
        """),format.raw/*760.9*/("""}"""),format.raw/*760.10*/(""");

        $('#fadetog').change(function() """),format.raw/*762.41*/("""{"""),format.raw/*762.42*/("""
        """),format.raw/*763.9*/("""jcrop_api.setOptions("""),format.raw/*763.30*/("""{"""),format.raw/*763.31*/("""
        """),format.raw/*764.9*/("""bgFade : this.checked
        """),format.raw/*765.9*/("""}"""),format.raw/*765.10*/(""");
        """),format.raw/*766.9*/("""}"""),format.raw/*766.10*/(""").attr('checked', 'checked');

        $('#shadetog').change(function() """),format.raw/*768.42*/("""{"""),format.raw/*768.43*/("""
        """),format.raw/*769.9*/("""if (this.checked)
        $('#shadetxt').slideDown();
        else
        $('#shadetxt').slideUp();
        jcrop_api.setOptions("""),format.raw/*773.30*/("""{"""),format.raw/*773.31*/("""
        """),format.raw/*774.9*/("""shade : this.checked
        """),format.raw/*775.9*/("""}"""),format.raw/*775.10*/(""");
        """),format.raw/*776.9*/("""}"""),format.raw/*776.10*/(""").attr('checked', false);

        // Define page sections
        var sections = """),format.raw/*779.24*/("""{"""),format.raw/*779.25*/("""
        """),format.raw/*780.9*/("""bgc_buttons : 'Change bgColor',
        bgo_buttons : 'Change bgOpacity',
        anim_buttons : 'Animate Selection'
        """),format.raw/*783.9*/("""}"""),format.raw/*783.10*/(""";
        // Define animation buttons
        var ac = """),format.raw/*785.18*/("""{"""),format.raw/*785.19*/("""
        """),format.raw/*786.9*/("""anim1 : [217, 122, 382, 284],
        anim2 : [20, 20, 580, 380],
        anim3 : [24, 24, 176, 376],
        anim4 : [347, 165, 550, 355],
        anim5 : [136, 55, 472, 183]
        """),format.raw/*791.9*/("""}"""),format.raw/*791.10*/(""";
        // Define bgOpacity buttons
        var bgo = """),format.raw/*793.19*/("""{"""),format.raw/*793.20*/("""
        """),format.raw/*794.9*/("""Low : .2,
        Mid : .5,
        High : .8,
        Full : 1
        """),format.raw/*798.9*/("""}"""),format.raw/*798.10*/(""";
        // Define bgColor buttons
        var bgc = """),format.raw/*800.19*/("""{"""),format.raw/*800.20*/("""
        """),format.raw/*801.9*/("""R : '#900',
        B : '#4BB6F0',
        Y : '#F0B207',
        G : '#46B81C',
        W : 'white',
        K : 'black'
        """),format.raw/*807.9*/("""}"""),format.raw/*807.10*/(""";
        // Create fieldset targets for buttons
        for (i in sections)insertSection(i, sections[i]);

        function create_btn(c) """),format.raw/*811.32*/("""{"""),format.raw/*811.33*/("""
        """),format.raw/*812.9*/("""var $o = $('<button ></button>').addClass('btn btn-default btn-small');
        if (c)
        $o.append(c);
        return $o;
        """),format.raw/*816.9*/("""}"""),format.raw/*816.10*/("""

        """),format.raw/*818.9*/("""var a_count = 1;
        // Create animation buttons
        for (i in ac) """),format.raw/*820.23*/("""{"""),format.raw/*820.24*/("""
        """),format.raw/*821.9*/("""$('#anim_buttons .btn-group').append(create_btn(a_count++).click(animHandler(ac[i])), ' ');
        """),format.raw/*822.9*/("""}"""),format.raw/*822.10*/("""

        """),format.raw/*824.9*/("""$('#anim_buttons .btn-group').append(create_btn('Bye!').click(function(e) """),format.raw/*824.83*/("""{"""),format.raw/*824.84*/("""
        """),format.raw/*825.9*/("""$(e.target).addClass('active');
        jcrop_api.animateTo([300, 200, 300, 200], function() """),format.raw/*826.62*/("""{"""),format.raw/*826.63*/("""
        """),format.raw/*827.9*/("""this.release();
        $(e.target).closest('.btn-group').find('.active').removeClass('active');
        """),format.raw/*829.9*/("""}"""),format.raw/*829.10*/(""");
        return false;
        """),format.raw/*831.9*/("""}"""),format.raw/*831.10*/("""));

        // Create bgOpacity buttons
        for (i in bgo) """),format.raw/*834.24*/("""{"""),format.raw/*834.25*/("""
        """),format.raw/*835.9*/("""$('#bgo_buttons .btn-group').append(create_btn(i).click(setoptHandler('bgOpacity', bgo[i])), ' ');
        """),format.raw/*836.9*/("""}"""),format.raw/*836.10*/("""
        """),format.raw/*837.9*/("""// Create bgColor buttons
        for (i in bgc) """),format.raw/*838.24*/("""{"""),format.raw/*838.25*/("""
        """),format.raw/*839.9*/("""$('#bgc_buttons .btn-group').append(create_btn(i).css("""),format.raw/*839.63*/("""{"""),format.raw/*839.64*/("""
        """),format.raw/*840.9*/("""background : bgc[i],
        color : ((i == 'K') || (i == 'R')) ? 'white' : 'black'
        """),format.raw/*842.9*/("""}"""),format.raw/*842.10*/(""").click(setoptHandler('bgColor', bgc[i])), ' ');
        """),format.raw/*843.9*/("""}"""),format.raw/*843.10*/("""
        """),format.raw/*844.9*/("""// Function to insert named sections into interface
        function insertSection(k, v) """),format.raw/*845.38*/("""{"""),format.raw/*845.39*/("""
        """),format.raw/*846.9*/("""$('#interface').prepend($('<fieldset></fieldset>').attr('id', k).append($('<legend></legend>').append(v), '<div class="btn-toolbar"><div class="btn-group"></div></div>'));
        """),format.raw/*847.9*/("""}"""),format.raw/*847.10*/(""";
        // Handler for option-setting buttons
        function setoptHandler(k, v) """),format.raw/*849.38*/("""{"""),format.raw/*849.39*/("""
        """),format.raw/*850.9*/("""return function(e) """),format.raw/*850.28*/("""{"""),format.raw/*850.29*/("""
        """),format.raw/*851.9*/("""$(e.target).closest('.btn-group').find('.active').removeClass('active');
        $(e.target).addClass('active');
        var opt = """),format.raw/*853.19*/("""{"""),format.raw/*853.20*/(""" """),format.raw/*853.21*/("""}"""),format.raw/*853.22*/(""";
        opt[k] = v;
        jcrop_api.setOptions(opt);
        return false;
        """),format.raw/*857.9*/("""}"""),format.raw/*857.10*/(""";
        """),format.raw/*858.9*/("""}"""),format.raw/*858.10*/(""";
        // Handler for animation buttons
        function animHandler(v) """),format.raw/*860.33*/("""{"""),format.raw/*860.34*/("""
        """),format.raw/*861.9*/("""return function(e) """),format.raw/*861.28*/("""{"""),format.raw/*861.29*/("""
        """),format.raw/*862.9*/("""$(e.target).addClass('active');
        jcrop_api.animateTo(v, function() """),format.raw/*863.43*/("""{"""),format.raw/*863.44*/("""
        """),format.raw/*864.9*/("""$(e.target).closest('.btn-group').find('.active').removeClass('active');
        """),format.raw/*865.9*/("""}"""),format.raw/*865.10*/(""");
        return false;
        """),format.raw/*867.9*/("""}"""),format.raw/*867.10*/(""";
        """),format.raw/*868.9*/("""}"""),format.raw/*868.10*/(""";

        $('#bgo_buttons .btn:first,#bgc_buttons .btn:last').addClass('active');
        $('#interface').show();

        """),format.raw/*873.9*/("""}"""),format.raw/*873.10*/("""
        """),format.raw/*874.9*/("""// end animation_handler

        // styling_handler

        var styling_handler = function () """),format.raw/*878.43*/("""{"""),format.raw/*878.44*/("""

        """),format.raw/*880.9*/("""var api;

        $('#target-6').Jcrop("""),format.raw/*882.30*/("""{"""),format.raw/*882.31*/("""
        """),format.raw/*883.9*/("""// start off with jcrop-light class
        bgOpacity : 0.5,
        bgColor : 'white',
        addClass : 'jcrop-light'
        """),format.raw/*887.9*/("""}"""),format.raw/*887.10*/(""", function() """),format.raw/*887.23*/("""{"""),format.raw/*887.24*/("""
        """),format.raw/*888.9*/("""api = this;
        api.setSelect([130, 65, 130 + 350, 65 + 285]);
        api.setOptions("""),format.raw/*890.24*/("""{"""),format.raw/*890.25*/("""
        """),format.raw/*891.9*/("""bgFade : true
        """),format.raw/*892.9*/("""}"""),format.raw/*892.10*/(""");
        api.ui.selection.addClass('jcrop-selection');
        """),format.raw/*894.9*/("""}"""),format.raw/*894.10*/(""");

        $('#buttonbar').on('click', 'button', function(e) """),format.raw/*896.59*/("""{"""),format.raw/*896.60*/("""
        """),format.raw/*897.9*/("""var $t = $(this), $g = $t.closest('.btn-group');
        $g.find('button.active').removeClass('active');
        $t.addClass('active');
        $g.find('[data-setclass]').each(function() """),format.raw/*900.52*/("""{"""),format.raw/*900.53*/("""
        """),format.raw/*901.9*/("""var $th = $(this), c = $th.data('setclass'), a = $th.hasClass('active');
        if (a) """),format.raw/*902.16*/("""{"""),format.raw/*902.17*/("""
        """),format.raw/*903.9*/("""api.ui.holder.addClass(c);
        switch(c) """),format.raw/*904.19*/("""{"""),format.raw/*904.20*/("""
"""),format.raw/*905.1*/("""//            case 'jcrop-light':
//                api.setOptions("""),format.raw/*906.34*/("""{"""),format.raw/*906.35*/("""
"""),format.raw/*907.1*/("""//                bgColor : 'white',
//                bgOpacity : 0.5
//                """),format.raw/*909.19*/("""}"""),format.raw/*909.20*/(""");
//                break;
//            case 'jcrop-dark':
//            api.setOptions("""),format.raw/*912.30*/("""{"""),format.raw/*912.31*/("""
"""),format.raw/*913.1*/("""//            bgColor : 'black',
//            bgOpacity : 0.4
//            """),format.raw/*915.15*/("""}"""),format.raw/*915.16*/(""");
//            break;
//
//            case 'jcrop-normal':
//                api.setOptions("""),format.raw/*919.34*/("""{"""),format.raw/*919.35*/("""
"""),format.raw/*920.1*/("""//                bgColor : $.Jcrop.defaults.bgColor,
//                bgOpacity : $.Jcrop.defaults.bgOpacity
//                """),format.raw/*922.19*/("""}"""),format.raw/*922.20*/(""");
//                break;
        """),format.raw/*924.9*/("""}"""),format.raw/*924.10*/("""
        """),format.raw/*925.9*/("""}"""),format.raw/*925.10*/(""" """),format.raw/*925.11*/("""else
        api.ui.holder.removeClass(c);
        """),format.raw/*927.9*/("""}"""),format.raw/*927.10*/(""");
        """),format.raw/*928.9*/("""}"""),format.raw/*928.10*/(""");

        """),format.raw/*930.9*/("""}"""),format.raw/*930.10*/("""

        """),format.raw/*932.9*/("""// end styling_handler

        //run functions

        api_handler();
        default_handler();
        basic_handler();
        aspect_ratio();
        animation_handler();
        styling_handler();

        """),format.raw/*943.9*/("""}"""),format.raw/*943.10*/(""";

        loadScript("js/plugin/jcrop/jquery.Jcrop.min.js", function() """),format.raw/*945.70*/("""{"""),format.raw/*945.71*/("""
        """),format.raw/*946.9*/("""loadScript("js/plugin/jcrop/jquery.color.min.js", pagefunction);
        """),format.raw/*947.9*/("""}"""),format.raw/*947.10*/(""");

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
                  DATE: Thu Aug 28 21:08:47 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/image_editor.scala.html
                  HASH: 3c7351acc70155028182455e24e37200483f0acc
                  MATRIX: 517->1|622->18|650->21|671->34|710->36|741->41|6291->5562|6321->5563|6391->5604|6480->5664|6510->5665|6580->5706|6626->5723|6656->5724|6726->5765|6867->5877|6897->5878|6967->5919|7011->5934|7041->5935|7111->5976|7249->6085|7279->6086|7349->6127|7388->6137|7418->6138|7488->6179|7575->6237|7605->6238|7676->6280|26300->24875|26330->24876|26400->24917|27124->25612|27154->25613|27225->25655|27537->25938|27567->25939|27637->25980|27833->26147|27863->26148|27934->26190|45048->43275|45078->43276|45108->43277|45154->43294|45184->43295|45873->43955|45903->43956|45942->43966|45990->43985|46020->43986|46059->43996|46227->44135|46257->44136|46296->44146|46386->44207|46416->44208|46455->44218|46620->44354|46650->44355|46687->44364|46812->44460|46842->44461|46880->44471|47113->44675|47143->44676|47180->44685|47427->44903|47457->44904|47494->44913|47555->44946|47585->44947|47627->44960|47657->44961|47695->44971|48033->45281|48063->45282|48103->45294|48133->45295|48566->45699|48596->45700|48633->45709|48863->45911|48893->45912|49423->46413|49453->46414|49490->46423|49540->46444|49570->46445|49607->46454|49662->46481|49692->46482|49779->46541|49809->46542|49988->46692|50018->46693|50055->46702|50160->46779|50190->46780|50264->46825|50294->46826|50331->46835|50443->46919|50473->46920|50545->46963|50575->46964|50612->46973|50716->47049|50746->47050|50818->47093|50848->47094|50885->47103|51099->47289|51129->47290|51200->47332|51230->47333|51267->47342|51481->47528|51511->47529|51582->47571|51612->47572|51649->47581|51925->47829|51955->47830|52026->47872|52056->47873|52093->47882|52370->48131|52400->48132|52522->48225|52552->48226|52589->48235|52816->48433|52846->48434|52883->48443|52934->48466|52964->48467|53025->48500|53055->48501|53124->48541|53154->48542|53191->48551|53419->48750|53449->48751|53486->48760|53537->48783|53567->48784|53628->48817|53658->48818|53727->48858|53757->48859|53794->48868|54003->49048|54033->49049|54070->49058|54115->49074|54145->49075|54182->49084|54293->49167|54323->49168|54399->49216|54429->49217|54490->49250|54520->49251|54866->49568|54896->49569|54933->49578|54983->49599|55013->49600|55050->49609|55115->49646|55145->49647|55211->49685|55241->49686|55315->49731|55345->49732|55382->49741|55432->49762|55462->49763|55499->49772|55562->49807|55592->49808|55658->49846|55688->49847|55762->49892|55792->49893|55829->49902|55879->49923|55909->49924|55946->49933|56011->49970|56041->49971|56107->50009|56137->50010|56210->50054|56240->50055|56277->50064|56342->50100|56372->50101|56409->50110|56465->50138|56495->50139|56525->50140|56556->50142|56586->50143|56623->50152|56675->50176|56705->50177|56771->50215|56801->50216|56876->50262|56906->50263|56943->50272|57008->50308|57038->50309|57075->50318|57160->50375|57190->50376|57220->50377|57251->50379|57281->50380|57318->50389|57397->50440|57427->50441|57493->50479|57523->50480|57563->50492|57593->50493|57631->50503|57740->50583|57770->50584|57807->50593|57865->50623|57895->50624|57933->50634|58019->50691|58049->50692|58087->50702|58161->50747|58191->50748|58228->50757|58350->50851|58380->50852|58422->50865|58452->50866|58489->50875|58543->50901|58573->50902|58661->50961|58691->50962|58728->50971|58899->51114|58929->51115|59121->51278|59151->51279|59188->51288|59378->51450|59408->51451|59471->51485|59501->51486|59538->51495|59602->51531|59632->51532|59671->51543|59701->51544|59826->51640|59856->51641|59894->51651|60345->52073|60375->52074|60412->52083|60544->52187|60574->52188|60616->52201|60646->52202|60683->52211|61055->52555|61085->52556|61152->52594|61182->52595|61219->52604|61271->52627|61301->52628|61338->52637|61438->52708|61468->52709|61505->52718|61740->52925|61770->52926|61809->52937|61839->52938|61876->52947|61906->52948|61945->52959|61975->52960|62012->52969|62135->53063|62165->53064|62203->53074|62277->53119|62307->53120|62344->53129|62458->53215|62488->53216|62530->53229|62560->53230|62597->53239|62651->53265|62681->53266|62754->53310|62784->53311|62821->53320|62871->53341|62901->53342|62938->53351|62996->53381|63026->53382|63065->53393|63095->53394|63196->53466|63226->53467|63263->53476|63422->53606|63452->53607|63489->53616|63546->53645|63576->53646|63615->53657|63645->53658|63756->53740|63786->53741|63823->53750|63976->53875|64006->53876|64090->53931|64120->53932|64157->53941|64369->54125|64399->54126|64484->54182|64514->54183|64551->54192|64651->54264|64681->54265|64764->54319|64794->54320|64831->54329|64989->54459|65019->54460|65187->54599|65217->54600|65254->54609|65418->54745|65448->54746|65486->54756|65590->54831|65620->54832|65657->54841|65785->54941|65815->54942|65853->54952|65956->55026|65986->55027|66023->55036|66145->55129|66175->55130|66212->55139|66345->55244|66375->55245|66436->55278|66466->55279|66559->55343|66589->55344|66626->55353|66761->55460|66791->55461|66828->55470|66906->55519|66936->55520|66973->55529|67056->55583|67086->55584|67123->55593|67243->55685|67273->55686|67358->55743|67388->55744|67425->55753|67543->55842|67573->55843|67610->55852|67818->56032|67848->56033|67962->56118|67992->56119|68029->56128|68077->56147|68107->56148|68144->56157|68304->56288|68334->56289|68364->56290|68394->56291|68509->56378|68539->56379|68577->56389|68607->56390|68711->56465|68741->56466|68778->56475|68826->56494|68856->56495|68893->56504|68996->56578|69026->56579|69063->56588|69172->56669|69202->56670|69263->56703|69293->56704|69331->56714|69361->56715|69513->56839|69543->56840|69580->56849|69705->56945|69735->56946|69773->56956|69841->56995|69871->56996|69908->57005|70065->57134|70095->57135|70137->57148|70167->57149|70204->57158|70323->57248|70353->57249|70390->57258|70440->57280|70470->57281|70563->57346|70593->57347|70684->57409|70714->57410|70751->57419|70967->57606|70997->57607|71034->57616|71151->57704|71181->57705|71218->57714|71292->57759|71322->57760|71351->57761|71447->57828|71477->57829|71506->57830|71624->57919|71654->57920|71773->58010|71803->58011|71832->58012|71938->58089|71968->58090|72092->58185|72122->58186|72151->58187|72309->58316|72339->58317|72403->58353|72433->58354|72470->58363|72500->58364|72530->58365|72609->58416|72639->58417|72678->58428|72708->58429|72748->58441|72778->58442|72816->58452|73057->58665|73087->58666|73188->58738|73218->58739|73255->58748|73356->58821|73386->58822
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|134->113|134->113|135->114|136->115|136->115|137->116|137->116|137->116|138->117|140->119|140->119|141->120|141->120|141->120|142->121|144->123|144->123|145->124|145->124|145->124|146->125|147->126|147->126|149->128|308->287|308->287|309->288|319->298|319->298|321->300|324->303|324->303|325->304|328->307|328->307|330->309|454->433|454->433|454->433|454->433|454->433|479->458|479->458|480->459|481->460|481->460|482->461|485->464|485->464|486->465|487->466|487->466|488->467|494->473|494->473|495->474|500->479|500->479|502->481|508->487|508->487|509->488|514->493|514->493|515->494|516->495|516->495|516->495|516->495|518->497|526->505|526->505|528->507|528->507|538->517|538->517|539->518|541->520|541->520|550->529|550->529|551->530|551->530|551->530|552->531|553->532|553->532|555->534|555->534|559->538|559->538|560->539|562->541|562->541|563->542|563->542|564->543|566->545|566->545|567->546|567->546|568->547|570->549|570->549|571->550|571->550|572->551|577->556|577->556|578->557|578->557|579->558|584->563|584->563|585->564|585->564|586->565|592->571|592->571|593->572|593->572|594->573|600->579|600->579|603->582|603->582|604->583|607->586|607->586|608->587|609->588|609->588|611->590|611->590|612->591|612->591|613->592|616->595|616->595|617->596|618->597|618->597|620->599|620->599|621->600|621->600|622->601|624->603|624->603|625->604|625->604|625->604|626->605|628->607|628->607|630->609|630->609|632->611|632->611|640->619|640->619|641->620|641->620|641->620|642->621|643->622|643->622|645->624|645->624|646->625|646->625|647->626|647->626|647->626|648->627|649->628|649->628|651->630|651->630|652->631|652->631|653->632|653->632|653->632|654->633|655->634|655->634|657->636|657->636|658->637|658->637|659->638|659->638|659->638|660->639|661->640|661->640|661->640|661->640|661->640|662->641|663->642|663->642|665->644|665->644|666->645|666->645|667->646|667->646|667->646|668->647|670->649|670->649|670->649|670->649|670->649|671->650|673->652|673->652|675->654|675->654|677->656|677->656|679->658|683->662|683->662|684->663|685->664|685->664|687->666|689->668|689->668|691->670|693->672|693->672|694->673|697->676|697->676|697->676|697->676|698->677|699->678|699->678|701->680|701->680|702->681|704->683|704->683|708->687|708->687|709->688|715->694|715->694|717->696|717->696|718->697|719->698|719->698|721->700|721->700|727->706|727->706|729->708|736->715|736->715|737->716|740->719|740->719|740->719|740->719|741->720|750->729|750->729|752->731|752->731|753->732|753->732|753->732|754->733|757->736|757->736|758->737|762->741|762->741|763->742|763->742|764->743|764->743|766->745|766->745|767->746|771->750|771->750|773->752|775->754|775->754|776->755|779->758|779->758|779->758|779->758|780->759|781->760|781->760|783->762|783->762|784->763|784->763|784->763|785->764|786->765|786->765|787->766|787->766|789->768|789->768|790->769|794->773|794->773|795->774|796->775|796->775|797->776|797->776|800->779|800->779|801->780|804->783|804->783|806->785|806->785|807->786|812->791|812->791|814->793|814->793|815->794|819->798|819->798|821->800|821->800|822->801|828->807|828->807|832->811|832->811|833->812|837->816|837->816|839->818|841->820|841->820|842->821|843->822|843->822|845->824|845->824|845->824|846->825|847->826|847->826|848->827|850->829|850->829|852->831|852->831|855->834|855->834|856->835|857->836|857->836|858->837|859->838|859->838|860->839|860->839|860->839|861->840|863->842|863->842|864->843|864->843|865->844|866->845|866->845|867->846|868->847|868->847|870->849|870->849|871->850|871->850|871->850|872->851|874->853|874->853|874->853|874->853|878->857|878->857|879->858|879->858|881->860|881->860|882->861|882->861|882->861|883->862|884->863|884->863|885->864|886->865|886->865|888->867|888->867|889->868|889->868|894->873|894->873|895->874|899->878|899->878|901->880|903->882|903->882|904->883|908->887|908->887|908->887|908->887|909->888|911->890|911->890|912->891|913->892|913->892|915->894|915->894|917->896|917->896|918->897|921->900|921->900|922->901|923->902|923->902|924->903|925->904|925->904|926->905|927->906|927->906|928->907|930->909|930->909|933->912|933->912|934->913|936->915|936->915|940->919|940->919|941->920|943->922|943->922|945->924|945->924|946->925|946->925|946->925|948->927|948->927|949->928|949->928|951->930|951->930|953->932|964->943|964->943|966->945|966->945|967->946|968->947|968->947
                  -- GENERATED --
              */
          