
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
object general_elements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa fa-desktop fa-fw "></i> UI Elements <span>&gt;
                General Elements </span></h1>
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

                    <div class="alert alert-warning fade in">
                        <button class="close" data-dismiss="alert">
                            ×
                        </button>
                        <i class="fa-fw fa fa-warning"></i>
                        <strong>Warning</strong> Your monthly traffic is reaching limit.
                    </div>

                    <div class="alert alert-success fade in">
                        <button class="close" data-dismiss="alert">
                            ×
                        </button>
                        <i class="fa-fw fa fa-check"></i>
                        <strong>Success</strong> The page has been added.
                    </div>

                    <div class="alert alert-info fade in">
                        <button class="close" data-dismiss="alert">
                            ×
                        </button>
                        <i class="fa-fw fa fa-info"></i>
                        <strong>Info!</strong> You have 198 unread messages.
                    </div>

                    <div class="alert alert-danger fade in">
                        <button class="close" data-dismiss="alert">
                            ×
                        </button>
                        <i class="fa-fw fa fa-times"></i>
                        <strong>Error!</strong> The daily cronjob has failed.
                    </div>

                </article>
                    <!-- WIDGET END -->

            </div>

                <!-- end row -->

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-x" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <span class="widget-icon"> <i class="fa fa-align-justify"></i> </span>
                            <h2>Standard Progress Bars </h2>

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
                                <p class="alert alert-info no-margin">
                                    All progress bars contain a base class of
                                    <code>
                                        .progress
                                    </code>
                                    . Control the size of the progress bar with
                                    <code>
                                        .progress-xs
                                    </code>
                                    ,
                                    <code>
                                        .progress-sm
                                    </code>
                                    ,
                                    <code>
                                        .progress-lg
                                    </code>
                                    or leave as is for the default size.
                                </p>

                                <div class="row">

                                    <div class="col-sm-12">
                                        <h3>Transitional Progress Bars</h3>
                                        <p>
                                            <span class="label bg-color-darken txt-color-white">JS required</span> This nifty animated progress bars run on CSS combined with javascript
                                        </p>
                                        <p>
                                            You will simply need to add in the value
                                            <code>
                                                aria-valuetransitiongoal="25"
                                            </code>
                                            after the <strong>.progress-bar</strong> class
                                        </p>
                                        <div class="row">

                                            <div class="col-sm-6">

                                                <p>
                                                    For right alignment add class
                                                    <code>
                                                        .progress .right
                                                    </code>
                                                </p>
                                                <div class="well no-padding">

                                                    <div class="bar-holder">
                                                        <div class="progress right" rel="tooltip" data-original-title="25%" data-placement="top">
                                                            <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="width: 25%;" aria-valuenow="25">25%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress right">
                                                            <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="width: 50%;" aria-valuenow="50">50%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress right">
                                                            <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="width: 75%;" aria-valuenow="75">75%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress right">
                                                            <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="width: 100%;" aria-valuenow="100">100%</div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>

                                            <div class="col-sm-6">
                                                <p>
                                                    The default is left aligned.
                                                </p>
                                                <div class="well no-padding">

                                                    <div class="bar-holder">
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="width: 25%;" aria-valuenow="25">25%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="width: 50%;" aria-valuenow="50">50%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="width: 75%;" aria-valuenow="75">75%</div>
                                                        </div>
                                                    </div>
                                                    <div class="bar-holder">
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="width: 100%;" aria-valuenow="100">100%</div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>

                                        </div>
                                    </div>

                                </div>

                                <hr class="simple">

                                <div class="row">

                                    <div class="col-sm-12">
                                        <h3><small>Transitional Progress Bars continued...</small></h3>
                                        <div class="row">

                                            <div class="col-sm-6 col-md-6 col-lg-3">
                                                <p>
                                                    Add an overlapping div to progress-bar with the base css of
                                                    <code>
                                                        .progress .vertical
                                                    </code>
                                                </p>

                                                <div class="well no-padding">

                                                    <ul class="vertical-bars">
                                                        <li>
                                                            <div class="progress vertical">
                                                                <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="height: 25%;" aria-valuenow="25">25%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical">
                                                                <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="height: 50%;" aria-valuenow="50">50%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical">
                                                                <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="height: 75%;" aria-valuenow="75">75%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical">
                                                                <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="height: 100%;" aria-valuenow="100">100%</div>
                                                            </div>
                                                        </li>
                                                    </ul>

                                                </div>
                                            </div>

                                            <div class="col-sm-6 col-md-6 col-lg-3">
                                                <p>
                                                    Add an overlapping div to progress-bar with the base css of
                                                    <code>
                                                        .progress .vertical .bottom
                                                    </code>
                                                </p>

                                                <div class="well no-padding">
                                                    <ul class="vertical-bars">
                                                        <li>
                                                            <div class="progress vertical bottom">
                                                                <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="height: 25%;" aria-valuenow="25">25%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom">
                                                                <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="height: 50%;" aria-valuenow="50">50%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom">
                                                                <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="height: 75%;" aria-valuenow="75">75%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom">
                                                                <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="height: 100%;" aria-valuenow="100">100%</div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>

                                            <div class="col-sm-6 col-md-6 col-lg-3">
                                                <p>
                                                    Add an overlapping div to progress-bar with the base css of
                                                    <code>
                                                        .progress .vertical .wide-bar
                                                    </code>
                                                </p>

                                                <div class="well no-padding">

                                                    <ul class="vertical-bars">
                                                        <li>
                                                            <div class="progress vertical wide-bar">
                                                                <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="height: 25%;" aria-valuenow="25">25%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical wide-bar">
                                                                <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="height: 50%;" aria-valuenow="50">50%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical wide-bar">
                                                                <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="height: 75%;" aria-valuenow="75">75%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                          """),
format.raw("""                                  <div class="progress vertical wide-bar">
                                                                <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="height: 100%;" aria-valuenow="100">100%</div>
                                                            </div>
                                                        </li>
                                                    </ul>

                                                </div>
                                            </div>

                                            <div class="col-sm-6 col-md-6 col-lg-3">

                                                <p>
                                                    Add an overlapping div to progress-bar with the base css of
                                                    <code>
                                                        .bottom .wide-bar
                                                    </code>
                                                </p>

                                                <div class="well no-padding">
                                                    <ul class="vertical-bars">
                                                        <li>
                                                            <div class="progress vertical bottom wide-bar">
                                                                <div class="progress-bar bg-color-teal" aria-valuetransitiongoal="25" style="height: 25%;" aria-valuenow="25">25%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom wide-bar">
                                                                <div class="progress-bar bg-color-blueLight" aria-valuetransitiongoal="50" style="height: 50%;" aria-valuenow="50">50%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom wide-bar">
                                                                <div class="progress-bar bg-color-blue" aria-valuetransitiongoal="75" style="height: 75%;" aria-valuenow="75">75%</div>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <div class="progress vertical bottom wide-bar">
                                                                <div class="progress-bar bg-color-redLight" aria-valuetransitiongoal="100" style="height: 100%;" aria-valuenow="100">100%</div>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>

                                        </div>
                                    </div>

                                </div>

                                <div class="row">
                                    <div class="col-sm-12">
                                        <hr class="simple">
                                        <h3>Default Progress Bars</h3>

                                        <p>
                                            Micro progress bar <code>
                                            .progress-micro</code>
                                            with
                                            <code>
                                                .progress-bar-primary
                                            </code>

                                        </p>
                                        <div class="progress progress-micro">
                                            <div class="progress-bar progress-bar-primary" role="progressbar" style="width: 44%;"></div>
                                        </div>

                                        <p>
                                            Extra small progress bar <code>
                                            .progress-xs</code>
                                            with
                                            <code>
                                                .bg-color-blue
                                            </code>
                                            <span class="txt-color-blue pull-right"><i class="fa fa-lg fa-check"></i></span>
                                        </p>
                                        <div class="progress progress-xs">
                                            <div class="progress-bar bg-color-blue" role="progressbar" style="width: 60%;"></div>
                                        </div>

                                        <p>
                                            Small progress bar <code>
                                            .progress-sm</code>
                                            with
                                            <code>
                                                .bg-color-greenLight
                                            </code>
                                            <span class="txt-color-green pull-right"><i class="fa fa-save"></i></span>
                                        </p>
                                        <div class="progress progress-sm">
                                            <div class="progress-bar bg-color-greenLight" role="progressbar" style="width: 40%"></div>
                                        </div>

                                        <p>
                                            Default progress bar with
                                            <code>
                                                .bg-color-redLight
                                            </code>
                                            <span class="txt-color-red pull-right"><i class="fa fa-lg fa-times"></i></span>
                                        </p>
                                        <div class="progress">
                                            <div class="progress-bar bg-color-redLight" role="progressbar" style="width: 60%"></div>
                                        </div>

                                        <p>
                                            Large progress bars <code>
                                            .progress-lg</code>
                                            with
                                            <code>
                                                .bg-color-blueLight
                                            </code>
                                            <span class="txt-color-blueLight pull-right"><i class="fa fa-2x fa-check"></i></span>
                                        </p>
                                        <div class="progress progress-lg">
                                            <div class="progress-bar bg-color-blueLight" role="progressbar" style="width: 80%"></div>
                                        </div>
                                        <hr class="simple">

                                        <h3>Stripped Progress Bars</h3>
                                        <p>
                                            Sriped Progress bars made with CSS3 gradients, by adding the
                                            <code>
                                                .progress-striped
                                            </code> class to the base class

                                        </p>
                                        <p>
                                            <span class="label label-info">Info!</span> Please be aware that this will not work in archaic browsers such as IE9 <span class="txt-color-purple pull-right"><i class="fa fa-warning"></i> 80% Complete</span>
                                        </p>
                                        <div class="progress">

                                            <div class="progress progress-striped">
                                                <div class="progress-bar bg-color-purple" role="progressbar" style="width: 77%"></div>
                                            </div>

                                        </div>

                                        <p>
                                            Activate and animate a progress bar by adding the class
                                            <code>
                                                .progress-striped .active
                                            </code>
                                        </p>
                                        <p>
                                            Dark progress bar with class
                                            <code>
                                                .bg-color-darken
                                            </code>
                                            <span class="txt-color-orange pull-right"><i class="fa fa-lg fa-times"></i></span>
                                        </p>
                                        <div class="progress progress-sm progress-striped active">
                                            <div class="progress-bar bg-color-darken" role="progressbar" style="width: 45%"></div>
                                        </div>
                                        <hr class="simple">
                                        <h3>Stacking Progress Bars</h3>
                                        <p>
                                            Stack one progressbar on top of another by including all in one
                                            <code>
                                                div.progress
                                            </code>

                                            <span class="sparkline inline-block pull-right" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#71843F&quot;, &quot;#C79121&quot;, &quot;#A90329&quot;, &quot;#ccc&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display: inline-block; width: 23px; height: 23px; vertical-align: top;"></canvas></span>

                                        </p>
                                        <div class="progress progress-sm">
                                            <div class="progress-bar bg-color-greenLight" style="width: 35%"></div>
                                            <div class="progress-bar bg-color-yellow" style="width: 20%"></div>
                                            <div class="progress-bar bg-color-redLight" style="width: 10%"></div>
                                        </div>

                                    </div>
                                </div>

                            </div>
                                <!-- end widget body-->

                        </div>
                            <!-- end widget content -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-plus"></i> Customized Tabs </h2>

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well" id="wid-id-3" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <h2>Default Tabs with border </h2>

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

                                <p>
                                    Tabs inside
                                    <code>
                                        .jarviswidget .well
                                    </code>
                                    (Bordered Tabs)
                                </p>
                                <hr class="simple">

                                <ul id="myTab1" class="nav nav-tabs bordered">
                                    <li class="active">
                                        <a href="#s1" data-toggle="tab">Left Tab <span class="badge bg-color-blue txt-color-white">12</span></a>
                                    </li>
                                    <li>
                                        <a href="#s2" data-toggle="tab"><i class="fa fa-fw fa-lg fa-gear"></i> Tab Item 2</a>
                                    </li>
                                    <li class="dropdown">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                                        <ul class="dropdown-menu">
                                            <li>
                                                <a href="#s3" data-toggle="tab">@fat</a>
                                            </li>
                                            <li>
                                                <a href="#s4" data-toggle="tab">@mdo</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="pull-right">
                                        <a href="javascript:void(0);">
                                            <div class="sparkline txt-color-pinkDark text-align-right" data-sparkline-height="18px" data-sparkline-width="90px" data-sparkline-barwidth="7"><canvas width="52" height="18" style="display: inline-block; width: 52px; height: 18px; vertical-align: top;"></canvas></div> </a>
                                    </li>
                                </ul>

                                <div id="myTabContent1" class="tab-content padding-10">
                                    <div class="tab-pane fade in active" id="s1">
                                        <p>
                                            I have six locks on my door all in a row. When I go out, I lock every other one. I figure no matter how long somebody stands there picking the locks, they are always locking three.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="s2">
                                        <p>
                                            Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="s3">
                                        <p>
                                            Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="s4">
                                        <p>
                                            Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                        </p>
                                    </div>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-5" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <h2>Tabs left </h2>
                            <div class="widget-toolbar hidden-phone">
                                <div class="smart-form">
                                    <label class="toggle">
                                        <input type="checkbox" id="demo-switch-to-pills" name="checkbox-toggle">
                                        <i data-swchon-text="TRUE" data-swchoff-text="FALSE"></i>Switch Navs / Pills</label>
                                </div>
                            </div>
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

                                <div class="tabs"""),
