
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
object calendar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa fa-calendar fa-fw "></i>
                Calendar
                <span>&gt;
                    Add events
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

            <div class="col-sm-12 col-md-12 col-lg-3">
                    <!-- new widget -->
                <div class="jarviswidget jarviswidget-color-blueDark">
                    <header>
                        <h2> Add Events </h2>
                    </header>

                        <!-- widget div-->
                    <div>

                        <div class="widget-body">
                                <!-- content goes here -->

                            <form id="add-event-form">
                                <fieldset>

                                    <div class="form-group">
                                        <label>Select Event Icon</label>
                                        <div class="btn-group btn-group-sm btn-group-justified" data-toggle="buttons">
                                            <label class="btn btn-default active">
                                                <input type="radio" name="iconselect" id="icon-1" value="fa-info" checked="">
                                                <i class="fa fa-info text-muted"></i> </label>
                                            <label class="btn btn-default">
                                                <input type="radio" name="iconselect" id="icon-2" value="fa-warning">
                                                <i class="fa fa-warning text-muted"></i> </label>
                                            <label class="btn btn-default">
                                                <input type="radio" name="iconselect" id="icon-3" value="fa-check">
                                                <i class="fa fa-check text-muted"></i> </label>
                                            <label class="btn btn-default">
                                                <input type="radio" name="iconselect" id="icon-4" value="fa-user">
                                                <i class="fa fa-user text-muted"></i> </label>
                                            <label class="btn btn-default">
                                                <input type="radio" name="iconselect" id="icon-5" value="fa-lock">
                                                <i class="fa fa-lock text-muted"></i> </label>
                                            <label class="btn btn-default">
                                                <input type="radio" name="iconselect" id="icon-6" value="fa-clock-o">
                                                <i class="fa fa-clock-o text-muted"></i> </label>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Event Title</label>
                                        <input class="form-control" id="title" name="title" maxlength="40" type="text" placeholder="Event Title">
                                    </div>
                                    <div class="form-group">
                                        <label>Event Description</label>
                                        <textarea class="form-control" placeholder="Please be brief" rows="3" maxlength="40" id="description"></textarea>
                                        <p class="note">Maxlength is set to 40 characters</p>
                                    </div>

                                    <div class="form-group">
                                        <label>Select Event Color</label>
                                        <div class="btn-group btn-group-justified btn-select-tick" data-toggle="buttons">
                                            <label class="btn bg-color-darken active">
                                                <input type="radio" name="priority" id="option1" value="bg-color-darken txt-color-white" checked="">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                            <label class="btn bg-color-blue">
                                                <input type="radio" name="priority" id="option2" value="bg-color-blue txt-color-white">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                            <label class="btn bg-color-orange">
                                                <input type="radio" name="priority" id="option3" value="bg-color-orange txt-color-white">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                            <label class="btn bg-color-greenLight">
                                                <input type="radio" name="priority" id="option4" value="bg-color-greenLight txt-color-white">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                            <label class="btn bg-color-blueLight">
                                                <input type="radio" name="priority" id="option5" value="bg-color-blueLight txt-color-white">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                            <label class="btn bg-color-red">
                                                <input type="radio" name="priority" id="option6" value="bg-color-red txt-color-white">
                                                <i class="fa fa-check txt-color-white"></i> </label>
                                        </div>
                                    </div>

                                </fieldset>
                                <div class="form-actions">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <button class="btn btn-default" type="button" id="add-event">
                                                Add Event
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>

                                <!-- end content -->
                        </div>

                    </div>
                        <!-- end widget div -->
                </div>
                    <!-- end widget -->

                <div class="well well-sm" id="event-container">
                    <form>
                        <legend>
                            Draggable Events
                        </legend>
                        <ul id="external-events" class="list-unstyled">
                            <li class="ui-draggable" style="position: relative;">
                                <span class="bg-color-darken txt-color-white" data-description="Currently busy" data-icon="fa-time">Office Meeting</span>
                            </li>
                            <li class="ui-draggable" style="position: relative;">
                                <span class="bg-color-blue txt-color-white" data-description="No Description" data-icon="fa-pie">Lunch Break</span>
                            </li>
                            <li class="ui-draggable" style="position: relative;">
                                <span class="bg-color-red txt-color-white" data-description="Urgent Tasks" data-icon="fa-alert">URGENT</span>
                            </li>
                        </ul>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" id="drop-remove" class="checkbox style-0" checked="checked">
                                <span>remove after drop</span> </label>

                        </div>
                    </form>

                </div>
            </div>
            <div class="col-sm-12 col-md-12 col-lg-9">

                    <!-- new widget -->
                <div class="jarviswidget jarviswidget-color-blueDark">

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
                        <span class="widget-icon"> <i class="fa fa-calendar"></i> </span>
                        <h2> My Events </h2>
                        <div class="widget-toolbar">
                                <!-- add: non-hidden - to disable auto hide -->
                            <div class="btn-group">
                                <button class="btn dropdown-toggle btn-xs btn-default" data-toggle="dropdown">
                                    Showing <i class="fa fa-caret-down"></i>
                                </button>
                                <ul class="dropdown-menu js-status-update pull-right">
                                    <li>
                                        <a href="javascript:void(0);" id="mt">Month</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" id="ag">Agenda</a>
                                    </li>
                                    <li>
                                        <a href="javascript:void(0);" id="td">Today</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </header>

                        <!-- widget div-->
                    <div>

                        <div class="widget-body no-padding">
                                <!-- content goes here -->
                            <div class="widget-body-toolbar">

                                <div id="calendar-buttons">

                                    <div class="btn-group">
                                        <a href="javascript:void(0)" class="btn btn-default btn-xs" id="btn-prev"><i class="fa fa-chevron-left"></i></a>
                                        <a href="javascript:void(0)" class="btn btn-default btn-xs" id="btn-next"><i class="fa fa-chevron-right"></i></a>
                                    </div>
                                </div>
                            </div>
                            <div id="calendar" class="fc"><table class="fc-header" style="width:100%"><tbody><tr><td class="fc-header-left"><span class="fc-header-title"><h2>August 2014</h2></span></td><td class="fc-header-center" style="display: none;"><span class="fc-button fc-button-month fc-state-default fc-corner-left fc-state-active"><span class="fc-button-inner"><span class="fc-button-content">month</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-button fc-button-agendaWeek fc-state-default"><span class="fc-button-inner"><span class="fc-button-content">week</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-button fc-button-agendaDay fc-state-default fc-corner-right"><span class="fc-button-inner"><span class="fc-button-content">day</span><span class="fc-button-effect"><span></span></span></span></span></td><td class="fc-header-right" style="display: none;"><span class="fc-button fc-button-prev fc-state-default fc-corner-left"><span class="fc-button-inner"><span class="fc-button-content"><i class="fa fa-chevron-left"></i></span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-button fc-button-today fc-state-default fc-state-disabled"><span class="fc-button-inner"><span class="fc-button-content">today</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-button fc-button-next fc-state-default fc-corner-right"><span class="fc-button-inner"><span class="fc-button-content"><i class="fa fa-chevron-right"></i></span><span class="fc-button-effect"><span></span></span></span></span></td></tr></tbody></table><div class="fc-content" style="position: relative; min-height: 1px;"><div class="fc-view fc-view-month fc-grid" style="position: relative;" unselectable="on"><table class="fc-border-separate" style="width:100%" cellspacing="0"><thead><tr class="fc-first fc-last"><th class="fc-sun fc-widget-header fc-first" style="width: 110px;">Sun</th><th class="fc-mon fc-widget-header" style="width: 110px;">Mon</th><th class="fc-tue fc-widget-header" style="width: 110px;">Tue</th><th class="fc-wed fc-widget-header" style="width: 110px;">Wed</th><th class="fc-thu fc-widget-header" style="width: 110px;">Thu</th><th class="fc-fri fc-widget-header" style="width: 110px;">Fri</th><th class="fc-sat fc-widget-header fc-last">Sat</th></tr></thead><tbody><tr class="fc-week0 fc-first"><td class="fc-sun fc-widget-content fc-day0 fc-first fc-other-month"><div style="min-height: 90px;"><div class="fc-day-number">27</div><div class="fc-day-content"><div style="position: relative; height: 40px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day1 fc-other-month"><div><div class="fc-day-number">28</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day2 fc-other-month"><div><div class="fc-day-number">29</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day3 fc-other-month"><div><div class="fc-day-number">30</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day4 fc-other-month"><div><div class="fc-day-number">31</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day5"><div><div class="fc-day-number">1</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day6 fc-last"><div><div class="fc-day-number">2</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr><tr class="fc-week1"><td class="fc-sun fc-widget-content fc-day7 fc-first"><div style="min-height: 89px;"><div class="fc-day-number">3</div><div class="fc-day-content"><div style="position: relative; height: 0px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day8"><div><div class="fc-day-number">4</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day9"><div><div class="fc-day-number">5</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day10"><div><div class="fc-day-number">6</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day11"><div><div class="fc-day-number">7</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day12"><div><div class="fc-day-number">8</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day13 fc-last"><div><div class="fc-day-number">9</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr><tr class="fc-week2"><td class="fc-sun fc-widget-content fc-day14 fc-first"><div style="min-height: 89px;"><div class="fc-day-number">10</div><div class="fc-day-content"><div style="position: relative; height: 0px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day15"><div><div class="fc-day-number">11</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day16"><div><div class="fc-day-number">12</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day17"><div><div class="fc-day-number">13</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day18"><div><div class="fc-day-number">14</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day19"><div><div class="fc-day-number">15</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day20 fc-last"><div><div class="fc-day-number">16</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr><tr class="fc-week3"><td class="fc-sun fc-widget-content fc-day21 fc-first"><div style="min-height: 89px;"><div class="fc-day-number">17</div><div class="fc-day-content"><div style="position: relative; height: 85px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day22"><div><div class="fc-day-number">18</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day23"><div><div class="fc-day-number">19</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day24"><div><div class="fc-day-number">20</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day25"><div><div class="fc-day-number">21</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day26"><div><div class="fc-day-number">22</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day27 fc-last">"""),
format.raw("""<div><div class="fc-day-number">23</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr><tr class="fc-week4"><td class="fc-sun fc-widget-content fc-day28 fc-first"><div style="min-height: 89px;"><div class="fc-day-number">24</div><div class="fc-day-content"><div style="position: relative; height: 85px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day29 fc-state-highlight fc-today"><div><div class="fc-day-number">25</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day30"><div><div class="fc-day-number">26</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day31"><div><div class="fc-day-number">27</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day32"><div><div class="fc-day-number">28</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day33"><div><div class="fc-day-number">29</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day34 fc-last"><div><div class="fc-day-number">30</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr><tr class="fc-week5 fc-last"><td class="fc-sun fc-widget-content fc-day35 fc-first"><div style="min-height: 92px;"><div class="fc-day-number">31</div><div class="fc-day-content"><div style="position: relative; height: 0px;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day36 fc-other-month"><div><div class="fc-day-number">1</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day37 fc-other-month"><div><div class="fc-day-number">2</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day38 fc-other-month"><div><div class="fc-day-number">3</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day39 fc-other-month"><div><div class="fc-day-number">4</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day40 fc-other-month"><div><div class="fc-day-number">5</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day41 fc-last fc-other-month"><div><div class="fc-day-number">6</div><div class="fc-day-content"><div style="position:relative">&nbsp;</div></div></div></td></tr></tbody></table><div style="position:absolute;z-index:8;top:0;left:0"><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-greenLight" style="position: absolute; z-index: 8; left: 553px; width: 103px; top: 46px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">All Day Event<br><span class="ultra-light">long description</span><i class="air air-top-right fa fa-check "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-red" style="position: absolute; z-index: 8; left: 333px; width: 433px; top: 317px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">Long Event<i class="air air-top-right fa fa-lock "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-blue" style="position: absolute; z-index: 8; left: 553px; width: 103px; top: 341px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">4p</span><span class="fc-event-title">Repeating Event<i class="air air-top-right fa fa-clock-o "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position: absolute; z-index: 8; left: 443px; width: 213px; top: 423px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">Smartadmin Open Day</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position: absolute; z-index: 8; left: 113px; width: 103px; top: 423px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">10:30a</span><span class="fc-event-title">Meeting</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position: absolute; z-index: 8; left: 223px; width: 103px; top: 423px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">7p</span><span class="fc-event-title">Birthday Party</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position: absolute; z-index: 8; left: 113px; width: 103px; top: 468px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">12p</span><span class="fc-event-title">Lunch</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-blue" style="position: absolute; z-index: 8; left: 553px; width: 103px; top: 447px;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">4p</span><span class="fc-event-title">Repeating Event<i class="air air-top-right fa fa-clock-o "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div></div></div></div></div>

                                <!-- end content -->
                        </div>

                    </div>
                        <!-- end widget div -->
                </div>
                    <!-- end widget -->

            </div>

        </div>

            <!-- end row -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*239.45*/("""{"""),format.raw/*239.46*/(""" """),format.raw/*239.47*/("""trigger: "hover" """),format.raw/*239.64*/("""}"""),format.raw/*239.65*/(""");
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
         * var pagefunction = function() """),format.raw/*264.42*/("""{"""),format.raw/*264.43*/("""
         """),format.raw/*265.10*/("""*   ...
         * """),format.raw/*266.12*/("""}"""),format.raw/*266.13*/("""
         """),format.raw/*267.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*270.42*/("""{"""),format.raw/*270.43*/("""
         """),format.raw/*271.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*272.12*/("""}"""),format.raw/*272.13*/("""
         """),format.raw/*273.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*283.39*/("""{"""),format.raw/*283.40*/("""

        """),format.raw/*285.9*/("""// full calendar

        var date = new Date();
        var d = date.getDate();
        var m = date.getMonth();
        var y = date.getFullYear();

        var hdr = """),format.raw/*292.19*/("""{"""),format.raw/*292.20*/("""
        """),format.raw/*293.9*/("""left: 'title',
        center: 'month,agendaWeek,agendaDay',
        right: 'prev,today,next'
        """),format.raw/*296.9*/("""}"""),format.raw/*296.10*/(""";

        var initDrag = function (e) """),format.raw/*298.37*/("""{"""),format.raw/*298.38*/("""
        """),format.raw/*299.9*/("""// create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
        // it doesn't need to have a start or end

        var eventObject = """),format.raw/*302.27*/("""{"""),format.raw/*302.28*/("""
        """),format.raw/*303.9*/("""title: $.trim(e.children().text()), // use the element's text as the event title
        description: $.trim(e.children('span').attr('data-description')),
        icon: $.trim(e.children('span').attr('data-icon')),
        className: $.trim(e.children('span').attr('class')) // use the element's children as the event class
        """),format.raw/*307.9*/("""}"""),format.raw/*307.10*/(""";
        // store the Event Object in the DOM element so we can get to it later
        e.data('eventObject', eventObject);

        // make the event draggable using jQuery UI
        e.draggable("""),format.raw/*312.21*/("""{"""),format.raw/*312.22*/("""
        """),format.raw/*313.9*/("""zIndex: 999,
        revert: true, // will cause the event to go back to its
        revertDuration: 0 //  original position after the drag
        """),format.raw/*316.9*/("""}"""),format.raw/*316.10*/(""");
        """),format.raw/*317.9*/("""}"""),format.raw/*317.10*/(""";

        var addEvent = function (title, priority, description, icon) """),format.raw/*319.70*/("""{"""),format.raw/*319.71*/("""
        """),format.raw/*320.9*/("""title = title.length === 0 ? "Untitled Event" : title;
        description = description.length === 0 ? "No Description" : description;
        icon = icon.length === 0 ? " " : icon;
        priority = priority.length === 0 ? "label label-default" : priority;

        var html = $('<li><span class="' + priority + '" data-description="' + description + '" data-icon="' +
        icon + '">' + title + '</span></li>').prependTo('ul#external-events').hide().fadeIn();

        $("#event-container").effect("highlight", 800);

        initDrag(html);
        """),format.raw/*331.9*/("""}"""),format.raw/*331.10*/(""";

        /* initialize the external events
         -----------------------------------------------------------------*/

        $('#external-events > li').each(function () """),format.raw/*336.53*/("""{"""),format.raw/*336.54*/("""
        """),format.raw/*337.9*/("""initDrag($(this));
        """),format.raw/*338.9*/("""}"""),format.raw/*338.10*/(""");

        $('#add-event').click(function () """),format.raw/*340.43*/("""{"""),format.raw/*340.44*/("""
        """),format.raw/*341.9*/("""var title = $('#title').val(),
        priority = $('input:radio[name=priority]:checked').val(),
        description = $('#description').val(),
        icon = $('input:radio[name=iconselect]:checked').val();

        addEvent(title, priority, description, icon);
        """),format.raw/*347.9*/("""}"""),format.raw/*347.10*/(""");

        /* initialize the calendar
         -----------------------------------------------------------------*/

        $('#calendar').fullCalendar("""),format.raw/*352.37*/("""{"""),format.raw/*352.38*/("""

        """),format.raw/*354.9*/("""header: hdr,
        buttonText: """),format.raw/*355.21*/("""{"""),format.raw/*355.22*/("""
        """),format.raw/*356.9*/("""prev: '<i class="fa fa-chevron-left"></i>',
        next: '<i class="fa fa-chevron-right"></i>'
        """),format.raw/*358.9*/("""}"""),format.raw/*358.10*/(""",

        editable: true,
        droppable: true, // this allows things to be dropped onto the calendar !!!

        drop: function (date, allDay) """),format.raw/*363.39*/("""{"""),format.raw/*363.40*/(""" """),format.raw/*363.41*/("""// this function is called when something is dropped

        // retrieve the dropped element's stored Event Object
        var originalEventObject = $(this).data('eventObject');

        // we need to copy it, so that multiple events don't have a reference to the same object
        var copiedEventObject = $.extend("""),format.raw/*369.42*/("""{"""),format.raw/*369.43*/("""}"""),format.raw/*369.44*/(""", originalEventObject);

        // assign it the date that was reported
        copiedEventObject.start = date;
        copiedEventObject.allDay = allDay;

        // render the event on the calendar
        // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
        $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

        // is the "remove after drop" checkbox checked?
        if ($('#drop-remove').is(':checked')) """),format.raw/*380.47*/("""{"""),format.raw/*380.48*/("""
        """),format.raw/*381.9*/("""// if so, remove the element from the "Draggable Events" list
        $(this).remove();
        """),format.raw/*383.9*/("""}"""),format.raw/*383.10*/("""

        """),format.raw/*385.9*/("""}"""),format.raw/*385.10*/(""",

        select: function (start, end, allDay) """),format.raw/*387.47*/("""{"""),format.raw/*387.48*/("""
        """),format.raw/*388.9*/("""var title = prompt('Event Title:');
        if (title) """),format.raw/*389.20*/("""{"""),format.raw/*389.21*/("""
        """),format.raw/*390.9*/("""calendar.fullCalendar('renderEvent', """),format.raw/*390.46*/("""{"""),format.raw/*390.47*/("""
        """),format.raw/*391.9*/("""title: title,
        start: start,
        end: end,
        allDay: allDay
        """),format.raw/*395.9*/("""}"""),format.raw/*395.10*/(""", true // make the event "stick"
        );
        """),format.raw/*397.9*/("""}"""),format.raw/*397.10*/("""
        """),format.raw/*398.9*/("""calendar.fullCalendar('unselect');
        """),format.raw/*399.9*/("""}"""),format.raw/*399.10*/(""",

        events: ["""),format.raw/*401.18*/("""{"""),format.raw/*401.19*/("""
        """),format.raw/*402.9*/("""title: 'All Day Event',
        start: new Date(y, m, 1),
        description: 'long description',
        className: ["event", "bg-color-greenLight"],
        icon: 'fa-check'
        """),format.raw/*407.9*/("""}"""),format.raw/*407.10*/(""", """),format.raw/*407.12*/("""{"""),format.raw/*407.13*/("""
        """),format.raw/*408.9*/("""title: 'Long Event',
        start: new Date(y, m, d - 5),
        end: new Date(y, m, d - 2),
        className: ["event", "bg-color-red"],
        icon: 'fa-lock'
        """),format.raw/*413.9*/("""}"""),format.raw/*413.10*/(""", """),format.raw/*413.12*/("""{"""),format.raw/*413.13*/("""
        """),format.raw/*414.9*/("""id: 999,
        title: 'Repeating Event',
        start: new Date(y, m, d - 3, 16, 0),
        allDay: false,
        className: ["event", "bg-color-blue"],
        icon: 'fa-clock-o'
        """),format.raw/*420.9*/("""}"""),format.raw/*420.10*/(""", """),format.raw/*420.12*/("""{"""),format.raw/*420.13*/("""
        """),format.raw/*421.9*/("""id: 999,
        title: 'Repeating Event',
        start: new Date(y, m, d + 4, 16, 0),
        allDay: false,
        className: ["event", "bg-color-blue"],
        icon: 'fa-clock-o'
        """),format.raw/*427.9*/("""}"""),format.raw/*427.10*/(""", """),format.raw/*427.12*/("""{"""),format.raw/*427.13*/("""
        """),format.raw/*428.9*/("""title: 'Meeting',
        start: new Date(y, m, d, 10, 30),
        allDay: false,
        className: ["event", "bg-color-darken"]
        """),format.raw/*432.9*/("""}"""),format.raw/*432.10*/(""", """),format.raw/*432.12*/("""{"""),format.raw/*432.13*/("""
        """),format.raw/*433.9*/("""title: 'Lunch',
        start: new Date(y, m, d, 12, 0),
        end: new Date(y, m, d, 14, 0),
        allDay: false,
        className: ["event", "bg-color-darken"]
        """),format.raw/*438.9*/("""}"""),format.raw/*438.10*/(""", """),format.raw/*438.12*/("""{"""),format.raw/*438.13*/("""
        """),format.raw/*439.9*/("""title: 'Birthday Party',
        start: new Date(y, m, d + 1, 19, 0),
        end: new Date(y, m, d + 1, 22, 30),
        allDay: false,
        className: ["event", "bg-color-darken"]
        """),format.raw/*444.9*/("""}"""),format.raw/*444.10*/(""", """),format.raw/*444.12*/("""{"""),format.raw/*444.13*/("""
        """),format.raw/*445.9*/("""title: 'Smartadmin Open Day',
        start: new Date(y, m, 28),
        end: new Date(y, m, 29),
        className: ["event", "bg-color-darken"]
        """),format.raw/*449.9*/("""}"""),format.raw/*449.10*/("""],

        eventRender: function (event, element, icon) """),format.raw/*451.54*/("""{"""),format.raw/*451.55*/("""
        """),format.raw/*452.9*/("""if (!event.description == "") """),format.raw/*452.39*/("""{"""),format.raw/*452.40*/("""
        """),format.raw/*453.9*/("""element.find('.fc-event-title').append("<br/><span class='ultra-light'>" + event.description +
        "</span>");
        """),format.raw/*455.9*/("""}"""),format.raw/*455.10*/("""
        """),format.raw/*456.9*/("""if (!event.icon == "") """),format.raw/*456.32*/("""{"""),format.raw/*456.33*/("""
        """),format.raw/*457.9*/("""element.find('.fc-event-title').append("<i class='air air-top-right fa " + event.icon +
        " '></i>");
        """),format.raw/*459.9*/("""}"""),format.raw/*459.10*/("""
        """),format.raw/*460.9*/("""}"""),format.raw/*460.10*/(""",

        windowResize: function (event, ui) """),format.raw/*462.44*/("""{"""),format.raw/*462.45*/("""
        """),format.raw/*463.9*/("""$('#calendar').fullCalendar('render');
        """),format.raw/*464.9*/("""}"""),format.raw/*464.10*/("""
        """),format.raw/*465.9*/("""}"""),format.raw/*465.10*/(""");

        /* hide default buttons */
        $('.fc-header-right, .fc-header-center').hide();



        $('#calendar-buttons #btn-prev').click(function () """),format.raw/*472.60*/("""{"""),format.raw/*472.61*/("""
        """),format.raw/*473.9*/("""$('.fc-button-prev').click();
        return false;
        """),format.raw/*475.9*/("""}"""),format.raw/*475.10*/(""");

        $('#calendar-buttons #btn-next').click(function () """),format.raw/*477.60*/("""{"""),format.raw/*477.61*/("""
        """),format.raw/*478.9*/("""$('.fc-button-next').click();
        return false;
        """),format.raw/*480.9*/("""}"""),format.raw/*480.10*/(""");

        $('#calendar-buttons #btn-today').click(function () """),format.raw/*482.61*/("""{"""),format.raw/*482.62*/("""
        """),format.raw/*483.9*/("""$('.fc-button-today').click();
        return false;
        """),format.raw/*485.9*/("""}"""),format.raw/*485.10*/(""");

        $('#mt').click(function () """),format.raw/*487.36*/("""{"""),format.raw/*487.37*/("""
        """),format.raw/*488.9*/("""$('#calendar').fullCalendar('changeView', 'month');
        """),format.raw/*489.9*/("""}"""),format.raw/*489.10*/(""");

        $('#ag').click(function () """),format.raw/*491.36*/("""{"""),format.raw/*491.37*/("""
        """),format.raw/*492.9*/("""$('#calendar').fullCalendar('changeView', 'agendaWeek');
        """),format.raw/*493.9*/("""}"""),format.raw/*493.10*/(""");

        $('#td').click(function () """),format.raw/*495.36*/("""{"""),format.raw/*495.37*/("""
        """),format.raw/*496.9*/("""$('#calendar').fullCalendar('changeView', 'agendaDay');
        """),format.raw/*497.9*/("""}"""),format.raw/*497.10*/(""");

        """),format.raw/*499.9*/("""}"""),format.raw/*499.10*/(""";

        // end pagefunction

        // loadscript and run pagefunction
        loadScript("js/plugin/fullcalendar/jquery.fullcalendar.min.js", pagefunction);


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
                  DATE: Thu Aug 28 21:08:46 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/calendar.scala.html
                  HASH: aaafe54f7e8917873ed2823a4185cb65a25faf5d
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|27885->27140|27915->27141|27945->27142|27991->27159|28021->27160|28710->27820|28740->27821|28779->27831|28827->27850|28857->27851|28896->27861|29064->28000|29094->28001|29133->28011|29223->28072|29253->28073|29292->28083|29515->28277|29545->28278|29583->28288|29781->28457|29811->28458|29848->28467|29978->28569|30008->28570|30076->28609|30106->28610|30143->28619|30338->28785|30368->28786|30405->28795|30765->29127|30795->29128|31022->29326|31052->29327|31089->29336|31265->29484|31295->29485|31334->29496|31364->29497|31465->29569|31495->29570|31532->29579|32117->30136|32147->30137|32351->30312|32381->30313|32418->30322|32473->30349|32503->30350|32578->30396|32608->30397|32645->30406|32944->30677|32974->30678|33156->30831|33186->30832|33224->30842|33286->30875|33316->30876|33353->30885|33485->30989|33515->30990|33693->31139|33723->31140|33753->31141|34100->31459|34130->31460|34160->31461|34706->31978|34736->31979|34773->31988|34897->32084|34927->32085|34965->32095|34995->32096|35073->32145|35103->32146|35140->32155|35224->32210|35254->32211|35291->32220|35357->32257|35387->32258|35424->32267|35537->32352|35567->32353|35647->32405|35677->32406|35714->32415|35785->32458|35815->32459|35864->32479|35894->32480|35931->32489|36144->32674|36174->32675|36205->32677|36235->32678|36272->32687|36473->32860|36503->32861|36534->32863|36564->32864|36601->32873|36822->33066|36852->33067|36883->33069|36913->33070|36950->33079|37171->33272|37201->33273|37232->33275|37262->33276|37299->33285|37466->33424|37496->33425|37527->33427|37557->33428|37594->33437|37797->33612|37827->33613|37858->33615|37888->33616|37925->33625|38146->33818|38176->33819|38207->33821|38237->33822|38274->33831|38456->33985|38486->33986|38572->34043|38602->34044|38639->34053|38698->34083|38728->34084|38765->34093|38916->34216|38946->34217|38983->34226|39035->34249|39065->34250|39102->34259|39246->34375|39276->34376|39313->34385|39343->34386|39418->34432|39448->34433|39485->34442|39560->34489|39590->34490|39627->34499|39657->34500|39844->34658|39874->34659|39911->34668|39999->34728|40029->34729|40121->34792|40151->34793|40188->34802|40276->34862|40306->34863|40399->34927|40429->34928|40466->34937|40555->34998|40585->34999|40653->35038|40683->35039|40720->35048|40808->35108|40838->35109|40906->35148|40936->35149|40973->35158|41066->35223|41096->35224|41164->35263|41194->35264|41231->35273|41323->35337|41353->35338|41393->35350|41423->35351
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|261->239|261->239|261->239|261->239|261->239|286->264|286->264|287->265|288->266|288->266|289->267|292->270|292->270|293->271|294->272|294->272|295->273|305->283|305->283|307->285|314->292|314->292|315->293|318->296|318->296|320->298|320->298|321->299|324->302|324->302|325->303|329->307|329->307|334->312|334->312|335->313|338->316|338->316|339->317|339->317|341->319|341->319|342->320|353->331|353->331|358->336|358->336|359->337|360->338|360->338|362->340|362->340|363->341|369->347|369->347|374->352|374->352|376->354|377->355|377->355|378->356|380->358|380->358|385->363|385->363|385->363|391->369|391->369|391->369|402->380|402->380|403->381|405->383|405->383|407->385|407->385|409->387|409->387|410->388|411->389|411->389|412->390|412->390|412->390|413->391|417->395|417->395|419->397|419->397|420->398|421->399|421->399|423->401|423->401|424->402|429->407|429->407|429->407|429->407|430->408|435->413|435->413|435->413|435->413|436->414|442->420|442->420|442->420|442->420|443->421|449->427|449->427|449->427|449->427|450->428|454->432|454->432|454->432|454->432|455->433|460->438|460->438|460->438|460->438|461->439|466->444|466->444|466->444|466->444|467->445|471->449|471->449|473->451|473->451|474->452|474->452|474->452|475->453|477->455|477->455|478->456|478->456|478->456|479->457|481->459|481->459|482->460|482->460|484->462|484->462|485->463|486->464|486->464|487->465|487->465|494->472|494->472|495->473|497->475|497->475|499->477|499->477|500->478|502->480|502->480|504->482|504->482|505->483|507->485|507->485|509->487|509->487|510->488|511->489|511->489|513->491|513->491|514->492|515->493|515->493|517->495|517->495|518->496|519->497|519->497|521->499|521->499
                  -- GENERATED --
              */
          