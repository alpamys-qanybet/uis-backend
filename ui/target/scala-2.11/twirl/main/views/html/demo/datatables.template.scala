
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
object datatables extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
         */

        // PAGE RELATED SCRIPTS

        // pagefunction
        var pagefunction = function ( ) """),format.raw/*52.41*/("""{"""),format.raw/*52.42*/("""
        """),format.raw/*53.9*/("""//console.log("cleared");

        /* // DOM Position key index //

            l - Length changing (dropdown)
            f - Filtering input (search)
            t - The Table! (datatable)
            i - Information (records)
            p - Pagination (paging)
            r - pRocessing
            < and > - div elements
            <"#id" and > - div with an id
            <"class" and > - div with a class
            <"#id.class" and > - div with an id and class

            Also see: http://legacy.datatables.net/usage/features
        */

        /* BASIC ;*/
        var responsiveHelper_dt_basic = undefined ;
        var responsiveHelper_datatable_fixed_column = undefined ;
        var responsiveHelper_datatable_col_reorder = undefined ;
        var responsiveHelper_datatable_tabletools = undefined ;

        var breakpointDefinition = """),format.raw/*77.36*/("""{"""),format.raw/*77.37*/("""
        """),format.raw/*78.9*/("""tablet : 1024,
        phone : 480
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""" """),format.raw/*80.11*/(""";

        $ ( '#dt_basic' ).dataTable ( """),format.raw/*82.39*/("""{"""),format.raw/*82.40*/("""
        """),format.raw/*83.9*/(""""sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-12 hidden-xs'l>r>" +
        "t" +
        "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
        "autoWidth" : true,
        "preDrawCallback" : function ( ) """),format.raw/*87.42*/("""{"""),format.raw/*87.43*/("""
        """),format.raw/*88.9*/("""// Initialize the responsive datatables helper once.
        if ( ! responsiveHelper_dt_basic ) """),format.raw/*89.44*/("""{"""),format.raw/*89.45*/("""
        """),format.raw/*90.9*/("""responsiveHelper_dt_basic = new ResponsiveDatatablesHelper ( $ ( '#dt_basic' ), breakpointDefinition ) ;
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/(""",
        "rowCallback" : function ( nRow ) """),format.raw/*93.43*/("""{"""),format.raw/*93.44*/("""
        """),format.raw/*94.9*/("""responsiveHelper_dt_basic.createExpandIcon ( nRow ) ;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""",
        "drawCallback" : function ( oSettings ) """),format.raw/*96.49*/("""{"""),format.raw/*96.50*/("""
        """),format.raw/*97.9*/("""responsiveHelper_dt_basic.respond ( ) ;
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/(""" """),format.raw/*99.11*/(""") ;

        /* END BASIC */

        /* COLUMN FILTER  */
        var otable = $ ( '#datatable_fixed_column' ).DataTable ( """),format.raw/*104.66*/("""{"""),format.raw/*104.67*/("""
        """),format.raw/*105.9*/("""//"bFilter": false,
        //"bInfo": false,
        //"bLengthChange": false
        //"bAutoWidth": false,
        //"bPaginate": false,
        //"bStateSave": true // saves sort state using localStorage
        "sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6 hidden-xs'f><'col-sm-6 col-xs-12 hidden-xs'<'toolbar'>>r>" +
        "t" +
        "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
        "autoWidth" : true,
        "preDrawCallback" : function ( ) """),format.raw/*115.42*/("""{"""),format.raw/*115.43*/("""
        """),format.raw/*116.9*/("""// Initialize the responsive datatables helper once.
        if ( ! responsiveHelper_datatable_fixed_column ) """),format.raw/*117.58*/("""{"""),format.raw/*117.59*/("""
        """),format.raw/*118.9*/("""responsiveHelper_datatable_fixed_column = new ResponsiveDatatablesHelper ( $ ( '#datatable_fixed_column' ), breakpointDefinition ) ;
        """),format.raw/*119.9*/("""}"""),format.raw/*119.10*/("""
        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""",
        "rowCallback" : function ( nRow ) """),format.raw/*121.43*/("""{"""),format.raw/*121.44*/("""
        """),format.raw/*122.9*/("""responsiveHelper_datatable_fixed_column.createExpandIcon ( nRow ) ;
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/(""",
        "drawCallback" : function ( oSettings ) """),format.raw/*124.49*/("""{"""),format.raw/*124.50*/("""
        """),format.raw/*125.9*/("""responsiveHelper_datatable_fixed_column.respond ( ) ;
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/("""

        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/(""" """),format.raw/*128.11*/(""") ;

        // custom toolbar
        $ ( "div.toolbar" ).html ( '<div class="text-right"><img src="assets/images/logo.png" alt="SmartAdmin" style="width: 111px; margin-top: 3px; margin-right: 10px;"></div>' ) ;

        // Apply the filter
        $ ( "#datatable_fixed_column thead th input[type=text]" ).on ( 'keyup change', function ( ) """),format.raw/*134.101*/("""{"""),format.raw/*134.102*/("""

        """),format.raw/*136.9*/("""otable
        .column ( $ ( this ).parent ( ).index ( ) + ':visible' )
        .search ( this.value )
        .draw ( ) ;

        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""" """),format.raw/*141.11*/(""") ;
        /* END COLUMN FILTER */

        /* COLUMN SHOW - HIDE */
        $ ( '#datatable_col_reorder' ).dataTable ( """),format.raw/*145.52*/("""{"""),format.raw/*145.53*/("""
        """),format.raw/*146.9*/(""""sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'C>r>" +
        "t" +
        "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
        "autoWidth" : true,
        "preDrawCallback" : function ( ) """),format.raw/*150.42*/("""{"""),format.raw/*150.43*/("""
        """),format.raw/*151.9*/("""// Initialize the responsive datatables helper once.
        if ( ! responsiveHelper_datatable_col_reorder ) """),format.raw/*152.57*/("""{"""),format.raw/*152.58*/("""
        """),format.raw/*153.9*/("""responsiveHelper_datatable_col_reorder = new ResponsiveDatatablesHelper ( $ ( '#datatable_col_reorder' ), breakpointDefinition ) ;
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""
        """),format.raw/*155.9*/("""}"""),format.raw/*155.10*/(""",
        "rowCallback" : function ( nRow ) """),format.raw/*156.43*/("""{"""),format.raw/*156.44*/("""
        """),format.raw/*157.9*/("""responsiveHelper_datatable_col_reorder.createExpandIcon ( nRow ) ;
        """),format.raw/*158.9*/("""}"""),format.raw/*158.10*/(""",
        "drawCallback" : function ( oSettings ) """),format.raw/*159.49*/("""{"""),format.raw/*159.50*/("""
        """),format.raw/*160.9*/("""responsiveHelper_datatable_col_reorder.respond ( ) ;
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""
        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/(""" """),format.raw/*162.11*/(""") ;

        /* END COLUMN SHOW - HIDE */

        /* TABLETOOLS */
        $ ( '#datatable_tabletools' ).dataTable ( """),format.raw/*167.51*/("""{"""),format.raw/*167.52*/("""

        """),format.raw/*169.9*/("""// Tabletools options:
        //   https://datatables.net/extensions/tabletools/button_options
        "sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'T>r>" +
        "t" +
        "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
        "oTableTools" : """),format.raw/*174.25*/("""{"""),format.raw/*174.26*/("""
        """),format.raw/*175.9*/(""""aButtons" :[
        "copy",
        "csv",
        "xls", """),format.raw/*178.16*/("""{"""),format.raw/*178.17*/("""
        """),format.raw/*179.9*/(""""sExtends" : "pdf",
        "sTitle" : "SmartAdmin_PDF",
        "sPdfMessage" : "SmartAdmin PDF Export",
        "sPdfSize" : "letter"
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/(""", """),format.raw/*183.12*/("""{"""),format.raw/*183.13*/("""
        """),format.raw/*184.9*/(""""sExtends" : "print",
        "sMessage" : "Generated by SmartAdmin <i>(press Esc to close)</i>"
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/("""
        """),format.raw/*187.9*/("""],
        "sSwfPath" : "js/plugin/datatables/swf/copy_csv_xls_pdf.swf"
        """),format.raw/*189.9*/("""}"""),format.raw/*189.10*/(""",
        "autoWidth" : true,
        "preDrawCallback" : function ( ) """),format.raw/*191.42*/("""{"""),format.raw/*191.43*/("""
        """),format.raw/*192.9*/("""// Initialize the responsive datatables helper once.
        if ( ! responsiveHelper_datatable_tabletools ) """),format.raw/*193.56*/("""{"""),format.raw/*193.57*/("""
        """),format.raw/*194.9*/("""responsiveHelper_datatable_tabletools = new ResponsiveDatatablesHelper ( $ ( '#datatable_tabletools' ), breakpointDefinition ) ;
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""
        """),format.raw/*196.9*/("""}"""),format.raw/*196.10*/(""",
        "rowCallback" : function ( nRow ) """),format.raw/*197.43*/("""{"""),format.raw/*197.44*/("""
        """),format.raw/*198.9*/("""responsiveHelper_datatable_tabletools.createExpandIcon ( nRow ) ;
        """),format.raw/*199.9*/("""}"""),format.raw/*199.10*/(""",
        "drawCallback" : function ( oSettings ) """),format.raw/*200.49*/("""{"""),format.raw/*200.50*/("""
        """),format.raw/*201.9*/("""responsiveHelper_datatable_tabletools.respond ( ) ;
        """),format.raw/*202.9*/("""}"""),format.raw/*202.10*/("""
        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/(""" """),format.raw/*203.11*/(""") ;

        /* END TABLETOOLS */

        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""" """),format.raw/*207.11*/(""";

        // load related plugins

        loadScript ( "assets/javascripts/plugin/datatables/jquery.dataTables.min.js", function ( ) """),format.raw/*211.100*/("""{"""),format.raw/*211.101*/("""
        """),format.raw/*212.9*/("""loadScript ( "assets/javascripts/plugin/datatables/dataTables.colVis.min.js", function ( ) """),format.raw/*212.100*/("""{"""),format.raw/*212.101*/("""
        """),format.raw/*213.9*/("""loadScript ( "assets/javascripts/plugin/datatables/dataTables.tableTools.min.js", function ( ) """),format.raw/*213.104*/("""{"""),format.raw/*213.105*/("""
        """),format.raw/*214.9*/("""loadScript ( "assets/javascripts/plugin/datatables/dataTables.bootstrap.min.js", function ( ) """),format.raw/*214.103*/("""{"""),format.raw/*214.104*/("""
        """),format.raw/*215.9*/("""loadScript ( "assets/javascripts/plugin/datatable-responsive/datatables.responsive.min.js", pagefunction )
        """),format.raw/*216.9*/("""}"""),format.raw/*216.10*/(""" """),format.raw/*216.11*/(""") ;
        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""" """),format.raw/*217.11*/(""") ;
        """),format.raw/*218.9*/("""}"""),format.raw/*218.10*/(""" """),format.raw/*218.11*/(""") ;
        """),format.raw/*219.9*/("""}"""),format.raw/*219.10*/(""" """),format.raw/*219.11*/(""") ;


        </script>
    """)))};
Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*223.6*/("""
"""),_display_(/*224.2*/main(message, scripts)/*224.24*/ {_display_(Seq[Any](format.raw/*224.26*/("""
    """),format.raw/*225.5*/("""<div id="content" style="opacity : 1 ;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-table fa-fw "></i>
                Table
                <span>&gt;
                    Data Tables
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

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-0" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Standard Data Tables </h2>

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

                                <div id="dt_basic_wrapper" class="dataTables_wrapper form-inline no-footer"><div class="dt-toolbar"><div class="col-xs-12 col-sm-6"><div id="dt_basic_filter" class="dataTables_filter"><label><span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span> <input type="search" class="form-control" aria-controls="dt_basic"></label></div></div><div class="col-sm-6 col-xs-12 hidden-xs"><div class="dataTables_length" id="dt_basic_length"><label><select name="dt_basic_length" aria-controls="dt_basic" class="form-control"><option value="10">
                                    10</option><option value="25">25</option><option value="50">
                                    50</option><option value="100">
                                    100</option></select></label></div></div></div><table id="dt_basic" class="table table-striped table-bordered table-hover dataTable no-footer" width="100%" role="grid" aria-describedby="dt_basic_info" style="width : 100 % ;">
                                    <thead>
                                        <tr role="row"><th data-hide="phone" class="sorting_asc" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-sort="ascending" aria-label="ID: activate to sort column ascending" style="width : 26 px ;">
                                            ID</th><th data-class="expand" class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label=" Name: activate to sort column ascending" style="width : 79 px ;"><i class="fa fa-fw fa-user text-muted hidden-md hidden-sm hidden-xs"></i>
                                            Name</th><th data-hide="phone" class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label=" Phone: activate to sort column ascending" style="width : 114 px ;"><i class="fa fa-fw fa-phone text-muted hidden-md hidden-sm hidden-xs"></i>
                                            Phone</th><th class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label="Company: activate to sort column ascending" style="width : 308 px ;">
                                            Company</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label=" Zip: activate to sort column ascending" style="width : 76 px ;"><i class="fa fa-fw fa-map-marker txt-color-blue hidden-md hidden-sm hidden-xs"></i>
                                            Zip</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label="City: activate to sort column ascending" style="width : 169 px ;">
                                            City</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="dt_basic" rowspan="1" colspan="1" aria-label=" Date: activate to sort column ascending" style="width : 69 px ;"><i class="fa fa-fw fa-calendar txt-color-blue hidden-md hidden-sm hidden-xs"></i>
                                            Date</th></tr>
                                    </thead>
                                    <tbody>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1">1</td>
                                            <td><span class="responsiveExpander"></span>Jennifer</td>
                                            <td>1-342-463-8341</td>
                                            <td>Et Rutrum Non Associates</td>
                                            <td>35728</td>
                                            <td>Fogo</td>
                                            <td>03/04/14</td>
                                        </tr><tr role="row" class="even">
                                        <td class="sorting_1">2</td>
                                        <td><span class="responsiveExpander"></span>Clark</td>
                                        <td>1-516-859-1120</td>
                                        <td>Nam Ac Inc.</td>
                                        <td>7162</td>
                                        <td>Machelen</td>
                                        <td>03/23/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">3</td>
                                        <td><span class="responsiveExpander"></span>Brendan</td>
                                        <td>1-724-406-2487</td>
                                        <td>Enim Commodo Limited</td>
                                        <td>98611</td>
                                        <td>Norman</td>
                                        <td>02/13/14</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">4</td>
                                        <td><span class="responsiveExpander"></span>Warren</td>
                                        <td>1-412-485-9725</td>
                                        <td>Odio Etiam Institute</td>
                                        <td>10312</td>
                                        <td>Sautin</td>
                                        <td>01/01/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">5</td>
                                        <td><span class="responsiveExpander"></span>Rajah</td>
                                        <td>1-849-642-8777</td>
                                        <td>Neque Ltd</td>
                                        <td>29131</td>
                                        <td>Glovertown</td>
                                        <td>02/16/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">6</td>
                                        <td><span class="responsiveExpander"></span>Demetrius</td>
                                        <td>1-470-329-9627</td>
                                        <td>Euismod In Ltd</td>
                                        <td>1883</td>
                                        <td>Kapolei</td>
                                        <td>03/15/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">7</td>
                                        <td><span class="responsiveExpander"></span>Keefe</td>
                                        <td>1-188-191-2346</td>
                                        <td>Molestie Industries</td>
                                        <td>2211BM</td>
                                        <td>Modena</td>
                                        <td>07/08/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">8</td>
                                        <td><span class="responsiveExpander"></span>Leila</td>
                                        <td>1-663-655-8904</td>
                                        <td>Est LLC</td>
                                        <td>75286</td>
                                        <td>Hondelange</td>
                                        <td>12/09/12</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">9</td>
                                        <td><span class="responsiveExpander"></span>Fritz</td>
                                        <td>1-598-234-7837</td>
                                        <td>Et Ultrices Posuere Institute</td>
                                        <td>2324</td>
                                        <td>Monte San Pietrangeli</td>
                                        <td>12/29/12</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">10</td>
                                        <td><span class="responsiveExpander"></span>Cassady</td>
                                        <td>1-212-965-8381</td>
                                        <td>Vitae Erat Vel Company</td>
                                        <td>5898</td>
                                        <td>Huntly</td>
                                        <td>10/07/13</td>
                                    </tr></tbody>
                                </table><div class="dt-toolbar-footer"><div class="col-sm-6 col-xs-12 hidden-xs"><div class="dataTables_info" id="dt_basic_info" role="status" aria-live="polite">
                                    Showing <span class="txt-color-darken">1</span> to <span class="txt-color-darken">
                                    10</span> of <span class="text-primary">100</span>
                                    entries</div></div><div class="col-xs-12 col-sm-6"><div class="dataTables_paginate paging_simple_numbers" id="dt_basic_paginate"><ul class="pagination pagination-sm"><li class="paginate_button previous disabled" aria-controls="dt_basic" tabindex="0" id="dt_basic_previous"><a href="#">
                                    Previous</a></li><li class="paginate_button active" aria-controls="dt_basic" tabindex="0"><a href="#">
                                    1</a></li><li class="paginate_button " aria-controls="dt_basic" tabindex="0"><a href="#">
                                    2</a></li><li class="paginate_button " aria-controls="dt_basic" tabindex="0"><a href="#">
                                    3</a></li><li class="paginate_button " aria-controls="dt_basic" tabindex="0"><a href="#">
                                    4</a></li><li class="paginate_button " aria-controls="dt_basic" tabindex="0"><a href="#">
                                    5</a></li><li class="paginate_button disabled" aria-controls="dt_basic" tabindex="0" id="dt_basic_ellipsis"><a href="#">
                                    …</a></li><li class="paginate_button " aria-controls="dt_basic" tabindex="0"><a href="#">
                                    10</a></li><li class="paginate_button next" aria-controls="dt_basic" tabindex="0" id="dt_basic_next"><a href="#">
                                    Next</a></li></ul></div></div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-1" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Column Filters </h2>

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

                                <div id="datatable_fixed_column_wrapper" class="dataTables_wrapper form-inline no-footer"><div class="dt-toolbar"><div class="col-xs-12 col-sm-6 hidden-xs"><div id="datatable_fixed_column_filter" class="dataTables_filter"><label><span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span> <input type="search" class="form-control" aria-controls="datatable_fixed_column"></label></div></div><div class="col-sm-6 col-xs-12 hidden-xs"><div class="toolbar"><div class="text-right"><img src="assets/images/logo.png" alt="SmartAdmin" style="width : 111 px ; margin-top : 3 px ; margin-right : 10 px ;"></div></div></div></div><table id="datatable_fixed_column" class="table table-striped table-bordered dataTable no-footer" width="100%" role="grid" aria-describedby="datatable_fixed_column_info" style="width : 100 % ;">

                                    <thead>
                                        <tr role="row"><th class="hasinput" style="width : 17 %" rowspan="1" colspan="1">
                                            <input type="text" class="form-control" placeholder="Filter Name">
                                        </th><th class="hasinput" style="width : 18 %" rowspan="1" colspan="1">
                                            <div class="input-group">
                                                <input class="form-control" placeholder="Filter Position" type="text">
                                                <span class="input-group-addon">
                                                    <span class="onoffswitch">
                                                        <input type="checkbox" name="start_interval" class="onoffswitch-checkbox" id="st3">
                                                        <label class="onoffswitch-label" for="st3">
                                                            <span class="onoffswitch-inner" data-swchon-text="YES" data-swchoff-text="NO"></span>
                                                            <span class="onoffswitch-switch"></span>
                                                        </label>
                                                    </span>
                                                </span>
                                            </div>


                                        </th><th class="hasinput" style="width : 16 %" rowspan="1" colspan="1">
                                            <input type="text" class="form-control" placeholder="Filter Office">
                                        </th><th class="hasinput" style="width : 17 %" rowspan="1" colspan="1">
                                            <input type="text" class="form-control" placeholder="Filter Age">
                                        </th><th class="hasinput icon-addon" rowspan="1" colspan="1">
                                            <input id="dateselect_filter" type="text" placeholder="Filter Date" class="form-control datepicker hasDatepicker" data-dateformat="yy/mm/dd">
                                            <label for="dateselect_filter" class="glyphicon glyphicon-calendar no-margin padding-top-15" rel="tooltip" title="" data-original-title="Filter Date"></label>
                                        </th><th class="hasinput" style="width : 16 %" rowspan="1" colspan="1">
                                            <input type="text" class="form-control" placeholder="Filter Salary">
                                        </th></tr>
                                        <tr role="row"><th data-class="expand" class="sorting_asc" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column ascending" style="width : 148 px ;">
                                            Name</th><th class="sorting" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width : 158 px ;">
                                            Position</th><th data-hide="phone" class="sorting" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width : 137 px ;">
                                            Office</th><th data-hide="phone" class="sorting" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" ari"""),
format.raw("""a-label="Age: activate to sort column ascending" style="width : 148 px ;">
                                            Age</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width : 140 px ;">
                                            Start date</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_fixed_column" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width : 138 px ;">
                                            Salary</th></tr>
                                    </thead>

                                    <tbody>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1"><span class="responsiveExpander"></span>Airi Satou</td>
                                            <td>Accountant</td>
                                            <td>Tokyo</td>
                                            <td>33</td>
                                            <td>2008/11/28</td>
                                            <td>$162,700</td>
                                        </tr><tr role="row" class="even">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Angelica Ramos</td>
                                        <td>Chief Executive Officer (CEO)</td>
                                        <td>London</td>
                                        <td>47</td>
                                        <td>2014/10/09</td>
                                        <td>$1,200,000</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Ashton Cox</td>
                                        <td>Junior Technical Author</td>
                                        <td>San Francisco</td>
                                        <td>66</td>
                                        <td>2014/01/12</td>
                                        <td>$86,000</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Bradley Greer</td>
                                        <td>Software Engineer</td>
                                        <td>London</td>
                                        <td>41</td>
                                        <td>2012/10/13</td>
                                        <td>$132,000</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Brenden Wagner</td>
                                        <td>Software Engineer</td>
                                        <td>San Francisco</td>
                                        <td>28</td>
                                        <td>2011/06/07</td>
                                        <td>$206,850</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>
                                            Brielle Williamson</td>
                                        <td>Integration Specialist</td>
                                        <td>New York</td>
                                        <td>61</td>
                                        <td>2012/12/02</td>
                                        <td>$372,000</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Bruno Nash</td>
                                        <td>Software Engineer</td>
                                        <td>London</td>
                                        <td>38</td>
                                        <td>2011/05/03</td>
                                        <td>$163,500</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Caesar Vance</td>
                                        <td>Pre-Sales Support</td>
                                        <td>New York</td>
                                        <td>21</td>
                                        <td>2011/12/12</td>
                                        <td>$106,450</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Cara Stevens</td>
                                        <td>Sales Assistant</td>
                                        <td>New York</td>
                                        <td>46</td>
                                        <td>2011/12/06</td>
                                        <td>$145,600</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1"><span class="responsiveExpander"></span>Cedric Kelly</td>
                                        <td>Senior Javascript Developer</td>
                                        <td>Edinburgh</td>
                                        <td>22</td>
                                        <td>2012/03/29</td>
                                        <td>$433,060</td>
                                    </tr></tbody>

                                </table><div class="dt-toolbar-footer"><div class="col-sm-6 col-xs-12 hidden-xs"><div class="dataTables_info" id="datatable_fixed_column_info" role="status" aria-live="polite">
                                    Showing <span class="txt-color-darken">1</span> to <span class="txt-color-darken">
                                    10</span> of <span class="text-primary">57</span>
                                    entries</div></div><div class="col-xs-12 col-sm-6"><div class="dataTables_paginate paging_simple_numbers" id="datatable_fixed_column_paginate"><ul class="pagination pagination-sm"><li class="paginate_button previous disabled" aria-controls="datatable_fixed_column" tabindex="0" id="datatable_fixed_column_previous"><a href="#">
                                    Previous</a></li><li class="paginate_button active" aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    1</a></li><li class="paginate_button " aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    2</a></li><li class="paginate_button " aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    3</a></li><li class="paginate_button " aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    4</a></li><li class="paginate_button " aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    5</a></li><li class="paginate_button " aria-controls="datatable_fixed_column" tabindex="0"><a href="#">
                                    6</a></li><li class="paginate_button next" aria-controls="datatable_fixed_column" tabindex="0" id="datatable_fixed_column_next"><a href="#">
                                    Next</a></li></ul></div></div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-2" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Hide / Show Columns </h2>

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

                                <div id="datatable_col_reorder_wrapper" class="dataTables_wrapper form-inline no-footer"><div class="dt-toolbar"><div class="col-xs-12 col-sm-6"><div id="datatable_col_reorder_filter" class="dataTables_filter"><label><span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span> <input type="search" class="form-control" aria-controls="datatable_col_reorder"></label></div></div><div class="col-sm-6 col-xs-6 hidden-xs"><div class="ColVis"><button class="ColVis_Button ColVis_MasterButton"><span>
                                    Show / hide columns</span></button></div></div></div><table id="datatable_col_reorder" class="table table-striped table-bordered table-hover dataTable no-footer" width="100%" role="grid" aria-describedby="datatable_col_reorder_info" style="width : 100 % ;">
                                    <thead>
                                        <tr role="row"><th data-hide="phone" class="sorting_asc" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-sort="ascending" aria-label="ID: activate to sort column ascending" style="width : 26 px ;">
                                            ID</th><th data-class="expand" class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="Name: activate to sort column ascending" style="width : 74 px ;">
                                            Name</th><th class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="Phone: activate to sort column ascending" style="width : 115 px ;">
                                            Phone</th><th data-hide="phone" class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="Company: activate to sort column ascending" style="width : 311 px ;">
                                            Company</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="Zip: activate to sort column ascending" style="width : 77 px ;">
                                            Zip</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="City: activate to sort column ascending" style="width : 170 px ;">
                                            City</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_col_reorder" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width : 68 px ;">
                                            Date</th></tr>
                                    </thead>
                                    <tbody>


                                        <tr role="row" class="odd">
                                            <td class="sorting_1">1</td>
                                            <td><span class="responsiveExpander"></span>Jennifer</td>
                                            <td>1-342-463-8341</td>
                                            <td>Et Rutrum Non Associates</td>
                                            <td>35728</td>
                                            <td>Fogo</td>
                                            <td>03/04/14</td>
                                        </tr><tr role="row" class="even">
                                        <td class="sorting_1">2</td>
                                        <td><span class="responsiveExpander"></span>Clark</td>
                                        <td>1-516-859-1120</td>
                                        <td>Nam Ac Inc.</td>
                                        <td>7162</td>
                                        <td>Machelen</td>
                                        <td>03/23/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">3</td>
                                        <td><span class="responsiveExpander"></span>Brendan</td>
                                        <td>1-724-406-2487</td>
                                        <td>Enim Commodo Limited</td>
                                        <td>98611</td>
                                        <td>Norman</td>
                                        <td>02/13/14</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">4</td>
                                        <td><span class="responsiveExpander"></span>Warren</td>
                                        <td>1-412-485-9725</td>
                                        <td>Odio Etiam Institute</td>
                                        <td>10312</td>
                                        <td>Sautin</td>
                                        <td>01/01/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">5</td>
                                        <td><span class="responsiveExpander"></span>Rajah</td>
                                        <td>1-849-642-8777</td>
                                        <td>Neque Ltd</td>
                                        <td>29131</td>
                                        <td>Glovertown</td>
                                        <td>02/16/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">6</td>
                                        <td><span class="responsiveExpander"></span>Demetrius</td>
                                        <td>1-470-329-9627</td>
                                        <td>Euismod In Ltd</td>
                                        <td>1883</td>
                                        <td>Kapolei</td>
                                        <td>03/15/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">7</td>
                                        <td><span class="responsiveExpander"></span>Keefe</td>
                                        <td>1-188-191-2346</td>
                                        <td>Molestie Industries</td>
                                        <td>2211BM</td>
                                        <td>Modena</td>
                                        <td>07/08/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">8</td>
                                        <td><span class="responsiveExpander"></span>Leila</td>
                                        <td>1-663-655-8904</td>
                                        <td>Est LLC</td>
                                        <td>75286</td>
                                        <td>Hondelange</td>
                                        <td>12/09/12</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">9</td>
                                        <td><span class="responsiveExpander"></span>Fritz</td>
                                        <td>1-598-234-7837</td>
                                        <td>Et Ultrices Posuere Institute</td>
                                        <td>2324</td>
                                        <td>Monte San Pietrangeli</td>
                                        <td>12/29/12</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">10</td>
                                        <td><span class="responsiveExpander"></span>Cassady</td>
                                        <td>1-212-965-8381</td>
                                        <td>Vitae Erat Vel Company</td>
                                        <td>5898</td>
                                        <td>Huntly</td>
                                        <td>10/07/13</td>
                                    </tr></tbody>
                                </table><div class="dt-toolbar-footer"><div class="col-sm-6 col-xs-12 hidden-xs"><div class="dataTables_info" id="datatable_col_reorder_info" role="status" aria-live="polite">
                                    Showing <span class="txt-color-darken">1</span> to <span class="txt-color-darken">
                                    10</span> of <span class="text-primary">100</span>
                                    entries</div></div><div class="col-sm-6 col-xs-12"><div class="dataTables_paginate paging_simple_numbers" id="datatable_col_reorder_paginate"><ul class="pagination pagination-sm"><li class="paginate_button previous disabled" aria-controls="datatable_col_reorder" tabindex="0" id="datatable_col_reorder_previous"><a href="#">
                                    Previous</a></li><li class="paginate_button active" aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    1</a></li><li class="paginate_button " aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    2</a></li><li class="paginate_button " aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    3</a></li><li class="paginate_button " aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    4</a></li><li class="paginate_button " aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    5</a></li><li class="paginate_button disabled" aria-controls="datatable_col_reorder" tabindex="0" id="datatable_col_reorder_ellipsis"><a href="#">
                                    …</a></li><li class="paginate_button " aria-controls="datatable_col_reorder" tabindex="0"><a href="#">
                                    10</a></li><li class="paginate_button next" aria-controls="datatable_col_reorder" tabindex="0" id="datatable_col_reorder_next"><a href="#">
                                    Next</a></li></ul></div></div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-3" data-widget-editbutton="false">
                        """),
format.raw("""    <!-- widget options:
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
                            <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                            <h2>Export to PDF / Excel</h2>

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

                                <div id="datatable_tabletools_wrapper" class="dataTables_wrapper form-inline no-footer"><div class="dt-toolbar"><div class="col-xs-12 col-sm-6"><div id="datatable_tabletools_filter" class="dataTables_filter"><label><span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span> <input type="search" class="form-control" aria-controls="datatable_tabletools"></label></div></div><div class="col-sm-6 col-xs-6 hidden-xs"><div class="DTTT btn-group"><a class="btn btn-default DTTT_button_copy" id="ToolTables_datatable_tabletools_0"><span>
                                    Copy</span><div style="position : absolute ; left : 0px ; top : 0px ; width : 54px ; height : 31px ; z-index : 99 ;"><embed id="ZeroClipboard_TableToolsMovie_1" src="assets/javascripts/plugin/datatables/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="54" height="31" name="ZeroClipboard_TableToolsMovie_1" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=1&amp;width=54&amp;height=31" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_csv" id="ToolTables_datatable_tabletools_1"><span>
                                    CSV</span><div style="position : absolute ; left : 0px ; top : 0px ; width : 48px ; height : 31px ; z-index : 99 ;"><embed id="ZeroClipboard_TableToolsMovie_2" src="assets/javascripts/plugin/datatables/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="48" height="31" name="ZeroClipboard_TableToolsMovie_2" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=2&amp;width=48&amp;height=31" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_xls" id="ToolTables_datatable_tabletools_2"><span>
                                    Excel</span><div style="position : absolute ; left : 0px ; top : 0px ; width : 55 x ; height : 31px ; z-index : 99 ;"><embed id="ZeroClipboard_TableToolsMovie_3" src="assets/javascripts/plugin/datatables/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="55" height="31" name="ZeroClipboard_TableToolsMovie_3" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=3&amp;width=55&amp;height=31" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_pdf" id="ToolTables_datatable_tabletools_3"><span>
                                    PDF</span><div style="position : absolute ; left : 0px ; top :0px ; width : 48px ; height : 31px ; z-index : 99 ;"><embed id="ZeroClipboard_TableToolsMovie_4" src="assets/javascripts/plugin/datatables/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="48" height="31" name="ZeroClipboard_TableToolsMovie_4" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=4&amp;width=48&amp;height=31" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_print" id="ToolTables_datatable_tabletools_4" title="View print view"><span>
                                    Print</span></a></div></div></div><table id="datatable_tabletools" class="table table-striped table-bordered table-hover dataTable no-footer" width="100%" role="grid" aria-describedby="datatable_tabletools_info" style="width : 100 % ;">
                                    <thead>
                                        <tr role="row"><th data-hide="phone" class="sorting_asc" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-sort="ascending" aria-label="ID: activate to sort column ascending" style="width : 26 px ;">
                                            ID</th><th data-class="expand" class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Name: activate to sort column ascending" style="width : 74 px ;">
                                            Name</th><th class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Phone: activate to sort column ascending" style="width : 115 px ;">
                                            Phone</th><th data-hide="phone" class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Company: activate to sort column ascending" style="width : 311 px ;">
                                            Company</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Zip: activate to sort column ascending" style="width : 77 px ;">
                                            Zip</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="City: activate to sort column ascending" style="width : 170 px ;">
                                            City</th><th data-hide="phone,tablet" class="sorting" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width : 68 px ;">
                                            Date</th></tr>
                                    </thead>
                                    <tbody>
                                        <tr role="row" class="odd">
                                            <td class="sorting_1">1</td>
                                            <td><span class="responsiveExpander"></span>Jennifer</td>
                                            <td>1-342-463-8341</td>
                                            <td>Et Rutrum Non Associates</td>
                                            <td>35728</td>
                                            <td>Fogo</td>
                                            <td>03/04/14</td>
                                        </tr><tr role="row" class="even">
                                        <td class="sorting_1">2</td>
                                        <td><span class="responsiveExpander"></span>Clark</td>
                                        <td>1-516-859-1120</td>
                                        <td>Nam Ac Inc.</td>
                                        <td>7162</td>
                                        <td>Machelen</td>
                                        <td>03/23/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">3</td>
                                        <td><span class="responsiveExpander"></span>Brendan</td>
                                        <td>1-724-406-2487</td>
                                        <td>Enim Commodo Limited</td>
                                        <td>98611</td>
                                        <td>Norman</td>
                                        <td>02/13/14</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">4</td>
                                        <td><span class="responsiveExpander"></span>Warren</td>
                                        <td>1-412-485-9725</td>
                                        <td>Odio Etiam Institute</td>
                                        <td>10312</td>
                                        <td>Sautin</td>
                                        <td>01/01/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">5</td>
                                        <td><span class="responsiveExpander"></span>Rajah</td>
                                        <td>1-849-642-8777</td>
                                        <td>Neque Ltd</td>
                                        <td>29131</td>
                                        <td>Glovertown</td>
                                        <td>02/16/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">6</td>
                                        <td><span class="responsiveExpander"></span>Demetrius</td>
                                        <td>1-470-329-9627</td>
                                        <td>Euismod In Ltd</td>
                                        <td>1883</td>
                                        <td>Kapolei</td>
                                        <td>03/15/13</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">7</td>
                                        <td><span class="responsiveExpander"></span>Keefe</td>
                                        <td>1-188-191-2346</td>
                                        <td>Molestie Industries</td>
                                        <td>2211BM</td>
                                        <td>Modena</td>
                                        <td>07/08/13</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">8</td>
                                        <td><span class="responsiveExpander"></span>Leila</td>
                                        <td>1-663-655-8904</td>
                                        <td>Est LLC</td>
                                        <td>75286</td>
                                        <td>Hondelange</td>
                                        <td>12/09/12</td>
                                    </tr><tr role="row" class="odd">
                                        <td class="sorting_1">9</td>
                                        <td><span class="responsiveExpander"></span>Fritz</td>
                                        <td>1-598-234-7837</td>
                                        <td>Et Ultrices Posuere Institute</td>
                                        <td>2324</td>
                                        <td>Monte San Pietrangeli</td>
                                        <td>12/29/12</td>
                                    </tr><tr role="row" class="even">
                                        <td class="sorting_1">10</td>
                                        <td><span class="responsiveExpander"></span>Cassady</td>
                                        <td>1-212-965-8381</td>
                                        <td>Vitae Erat Vel Company</td>
                                        <td>5898</td>
                                        <td>Huntly</td>
                                        <td>10/07/13</td>
                                    </tr></tbody>
                                </table><div class="dt-toolbar-footer"><div class="col-sm-6 col-xs-12 hidden-xs"><div class="dataTables_info" id="datatable_tabletools_info" role="status" aria-live="polite">
                                    Showing <span class="txt-color-darken">1</span> to <span class="txt-color-darken">
                                    10</span> of <span class="text-primary">100</span>
                                    entries</div></div><div class="col-sm-6 col-xs-12"><div class="dataTables_paginate paging_simple_numbers" id="datatable_tabletools_paginate"><ul class="pagination pagination-sm"><li class="paginate_button previous disabled" aria-controls="datatable_tabletools" tabindex="0" id="datatable_tabletools_previous"><a href="#">
                                    Previous</a></li><li class="paginate_button active" aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    1</a></li><li class="paginate_button " aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    2</a></li><li class="paginate_button " aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    3</a></li><li class="paginate_button " aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    4</a></li><li class="paginate_button " aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    5</a></li><li class="paginate_button disabled" aria-controls="datatable_tabletools" tabindex="0" id="datatable_tabletools_ellipsis"><a href="#">
                                    …</a></li><li class="paginate_button " aria-controls="datatable_tabletools" tabindex="0"><a href="#">
                                    10</a></li><li class="paginate_button next" aria-controls="datatable_tabletools" tabindex="0" id="datatable_tabletools_next"><a href="#">
                                    Next</a></li></ul></div></div></div></div>

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
                  DATE: Thu Aug 28 21:08:57 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/datatables.scala.html
                  HASH: baf5e97ea1f3478d52e1924e809e9454e751ae66
                  MATRIX: 515->1|603->24|618->31|698->35|734->45|1182->465|1211->466|1240->467|1285->484|1314->485|2005->1148|2034->1149|2072->1159|2119->1178|2148->1179|2186->1189|2393->1368|2422->1369|2458->1378|3342->2234|3371->2235|3407->2244|3477->2287|3506->2288|3535->2289|3604->2330|3633->2331|3669->2340|3954->2597|3983->2598|4019->2607|4143->2703|4172->2704|4208->2713|4348->2826|4377->2827|4413->2836|4442->2837|4514->2881|4543->2882|4579->2891|4668->2953|4697->2954|4775->3004|4804->3005|4840->3014|4915->3062|4944->3063|4980->3072|5009->3073|5038->3074|5191->3198|5221->3199|5258->3208|5780->3701|5810->3702|5847->3711|5986->3821|6016->3822|6053->3831|6222->3972|6252->3973|6289->3982|6319->3983|6392->4027|6422->4028|6459->4037|6563->4113|6593->4114|6672->4164|6702->4165|6739->4174|6829->4236|6859->4237|6897->4247|6927->4248|6957->4249|7329->4591|7360->4592|7398->4602|7558->4734|7588->4735|7618->4736|7768->4857|7798->4858|7835->4867|8120->5123|8150->5124|8187->5133|8325->5242|8355->5243|8392->5252|8559->5391|8589->5392|8626->5401|8656->5402|8729->5446|8759->5447|8796->5456|8899->5531|8929->5532|9008->5582|9038->5583|9075->5592|9164->5653|9194->5654|9231->5663|9261->5664|9291->5665|9438->5783|9468->5784|9506->5794|9850->6109|9880->6110|9917->6119|10006->6179|10036->6180|10073->6189|10245->6333|10275->6334|10306->6336|10336->6337|10373->6346|10506->6451|10536->6452|10573->6461|10681->6541|10711->6542|10811->6613|10841->6614|10878->6623|11015->6731|11045->6732|11082->6741|11247->6878|11277->6879|11314->6888|11344->6889|11417->6933|11447->6934|11484->6943|11586->7017|11616->7018|11695->7068|11725->7069|11762->7078|11850->7138|11880->7139|11917->7148|11947->7149|11977->7150|12048->7193|12078->7194|12108->7195|12273->7330|12304->7331|12341->7340|12462->7431|12493->7432|12530->7441|12655->7536|12686->7537|12723->7546|12847->7640|12878->7641|12915->7650|13058->7765|13088->7766|13118->7767|13158->7779|13188->7780|13218->7781|13258->7793|13288->7794|13318->7795|13358->7807|13388->7808|13418->7809|13486->18|13519->7838|13548->7840|13580->7862|13621->7864|13654->7869
                  LINES: 19->1|21->2|21->2|23->2|25->4|38->17|38->17|38->17|38->17|38->17|63->42|63->42|64->43|65->44|65->44|66->45|73->52|73->52|74->53|98->77|98->77|99->78|101->80|101->80|101->80|103->82|103->82|104->83|108->87|108->87|109->88|110->89|110->89|111->90|112->91|112->91|113->92|113->92|114->93|114->93|115->94|116->95|116->95|117->96|117->96|118->97|119->98|119->98|120->99|120->99|120->99|125->104|125->104|126->105|136->115|136->115|137->116|138->117|138->117|139->118|140->119|140->119|141->120|141->120|142->121|142->121|143->122|144->123|144->123|145->124|145->124|146->125|147->126|147->126|149->128|149->128|149->128|155->134|155->134|157->136|162->141|162->141|162->141|166->145|166->145|167->146|171->150|171->150|172->151|173->152|173->152|174->153|175->154|175->154|176->155|176->155|177->156|177->156|178->157|179->158|179->158|180->159|180->159|181->160|182->161|182->161|183->162|183->162|183->162|188->167|188->167|190->169|195->174|195->174|196->175|199->178|199->178|200->179|204->183|204->183|204->183|204->183|205->184|207->186|207->186|208->187|210->189|210->189|212->191|212->191|213->192|214->193|214->193|215->194|216->195|216->195|217->196|217->196|218->197|218->197|219->198|220->199|220->199|221->200|221->200|222->201|223->202|223->202|224->203|224->203|224->203|228->207|228->207|228->207|232->211|232->211|233->212|233->212|233->212|234->213|234->213|234->213|235->214|235->214|235->214|236->215|237->216|237->216|237->216|238->217|238->217|238->217|239->218|239->218|239->218|240->219|240->219|240->219|245->1|246->223|247->224|247->224|247->224|248->225
                  -- GENERATED --
              */
          