format.raw("""-left">
                                    <ul class="nav nav-tabs tabs-left" id="demo-pill-nav">
                                        <li class="active">
                                            <a href="#tab-r1" data-toggle="tab"><span class="badge bg-color-blue txt-color-white">12</span> Item 1 </a>
                                        </li>
                                        <li>
                                            <a href="#tab-r2" data-toggle="tab"><span class="badge bg-color-blueDark txt-color-white">3</span> Item 2</a>
                                        </li>
                                        <li>
                                            <a href="#tab-r3" data-toggle="tab"><span class="badge bg-color-greenLight txt-color-white">0</span> Item 3</a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div class="tab-pane active" id="tab-r1">
                                            <p>
                                                Dear Math, please grow up and solve your own problems, I'm tired of solving them for you.
                                            </p>

                                            <p>
                                                They say that love is more important than money, but have you ever tried to pay your bills with a hug?
                                            </p>
                                        </div>
                                        <div class="tab-pane" id="tab-r2">
                                            <p>
                                                Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
                                            </p>
                                        </div>
                                        <div class="tab-pane" id="tab-r3">
                                            <p>
                                                Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                            </p>
                                        </div>
                                    </div>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-7" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <ul class="nav nav-tabs pull-left in">

                                <li class="active">

                                    <a data-toggle="tab" href="#hr1"> <i class="fa fa-lg fa-arrow-circle-o-down"></i> <span class="hidden-mobile hidden-tablet"> Bottom Tabs </span> </a>

                                </li>

                                <li>
                                    <a data-toggle="tab" href="#hr2"> <i class="fa fa-lg fa-arrow-circle-o-up"></i> <span class="hidden-mobile hidden-tablet"> Top Tabs <span class="label bg-color-blue txt-color-white"> label <i class="fa fa-exclamation"></i> </span> </span> </a>
                                </li>

                            </ul>
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

                                <div class="tab-content">
                                    <div class="tab-pane active" id="hr1">

                                        <div class="tabbable tabs-below">
                                            <div class="tab-content padding-10">
                                                <div class="tab-pane active" id="AA">
                                                    <p>
                                                        The broccoli says 'I look like a small tree', the mushroom says 'I look like an umbrella', the walnut says 'I look like a brain', and the banana says 'Can we please change the subject?'
                                                    </p>
                                                </div>
                                                <div class="tab-pane" id="BB">
                                                    <p>
                                                        Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                                    </p>
                                                </div>
                                                <div class="tab-pane" id="CC">
                                                    <p>
                                                        Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                                    </p>
                                                </div>
                                            </div>
                                            <ul class="nav nav-tabs">
                                                <li class="active">
                                                    <a data-toggle="tab" href="#AA">Tab 1</a>
                                                </li>
                                                <li>
                                                    <a data-toggle="tab" href="#BB">Tab 2</a>
                                                </li>
                                                <li>
                                                    <a data-toggle="tab" href="#CC">Tab 3</a>
                                                </li>
                                            </ul>
                                        </div>

                                    </div>
                                    <div class="tab-pane" id="hr2">

                                        <ul class="nav nav-tabs">
                                            <li class="active">
                                                <a href="#iss1" data-toggle="tab">Item 1</a>
                                            </li>
                                            <li>
                                                <a href="#iss2" data-toggle="tab">Item 2</a>
                                            </li>
                                            <li>
                                                <a href="#iss3" data-toggle="tab">Item 3</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content padding-10">
                                            <div class="tab-pane active" id="iss1">
                                                <p>
                                                    Three monkeys escaped from the zoo, one was caught watching TV, the other playing hockey, and the third one was caught reading this quote!
                                                </p>
                                            </div>
                                            <div class="tab-pane fade" id="iss2">
                                                <p>
                                                    Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                                </p>
                                            </div>
                                            <div class="tab-pane fade" id="iss3">
                                                <p>
                                                    Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                                </p>
                                            </div>
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

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well" id="wid-id-4" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                                <p>
                                    Tabs inside well and pulled right
                                    <code>
                                        .tabs-pull-right
                                    </code>
                                    (Bordered Tabs)
                                </p>
                                <hr class="simple">

                                <ul id="myTab3" class="nav nav-tabs tabs-pull-right bordered">
                                    <li class="active">
                                        <a href="#l1" data-toggle="tab">Tab Item 1 <span class="badge bg-color-pinkDark txt-color-white">99</span></a>
                                    </li>
                                    <li class="pull-right">
                                        <a href="#l2" data-toggle="tab">Tab Item 2</a>
                                    </li>
                                    <li class="dropdown pull-left">
                                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-lg fa-gear"></i> <b class="caret"></b></a>
                                        <ul class="dropdown-menu">
                                            <li>
                                                <a href="#l3" data-toggle="tab">@fat</a>
                                            </li>
                                            <li>
                                                <a href="#l4" data-toggle="tab">@mdo</a>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>

                                <div id="myTabContent3" class="tab-content padding-10">
                                    <div class="tab-pane fade in active" id="l1">
                                        <p>
                                            My therapist told me the way to achieve true inner peace is to finish what I start. So far I’ve finished two bags of M&amp;Ms and a chocolate cake. I feel better already.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="l2">
                                        <p>
                                            Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="l3">
                                        <p>
                                            Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="l4">
                                        <p>
                                            Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                        </p>
                                    </div>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-6" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <h2>Tabs right </h2>

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

                                <div class="tabs-right">
                                    <ul class="nav nav-tabs">
                                        <li class="active">
                                            <a href="#tab1" data-toggle="tab">Item 1 <span class="badge bg-color-blue txt-color-white">12</span></a>
                                        </li>
                                        <li>
                                            <a href="#tab2" data-toggle="tab">Item 2 <span class="badge bg-color-blueDark txt-color-white">3</span></a>
                                        </li>
                                        <li>
                                            <a href="#tab3" data-toggle="tab">Item 3 <span class="badge bg-color-greenLight txt-color-white">3</span></a>
                                        </li>
                                    </ul>
                                    <div class="tab-content">
                                        <div class="tab-pane active" id="tab1">
                                            <p>
                                                TEAM WORK: Having somebody else you can blame it on.
                                                <br>
                                                HARDWARE: The part of a computer you can kick when there are software problems.
                                                <br>
                                                IMPATIENT: Somebody who is waiting in a hurry.
                                                <br>
                                            </p>
                                        </div>
                                        <div class="tab-pane" id="tab2">
                                            <p>
                                                Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud"""),
