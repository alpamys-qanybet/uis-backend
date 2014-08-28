
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
object jqgrid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""
"""),format.raw/*3.1*/("""<script type="text/javascript">

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
     */

    var pagefunction = function() """),format.raw/*48.35*/("""{"""),format.raw/*48.36*/("""
        """),format.raw/*49.9*/("""loadScript("assets/javascripts/plugin/jqgrid/jquery.jqGrid.min.js", run_jqgrid_function);

        function run_jqgrid_function() """),format.raw/*51.40*/("""{"""),format.raw/*51.41*/("""


            """),format.raw/*54.13*/("""var jqgrid_data = ["""),format.raw/*54.32*/("""{"""),format.raw/*54.33*/("""
                """),format.raw/*55.17*/("""id : "1",
                date : "2007-10-01",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/(""", """),format.raw/*62.16*/("""{"""),format.raw/*62.17*/("""
                """),format.raw/*63.17*/("""id : "2",
                date : "2007-10-02",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/(""", """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
                """),format.raw/*71.17*/("""id : "3",
                date : "2007-09-01",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/(""", """),format.raw/*78.16*/("""{"""),format.raw/*78.17*/("""
                """),format.raw/*79.17*/("""id : "4",
                date : "2007-10-04",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""", """),format.raw/*86.16*/("""{"""),format.raw/*86.17*/("""
                """),format.raw/*87.17*/("""id : "5",
                date : "2007-10-05",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/(""", """),format.raw/*94.16*/("""{"""),format.raw/*94.17*/("""
                """),format.raw/*95.17*/("""id : "6",
                date : "2007-09-06",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/(""", """),format.raw/*102.16*/("""{"""),format.raw/*102.17*/("""
                """),format.raw/*103.17*/("""id : "7",
                date : "2007-10-04",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/(""", """),format.raw/*110.16*/("""{"""),format.raw/*110.17*/("""
                """),format.raw/*111.17*/("""id : "8",
                date : "2007-10-03",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/(""", """),format.raw/*118.16*/("""{"""),format.raw/*118.17*/("""
                """),format.raw/*119.17*/("""id : "9",
                date : "2007-09-01",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/(""", """),format.raw/*126.16*/("""{"""),format.raw/*126.17*/("""
                """),format.raw/*127.17*/("""id : "10",
                date : "2007-10-01",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*134.13*/("""}"""),format.raw/*134.14*/(""", """),format.raw/*134.16*/("""{"""),format.raw/*134.17*/("""
                """),format.raw/*135.17*/("""id : "11",
                date : "2007-10-02",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/(""", """),format.raw/*142.16*/("""{"""),format.raw/*142.17*/("""
                """),format.raw/*143.17*/("""id : "12",
                date : "2007-09-01",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/(""", """),format.raw/*150.16*/("""{"""),format.raw/*150.17*/("""
                """),format.raw/*151.17*/("""id : "13",
                date : "2007-10-04",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/(""", """),format.raw/*158.16*/("""{"""),format.raw/*158.17*/("""
                """),format.raw/*159.17*/("""id : "14",
                date : "2007-10-05",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*166.13*/("""}"""),format.raw/*166.14*/(""", """),format.raw/*166.16*/("""{"""),format.raw/*166.17*/("""
                """),format.raw/*167.17*/("""id : "15",
                date : "2007-09-06",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*174.13*/("""}"""),format.raw/*174.14*/(""", """),format.raw/*174.16*/("""{"""),format.raw/*174.17*/("""
                """),format.raw/*175.17*/("""id : "16",
                date : "2007-10-04",
                name : "test",
                note : "note",
                amount : "200.00",
                tax : "10.00",
                total : "210.00"
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""", """),format.raw/*182.16*/("""{"""),format.raw/*182.17*/("""
                """),format.raw/*183.17*/("""id : "17",
                date : "2007-10-03",
                name : "test2",
                note : "note2",
                amount : "300.00",
                tax : "20.00",
                total : "320.00"
            """),format.raw/*190.13*/("""}"""),format.raw/*190.14*/(""", """),format.raw/*190.16*/("""{"""),format.raw/*190.17*/("""
                """),format.raw/*191.17*/("""id : "18",
                date : "2007-09-01",
                name : "test3",
                note : "note3",
                amount : "400.00",
                tax : "30.00",
                total : "430.00"
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/("""];

            jQuery("#jqgrid").jqGrid("""),format.raw/*200.38*/("""{"""),format.raw/*200.39*/("""
                """),format.raw/*201.17*/("""data : jqgrid_data,
                datatype : "local",
                height : 'auto',
                colNames : ['Actions', 'Inv No', 'Date', 'Client', 'Amount', 'Tax', 'Total', 'Notes'],
                colModel : [
                    """),format.raw/*206.21*/("""{"""),format.raw/*206.22*/(""" """),format.raw/*206.23*/("""name : 'act', index:'act', sortable:false """),format.raw/*206.65*/("""}"""),format.raw/*206.66*/(""",
                    """),format.raw/*207.21*/("""{"""),format.raw/*207.22*/(""" """),format.raw/*207.23*/("""name : 'id', index : 'id' """),format.raw/*207.49*/("""}"""),format.raw/*207.50*/(""",
                    """),format.raw/*208.21*/("""{"""),format.raw/*208.22*/(""" """),format.raw/*208.23*/("""name : 'date', index : 'date', editable : true """),format.raw/*208.70*/("""}"""),format.raw/*208.71*/(""",
                    """),format.raw/*209.21*/("""{"""),format.raw/*209.22*/(""" """),format.raw/*209.23*/("""name : 'name', index : 'name', editable : true """),format.raw/*209.70*/("""}"""),format.raw/*209.71*/(""",
                    """),format.raw/*210.21*/("""{"""),format.raw/*210.22*/(""" """),format.raw/*210.23*/("""name : 'amount', index : 'amount', align : "right", editable : true """),format.raw/*210.91*/("""}"""),format.raw/*210.92*/(""",
                    """),format.raw/*211.21*/("""{"""),format.raw/*211.22*/(""" """),format.raw/*211.23*/("""name : 'tax', index : 'tax', align : "right", editable : true """),format.raw/*211.85*/("""}"""),format.raw/*211.86*/(""",
                    """),format.raw/*212.21*/("""{"""),format.raw/*212.22*/(""" """),format.raw/*212.23*/("""name : 'total', index : 'total', align : "right", editable : true """),format.raw/*212.89*/("""}"""),format.raw/*212.90*/(""",
                    """),format.raw/*213.21*/("""{"""),format.raw/*213.22*/(""" """),format.raw/*213.23*/("""name : 'note', index : 'note', sortable : false, editable : true """),format.raw/*213.88*/("""}"""),format.raw/*213.89*/("""],
                rowNum : 10,
                rowList : [10, 20, 30],
                pager : '#pjqgrid',
                sortname : 'id',
                toolbarfilter: true,
                viewrecords : true,
                sortorder : "asc",
                gridComplete: function()"""),format.raw/*221.41*/("""{"""),format.raw/*221.42*/("""
                    """),format.raw/*222.21*/("""var ids = jQuery("#jqgrid").jqGrid('getDataIDs');
                    for(var i=0;i < ids.length;i++)"""),format.raw/*223.52*/("""{"""),format.raw/*223.53*/("""
                        """),format.raw/*224.25*/("""var cl = ids[i];
                        be = "<button class='btn btn-xs btn-default' data-original-title='Edit Row' onclick=\"jQuery('#jqgrid').editRow('"+cl+"');\"><i class='fa fa-pencil'></i></button>";
                        se = "<button class='btn btn-xs btn-default' data-original-title='Save Row' onclick=\"jQuery('#jqgrid').saveRow('"+cl+"');\"><i class='fa fa-save'></i></button>";
                        ca = "<button class='btn btn-xs btn-default' data-original-title='Cancel' onclick=\"jQuery('#jqgrid').restoreRow('"+cl+"');\"><i class='fa fa-times'></i></button>";
                        //ce = "<button class='btn btn-xs btn-default' onclick=\"jQuery('#jqgrid').restoreRow('"+cl+"');\"><i class='fa fa-times'></i></button>";
                        //jQuery("#jqgrid").jqGrid('setRowData',ids[i],"""),format.raw/*229.72*/("""{"""),format.raw/*229.73*/("""act:be+se+ce"""),format.raw/*229.85*/("""}"""),format.raw/*229.86*/(""");
                        jQuery("#jqgrid").jqGrid('setRowData',ids[i],"""),format.raw/*230.70*/("""{"""),format.raw/*230.71*/("""act:be+se+ca"""),format.raw/*230.83*/("""}"""),format.raw/*230.84*/(""");
                    """),format.raw/*231.21*/("""}"""),format.raw/*231.22*/("""
                """),format.raw/*232.17*/("""}"""),format.raw/*232.18*/(""",
                editurl : "dummy.html",
                caption : "SmartAmind jQgrid Skin",
                multiselect : true,
                autowidth : true,

                """),format.raw/*238.17*/("""}"""),format.raw/*238.18*/(""");
                jQuery("#jqgrid").jqGrid('navGrid', "#pjqgrid", """),format.raw/*239.65*/("""{"""),format.raw/*239.66*/("""
                    """),format.raw/*240.21*/("""edit : false,
                    add : false,
                    del : true
                """),format.raw/*243.17*/("""}"""),format.raw/*243.18*/(""");
                jQuery("#jqgrid").jqGrid('inlineNav', "#pjqgrid");
                /* Add tooltips */
                $('.navtable .ui-pg-button').tooltip("""),format.raw/*246.54*/("""{"""),format.raw/*246.55*/("""
                    """),format.raw/*247.21*/("""container : 'body'
                """),format.raw/*248.17*/("""}"""),format.raw/*248.18*/(""");

                jQuery("#m1").click(function() """),format.raw/*250.48*/("""{"""),format.raw/*250.49*/("""
                    """),format.raw/*251.21*/("""var s;
                    s = jQuery("#jqgrid").jqGrid('getGridParam', 'selarrrow');
                    alert(s);
                """),format.raw/*254.17*/("""}"""),format.raw/*254.18*/(""");
                jQuery("#m1s").click(function() """),format.raw/*255.49*/("""{"""),format.raw/*255.50*/("""
                    """),format.raw/*256.21*/("""jQuery("#jqgrid").jqGrid('setSelection', "13");
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/(""");

                // remove classes
                $(".ui-jqgrid").removeClass("ui-widget ui-widget-content");
                $(".ui-jqgrid-view").children().removeClass("ui-widget-header ui-state-default");
                $(".ui-jqgrid-labels, .ui-search-toolbar").children().removeClass("ui-state-default ui-th-column ui-th-ltr");
                $(".ui-jqgrid-pager").removeClass("ui-state-default");
                $(".ui-jqgrid").removeClass("ui-widget-content");

                // add classes
                $(".ui-jqgrid-htable").addClass("table table-bordered table-hover");
                $(".ui-jqgrid-btable").addClass("table table-bordered table-striped");


                $(".ui-pg-div").removeClass().addClass("btn btn-sm btn-primary");
                $(".ui-icon.ui-icon-plus").removeClass().addClass("fa fa-plus");
                $(".ui-icon.ui-icon-pencil").removeClass().addClass("fa fa-pencil");
                $(".ui-icon.ui-icon-trash").removeClass().addClass("fa fa-trash-o");
                $(".ui-icon.ui-icon-search").removeClass().addClass("fa fa-search");
                $(".ui-icon.ui-icon-refresh").removeClass().addClass("fa fa-refresh");
                $(".ui-icon.ui-icon-disk").removeClass().addClass("fa fa-save").parent(".btn-primary").removeClass("btn-primary").addClass("btn-success");
                $(".ui-icon.ui-icon-cancel").removeClass().addClass("fa fa-times").parent(".btn-primary").removeClass("btn-primary").addClass("btn-danger");

                $( ".ui-icon.ui-icon-seek-prev" ).wrap( "<div class='btn btn-sm btn-default'></div>" );
                $(".ui-icon.ui-icon-seek-prev").removeClass().addClass("fa fa-backward");

                $( ".ui-icon.ui-icon-seek-first" ).wrap( "<div class='btn btn-sm btn-default'></div>" );
                $(".ui-icon.ui-icon-seek-first").removeClass().addClass("fa fa-fast-backward");

                $( ".ui-icon.ui-icon-seek-next" ).wrap( "<div class='btn btn-sm btn-default'></div>" );
                $(".ui-icon.ui-icon-seek-next").removeClass().addClass("fa fa-forward");

                $( ".ui-icon.ui-icon-seek-end" ).wrap( "<div class='btn btn-sm btn-default'></div>" );
                $(".ui-icon.ui-icon-seek-end").removeClass().addClass("fa fa-fast-forward");




                // update buttons

                $(window).on('resize.jqGrid', function () """),format.raw/*297.59*/("""{"""),format.raw/*297.60*/("""
                    """),format.raw/*298.21*/("""jQuery("#jqgrid").jqGrid( 'setGridWidth', $("#content").width() );
                """),format.raw/*299.17*/("""}"""),format.raw/*299.18*/(""")


            """),format.raw/*302.13*/("""}"""),format.raw/*302.14*/(""" """),format.raw/*302.15*/("""// end function


    """),format.raw/*305.5*/("""}"""),format.raw/*305.6*/("""

    """),format.raw/*307.5*/("""loadScript("assets/javascripts/plugin/jqgrid/grid.locale-en.min.js", pagefunction);

</script>

""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*311.2*/("""
"""),_display_(/*312.2*/main(message,scripts)/*312.23*/ {_display_(Seq[Any](format.raw/*312.25*/("""
    """),format.raw/*313.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
                <h1 class="page-title txt-color-blueDark">

                        <!-- PAGE HEADER -->
                    <i class="fa-fw fa fa-table"></i>
                    Tables
                    <span>&gt;
                        Jquery Grid
                    </span>
                </h1>
            </div>
                <!-- end col -->

                <!-- right side of the page with the sparkline graphs -->
                <!-- col -->
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
                    <!-- sparks -->
                <ul id="sparks">
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
                    <!-- end sparks -->
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

                    <div class="alert alert-info">
                        <h4>jqGrid is a grid plugin for the JQuery Javascript library. It is free, open source and gets distributed under the MIT license.</h4>
                        <br>
                        <div class="col-sm-4">
                            <ul>
                                <li>
                                    Works fine under IE, Firefox, Chrome, Safari, Opera
                                </li>
                                <li>
                                    The UI comes in 20+ languages
                                </li>

                            </ul>
                        </div>
                        <div class="col-sm-4">
                            <ul>
                                <li>
                                    In-place cell editing or on-the-fly form creation to edit a record
                                </li>
                                <li>
                                    Supports subgrids and tree grid for displaying hierarchical data
                                </li>

                            </ul>
                        </div>
                        <div class="col-sm-4">
                            <ul>
                                <li>
                                    AJAX enabled - Accepts XML/JSON/local array data sources
                                </li>
                                <li>
                                    Paging, sorting, Search and filtering
                                </li>
                            </ul>
                        </div>

                        http://trirand.com/blog/jqgrid/jqgrid.html
                    </div>

                    <div class="ui-jqgrid ui-corner-all" id="gbox_jqgrid" dir="ltr" style="width: 1038px;"><div class="ui-widget-overlay jqgrid-overlay" id="lui_jqgrid"></div><div class="loading ui-state-default ui-state-active" id="load_jqgrid" style="display: none;">Loading...</div><div class="ui-jqgrid-view" id="gview_jqgrid" style="width: 1038px;"><div class="ui-jqgrid-titlebar ui-corner-top ui-helper-clearfix"><a role="link" class="ui-jqgrid-titlebar-close HeaderButton" style="right: 0px;"><span class="ui-icon ui-icon-circle-triangle-n"></span></a><span class="ui-jqgrid-title">SmartAmind jQgrid Skin</span></div><div class="ui-jqgrid-hdiv" style="width: 1038px;"><div class="ui-jqgrid-hbox"><table class="ui-jqgrid-htable table table-bordered table-hover" style="width: 1038px;" role="grid" aria-labelledby="gbox_jqgrid" cellspacing="0" cellpadding="0" border="0"><thead><tr class="ui-jqgrid-labels" role="rowheader"><th id="jqgrid_cb" role="columnheader" class="" style="width: 20px;"><div id="jqgh_jqgrid_cb"><input role="checkbox" id="cb_jqgrid" class="cbox" type="checkbox"><span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_act" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_act" class="ui-jqgrid-sortable">Actions<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_id" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_id" class="ui-jqgrid-sortable">Inv No<span class="s-ico" style=""><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_date" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_date" class="ui-jqgrid-sortable">Date<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_name" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_name" class="ui-jqgrid-sortable">Client<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_amount" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_amount" class="ui-jqgrid-sortable">Amount<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_tax" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_tax" class="ui-jqgrid-sortable">Tax<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_total" role="columnheader" class="" style="width: 122px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_total" class="ui-jqgrid-sortable">Total<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th><th id="jqgrid_note" role="columnheader" class="" style="width: 119px;"><span class="ui-jqgrid-resize ui-jqgrid-resize-ltr" style="cursor: col-resize;">&nbsp;</span><div id="jqgh_jqgrid_note" class="ui-jqgrid-sortable">Notes<span class="s-ico" style="display:none"><span sort="asc" class="ui-grid-ico-sort ui-icon-asc ui-state-disabled ui-icon ui-icon-triangle-1-n ui-sort-ltr"></span><span sort="desc" class="ui-grid-ico-sort ui-icon-desc ui-state-disabled ui-icon ui-icon-triangle-1-s ui-sort-ltr"></span></span></div></th></tr></thead></table></div></div><div class="ui-jqgrid-bdiv" style="height: auto; width: 1038px;"><div style="position:relative;"><div></div><table id="jqgrid" tabindex="0" cellspacing="0" cellpadding="0" border="0" role="grid" aria-multiselectable="true" aria-labelledby="gbox_jqgrid" class="ui-jqgrid-btable table table-bordered table-striped" style="width: 1038px;"><tbody><tr class="jqgfirstrow" role="row" style="height:auto"><td role="gridcell" style="height:0px;width:20px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 122px;"></td><td role="gridcell" style="height: 0px; width: 119px;"></td></tr><tr role="row" id="1" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;width: 20px;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_1" class="cbox" name="jqg_jqgrid_1"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('1');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('1');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('1');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="1" aria-describedby="jqgrid_id">1</td><td role="gridcell" style="" title="2007-10-01" aria-describedby="jqgrid_date">2007-10-01</td><td role="gridcell" style="" title="test" aria-describedby="jqgrid_name">test</td><td role="gridcell" style="text-align:right;" title="200.00" aria-describedby="jqgrid_amount">200.00</td><td role="gridcell" style="text-align:right;" title="10.00" aria-describedby="jqgrid_tax">10.00</td><td role="gridcell" style="text-align:right;" title="210.00" aria-describedby="jqgrid_total">210.00</td><td role="gridcell" style="" title="note" aria-describedby="jqgrid_note">note</td></tr><tr role="row" id="10" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_10" class="cbox" name="jqg_jqgrid_10"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('10');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('10');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('10');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="10" aria-describedby="jqgrid_id">10</td><td role="gridcell" style="" title="2007-10-01" aria-describedby="jqgrid_date">2007-10-01</td><td role="gridcell" style="" title="test" aria-describedby="jqgrid_name">test</td><td role="gridcell" style="text-align:right;" title="200.00" aria-describedby="jqgrid_amount">200.00</td><td role="gridcell" style="text-align:right;" title="10.00" aria-describedby="jqgrid_tax">10.00</td><td role="gridcell" style="text-align:right;" title="210.00" aria-describedby="jqgrid_total">210.00</td><td role="gridcell" style="" title="note" aria-describedby="jqgrid_note">note</td></tr><tr role="row" id="11" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_11" class="cbox" name="jqg_jqgrid_11"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('11');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('11');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('11');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="11" aria-describedby="jqgrid_id">11</td><td role="gridcell" style="" title="2007-10-02" aria-describedby="jqgrid_date">2007-10-02</td><td role="gridcell" style="" title="test2" aria-describedby="jqgrid_name">test2</td><td role="gridcell" style="text-align:right;" title="300.00" aria-describedby="jqgrid_amount">300.00</td><td role="gridcell" style="text-align:right;" title="20.00" aria-describedby="jqgrid_tax">20.00</td><td role="gridcell" style="text-align:right;" title="320.00" aria-describedby="jqgrid_total">320.00</td><td role="gridcell" style="" title="note2" aria-describedby="jqgrid_note">note2</td></tr><tr role="row" id="12" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_12" class="cbox" name="jqg_jqgrid_12"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('12');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('12');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('12');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="12" aria-describedby="jqgrid_id">12</td><td role="gridcell" style="" title="2007-09-01" aria-describedby="jqgrid_date">2007-09-01</td><td role="gridcell" style="" title="test3" aria-describedby="jqgrid_name">test3</td><td role="gridcell" style="text-align:right;" title="400.00" aria-describedby="jqgrid_amount">400.00</td><td role="gridcell" style="text-align:right;" title="30.00" aria-describedby="jqgrid_tax">30.00</td><td role="gridcell" style="text-align:right;" title="430.00" aria-describedby="jqgrid_total">430.00</td><td role="gridcell" style="" title="note3" aria-describedby="jqgrid_note">note3</td></tr><tr role="row" id="13" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_13" class="cbox" name="jqg_jqgrid_13"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('13');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('13');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('13');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="13" aria-describedby="jqgrid_id">13</td><td role="gridcell" style="" title="2007-10-04" aria-describedby="jqgrid_date">2007-10-04</td><td role="gridcell" style="" title="test" aria-describedby="jqgrid_name">test</td><td role="gridcell" style="text-align:right;" title="200.00" aria-describedby="jqgrid_amount">200.00</td><td role="gridcell" style="text-align:right;" title="10.00" aria-describedby="jqgrid_tax">10.00</td><td role="gridcell" style="text-align:right;" title="210.00" aria-describedby="jqgrid_total">210.00</td><td role="gridcell" style="" title="note" aria-describedby="jqgrid_note">note</td></tr><tr role="row" id="14" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_14" class="cbox" name="jqg_jqgrid_14"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('14');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('14');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('14');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="14" aria-describedby="jqgrid_id">14</td><td role="gridcell" style="" title="2007-10-05" aria-describedby="jqgrid_date">2007-10-05</td><td role="gridcell" style="" title="test2" aria-describedby="jqgrid_name">test2</td><td role="gridcell" style="text-align:right;" title="300.00" aria-describedby="jqgrid_amount">300.00</td><td role="gridcell" style="text-align:right;" title="20.00" aria-describedby="jqgrid_tax">20.00</td><td role="gridcell" style="text-align:right;" title="320.00" aria-describedby="jqgrid_total">320.00</td><td role="gridcell" style="" title="note2" aria-describedby="jqgrid_note">note2</td></tr><tr role="row" id="15" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_15" class="cbox" name="jqg_jqgrid_15"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow("""),
format.raw("""'15');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('15');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('15');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="15" aria-describedby="jqgrid_id">15</td><td role="gridcell" style="" title="2007-09-06" aria-describedby="jqgrid_date">2007-09-06</td><td role="gridcell" style="" title="test3" aria-describedby="jqgrid_name">test3</td><td role="gridcell" style="text-align:right;" title="400.00" aria-describedby="jqgrid_amount">400.00</td><td role="gridcell" style="text-align:right;" title="30.00" aria-describedby="jqgrid_tax">30.00</td><td role="gridcell" style="text-align:right;" title="430.00" aria-describedby="jqgrid_total">430.00</td><td role="gridcell" style="" title="note3" aria-describedby="jqgrid_note">note3</td></tr><tr role="row" id="16" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_16" class="cbox" name="jqg_jqgrid_16"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('16');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('16');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('16');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="16" aria-describedby="jqgrid_id">16</td><td role="gridcell" style="" title="2007-10-04" aria-describedby="jqgrid_date">2007-10-04</td><td role="gridcell" style="" title="test" aria-describedby="jqgrid_name">test</td><td role="gridcell" style="text-align:right;" title="200.00" aria-describedby="jqgrid_amount">200.00</td><td role="gridcell" style="text-align:right;" title="10.00" aria-describedby="jqgrid_tax">10.00</td><td role="gridcell" style="text-align:right;" title="210.00" aria-describedby="jqgrid_total">210.00</td><td role="gridcell" style="" title="note" aria-describedby="jqgrid_note">note</td></tr><tr role="row" id="17" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_17" class="cbox" name="jqg_jqgrid_17"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('17');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('17');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('17');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="17" aria-describedby="jqgrid_id">17</td><td role="gridcell" style="" title="2007-10-03" aria-describedby="jqgrid_date">2007-10-03</td><td role="gridcell" style="" title="test2" aria-describedby="jqgrid_name">test2</td><td role="gridcell" style="text-align:right;" title="300.00" aria-describedby="jqgrid_amount">300.00</td><td role="gridcell" style="text-align:right;" title="20.00" aria-describedby="jqgrid_tax">20.00</td><td role="gridcell" style="text-align:right;" title="320.00" aria-describedby="jqgrid_total">320.00</td><td role="gridcell" style="" title="note2" aria-describedby="jqgrid_note">note2</td></tr><tr role="row" id="18" tabindex="-1" class="ui-widget-content jqgrow ui-row-ltr"><td role="gridcell" style="text-align:center;" aria-describedby="jqgrid_cb"><input role="checkbox" type="checkbox" id="jqg_jqgrid_18" class="cbox" name="jqg_jqgrid_18"></td><td role="gridcell" style="" title="" aria-describedby="jqgrid_act"><button class="btn btn-xs btn-default" data-original-title="Edit Row" onclick="jQuery('#jqgrid').editRow('18');"><i class="fa fa-pencil"></i></button><button class="btn btn-xs btn-default" data-original-title="Save Row" onclick="jQuery('#jqgrid').saveRow('18');"><i class="fa fa-save"></i></button><button class="btn btn-xs btn-default" data-original-title="Cancel" onclick="jQuery('#jqgrid').restoreRow('18');"><i class="fa fa-times"></i></button></td><td role="gridcell" style="" title="18" aria-describedby="jqgrid_id">18</td><td role="gridcell" style="" title="2007-09-01" aria-describedby="jqgrid_date">2007-09-01</td><td role="gridcell" style="" title="test3" aria-describedby="jqgrid_name">test3</td><td role="gridcell" style="text-align:right;" title="400.00" aria-describedby="jqgrid_amount">400.00</td><td role="gridcell" style="text-align:right;" title="30.00" aria-describedby="jqgrid_tax">30.00</td><td role="gridcell" style="text-align:right;" title="430.00" aria-describedby="jqgrid_total">430.00</td><td role="gridcell" style="" title="note3" aria-describedby="jqgrid_note">note3</td></tr></tbody></table></div></div></div><div class="ui-jqgrid-resize-mark" id="rs_mjqgrid">&nbsp;</div><div id="pjqgrid" class="ui-jqgrid-pager ui-corner-bottom" dir="ltr" style="width: 1038px;"><div id="pg_pjqgrid" class="ui-pager-control" role="group"><table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table" style="width:100%;table-layout:fixed;height:100%;" role="row"><tbody><tr><td id="pjqgrid_left" align="left"><table cellspacing="0" cellpadding="0" border="0" class="ui-pg-table navtable" style="float:left;table-layout:auto;"><tbody><tr><td class="ui-pg-button ui-corner-all" title="" id="del_jqgrid" data-original-title="Delete selected row"><div class="btn btn-sm btn-primary"><span class="fa fa-trash-o"></span></div></td><td class="ui-pg-button ui-state-disabled" style="width:4px;" data-original-title="" title=""><span class="ui-separator"></span></td><td class="ui-pg-button ui-corner-all" title="" id="search_jqgrid" data-original-title="Find records"><div class="btn btn-sm btn-primary"><span class="fa fa-search"></span></div></td><td class="ui-pg-button ui-corner-all" title="" id="refresh_jqgrid" data-original-title="Reload Grid"><div class="btn btn-sm btn-primary"><span class="fa fa-refresh"></span></div></td><td class="ui-pg-button ui-corner-all" id="jqgrid_iladd" title="" data-original-title="Add new row"><div class="btn btn-sm btn-primary"><span class="fa fa-plus"></span></div></td><td class="ui-pg-button ui-corner-all" id="jqgrid_iledit" title="" data-original-title="Edit selected row"><div class="btn btn-sm btn-primary"><span class="fa fa-pencil"></span></div></td><td class="ui-pg-button ui-corner-all ui-state-disabled" id="jqgrid_ilsave" title="" data-original-title="Save row"><div class="btn btn-sm btn-success"><span class="fa fa-save"></span></div></td><td class="ui-pg-button ui-corner-all ui-state-disabled" id="jqgrid_ilcancel" title="" data-original-title="Cancel row editing"><div class="btn btn-sm btn-danger"><span class="fa fa-times"></span></div></td></tr></tbody></table></td><td id="pjqgrid_center" align="center" style="white-space: pre; width: 264px;"><table cellspacing="0" cellpadding="0" border="0" style="table-layout:auto;" class="ui-pg-table"><tbody><tr><td id="first_pjqgrid" class="ui-pg-button ui-corner-all ui-state-disabled"><div class="btn btn-sm btn-default"><span class="fa fa-fast-backward"></span></div></td><td id="prev_pjqgrid" class="ui-pg-button ui-corner-all ui-state-disabled"><div class="btn btn-sm btn-default"><span class="fa fa-backward"></span></div></td><td class="ui-pg-button ui-state-disabled" style="width:4px;"><span class="ui-separator"></span></td><td dir="ltr">Page <input class="ui-pg-input" type="text" size="2" maxlength="7" value="0" role="textbox"> of <span id="sp_1_pjqgrid">2</span></td><td class="ui-pg-button ui-state-disabled" style="width:4px;"><span class="ui-separator"></span></td><td id="next_pjqgrid" class="ui-pg-button ui-corner-all"><div class="btn btn-sm btn-default"><span class="fa fa-forward"></span></div></td><td id="last_pjqgrid" class="ui-pg-button ui-corner-all"><div class="btn btn-sm btn-default"><span class="fa fa-fast-forward"></span></div></td><td dir="ltr"><select class="ui-pg-selbox" role="listbox"><option role="option" value="10" selected="selected">10</option><option role="option" value="20">20</option><option role="option" value="30">30</option></select></td></tr></tbody></table></td><td id="pjqgrid_right" align="right"><div dir="ltr" style="text-align:right" class="ui-paging-info">View 1 - 10 of 18</div></td></tr></tbody></table></div></div></div>


                    <br>
                    <a href="javascript:void(0)" id="m1">Get Selected id's</a><br>
                    <a href="javascript:void(0)" id="m1s">Select(Unselect) row 13</a>

                </article>
                    <!-- WIDGET END -->

            </div>

                <!-- end row -->

        </section>
            <!-- end widget grid -->

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
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/jqgrid.scala.html
                  HASH: 34fe150abd5ed7d9c90cda3f5609c3c4674c2774
                  MATRIX: 511->1|599->20|613->27|693->31|720->32|1120->404|1149->405|1178->406|1223->423|1252->424|1848->992|1877->993|1910->999|1952->1014|1980->1015|2013->1021|2149->1129|2178->1130|2214->1139|2372->1269|2401->1270|2444->1285|2491->1304|2520->1305|2565->1322|2813->1542|2842->1543|2872->1545|2901->1546|2946->1563|3196->1785|3225->1786|3255->1788|3284->1789|3329->1806|3579->2028|3608->2029|3638->2031|3667->2032|3712->2049|3960->2269|3989->2270|4019->2272|4048->2273|4093->2290|4343->2512|4372->2513|4402->2515|4431->2516|4476->2533|4727->2755|4757->2756|4788->2758|4818->2759|4864->2776|5113->2996|5143->2997|5174->2999|5204->3000|5250->3017|5501->3239|5531->3240|5562->3242|5592->3243|5638->3260|5889->3482|5919->3483|5950->3485|5980->3486|6026->3503|6276->3724|6306->3725|6337->3727|6367->3728|6413->3745|6665->3968|6695->3969|6726->3971|6756->3972|6802->3989|7054->4212|7084->4213|7115->4215|7145->4216|7191->4233|7441->4454|7471->4455|7502->4457|7532->4458|7578->4475|7830->4698|7860->4699|7891->4701|7921->4702|7967->4719|8219->4942|8249->4943|8280->4945|8310->4946|8356->4963|8606->5184|8636->5185|8667->5187|8697->5188|8743->5205|8995->5428|9025->5429|9056->5431|9086->5432|9132->5449|9384->5672|9414->5673|9484->5714|9514->5715|9560->5732|9830->5973|9860->5974|9890->5975|9961->6017|9991->6018|10042->6040|10072->6041|10102->6042|10157->6068|10187->6069|10238->6091|10268->6092|10298->6093|10374->6140|10404->6141|10455->6163|10485->6164|10515->6165|10591->6212|10621->6213|10672->6235|10702->6236|10732->6237|10829->6305|10859->6306|10910->6328|10940->6329|10970->6330|11061->6392|11091->6393|11142->6415|11172->6416|11202->6417|11297->6483|11327->6484|11378->6506|11408->6507|11438->6508|11532->6573|11562->6574|11880->6863|11910->6864|11960->6885|12090->6986|12120->6987|12174->7012|13018->7827|13048->7828|13089->7840|13119->7841|13220->7913|13250->7914|13291->7926|13321->7927|13373->7950|13403->7951|13449->7968|13479->7969|13689->8150|13719->8151|13815->8218|13845->8219|13895->8240|14018->8334|14048->8335|14235->8493|14265->8494|14315->8515|14379->8550|14409->8551|14489->8602|14519->8603|14569->8624|14730->8756|14760->8757|14840->8808|14870->8809|14920->8830|15013->8894|15043->8895|17455->11278|17485->11279|17535->11300|17647->11383|17677->11384|17722->11400|17752->11401|17782->11402|17832->11424|17861->11425|17895->11431|18031->18|18060->11528|18089->11530|18120->11551|18161->11553|18194->11558
                  LINES: 19->1|21->2|21->2|23->2|24->3|37->16|37->16|37->16|37->16|37->16|62->41|62->41|63->42|64->43|64->43|65->44|69->48|69->48|70->49|72->51|72->51|75->54|75->54|75->54|76->55|83->62|83->62|83->62|83->62|84->63|91->70|91->70|91->70|91->70|92->71|99->78|99->78|99->78|99->78|100->79|107->86|107->86|107->86|107->86|108->87|115->94|115->94|115->94|115->94|116->95|123->102|123->102|123->102|123->102|124->103|131->110|131->110|131->110|131->110|132->111|139->118|139->118|139->118|139->118|140->119|147->126|147->126|147->126|147->126|148->127|155->134|155->134|155->134|155->134|156->135|163->142|163->142|163->142|163->142|164->143|171->150|171->150|171->150|171->150|172->151|179->158|179->158|179->158|179->158|180->159|187->166|187->166|187->166|187->166|188->167|195->174|195->174|195->174|195->174|196->175|203->182|203->182|203->182|203->182|204->183|211->190|211->190|211->190|211->190|212->191|219->198|219->198|221->200|221->200|222->201|227->206|227->206|227->206|227->206|227->206|228->207|228->207|228->207|228->207|228->207|229->208|229->208|229->208|229->208|229->208|230->209|230->209|230->209|230->209|230->209|231->210|231->210|231->210|231->210|231->210|232->211|232->211|232->211|232->211|232->211|233->212|233->212|233->212|233->212|233->212|234->213|234->213|234->213|234->213|234->213|242->221|242->221|243->222|244->223|244->223|245->224|250->229|250->229|250->229|250->229|251->230|251->230|251->230|251->230|252->231|252->231|253->232|253->232|259->238|259->238|260->239|260->239|261->240|264->243|264->243|267->246|267->246|268->247|269->248|269->248|271->250|271->250|272->251|275->254|275->254|276->255|276->255|277->256|278->257|278->257|318->297|318->297|319->298|320->299|320->299|323->302|323->302|323->302|326->305|326->305|328->307|333->1|334->311|335->312|335->312|335->312|336->313
                  -- GENERATED --
              */
          