format.raw(""" organic, assumenda labore aesthetic magna delectus mollit. Keytar helvetica VHS salvia yr, vero magna velit sapiente labore stumptown. Vegan fanny pack odio cillum wes anderson 8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente accusamus tattooed echo park.
                                            </p>
                                        </div>
                                        <div class="tab-pane" id="tab3">
                                            <p>
                                                Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh mi whatever gluten-free, carles pitchfork biodiesel fixie etsy retro mlkshk vice blog. Scenester cred you probably haven't heard of them, vinyl craft beer blog stumptown. Pitchfork sustainable tofu synth chambray yr.
                                            </p>
                                        </div>
                                    </div>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-8" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <h2>Header Tabs Right</h2>
                            <ul class="nav nav-tabs pull-right in">

                                <li class="active">

                                    <a data-toggle="tab" href="#hb1"> <i class="fa fa-lg fa-arrow-circle-o-down"></i> <span class="hidden-mobile hidden-tablet"> Bottom Tabs right </span> </a>

                                </li>

                                <li>
                                    <a data-toggle="tab" href="#hb2"> <i class="fa fa-lg fa-arrow-circle-o-up"></i> <span class="hidden-mobile hidden-tablet"> Top Tabs right <span class="label bg-color-blue txt-color-white"> label <i class="fa fa-exclamation"></i> </span> </span> </a>
                                </li>

                            </ul>
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

                                <div class="tab-content">
                                    <div class="tab-pane active" id="hb1">

                                        <div class="tabbable tabs-below">
                                            <div class="tab-content padding-10">
                                                <div class="tab-pane active" id="A1">
                                                    <p>
                                                        When I stare at the sky, I see you. When I stare out into the ocean, I see you. When I'm looking at the moon, I see you. Geez! Would you move aside, you're constantly getting in my way!
                                                    </p>
                                                </div>
                                                <div class="tab-pane" id="B1">
                                                    <p>
                                                        Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                                    </p>
                                                </div>
                                                <div class="tab-pane" id="C1">
                                                    <p>
                                                        Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                                    </p>
                                                </div>
                                            </div>
                                            <ul class="nav nav-tabs">
                                                <li class="active pull-right">
                                                    <a data-toggle="tab" href="#A1">Tab 1</a>
                                                </li>
                                                <li class="pull-right">
                                                    <a data-toggle="tab" href="#B1">Tab 2</a>
                                                </li>
                                                <li class="pull-right">
                                                    <a data-toggle="tab" href="#C1">Tab 3</a>
                                                </li>
                                            </ul>
                                        </div>

                                    </div>
                                    <div class="tab-pane" id="hb2">

                                        <ul id="internal-tab-1" class="nav nav-tabs tabs-pull-right">
                                            <li class="active">
                                                <a href="#is1" data-toggle="tab">Item 1</a>
                                            </li>
                                            <li>
                                                <a href="#is2" data-toggle="tab">Item 2</a>
                                            </li>
                                            <li>
                                                <a href="#is3" data-toggle="tab">Item 3</a>
                                            </li>
                                        </ul>
                                        <div class="tab-content padding-10">
                                            <div class="tab-pane active" id="is1">
                                                <p>
                                                    I love everyone! I love to be around some people, I love to stay away from others, and some I'd just love to punch right in the face!

                                                </p>
                                            </div>
                                            <div class="tab-pane fade" id="is2">
                                                <p>
                                                    Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee.
                                                </p>
                                            </div>
                                            <div class="tab-pane fade" id="is3">
                                                <p>
                                                    Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table.
                                                </p>
                                            </div>
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

                <!-- start row -->
            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-th-list"></i> Accordions </h2>

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well transparent" id="wid-id-9" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <h2>Accordions </h2>

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

                                <div class="panel-group smart-accordion-default" id="accordion">
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"> <i class="fa fa-lg fa-angle-down pull-right"></i> <i class="fa fa-lg fa-angle-up pull-right"></i> Collapsible Group Item #1 </a></h4>
                                        </div>
                                        <div id="collapseOne" class="panel-collapse collapse in">
                                            <div class="panel-body no-padding">
                                                <table class="table table-bordered table-condensed">
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
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" class="collapsed"> <i class="fa fa-lg fa-angle-down pull-right"></i> <i class="fa fa-lg fa-angle-up pull-right"></i> Collapsible Group Item #2 </a></h4>
                                        </div>
                                        <div id="collapseTwo" class="panel-collapse collapse">
                                            <div class="panel-body">
                                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseThree" class="collapsed"> <i class="fa fa-lg fa-angle-down pull-right"></i> <i class="fa fa-lg fa-angle-up pull-right"></i> Collapsible Group Item #3 </a></h4>
                                        </div>
                                        <div id="collapseThree" class="panel-collapse collapse">
                                            <div class="panel-body">
                                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                                            </div>
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

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-10" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-deletebutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
                            <span class="widget-icon"> <i class="fa fa-list-alt"></i> </span>
                            <h2>Inside a widget </h2>

                            <div class="widget-toolbar hidden-phone">
                                <div class="smart-form">
                                    <label class="checkbox">
                                        <input type="checkbox" name="checkbox">
                                        <i></i>Add Padding</label>
                                </div>
                            </div>

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

                                <div class="panel-group smart-accordion-default" id="accordion-2">
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="colla"""),
format.raw("""pse" data-parent="#accordion-2" href="#collapseOne-1"> <i class="fa fa-fw fa-plus-circle txt-color-green"></i> <i class="fa fa-fw fa-minus-circle txt-color-red"></i> Collapsible Group Item #1 </a></h4>
                                        </div>
                                        <div id="collapseOne-1" class="panel-collapse collapse in">
                                            <div class="panel-body">
                                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion-2" href="#collapseTwo-1" class="collapsed"> <i class="fa fa-fw fa-plus-circle txt-color-green"></i> <i class="fa fa-fw fa-minus-circle txt-color-red"></i> Collapsible Group Item #2 </a></h4>
                                        </div>
                                        <div id="collapseTwo-1" class="panel-collapse collapse">
                                            <div class="panel-body">
                                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion-2" href="#collapseThree-1" class="collapsed"> <i class="fa fa-fw fa-plus-circle txt-color-green"></i> <i class="fa fa-fw fa-minus-circle txt-color-red"></i> Collapsible Group Item #3 </a></h4>
                                        </div>
                                        <div id="collapseThree-1" class="panel-collapse collapse">
                                            <div class="panel-body">
                                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et.
                                            </div>
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

                <!-- start row -->

            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-reorder"></i> Default Nav Bars </h2>

                <article class="col-sm-12">

                    <div class="navbar navbar-default">

                            <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">Brand</a>
                        </div>

                            <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li class="active">
                                    <a href="#">Link</a>
                                </li>
                                <li>
                                    <a href="#">Link</a>
                                </li>
                                <li class="dropdown dropdown-large">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Large Dropdown <b class="caret"></b></a>

                                    <ul class="dropdown-menu dropdown-menu-large row">
                                        <li class="col-sm-3">
                                            <ul>
                                                <li class="dropdown-header">
                                                    Glyphicons
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Available glyphs</a>
                                                </li>
                                                <li class="disabled">
                                                    <a href="javascript:void(0);">How to use</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Examples</a>
                                                </li>
                                                <li class="divider"></li>
                                                <li class="dropdown-header">
                                                    Dropdowns
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Example</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Aligninment options</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Headers</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Disabled menu items</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="col-sm-3">
                                            <ul>
                                                <li class="dropdown-header">
                                                    Button groups
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Basic example</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Button toolbar</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Sizing</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Nesting</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Vertical variation</a>
                                                </li>
                                                <li class="divider"></li>
                                                <li class="dropdown-header">
                                                    Button dropdowns
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Single button dropdowns</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="col-sm-3">
                                            <ul>
                                                <li class="dropdown-header">
                                                    Input groups
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Basic example</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Sizing</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Checkboxes and radio addons</a>
                                                </li>
                                                <li class="divider"></li>
                                                <li class="dropdown-header">
                                                    Navs
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Tabs</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Pills</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Justified</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="col-sm-3">
                                            <ul>
                                                <li class="dropdown-header">
                                                    Navbar
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Default navbar</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Buttons</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Text</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Non-nav links</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Component alignment</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Fixed to top</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Fixed to bottom</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Static top</a>
                                                </li>
                                                <li>
                                                    <a href="javascript:void(0);">Inverted navbar</a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>

                                </li>
                            </ul>
                            <form class="navbar-form navbar-left" role="search">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Search">
                                </div>
                                <button type="submit" class="btn btn-default">
                                    Submit
                                </button>
                            </form>
                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="#">Link</a>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li>
                                            <a href="#">Action</a>
                                        </li>
                                        <li>
                                            <a href="#">Another action</a>
                                        </li>
                                        <li>
                                            <a href="#">Something else here</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li>
                                            <a href="#">Separated link</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div><!-- /.navbar-collapse -->

                    </div>

                    <div class="navbar navbar-inverse">

                            <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">Brand</a>
                        </div>

                            <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
                            <ul class="nav navbar-nav">
                                <li class="active">
                                    <a href="javascript:void(0);">Link</a>
                                </li>

                                <li>
                                    <a href="javascript:void(0);">Link</a>
                                </li>
                            </ul>

                            <form class="navbar-form navbar-right" role="search">
                                <div class="form-group">
                                    <input class="form-control" placeholder="Search" type="text">
                                </div>
                                <button class="btn btn-primary" type="submit">
                                    Submit
                                </button>
                            </form>
                        </div><!-- /.navbar-collapse -->

                    </div>

                </article>

            </div>

                <!-- end row -->

                <!-- start row -->

            <div class="row">
                <br>
                <br>
                <h2 class="row-seperator-header"><i class="fa fa-tag"></i> Labels and Badges </h2>

                <div class="col-sm-12">

                        <!-- well -->
                    <div class="well">
                            <!-- row -->
                        <div class="row">
                                <!-- col -->
                            <div class="col-sm-12">
                                <p class="alert alert-info">
                                    <i class="fa fa-info"></i> Did you know you can add more than just the basic colors to customize your badge? <strong>Learn more about color options modifiers on the <a href="#ajax/typography.html">Typography page</a>! </strong>
                                </p>
                                    <!-- row -->
                                <div class="row">

                                    <div class="col-md-6">
                                        <p>
                                            Add any of the below mentioned modifier classes to change the appearance of a label.
                                        </p>

                                        <table class="table table-bordered">
                                            <thead>
                                                <tr>
                                                    <th width="50%">Classes</th>
                                                    <th width="50%">Labels</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .label-default
                                                        </code></td>
                                                    <td><span class="label label-default">Default</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                 """),
format.raw("""                                       <code>
                                                            .label-primary
                                                        </code></td>
                                                    <td><span class="label label-primary">Primary</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .label-success
                                                        </code></td>
                                                    <td><span class="label label-success">Success</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .label-info
                                                        </code></td>
                                                    <td><span class="label label-info">Info</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .label-warning
                                                        </code></td>
                                                    <td><span class="label label-warning">Warning</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .label-danger
                                                        </code></td>
                                                    <td><span class="label label-danger">Danger</span></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>

                                    <div class="col-md-6">
                                        <p>
                                            Add any of the below mentioned modifier classes to change the appearance of a badge.
                                        </p>
                                        <table class="table table-bordered">
                                            <thead>
                                                <tr>
                                                    <th width="50%">Classes</th>
                                                    <th width="50%">Badges</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>No modifiers</td>
                                                    <td><span class="badge">42</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .bg-color-darken
                                                        </code></td>
                                                    <td><span class="badge bg-color-darken">1</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .bg-color-greenLight
                                                        </code></td>
                                                    <td><span class="badge bg-color-greenLight">22</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .bg-color-blueLight
                                                        </code></td>
                                                    <td><span class="badge bg-color-blueLight">30</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .bg-color-orange
                                                        </code></td>
                                                    <td><span class="badge bg-color-orange">412</span></td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <code>
                                                            .bg-color-red
                                                        </code></td>
                                                    <td><span class="badge bg-color-red">999</span></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>

                                </div>
                                    <!-- end row -->
                            </div>
                                <!-- end col -->
                        </div>
                            <!-- end row -->
                    </div>
                        <!-- end well -->

                </div>

            </div>

                <!-- end row -->

                <!-- start row -->

            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-comments"></i> Block Messages </h2>

                <div class="col-sm-12">

                    <div class="alert alert-block alert-warning">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Warning!</h4>
                        Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
                    </div>

                    <div class="alert alert-success alert-block">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Success!</h4>
                        Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
                    </div>

                    <div class="alert alert-info alert-block">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Info!</h4>
                        Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
                    </div>

                    <div class="alert alert-danger alert-block">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Error!</h4>
                        Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
                        <p class="text-align-left">
                            <br>
                            <a href="javascript:void(0);" class="btn btn-sm btn-default"><strong>Action Button</strong></a>
                        </p>
                    </div>

                </div>

            </div>
                <!-- end row-->

                <!-- start row -->
            <div class="row">

                <h2 class="row-seperator-header"><i class="glyphicon glyphicon-picture"></i> Carousel Slide / Fade </h2>

                <div class="col-sm-12">

                    <div class="row">

                        <div class="col-sm-12 col-md-12 col-lg-6">

                                <!-- well -->
                            <div class="well">
                                <h3>Carousel <code>
                                    .slide</code></h3>
                                <p>
                                    Default sliding carousel with base class of <code>
                                    .carousel .slide</code>
                                </p>
                                <div id="myCarousel-2" class="carousel slide">
                                    <ol class="carousel-indicators">
                                        <li data-target="#myCarousel-2" data-slide-to="0" class=""></li>
                                        <li data-target="#myCarousel-2" data-slide-to="1" class=""></li>
                                        <li data-target="#myCarousel-2" data-slide-to="2" class="active"></li>
                                    </ol>
                                    <div class="carousel-inner">
                                            <!-- Slide 1 -->
                                        <div class="item">
                                            <img src="img/demo/m3.jpg" alt="">
                                            <div class="carousel-caption caption-right">
                                                <h4>Title 1</h4>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <br>
                                                <a href="javascript:void(0);" class="btn btn-info btn-sm">Read more</a>
                                            </div>
                                        </div>
                                            <!-- Slide 2 -->
                                        <div class="item">
                                            <img src="img/demo/m1.jpg" alt="">
                                            <div class="carousel-caption caption-left">
                                                <h4>Title 2</h4>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <br>
                                                <a href="javascript:void(0);" class="btn btn-danger btn-sm">Read more</a>
                                            </div>
                                        </div>
                                            <!-- Slide 3 -->
                                        <div class="item active">
                                            <img src="img/demo/m2.jpg" alt="">
                                            <div class="carousel-caption">
                                                <h4>A very long thumbnail title here to fill the space</h4>
                                                <br>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="left carousel-control" href="#myCarousel-2" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a>
                                    <a class="right carousel-control" href="#myCarousel-2" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span> </a>
                                </div>

                            </div>
                                <!-- end well-->

                        </div>

                        <div class="col-sm-12 col-md-12 col-lg-6">

                                <!-- well -->
                            <div class="well">
                                <h3>Carousel <code>
                                    .fade</code></h3>
                                <p>
                                    To make the carasoul fade, you can use the class <code>
                                    .carousel .fade</code>
                                </p>
                                <div id="myCarousel" class="carousel fade">
                                    <ol class="carousel-indicators">
                                        <li data-target="#myCarousel" data-slide-to="0" class=""></li>
                                        <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                                        <li data-target="#myCarousel" data-slide-to="2" class="active"></li>
                                    </ol>
                                    <div class="carousel-inner">
                                            <!-- Slide 1 -->
                                        <div class="item">
                                            <img src="img/demo/m1.jpg" alt="">
                                            <div class="carousel-caption caption-right">
                                                <h4>Title 1</h4>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <br>
                                                <a href="javascript:void(0);" class="btn btn-info btn-sm">Read more</a>
                                            </div>
                                        </div>
                                            <!-- Slide 2 -->
                                        <div class="item">
                                            <img src="img/demo/m2.jpg" alt="">
                                            <div class="carousel-caption caption-left">
                                                <h4>Title 2</h4>
                                                <p>
                                                    Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                                </p>
                                                <br>
                                                <a href="javascript:void(0);" class="btn btn-danger btn-sm">Read more</a>
                                            </div>
                                        </div>
                                            <!-- Slide 3 -->
                                        <div class="item active">
                                            <img src="img/demo/m3.jpg" alt="">
                                            <div class="carousel-caption">
                                                <h4>A very long thumbnail title here to fill the space</h4>
                                                <br>
                                            </div>
                                        </div>
                                    </div>
                                    <a class="left carousel-control" href="#myCarousel" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a>
                                    <a class="right carousel-control" href="#myCarousel" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span> </a>
                                </div>

                            </div>
                                <!-- end well -->

                        </div>

                    </div>

                </div>

            </div>
                <!-- end row -->

                <!-- start row -->
            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-warning"></i> Alerts and Notifications </h2>

                <div class="col-sm-12">
                    <div class="row">

                        <div class="col-sm-12 col-md-12 col-lg-6">
                                <!-- well -->
                            <div class="well">
                                <h3>Bootstrap Modal</h3>
                                <h5>Static Example</h5>
                                <p>
                                    A rendered modal with header, body, and set of actions in the footer.
                                </p>

                                <div class="modal-dialog demo-modal">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                                ×
                                            </button>
                                            <h4 class="modal-title">Modal title</h4>
                                        </div>
                                        <div class="modal-body">
                                            <p>
                                                One fine body…
                                            </p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                                Close
                                            </button>
                                            <button type="button" class="btn btn-primary">
                                                Save changes
                                            </button>
                                        </div>
                                    </div><!-- /.modal-content -->
                                </div><!-- /.modal-dialog -->

                                <h5>Live Demo</h5>
                                <p>
                                    Toggle a modal via JavaScript by clicking the button below. It will slide down and fade in from the top of the page.
                                </p>

                                <a href="ajax/modal-content/model-content-1.html" data-toggle="modal" data-target="#remoteModal" class="btn btn-primary btn-lg">
                                    Launch remote modal
                                </a>

                                    <!-- Dynamic Modal -->
                                <div class="modal fade" id="remoteModal" tabindex="-1" role="dialog" aria-labelledby="remoteModalLabel" aria-hidden="""),
format.raw(""""true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                                <!-- content will be filled here from "ajax/modal-content/model-content-1.html" -->
                                        </div>
                                    </div>
                                </div>
                                    <!-- /.modal -->

                                <h3 class="hidden-mobile">Options</h3>

                                <div class="table-responsive">

                                    <table class="table table-bordered table-striped hidden-mobile">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>type</th>
                                                <th>default</th>
                                                <th>description</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>backdrop</td>
                                                <td>boolean or the string
                                                    <code>
                                                        'static'
                                                    </code></td>
                                                <td>true</td>
                                                <td>Includes a modal-backdrop element. Alternatively, specify
                                                    <code>
                                                        static
                                                    </code> for a backdrop which doesn't close the modal on click.</td>
                                            </tr>
                                            <tr>
                                                <td>keyboard</td>
                                                <td>boolean</td>
                                                <td>true</td>
                                                <td>Closes the modal when escape key is pressed</td>
                                            </tr>
                                            <tr>
                                                <td>show</td>
                                                <td>boolean</td>
                                                <td>true</td>
                                                <td>Shows the modal when initialized.</td>
                                            </tr>
                                            <tr>
                                                <td>remote</td>
                                                <td>path</td>
                                                <td>false</td>
                                                <td>
                                                    <p>
                                                        If a remote URL is provided, content will be loaded via jQuery's
                                                        <code>
                                                            load
                                                        </code>
                                                        method and injected into the root of the modal element. If you're using the data-api, you may alternatively use the
                                                        <code>
                                                            href
                                                        </code>
                                                        attribute to specify the remote source. An example of this is shown below:
                                                    </p></td>

                                            </tr>
                                            <tr>
                                                <td colspan="4">
                                                    <p class="alert alert-success">The traditional bootstrap modal will work a bit different in the SmartAdmin AJAX version:</p>
                                                    <code style="white-space: normal;">&lt;a data-target="#modal" data-toggle="modal" href="remote.html"&gt; ... &lt;/a&gt;</code>

                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>

                                </div>
                            </div>
                                <!-- end well-->

                        </div>

                        <div class="col-sm-12 col-md-12 col-lg-6">

                                <!-- well -->
                            <div class="well">
                                <h3>Smart Notifications <small>with sound</small></h3>
                                <h5>Big box <small>(Static Example)</small></h5>
                                <p>
                                    Clutter free dynamic alert box, easy to configure and setup!
                                </p>
                                <p>
                                    <span class="label label-info"><i class="fa fa-music"></i> Sound Enabled</span>
                                </p>

                                <div class="text-center">
                                    <img src="img/demo/demo-smartbig-alert.png" alt="demo" class="img-responsive">
                                </div>

                                <h5>Live Demo</h5>
                                <p class="note">
                                    <span class="label bg-color-darken txt-color-white">INFO!</span> Messages are tabbale and does not overpopulate the user screen. Sounds can also be disabled if not needed
                                </p>

                                <ul class="demo-btns">
                                    <li>
                                        <a href="#" id="eg1" class="btn btn-primary"> <i class="fa fa-warning"></i> Example 1 </a>
                                    </li>
                                    <li>
                                        <a href="#" id="eg2" class="btn btn-primary"> <i class="fa fa-bell"></i> Example 2 </a>
                                    </li>
                                    <li>
                                        <a href="#" id="eg3" class="btn btn-primary"> <i class="fa fa-shield"></i> Example 3 </a>
                                    </li>
                                    <li>
                                        <a href="#" id="eg4" class="btn btn-primary"> <i class="fa fa-check"></i> Example 4 </a>
                                    </li>
                                </ul>

                                <h5>Small box alert</h5>

                                <ul class="demo-btns">
                                    <li>
                                        <button type="button" id="eg5" class="btn btn-default">
                                            With button
                                        </button>
                                    </li>
                                    <li>
                                        <button type="button" id="eg6" class="btn btn-default">
                                            With Icon
                                        </button>
                                    </li>
                                </ul>
                                <p class="note">
                                    Easily customize the alerts to any colors of your choice, and add any icons from the theme library with animation!
                                </p>

                                <h5><small>Extra Small Box </small></h5>
                                <ul class="demo-btns">
                                    <li>
                                        <button type="button" id="eg7" class="btn btn-default">
                                            <i class="fa fa-thumbs-up"></i> Extra Small Alert
                                        </button>
                                    </li>
                                </ul>
                                <p class="note">
                                    Go even tinier with smaller attention messages!
                                </p>

                            </div>
                                <!-- end well -->

                                <!-- well -->
                            <div class="well">

                                <h3>Smart Alert <small>with sound</small></h3>

                                <h5 class="text-success">With Callback and Buttons <small>(Dynamic Example)</small></h5>
                                <ul class="demo-btns">
                                    <li>
                                        <a href="#" id="smart-mod-eg1" class="btn btn-success"> Callback ()</a>
                                    </li>
                                    <li>
                                        <a href="#" id="smart-mod-eg3" class="btn btn-success"> Many Buttons </a>
                                    </li>
                                </ul>
                                <h5 class="text-primary">With Input and Select</h5>
                                <ul class="demo-btns">
                                    <li>
                                        <a href="#" id="smart-mod-eg2" class="btn btn-primary"> With Input </a>
                                    </li>
                                    <li>
                                        <a href="#" id="smart-mod-eg4" class="btn btn-primary"> With Select </a>
                                    </li>
                                </ul>
                                <h5>Log me in example</h5>
                                <ul class="demo-btns">
                                    <li>
                                        <a href="#" id="smart-mod-eg5" class="btn btn-danger"> Login me in </a>
                                    </li>
                                </ul>

                            </div>
                                <!-- end well -->

                        </div>

                    </div>
                </div>

            </div>
                <!-- end row -->

                <!-- start row -->
            <div class="row">

                <h2 class="row-seperator-header"><i class="fa fa-question"></i> Tooltips and Popovers </h2>

                <div class="col-sm-12">

                    <div class="row">

                        <div class="col-sm-12 col-md-12 col-lg-6">

                            <div class="well">
                                <h3>Tooltips</h3>
                                <p>
                                    Tip your users with a small tooltip. Nifty helpful information can be disaplayed using this very simple and yet effictive component. Display pure <strong>HTML Content</strong>, <strong> Images</strong> and <strong>Icons</strong>
                                </p>
                                <br>

                                <ul class="demo-btns text-center">
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="tooltip" data-placement="top" data-original-title="<h1><b>One</b> <em>Really</em> big tip!</h1>" data-html="true">Big Tip</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="tooltip" data-placement="top" data-original-title="<i class='fa fa-check fa-3x text-success'></i> <i class='fa fa-times fa-3x text-danger'></i>" data-html="true">has Icon</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="tooltip" data-placement="top" data-original-title="<img src='img/avatars/sunny.png' alt='me' class='online'>" data-html="true">also Image</a>
                                    </li>
                                </ul>

                                <ul class="demo-btns text-center">
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="tooltip" data-placement="left" data-original-title="Tooltip Left"><i class="fa fa-arrow-left"></i> Tooltip Left</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="tooltip" data-placement="top" data-original-title="Tooltip Top"><i class="fa fa-arrow-up"></i> Tooltip Top</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="tooltip" data-placement="bottom" data-original-title="Tooltip Bottom"><i class="fa fa-arrow-down"></i> Tooltip Bottom</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="tooltip" data-placement="right" data-original-title="<i class='fa fa-check text-success'></i> Tooltip Right" data-html="true"><i class="fa fa-arrow-right"></i> Tooltip Right</a>
                                    </li>
                                </ul>

                            </div>

                        </div>

                        <div class="col-sm-12 col-md-12 col-lg-6">

                            <div class="well">
                                <h3>Popovers</h3>
                                <p>
                                    Popovers are a cool way to express compressed information to the user, neatly and quickly. You can generate all kinds of content within the popover component. Including <strong>Forms</strong>, <strong>Tabs</strong>, <strong>Images</strong> and even <strong>Google map</strong>!
                                </p>
                                <br>
                                <ul class="demo-btns text-center">
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="popover-hover" data-placement="top" data-original-title="Popover activated on hover" data-content="Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum."><strong>On</strong> <i>Hover</i></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="popover" data-placement="top" data-original-title="<h4>Tabs inside popover</h4>" data-content="<ul id='popup-tab' class='nav nav-tabs bordered'><li class='active'><a href='#pop-1' data-toggle='tab'>Active Tab </a></li><li><a href='#pop-2' data-toggle='tab'>Tab 2</a></li></ul><div id='popup-tab-content' class='tab-content padding-10'><div class='tab-pane fade in active' id='pop-1'><p>I have six locks on my door all in a row. When I go out, I lock every other one. I figure no matter how long somebody stands there picking the locks, they are always locking three.</p></div><div class='tab-pane fade' id='pop-2'><p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. wes anderson artisan four loko farm-to-table craft beer twee.</p></div></div>" data-html="true"><strong>Active</strong> <i>Content</i></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default btn-lg" rel="popover" data-placement="top" data-original-title="<i class='fa fa-fw fa-pencil'></i> Form inside popover" data-content="<form action='' style='min-width:170px'><div class='checkbox'><label><input type='checkbox' class='checkbox style-0' checked='checked'><span>Read</span></label></div><div class='checkbox'><label><input type='checkbox' class='checkbox style-0'><span>Write</span></label></div><div class='checkbox'><label><input type='checkbox' class='checkbox style-0'><span>Execute</span></label></div><div class='form-actions'><div class='row'><div class='col-md-12'><button class='btn btn-primary btn-sm' type='submit'>SAVE</button></div></div></div></form>" data-html="true"><strong>File</strong> <i>Access</i></a>
                                    </li>
                                </ul>

                                <ul class="demo-btns text-center">
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="popover" data-placement="left" data-original-title="Popover Left" data-content="Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum."><i class="fa fa-arrow-left"></i> <strong>Popover</strong> <i>Left</i></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="popover" data-placement="top" data-original-title="Popover Up" data-content="Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum."><i class="fa fa-arrow-up"></i> <strong>Popover</strong> <i>Up</i></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="popover" data-placement="bottom" data-original-title="Popover Down" data-content="Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum."><i class="fa fa-arrow-down"></i> <strong>Popover</strong> <i>Down</i></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" class="btn btn-default" rel="popover" data-placement="right" data-original-title="Popover Right" data-content="Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum."><i class="fa fa-arrow-right"></i> <strong>Popover</strong> <i>Right</i></a>
                                    </li>
                                </ul>

                            </div>

                        </div>
                    </div>

                </div>

            </div>
                <!-- end row -->

                <!-- start row -->
            <div class="row">
                <h2 class="row-seperator-header"><i class="fa fa-square-o"></i> Containers, Media and Pagination</h2>
                <div class="col-sm-12 col-md-12 col-lg-6">

                    <div class="well">

                        <h3>Jumbotron <small>Gets your user attention!</small></h3>

                        <div class="jumbotron">
                            <h1>Hello, world!</h1>
                            <p>
                                This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.
                            </p>
                            <p>
                               """),
format.raw(""" <a class="btn btn-primary btn-lg" role="button">Learn more</a>
                            </p>
                        </div>

                        <h3>Wells <small>Notice the well sizes</small></h3>

                        <div class="well well-lg">
                            Large well
                            <br>
                            <code>
                                .well .well-lg</code>
                        </div>

                        <div class="well ">
                            Default well
                            <br>
                            <code>
                                .well</code>
                        </div>

                        <div class="well well-sm well-light">
                            Small well with light background
                            <br>
                            <code>
                                .well .well-sm .well-light</code>
                        </div>

                        <div class="row">

                            <div class="col-sm-4">

                                <div class="well well-sm bg-color-darken txt-color-white text-center">
                                    <h5>Well with background</h5>
                                    <code>
                                        .bg-color-darken</code>
                                </div>

                            </div>

                            <div class="col-sm-4">

                                <div class="well well-sm bg-color-teal txt-color-white text-center">
                                    <h5>Well with background</h5>
                                    <code>
                                        .bg-color-teal</code>
                                </div>

                            </div>

                            <div class="col-sm-4">

                                <div class="well well-sm bg-color-pinkDark txt-color-white text-center">
                                    <h5>Well with background</h5>
                                    <code>
                                        .bg-color-pinkDark</code>
                                </div>

                            </div>

                        </div>
                        <p>
                            Learn more about other colors that you can use for .well by going to <a href="#ajax/typography.html"> typography page</a>
                        </p>

                    </div>

                </div>

                <div class="col-sm-12 col-md-12 col-lg-6">

                    <div class="well">

                        <h3>Media</h3>

                        <ul class="media-list">
                            <li class="media">
                                <a class="pull-left" href="javascript:void(0);"> <img class="media-object" alt="64x64" src="img/demo/64x64.png"> </a>
                                <div class="media-body">
                                    <h4 class="media-heading">Media heading</h4>
                                    <p>
                                        Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                    </p>
                                        <!-- Nested media object -->
                                    <div class="media">
                                        <a class="pull-left" href="javascript:void(0);"> <img class="media-object" alt="64x64" src="img/demo/64x64.png"> </a>
                                        <div class="media-body">
                                            <h4 class="media-heading">Nested media heading</h4>
                                            Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                            <!-- Nested media object -->
                                            <div class="media">
                                                <a class="pull-left" href="javascript:void(0);"> <img class="media-object" alt="64x64" src="img/demo/64x64.png"> </a>
                                                <div class="media-body">
                                                    <h4 class="media-heading">Nested media heading</h4>
                                                    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                        <!-- Nested media object -->
                                    <div class="media">
                                        <a class="pull-left" href="javascript:void(0);"> <img class="media-object" alt="64x64" src="img/demo/64x64.png"> </a>
                                        <div class="media-body">
                                            <h4 class="media-heading">Nested media heading</h4>
                                            Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="media">
                                <a class="pull-left" href="javascript:void(0);"> <img class="media-object" alt="64x64" src="img/demo/64x64.png"> </a>
                                <div class="media-body">
                                    <h4 class="media-heading">Media heading</h4>
                                    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                </div>
                            </li>
                        </ul>

                    </div>

                    <div class="well well-light">
                        <h3>Pagination <small>two different styles</small></h3>
                        <div class="text-center">
                            <ul class="pagination pagination-lg">
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-chevron-left"></i></a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-chevron-right"></i></a>
                                </li>
                            </ul>
                                &nbsp; &nbsp;
                            <ul class="pagination pagination-alt pagination-lg">
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-left"></i></a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-right"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="text-center">
                            <ul class="pagination">
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-arrow-left"></i></a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-arrow-right"></i></a>
                                </li>
                            </ul>
                                &nbsp; &nbsp;
                            <ul class="pagination pagination-alt">
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-left"></i></a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-right"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="text-center">
                            <ul class="pagination pagination-sm">
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-left"></i></a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);"><i class="fa fa-angle-right"></i></a>
                                </li>
                            </ul>
                                &nbsp; &nbsp;
                            <ul class="pagination pagination-sm pagination-alt">
                                <li>
                                    <a href="javascript:void(0);">«</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">1</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">2</a>
                                </li>
                                <li class="active">
                                    <a href="javascript:void(0);">3</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">4</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">5</a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);">»</a>
                                </li>
                            </ul>
                        </div>
                        <div style="width:200px; margin:0 auto">
                            <ul class="pager">
                                <li class="previous disabled">
                                    <a href="javascript:void(0);">← Older</a>
                                </li>
                                <li class="next">
                                    <a href="javascript:void(0);">Newer →</a>
                                </li>
                            </ul>
                        </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*2563.45*/("""{"""),format.raw/*2563.46*/(""" """),format.raw/*2563.47*/("""trigger: "hover" """),format.raw/*2563.64*/("""}"""),format.raw/*2563.65*/(""");
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

        function noAnswer() """),format.raw/*2586.29*/("""{"""),format.raw/*2586.30*/("""

        """),format.raw/*2588.9*/("""$.smallBox("""),format.raw/*2588.20*/("""{"""),format.raw/*2588.21*/("""
        """),format.raw/*2589.9*/("""title : "Sure, as you wish sir...",
        content : "",
        color : "#A65858",
        iconSmall : "fa fa-times",
        timeout : 5000
        """),format.raw/*2594.9*/("""}"""),format.raw/*2594.10*/(""");

        """),format.raw/*2596.9*/("""}"""),format.raw/*2596.10*/(""";

        function closedthis() """),format.raw/*2598.31*/("""{"""),format.raw/*2598.32*/("""
        """),format.raw/*2599.9*/("""$.smallBox("""),format.raw/*2599.20*/("""{"""),format.raw/*2599.21*/("""
        """),format.raw/*2600.9*/("""title : "Great! You just closed that last alert!",
        content : "This message will be gone in 5 seconds!",
        color : "#739E73",
        iconSmall : "fa fa-cloud",
        timeout : 5000
        """),format.raw/*2605.9*/("""}"""),format.raw/*2605.10*/(""");
        """),format.raw/*2606.9*/("""}"""),format.raw/*2606.10*/(""";

        // pagefunction

        var pagefunction = function() """),format.raw/*2610.39*/("""{"""),format.raw/*2610.40*/("""

        """),format.raw/*2612.9*/("""/*
         * Autostart Carousel
         */
        $('.carousel.slide').carousel("""),format.raw/*2615.39*/("""{"""),format.raw/*2615.40*/("""
        """),format.raw/*2616.9*/("""interval : 3000,
        cycle : true
        """),format.raw/*2618.9*/("""}"""),format.raw/*2618.10*/(""");
        $('.carousel.fade').carousel("""),format.raw/*2619.38*/("""{"""),format.raw/*2619.39*/("""
        """),format.raw/*2620.9*/("""interval : 3000,
        cycle : true
        """),format.raw/*2622.9*/("""}"""),format.raw/*2622.10*/(""");

        // Fill all progress bars with animation
        $('.progress-bar').progressbar("""),format.raw/*2625.40*/("""{"""),format.raw/*2625.41*/("""
        """),format.raw/*2626.9*/("""display_text : 'fill'
        """),format.raw/*2627.9*/("""}"""),format.raw/*2627.10*/(""");

        /*
         * Smart Notifications
         */
        $('#eg1').click(function(e) """),format.raw/*2632.37*/("""{"""),format.raw/*2632.38*/("""

        """),format.raw/*2634.9*/("""$.bigBox("""),format.raw/*2634.18*/("""{"""),format.raw/*2634.19*/("""
        """),format.raw/*2635.9*/("""title : "Big Information box",
        content : "This message will dissapear in 6 seconds!",
        color : "#C46A69",
        //timeout: 6000,
        icon : "fa fa-warning shake animated",
        number : "1",
        timeout : 6000
        """),format.raw/*2642.9*/("""}"""),format.raw/*2642.10*/(""");

        e.preventDefault();

        """),format.raw/*2646.9*/("""}"""),format.raw/*2646.10*/(""")

        $('#eg2').click(function(e) """),format.raw/*2648.37*/("""{"""),format.raw/*2648.38*/("""

        """),format.raw/*2650.9*/("""$.bigBox("""),format.raw/*2650.18*/("""{"""),format.raw/*2650.19*/("""
        """),format.raw/*2651.9*/("""title : "Big Information box",
        content : "Lorem ipsum dolor sit amet, test consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
        color : "#3276B1",
        //timeout: 8000,
        icon : "fa fa-bell swing animated",
        number : "2"
        """),format.raw/*2657.9*/("""}"""),format.raw/*2657.10*/(""");

        e.preventDefault();
        """),format.raw/*2660.9*/("""}"""),format.raw/*2660.10*/(""")

        $('#eg3').click(function(e) """),format.raw/*2662.37*/("""{"""),format.raw/*2662.38*/("""

        """),format.raw/*2664.9*/("""$.bigBox("""),format.raw/*2664.18*/("""{"""),format.raw/*2664.19*/("""
        """),format.raw/*2665.9*/("""title : "Shield is up and running!",
        content : "Lorem ipsum dolor sit amet, test consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
        color : "#C79121",
        //timeout: 8000,
        icon : "fa fa-shield fadeInLeft animated",
        number : "3"
        """),format.raw/*2671.9*/("""}"""),format.raw/*2671.10*/(""");

        e.preventDefault();

        """),format.raw/*2675.9*/("""}"""),format.raw/*2675.10*/(""")

        $('#eg4').click(function(e) """),format.raw/*2677.37*/("""{"""),format.raw/*2677.38*/("""

        """),format.raw/*2679.9*/("""$.bigBox("""),format.raw/*2679.18*/("""{"""),format.raw/*2679.19*/("""
        """),format.raw/*2680.9*/("""title : "Success Message Example",
        content : "Lorem ipsum dolor sit amet, test consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
        color : "#739E73",
        //timeout: 8000,
        icon : "fa fa-check",
        number : "4"
        """),format.raw/*2686.9*/("""}"""),format.raw/*2686.10*/(""", function() """),format.raw/*2686.23*/("""{"""),format.raw/*2686.24*/("""
        """),format.raw/*2687.9*/("""closedthis();
        """),format.raw/*2688.9*/("""}"""),format.raw/*2688.10*/(""");

        e.preventDefault();

        """),format.raw/*2692.9*/("""}"""),format.raw/*2692.10*/(""")

        $('#eg5').click(function() """),format.raw/*2694.36*/("""{"""),format.raw/*2694.37*/("""

        """),format.raw/*2696.9*/("""$.smallBox("""),format.raw/*2696.20*/("""{"""),format.raw/*2696.21*/("""
        """),format.raw/*2697.9*/("""title : "Ding Dong!",
        content : "Someone's at the door...shall one get it sir? <p class='text-align-right'><a href='javascript:void(0);' class='btn btn-primary btn-sm'>Yes</a> <a href='javascript:void(0);'  onclick='noAnswer();' class='btn btn-danger btn-sm'>No</a></p>",
        color : "#296191",
        //timeout: 8000,
        icon : "fa fa-bell swing animated"
        """),format.raw/*2702.9*/("""}"""),format.raw/*2702.10*/(""");

        """),format.raw/*2704.9*/("""}"""),format.raw/*2704.10*/(""");

        $('#eg6').click(function() """),format.raw/*2706.36*/("""{"""),format.raw/*2706.37*/("""

        """),format.raw/*2708.9*/("""$.smallBox("""),format.raw/*2708.20*/("""{"""),format.raw/*2708.21*/("""
        """),format.raw/*2709.9*/("""title : "Big Information box",
        content : "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam",
        color : "#5384AF",
        //timeout: 8000,
        icon : "fa fa-bell"
        """),format.raw/*2714.9*/("""}"""),format.raw/*2714.10*/(""");

        """),format.raw/*2716.9*/("""}"""),format.raw/*2716.10*/(""")

        $('#eg7').click(function() """),format.raw/*2718.36*/("""{"""),format.raw/*2718.37*/("""

        """),format.raw/*2720.9*/("""$.smallBox("""),format.raw/*2720.20*/("""{"""),format.raw/*2720.21*/("""
        """),format.raw/*2721.9*/("""title : "James Simmons liked your comment",
        content : "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
        color : "#296191",
        iconSmall : "fa fa-thumbs-up bounce animated",
        timeout : 4000
        """),format.raw/*2726.9*/("""}"""),format.raw/*2726.10*/(""");

        """),format.raw/*2728.9*/("""}"""),format.raw/*2728.10*/(""")

        /*
        * SmartAlerts
        */

        // With Callback

        $("#smart-mod-eg1").click(function(e) """),format.raw/*2736.47*/("""{"""),format.raw/*2736.48*/("""
        """),format.raw/*2737.9*/("""$.SmartMessageBox("""),format.raw/*2737.27*/("""{"""),format.raw/*2737.28*/("""
        """),format.raw/*2738.9*/("""title : "Smart Alert!",
        content : "This is a confirmation box. Can be programmed for button callback",
        buttons : '[No][Yes]'
        """),format.raw/*2741.9*/("""}"""),format.raw/*2741.10*/(""", function(ButtonPressed) """),format.raw/*2741.36*/("""{"""),format.raw/*2741.37*/("""
        """),format.raw/*2742.9*/("""if (ButtonPressed === "Yes") """),format.raw/*2742.38*/("""{"""),format.raw/*2742.39*/("""

        """),format.raw/*2744.9*/("""$.smallBox("""),format.raw/*2744.20*/("""{"""),format.raw/*2744.21*/("""
        """),format.raw/*2745.9*/("""title : "Callback function",
        content : "<i class='fa fa-clock-o'></i> <i>You pressed Yes...</i>",
        color : "#659265",
        iconSmall : "fa fa-check fa-2x fadeInRight animated",
        timeout : 4000
        """),format.raw/*2750.9*/("""}"""),format.raw/*2750.10*/(""");
        """),format.raw/*2751.9*/("""}"""),format.raw/*2751.10*/("""
        """),format.raw/*2752.9*/("""if (ButtonPressed === "No") """),format.raw/*2752.37*/("""{"""),format.raw/*2752.38*/("""
        """),format.raw/*2753.9*/("""$.smallBox("""),format.raw/*2753.20*/("""{"""),format.raw/*2753.21*/("""
        """),format.raw/*2754.9*/("""title : "Callback function",
        content : "<i class='fa fa-clock-o'></i> <i>You pressed No...</i>",
        color : "#C46A69",
        iconSmall : "fa fa-times fa-2x fadeInRight animated",
        timeout : 4000
        """),format.raw/*2759.9*/("""}"""),format.raw/*2759.10*/(""");
        """),format.raw/*2760.9*/("""}"""),format.raw/*2760.10*/("""

        """),format.raw/*2762.9*/("""}"""),format.raw/*2762.10*/(""");
        e.preventDefault();
        """),format.raw/*2764.9*/("""}"""),format.raw/*2764.10*/(""")

        // With Input
        $("#smart-mod-eg2").click(function(e) """),format.raw/*2767.47*/("""{"""),format.raw/*2767.48*/("""

        """),format.raw/*2769.9*/("""$.SmartMessageBox("""),format.raw/*2769.27*/("""{"""),format.raw/*2769.28*/("""
        """),format.raw/*2770.9*/("""title : "Smart Alert: Input",
        content : "Please enter your user name",
        buttons : "[Accept]",
        input : "text",
        placeholder : "Enter your user name"
        """),format.raw/*2775.9*/("""}"""),format.raw/*2775.10*/(""", function(ButtonPress, Value) """),format.raw/*2775.41*/("""{"""),format.raw/*2775.42*/("""
        """),format.raw/*2776.9*/("""alert(ButtonPress + " " + Value);
        """),format.raw/*2777.9*/("""}"""),format.raw/*2777.10*/(""");

        e.preventDefault();
        """),format.raw/*2780.9*/("""}"""),format.raw/*2780.10*/(""")

        // With Buttons
        $("#smart-mod-eg3").click(function(e) """),format.raw/*2783.47*/("""{"""),format.raw/*2783.48*/("""

        """),format.raw/*2785.9*/("""$.SmartMessageBox("""),format.raw/*2785.27*/("""{"""),format.raw/*2785.28*/("""
        """),format.raw/*2786.9*/("""title : "Smart Notification: Buttons",
        content : "Lots of buttons to go...",
        buttons : '[Need?][You][Do][Buttons][Many][How]'
        """),format.raw/*2789.9*/("""}"""),format.raw/*2789.10*/(""");

        e.preventDefault();
        """),format.raw/*2792.9*/("""}"""),format.raw/*2792.10*/(""")

        // With Select
        $("#smart-mod-eg4").click(function(e) """),format.raw/*2795.47*/("""{"""),format.raw/*2795.48*/("""

        """),format.raw/*2797.9*/("""$.SmartMessageBox("""),format.raw/*2797.27*/("""{"""),format.raw/*2797.28*/("""
        """),format.raw/*2798.9*/("""title : "Smart Alert: Select",
        content : "You can even create a group of options.",
        buttons : "[Done]",
        input : "select",
        options : "[Costa Rica][United States][Autralia][Spain]"
        """),format.raw/*2803.9*/("""}"""),format.raw/*2803.10*/(""", function(ButtonPress, Value) """),format.raw/*2803.41*/("""{"""),format.raw/*2803.42*/("""
        """),format.raw/*2804.9*/("""alert(ButtonPress + " " + Value);
        """),format.raw/*2805.9*/("""}"""),format.raw/*2805.10*/(""");

        e.preventDefault();
        """),format.raw/*2808.9*/("""}"""),format.raw/*2808.10*/(""");

        // With Login
        $("#smart-mod-eg5").click(function(e) """),format.raw/*2811.47*/("""{"""),format.raw/*2811.48*/("""

        """),format.raw/*2813.9*/("""$.SmartMessageBox("""),format.raw/*2813.27*/("""{"""),format.raw/*2813.28*/("""
        """),format.raw/*2814.9*/("""title : "Login form",
        content : "Please enter your user name",
        buttons : "[Cancel][Accept]",
        input : "text",
        placeholder : "Enter your user name"
        """),format.raw/*2819.9*/("""}"""),format.raw/*2819.10*/(""", function(ButtonPress, Value) """),format.raw/*2819.41*/("""{"""),format.raw/*2819.42*/("""
        """),format.raw/*2820.9*/("""if (ButtonPress == "Cancel") """),format.raw/*2820.38*/("""{"""),format.raw/*2820.39*/("""
        """),format.raw/*2821.9*/("""alert("Why did you cancel that? :(");
        return 0;
        """),format.raw/*2823.9*/("""}"""),format.raw/*2823.10*/("""

        """),format.raw/*2825.9*/("""Value1 = Value.toUpperCase();
        ValueOriginal = Value;
        $.SmartMessageBox("""),format.raw/*2827.27*/("""{"""),format.raw/*2827.28*/("""
        """),format.raw/*2828.9*/("""title : "Hey! <strong>" + Value1 + ",</strong>",
        content : "And now please provide your password:",
        buttons : "[Login]",
        input : "password",
        placeholder : "Password"
        """),format.raw/*2833.9*/("""}"""),format.raw/*2833.10*/(""", function(ButtonPress, Value) """),format.raw/*2833.41*/("""{"""),format.raw/*2833.42*/("""
        """),format.raw/*2834.9*/("""alert("Username: " + ValueOriginal + " and your password is: " + Value);
        """),format.raw/*2835.9*/("""}"""),format.raw/*2835.10*/(""");
        """),format.raw/*2836.9*/("""}"""),format.raw/*2836.10*/(""");

        e.preventDefault();
        """),format.raw/*2839.9*/("""}"""),format.raw/*2839.10*/(""");

        """),format.raw/*2841.9*/("""}"""),format.raw/*2841.10*/(""";

        // end pagefunction

        // load bootstrap-progress bar script and run pagefunction
        loadScript("js/plugin/bootstrap-progressbar/bootstrap-progressbar.min.js", pagefunction);

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
                  DATE: Thu Aug 28 21:08:45 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/general_elements.scala.html
                  HASH: b60ddbd242df1e88a03b15133e9e13df07d8bce3
                  MATRIX: 521->1|626->18|654->21|675->34|714->36|745->41|156107->155237|156138->155238|156169->155239|156216->155256|156247->155257|156840->155820|156871->155821|156910->155831|156951->155842|156982->155843|157020->155852|157200->156003|157231->156004|157272->156016|157303->156017|157366->156050|157397->156051|157435->156060|157476->156071|157507->156072|157545->156081|157779->156286|157810->156287|157850->156298|157881->156299|157977->156365|158008->156366|158047->156376|158160->156459|158191->156460|158229->156469|158304->156515|158335->156516|158405->156556|158436->156557|158474->156566|158549->156612|158580->156613|158702->156705|158733->156706|158771->156715|158830->156745|158861->156746|158985->156840|159016->156841|159055->156851|159094->156860|159125->156861|159163->156870|159438->157116|159469->157117|159539->157158|159570->157159|159639->157198|159670->157199|159709->157209|159748->157218|159779->157219|159817->157228|160177->157559|160208->157560|160277->157600|160308->157601|160377->157640|160408->157641|160447->157651|160486->157660|160517->157661|160555->157670|160928->158014|160959->158015|161029->158056|161060->158057|161129->158096|161160->158097|161199->158107|161238->158116|161269->158117|161307->158126|161657->158447|161688->158448|161731->158461|161762->158462|161800->158471|161851->158493|161882->158494|161952->158535|161983->158536|162051->158574|162082->158575|162121->158585|162162->158596|162193->158597|162231->158606|162643->158989|162674->158990|162715->159002|162746->159003|162815->159042|162846->159043|162885->159053|162926->159064|162957->159065|162995->159074|163313->159363|163344->159364|163385->159376|163416->159377|163484->159415|163515->159416|163554->159426|163595->159437|163626->159438|163664->159447|163925->159679|163956->159680|163997->159692|164028->159693|164178->159813|164209->159814|164247->159823|164295->159841|164326->159842|164364->159851|164542->160000|164573->160001|164629->160027|164660->160028|164698->160037|164757->160066|164788->160067|164827->160077|164868->160088|164899->160089|164937->160098|165192->160324|165223->160325|165263->160336|165294->160337|165332->160346|165390->160374|165421->160375|165459->160384|165500->160395|165531->160396|165569->160405|165823->160630|165854->160631|165894->160642|165925->160643|165964->160653|165995->160654|166063->160693|166094->160694|166195->160765|166226->160766|166265->160776|166313->160794|166344->160795|166382->160804|166597->160990|166628->160991|166689->161022|166720->161023|166758->161032|166829->161074|166860->161075|166929->161115|166960->161116|167063->161189|167094->161190|167133->161200|167181->161218|167212->161219|167250->161228|167429->161378|167460->161379|167529->161419|167560->161420|167662->161492|167693->161493|167732->161503|167780->161521|167811->161522|167849->161531|168097->161750|168128->161751|168189->161782|168220->161783|168258->161792|168329->161834|168360->161835|168429->161875|168460->161876|168562->161948|168593->161949|168632->161959|168680->161977|168711->161978|168749->161987|168964->162173|168995->162174|169056->162205|169087->162206|169125->162215|169184->162244|169215->162245|169253->162254|169346->162318|169377->162319|169416->162329|169533->162416|169564->162417|169602->162426|169837->162632|169868->162633|169929->162664|169960->162665|169998->162674|170108->162755|170139->162756|170179->162767|170210->162768|170279->162808|170310->162809|170351->162821|170382->162822
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|2591->2563|2591->2563|2591->2563|2591->2563|2591->2563|2614->2586|2614->2586|2616->2588|2616->2588|2616->2588|2617->2589|2622->2594|2622->2594|2624->2596|2624->2596|2626->2598|2626->2598|2627->2599|2627->2599|2627->2599|2628->2600|2633->2605|2633->2605|2634->2606|2634->2606|2638->2610|2638->2610|2640->2612|2643->2615|2643->2615|2644->2616|2646->2618|2646->2618|2647->2619|2647->2619|2648->2620|2650->2622|2650->2622|2653->2625|2653->2625|2654->2626|2655->2627|2655->2627|2660->2632|2660->2632|2662->2634|2662->2634|2662->2634|2663->2635|2670->2642|2670->2642|2674->2646|2674->2646|2676->2648|2676->2648|2678->2650|2678->2650|2678->2650|2679->2651|2685->2657|2685->2657|2688->2660|2688->2660|2690->2662|2690->2662|2692->2664|2692->2664|2692->2664|2693->2665|2699->2671|2699->2671|2703->2675|2703->2675|2705->2677|2705->2677|2707->2679|2707->2679|2707->2679|2708->2680|2714->2686|2714->2686|2714->2686|2714->2686|2715->2687|2716->2688|2716->2688|2720->2692|2720->2692|2722->2694|2722->2694|2724->2696|2724->2696|2724->2696|2725->2697|2730->2702|2730->2702|2732->2704|2732->2704|2734->2706|2734->2706|2736->2708|2736->2708|2736->2708|2737->2709|2742->2714|2742->2714|2744->2716|2744->2716|2746->2718|2746->2718|2748->2720|2748->2720|2748->2720|2749->2721|2754->2726|2754->2726|2756->2728|2756->2728|2764->2736|2764->2736|2765->2737|2765->2737|2765->2737|2766->2738|2769->2741|2769->2741|2769->2741|2769->2741|2770->2742|2770->2742|2770->2742|2772->2744|2772->2744|2772->2744|2773->2745|2778->2750|2778->2750|2779->2751|2779->2751|2780->2752|2780->2752|2780->2752|2781->2753|2781->2753|2781->2753|2782->2754|2787->2759|2787->2759|2788->2760|2788->2760|2790->2762|2790->2762|2792->2764|2792->2764|2795->2767|2795->2767|2797->2769|2797->2769|2797->2769|2798->2770|2803->2775|2803->2775|2803->2775|2803->2775|2804->2776|2805->2777|2805->2777|2808->2780|2808->2780|2811->2783|2811->2783|2813->2785|2813->2785|2813->2785|2814->2786|2817->2789|2817->2789|2820->2792|2820->2792|2823->2795|2823->2795|2825->2797|2825->2797|2825->2797|2826->2798|2831->2803|2831->2803|2831->2803|2831->2803|2832->2804|2833->2805|2833->2805|2836->2808|2836->2808|2839->2811|2839->2811|2841->2813|2841->2813|2841->2813|2842->2814|2847->2819|2847->2819|2847->2819|2847->2819|2848->2820|2848->2820|2848->2820|2849->2821|2851->2823|2851->2823|2853->2825|2855->2827|2855->2827|2856->2828|2861->2833|2861->2833|2861->2833|2861->2833|2862->2834|2863->2835|2863->2835|2864->2836|2864->2836|2867->2839|2867->2839|2869->2841|2869->2841
                  -- GENERATED --
              */
          