
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.6*/scripts/*2.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.17*/("""
        """),format.raw/*3.9*/("""<script type="text/javascript">
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
         * $("[rel=popover-hover]").popover("""),format.raw/*15.45*/("""{"""),format.raw/*15.46*/(""" """),format.raw/*15.47*/("""trigger: "hover" """),format.raw/*15.64*/("""}"""),format.raw/*15.65*/(""");
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
         * PAGE RELATED SCRIPTS
         */

        // pagefunction

        var pagefunction = function ( ) """),format.raw/*42.41*/("""{"""),format.raw/*42.42*/("""

        """),format.raw/*44.9*/("""$ ( ".js-status-update a" ).click ( function ( ) """),format.raw/*44.58*/("""{"""),format.raw/*44.59*/("""
        """),format.raw/*45.9*/("""var selText = $ ( this ).text ( ) ;
        var $this = $ ( this ) ;
        $this.parents ( '.btn-group' ).find ( '.dropdown-toggle' ).html ( selText + ' <span class="caret"></span>' ) ;
        $this.parents ( '.dropdown-menu' ).find ( 'li' ).removeClass ( 'active' ) ;
        $this.parent ( ).addClass ( 'active' ) ;
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""" """),format.raw/*50.11*/(""") ;

        /*
         * TODO: add a way to add more todo's to list
         */

        // initialize sortable

        $ ( "#sortable1, #sortable2" ).sortable ( """),format.raw/*58.51*/("""{"""),format.raw/*58.52*/("""
        """),format.raw/*59.9*/("""handle : '.handle',
        connectWith : ".todo",
        update : countTasks
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""" """),format.raw/*62.11*/(""").disableSelection ( ) ;


        // check and uncheck
        $ ( '.todo .checkbox > input[type="checkbox"]' ).click ( function ( ) """),format.raw/*66.79*/("""{"""),format.raw/*66.80*/("""
        """),format.raw/*67.9*/("""var $this = $ ( this ).parent ( ).parent ( ).parent ( ) ;

        if ( $ ( this ).prop ( 'checked' ) ) """),format.raw/*69.46*/("""{"""),format.raw/*69.47*/("""
        """),format.raw/*70.9*/("""$this.addClass ( "complete" ) ;

        // remove this if you want to undo a check list once checked
        //$(this).attr("disabled", true);
        $ ( this ).parent ( ).hide ( ) ;

        // once clicked - add class, copy to memory then remove and add to sortable3
        $this.slideUp ( 500, function ( ) """),format.raw/*77.43*/("""{"""),format.raw/*77.44*/("""
        """),format.raw/*78.9*/("""$this.clone ( ).prependTo ( "#sortable3" ).effect ( "highlight", """),format.raw/*78.74*/("""{"""),format.raw/*78.75*/(""" """),format.raw/*78.76*/("""}"""),format.raw/*78.77*/(""", 800 ) ;
        $this.remove ( ) ;
        countTasks ( ) ;
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/(""" """),format.raw/*81.11*/(""") ;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""" """),format.raw/*82.11*/("""else """),format.raw/*82.16*/("""{"""),format.raw/*82.17*/("""
        """),format.raw/*83.9*/("""// insert undo code here...
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""

        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/(""" """),format.raw/*86.11*/(""")
        // count tasks
        function countTasks ( ) """),format.raw/*88.33*/("""{"""),format.raw/*88.34*/("""

        """),format.raw/*90.9*/("""$ ( '.todo-group-title' ).each ( function ( ) """),format.raw/*90.55*/("""{"""),format.raw/*90.56*/("""
        """),format.raw/*91.9*/("""var $this = $ ( this ) ;
        $this.find ( ".num-of-tasks" ).text ( $this.next ( ).find ( "li" ).size ( ) ) ;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/(""" """),format.raw/*93.11*/(""") ;

        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""

        """),format.raw/*97.9*/("""/*
         * RUN PAGE GRAPHS
         */

        // Load FLOAT dependencies (related to page)
        loadScript ( "assets/javascripts/plugin/flot/jquery.flot.cust.js", loadFlotResize ) ;

        function loadFlotResize ( ) """),format.raw/*104.37*/("""{"""),format.raw/*104.38*/("""
        """),format.raw/*105.9*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.resize.js", loadFlotToolTip ) ;
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/("""

        """),format.raw/*108.9*/("""function loadFlotToolTip ( ) """),format.raw/*108.38*/("""{"""),format.raw/*108.39*/("""
        """),format.raw/*109.9*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.tooltip.js", generatePageGraphs ) ;
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""

        """),format.raw/*112.9*/("""function generatePageGraphs ( ) """),format.raw/*112.41*/("""{"""),format.raw/*112.42*/("""

        """),format.raw/*114.9*/("""/* TAB 1: UPDATING CHART */
        // For the demo we use generated data, but normally it would be coming from the server

        var data =[ ],
        totalPoints = 200,
        $UpdatingChartColors = $ ( "#updating-chart" ).css ( 'color' ) ;

        function getRandomData ( ) """),format.raw/*121.36*/("""{"""),format.raw/*121.37*/("""
        """),format.raw/*122.9*/("""if ( data.length > 0 )
        data = data.slice ( 1 ) ;

        // do a random walk
        while ( data.length < totalPoints ) """),format.raw/*126.45*/("""{"""),format.raw/*126.46*/("""
        """),format.raw/*127.9*/("""var prev = data.length > 0 ? data[ data.length - 1 ] : 50 ;
        var y = prev + Math.random ( ) * 10 - 5 ;
        if ( y < 0 )
        y = 0 ;
        if ( y > 100 )
        y = 100 ;
        data.push ( y ) ;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""

        """),format.raw/*136.9*/("""// zip the generated y values with the x values
        var res =[ ] ;
        for ( var i = 0 ; i < data.length ; ++ i )
        res.push ([ i, data[ i ] ] )
        return res ;
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""

        """),format.raw/*143.9*/("""// setup control widget
        var updateInterval = 1500 ;
        $ ( "#updating-chart" ).val ( updateInterval ).change ( function ( ) """),format.raw/*145.78*/("""{"""),format.raw/*145.79*/("""

        """),format.raw/*147.9*/("""var v = $ ( this ).val ( ) ;
        if ( v && ! isNaN ( + v ) ) """),format.raw/*148.37*/("""{"""),format.raw/*148.38*/("""
        """),format.raw/*149.9*/("""updateInterval = + v ;
        $ ( this ).val ( "" + updateInterval ) ;
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/("""

        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/(""" """),format.raw/*153.11*/(""") ;

        // setup plot
        var options = """),format.raw/*156.23*/("""{"""),format.raw/*156.24*/("""
        """),format.raw/*157.9*/("""yaxis : """),format.raw/*157.17*/("""{"""),format.raw/*157.18*/("""
        """),format.raw/*158.9*/("""min : 0,
        max : 100
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/(""",
        xaxis : """),format.raw/*161.17*/("""{"""),format.raw/*161.18*/("""
        """),format.raw/*162.9*/("""min : 0,
        max : 100
        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/(""",
        colors :[ $UpdatingChartColors ],
        series : """),format.raw/*166.18*/("""{"""),format.raw/*166.19*/("""
        """),format.raw/*167.9*/("""lines : """),format.raw/*167.17*/("""{"""),format.raw/*167.18*/("""
        """),format.raw/*168.9*/("""lineWidth : 1,
        fill : true,
        fillColor : """),format.raw/*170.21*/("""{"""),format.raw/*170.22*/("""
        """),format.raw/*171.9*/("""colors :[ """),format.raw/*171.19*/("""{"""),format.raw/*171.20*/("""
        """),format.raw/*172.9*/("""opacity : 0.4
        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/(""", """),format.raw/*173.12*/("""{"""),format.raw/*173.13*/("""
        """),format.raw/*174.9*/("""opacity : 0
        """),format.raw/*175.9*/("""}"""),format.raw/*175.10*/(""" """),format.raw/*175.11*/("""]
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/(""",
        steps : false

        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/("""
        """),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""
        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/(""" """),format.raw/*181.11*/(""";

        var plot = $.plot ( $ ( "#updating-chart" ), [ getRandomData ( ) ], options ) ;

        /* live switch */
        $ ( 'input[type="checkbox"]#start_interval' ).click ( function ( ) """),format.raw/*186.76*/("""{"""),format.raw/*186.77*/("""
        """),format.raw/*187.9*/("""if ( $ ( this ).prop ( 'checked' ) ) """),format.raw/*187.46*/("""{"""),format.raw/*187.47*/("""
        """),format.raw/*188.9*/("""$on = true ;
        updateInterval = 1500 ;
        update ( ) ;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/(""" """),format.raw/*191.11*/("""else """),format.raw/*191.16*/("""{"""),format.raw/*191.17*/("""
        """),format.raw/*192.9*/("""clearInterval ( updateInterval ) ;
        $on = false ;
        """),format.raw/*194.9*/("""}"""),format.raw/*194.10*/("""
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/(""" """),format.raw/*195.11*/(""") ;

        function update ( ) """),format.raw/*197.29*/("""{"""),format.raw/*197.30*/("""
        """),format.raw/*198.9*/("""if ( $on == true ) """),format.raw/*198.28*/("""{"""),format.raw/*198.29*/("""
        """),format.raw/*199.9*/("""plot.setData ([ getRandomData ( ) ] ) ;
        plot.draw ( ) ;
        setTimeout ( update, updateInterval ) ;

        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/(""" """),format.raw/*203.11*/("""else """),format.raw/*203.16*/("""{"""),format.raw/*203.17*/("""
        """),format.raw/*204.9*/("""clearInterval ( updateInterval )
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/("""

        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/("""

        """),format.raw/*209.9*/("""var $on = false ;

        /*end updating chart*/

        /* TAB 2: Social Network  */

        $ ( function ( ) """),format.raw/*215.26*/("""{"""),format.raw/*215.27*/("""
        """),format.raw/*216.9*/("""// jQuery Flot Chart
        var twitter =[
        [ 1, 27 ],
        [ 2, 34 ],
        [ 3, 51 ],
        [ 4, 48 ],
        [ 5, 55 ],
        [ 6, 65 ],
        [ 7, 61 ],
        [ 8, 70 ],
        [ 9, 65 ],
        [ 10, 75 ],
        [ 11, 57 ],
        [ 12, 59 ],
        [ 13, 62 ]
        ],
        facebook =[
        [ 1, 25 ],
        [ 2, 31 ],
        [ 3, 45 ],
        [ 4, 37 ],
        [ 5, 38 ],
        [ 6, 40 ],
        [ 7, 47 ],
        [ 8, 55 ],
        [ 9, 43 ],
        [ 10, 50 ],
        [ 11, 47 ],
        [ 12, 39 ],
        [ 13, 47 ]
        ],
        data =[ """),format.raw/*247.17*/("""{"""),format.raw/*247.18*/("""
        """),format.raw/*248.9*/("""label : "Twitter",
        data : twitter,
        lines : """),format.raw/*250.17*/("""{"""),format.raw/*250.18*/("""
        """),format.raw/*251.9*/("""show : true,
        lineWidth : 1,
        fill : true,
        fillColor : """),format.raw/*254.21*/("""{"""),format.raw/*254.22*/("""
        """),format.raw/*255.9*/("""colors :[ """),format.raw/*255.19*/("""{"""),format.raw/*255.20*/("""
        """),format.raw/*256.9*/("""opacity : 0.1
        """),format.raw/*257.9*/("""}"""),format.raw/*257.10*/(""", """),format.raw/*257.12*/("""{"""),format.raw/*257.13*/("""
        """),format.raw/*258.9*/("""opacity : 0.13
        """),format.raw/*259.9*/("""}"""),format.raw/*259.10*/(""" """),format.raw/*259.11*/("""]
        """),format.raw/*260.9*/("""}"""),format.raw/*260.10*/("""
        """),format.raw/*261.9*/("""}"""),format.raw/*261.10*/(""",
        points : """),format.raw/*262.18*/("""{"""),format.raw/*262.19*/("""
        """),format.raw/*263.9*/("""show : true
        """),format.raw/*264.9*/("""}"""),format.raw/*264.10*/("""
        """),format.raw/*265.9*/("""}"""),format.raw/*265.10*/(""", """),format.raw/*265.12*/("""{"""),format.raw/*265.13*/("""
        """),format.raw/*266.9*/("""label : "Facebook",
        data : facebook,
        lines : """),format.raw/*268.17*/("""{"""),format.raw/*268.18*/("""
        """),format.raw/*269.9*/("""show : true,
        lineWidth : 1,
        fill : true,
        fillColor : """),format.raw/*272.21*/("""{"""),format.raw/*272.22*/("""
        """),format.raw/*273.9*/("""colors :[ """),format.raw/*273.19*/("""{"""),format.raw/*273.20*/("""
        """),format.raw/*274.9*/("""opacity : 0.1
        """),format.raw/*275.9*/("""}"""),format.raw/*275.10*/(""", """),format.raw/*275.12*/("""{"""),format.raw/*275.13*/("""
        """),format.raw/*276.9*/("""opacity : 0.13
        """),format.raw/*277.9*/("""}"""),format.raw/*277.10*/(""" """),format.raw/*277.11*/("""]
        """),format.raw/*278.9*/("""}"""),format.raw/*278.10*/("""
        """),format.raw/*279.9*/("""}"""),format.raw/*279.10*/(""",
        points : """),format.raw/*280.18*/("""{"""),format.raw/*280.19*/("""
        """),format.raw/*281.9*/("""show : true
        """),format.raw/*282.9*/("""}"""),format.raw/*282.10*/("""
        """),format.raw/*283.9*/("""}"""),format.raw/*283.10*/(""" """),format.raw/*283.11*/("""] ;

        var options = """),format.raw/*285.23*/("""{"""),format.raw/*285.24*/("""
        """),format.raw/*286.9*/("""grid : """),format.raw/*286.16*/("""{"""),format.raw/*286.17*/("""
        """),format.raw/*287.9*/("""hoverable : true
        """),format.raw/*288.9*/("""}"""),format.raw/*288.10*/(""",
        colors :[ "#568A89", "#3276B1" ],
        tooltip : true,
        tooltipOpts : """),format.raw/*291.23*/("""{"""),format.raw/*291.24*/("""
        """),format.raw/*292.9*/("""//content : "Value <b>$x</b> Value <span>$y</span>",
        defaultTheme : false
        """),format.raw/*294.9*/("""}"""),format.raw/*294.10*/(""",
        xaxis : """),format.raw/*295.17*/("""{"""),format.raw/*295.18*/("""
        """),format.raw/*296.9*/("""ticks :[
        [ 1, "JAN" ],
        [ 2, "FEB" ],
        [ 3, "MAR" ],
        [ 4, "APR" ],
        [ 5, "MAY" ],
        [ 6, "JUN" ],
        [ 7, "JUL" ],
        [ 8, "AUG" ],
        [ 9, "SEP" ],
        [ 10, "OCT" ],
        [ 11, "NOV" ],
        [ 12, "DEC" ],
        [ 13, "JAN+1" ]
        ]
        """),format.raw/*311.9*/("""}"""),format.raw/*311.10*/(""",
        yaxes : """),format.raw/*312.17*/("""{"""),format.raw/*312.18*/("""

        """),format.raw/*314.9*/("""}"""),format.raw/*314.10*/("""
        """),format.raw/*315.9*/("""}"""),format.raw/*315.10*/(""" """),format.raw/*315.11*/(""";

        var plot3 = $.plot ( $ ( "#statsChart" ), data, options ) ;
        """),format.raw/*318.9*/("""}"""),format.raw/*318.10*/(""" """),format.raw/*318.11*/(""") ;

        // END TAB 2

        // TAB THREE GRAPH //
        /* TAB 3: Revenew  */

        $ ( function ( ) """),format.raw/*325.26*/("""{"""),format.raw/*325.27*/("""

        """),format.raw/*327.9*/("""var trgt =[
        [ 1354586000000, 153 ],
        [ 1364587000000, 658 ],
        [ 1374588000000, 198 ],
        [ 1384589000000, 663 ],
        [ 1394590000000, 801 ],
        [ 1404591000000, 1080 ],
        [ 1414592000000, 353 ],
        [ 1424593000000, 749 ],
        [ 1434594000000, 523 ],
        [ 1444595000000, 258 ],
        [ 1454596000000, 688 ],
        [ 1464597000000, 364 ]
        ],
        prft =[
        [ 1354586000000, 53 ],
        [ 1364587000000, 65 ],
        [ 1374588000000, 98 ],
        [ 1384589000000, 83 ],
        [ 1394590000000, 980 ],
        [ 1404591000000, 808 ],
        [ 1414592000000, 720 ],
        [ 1424593000000, 674 ],
        [ 1434594000000, 23 ],
        [ 1444595000000, 79 ],
        [ 1454596000000, 88 ],
        [ 1464597000000, 36 ]
        ],
        sgnups =[
        [ 1354586000000, 647 ],
        [ 1364587000000, 435 ],
        [ 1374588000000, 784 ],
        [ 1384589000000, 346 ],
        [ 1394590000000, 487 ],
        [ 1404591000000, 463 ],
        [ 1414592000000, 479 ],
        [ 1424593000000, 236 ],
        [ 1434594000000, 843 ],
        [ 1444595000000, 657 ],
        [ 1454596000000, 241 ],
        [ 1464597000000, 341 ]
        ],
        toggles = $ ( "#rev-toggles" ),
        target = $ ( "#flotcontainer" ) ;

        var data =[ """),format.raw/*372.21*/("""{"""),format.raw/*372.22*/("""
        """),format.raw/*373.9*/("""label : "Target Profit",
        data : trgt,
        bars : """),format.raw/*375.16*/("""{"""),format.raw/*375.17*/("""
        """),format.raw/*376.9*/("""show : true,
        align : "center",
        barWidth : 30 * 30 * 60 * 1000 * 80
        """),format.raw/*379.9*/("""}"""),format.raw/*379.10*/("""
        """),format.raw/*380.9*/("""}"""),format.raw/*380.10*/(""", """),format.raw/*380.12*/("""{"""),format.raw/*380.13*/("""
        """),format.raw/*381.9*/("""label : "Actual Profit",
        data : prft,
        color : '#3276B1',
        lines : """),format.raw/*384.17*/("""{"""),format.raw/*384.18*/("""
        """),format.raw/*385.9*/("""show : true,
        lineWidth : 3
        """),format.raw/*387.9*/("""}"""),format.raw/*387.10*/(""",
        points : """),format.raw/*388.18*/("""{"""),format.raw/*388.19*/("""
        """),format.raw/*389.9*/("""show : true
        """),format.raw/*390.9*/("""}"""),format.raw/*390.10*/("""
        """),format.raw/*391.9*/("""}"""),format.raw/*391.10*/(""", """),format.raw/*391.12*/("""{"""),format.raw/*391.13*/("""
        """),format.raw/*392.9*/("""label : "Actual Signups",
        data : sgnups,
        color : '#71843F',
        lines : """),format.raw/*395.17*/("""{"""),format.raw/*395.18*/("""
        """),format.raw/*396.9*/("""show : true,
        lineWidth : 1
        """),format.raw/*398.9*/("""}"""),format.raw/*398.10*/(""",
        points : """),format.raw/*399.18*/("""{"""),format.raw/*399.19*/("""
        """),format.raw/*400.9*/("""show : true
        """),format.raw/*401.9*/("""}"""),format.raw/*401.10*/("""
        """),format.raw/*402.9*/("""}"""),format.raw/*402.10*/(""" """),format.raw/*402.11*/("""]

        var options = """),format.raw/*404.23*/("""{"""),format.raw/*404.24*/("""
        """),format.raw/*405.9*/("""grid : """),format.raw/*405.16*/("""{"""),format.raw/*405.17*/("""
        """),format.raw/*406.9*/("""hoverable : true
        """),format.raw/*407.9*/("""}"""),format.raw/*407.10*/(""",
        tooltip : true,
        tooltipOpts : """),format.raw/*409.23*/("""{"""),format.raw/*409.24*/("""
        """),format.raw/*410.9*/("""//content: '%x - %y',
        //dateFormat: '%b %y',
        defaultTheme : false
        """),format.raw/*413.9*/("""}"""),format.raw/*413.10*/(""",
        xaxis : """),format.raw/*414.17*/("""{"""),format.raw/*414.18*/("""
        """),format.raw/*415.9*/("""mode : "time"
        """),format.raw/*416.9*/("""}"""),format.raw/*416.10*/(""",
        yaxes : """),format.raw/*417.17*/("""{"""),format.raw/*417.18*/("""
        """),format.raw/*418.9*/("""tickFormatter : function ( val, axis ) """),format.raw/*418.48*/("""{"""),format.raw/*418.49*/("""
        """),format.raw/*419.9*/("""return "$" + val ;
        """),format.raw/*420.9*/("""}"""),format.raw/*420.10*/(""",
        max : 1200
        """),format.raw/*422.9*/("""}"""),format.raw/*422.10*/("""

        """),format.raw/*424.9*/("""}"""),format.raw/*424.10*/(""" """),format.raw/*424.11*/(""";

        plot2 = null ;

        function plotNow ( ) """),format.raw/*428.30*/("""{"""),format.raw/*428.31*/("""
        """),format.raw/*429.9*/("""var d =[ ] ;
        toggles.find ( ':checkbox' ).each ( function ( ) """),format.raw/*430.58*/("""{"""),format.raw/*430.59*/("""
        """),format.raw/*431.9*/("""if ( $ ( this ).is ( ':checked' ) ) """),format.raw/*431.45*/("""{"""),format.raw/*431.46*/("""
        """),format.raw/*432.9*/("""d.push ( data[ $ ( this ).attr ( "name" ).substr ( 4, 1 ) ] ) ;
        """),format.raw/*433.9*/("""}"""),format.raw/*433.10*/("""
        """),format.raw/*434.9*/("""}"""),format.raw/*434.10*/(""" """),format.raw/*434.11*/(""") ;
        if ( d.length > 0 ) """),format.raw/*435.29*/("""{"""),format.raw/*435.30*/("""
        """),format.raw/*436.9*/("""if ( plot2 ) """),format.raw/*436.22*/("""{"""),format.raw/*436.23*/("""
        """),format.raw/*437.9*/("""plot2.setData ( d ) ;
        plot2.draw ( ) ;
        """),format.raw/*439.9*/("""}"""),format.raw/*439.10*/(""" """),format.raw/*439.11*/("""else """),format.raw/*439.16*/("""{"""),format.raw/*439.17*/("""
        """),format.raw/*440.9*/("""plot2 = $.plot ( target, d, options ) ;
        """),format.raw/*441.9*/("""}"""),format.raw/*441.10*/("""
        """),format.raw/*442.9*/("""}"""),format.raw/*442.10*/("""

        """),format.raw/*444.9*/("""}"""),format.raw/*444.10*/(""" """),format.raw/*444.11*/(""";

        toggles.find ( ':checkbox' ).on ( 'change', function ( ) """),format.raw/*446.66*/("""{"""),format.raw/*446.67*/("""
        """),format.raw/*447.9*/("""plotNow ( ) ;
        """),format.raw/*448.9*/("""}"""),format.raw/*448.10*/(""" """),format.raw/*448.11*/(""") ;
        plotNow ( )

        """),format.raw/*451.9*/("""}"""),format.raw/*451.10*/(""" """),format.raw/*451.11*/(""") ;

        """),format.raw/*453.9*/("""}"""),format.raw/*453.10*/("""

        """),format.raw/*455.9*/("""/*
         * VECTOR MAP
         */

        data_array = """),format.raw/*459.22*/("""{"""),format.raw/*459.23*/("""
        """),format.raw/*460.9*/(""""US" : 4977,
        "AU" : 4873,
        "IN" : 3671,
        "BR" : 2476,
        "TR" : 1476,
        "CN" : 146,
        "CA" : 134,
        "BD" : 100
        """),format.raw/*468.9*/("""}"""),format.raw/*468.10*/(""" """),format.raw/*468.11*/(""";

        // Load Map dependency 1 then call for dependency 2
        loadScript ( "assets/javascripts/plugin/vectormap/jquery-jvectormap-1.2.2.min.js", loadMapFile ) ;

        // Load Map dependency 2 then rendeder Map
        function loadMapFile ( ) """),format.raw/*474.34*/("""{"""),format.raw/*474.35*/("""
        """),format.raw/*475.9*/("""loadScript ( "assets/javascripts/plugin/vectormap/jquery-jvectormap-world-mill-en.js", renderVectorMap ) ;
        """),format.raw/*476.9*/("""}"""),format.raw/*476.10*/("""

        """),format.raw/*478.9*/("""function renderVectorMap ( ) """),format.raw/*478.38*/("""{"""),format.raw/*478.39*/("""
        """),format.raw/*479.9*/("""$ ( '#vector-map' ).vectorMap ( """),format.raw/*479.41*/("""{"""),format.raw/*479.42*/("""
        """),format.raw/*480.9*/("""map : 'world_mill_en',
        backgroundColor : '#fff',
        regionStyle : """),format.raw/*482.23*/("""{"""),format.raw/*482.24*/("""
        """),format.raw/*483.9*/("""initial : """),format.raw/*483.19*/("""{"""),format.raw/*483.20*/("""
        """),format.raw/*484.9*/("""fill : '#c4c4c4'
        """),format.raw/*485.9*/("""}"""),format.raw/*485.10*/(""",
        hover : """),format.raw/*486.17*/("""{"""),format.raw/*486.18*/("""
        """),format.raw/*487.9*/(""""fill-opacity" : 1
        """),format.raw/*488.9*/("""}"""),format.raw/*488.10*/("""
        """),format.raw/*489.9*/("""}"""),format.raw/*489.10*/(""",
        series : """),format.raw/*490.18*/("""{"""),format.raw/*490.19*/("""
        """),format.raw/*491.9*/("""regions :[ """),format.raw/*491.20*/("""{"""),format.raw/*491.21*/("""
        """),format.raw/*492.9*/("""values : data_array,
        scale :[ '#85a8b6', '#4d7686' ],
        normalizeFunction : 'polynomial'
        """),format.raw/*495.9*/("""}"""),format.raw/*495.10*/(""" """),format.raw/*495.11*/("""]
        """),format.raw/*496.9*/("""}"""),format.raw/*496.10*/(""",
        onRegionLabelShow : function ( e, el, code ) """),format.raw/*497.54*/("""{"""),format.raw/*497.55*/("""
        """),format.raw/*498.9*/("""if ( typeof data_array[ code ] == 'undefined' ) """),format.raw/*498.57*/("""{"""),format.raw/*498.58*/("""
        """),format.raw/*499.9*/("""e.preventDefault ( ) ;
        """),format.raw/*500.9*/("""}"""),format.raw/*500.10*/(""" """),format.raw/*500.11*/("""else """),format.raw/*500.16*/("""{"""),format.raw/*500.17*/("""
        """),format.raw/*501.9*/("""var countrylbl = data_array[ code ] ;
        el.html ( el.html ( ) + ': ' + countrylbl + ' visits' ) ;
        """),format.raw/*503.9*/("""}"""),format.raw/*503.10*/("""
        """),format.raw/*504.9*/("""}"""),format.raw/*504.10*/("""
        """),format.raw/*505.9*/("""}"""),format.raw/*505.10*/(""" """),format.raw/*505.11*/(""") ;
        """),format.raw/*506.9*/("""}"""),format.raw/*506.10*/("""

        """),format.raw/*508.9*/("""/*
         * FULL CALENDAR JS
         */

        // Load Calendar dependency then setup calendar
        loadScript ( "assets/javascripts/plugin/fullcalendar/jquery.fullcalendar.min.js", setupCalendar ) ;

        function setupCalendar ( ) """),format.raw/*515.36*/("""{"""),format.raw/*515.37*/("""

        """),format.raw/*517.9*/("""if ( $ ( "#calendar" ).length ) """),format.raw/*517.41*/("""{"""),format.raw/*517.42*/("""
        """),format.raw/*518.9*/("""var date = new Date ( ) ;
        var d = date.getDate ( ) ;
        var m = date.getMonth ( ) ;
        var y = date.getFullYear ( ) ;

        var calendar = $ ( '#calendar' ).fullCalendar ( """),format.raw/*523.57*/("""{"""),format.raw/*523.58*/("""

        """),format.raw/*525.9*/("""editable : true,
        draggable : true,
        selectable : false,
        selectHelper : true,
        unselectAuto : false,
        disableResizing : false,

        header : """),format.raw/*532.18*/("""{"""),format.raw/*532.19*/("""
        """),format.raw/*533.9*/("""left : 'title', //,today
        center : 'prev, next, today',
        right : 'month, agendaWeek, agenDay' //month, agendaDay,
        """),format.raw/*536.9*/("""}"""),format.raw/*536.10*/(""",

        select : function ( start, end, allDay ) """),format.raw/*538.50*/("""{"""),format.raw/*538.51*/("""
        """),format.raw/*539.9*/("""var title = prompt ( 'Event Title:' ) ;
        if ( title ) """),format.raw/*540.22*/("""{"""),format.raw/*540.23*/("""
        """),format.raw/*541.9*/("""calendar.fullCalendar ( 'renderEvent', """),format.raw/*541.48*/("""{"""),format.raw/*541.49*/("""
        """),format.raw/*542.9*/("""title : title,
        start : start,
        end : end,
        allDay : allDay
        """),format.raw/*546.9*/("""}"""),format.raw/*546.10*/(""", true // make the event "stick"
        ) ;
        """),format.raw/*548.9*/("""}"""),format.raw/*548.10*/("""
        """),format.raw/*549.9*/("""calendar.fullCalendar ( 'unselect' ) ;
        """),format.raw/*550.9*/("""}"""),format.raw/*550.10*/(""",

        events :[ """),format.raw/*552.19*/("""{"""),format.raw/*552.20*/("""
        """),format.raw/*553.9*/("""title : 'All Day Event',
        start : new Date ( y, m, 1 ),
        description : 'long description',
        className :[ "event", "bg-color-greenLight" ],
        icon : 'fa-check'
        """),format.raw/*558.9*/("""}"""),format.raw/*558.10*/(""", """),format.raw/*558.12*/("""{"""),format.raw/*558.13*/("""
        """),format.raw/*559.9*/("""title : 'Long Event',
        start : new Date ( y, m, d - 5 ),
        end : new Date ( y, m, d - 2 ),
        className :[ "event", "bg-color-red" ],
        icon : 'fa-lock'
        """),format.raw/*564.9*/("""}"""),format.raw/*564.10*/(""", """),format.raw/*564.12*/("""{"""),format.raw/*564.13*/("""
        """),format.raw/*565.9*/("""id : 999,
        title : 'Repeating Event',
        start : new Date ( y, m, d - 3, 16, 0 ),
        allDay : false,
        className :[ "event", "bg-color-blue" ],
        icon : 'fa-clock-o'
        """),format.raw/*571.9*/("""}"""),format.raw/*571.10*/(""", """),format.raw/*571.12*/("""{"""),format.raw/*571.13*/("""
        """),format.raw/*572.9*/("""id : 999,
        title : 'Repeating Event',
        start : new Date ( y, m, d + 4, 16, 0 ),
        allDay : false,
        className :[ "event", "bg-color-blue" ],
        icon : 'fa-clock-o'
        """),format.raw/*578.9*/("""}"""),format.raw/*578.10*/(""", """),format.raw/*578.12*/("""{"""),format.raw/*578.13*/("""
        """),format.raw/*579.9*/("""title : 'Meeting',
        start : new Date ( y, m, d, 10, 30 ),
        allDay : false,
        className :[ "event", "bg-color-darken" ]
        """),format.raw/*583.9*/("""}"""),format.raw/*583.10*/(""", """),format.raw/*583.12*/("""{"""),format.raw/*583.13*/("""
        """),format.raw/*584.9*/("""title : 'Lunch',
        start : new Date ( y, m, d, 12, 0 ),
        end : new Date ( y, m, d, 14, 0 ),
        allDay : false,
        className :[ "event", "bg-color-darken" ]
        """),format.raw/*589.9*/("""}"""),format.raw/*589.10*/(""", """),format.raw/*589.12*/("""{"""),format.raw/*589.13*/("""
        """),format.raw/*590.9*/("""title : 'Birthday Party',
        start : new Date ( y, m, d + 1, 19, 0 ),
        end : new Date ( y, m, d + 1, 22, 30 ),
        allDay : false,
        className :[ "event", "bg-color-darken" ]
        """),format.raw/*595.9*/("""}"""),format.raw/*595.10*/(""", """),format.raw/*595.12*/("""{"""),format.raw/*595.13*/("""
        """),format.raw/*596.9*/("""title : 'Smartadmin Open Day',
        start : new Date ( y, m, 28 ),
        end : new Date ( y, m, 29 ),
        className :[ "event", "bg-color-darken" ]
        """),format.raw/*600.9*/("""}"""),format.raw/*600.10*/(""" """),format.raw/*600.11*/("""],

        eventRender : function ( event, element, icon ) """),format.raw/*602.57*/("""{"""),format.raw/*602.58*/("""
        """),format.raw/*603.9*/("""if ( ! event.description == "" ) """),format.raw/*603.42*/("""{"""),format.raw/*603.43*/("""
        """),format.raw/*604.9*/("""element.find ( '.fc-event-title' ).append ( "<br/><span class='ultra-light'>" + event.description +
        "</span>" ) ;
        """),format.raw/*606.9*/("""}"""),format.raw/*606.10*/("""
        """),format.raw/*607.9*/("""if ( ! event.icon == "" ) """),format.raw/*607.35*/("""{"""),format.raw/*607.36*/("""
        """),format.raw/*608.9*/("""element.find ( '.fc-event-title' ).append ( "<i class='air air-top-right fa " + event.icon +
        " '></i>" ) ;
        """),format.raw/*610.9*/("""}"""),format.raw/*610.10*/("""
        """),format.raw/*611.9*/("""}"""),format.raw/*611.10*/("""
        """),format.raw/*612.9*/("""}"""),format.raw/*612.10*/(""" """),format.raw/*612.11*/(""") ;

        """),format.raw/*614.9*/("""}"""),format.raw/*614.10*/(""" """),format.raw/*614.11*/(""";

        /* hide default buttons */
        $ ( '.fc-header-right, .fc-header-center' ).hide ( ) ;

        """),format.raw/*619.9*/("""}"""),format.raw/*619.10*/("""

        """),format.raw/*621.9*/("""// calendar prev
        $ ( '#calendar-buttons #btn-prev' ).click ( function ( ) """),format.raw/*622.66*/("""{"""),format.raw/*622.67*/("""
        """),format.raw/*623.9*/("""$ ( '.fc-button-prev' ).click ( ) ;
        return false ;
        """),format.raw/*625.9*/("""}"""),format.raw/*625.10*/(""" """),format.raw/*625.11*/(""") ;

        // calendar next
        $ ( '#calendar-buttons #btn-next' ).click ( function ( ) """),format.raw/*628.66*/("""{"""),format.raw/*628.67*/("""
        """),format.raw/*629.9*/("""$ ( '.fc-button-next' ).click ( ) ;
        return false ;
        """),format.raw/*631.9*/("""}"""),format.raw/*631.10*/(""" """),format.raw/*631.11*/(""") ;

        // calendar today
        $ ( '#calendar-buttons #btn-today' ).click ( function ( ) """),format.raw/*634.67*/("""{"""),format.raw/*634.68*/("""
        """),format.raw/*635.9*/("""$ ( '.fc-button-today' ).click ( ) ;
        return false ;
        """),format.raw/*637.9*/("""}"""),format.raw/*637.10*/(""" """),format.raw/*637.11*/(""") ;

        // calendar month
        $ ( '#mt' ).click ( function ( ) """),format.raw/*640.42*/("""{"""),format.raw/*640.43*/("""
        """),format.raw/*641.9*/("""$ ( '#calendar' ).fullCalendar ( 'changeView', 'month' ) ;
        """),format.raw/*642.9*/("""}"""),format.raw/*642.10*/(""" """),format.raw/*642.11*/(""") ;

        // calendar agenda week
        $ ( '#ag' ).click ( function ( ) """),format.raw/*645.42*/("""{"""),format.raw/*645.43*/("""
        """),format.raw/*646.9*/("""$ ( '#calendar' ).fullCalendar ( 'changeView', 'agendaWeek' ) ;
        """),format.raw/*647.9*/("""}"""),format.raw/*647.10*/(""" """),format.raw/*647.11*/(""") ;

        // calendar agenda day
        $ ( '#td' ).click ( function ( ) """),format.raw/*650.42*/("""{"""),format.raw/*650.43*/("""
        """),format.raw/*651.9*/("""$ ( '#calendar' ).fullCalendar ( 'changeView', 'agendaDay' ) ;
        """),format.raw/*652.9*/("""}"""),format.raw/*652.10*/(""" """),format.raw/*652.11*/(""") ;

        /*
         * CHAT
         */

        var filter_input = $ ( '#filter-chat-list' ),
        chat_users_container = $ ( '#chat-container > .chat-list-body' ),
        chat_users = $ ( '#chat-users' ),
        chat_list_btn = $ ( '#chat-container > .chat-list-open-close' ),
        chat_body = $ ( '#chat-body' ) ;

        /*
         * LIST FILTER (CHAT)
         */

        // custom css expression for a case-insensitive contains()
        jQuery.expr[ ':' ].Contains = function ( a, i, m ) """),format.raw/*669.60*/("""{"""),format.raw/*669.61*/("""
        """),format.raw/*670.9*/("""return ( a.textContent || a.innerText || "" ).toUpperCase ( ).indexOf ( m[ 3 ].toUpperCase ( ) ) >= 0 ;
        """),format.raw/*671.9*/("""}"""),format.raw/*671.10*/(""" """),format.raw/*671.11*/(""";

        function listFilter ( list ) """),format.raw/*673.38*/("""{"""),format.raw/*673.39*/(""" """),format.raw/*673.40*/("""// header is any element, list is an unordered list
        // create and add the filter form to the header

        filter_input.change ( function ( ) """),format.raw/*676.44*/("""{"""),format.raw/*676.45*/("""
        """),format.raw/*677.9*/("""var filter = $ ( this ).val ( ) ;
        if ( filter ) """),format.raw/*678.23*/("""{"""),format.raw/*678.24*/("""
        """),format.raw/*679.9*/("""// this finds all links in a list that contain the input,
        // and hide the ones not containing the input while showing the ones that do
        chat_users.find ( "a:not(:Contains(" + filter + "))" ).parent ( ).slideUp ( ) ;
        chat_users.find ( "a:Contains(" + filter + ")" ).parent ( ).slideDown ( ) ;
        """),format.raw/*683.9*/("""}"""),format.raw/*683.10*/(""" """),format.raw/*683.11*/("""else """),format.raw/*683.16*/("""{"""),format.raw/*683.17*/("""
        """),format.raw/*684.9*/("""chat_users.find ( "li" ).slideDown ( ) ;
        """),format.raw/*685.9*/("""}"""),format.raw/*685.10*/("""
        """),format.raw/*686.9*/("""return false ;
        """),format.raw/*687.9*/("""}"""),format.raw/*687.10*/(""" """),format.raw/*687.11*/(""").keyup ( function ( ) """),format.raw/*687.34*/("""{"""),format.raw/*687.35*/("""
        """),format.raw/*688.9*/("""// fire the above change event after every letter
        $ ( this ).change ( ) ;

        """),format.raw/*691.9*/("""}"""),format.raw/*691.10*/(""" """),format.raw/*691.11*/(""") ;

        """),format.raw/*693.9*/("""}"""),format.raw/*693.10*/("""

        """),format.raw/*695.9*/("""// on dom ready
        listFilter ( chat_users ) ;

        // open chat list
        chat_list_btn.click ( function ( ) """),format.raw/*699.44*/("""{"""),format.raw/*699.45*/("""
        """),format.raw/*700.9*/("""$ ( this ).parent ( '#chat-container' ).toggleClass ( 'open' ) ;
        """),format.raw/*701.9*/("""}"""),format.raw/*701.10*/(""" """),format.raw/*701.11*/(""")

        chat_body.animate ( """),format.raw/*703.29*/("""{"""),format.raw/*703.30*/("""
        """),format.raw/*704.9*/("""scrollTop : chat_body[ 0 ].scrollHeight
        """),format.raw/*705.9*/("""}"""),format.raw/*705.10*/(""", 500 ) ;

        """),format.raw/*707.9*/("""}"""),format.raw/*707.10*/(""" """),format.raw/*707.11*/(""";

        // end pagefunction

        // run pagefunction on load
        pagefunction ( ) ;


        </script>
    """)))};
Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*716.6*/("""
"""),_display_(/*717.2*/main(message,scripts)/*717.23*/ {_display_(Seq[Any](format.raw/*717.25*/("""
    """),format.raw/*718.5*/("""<div id="content" style="opacity : 1 ;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa-fw fa fa-home"></i>
                Dashboard <span>&gt; My Dashboard</span></h1>
        </div>
        <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
            <ul id="sparks" class="">
                <li class="sparks-info">
                    <h5> My Income <span class="txt-color-blue">$47,171</span></h5>
                    <div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm"><canvas width="89" height="26" style="display : inline-block ; width : 89 px ; height : 26 px ; vertical-align : top ;"></canvas></div>
                </li>
                <li class="sparks-info">
                    <h5>
                        Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up"></i>&nbsp;45%</span></h5>
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
                <article class="col-sm-12">
                        <!-- new widget -->
                    <div class="jarviswidget" id="wid-id-0" data-widget-togglebutton="false" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false">
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
                            <span class="widget-icon"> <i class="glyphicon glyphicon-stats txt-color-darken"></i> </span>
                            <h2>Live Feeds </h2>

                            <ul class="nav nav-tabs pull-right in" id="myTab">
                                <li class="active">
                                    <a data-toggle="tab" href="#s1"><i class="fa fa-clock-o"></i> <span class="hidden-mobile hidden-tablet">
                                        Live Stats</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s2"><i class="fa fa-facebook"></i> <span class="hidden-mobile hidden-tablet">
                                        Social Network</span></a>
                                </li>

                                <li>
                                    <a data-toggle="tab" href="#s3"><i class="fa fa-dollar"></i> <span class="hidden-mobile hidden-tablet">
                                        Revenue</span></a>
                                </li>
                            </ul>

                        </header>

                            <!-- widget div-->
                        <div class="no-padding">
                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">

                                test
                            </div>
                                <!-- end widget edit box -->

                            <div class="widget-body">
                                    <!-- content -->
                                <div id="myTabContent" class="tab-content">
                                    <div class="tab-pane fade active in padding-10 no-padding-bottom" id="s1">
                                        <div class="row no-space">
                                            <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
                                                <span class="demo-liveupdate-1"> <span class="onoffswitch-title">
                                                    Live switch</span> <span class="onoffswitch">
                                                    <input type="checkbox" name="start_interval" class="onoffswitch-checkbox" id="start_interval">
                                                    <label class="onoffswitch-label" for="start_interval">
                                                        <span class="onoffswitch-inner" data-swchon-text="ON" data-swchoff-text="OFF"></span>
                                                        <span class="onoffswitch-switch"></span> </label> </span> </span>
                                                <div id="updating-chart" class="chart-large txt-color-blue" style="padding : 0 px ; position : relative ;"><canvas class="base" width="677" height="235"></canvas><canvas class="overlay" width="677" height="235" style="position : absolute ; left : 0 px ; top : 0 px ;"></canvas><div class="tickLabels" style="font-size : smaller"><div class="xAxis x1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : center ; left : - 2 px ; top : 220 px ; width : 61 px">
                                                    0</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 61 px ; top : 220 px ; width : 61 px">
                                                    10</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 125 px ; top : 220 px ; width : 61 px">
                                                    20</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 189 px ; top : 220 px ; width : 61 px">
                                                    30</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 253 px ; top : 220 px ; width : 61 px">
                                                    40</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 317 px ; top : 220 px ; width : 61 px">
                                                    50</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 381 px ; top : 220 px ; width : 61 px">
                                                    60</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 445 px ; top : 220 px ; width : 61 px">
                                                    70</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 509 px ; top : 220 px ; width : 61 px">
                                                    80</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 573 px ; top : 220 px ; width : 61 px">
                                                    90</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 637 px ; top : 220 px ; width : 61 px">
                                                    100</div></div><div class="yAxis y1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : right ; top : 203 px ; right : 659 px ; width : 18 px">
                                                    0</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 163 px ; right : 659 px ; width : 18 px">
                                                    20</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 123 px ; right : 659 px ; width : 18 px">
                                                    40</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 83 px ; right : 659 px ; width : 18 px">
                                                    60</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 43 px ; right : 659 px ; width : 18 px">
                                                    80</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 3 px ; right : 659 px ; width : 18 px">
                                                    100</div></div></div></div>

                                            </div>
                                            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 show-stats">

                                                <div class="row">
                                                    <div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text">
                                                        My Tasks <span class="pull-right">130/200</span> </span>
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-blueDark" style="width : 65 % ;"></div>
                                                        </div> </div>
                                                    <div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text">
                                                        Transfered <span class="pull-right">440 GB</span> </span>
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-blue" style="width : 34 % ;"></div>
                                                        </div> </div>
                                                    <div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text">
                                                        Bugs Squashed<span class="pull-right">77%</span> </span>
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-blue" style="width : 77 % ;"></div>
                                                        </div> </div>
                                                    <div class="col-xs-6 col-sm-6 col-md-12 col-lg-12"> <span class="text">
                                                        User Testing <span class="pull-right">7 Days</span> </span>
                                                        <div class="progress">
                                                            <div class="progress-bar bg-color-greenLight" style="width : 84 % ;"></div>
                                                        </div> </div>

                                                    <span class="show-stat-buttons"> <span class="col-xs-12 col-sm-6 col-md-6 col-lg-6"> <a href="javascript:void(0);" class="btn btn-default btn-block hidden-xs">
                                                        Generate PDF</a> </span> <span class="col-xs-12 col-sm-6 col-md-6 col-lg-6"> <a href="javascript:void(0);" class="btn btn-default btn-block hidden-xs">
                                                        Report a bug</a> </span> </span>

                                                </div>

                                            </div>
                                        </div>

                                        <div class="show-stat-microcharts">
                                            <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">

                                                <div class="easy-pie-chart txt-color-orangeDark easyPieChart" data-percent="33" data-pie-size="50" style="width : 50 px ; height : 50 px ; line-height : 50 px ;">
                                                    <span class="percent percent-sign">32</span>
                                                    <canvas width="50" height="50"></canvas></div>
                                                <span class="easy-pie-title">
                                                    Server Load <i class="fa fa-caret-up icon-color-bad"></i> </span>
                                                <ul class="smaller-stat hidden-sm pull-right">
                                                    <li>
                                                        <span class="label bg-color-greenLight"><i class="fa fa-caret-up"></i>
                                                            97%</span>
                                                    </li>
                                                    <li>
                                                        <span class="label bg-color-blueLight"><i class="fa fa-caret-down"></i>
                                                            44%</span>
                                                    </li>
                                                </ul>
                                                <div class="sparkline txt-color-greenLight hidden-sm hidden-md pull-right" data-sparkline-type="line" data-sparkline-height="33px" data-sparkline-width="70px" data-fill-color="transparent"><canvas width="70" height="33" style="display : inline-block ; width : 70 px ; height : 33 px ; vertical-align : top ;"></canvas></div>
                                            </div>
                                            <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                                                <div class="easy-pie-chart txt-color-greenLight easyPieChart" data-percent="78.9" data-pie-size="50" style="width : 50 px ; height : 50 px ; line-height : 50 px ;">
                                                    <span class="percent percent-sign">77</span>
                                                    <canvas width="50" height="50"></canvas></div>
                                                <span class="easy-pie-title">
                                                    Disk Space <i class="fa fa-caret-down icon-color-good"></i></span>
                                                <ul class="smaller-stat hidden-sm pull-right">
                                                    <li>
                                                        <span class="label bg-color-blueDark"><i class="fa fa-caret-up"></i>
                                                            76%</span>
                                                    </li>
                                                    <li>
                                                        <span class="label bg-color-blue"><i class="fa fa-caret-down"></i>
                                                            3%</span>
                                                    </li>
                                                </ul>
                                                <div class="sparkline txt-color-blue hidden-sm hidden-md pull-right" data-sparkline-type="line" data-sparkline-height="33px" data-sparkline-width="70px" data-fill-color="transparent"><canvas width="70" height="33" style="display : inline-block ; width : 70 px ; height : 33 px ; vertical-align : top ;"></canvas></div>
                                            </div>
                                            <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                                                <div class="easy-pie-chart txt-color-blue easyPieChart" data-percent="23" data-pie-size="50" style="width : 50 px ; height : 50 px ; line-height : 50 px ;">
                                                    <span class="percent percent-sign">22</span>
                                                    <canvas width="50" height="50"></canvas></div>
                                                <span class="easy-pie-title">
                                                    Transfered <i class="fa fa-caret-up icon-color-good"></i></span>
                                                <ul class="smaller-stat hidden-sm pull-right">
                                                    <li>
                                                        <span class="label bg-color-darken">10GB</span>
                                                    </li>
                                                    <li>
                                                        <span class="label bg-color-blueDark"><i class="fa fa-caret-up"></i>
                                                            10%</span>
                                                    </li>
                                                </ul>
                                                <div class="sparkline txt-color-darken hidden-sm hidden-md pull-right" data-sparkline-type="line" data-sparkline-height="33px" data-sparkline-width="70px" data-fill-color="transparent"><canvas width="70" height="33" style="display : inline-block ; width : 70 px ; height : 33 px ; vertical-align : top ;"></canvas></div>
                                            </div>
                                            <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">
                                                <div class="easy-pie-chart txt-color-darken easyPieChart" data-percent="36" data-pie-size="50" style="width : 50 px ; height : 50 px ; line-height : 50 px ;">
                                                    <span class="percent degree-sign">35</span>
                                                    <canvas width="50" height="50"></canvas></div>
                                                <span class="easy-pie-title">
                                                    Temperature <i class="fa fa-caret-down icon-color-good"></i></span>
                                                <ul class="smaller-stat hidden-sm pull-right">
                                                    <li>
                                                        <span class="label bg-color-red"><i class="fa fa-caret-up"></i>
                                                            124</span>
                                                    </li>
                                                    <li>
                                                        <span class="label bg-color-blue"><i class="fa fa-caret-down"></i>
                                                            40 F</span>
                                                    </li>
                                                </ul>
                                                <div class="sparkline txt-color-red hidden-sm hidden-md pull-right" data-sparkline-type="line" data-sparkline-height="33px" data-sparkline-width="70px" data-fill-color="transparent"><canvas width="70" height="33" style="display : inline-block ; width : 70 px ; height : 33 px ; vertical-align : top ;"></canvas></div>
                                            </div>
                                        </div>

                                    </div>
                                        <!-- end s1 tab pane -->

                                    <div class="tab-pane fade" id="s2">
                                        <div class="widget-body-toolbar bg-color-white">

                                            <form class="form-inline" role="form">

                                                <div class="form-group">
                                                    <label class="sr-only" for="s123">Show From</label>
                             """),
format.raw("""                       <input type="email" class="form-control input-sm" id="s123" placeholder="Show From">
                                                </div>
                                                <div class="form-group">
                                                    <input type="email" class="form-control input-sm" id="s124" placeholder="To">
                                                </div>

                                                <div class="btn-group hidden-phone pull-right hidden-xs">
                                                    <a class="btn dropdown-toggle btn-xs btn-default" data-toggle="dropdown"><i class="fa fa-cog"></i>
                                                        More <span class="caret"> </span> </a>
                                                    <ul class="dropdown-menu pull-right">
                                                        <li>
                                                            <a href="javascript:void(0);"><i class="fa fa-file-text-alt"></i>
                                                                Export to PDF</a>
                                                        </li>
                                                        <li>
                                                            <a href="javascript:void(0);"><i class="fa fa-question-sign"></i>
                                                                Help</a>
                                                        </li>
                                                    </ul>
                                                </div>

                                            </form>

                                        </div>
                                        <div class="padding-10">
                                            <div id="statsChart" class="chart-large has-legend-unique" style="padding : 0 px ; position : relative ;"><canvas class="base" width="100" height="235"></canvas><canvas class="overlay" width="100" height="235" style="position : absolute ; left : 0 px ; top : 0 px ;"></canvas><div class="tickLabels" style="font-size : smaller"><div class="xAxis x1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : center ; left : 7 px ; top : 235 px ; width : 7 px">
                                                JAN</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 13 px ; top : 235 px ; width : 7 px">
                                                FEB</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 20 px ; top : 235 px ; width : 7 px">
                                                MAR</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 27 px ; top : 235 px ; width : 7 px">
                                                APR</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 33 px ; top : 235 px ; width : 7 px">
                                                MAY</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 40 px ; top : 235 px ; width : 7 px">
                                                JUN</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 47 px ; top : 235 px ; width : 7 px">
                                                JUL</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 53 px ; top : 235 px ; width : 7 px">
                                                AUG</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 60 px ; top : 235 px ; width : 7 px">
                                                SEP</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 67 px ; top : 235 px ; width : 7 px">
                                                OCT</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 73 px ; top : 235 px ; width : 7 px">
                                                NOV</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 80 px ; top : 235 px ; width : 7 px">
                                                DEC</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 87 px ; top : 235 px ; width : 7 px">
                                                JAN+1</div></div><div class="yAxis y1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : right ; top : 225 px ; right : 100 px ; width : 0 px">
                                                0</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 171 px ; right : 100 px ; width : 0 px">
                                                20</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 118 px ; right : 100 px ; width : 0 px">
                                                40</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 64 px ; right : 100 px ; width : 0 px">
                                                60</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 10 px ; right : 100 px ; width : 0 px">
                                                80</div></div></div><div class="legend"><div style="position : absolute ; width : 0 px ; height : 0 px ; top : - 22 px ; right : 5 px ; opacity : 1 ;"> </div><table style="position : absolute ; top : - 22 px ; right : 5 px ; ; font-size : 11 px ; color : #545454"><tbody><tr><td class="legendColorBox"><div style=""><div style="border : 2 px solid rgb ( 86, 138, 137 ) ; overflow : hidden"></div></div></td><td class="legendLabel"><span>
                                                Twitter</span></td><td class="legendColorBox"><div style=""><div style="border : 2 px solid rgb ( 50, 118, 177 ) ; overflow : hidden"></div></div></td><td class="legendLabel"><span>
                                                Facebook</span></td></tr></tbody></table></div></div>
                                        </div>

                                    </div>
                                        <!-- end s2 tab pane -->

                                    <div class="tab-pane fade" id="s3">

                                        <div class="widget-body-toolbar bg-color-white smart-form" id="rev-toggles">

                                            <div class="inline-group">

                                                <label for="gra-0" class="checkbox">
                                                    <input type="checkbox" name="gra-0" id="gra-0" checked="checked">
                                                    <i></i> Target </label>
                                                <label for="gra-1" class="checkbox">
                                                    <input type="checkbox" name="gra-1" id="gra-1" checked="checked">
                                                    <i></i> Actual </label>
                                                <label for="gra-2" class="checkbox">
                                                    <input type="checkbox" name="gra-2" id="gra-2" checked="checked">
                                                    <i></i> Signups </label>
                                            </div>

                                            <div class="btn-group hidden-phone pull-right hidden-xs">
                                                <a class="btn dropdown-toggle btn-xs btn-default" data-toggle="dropdown"><i class="fa fa-cog"></i>
                                                    More <span class="caret"> </span> </a>
                                                <ul class="dropdown-menu pull-right">
                                                    <li>
                                                        <a href="javascript:void(0);"><i class="fa fa-file-text-alt"></i>
                                                            Export to PDF</a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0);"><i class="fa fa-question-sign"></i>
                                                            Help</a>
                                                    </li>
                                                </ul>
                                            </div>

                                        </div>

                                        <div class="padding-10">
                                            <div id="flotcontainer" class="chart-large has-legend-unique" style="padding : 0 px ; position : relative ;"><canvas class="base" width="100" height="235"></canvas><canvas class="overlay" width="100" height="235" style="position : absolute ; left : 0 px ; top : 0 px ;"></canvas><div class="tickLabels" style="font-size : smaller"><div class="xAxis x1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : center ; left : 5 px ; top : 235 px ; width : 16 px">
                                                2013</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 27 px ; top : 235 px ; width : 16 px">
                                                2014</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 49 px ; top : 235 px ; width : 16 px">
                                                2015</div><div class="tickLabel" style="position : absolute ; text-align : center ; left : 71 px ; top : 235 px ; width : 16 px">
                                                2016</div></div><div class="yAxis y1Axis" style="color : #545454"><div class="tickLabel" style="position : absolute ; text-align : right ; top : 225 px ; right : 100 px ; width : 0 px">
                                                0</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 182 px ; right : 100 px ; width : 0 px">
                                                250</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 139 px ; right : 100 px ; width : 0 px">
                                                500</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 96 px ; right : 100 px ; width : 0 px">
                                                750</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 53 px ; right : 100 px ; width : 0 px">
                                                1000</div><div class="tickLabel" style="position : absolute ; text-align : right ; top : 10 px ; right : 100 px ; width : 0 px">
                                                1250</div></div></div><div class="legend"><div style="position : absolute ; width : 0 px ; height : 0 px ; top : - 22 px ; right : 5 px ; opacity : 1 ;"> </div><table style="position : absolute ; top : - 22 px ; right : 5 px ; ; font-size : 11 px ; color : #545454"><tbody><tr><td class="legendColorBox"><div style=""><div style="border : 2 px solid rgb ( 147, 19, 19 ) ; overflow : hidden"></div></div></td><td class="legendLabel"><span>
                                                Target Profit</span></td><td class="legendColorBox"><div style=""><div style="border : 2 px solid #3276B1 ; overflow : hidden"></div></div></td><td class="legendLabel"><span>
                                                Actual Profit</span></td><td class="legendColorBox"><div style=""><div style="border : 2 px solid #71843F ; overflow : hidden"></div></div></td><td class="legendLabel"><span>
                                                Actual Signups</span></td></tr></tbody></table></div></div>
                                        </div>
                                    </div>
                                        <!-- end s3 tab pane -->
                                </div>

                                    <!-- end content -->
                            </div>

                        </div>
                            <!-- end widget div -->
                    </div>
                        <!-- end widget -->

                </article>
            </div>

                <!-- end row -->

                <!-- row -->

            <div class="row">

                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- new widget -->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-1" data-widget-editbutton="false" data-widget-fullscreenbutton="false">

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
                            <span class="widget-icon"> <i class="fa fa-comments txt-color-white"></i> </span>
                            <h2> SmartChat </h2>
                            <div class="widget-toolbar">
                                    <!-- add: non-hidden - to disable auto hide -->

                                <div class="btn-group">
                                    <button class="btn dropdown-toggle btn-xs btn-success" data-toggle="dropdown">
                                        Status <i class="fa fa-caret-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right js-status-update">
                                        <li>
                                            <a href="javascript:void(0);"><i class="fa fa-circle txt-color-green"></i>
                                                Online</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);"><i class="fa fa-circle txt-color-red"></i>
                                                Busy</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);"><i class="fa fa-circle txt-color-orange"></i>
                                                Away</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li>
                                            <a href="javascript:void(0);"><i class="fa fa-power-off"></i> Log Off</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </header>

                            <!-- widget div-->
                        <div>
                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                <div>
                                    <label>Title:</label>
                                    <input type="text">
                                </div>
                            </div>
                                <!-- end widget edit box -->

                            <div class="widget-body widget-hide-overflow no-padding">
                                    <!-- content goes here -->

                                    <!-- CHAT CONTAINER -->
                                <div id="chat-container">
                                    <span class="chat-list-open-close"><i class="fa fa-user"></i><b>!</b></span>

                                    <div class="chat-list-body custom-scroll">
                                        <ul id="chat-users">
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1139.90*/routes/*1139.96*/.Assets.at("images/avatars/5.png")),format.raw/*1139.130*/("""" alt="">
                                                    Robin Berry <span class="badge badge-inverse">
                                                        23</span><span class="state"><i class="fa fa-circle txt-color-green pull-right"></i></span></a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1144.90*/routes/*1144.96*/.Assets.at("images/avatars/male.png")),format.raw/*1144.133*/("""" alt="">
                                                    Mark Zeukartech <span class="state"><i class="last-online pull-right">
                                                        2hrs</i></span></a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1149.90*/routes/*1149.96*/.Assets.at("images/avatars/male.png")),format.raw/*1149.133*/("""" alt="">
                                                    Belmain Dolson <span class="state"><i class="last-online pull-right">
                                                        45m</i></span></a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1154.90*/routes/*1154.96*/.Assets.at("images/avatars/male.png")),format.raw/*1154.133*/("""" alt="">
                                                    Galvitch Drewbery <span class="state"><i class="fa fa-circle txt-color-green pull-right"></i></span></a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1158.90*/routes/*1158.96*/.Assets.at("images/avatars/male.png")),format.raw/*1158.133*/("""" alt="">
                                                    Sadi Orlaf <span class="state"><i class="fa fa-circle txt-color-green pull-right"></i></span></a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1162.90*/routes/*1162.96*/.Assets.at("images/avatars/male.png")),format.raw/*1162.133*/("""" alt="">
                                                    Markus <span class="state"><i class="last-online pull-right">
                                                        2m</i></span> </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1167.90*/routes/*1167.96*/.Assets.at("images/avatars/sunny.png")),format.raw/*1167.134*/("""" alt="">
                                                    Sunny <span class="state"><i class="last-online pull-right">
                                                        2m</i></span> </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);"><img src=""""),_display_(/*1172.90*/routes/*1172.96*/.Assets.at("images/avatars/male.png")),format.raw/*1172.133*/("""" alt="">
                                                    Denmark <span class="state"><i class="last-online pull-right">
                                                        2m</i></span> </a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="chat-list-footer">

                                        <div class="control-group">

                                            <form class="smart-form">

                                                <section>
                                                    <label class="input">
                                                        <input type="text" id="filter-chat-list" placeholder="Filter">
                                                    </label>
                                                </section>

                                            </form>

                                        </div>

                                    </div>

                                </div>

                                    <!-- CHAT BODY -->
                                <div id="chat-body" class="chat-body custom-scroll">
                                    <ul>
                                        <li class="message">
                                            <img src=""""),_display_(/*1202.56*/routes/*1202.62*/.Assets.at("images/avatars/5.png")),format.raw/*1202.96*/("""" class="online" alt="">
                                            <div class="message-text">
                                                <time>
                                                    2014-01-13
                                                </time> <a href="javascript:void(0);" class="username">Sadi Orlaf</a>
                                                Hey did you meet the new board of director? He's a bit of an arse if you ask me...anyway here is the report you requested. I am off to launch with Lisa and Andrew, you wanna join?
                                                <p class="chat-file row">
                                                    <b class="pull-left col-sm-6"> <!--<i class="fa fa-spinner fa-spin"></i>--> <i class="fa fa-file"></i>
                                                        report-2013-demographic-report-annual-earnings.xls </b>
                                                    <span class="col-sm-6 pull-right"> <a href="javascript:void(0);" class="btn btn-xs btn-default">
                                                        cancel</a> <a href="javascript:void(0);" class="btn btn-xs btn-success">
                                                        save</a> </span>
                                                </p>
                                                <p class="chat-file row">
                                                    <b class="pull-left col-sm-6"> <i class="fa fa-ok txt-color-green"></i>
                                                        tobacco-report-2012.doc </b>
                                                    <span class="col-sm-6 pull-right"> <a href="javascript:void(0);" class="btn btn-xs btn-primary">
                                                        open</a> </span>
                                                </p> </div>
                                        </li>
                                        <li class="message">
                                            <img src=""""),_display_(/*1223.56*/routes/*1223.62*/.Assets.at("images/avatars/sunny.png")),format.raw/*1223.100*/("""" class="online" alt="">
                                            <div class="message-text">
                                                <time>
                                                    2014-01-13
                                                </time> <a href="javascript:void(0);" class="username">John Doe</a>
                                                Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i>
                                            </div>
                                        </li>
                                    </ul>

                                </div>

                                    <!-- CHAT FOOTER -->
                                <div class="chat-footer">

                                        <!-- CHAT TEXTAREA -->
                                    <div class="textarea-div">

                                        <div class="typearea">
                                            <textarea placeholder="Write a reply..." id="textarea-expand" class="custom-scroll"></textarea>
                                        </div>

                                    </div>

                                        <!-- CHAT REPLY/SEND -->
                                    <span class="textarea-controls">
                                        <button class="btn btn-sm btn-primary pull-right">
                                            Reply
                                        </button> <span class="pull-right smart-form" style="margin-top : 3 px ; margin-right : 10 px ;"> <label class="checkbox pull-right">
                                        <input type="checkbox" name="subscription" id="subscription">
                                        <i></i>Press <strong> ENTER </strong>
                                        to send </label> </span> <a href="javascript:void(0);" class="pull-left"><i class="fa fa-camera fa-fw fa-lg"></i></a> </span>

                                </div>

                                    <!-- end content -->
                            </div>

                        </div>
                            <!-- end widget div -->
                    </div>
                        <!-- end widget -->

                        <!-- new widget -->
                    <div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-3" data-widget-colorbutton="false">

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
                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">

                                <input class="form-control" type="text">

                            </div>
                                <!-- end widget edit box -->

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
                                <div id="calendar" class="fc"><table class="fc-header" style="width : 100 %"><tbody><tr><td class="fc-header-left"><span class="fc-header-title"><h2>
                                    August 2014</h2></span></td><td class="fc-header-center" style="display : none ;"><span class="fc-button fc-button-prev fc-state-default fc-corner-left fc-corner-right"><span class="fc-button-inner"><span class="fc-button-content">&nbsp;◄&nbsp;</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-header-space"></span><span class="fc-button fc-button-next fc-state-default fc-corner-left fc-corner-right"><span class="fc-button-inner"><span class="fc-button-content">&nbsp;►&nbsp;</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-header-space"></span><span class="fc-button fc-button-today fc-state-default fc-corner-left fc-corner-right fc-state-disabled"><span class="fc-button-inner"><span class="fc-button-content">
                                    today</span><span class="fc-button-effect"><span></span></span></span></span></td><td class="fc-header-right" style="display : none ;"><span class="fc-button fc-button-month fc-state-default fc-corner-left fc-corner-right fc-state-active"><span class="fc-button-inner"><span class="fc-button-content">
                                    month</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-header-space"></span><span class="fc-button fc-button-agendaWeek fc-state-default fc-corner-left fc-corner-right"><span class="fc-button-inner"><span class="fc-button-content">
                                    week</span><span class="fc-button-effect"><span></span></span></span></span><span class="fc-header-space"></span></td></tr></tbody></table><div class="fc-content" style="position : relative ; min-height : 1 px ;"><div class="fc-view fc-view-month fc-grid" style="position : relative ;" unselectable="on"><table class="fc-border-separate" style="width : 100 %" cellspacing="0"><thead><tr class="fc-first fc-last"><th class="fc-sun fc-widget-header fc-first" style="width : 72 px ;">
                                    Sun</th><th class="fc-mon fc-widget-header" style="width : 72 px ;">
                                    Mon</th><th class="fc-tue fc-widget-header" style="width : 72 px ;">
                                    Tue</th><th class="fc-wed fc-widget-header" style="width : 72 px ;">
                                    Wed</th><th class="fc-thu fc-widget-header" style="width : 72 px ;">
                                    Thu</th><th class="fc-fri fc-widget-header" style="width : 72 px ;">
                                    Fri</th><th class="fc-sat fc-widget-header fc-last">
                                    Sat</th></tr></thead><tbody><tr class="fc-week0 fc-first"><td class="fc-sun fc-widget-content fc-day0 fc-first fc-other-month"><div style="min-height : 57 px ;"><div class="fc-day-number">
                                    27</div><div class="fc-day-content"><div style="position : relative ; height : 72 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day1 fc-other-month"><div><div class="fc-day-number">
                                    28</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day2 fc-other-month"><div><div class="fc-day-number">
                                    29</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day3 fc-other-month"><div><div class="fc-day-number">
                                    30</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day4 fc-other-month"><div><div class="fc-day-number">
                                    31</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day5"><div><div class="fc-day-number">
                                    1</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day6 fc-last"><div><div class="fc-day-number">
                                    2</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr><tr class="fc-week1"><td class="fc-sun fc-widget-content fc-day7 fc-first"><div style="min-height : 56 px ;"><div class="fc-day-number">
                                    3</div><div class="fc-day-content"><div style="position : relative ; height : 0 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day8"><div><div class="fc-day-number">
                                    4</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day9"><div><div class="fc-day-number">
                                    5</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day10"><div><div class="fc-day-number">
                                    6</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day11"><div><div class="fc-day-number">
                                    7</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day12"><div><div class="fc-day-number">
                                    8</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day13 fc-last"><div><div class="fc-day-number">
                                    9</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr><tr class="fc-week2"><td class="fc-sun fc-widget-content fc-day14 fc-first"><div style="min-height : 56 px ;"><div class="fc-day-number">
                                    10</div><div class="fc-day-content"><div style="position : relative ; height : 0 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day15"><div><div class="fc-day-number">
                                    11</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day16"><div><div class="fc-day-number">
                                    12</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day17"><div><div class="fc-day-number">
                                    13</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day18"><div><div class="fc-day-number">
                                    14</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day19"><div><div class="fc-day-number">
                                    15</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day20 fc-last"><div><div class="fc-day-number">
                                    16</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr><tr class="fc-week3"><td class="fc-sun fc-widget-content fc-day21 fc-first"><div style="min-height : 56 px ;"><div class="fc-day-number">
                                    17</div><div class="fc-day-content"><div style="position : relative ; height : 85 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day22"><div><div class="fc-day-number">
                                    18</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day23"><div><div class="fc-day-number">
                                    19</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day24"><div><div class="fc-day-number">
                                    20</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day25"><div><div class="fc-day-number">
                                    21</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day26"><div><div class="fc-day-number">
                                    22</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day27 fc-last"><div><div class="fc-day-number">
                                    23</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr><tr class="fc-week4"><td class="fc-sun fc-widget-content fc-day28 fc-first"><div style="min-height : 56 px ;"><div class="fc-day-number">
                                    24</div><div class="fc-day-content"><div style="position : relative ; height : 101 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day29 fc-state-highlight fc-today"><div><div class="fc-day-number">
                                    25</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day30"><div><div class="fc-day-number">
                                    26</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day31"><div><div class="fc-day-number">
                                    27</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day32"><div><div class="fc-day-number">
                                    28</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day33"><div><div class="fc-day-number">
                                    29</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day34 fc-last"><div><div class="fc-day-number">
                                    30</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr><tr class="fc-week5 fc-last"><td class="fc-sun fc-widget-content fc-day35 fc-first"><div style="min-height : 60 px ;"><div class="fc-day-number">
                                    31</div><div class="fc-day-content"><div style="position : relative ; height : 0 px ;">&nbsp;</div></div></div></td><td class="fc-mon fc-widget-content fc-day36 fc-other-month"><div><div class="fc-day-number">
                                    1</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-tue fc-widget-content fc-day37 fc-other-month"><div><div class="fc-day-number">
                                    2</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-wed fc-widget-content fc-day38 fc-other-month"><div><div class="fc-day-number">
                                    3</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-thu fc-widget-content fc-day39 fc-other-month"><div><div class="fc-day-number">
                                    4</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-fri fc-widget-content fc-day40 fc-other-month"><div><div class="fc-day-number">
                                    5</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td><td class="fc-sat fc-widget-content fc-day41 fc-last fc-other-month"><div><div class="fc-day-number">
                                    6</div><div class="fc-day-content"><div style="position : relative">&nbsp;</div></div></div></td></tr></tbody></table><div style="position : absolute ; z-index : 8 ; top : 0 ; left : 0"><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-greenLight" style="position : absolute ; z-index : 8 ; left : 363 px ; width : 65 px ; top : 46 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">
                                    All Day Event<br><span class="ultra-light">
                                    long description</span><i class="air air-top-right fa fa-check "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-red" style="position : absolute ; z-index : 8 ; left : 219 px ; width : 281 px ; top : 253 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">
                                    Long Event<i class="air air-top-right fa fa-lock "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-blue" style="position : absolute ; z-index : 8 ; left : 363 px ; width : 65 px ; top : 277 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">
                                    4p</span><span class="fc-event-title">
                                    Repeating Event<i class="air air-top-right fa fa-clock-o "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position : absolute ; z-index : 8 ; left : 291 px ; width : 137 px ; top : 359 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-title">
                                    Smartadmin Open Day</span></div><div class="ui-resizable-handle u"""),
format.raw("""i-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position : absolute ; z-index : 8 ; left : 75 px ; width : 65 px ; top : 359 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">
                                    10:30a</span><span class="fc-event-title">
                                    Meeting</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position : absolute ; z-index : 8 ; left : 147 px ; width : 65 px ; top : 359 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">
                                    7p</span><span class="fc-event-title">
                                    Birthday Party</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-darken" style="position : absolute ; z-index : 8 ; left : 75 px ; width : 65 px ; top : 404 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">
                                    12p</span><span class="fc-event-title">
                                    Lunch</span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div><div class="fc-event fc-event-skin fc-event-hori fc-event-draggable fc-corner-left fc-corner-right event bg-color-blue" style="position : absolute ; z-index : 8 ; left : 363 px ; width : 65 px ; top : 399 px ;"><div class="fc-event-inner fc-event-skin"><span class="fc-event-time">
                                    4p</span><span class="fc-event-title">
                                    Repeating Event<i class="air air-top-right fa fa-clock-o "></i></span></div><div class="ui-resizable-handle ui-resizable-e">&nbsp;&nbsp;&nbsp;</div></div></div></div></div></div>

                                    <!-- end content -->
                            </div>

                        </div>
                            <!-- end widget div -->
                    </div>
                        <!-- end widget -->

                </article>

                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- new widget -->
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
                            <span class="widget-icon"> <i class="fa fa-map-marker"></i> </span>
                            <h2>Birds Eye</h2>
                            <div class="widget-toolbar hidden-mobile">
                                <span class="onoffswitch-title"><i class="fa fa-location-arrow"></i> Realtime</span>
                                <span class="onoffswitch">
                                    <input type="checkbox" name="onoffswitch" class="onoffswitch-checkbox" checked="checked" id="myonoffswitch">
                                    <label class="onoffswitch-label" for="myonoffswitch"> <span class="onoffswitch-inner" data-swchon-text="YES" data-swchoff-text="NO"></span> <span class="onoffswitch-switch"></span> </label> </span>
                            </div>
                        </header>

                            <!-- widget div-->
                        <div>
                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                <div>
                                    <label>Title:</label>
                                    <input type="text">
                                </div>
                            </div>
                                <!-- end widget edit box -->

                            <div class="widget-body no-padding">
                                    <!-- content goes here -->

                                <div id="vector-map" class="vector-map"><div class="jvectormap-container" style="width : 100 % ; height : 100 % ; position : relative ; overflow : hidden ; background-color : rgb ( 255, 255, 255 ) ;"><svg width="484" height="280"><g transform="scale(0.5377777777777778) translate(0, 39.977423140330146)"><path d="M652.71,228.85l-0.04,1.38l-0.46,-0.21l-0.42,0.3l0.05,0.65l-0.17,-1.37l-0.48,-1.26l-1.08,-1.6l-0.23,-0.13l-2.31,-0.11l-0.31,0.36l0.21,0.98l-0.6,1.11l-0.8,-0.4l-0.37,0.09l-0.23,0.3l-0.54,-0.21l-0.78,-0.19l-0.38,-2.04l-0.83,-1.89l0.4,-1.5l-0.16,-0.35l-1.24,-0.57l0.36,-0.62l1.5,-0.95l0.02,-0.49l-1.62,-1.26l0.64,-1.31l1.7,1.0l0.12,0.04l0.96,0.11l0.19,1.62l0.25,0.26l2.38,0.37l2.32,-0.04l1.06,0.33l-0.92,1.79l-0.97,0.13l-0.23,0.16l-0.77,1.51l0.05,0.35l1.37,1.37l0.5,-0.14l0.35,-1.46l0.24,-0.0l1.24,3.92Z" data-code="BD" fill="#85a8b6" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M429.28,143.95l1.76,0.25l0.13,-0.01l2.16,-0.64l1.46,1.34l1.26,0.71l-0.23,1.8l-0.44,0.08l-0.24,0.25l-0.2,1.36l-1.8,-1.22l-0.23,-0.05l-1.14,0.23l-1.62,-1.43l-1.15,-1.31l-0.21,-0.1l-0.95,-0.04l-0.21,-0.68l1.66,-0.54Z" data-code="BE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M413.48,260.21l-1.22,-0.46l-0.13,-0.02l-1.17,0.1l-0.15,0.06l-0.73,0.53l-0.87,-0.41l-0.39,-0.75l-0.13,-0.13l-0.98,-0.48l-0.14,-1.2l0.63,-0.99l0.05,-0.18l-0.05,-0.73l1.9,-2.01l0.08,-0.14l0.35,-1.65l0.49,-0.44l1.05,0.3l0.21,-0.02l1.05,-0.52l0.13,-0.13l0.3,-0.58l1.87,-1.1l0.11,-0.1l0.43,-0.72l2.23,-1.01l1.21,-0.32l0.51,0.4l0.19,0.06l1.25,-0.01l-0.14,0.89l0.01,0.13l0.34,1.16l0.06,0.11l1.35,1.59l0.07,1.13l0.24,0.28l2.64,0.53l-0.05,1.39l-0.42,0.59l-1.11,0.21l-0.22,0.17l-0.46,0.99l-0.69,0.23l-2.12,-0.05l-1.14,-0.2l-0.19,0.03l-0.72,0.36l-1.07,-0.17l-4.35,0.12l-0.29,0.29l-0.06,1.44l0.25,1.45Z" data-code="BF" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M477.63,166.84l0.51,0.9l0.33,0.14l0.9,-0.21l1.91,0.47l3.68,0.16l0.17,-0.05l1.2,-0.75l2.78,-0.67l1.72,1.05l1.02,0.24l-0.97,0.97l-0.91,2.17l0.0,0.24l0.56,1.19l-1.58,-0.3l-0.16,0.01l-2.55,0.95l-0.2,0.28l-0.02,1.23l-1.92,0.24l-1.68,-0.99l-0.27,-0.02l-1.94,0.8l-1.52,-0.07l-0.15,-1.72l-0.12,-0.21l-0.99,-0.76l0.18,-0.18l0.02,-0.39l-0.17,-0.22l0.33,-0.75l0.91,-0.91l0.01,-0.42l-1.16,-1.25l-0.18,-0.89l0.24,-0.27Z" data-code="BG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M468.39,164.66l0.16,0.04l0.43,-0.0l-0.43,0.93l0.06,0.34l1.08,1.06l-0.28,1.09l-0.5,0.13l-0.47,0.28l-0.86,0.74l-0.1,0.16l-0.28,1.29l-1.81,-0.94l-0.9,-1.22l-1.0,-0.73l-1.1,-1.1l-0.55,-0.96l-1.11,-1.3l0.3,-0.75l0.59,0.46l0.42,-0.04l0.46,-0.54l1.0,-0.06l2.11,0.5l1.72,-0.03l1.06,0.64Z" data-code="BA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M707.34,273.57l0.76,-0.72l1.59,-1.03l-0.18,1.93l-0.9,-0.06l-0.28,0.14l-0.31,0.51l-0.68,-0.78Z" data-code="BN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M263.83,340.79l-0.23,-0.12l-2.86,-0.11l-0.28,0.17l-0.77,1.67l-1.17,-1.51l-0.18,-0.11l-3.28,-0.64l-0.28,0.1l-2.02,2.3l-1.43,0.29l-0.91,-3.35l-1.31,-2.88l0.75,-2.41l-0.09,-0.32l-1.23,-1.03l-0.31,-1.76l-0.05,-0.12l-1.12,-1.6l1.49,-2.62l0.01,-0.28l-1.0,-2.0l0.48,-0.72l0.02,-0.29l-0.37,-0.78l0.87,-1.13l0.06,-0.18l0.05,-2.17l0.12,-1.71l0.5,-0.8l0.01,-0.3l-1.9,-3.58l1.3,0.15l1.34,-0.05l0.23,-0.12l0.51,-0.7l2.12,-0.99l1.31,-0.93l2.81,-0.37l-0.21,1.51l0.01,0.13l0.29,0.91l-0.19,1.64l0.11,0.27l2.72,2.27l0.15,0.07l2.71,0.41l0.92,0.88l0.12,0.07l1.64,0.49l1.0,0.71l0.18,0.06l1.5,-0.02l1.24,0.64l0.1,1.31l0.05,0.14l0.44,0.68l0.02,0.73l-0.44,0.03l-0.27,0.39l0.96,2.99l0.28,0.21l4.43,0.1l-0.28,1.12l0.0,0.15l0.27,1.02l0.15,0.19l1.27,0.67l0.52,1.42l-0.42,1.91l-0.66,1.1l-0.04,0.2l0.21,1.3l-0.19,0.13l-0.01,-0.27l-0.15,-0.24l-2.33,-1.33l-0.14,-0.04l-2.38,-0.03l-4.36,0.76l-0.21,0.16l-1.2,2.29l-0.03,0.13l-0.06,1.37l-0.79,2.53l-0.05,-0.08Z" data-code="BO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M781.17,166.78l1.8,0.67l0.28,-0.04l1.38,-1.01l0.43,2.67l-3.44,0.77l-0.18,0.12l-2.04,2.79l-3.71,-1.94l-0.42,0.15l-1.29,3.11l-2.32,0.04l-0.3,-2.63l1.12,-2.1l2.51,-0.16l0.28,-0.25l0.73,-4.22l0.58,-1.9l2.59,2.84l2.0,1.1ZM773.66,187.36l-0.92,2.24l-0.01,0.2l0.4,1.3l-1.18,1.81l-3.06,1.28l-4.35,0.17l-0.19,0.08l-3.4,3.06l-1.36,-0.87l-0.1,-1.95l-0.34,-0.28l-4.35,0.62l-2.99,1.33l-2.87,0.05l-0.28,0.2l0.09,0.33l2.37,1.93l-1.57,4.44l-1.35,0.97l-0.9,-0.79l0.57,-2.32l-0.15,-0.34l-1.5,-0.77l-0.81,-1.53l2.04,-0.75l0.14,-0.1l1.28,-1.72l2.47,-1.43l1.84,-1.92l4.83,-0.82l2.62,0.57l0.33,-0.16l2.45,-4.77l1.38,1.14l0.38,0.0l5.1,-4.02l0.09,-0.11l1.57,-3.57l0.02,-0.16l-0.42,-3.22l0.94,-1.67l2.27,-0.47l1.26,3.82l-0.07,2.23l-2.26,2.86l-0.06,0.19l0.04,2.93ZM757.85,196.18l0.22,0.66l-1.11,1.33l-0.8,-0.7l-0.33,-0.04l-1.28,0.65l-0.14,0.15l-0.54,1.34l-1.17,-0.57l0.02,-1.03l1.2,-1.45l1.24,0.28l0.29,-0.1l0.9,-1.03l1.51,0.5Z" data-code="JP" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M494.7,295.83l-0.14,-2.71l-0.04,-0.13l-0.34,-0.62l0.93,0.12l0.3,-0.16l0.67,-1.25l0.9,0.11l0.11,0.76l0.08,0.16l0.46,0.48l0.02,0.56l-0.55,0.48l-0.96,1.29l-0.82,0.82l-0.61,0.07Z" data-code="BI" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M427.4,268.94l-1.58,0.22l-0.52,-1.45l0.11,-5.73l-0.08,-0.21l-0.43,-0.44l-0.09,-1.13l-0.09,-0.19l-1.52,-1.52l0.24,-1.01l0.7,-0.23l0.18,-0.16l0.45,-0.97l1.07,-0.21l0.19,-0.12l0.53,-0.73l0.73,-0.65l0.68,-0.0l1.69,1.3l-0.08,0.67l0.02,0.14l0.52,1.38l-0.44,0.9l-0.01,0.24l0.2,0.52l-1.1,1.42l-0.76,0.76l-0.08,0.13l-0.47,1.59l0.05,1.69l-0.13,3.79Z" data-code="BJ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M650.38,213.78l0.88,0.75l-0.13,1.24l-1.77,0.07l-2.1,-0.18l-1.57,0.4l-2.02,-0.91l-0.02,-0.24l1.54,-1.87l1.18,-0.6l1.67,0.59l1.32,0.08l1.01,0.67Z" data-code="BT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M226.67,238.37l1.64,0.23l1.2,0.56l0.11,0.19l-1.25,0.03l-0.14,0.04l-0.65,0.37l-1.24,-0.37l-1.17,-0.77l0.11,-0.22l0.86,-0.15l0.52,0.08Z" data-code="JM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M484.91,331.96l0.53,0.52l0.82,1.53l2.83,2.86l0.14,0.08l0.85,0.22l0.03,0.81l0.74,1.66l0.21,0.17l1.87,0.39l1.17,0.87l-3.13,1.71l-2.3,2.01l-0.07,0.1l-0.82,1.74l-0.66,0.88l-1.24,0.19l-0.24,0.2l-0.65,1.98l-1.4,0.55l-1.9,-0.12l-1.2,-0.74l-1.06,-0.32l-0.22,0.02l-1.22,0.62l-0.14,0.14l-0.58,1.21l-1.16,0.79l-1.18,1.13l-1.5,0.23l-0.4,-0.68l0.22,-1.53l-0.04,-0.19l-1.48,-2.54l-0.11,-0.11l-0.53,-0.31l-0.0,-7.25l2.18,-0.08l0.29,-0.3l0.07,-9.0l1.63,-0.08l3.69,-0.86l0.84,0.93l0.38,0.05l1.53,-0.97l0.79,-0.03l1.3,-0.53l0.23,0.1l0.92,1.96Z" data-code="BW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M259.49,274.87l1.42,0.25l1.97,0.62l0.28,-0.05l0.67,-0.55l1.76,-0.38l2.8,-0.94l0.12,-0.08l0.92,-0.96l0.05,-0.33l-0.15,-0.32l0.73,-0.06l0.36,0.35l-0.27,0.93l0.17,0.36l0.76,0.34l0.44,0.9l-0.58,0.73l-0.06,0.13l-0.4,2.13l0.03,0.19l0.62,1.22l0.17,1.11l0.11,0.19l1.54,1.18l0.15,0.06l1.23,0.12l0.29,-0.15l0.2,-0.36l0.71,-0.11l1.13,-0.44l0.79,-0.63l1.25,0.19l0.65,-0.08l1.32,0.2l0.32,-0.18l0.23,-0.51l-0.05,-0.31l-0.31,-0.37l0.11,-0.31l0.75,0.17l0.13,0.0l1.1,-0.24l1.34,0.5l1.08,0.51l0.33,-0.05l0.67,-0.58l0.27,0.05l0.28,0.57l0.31,0.17l1.2,-0.18l0.17,-0.08l1.03,-1.05l0.76,-1.82l1.39,-2.16l0.49,-0.07l0.52,1.17l1.4,4.37l0.2,0.2l1.14,0.35l0.05,1.39l-1.8,1.97l0.01,0.42l0.78,0.75l0.18,0.08l4.16,0.37l0.08,2.25l0.5,0.22l1.78,-1.54l2.98,0.85l4.07,1.5l1.07,1.28l-0.37,1.23l0.36,0.38l2.83,-0.75l4.8,1.3l3.75,-0.09l3.6,2.02l3.27,2.84l1.93,0.72l2.13,0.11l0.76,0.66l1.22,4.56l-0.96,4.03l-1.22,1.58l-3.52,3.51l-1.63,2.91l-1.75,2.09l-0.5,0.04l-0.26,0.19l-0.72,1.99l0.18,4.76l-0.95,5.56l-0.74,0.96l-0.06,0.15l-0.43,3.39l-2.49,3.34l-0.06,0.13l-0.4,2.56l-1.9,1.07l-0.13,0.16l-0.51,1.38l-2.59,0.0l-3.94,1.01l-1.82,1.19l-2.85,0.81l-3.01,2.17l-2.12,2.65l-0.06,0.13l-0.36,2.0l0.01,0.13l0.4,1.42l-0.45,2.63l-0.53,1.23l-1.76,1.53l-2.76,4.79l-2.16,2.15l-1.69,1.29l-0.09,0.12l-1.12,2.6l-1.3,1.26l-0.45,-1.02l0.99,-1.18l0.01,-0.37l-1.5,-1.95l-1.98,-1.54l-2.58,-1.77l-0.2,-0.05l-0.81,0.07l-2.42,-2.05l-0.25,-0.07l-0.77,0.14l2.75,-3.07l2.8,-2.61l1.67,-1.09l2.11,-1.49l0.13,-0.24l0.05,-2.15l-0.07,-0.2l-1.26,-1.54l-0.35,-0.09l-0.64,0.27l0.3,-0.95l0.34,-1.57l0.01,-1.52l-0.16,-0.26l-0.9,-0.48l-0.27,-0.01l-0.86,0.39l-0.65,-0.08l-0.23,-0.8l-0.23,-2.39l-0.04,-0.12l-0.47,-0.79l-0.14,-0.12l-1.69,-0.71l-0.25,0.01l-0.93,0.47l-2.29,-0.44l0.15,-3.3l-0.03,-0.15l-0.62,-1.22l0.57,-0.39l0.13,-0.3l-0.22,-1.37l0.67,-1.13l0.44,-2.04l-0.01,-0.17l-0.59,-1.61l-0.14,-0.16l-1.25,-0.66l-0.22,-0.82l0.35,-1.41l-0.28,-0.37l-4.59,-0.1l-0.78,-2.41l0.34,-0.02l0.28,-0.31l-0.03,-1.1l-0.05,-0.16l-0.45,-0.68l-0.1,-1.4l-0.16,-0.24l-1.45,-0.76l-0.14,-0.03l-1.48,0.02l-1.04,-0.73l-1.62,-0.48l-0.93,-0.9l-0.16,-0.08l-2.72,-0.41l-2.53,-2.12l0.18,-1.54l-0.01,-0.13l-0.29,-0.91l0.26,-1.83l-0.34,-0.34l-3.28,0.43l-0.14,0.05l-1.3,0.93l-2.16,1.01l-0.12,0.09l-0.47,0.65l-1.12,0.05l-1.84,-0.21l-0.12,0.01l-1.33,0.41l-0.82,-0.21l0.16,-3.6l-0.48,-0.26l-1.97,1.43l-1.96,-0.06l-0.86,-1.23l-0.22,-0.13l-1.23,-0.11l0.34,-0.69l-0.05,-0.33l-1.36,-1.5l-0.92,-2.0l0.45,-0.32l0.13,-0.25l-0.0,-0.87l1.34,-0.64l0.17,-0.32l-0.23,-1.23l0.56,-0.77l0.05,-0.13l0.16,-1.03l2.7,-1.61l2.01,-0.47l0.16,-0.09l0.24,-0.27l2.11,0.11l0.31,-0.25l1.13,-6.87l0.06,-1.12l-0.4,-1.53l-0.1,-0.15l-1.0,-0.82l0.01,-1.45l1.08,-0.32l0.39,0.2l0.44,-0.24l0.08,-0.96l-0.25,-0.32l-1.22,-0.22l-0.02,-1.01l4.57,0.05l0.22,-0.09l0.6,-0.63l0.44,0.5l0.47,1.42l0.45,0.16l0.27,-0.18l1.21,1.16l0.23,0.08l1.95,-0.16l0.23,-0.14l0.43,-0.67l1.76,-0.55l1.05,-0.42l0.18,-0.2l0.25,-0.92l1.65,-0.66l0.18,-0.35l-0.14,-0.53l-0.26,-0.22l-1.91,-0.19l-0.29,-1.33l0.1,-1.64l-0.15,-0.28l-0.44,-0.25Z" data-code="BR" fill="#5a8292" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M227.51,216.69l0.3,0.18l-0.24,1.07l0.03,-1.04l-0.09,-0.21ZM226.5,224.03l-0.13,0.03l-0.54,-1.3l-0.09,-0.12l-0.78,-0.64l0.4,-1.26l0.33,0.05l0.79,2.0l0.01,1.24ZM225.76,216.5l-2.16,0.34l-0.07,-0.41l0.85,-0.16l1.36,0.07l0.02,0.16Z" data-code="BS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M480.08,135.28l2.09,0.02l0.13,-0.03l2.72,-1.3l0.16,-0.19l0.55,-1.83l1.94,-1.06l0.15,-0.31l-0.2,-1.33l1.33,-0.52l2.58,-1.3l2.39,0.8l0.3,0.75l0.37,0.17l1.22,-0.39l2.18,0.75l0.2,1.36l-0.48,0.85l0.01,0.32l1.57,2.26l0.92,0.6l-0.1,0.41l0.19,0.35l1.61,0.57l0.48,0.6l-0.64,0.49l-1.91,-0.11l-0.18,0.05l-0.48,0.32l-0.1,0.39l0.57,1.1l0.51,1.78l-1.79,0.17l-0.18,0.08l-0.77,0.73l-0.09,0.19l-0.13,1.31l-0.75,-0.22l-2.11,0.15l-0.56,-0.66l-0.39,-0.06l-0.8,0.49l-0.79,-0.4l-0.13,-0.03l-1.94,-0.07l-2.76,-0.79l-2.58,-0.27l-1.98,0.07l-0.15,0.05l-1.31,0.86l-0.8,0.09l-0.04,-1.16l-0.03,-0.12l-0.63,-1.28l1.22,-0.56l0.17,-0.27l0.01,-1.35l-0.04,-0.15l-0.66,-1.24l-0.08,-1.12Z" data-code="BY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M198.03,239.7l0.28,0.19l0.43,-0.1l0.82,-1.42l0.0,0.07l0.29,0.29l0.16,0.0l-0.02,0.35l-0.39,1.08l0.02,0.25l0.16,0.29l-0.23,0.8l0.04,0.24l0.09,0.14l-0.25,1.12l-0.38,0.53l-0.33,0.06l-0.21,0.15l-0.41,0.74l-0.25,0.0l0.17,-2.58l0.01,-2.2Z" data-code="BZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M688.57,38.85l0.63,2.39l0.44,0.19l2.22,-1.23l7.18,0.07l5.54,2.49l1.85,1.77l-0.55,2.34l-2.64,1.42l-6.57,2.76l-1.95,1.5l0.12,0.53l3.09,0.68l3.69,1.23l0.21,-0.01l1.98,-0.81l1.16,2.84l0.5,0.08l1.03,-1.18l3.86,-0.74l7.79,0.78l0.56,2.05l0.27,0.22l10.47,0.71l0.32,-0.29l0.13,-3.34l4.98,0.8l3.96,-0.02l3.88,2.43l1.06,2.79l-1.38,1.83l0.01,0.38l3.15,3.64l0.1,0.08l3.94,1.86l0.4,-0.14l2.28,-4.56l3.75,1.94l0.22,0.02l4.18,-1.22l4.76,1.4l0.26,-0.04l1.74,-1.23l3.98,0.63l0.32,-0.41l-1.71,-4.1l3.0,-1.86l22.39,3.04l2.06,2.67l0.1,0.08l6.55,3.51l0.17,0.03l10.08,-0.86l4.86,0.73l1.91,1.72l-0.29,3.13l0.18,0.31l3.08,1.26l0.19,0.01l3.32,-0.9l4.37,-0.11l4.78,0.87l4.61,-0.48l4.26,3.82l0.32,0.05l3.1,-1.4l0.12,-0.45l-1.91,-2.67l0.92,-1.64l7.78,1.22l5.22,-0.26l7.12,2.1l9.6,5.22l6.4,4.15l-0.2,2.44l0.14,0.28l1.69,1.04l0.45,-0.31l-0.51,-2.66l6.31,0.58l4.52,3.61l-2.1,1.52l-4.02,0.42l-0.27,0.29l-0.06,3.83l-0.81,0.67l-2.14,-0.11l-1.91,-1.39l-3.19,-1.13l-0.51,-1.63l-0.21,-0.2l-2.54,-0.67l-0.13,-0.0l-2.69,0.5l-1.12,-1.19l0.48,-1.36l-0.38,-0.39l-3.0,0.98l-0.17,0.44l1.02,1.76l-1.27,1.55l-3.09,1.71l-3.15,-0.29l-0.3,0.18l0.07,0.34l2.22,2.1l1.47,3.22l1.15,1.09l0.25,1.41l-0.48,0.76l-4.47,-0.81l-0.17,0.02l-6.97,2.9l-2.2,0.44l-0.11,0.05l-3.83,2.68l-3.63,2.32l-0.1,0.11l-0.76,1.4l-3.3,-2.4l-0.3,-0.03l-6.31,2.85l-0.99,-1.21l-0.4,-0.06l-2.32,1.54l-3.23,-0.49l-0.33,0.2l-0.79,2.39l-2.97,3.51l-0.07,0.21l0.09,1.47l0.22,0.27l2.62,0.74l-0.3,4.7l-2.06,0.12l-0.26,0.2l-1.07,2.94l0.04,0.27l0.83,1.19l-4.03,1.63l-0.18,0.21l-0.83,3.72l-3.55,0.79l-0.23,0.23l-0.73,3.32l-3.22,2.76l-0.76,-1.88l-1.07,-4.88l-1.39,-7.59l1.17,-4.76l2.05,-2.08l0.09,-0.19l0.11,-1.46l3.67,-0.77l0.15,-0.08l4.47,-4.61l4.29,-3.82l4.48,-3.01l0.11,-0.14l2.01,-5.43l-0.31,-0.4l-3.04,0.33l-0.24,0.17l-1.47,3.11l-5.98,3.94l-1.91,-4.36l-0.33,-0.17l-6.46,1.3l-0.15,0.08l-6.27,6.33l-0.01,0.41l1.7,1.87l-5.04,0.87l-3.51,0.34l0.16,-2.32l-0.26,-0.32l-3.89,-0.56l-0.19,0.04l-3.02,1.77l-7.63,-0.63l-8.24,1.1l-0.16,0.07l-8.11,7.09l-9.6,8.31l0.16,0.52l3.79,0.42l1.16,2.03l0.17,0.14l2.43,0.76l0.31,-0.08l1.5,-1.61l2.49,0.2l3.46,3.6l0.08,2.67l-1.91,3.26l-0.04,0.14l-0.21,3.91l-1.11,5.09l-3.73,4.55l-0.87,2.21l-6.73,7.14l-1.59,1.77l-3.23,1.72l-1.38,0.03l-1.48,-1.39l-0.37,-0.03l-3.36,2.22l-0.11,0.14l-0.16,0.42l-0.01,-1.09l1.0,-0.06l0.28,-0.27l0.36,-3.6l-0.61,-2.51l1.85,-0.94l2.94,0.53l0.32,-0.15l1.71,-3.1l0.84,-3.38l0.97,-1.18l1.32,-2.88l-0.34,-0.42l-4.14,0.95l-2.18,1.25l-3.51,-0.0l-0.95,-2.81l-0.1,-0.14l-2.97,-2.3l-0.11,-0.05l-4.19,-1.0l-0.89,-3.08l-0.87,-2.03l-0.95,-1.46l-1.54,-3.37l-0.12,-0.14l-2.27,-1.28l-3.83,-1.02l-3.37,0.1l-3.11,0.61l-0.13,0.06l-2.07,1.69l0.04,0.49l1.23,0.72l0.03,1.53l-1.34,1.05l-2.26,3.51l-0.05,0.17l0.02,1.27l-3.25,1.9l-2.87,-1.17l-0.14,-0.02l-2.86,0.26l-1.22,-1.02l-0.12,-0.06l-1.5,-0.35l-0.23,0.04l-3.62,2.27l-3.24,0.53l-2.2"""),
format.raw("""8,0.79l-3.08,-0.51l-2.24,0.03l-1.49,-1.61l-2.45,-1.57l-0.11,-0.04l-2.6,-0.43l-3.17,0.43l-2.31,0.59l-3.31,-1.28l-0.45,-2.31l-0.21,-0.23l-2.94,-0.85l-2.26,-0.39l-2.77,-1.36l-0.37,0.09l-2.59,3.45l-0.03,0.32l0.91,1.74l-2.15,2.01l-3.47,-0.79l-2.44,-0.12l-1.59,-1.46l-0.2,-0.08l-2.55,-0.05l-2.12,-0.98l-0.24,-0.01l-3.85,1.57l-4.74,2.79l-2.59,0.55l-0.79,0.21l-1.21,-1.81l-0.29,-0.13l-3.05,0.41l-0.96,-1.25l-0.14,-0.1l-1.65,-0.6l-1.15,-1.82l-0.13,-0.12l-1.38,-0.6l-0.19,-0.02l-3.49,0.82l-3.35,-1.85l-0.38,0.08l-1.08,1.4l-5.36,-8.17l-3.02,-2.52l0.72,-0.85l0.01,-0.38l-0.37,-0.08l-6.22,3.21l-1.98,0.16l0.17,-1.51l-0.2,-0.31l-3.22,-1.17l-0.19,-0.0l-2.3,0.74l-0.72,-3.27l-0.24,-0.23l-4.5,-0.75l-0.21,0.04l-2.2,1.42l-6.21,1.27l-0.11,0.05l-1.16,0.81l-9.3,1.19l-0.18,0.09l-1.15,1.17l-0.02,0.39l1.56,2.01l-2.02,0.74l-0.16,0.42l0.35,0.68l-2.18,1.49l0.02,0.51l3.83,2.16l-0.45,1.13l-3.31,-0.13l-0.25,0.12l-0.57,0.77l-2.97,-1.59l-0.15,-0.04l-3.97,0.07l-0.13,0.03l-2.53,1.32l-2.84,-1.28l-5.52,-2.3l-0.12,-0.02l-3.91,0.09l-0.16,0.05l-5.17,3.6l-0.13,0.21l-0.25,1.89l-2.17,-1.6l-0.44,0.1l-2.0,3.59l0.06,0.37l0.55,0.5l-1.32,2.23l0.04,0.36l2.13,2.17l0.23,0.09l1.7,-0.08l1.42,1.89l-0.23,1.5l0.19,0.32l0.94,0.38l-0.89,1.44l-2.3,0.49l-0.17,0.11l-2.49,3.2l0.0,0.37l2.2,2.81l-0.23,1.93l0.06,0.22l2.56,3.32l-1.27,1.02l-0.4,0.66l-0.8,-0.15l-1.65,-1.75l-0.18,-0.09l-0.66,-0.09l-1.45,-0.64l-0.72,-1.16l-0.18,-0.13l-2.34,-0.63l-0.17,0.0l-1.32,0.41l-0.31,-0.4l-0.12,-0.09l-3.49,-1.48l-3.67,-0.49l-2.1,-0.52l-0.3,0.1l-0.12,0.14l-2.96,-2.4l-2.89,-1.19l-1.69,-1.42l1.27,-0.35l0.16,-0.1l2.08,-2.61l-0.04,-0.41l-1.02,-0.9l3.21,-1.12l0.2,-0.31l-0.07,-0.69l-0.37,-0.26l-1.86,0.42l0.05,-0.86l1.11,-0.76l2.35,-0.23l0.25,-0.19l0.39,-1.07l0.0,-0.19l-0.51,-1.64l0.95,-1.58l0.04,-0.16l-0.03,-0.95l-0.22,-0.28l-3.69,-1.06l-1.43,0.02l-1.45,-1.44l-0.29,-0.08l-1.83,0.49l-2.88,-1.04l0.04,-0.42l-0.04,-0.18l-0.89,-1.43l-0.23,-0.14l-1.77,-0.14l-0.13,-0.66l0.52,-0.56l0.01,-0.4l-1.6,-1.9l-0.27,-0.1l-2.55,0.32l-0.71,-0.16l-0.3,0.1l-0.53,0.63l-0.58,-0.08l-0.56,-1.97l-0.48,-0.94l0.17,-0.11l1.92,0.11l0.2,-0.06l0.97,-0.74l0.05,-0.42l-0.72,-0.91l-0.13,-0.1l-1.43,-0.51l0.09,-0.36l-0.13,-0.33l-0.97,-0.59l-1.43,-2.06l0.44,-0.77l0.04,-0.19l-0.25,-1.64l-0.2,-0.24l-2.45,-0.84l-0.19,-0.0l-1.05,0.34l-0.25,-0.62l-0.18,-0.17l-2.5,-0.84l-0.74,-1.93l-0.21,-1.7l-0.13,-0.21l-0.92,-0.63l0.83,-0.89l0.07,-0.27l-0.71,-3.26l1.69,-2.01l0.03,-0.34l-0.24,-0.41l2.63,-1.9l-0.01,-0.49l-2.31,-1.57l5.08,-4.61l2.33,-2.24l1.01,-2.08l-0.09,-0.37l-3.52,-2.56l0.94,-2.38l-0.04,-0.29l-2.14,-2.86l1.61,-3.35l-0.01,-0.29l-2.81,-4.58l2.19,-3.04l-0.06,-0.42l-3.7,-2.76l0.32,-2.67l1.87,-0.38l4.26,-1.77l2.46,-1.47l3.96,2.58l0.12,0.05l6.81,1.04l9.37,4.87l1.81,1.92l0.15,2.55l-2.61,2.06l-3.95,1.07l-11.1,-3.15l-0.17,0.0l-1.84,0.53l-0.1,0.53l3.97,2.97l0.15,1.77l0.16,4.14l0.19,0.27l3.21,1.22l1.94,1.03l0.44,-0.22l0.32,-1.94l-0.07,-0.25l-1.32,-1.52l1.25,-1.2l5.87,2.45l0.24,-0.01l2.11,-0.98l0.13,-0.42l-1.55,-2.75l5.52,-3.84l2.13,0.22l2.28,1.42l0.43,-0.12l1.46,-2.87l-0.04,-0.33l-1.97,-2.37l1.14,-2.38l-0.02,-0.3l-1.42,-2.07l6.15,1.22l1.14,1.92l-2.74,0.46l-0.25,0.3l0.02,2.36l0.12,0.24l1.97,1.44l0.25,0.05l3.87,-0.91l0.22,-0.23l0.58,-2.55l5.09,-1.98l8.67,-3.69l1.22,0.14l-2.06,2.2l0.18,0.5l3.11,0.45l0.23,-0.07l1.71,-1.41l4.59,-0.12l0.12,-0.03l3.53,-1.72l2.7,2.48l0.42,-0.01l2.85,-2.88l-0.0,-0.43l-2.42,-2.35l1.0,-1.13l7.2,1.31l3.42,1.36l9.06,4.97l0.39,-0.08l1.67,-2.27l-0.04,-0.4l-2.46,-2.23l-0.06,-0.82l-0.26,-0.27l-2.64,-0.38l0.69,-1.76l0.0,-0.22l-1.32,-3.47l-0.07,-1.27l4.52,-4.09l0.08,-0.11l1.6,-4.18l1.67,-0.84l6.33,1.2l0.46,2.31l-2.31,3.67l0.05,0.38l1.49,1.41l0.77,3.04l-0.56,6.05l0.09,0.24l2.62,2.54l-0.99,2.65l-4.87,5.96l0.17,0.48l2.86,0.61l0.31,-0.13l0.94,-1.42l2.67,-1.04l0.18,-0.19l0.64,-2.01l2.11,-1.98l0.05,-0.37l-1.38,-2.32l1.11,-2.74l-0.24,-0.41l-2.53,-0.33l-0.53,-2.16l1.96,-4.42l-0.05,-0.32l-3.03,-3.48l4.21,-2.94l0.12,-0.3l-0.52,-3.04l0.72,-0.06l1.18,2.35l-0.97,4.39l0.2,0.35l2.68,0.84l0.37,-0.38l-1.05,-3.07l3.89,-1.71l5.05,-0.24l4.55,2.62l0.36,-0.05l0.05,-0.36l-2.19,-3.84l-0.23,-4.78l4.07,-0.92l5.98,0.21l5.47,-0.64l0.2,-0.48l-1.88,-2.37l2.65,-2.99l2.75,-0.13l0.12,-0.03l4.82,-2.48l6.56,-0.67l0.23,-0.14l0.76,-1.27l6.33,-0.46l1.97,1.11l0.28,0.01l5.55,-2.71l4.53,0.08l0.29,-0.21l0.67,-2.18l2.29,-2.15l5.75,-2.13l3.48,1.4l-2.7,1.03l-0.19,0.31l0.26,0.26l5.47,0.78ZM871.83,65.73l0.25,-0.15l1.99,0.01l3.3,1.2l-0.08,0.22l-2.41,1.03l-5.73,0.49l-0.31,-1.0l2.99,-1.8ZM797.64,48.44l-2.22,1.51l-3.85,-0.43l-4.35,-1.85l0.42,-1.13l4.42,0.72l5.59,1.17ZM783.82,46.06l-1.71,3.25l-9.05,-0.14l-4.11,1.15l-4.64,-3.04l1.21,-3.13l3.11,-0.91l6.53,0.22l8.66,2.59ZM780.37,145.71l2.28,5.23l-3.09,-0.89l-0.37,0.19l-1.54,4.65l0.04,0.27l2.38,3.17l-0.05,1.4l-1.41,-1.41l-0.46,0.04l-1.23,1.81l-0.33,-1.86l0.28,-3.1l-0.28,-3.41l0.58,-2.46l0.11,-4.39l-0.03,-0.13l-1.44,-3.2l0.21,-4.39l2.19,-1.49l0.09,-0.41l-0.81,-1.3l0.48,-0.21l0.56,1.94l0.86,3.23l-0.05,3.36l1.03,3.35ZM780.16,57.18l-3.4,0.03l-5.06,-0.53l1.97,-1.59l2.95,-0.42l3.35,1.75l0.18,0.77ZM683.84,31.18l-13.29,1.97l4.16,-6.56l1.88,-0.58l1.77,0.34l6.08,3.02l-0.6,1.8ZM670.94,28.02l-5.18,0.65l-6.89,-1.58l-4.03,-2.07l-1.88,-3.98l-0.18,-0.16l-2.8,-0.93l5.91,-3.62l5.25,-1.29l4.73,2.88l5.63,5.44l-0.57,4.66ZM564.37,68.98l-0.85,0.23l-7.93,-0.57l-0.6,-1.84l-0.21,-0.2l-4.34,-1.18l-0.3,-2.08l2.34,-0.92l0.19,-0.29l-0.08,-2.43l4.85,-4.0l-0.12,-0.52l-1.68,-0.43l5.47,-3.94l0.11,-0.33l-0.6,-2.02l5.36,-2.55l8.22,-3.27l8.29,-0.96l4.34,-1.94l4.67,-0.65l1.45,1.72l-1.43,1.37l-8.8,2.52l-7.65,2.42l-7.92,4.84l-3.73,4.75l-3.92,4.58l-0.07,0.23l0.51,3.88l0.11,0.2l4.32,3.39ZM548.86,18.57l-3.28,0.75l-2.25,0.44l-0.22,0.19l-0.3,0.81l-2.67,0.86l-2.27,-1.14l1.2,-1.51l-0.23,-0.49l-3.14,-0.1l2.48,-0.54l3.55,-0.07l0.44,1.36l0.49,0.12l1.4,-1.35l2.2,-0.9l3.13,1.08l-0.54,0.49ZM477.5,133.25l-4.21,0.05l-2.69,-0.34l0.39,-1.03l3.24,-1.06l2.51,0.58l0.85,0.43l-0.2,0.71l-0.0,0.15l0.12,0.52Z" data-code="RU" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M497.03,288.12l0.78,1.11l-0.12,1.19l-0.49,0.21l-1.25,-0.15l-0.3,0.16l-0.67,1.24l-1.01,-0.13l0.16,-0.92l0.22,-0.12l0.15,-0.24l0.09,-1.37l0.49,-0.48l0.42,0.18l0.25,-0.01l1.26,-0.65Z" data-code="RW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M469.75,168.65l0.21,-0.21l0.36,-1.44l-0.08,-0.29l-1.06,-1.03l0.54,-1.16l-0.28,-0.43l-0.26,0.0l0.55,-0.67l-0.01,-0.39l-0.77,-0.86l-0.45,-0.89l1.56,-0.67l1.39,0.12l1.22,1.1l0.26,0.91l0.16,0.19l1.38,0.66l0.17,1.12l0.14,0.21l1.46,0.9l0.35,-0.03l0.62,-0.54l0.09,0.06l-0.28,0.25l-0.03,0.42l0.29,0.34l-0.44,0.5l-0.07,0.26l0.22,1.12l0.07,0.14l1.02,1.1l-0.81,0.84l-0.42,0.96l0.04,0.3l0.12,0.15l-0.15,0.16l-1.04,0.04l-0.39,0.08l0.33,-0.81l-0.29,-0.41l-0.21,0.01l-0.39,-0.45l-0.13,-0.09l-0.32,-0.11l-0.27,-0.4l-0.14,-0.11l-0.4,-0.16l-0.31,-0.37l-0.34,-0.09l-0.45,0.17l-0.18,0.18l-0.29,0.84l-0.96,-0.65l-0.81,-0.33l-0.32,-0.37l-0.22,-0.18Z" data-code="RS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M478.13,133.31l-0.14,-0.63l0.25,-0.88l-0.15,-0.35l-1.17,-0.58l-2.43,-0.57l-0.45,-2.51l2.58,-0.97l4.14,0.22l2.3,-0.32l0.26,0.54l0.22,0.17l1.26,0.22l2.25,1.6l0.19,1.23l-1.87,1.01l-0.14,0.18l-0.54,1.83l-2.54,1.21l-2.18,-0.02l-0.52,-0.91l-0.18,-0.14l-1.11,-0.32Z" data-code="LT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M435.95,147.99l0.33,0.49l-0.11,1.07l-0.39,0.04l-0.29,-0.15l0.21,-1.4l0.25,-0.05Z" data-code="LU" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M401.37,273.67l-0.32,0.01l-2.48,-1.15l-2.24,-1.89l-2.14,-1.38l-1.47,-1.42l0.44,-0.59l0.05,-0.13l0.12,-0.65l1.07,-1.3l1.08,-1.09l0.52,-0.07l0.43,-0.18l0.84,1.24l-0.15,0.89l0.07,0.25l0.49,0.54l0.22,0.1l0.71,0.01l0.27,-0.16l0.42,-0.83l0.19,0.02l-0.06,0.52l0.23,1.12l-0.5,1.03l0.06,0.35l0.73,0.69l0.14,0.08l0.71,0.15l0.92,0.91l0.06,0.76l-0.17,0.22l-0.06,0.15l-0.17,1.8Z" data-code="LR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M477.94,155.19l1.02,-0.64l1.49,0.33l1.52,0.01l1.09,0.73l0.32,0.01l0.81,-0.46l1.8,-0.3l0.18,-0.1l0.54,-0.64l0.86,0.0l0.64,0.26l0.71,0.87l0.8,1.35l1.39,1.81l0.07,1.25l-0.26,1.3l0.01,0.15l0.45,1.42l0.15,0.18l1.12,0.57l0.25,0.01l1.05,-0.45l0.86,0.4l0.03,0.43l-0.92,0.51l-0.63,-0.24l-0.4,0.22l-0.64,3.41l-1.12,-0.24l-1.78,-1.09l-0.23,-0.04l-2.95,0.71l-1.25,0.77l-3.55,-0.16l-1.89,-0.47l-0.14,-0.0l-0.75,0.17l-0.61,-1.07l-0.3,-0.36l0.36,-0.32l-0.04,-0.48l-0.62,-0.38l-0.36,0.03l-0.62,0.54l-1.15,-0.71l-0.18,-1.14l-0.17,-0.22l-1.4,-0.67l-0.24,-0.86l-0.09,-0.14l-0.96,-0.87l1.49,-0.44l0.16,-0.11l1.51,-2.14l1.15,-2.09l1.44,-0.63Z" data-code="RO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M383.03,256.73l-1.12,-0.88l-0.14,-0.06l-0.94,-0.15l-0.43,-0.54l0.01,-0.27l-0.13,-0.26l-0.68,-0.48l-0.05,-0.16l0.99,-0.31l0.77,0.08l0.15,-0.02l0.61,-0.26l4.25,0.1l-0.02,0.44l-0.19,0.18l-0.08,0.29l0.17,0.66l-0.17,0.14l-0.44,0.0l-0.16,0.05l-0.57,0.37l-0.66,-0.04l-0.24,0.1l-0.92,1.03Z" data-code="GW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M195.13,249.89l-1.05,-0.35l-1.5,-0.04l-1.06,-0.47l-1.19,-0.93l0.04,-0.53l0.27,-0.55l-0.03,-0.31l-0.24,-0.32l1.02,-1.77l3.04,-0.01l0.3,-0.28l0.06,-0.88l-0.19,-0.3l-0.3,-0.11l-0.23,-0.45l-0.11,-0.12l-0.9,-0.58l-0.35,-0.33l0.37,-0.0l0.3,-0.3l0.0,-1.15l4.05,0.02l-0.02,1.74l-0.2,2.89l0.3,0.32l0.67,-0.0l0.75,0.42l0.4,-0.11l-0.62,0.53l-1.17,0.7l-0.13,0.16l-0.18,0.49l0.0,0.21l0.14,0.34l-0.35,0.44l-0.49,0.13l-0.2,0.41l0.03,0.06l-0.27,0.16l-0.86,0.64l-0.12,0.22ZM199.35,245.38l0.07,-0.13l0.05,0.02l-0.13,0.11Z" data-code="GT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M487.2,174.55l-0.64,1.54l-0.43,0.24l-1.41,-0.08l-1.28,-0.28l-0.14,0.0l-3.03,0.77l-0.13,0.51l1.39,1.34l-0.78,0.29l-1.2,0.0l-1.23,-1.42l-0.47,0.02l-0.47,0.65l-0.04,0.27l0.56,1.76l0.06,0.11l1.02,1.12l-0.66,0.45l-0.04,0.46l1.39,1.35l1.15,0.79l0.02,1.06l-1.91,-0.63l-0.36,0.42l0.56,1.12l-1.2,0.23l-0.22,0.4l0.8,2.14l-1.15,0.02l-1.89,-1.15l-0.89,-2.19l-0.43,-1.91l-0.05,-0.11l-0.98,-1.35l-1.24,-1.62l-0.13,-0.63l1.07,-1.32l0.06,-0.14l0.13,-0.81l0.68,-0.36l0.16,-0.25l0.03,-0.54l1.4,-0.23l0.12,-0.05l0.87,-0.6l1.26,0.05l0.25,-0.11l0.34,-0.43l0.33,-0.07l1.81,0.08l0.13,-0.02l1.87,-0.77l1.64,0.97l0.19,0.04l2.28,-0.28l0.26,-0.29l0.02,-0.95l0.56,0.36ZM480.44,192.0l1.05,0.74l0.01,0.0l-1.26,-0.23l0.2,-0.51ZM481.76,192.79l1.86,-0.15l1.53,0.17l-0.02,0.19l0.34,0.3l-2.28,0.15l0.01,-0.13l-0.25,-0.31l-1.19,-0.22ZM485.65,193.28l0.65,-0.16l-0.05,0.12l-0.6,0.04Z" data-code="GR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M444.81,282.04l-0.21,-0.17l0.74,-2.4l3.56,0.05l0.02,2.42l-3.34,-0.02l-0.76,0.13Z" data-code="GQ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M271.34,264.25l1.43,0.81l1.44,1.53l0.06,1.19l0.28,0.28l0.84,0.05l2.13,1.92l-0.34,1.93l-1.37,0.59l-0.17,0.34l0.12,0.51l-0.43,1.21l0.03,0.26l1.11,1.82l0.26,0.14l0.56,0.0l0.32,1.29l1.25,1.78l-0.08,0.01l-1.34,-0.21l-0.24,0.06l-0.78,0.64l-1.06,0.41l-0.76,0.1l-0.22,0.15l-0.18,0.32l-0.95,-0.1l-1.38,-1.05l-0.19,-1.13l-0.6,-1.18l0.37,-1.96l0.65,-0.83l0.03,-0.32l-0.57,-1.17l-0.15,-0.14l-0.62,-0.27l0.25,-0.85l-0.08,-0.3l-0.58,-0.58l-0.24,-0.09l-1.15,0.1l-1.41,-1.58l0.48,-0.49l0.09,-0.22l-0.04,-0.92l1.31,-0.34l0.73,-0.52l0.04,-0.44l-0.75,-0.82l0.16,-0.66l1.74,-1.3Z" data-code="GY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M525.41,174.19l0.26,-0.88l-0.0,-0.17l-0.63,-2.06l-0.1,-0.15l-1.45,-1.12l-0.11,-0.05l-1.31,-0.33l-0.66,-0.69l1.97,0.48l3.65,0.49l3.3,1.41l0.39,0.5l0.33,0.1l1.43,-0.45l2.14,0.58l0.7,1.14l0.13,0.12l1.06,0.47l-0.18,0.11l-0.08,0.43l1.08,1.41l-0.06,0.06l-1.16,-0.15l-1.82,-0.84l-0.31,0.04l-0.55,0.44l-3.29,0.44l-2.32,-1.41l-0.17,-0.04l-2.25,0.12Z" data-code="GE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M412.82,118.6l-2.31,3.4l-0.0,0.33l0.31,0.13l2.52,-0.49l2.34,0.02l-0.56,2.51l-2.22,3.13l0.22,0.47l2.43,0.21l2.35,4.35l0.17,0.14l1.58,0.51l1.49,3.78l0.73,1.37l0.2,0.15l2.76,0.59l-0.25,1.75l-1.18,0.91l-0.08,0.39l0.87,1.49l-1.96,1.51l-3.31,-0.02l-4.15,0.88l-1.07,-0.59l-0.35,0.04l-1.55,1.44l-2.17,-0.35l-0.22,0.05l-1.61,1.15l-0.78,-0.38l3.31,-3.12l2.18,-0.7l0.21,-0.31l-0.26,-0.27l-3.78,-0.54l-0.48,-0.9l2.3,-0.92l0.13,-0.46l-1.29,-1.71l0.39,-1.83l3.46,0.29l0.32,-0.24l0.37,-1.99l-0.06,-0.24l-1.71,-2.17l-0.18,-0.11l-2.91,-0.58l-0.43,-0.68l0.82,-1.4l-0.03,-0.35l-0.82,-0.97l-0.46,0.01l-0.85,1.05l-0.11,-2.6l-0.05,-0.16l-1.19,-1.7l0.86,-3.53l1.81,-2.75l1.88,0.26l2.38,-0.24ZM406.39,132.84l-1.09,1.92l-1.65,-0.62l-1.26,0.02l0.41,-1.46l0.0,-0.16l-0.42,-1.51l1.62,-0.11l2.39,1.92Z" data-code="GB" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M448.76,294.47l-2.38,-2.34l-1.63,-2.04l-1.46,-2.48l0.06,-0.66l0.54,-0.81l0.61,-1.82l0.46,-1.69l0.63,-0.11l3.62,0.03l0.3,-0.3l-0.02,-2.75l0.88,-0.12l1.47,0.32l0.13,0.0l1.39,-0.3l-0.13,0.87l0.03,0.19l0.7,1.29l0.3,0.16l1.74,-0.19l0.36,0.29l-1.01,2.7l0.05,0.29l1.13,1.42l0.25,1.82l-0.3,1.56l-0.64,0.99l-1.93,-0.09l-1.26,-1.13l-0.5,0.17l-0.16,0.91l-1.48,0.27l-0.12,0.05l-0.86,0.63l-0.08,0.39l0.81,1.42l-1.48,1.08Z" data-code="GA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M399.83,265.31l-0.69,-0.06l-0.3,0.16l-0.43,0.85l-0.39,-0.01l-0.3,-0.33l0.14,-0.87l-0.05,-0.22l-1.05,-1.54l-0.37,-0.11l-0.61,0.27l-0.84,0.12l0.02,-0.54l-0.04,-0.17l-0.35,-0.57l0.07,-0.63l-0.03,-0.17l-0.57,-1.11l-0.7,-0.9l-0.24,-0.12l-2.0,-0.0l-0.19,0.07l-0.51,0.42l-0.6,0.05l-0.21,0.11l-0.43,0.55l-0.3,0.7l-1.04,0.86l-0.91,-1.24l-1.0,-1.02l-0.69,-0.37l-0.52,-0.42l-0.3,-1.11l-0.37,-0.56l-0.1,-0.1l-0.4,-0.23l0.77,-0.85l0.62,0.04l0.18,-0.05l0.58,-0.38l0.46,-0.0l0.19,-0.07l0.39,-0.34l0.1,-0.3l-0.17,-0.67l0.15,-0.14l0.09,-0.2l0.03,-0.57l0.87,0.02l1.76,0.6l0.13,0.01l0.55,-0.06l0.22,-0.13l0.08,-0.12l1.18,0.17l0.17,-0.02l0.09,0.56l0.3,0.25l0.4,-0.0l0.14,-0.03l0.56,-0.29l0.23,0.05l0.63,0.59l0.15,0.07l1.07,0.2l0.24,-0.06l0.65,-0.52l0.77,-0.32l0.55,-0.32l0.3,0.04l0.44,0.45l0.34,0.74l0.84,0.87l-0.35,0.45l-0.06,0.15l-0.1,0.82l0.42,0.31l0.35,-0.16l0.05,0.04l-0.1,0.59l0.09,0.27l0.42,0.4l-0.06,0.02l-0.18,0.21l-0.2,0.86l0.03,0.21l0.56,1.02l0.52,1.71l-0.65,0.21l-0.15,0.12l-0.24,0.35l-0.03,0.28l0.16,0.41l-0.1,0.76l-0.12,0.0Z" data-code="GN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M379.18,251.48l0.15,-0.55l2.51,-0.07l0.21,-0.09l0.48,-0.52l0.58,-0.03l0.91,0.58l0.16,0.05l0.78,0.01l0.14,-0.03l0.59,-0.31l0.16,0.24l-0.71,0.38l-0.94,-0.04l-1.02,-0.51l-0.3,0.01l-0.86,0.55l-0.37,0.02l-0.14,0.04l-0.53,0.31l-1.81,-0.04Z" data-code="GM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M304.13,6.6l8.19,-3.63l8.72,0.28l0.19,-0.06l3.12,-2.28l8.75,-0.61l19.94,0.8l14.93,4.75l-3.92,2.01l-9.52,0.27l-13.48,0.6l-0.27,0.2l0.09,0.33l1.26,1.09l0.22,0.07l8.81,-0.67l7.49,2.07l0.19,-0.01l4.68,-1.78l1.76,1.84l-2.59,3.26l-0.01,0.36l0.34,0.11l6.35,-2.2l12.09,-2.32l7.31,1.14l1.17,2.13l-9.9,4.05l-1.43,1.32l-7.91,0.98l-0.26,0.31l0.29,0.29l5.25,0.25l-2.63,3.72l-2.02,3.61l-0.04,0.15l0.08,6.05l0.07,0.19l2.61,3.0l-3.4,0.2l-4.12,1.66l-0.04,0.54l4.5,2.67l0.53,3.9l-2.39,0.42l-0.19,0.48l2.91,3.83l-5.0,0.32l-0.27,0.22l0.12,0.33l2.69,1.84l-0.65,1.35l-3.36,0.71l-3.46,0.01l-0.21,0.51l3.05,3.15l0.02,1.53l-4.54,-1.79l-0.32,0.06l-1.29,1.26l0.11,0.5l3.33,1.15l3.17,2.74l0.85,3.29l-4.0,0.78l-1.83,-1.66l-3.1,-2.64l-0.36,-0.02l-0.13,0.33l0.8,2.92l-2.76,2.26l-0.09,0.33l0.28,0.2l6.59,0.19l2.47,0.18l-5.86,3.38l-6.76,3.43l-7.26,1.48l-2.73,0.02l-0.16,0.05l-2.67,1.72l-3.44,4.42l-5.28,2.86l-1.73,0.18l-3.33,1.01l-3.59,0.96l-0.15,0.1l-2.15,2.52l-0.07,0.19l-0.03,2.76l-1.21,2.49l-4.03,3.1l-0.1,0.33l0.98,2.94l-2.31,6.57l-3.21,0.21l-3.6,-3.0l-0.19,-0.07l-4.9,-0.02l-2.29,-1.97l-1.69,-3.78l-4.31,-4.86l-1.23,-2.52l-0.34,-3.58l-0.08,-0.17l-3.35,-3.67l0.85,-2.92l-0.09,-0.31l-1.5,-1.34l2.33,-4.7l3.67,-1.57l0.15,-0.13l1.02,-1.93l0.52,-3.47l-0.44,-0.31l-2.85,1.57l-1.33,0.64l-2.12,0.59l-2.81,-1.32l-0.15,-2.79l0.88,-2.17l2.09,-0.06l5.07,1.2l0.34,-0.17l-0.11,-0.37l-4.3,-2.9l-2.24,-1.58l-0.25,-0.05l-2.38,0.62l-1.7,-0.93l2.62,-4.1l-0.03,-0.36l-1.51,-1.75l-1.97,-3.3l-3.01,-5.21l-0.1,-0.11l-3.04,-1.85l0.03,-1.94l-0.18,-0.28l-6.82,-3.01l-5.35,-0.38l-6.69,0.21l-6.03,0.37l-2.81,-1.59l-3.84,-2.9l5.94,-1.5l5.01,-0.28l0.28,-0.29l-0.26,-0.31l-10.68,-1.38l-5.38,-2.1l0.27,-1.68l9.3,-2.6l9.18,-2.68l0.19,-0.16l0.97,-2.05l-0.18,-0.42l-6.29,-1.91l1.81,-1.9l8.58,-4.05l3.6,-0.63l0.23,-0.4l-0.92,-2.37l5.59,-1.5l7.66,-0.95l7.58,-0.05l2.65,1.84l0.31,0.02l6.52,-3.29l5.85,2.24l3.55,0.49l5.17,1.95l0.38,-0.16l-0.13,-0.39l-5.77,-3.16l0.29,-2.26Z" data-code="GL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M540.87,207.81l0.41,0.94l-0.18,0.51l0.0,0.21l0.65,1.66l-1.15,0.05l-0.54,-1.12l-0.24,-0.17l-1.73,-0.2l1.44,-2.06l1.33,0.18Z" data-code="KW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M423.16,269.88l-3.58,1.34l-1.41,0.87l-2.13,0.69l-1.91,-0.61l0.09,-0.75l-0.03,-0.17l-1.04,-2.07l0.62,-2.7l1.04,-2.08l0.03,-0.19l-1.0,-5.46l0.05,-1.12l4.04,-0.11l1.08,0.18l0.18,-0.03l0.72,-0.36l0.75,0.13l-0.11,0.48l0.06,0.26l0.98,1.22l-0.0,1.77l0.24,1.99l0.05,0.13l0.55,0.81l-0.52,2.14l0.19,1.37l0.69,1.66l0.38,0.62Z" data-code="GH" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M568.16,231.0l-0.08,0.1l-0.84,1.61l-0.93,-0.11l-0.27,0.11l-0.58,0.73l-0.4,1.32l-0.01,0.14l0.29,1.61l-0.07,0.09l-1.0,-0.01l-0.16,0.04l-1.56,0.97l-0.14,0.2l-0.23,1.17l-0.41,0.4l-1.44,-0.02l-0.17,0.05l-0.98,0.65l-0.13,0.25l0.01,0.87l-0.97,0.57l-1.27,-0.22l-0.19,0.03l-1.63,0.84l-0.88,0.11l-2.55,-5.57l7.2,-2.49l0.19,-0.19l1.67,-5.23l-0.03,-0.25l-1.1,-1.78l0.05,-0.89l0.68,-1.03l0.05,-0.16l0.01,-0.89l0.96,-0.44l0.07,-0.5l-0.32,-0.26l0.16,-1.31l0.85,-0.01l1.03,1.67l0.09,0.09l1.4,0.96l0.11,0.05l1.82,0.34l1.37,0.45l1.75,2.32l0.13,0.1l0.7,0.26l-0.0,0.3l-1.25,2.19l-1.01,0.8ZM561.88,218.47l-0.01,0.02l-0.15,-0.29l0.3,-0.38l-0.14,0.65Z" data-code="OM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M543.2,261.06l-1.07,1.46l-1.65,1.99l-1.91,0.01l-8.08,-2.95l-0.89,-0.84l-0.9,-1.19l-0.81,-1.23l0.44,-0.73l0.76,-1.12l0.49,0.28l0.52,1.05l1.13,1.06l0.2,0.08l1.24,0.01l2.42,-0.65l2.77,-0.31l2.17,-0.78l1.31,-0.19l0.84,-0.43l1.03,-0.06l-0.01,4.54Z" data-code="_3" fill=""""),
format.raw("""#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M384.23,230.37l0.07,-0.06l0.28,-0.89l0.99,-1.13l0.07,-0.13l0.8,-3.54l3.4,-2.8l0.09,-0.13l0.76,-2.17l0.07,5.5l-2.07,0.21l-0.24,0.17l-0.61,1.36l-0.02,0.16l0.43,3.46l-4.01,-0.01ZM391.82,218.2l0.07,-0.06l0.75,-1.93l1.86,-0.25l0.94,0.34l1.14,0.0l0.18,-0.06l0.73,-0.56l1.41,-0.08l-0.0,2.72l-7.08,-0.12Z" data-code="_2" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M472.71,172.84l-0.07,-0.43l-0.16,-0.22l-0.53,-0.27l-0.38,-0.58l0.3,-0.43l0.51,-0.19l0.18,-0.18l0.3,-0.87l0.12,-0.04l0.22,0.26l0.12,0.09l0.38,0.15l0.28,0.41l0.15,0.12l0.34,0.12l0.43,0.5l0.15,0.07l-0.12,0.3l-0.27,0.32l-0.03,0.18l-0.31,0.06l-1.48,0.47l-0.15,0.17Z" data-code="_1" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M503.54,192.92l0.09,-0.17l0.41,0.01l-0.08,0.01l-0.42,0.15ZM504.23,192.76l1.02,0.02l0.4,-0.13l-0.09,0.29l0.03,0.08l-0.35,0.16l-0.24,-0.04l-0.06,-0.1l-0.18,-0.17l-0.19,-0.08l-0.33,-0.02Z" data-code="_0" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M510.26,200.93l0.28,-0.57l2.53,1.0l0.27,-0.02l4.57,-2.77l0.84,2.84l-0.28,0.25l-4.95,1.37l-0.14,0.49l2.24,2.48l-0.5,0.28l-0.13,0.14l-0.35,0.78l-1.76,0.35l-0.2,0.14l-0.57,0.94l-0.94,0.73l-2.45,-0.38l-0.03,-0.12l1.23,-4.32l-0.04,-1.1l0.34,-0.75l0.03,-0.12l0.0,-1.63Z" data-code="JO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M455.49,162.73l1.53,0.09l0.24,-0.1l0.29,-0.34l0.64,0.38l0.14,0.04l0.98,0.06l0.32,-0.3l-0.01,-0.66l0.67,-0.25l0.19,-0.22l0.21,-1.11l1.72,-0.72l0.65,0.32l1.94,1.37l2.07,0.6l0.22,-0.02l0.67,-0.33l0.47,0.94l0.67,0.76l-0.63,0.77l-0.91,-0.55l-0.16,-0.04l-1.69,0.04l-2.2,-0.51l-1.17,0.07l-0.21,0.11l-0.36,0.42l-0.67,-0.53l-0.46,0.12l-0.52,1.29l0.05,0.31l1.21,1.42l0.58,0.99l1.15,1.14l0.95,0.68l0.92,1.23l0.1,0.09l1.75,0.91l-1.87,-0.89l-1.5,-1.11l-2.23,-0.88l-1.77,-1.9l0.12,-0.06l0.1,-0.47l-1.07,-1.22l-0.04,-0.94l-0.21,-0.27l-1.61,-0.49l-0.35,0.14l-0.53,0.93l-0.41,-0.57l0.04,-0.73Z" data-code="HR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M237.82,234.68l1.35,0.1l1.95,0.37l0.18,1.15l-0.16,0.83l-0.51,0.37l-0.06,0.44l0.57,0.68l-0.02,0.22l-1.31,-0.35l-1.26,0.17l-1.49,-0.18l-0.15,0.02l-1.03,0.43l-1.02,-0.61l0.09,-0.36l2.04,0.32l1.9,0.21l0.19,-0.05l0.9,-0.58l0.05,-0.47l-1.05,-1.03l0.02,-0.86l-0.23,-0.3l-1.13,-0.29l0.18,-0.23Z" data-code="HT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M461.96,157.92l0.68,-1.66l-0.03,-0.29l-0.15,-0.22l0.84,-0.0l0.3,-0.26l0.12,-0.84l0.88,0.57l0.98,0.38l0.16,0.01l2.1,-0.39l0.23,-0.21l0.14,-0.45l0.88,-0.1l1.06,-0.43l0.13,0.1l0.28,0.04l1.18,-0.4l0.14,-0.1l0.52,-0.67l0.63,-0.15l2.6,0.95l0.26,-0.03l0.38,-0.23l1.12,0.7l0.1,0.49l-1.31,0.57l-0.14,0.13l-1.18,2.14l-1.44,2.04l-1.85,0.55l-1.51,-0.13l-0.14,0.02l-1.92,0.82l-0.85,0.42l-1.91,-0.55l-1.83,-1.31l-0.74,-0.37l-0.44,-0.97l-0.26,-0.18Z" data-code="HU" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M202.48,251.87l-0.33,-0.62l-0.18,-0.14l-0.5,-0.15l0.13,-0.76l-0.11,-0.28l-0.34,-0.28l-0.6,-0.23l-0.18,-0.01l-0.81,0.22l-0.16,-0.24l-0.72,-0.39l-0.51,-0.48l-0.12,-0.07l-0.31,-0.09l0.24,-0.3l0.04,-0.3l-0.16,-0.4l0.1,-0.28l1.14,-0.69l1.0,-0.86l0.09,0.04l0.3,-0.05l0.47,-0.39l0.49,-0.03l0.14,0.13l0.29,0.06l0.31,-0.1l1.16,0.22l1.24,-0.08l0.81,-0.28l0.29,-0.25l0.63,0.1l0.69,0.18l0.65,-0.06l0.49,-0.2l1.04,0.32l0.38,0.06l0.7,0.44l0.71,0.56l0.92,0.41l0.1,0.11l-0.11,-0.01l-0.23,0.09l-0.3,0.3l-0.76,0.29l-0.58,0.0l-0.15,0.04l-0.45,0.26l-0.31,-0.07l-0.37,-0.34l-0.28,-0.07l-0.26,0.07l-0.18,0.15l-0.23,0.43l-0.04,-0.0l-0.33,0.28l-0.03,0.4l-0.76,0.61l-0.45,0.3l-0.15,0.16l-0.51,-0.36l-0.41,0.06l-0.45,0.56l-0.41,-0.01l-0.59,0.06l-0.27,0.31l0.04,0.96l-0.07,0.0l-0.25,0.16l-0.24,0.45l-0.42,0.06Z" data-code="HN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M254.95,238.31l1.15,0.21l0.2,0.23l-0.36,0.36l-1.76,-0.01l-1.2,0.07l-0.09,-0.69l0.17,-0.18l1.89,0.01Z" data-code="PR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M509.66,201.06l-0.0,1.44l-0.29,0.63l-0.59,0.19l0.02,-0.11l0.52,-0.31l-0.02,-0.53l-0.41,-0.2l0.36,-1.28l0.41,0.17Z" data-code="PS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M398.65,173.6l0.75,-0.63l0.7,-0.3l0.51,1.2l0.28,0.18l1.48,-0.0l0.2,-0.08l0.33,-0.3l1.16,0.08l0.52,1.11l-0.95,0.66l-0.13,0.24l-0.03,2.2l-0.33,0.35l-0.08,0.18l-0.08,1.17l-0.86,0.19l-0.2,0.44l0.93,1.64l-0.64,1.79l0.07,0.31l0.72,0.72l-0.24,0.56l-0.9,1.05l-0.07,0.26l0.17,0.77l-0.73,0.54l-1.18,-0.36l-0.16,-0.0l-0.85,0.21l0.31,-1.81l-0.23,-1.87l-0.23,-0.25l-0.99,-0.24l-0.49,-0.91l0.18,-1.72l0.93,-0.99l0.08,-0.16l0.17,-1.17l0.52,-1.76l-0.04,-1.36l-0.51,-1.14l-0.09,-0.8Z" data-code="PT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M264.33,341.43l0.93,-2.96l0.07,-1.42l1.1,-2.1l4.19,-0.73l2.22,0.04l2.12,1.21l0.07,0.76l0.7,1.38l-0.16,3.48l0.24,0.31l2.64,0.5l0.19,-0.03l0.9,-0.45l1.47,0.62l0.38,0.64l0.23,2.35l0.3,1.07l0.25,0.21l0.93,0.12l0.16,-0.02l0.8,-0.37l0.61,0.33l-0.0,1.25l-0.33,1.53l-0.5,1.57l-0.39,2.26l-2.14,1.94l-1.85,0.4l-2.74,-0.4l-2.13,-0.62l2.26,-3.75l0.03,-0.24l-0.36,-1.18l-0.17,-0.19l-2.55,-1.03l-3.04,-1.95l-2.07,-0.43l-4.4,-4.12Z" data-code="PY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M213.65,263.79l0.18,-0.43l0.02,-0.18l-0.06,-0.28l0.23,-0.18l-0.01,-0.48l-0.4,-0.29l-0.01,-0.62l0.57,-0.13l0.68,0.69l-0.04,0.39l0.26,0.33l1.0,0.11l0.27,-0.1l0.49,0.44l0.24,0.07l1.34,-0.22l1.04,-0.62l1.49,-0.5l0.86,-0.73l0.99,0.11l0.18,0.28l1.35,0.08l1.02,0.4l0.78,0.72l0.71,0.53l-0.1,0.12l-0.05,0.3l0.53,1.34l-0.28,0.44l-0.6,-0.13l-0.36,0.22l-0.2,0.76l-0.41,-0.36l-0.44,-1.12l0.49,-0.53l-0.14,-0.49l-0.51,-0.14l-0.41,-0.72l-0.11,-0.11l-1.25,-0.7l-0.19,-0.04l-1.1,0.16l-0.22,0.15l-0.47,0.81l-0.9,0.56l-0.49,0.08l-0.22,0.17l-0.25,0.52l0.05,0.32l0.93,1.07l-0.41,0.21l-0.29,0.3l-0.81,0.09l-0.36,-1.26l-0.53,-0.1l-0.21,0.28l-0.5,-0.09l-0.44,-0.88l-0.22,-0.16l-0.99,-0.16l-0.61,-0.28l-0.13,-0.03l-1.0,0.0Z" data-code="PA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M808.4,298.6l0.62,0.46l1.19,1.56l1.04,0.77l-0.18,0.37l-0.42,0.15l-0.92,-0.82l-1.05,-1.53l-0.27,-0.96ZM804.09,296.06l-0.3,0.26l-0.36,-1.11l-0.66,-1.06l-2.55,-1.89l-1.42,-0.59l0.17,-0.15l1.16,0.6l0.85,0.55l1.01,0.58l0.97,1.02l0.9,0.76l0.24,1.03ZM796.71,297.99l0.15,0.82l0.34,0.24l1.43,-0.19l0.19,-0.11l0.68,-0.82l1.36,-0.87l0.13,-0.31l-0.21,-1.13l1.04,-0.03l0.3,0.25l-0.04,1.17l-0.74,1.34l-1.17,0.18l-0.22,0.15l-0.35,0.62l-2.51,1.13l-1.21,-0.0l-1.99,-0.71l-1.19,-0.58l0.07,-0.28l1.98,0.32l1.46,-0.2l0.24,-0.21l0.25,-0.79ZM789.24,303.52l0.11,0.15l2.19,1.62l1.6,2.62l0.27,0.14l1.09,-0.06l-0.07,0.77l0.23,0.32l1.23,0.27l-0.14,0.09l0.05,0.53l2.39,0.95l-0.11,0.28l-1.33,0.14l-0.51,-0.55l-0.18,-0.09l-4.59,-0.65l-1.87,-1.55l-1.38,-1.35l-1.28,-2.17l-0.16,-0.13l-3.27,-1.1l-0.19,0.0l-2.12,0.72l-1.58,0.85l-0.15,0.31l0.28,1.63l-1.65,0.73l-1.37,-0.4l-2.3,-0.09l-0.08,-15.65l3.95,1.57l4.58,1.42l1.67,1.25l1.32,1.19l0.36,1.39l0.19,0.21l4.06,1.51l0.39,0.85l-1.9,0.22l-0.25,0.39l0.55,1.68Z" data-code="PG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M246.44,329.21l-0.63,1.25l-1.05,0.54l-2.25,-1.33l-0.19,-0.93l-0.16,-0.21l-4.95,-2.58l-4.46,-2.79l-1.87,-1.52l-0.94,-1.91l0.33,-0.6l-0.01,-0.31l-2.11,-3.33l-2.46,-4.66l-2.36,-5.02l-1.04,-1.18l-0.77,-1.81l-0.08,-0.11l-1.95,-1.64l-1.54,-0.88l0.61,-0.85l0.02,-0.31l-1.15,-2.27l0.69,-1.56l1.59,-1.26l0.12,0.42l-0.56,0.47l-0.11,0.25l0.07,0.92l0.36,0.27l0.97,-0.19l0.85,0.23l0.99,1.19l0.41,0.05l1.42,-1.03l0.11,-0.16l0.46,-1.64l1.45,-2.06l2.92,-0.96l0.11,-0.07l2.73,-2.62l0.84,-1.72l0.02,-0.18l-0.3,-1.65l0.28,-0.1l1.49,1.06l0.77,1.14l0.1,0.09l1.08,0.6l1.43,2.55l0.21,0.15l1.86,0.31l0.18,-0.03l1.25,-0.6l0.77,0.37l0.17,0.03l1.4,-0.2l1.57,0.96l-1.45,2.29l0.23,0.46l0.63,0.05l0.66,0.7l-1.51,-0.08l-0.24,0.1l-0.27,0.31l-1.96,0.46l-2.95,1.74l-0.14,0.21l-0.17,1.1l-0.6,0.82l-0.05,0.23l0.21,1.13l-1.31,0.63l-0.17,0.27l0.0,0.91l-0.53,0.37l-0.1,0.37l1.04,2.27l1.31,1.46l-0.44,0.9l0.24,0.43l1.52,0.13l0.87,1.23l0.24,0.13l2.21,0.07l0.18,-0.06l1.55,-1.13l-0.14,3.22l0.23,0.3l1.14,0.29l0.16,-0.0l1.18,-0.36l1.97,3.71l-0.45,0.71l-0.04,0.14l-0.12,1.8l-0.05,2.07l-0.92,1.2l-0.03,0.31l0.38,0.8l-0.48,0.72l-0.02,0.3l1.01,2.02l-1.5,2.64Z" data-code="PE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M609.08,187.76l1.66,1.21l0.71,2.11l0.2,0.19l3.62,1.01l-1.98,1.95l-2.65,0.4l-3.75,-0.68l-0.26,0.08l-1.23,1.22l-0.07,0.31l0.89,2.46l0.88,1.92l0.1,0.12l1.67,1.14l-1.8,1.35l-0.12,0.25l0.04,1.85l-2.35,2.67l-1.59,2.79l-2.5,2.72l-2.76,-0.2l-0.24,0.09l-2.76,2.83l0.04,0.45l1.54,1.13l0.27,1.94l0.09,0.17l1.34,1.29l0.4,1.83l-5.14,-0.01l-0.22,0.09l-1.53,1.63l-1.52,-0.56l-0.76,-1.88l-1.93,-2.03l-0.25,-0.09l-4.6,0.5l-4.05,0.05l-3.1,0.33l0.77,-2.53l3.48,-1.33l0.19,-0.33l-0.21,-1.24l-0.19,-0.23l-1.01,-0.37l-0.06,-2.18l-0.17,-0.26l-2.32,-1.16l-0.96,-1.57l-0.56,-0.65l3.16,1.05l0.14,0.01l2.45,-0.4l1.44,0.33l0.3,-0.1l0.4,-0.47l1.58,0.22l0.14,-0.01l3.25,-1.14l0.2,-0.27l0.08,-2.23l1.23,-1.38l1.73,0.0l0.28,-0.2l0.22,-0.61l1.68,-0.32l0.86,0.24l0.27,-0.05l0.98,-0.78l0.11,-0.26l-0.13,-1.57l0.96,-1.52l1.51,-0.67l0.14,-0.41l-0.74,-1.4l1.86,0.07l0.26,-0.13l0.69,-1.01l0.05,-0.2l-0.09,-0.94l1.14,-1.09l0.09,-0.28l-0.29,-1.41l-0.51,-1.07l1.23,-1.05l2.6,-0.58l2.86,-0.33l1.33,-0.54l1.3,-0.29Z" data-code="PK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M737.11,263.82l0.25,1.66l0.14,1.34l-0.54,1.46l-0.64,-1.79l-0.5,-0.1l-1.17,1.28l-0.05,0.32l0.74,1.71l-0.49,0.81l-2.6,-1.28l-0.61,-1.57l0.68,-1.07l-0.07,-0.4l-1.59,-1.19l-0.42,0.06l-0.69,0.91l-1.01,-0.08l-0.21,0.06l-1.58,1.2l-0.17,-0.3l0.87,-1.88l1.48,-0.66l1.18,-0.81l0.71,0.92l0.34,0.1l1.9,-0.69l0.18,-0.18l0.34,-0.94l1.57,-0.06l0.29,-0.32l-0.1,-1.38l1.41,0.83l0.36,2.06ZM734.94,254.42l0.56,2.24l-1.41,-0.49l-0.4,0.3l0.07,0.94l0.51,1.3l-0.54,0.26l-0.08,-1.34l-0.25,-0.28l-0.56,-0.1l-0.23,-0.91l1.03,0.14l0.34,-0.31l-0.03,-0.96l-0.06,-0.18l-1.14,-1.44l1.62,0.04l0.57,0.78ZM724.68,238.33l1.48,0.71l0.33,-0.04l0.44,-0.38l0.05,0.13l-0.37,0.97l0.01,0.23l0.81,1.75l-0.59,1.92l-1.37,0.79l-0.14,0.2l-0.39,2.07l0.01,0.14l0.56,2.04l0.23,0.21l1.33,0.28l0.14,-0.0l1.0,-0.27l2.82,1.28l-0.2,1.16l0.12,0.29l0.66,0.5l-0.13,0.56l-1.54,-0.99l-0.89,-1.29l-0.49,0.0l-0.44,0.65l-1.34,-1.28l-0.26,-0.08l-2.18,0.36l-0.96,-0.44l0.09,-0.72l0.69,-0.57l-0.01,-0.47l-0.75,-0.59l-0.47,0.14l-0.15,0.43l-0.86,-1.02l-0.34,-1.02l-0.07,-1.74l0.49,0.41l0.49,-0.21l0.26,-3.99l0.73,-2.1l1.23,0.0ZM731.12,258.92l-0.82,0.75l-0.83,1.64l-0.52,0.5l-1.17,-1.33l0.36,-0.47l0.62,-0.7l0.07,-0.15l0.24,-1.35l0.73,-0.08l-0.31,1.29l0.16,0.34l0.37,-0.09l1.21,-1.6l-0.12,1.24ZM726.66,255.58l0.85,0.45l0.14,0.03l1.28,-0.0l-0.03,0.62l-1.04,0.96l-1.15,0.55l-0.05,-0.71l0.17,-1.26l-0.01,-0.13l-0.16,-0.51ZM724.92,252.06l-0.45,1.5l-0.7,-0.83l-0.95,-1.43l1.44,0.06l0.67,0.7ZM717.48,261.28l-1.87,1.35l0.21,-0.3l1.81,-1.57l1.5,-1.75l0.97,-1.84l0.23,1.08l-1.56,1.33l-1.29,1.7Z" data-code="PH" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M458.8,144.25l-0.96,-1.98l0.18,-1.06l-0.01,-0.15l-0.62,-1.8l-0.82,-1.11l0.56,-0.73l0.05,-0.28l-0.51,-1.51l1.48,-0.87l3.88,-1.58l3.06,-1.14l2.23,0.52l0.15,0.66l0.29,0.23l2.4,0.04l3.11,0.39l4.56,-0.05l1.12,0.32l0.51,0.89l0.1,1.45l0.03,0.12l0.66,1.23l-0.01,1.08l-1.33,0.61l-0.14,0.41l0.74,1.5l0.07,1.53l1.22,2.79l-0.19,0.66l-1.09,0.33l-0.14,0.09l-2.27,2.72l-0.04,0.31l0.35,0.8l-2.22,-1.16l-0.21,-0.02l-1.72,0.44l-1.1,-0.31l-0.21,0.02l-1.3,0.61l-1.11,-1.02l-0.32,-0.05l-0.81,0.35l-1.15,-1.61l-0.21,-0.12l-1.65,-0.17l-0.19,-0.82l-0.23,-0.23l-1.72,-0.37l-0.34,0.17l-0.25,0.56l-0.88,-0.44l0.12,-0.69l-0.25,-0.35l-1.78,-0.27l-1.08,-0.97Z" data-code="PL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M502.81,308.32l1.09,1.04l0.58,1.94l-0.39,0.66l-0.5,2.05l-0.0,0.14l0.45,1.95l-0.69,0.77l-0.06,0.11l-0.76,2.37l0.15,0.36l0.62,0.31l-6.85,1.9l-0.22,0.33l0.2,1.54l-1.62,0.3l-0.12,0.05l-1.43,1.02l-0.11,0.15l-0.25,0.73l-0.73,0.17l-0.14,0.08l-2.18,2.12l-1.33,1.6l-0.65,0.05l-0.83,-0.29l-2.75,-0.28l-0.24,-0.1l-0.15,-0.27l-0.99,-0.58l-0.12,-0.04l-1.73,-0.14l-1.88,0.54l-1.5,-1.48l-1.61,-2.01l0.11,-7.73l4.92,0.03l0.29,-0.37l-0.19,-0.79l0.34,-0.86l0.0,-0.21l-0.41,-1.11l0.26,-1.14l-0.01,-0.16l-0.12,-0.36l0.18,0.01l0.1,0.56l0.31,0.25l1.14,-0.06l1.44,0.21l0.76,1.05l0.19,0.12l2.01,0.35l0.19,-0.03l1.24,-0.65l0.44,1.03l0.22,0.18l1.81,0.34l0.85,0.99l1.02,1.39l0.24,0.12l1.92,0.02l0.3,-0.32l-0.21,-2.74l-0.47,-0.23l-0.53,0.36l-1.58,-0.89l-0.51,-0.34l0.29,-2.36l0.44,-2.99l-0.03,-0.18l-0.5,-0.99l0.61,-1.38l0.53,-0.24l3.26,-0.41l0.89,0.23l1.01,0.62l1.04,0.44l1.6,0.43l1.35,0.72Z" data-code="ZM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M482.19,120.88l0.23,-1.68l-0.43,-0.31l-0.75,0.37l-1.34,-1.1l-0.18,-1.75l2.92,-0.95l3.07,-0.53l2.66,0.6l2.48,-0.1l0.18,0.31l-1.65,1.96l-0.06,0.26l0.71,3.25l-0.88,0.94l-1.85,-0.01l-2.08,-1.3l-1.14,-0.47l-0.2,-0.01l-1.69,0.51Z" data-code="EE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M508.07,208.8l-0.66,1.06l-0.53,2.03l-0.64,1.32l-0.32,0.26l-1.74,-1.85l-1.77,-3.86l-0.48,-0.09l-0.26,0.25l-0.07,0.32l1.04,2.88l1.55,2.76l1.89,4.18l0.94,1.48l0.83,1.54l2.08,2.73l-0.3,0.28l-0.1,0.23l0.08,1.72l0.11,0.22l2.91,2.37l-28.78,0.0l0.0,-19.06l-0.73,-2.2l0.61,-1.59l0.0,-0.2l-0.34,-1.04l0.73,-1.08l3.13,-0.04l2.36,0.72l2.48,0.81l1.15,0.43l0.23,-0.01l1.93,-0.87l1.02,-0.78l2.08,-0.21l1.59,0.31l0.62,1.24l0.52,0.03l0.46,-0.71l1.86,0.59l1.95,0.16l0.17,-0.04l0.92,-0.52l1.48,4.24Z" data-code="EG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M467.06,373.27l-0.13,-0.29l0.01,-1.58l-0.02,-0.12l-0.71,-1.64l0.59,-0.37l0.14,-0.26l-0.07,-2.13l-0.05,-0.15l-1.63,-2.58l-1.25,-2.31l-1.71,-3.37l0.88,-0.98l0.7,0.52l0.39,1.08l0.23,0.19l1.1,0.19l1.55,0.51l0.14,0.01l1.35,-0.2l0.11,-0.04l2.24,-1.39l0.14,-0.25l0.0,-9.4l0.16,0.09l1.39,2.38l-0.22,1.53l0.04,0.19l0.56,0.94l0.3,0.14l1.79,-0.27l0.16,-0.08l1.23,-1.18l1.17,-0.79l0.1,-0.12l0.57,-1.19l1.02,-0.52l0.9,0.28l1.16,0.73l0.14,0.05l2.04,0.13l0.13,-0.02l1.6,-0.62l0.18,-0.19l0.63,-1.93l1.18,-0.19l0.19,-0.12l0.78,-1.05l0.81,-1.71l2.18,-1.91l3.44,-1.88l0.89,0.02l1.17,0.43l0.21,-0.0l0.76,-0.29l1.07,0.21l1.15,3.55l0.63,1.82l-0.44,2.9l0.1,0.52l-0.74,-0.29l-0.18,-0.01l-0.72,0.19l-0.21,0.2l-0.22,0.74l-0.66,0.97l-0.05,0.18l0.02,0.93l0.09,0.21l1.49,1.46l0.27,0.08l1.47,-0.29l0.22,-0.18l0.43,-1.01l1.29,0.02l-0.51,1.63l-0.29,2.2l-0.59,1.12l-2.2,1.78l-1.06,1.39l-0.72,1.44l-1.39,1.93l-2.81,2.84l-1.75,1.65l-1.85,1.24l-2.55,1.06l-1.23,0.14l-0.24,0.18l-0.22,0.54l-1.27,-0.35l-0.2,0.01l-1.15,0.5l-2.62,-0.52l-0.12,0.0l-1.46,0.33l-0.98,-0.14l-0.16,0.02l-2.55,1.1l-2.11,0.44l-1.59,1.07l-0.93,0.06l-0.97,-0.92l-0.19,-0.08l-0.72,-0.04l-1.0,-1.16l-0.25,0.05ZM493.72,359.24l-1.12,-0.86l-0.31,-0.03l-1.23,0.59l-1.36,1.07l-1.39,1.78l0.01,0.38l1.88,2.11l0.31,0.09l0.9,-0.27l0.18,-0.15l0.4,-0.77l1.28,-0.39l0.18,-0.16l0.42,-0.88l0.76,-1.32l-0.05,-0.37l-0.87,-0.82Z" data-code="ZA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M220.2,293.48l1.25,-1.76l0.02,-0.31l-0.54,-1.09l-0.5,-0.06l-0.78,0.94l-1.03,-0.75l0.33,-0.46l0.05,-0.23l-0.38,-2.04l0.66,-0.28l0.17,-0.19l0.45,-1.52l0.93,-1.58l0.04,-0.2l-0.13,-0.78l1.19,-0.47l1.57,-0.91l2.35,1.34l0.17,0.04l0.28,-0.02l0.52,0.91l0.21,0.15l2.12,0.35l0.2,-0.03l0.55,-0.31l1.08,0.73l0.97,0.54l0.31,1.67l-0.71,1.49l-2.64,2.54l-2.95,0.97l-0.15,0.11l-1.53,2.18l-0.49,1.68l-1.1,0.8l-0.87,-1.05l-0.15,-0.1l-1.01,-0.27l-0.13,-0.0l-0.7,0.14l-0.03,-0.43l0.6,-0.5l0.1,-0.31l-0.26,-0.91Z" data-code="EC" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M470.27,171.7l0.38,0.19l0.45,-0.18l0.4,0.61l0.11,0.1l0.46,0.24l0.13,0.87l-0.3,0.95l-0.0,0.17l0.36,1.28l0.12,0.17l0.9,0.63l-0.03,0.44l-0.67,0.35l-0.16,0.22l-0.14,0.88l-0.96,1.18l-0.06,-0.03l-0.04,-0.48l-0.12,-0.22l-1.28,-0.92l-0.19,-1.25l0.2,-1.96l0.33,-0.89l-0.06,-0.3l-0.36,-0.41l-0.13,-0.75l0.66,-0.9Z" data-code="AL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M461.62,299.93l0.55,1.67l0.73,1.54l1.56,2.18l0.28,0.12l1.66,-0.2l0.81,-0.34l1.28,0.33l0.33,-0.14l0.39,-0.67l0.56,-1.3l1.37,-0.09l0.27,-0.21l0.07,-0.23l0.67,-0.01l-0.13,0.53l0.29,0.37l2.74,-0.02l0.04,1.29l0.03,0.13l0.46,0.87l-0.35,1.52l0.18,1.55l0.07,0.16l0.75,0.85l-0.13,2.89l0.41,0.29l0.56,-0.21l1.11,0.05l1.5,-0.37l0.9,0.12l0.18,0.53l-0.27,1.15l0.01,0.17l0.4,1.08l-0.33,0.85l-0.01,0.18l0.12,0.51l-4.83,-0.03l-0.3,0.3l-0.12,8.13l0.07,0.19l1.69,2.1l1.27,1.25l-4.03,0.92l-5.93,-0.36l-1.66,-1.19l-0.18,-0.06l-10.15,0.11l-0.34,0.13l-1.35,-1.05l-0.17,-0.06l-1.62,-0.08l-1.6,0.45l-0.88,0.36l-0.17,-1.2l0.34,-2.19l0.85,-2.32l0.14,-1.13l0.79,-2.24l0.57,-1.0l1.42,-1.64l0.82,-1.15l0.05,-0.13l0.26,-1.88l-0.13,-1.51l-0.07,-0.16l-0.72,-0.87l-1.23,-2.91l0.09,-0.37l0.73,-0.95l0.05,-0.27l-1.27,-4.12l-1.19,-1.54l0.1,-0.2l0.86,-0.28l0.78,0.03l0.83,-0.29l7.12,0.03ZM451.81,298.94l-0.17,0.07l-0.5,-1.42l0.85,-0.92l0.53,-0.29l0.48,0.44l-0.56,0.32l-0.1,0.1l-0.41,0.65l-0.05,0.14l-0.07,0.91Z" data-code="AO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M598.42,172.08l-1.37,0.54l-3.3,2.09l-0.11,0.12l-1.01,1.97l-0.56,0.01l-0.6,-1.24l-0.26,-0.17l-2.95,-0.09l-0.46,-2.22l-0.29,-0.24l-0.91,-0.02l0.17,-2.72l-0.12,-0.26l-3.0,-2.22l-0.2,-0.06l-4.29,0.24l-2.8,0.42l-2.36,-2.7l-6.4,-3.65l-0.23,-0.03l-6.45,1.83l-0.22,0.29l0.1,10.94l-0.84,0.1l-1.65,-2.21l-0.11,-0.09l-1.69,-0.84l-0.2,-0.02l-2.84,0.63l-0.14,0.07l-0.71,0.64l-0.02,-0.11l0.57,-1.17l0.0,-0.26l-0.48,-1.05l-0.17,-0.16l-2.78,-0.99l-1.08,-2.62l-0.13,-0.15l-1.24,-0.7l-0.04,-0.48l2.07,0.25l0.34,-0.29l0.09,-2.03l1.84,-0.44l2.12,0.45l0.36,-0.25l0.45,-3.04l-0.45,-2.06l-0.31,-0.23l-2.44,0.15l-2.0"""),
format.raw("""7,-0.75l-0.23,0.01l-2.88,1.38l-2.21,0.62l-0.96,-0.38l0.22,-1.39l-0.06,-0.23l-1.6,-2.12l-0.25,-0.12l-1.72,0.08l-1.87,-1.91l1.33,-2.24l-0.06,-0.38l-0.55,-0.5l1.72,-3.08l2.3,1.7l0.48,-0.2l0.29,-2.26l4.99,-3.48l3.76,-0.08l5.46,2.27l2.96,1.33l0.26,-0.01l2.59,-1.36l3.82,-0.06l3.13,1.67l0.38,-0.09l0.63,-0.85l3.36,0.14l0.29,-0.19l0.63,-1.57l-0.13,-0.37l-3.64,-2.05l2.0,-1.36l0.1,-0.38l-0.32,-0.62l2.09,-0.76l0.13,-0.47l-1.65,-2.13l0.89,-0.91l9.27,-1.18l0.13,-0.05l1.17,-0.82l6.2,-1.27l2.26,-1.43l4.19,0.7l0.74,3.39l0.38,0.22l2.52,-0.81l2.9,1.06l-0.18,1.63l0.32,0.33l2.52,-0.23l5.0,-2.58l0.03,0.39l3.16,2.62l5.57,8.48l0.49,0.02l1.18,-1.53l3.22,1.78l0.21,0.03l3.5,-0.83l1.21,0.52l1.16,1.82l0.15,0.12l1.67,0.61l1.01,1.32l0.28,0.11l3.04,-0.41l1.1,1.64l-1.68,1.89l-1.97,0.28l-0.26,0.29l-0.12,3.09l-1.2,1.23l-4.81,-1.01l-0.35,0.2l-1.77,5.51l-1.14,0.62l-4.92,1.23l-0.2,0.41l2.14,5.06l-1.45,0.67l-0.17,0.31l0.15,1.28l-1.05,-0.3l-1.21,-1.04l-0.17,-0.07l-3.73,-0.32l-4.15,-0.08l-0.92,0.31l-3.46,-1.24l-0.22,0.01l-1.42,0.63l-0.17,0.21l-0.32,1.49l-3.82,-0.97l-0.15,0.0l-1.65,0.43l-0.2,0.17l-0.51,1.21Z" data-code="KZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M516.0,247.63l1.21,0.92l0.3,0.04l1.3,-0.53l0.46,0.41l0.19,0.08l1.65,0.03l2.05,0.96l0.67,0.88l1.07,0.79l1.0,1.45l0.7,0.68l-0.72,0.92l-0.85,1.19l-0.04,0.25l0.19,0.67l0.04,0.74l0.29,0.28l1.4,0.04l0.55,-0.15l0.23,0.19l-0.41,0.67l0.01,0.32l0.92,1.39l0.93,1.23l0.99,0.94l0.1,0.06l8.19,2.99l1.51,0.01l-6.51,6.95l-3.14,0.11l-0.18,0.06l-2.15,1.71l-1.51,0.04l-0.22,0.1l-0.6,0.69l-1.46,-0.0l-0.93,-0.78l-0.32,-0.04l-2.29,1.05l-0.12,0.1l-0.64,0.9l-1.44,-0.17l-0.51,-0.26l-0.17,-0.03l-0.56,0.07l-0.68,-0.02l-3.1,-2.08l-0.17,-0.05l-1.62,0.0l-0.68,-0.65l0.0,-1.28l-0.21,-0.29l-1.19,-0.38l-1.42,-2.63l-0.13,-0.12l-1.05,-0.53l-0.46,-1.0l-1.27,-1.23l-0.17,-0.08l-1.08,-0.13l0.53,-0.9l1.17,-0.05l0.26,-0.17l0.37,-0.77l0.03,-0.14l-0.03,-2.23l0.7,-2.49l1.08,-0.65l0.14,-0.19l0.24,-1.0l1.03,-1.85l1.47,-1.22l0.09,-0.12l1.02,-2.51l0.36,-1.96l2.62,0.48l0.33,-0.18l0.63,-1.55Z" data-code="ET" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M498.95,341.2l-1.16,-0.23l-0.16,0.01l-0.74,0.28l-1.11,-0.41l-1.02,-0.04l-1.52,-1.13l-0.12,-0.05l-1.79,-0.37l-0.65,-1.46l-0.01,-0.86l-0.22,-0.29l-0.99,-0.26l-2.74,-2.77l-0.77,-1.46l-0.52,-0.5l-0.72,-1.54l2.24,0.23l0.78,0.28l0.12,0.02l0.85,-0.06l0.21,-0.11l1.38,-1.66l2.11,-2.05l0.81,-0.18l0.22,-0.2l0.27,-0.8l1.29,-0.93l1.53,-0.28l0.11,0.66l0.3,0.25l2.02,-0.05l1.04,0.48l0.5,0.59l0.18,0.1l1.13,0.18l1.11,0.7l0.01,3.06l-0.49,1.82l-0.11,1.94l0.03,0.16l0.35,0.68l-0.24,1.3l-0.27,0.17l-0.12,0.15l-0.64,1.83l-2.49,2.8Z" data-code="ZW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M398.67,172.8l0.09,-1.45l-0.06,-0.2l-0.82,-1.05l3.16,-1.96l3.01,0.54l3.33,-0.02l2.64,0.52l2.14,-0.15l3.9,0.1l0.91,1.08l0.14,0.09l4.61,1.38l0.26,-0.04l0.77,-0.55l2.66,1.29l0.17,0.03l2.59,-0.35l0.1,1.28l-2.2,1.85l-3.13,0.62l-0.23,0.23l-0.21,0.92l-1.54,1.68l-0.97,2.4l0.02,0.26l0.85,1.46l-1.27,1.14l-0.09,0.14l-0.5,1.73l-1.73,0.53l-0.15,0.1l-1.68,2.1l-3.03,0.04l-2.38,-0.05l-0.17,0.05l-1.57,1.01l-0.9,1.01l-0.96,-0.19l-0.82,-0.86l-0.69,-1.6l-0.22,-0.18l-2.14,-0.41l-0.13,-0.62l0.83,-0.97l0.39,-0.86l-0.06,-0.33l-0.73,-0.73l0.63,-1.74l-0.02,-0.25l-0.8,-1.41l0.69,-0.15l0.23,-0.27l0.09,-1.29l0.33,-0.36l0.08,-0.2l0.03,-2.16l1.03,-0.72l0.1,-0.37l-0.7,-1.5l-0.25,-0.17l-1.46,-0.11l-0.22,0.07l-0.34,0.3l-1.17,0.0l-0.55,-1.29l-0.39,-0.16l-1.02,0.44l-0.45,0.36Z" data-code="ES" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M527.15,253.05l-0.77,-0.74l-1.01,-1.47l-1.14,-0.86l-0.62,-0.84l-0.11,-0.09l-2.18,-1.02l-0.12,-0.03l-1.61,-0.03l-0.52,-0.46l-0.31,-0.05l-1.31,0.54l-1.38,-1.06l-0.46,0.12l-0.69,1.68l-2.49,-0.46l-0.2,-0.76l1.06,-3.69l0.24,-1.65l0.66,-0.66l1.76,-0.4l0.16,-0.1l0.97,-1.13l1.24,2.55l0.68,2.34l0.09,0.14l1.4,1.27l3.39,2.4l1.37,1.43l2.14,2.34l0.94,0.6l-0.32,0.26l-0.85,-0.17Z" data-code="ER" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M469.05,172.9l-0.57,-0.8l-0.1,-0.09l-0.82,-0.46l0.16,-0.33l0.35,-1.57l0.72,-0.62l0.27,-0.16l0.48,0.38l0.35,0.4l0.12,0.08l0.79,0.32l0.66,0.43l-0.43,0.62l-0.28,0.11l-0.07,-0.25l-0.53,-0.1l-1.09,1.49l-0.05,0.23l0.06,0.32Z" data-code="ME" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M488.2,153.75l0.14,-0.11l1.49,-0.28l1.75,0.95l1.06,0.14l0.92,0.7l-0.15,0.9l0.15,0.31l0.8,0.46l0.33,1.2l0.09,0.14l0.72,0.66l-0.11,0.28l0.1,0.33l-0.06,0.02l-1.25,-0.08l-0.17,-0.29l-0.39,-0.12l-0.52,0.25l-0.16,0.36l0.13,0.42l-0.6,0.88l-0.43,1.03l-0.22,0.12l-0.32,-1.0l0.25,-1.34l-0.08,-1.38l-0.06,-0.17l-1.43,-1.87l-0.81,-1.36l-0.78,-0.95l-0.12,-0.09l-0.29,-0.12Z" data-code="MD" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M544.77,316.45l0.64,1.04l0.6,1.62l0.4,3.04l0.63,1.21l-0.22,1.07l-0.15,0.26l-0.59,-1.05l-0.52,-0.01l-0.47,0.76l-0.04,0.23l0.46,1.84l-0.19,0.92l-0.61,0.53l-0.1,0.21l-0.16,2.15l-0.97,2.98l-1.24,3.59l-1.55,4.97l-0.96,3.67l-1.08,2.93l-1.94,0.61l-2.05,1.06l-3.2,-1.53l-0.62,-1.26l-0.18,-2.39l-0.87,-2.07l-0.22,-1.8l0.4,-1.69l1.01,-0.4l0.19,-0.28l0.01,-0.79l1.15,-1.91l0.04,-0.11l0.23,-1.66l-0.03,-0.17l-0.57,-1.21l-0.46,-1.58l-0.19,-2.25l0.82,-1.36l0.33,-1.51l1.11,-0.1l1.4,-0.53l0.9,-0.45l1.03,-0.03l0.21,-0.09l1.41,-1.45l2.12,-1.65l0.75,-1.29l0.03,-0.24l-0.17,-0.56l0.53,0.15l0.32,-0.1l1.38,-1.77l0.06,-0.18l0.04,-1.44l0.54,-0.74l0.62,0.77Z" data-code="MG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M378.66,230.13l0.07,-0.75l0.93,-0.72l0.82,-1.37l0.04,-0.21l-0.14,-0.8l0.8,-1.74l1.33,-1.61l0.79,-0.4l0.14,-0.15l0.66,-1.55l0.08,-1.46l0.83,-1.52l1.6,-0.94l0.11,-0.11l1.56,-2.71l1.2,-0.99l2.24,-0.29l0.17,-0.08l1.95,-1.83l1.3,-0.77l2.09,-2.28l0.07,-0.26l-0.61,-3.34l0.92,-2.3l0.33,-1.44l1.52,-1.79l2.48,-1.27l1.86,-1.16l0.1,-0.11l1.67,-2.93l0.72,-1.59l1.54,0.01l1.43,1.14l0.21,0.06l2.33,-0.19l2.55,0.62l0.97,0.03l0.83,1.6l0.15,1.71l0.86,2.96l0.09,0.14l0.5,0.45l-0.31,0.73l-3.11,0.44l-0.16,0.07l-1.07,0.97l-1.36,0.23l-0.25,0.28l-0.1,1.85l-2.74,1.02l-0.14,0.11l-0.9,1.3l-1.93,0.69l-2.56,0.44l-4.04,2.01l-0.17,0.27l0.02,2.91l-0.08,0.0l-0.3,0.31l0.05,1.15l-1.25,0.07l-0.16,0.06l-0.73,0.55l-0.98,0.0l-0.85,-0.33l-0.15,-0.02l-2.11,0.29l-0.24,0.19l-0.76,1.95l-0.63,0.16l-0.21,0.19l-1.15,3.29l-3.42,2.81l-0.1,0.17l-0.81,3.57l-0.98,1.12l-0.3,0.85l-5.13,0.19Z" data-code="MA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M587.83,186.48l0.06,-1.46l-0.19,-0.29l-3.31,-1.24l-2.57,-1.4l-1.63,-1.38l-2.79,-1.98l-1.2,-2.98l-0.12,-0.14l-0.84,-0.54l-0.18,-0.05l-2.61,0.13l-0.76,-0.48l-0.25,-2.25l-0.17,-0.24l-3.37,-1.6l-0.32,0.04l-2.08,1.73l-2.11,1.02l-0.16,0.35l0.31,1.14l-2.14,0.03l-0.09,-10.68l6.1,-1.74l6.25,3.57l2.36,2.72l0.27,0.1l2.92,-0.44l4.17,-0.23l2.78,2.06l-0.18,2.87l0.29,0.32l0.98,0.02l0.46,2.22l0.28,0.24l3.0,0.09l0.61,1.25l0.28,0.17l0.93,-0.02l0.26,-0.16l1.06,-2.06l3.21,-2.03l1.3,-0.5l0.19,0.08l-1.75,1.62l0.05,0.48l1.85,1.12l0.27,0.02l1.65,-0.69l2.4,1.27l-2.69,1.79l-1.79,-0.27l-0.89,0.06l-0.22,-0.52l0.48,-1.26l-0.34,-0.4l-3.35,0.69l-0.22,0.18l-0.78,1.87l-1.07,1.47l-1.93,-0.13l-0.29,0.16l-0.65,1.29l0.16,0.42l1.69,0.64l0.48,1.91l-1.25,2.6l-1.64,-0.53l-1.18,-0.03Z" data-code="UZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M670.1,233.39l-1.46,1.11l-1.68,0.11l-0.26,0.19l-1.1,2.7l-0.95,0.42l-0.14,0.42l1.21,2.27l1.61,1.92l0.94,1.55l-0.82,1.99l-0.77,0.42l-0.13,0.39l0.64,1.35l1.62,1.97l0.26,1.32l-0.04,1.15l0.02,0.13l0.92,2.18l-1.3,2.23l-0.79,1.69l-0.1,-0.77l0.74,-1.87l-0.02,-0.26l-0.8,-1.42l0.2,-2.68l-0.06,-0.2l-0.98,-1.27l-0.8,-2.98l-0.45,-3.22l-1.11,-2.22l-0.45,-0.1l-1.64,1.28l-2.74,1.76l-1.26,-0.2l-1.27,-0.49l0.79,-2.93l0.0,-0.14l-0.52,-2.42l-1.93,-2.97l0.26,-0.8l-0.22,-0.39l-1.37,-0.31l-1.65,-1.98l-0.12,-1.5l0.41,0.19l0.42,-0.26l0.05,-1.7l1.08,-0.54l0.16,-0.34l-0.24,-1.0l0.5,-0.79l0.05,-0.15l0.08,-2.35l1.58,0.49l0.36,-0.15l1.12,-2.19l0.15,-1.34l1.35,-2.18l0.04,-0.17l-0.07,-1.35l2.97,-1.71l1.67,0.45l0.38,-0.33l-0.18,-1.46l0.7,-0.4l0.15,-0.32l-0.13,-0.72l0.94,-0.13l0.74,1.41l0.11,0.12l0.95,0.56l0.07,1.89l-0.09,2.08l-2.28,2.15l-0.09,0.19l-0.3,3.15l0.35,0.32l2.37,-0.39l0.53,2.17l0.2,0.21l1.3,0.42l-0.63,1.9l0.14,0.36l1.86,0.99l1.1,0.49l0.24,0.0l1.45,-0.6l0.04,0.51l-2.01,1.6l-0.56,0.96l-1.34,0.56Z" data-code="MM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M390.79,248.2l0.67,-0.37l0.14,-0.18l0.36,-1.31l0.51,-0.04l1.68,0.69l0.21,0.0l1.34,-0.48l0.89,0.16l0.3,-0.13l0.29,-0.44l9.89,-0.04l0.29,-0.21l0.56,-1.8l-0.11,-0.33l-0.33,-0.24l-2.37,-22.1l3.41,-0.04l8.37,5.73l8.38,5.68l0.56,1.15l0.14,0.14l1.56,0.75l0.99,0.36l0.03,1.45l0.33,0.29l2.45,-0.22l0.01,5.52l-1.3,1.64l-0.06,0.15l-0.18,1.37l-1.99,0.36l-3.4,0.22l-0.19,0.09l-0.85,0.83l-1.48,0.09l-1.49,0.01l-0.54,-0.43l-0.26,-0.05l-1.38,0.36l-2.39,1.08l-0.13,0.12l-0.44,0.73l-1.88,1.11l-0.11,0.12l-0.3,0.57l-0.86,0.42l-1.1,-0.31l-0.28,0.07l-0.69,0.62l-0.09,0.16l-0.35,1.66l-1.93,2.04l-0.08,0.23l0.05,0.76l-0.63,0.99l-0.04,0.19l0.14,1.23l-0.81,0.29l-0.32,0.17l-0.27,-0.75l-0.39,-0.18l-0.65,0.26l-0.36,-0.04l-0.29,0.14l-0.37,0.6l-1.69,-0.02l-0.63,-0.34l-0.32,0.02l-0.12,0.09l-0.47,-0.45l0.1,-0.6l-0.09,-0.27l-0.31,-0.3l-0.33,-0.05l-0.05,0.02l0.02,-0.21l0.46,-0.59l-0.02,-0.39l-0.99,-1.02l-0.34,-0.74l-0.56,-0.56l-0.17,-0.09l-0.5,-0.07l-0.19,0.04l-0.58,0.35l-0.79,0.33l-0.65,0.51l-0.85,-0.16l-0.63,-0.59l-0.14,-0.07l-0.41,-0.08l-0.2,0.03l-0.59,0.31l-0.07,0.0l-0.1,-0.63l0.11,-0.85l-0.21,-0.98l-0.11,-0.17l-0.86,-0.66l-0.45,-1.34l-0.1,-1.36Z" data-code="ML" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M641.06,150.59l2.41,-0.53l4.76,-2.8l3.67,-1.49l2.06,0.96l0.12,0.03l2.5,0.05l1.59,1.45l0.19,0.08l2.47,0.12l3.59,0.81l0.27,-0.07l2.43,-2.28l0.06,-0.36l-0.93,-1.77l2.33,-3.1l2.66,1.3l2.26,0.39l2.75,0.8l0.44,2.3l0.19,0.22l3.56,1.38l0.18,0.01l2.35,-0.6l3.1,-0.42l2.4,0.41l2.37,1.52l1.49,1.63l0.23,0.1l2.29,-0.03l3.13,0.52l0.15,-0.01l2.28,-0.79l3.27,-0.53l0.11,-0.04l3.56,-2.23l1.31,0.31l1.26,1.05l0.22,0.07l2.45,-0.22l-0.98,1.96l-1.77,3.21l-0.01,0.28l0.64,1.31l0.35,0.16l1.35,-0.38l2.4,0.48l0.22,-0.04l1.78,-1.09l1.82,0.92l2.11,2.07l-0.17,0.68l-1.79,-0.31l-3.74,0.45l-1.85,0.96l-1.78,2.01l-3.74,1.18l-2.46,1.61l-2.45,-0.6l-1.42,-0.28l-0.31,0.13l-1.31,1.99l0.0,0.33l0.78,1.15l0.3,0.74l-1.58,0.93l-1.75,1.59l-2.83,1.03l-3.77,0.12l-4.05,1.05l-2.81,1.54l-0.95,-0.8l-0.19,-0.07l-2.96,0.0l-3.64,-1.8l-2.55,-0.48l-3.38,0.41l-5.13,-0.67l-2.66,0.06l-1.35,-1.65l-1.12,-2.78l-0.21,-0.18l-1.5,-0.33l-2.98,-1.89l-0.12,-0.04l-3.37,-0.43l-2.84,-0.51l-0.75,-1.13l0.93,-3.54l-0.04,-0.24l-1.73,-2.55l-0.15,-0.12l-3.52,-1.18l-1.99,-1.61l-0.54,-1.85Z" data-code="MN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M472.73,173.87l0.08,0.01l0.32,-0.25l0.08,-0.44l1.29,-0.41l1.37,-0.28l1.03,-0.04l1.06,0.82l0.14,1.59l-0.22,0.04l-0.17,0.11l-0.32,0.4l-1.2,-0.05l-0.18,0.05l-0.9,0.61l-1.45,0.23l-0.85,-0.59l-0.3,-1.09l0.22,-0.71Z" data-code="MK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M507.18,313.84l-0.67,1.85l-0.01,0.16l0.7,3.31l0.31,0.24l0.75,-0.03l0.78,0.71l0.99,1.75l0.2,3.03l-0.91,0.45l-0.14,0.15l-0.59,1.38l-1.24,-1.21l-0.17,-1.62l0.49,-1.12l0.02,-0.16l-0.15,-1.03l-0.13,-0.21l-0.99,-0.65l-0.26,-0.03l-0.53,0.18l-1.31,-1.12l-1.15,-0.59l0.66,-2.06l0.75,-0.84l0.07,-0.27l-0.47,-2.04l0.48,-1.94l0.4,-0.65l0.03,-0.24l-0.64,-2.15l-0.08,-0.13l-0.44,-0.42l1.34,0.26l1.25,1.73l0.67,3.3Z" data-code="MW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M390.54,247.66l-1.48,-1.58l-1.51,-1.88l-0.12,-0.09l-1.64,-0.67l-1.17,-0.74l-0.17,-0.05l-1.4,0.03l-0.12,0.03l-1.14,0.52l-1.15,-0.21l-0.26,0.08l-0.44,0.43l-0.11,-0.72l0.68,-1.29l0.31,-2.43l-0.28,-2.63l-0.29,-1.27l0.24,-1.24l-0.03,-0.2l-0.65,-1.24l-1.19,-1.05l0.32,-0.51l9.64,0.02l0.3,-0.34l-0.46,-3.71l0.51,-1.12l2.17,-0.22l0.27,-0.3l-0.08,-6.5l7.91,0.13l0.31,-0.3l0.01,-3.5l8.17,5.63l-2.89,0.04l-0.29,0.33l2.42,22.56l0.12,0.21l0.26,0.19l-0.43,1.38l-9.83,0.04l-0.25,0.13l-0.27,0.41l-0.77,-0.14l-0.15,0.01l-1.3,0.47l-1.64,-0.67l-0.14,-0.02l-0.79,0.06l-0.27,0.22l-0.39,1.39l-0.53,0.29Z" data-code="MR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M500.74,287.17l-2.84,-0.02l-0.92,0.32l-1.37,0.71l-0.29,-0.12l0.02,-1.6l0.54,-0.89l0.04,-0.13l0.14,-1.96l0.49,-1.09l0.91,-1.24l0.97,-0.68l0.8,-0.89l-0.13,-0.49l-0.79,-0.27l0.13,-2.55l0.78,-0.52l1.45,0.51l0.18,0.01l1.97,-0.57l1.72,0.01l0.18,-0.06l1.29,-0.97l0.98,1.44l0.29,1.24l1.05,2.75l-0.84,1.68l-1.94,2.66l-0.06,0.18l0.02,2.36l-4.8,0.18Z" data-code="UG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M717.6,273.52l-1.51,0.7l-2.13,-0.41l-2.88,-0.0l-0.29,0.21l-0.84,2.77l-0.9,0.82l-0.08,0.12l-1.23,3.34l-1.81,0.47l-2.29,-0.68l-0.14,-0.01l-1.2,0.22l-0.14,0.07l-1.36,1.18l-1.47,-0.17l-0.12,0.01l-1.46,0.46l-1.51,-1.25l-0.24,-0.97l1.26,0.59l0.2,0.02l1.93,-0.47l0.22,-0.22l0.47,-1.98l0.9,-0.4l2.97,-0.54l0.17,-0.09l1.8,-1.98l1.02,-1.32l0.9,1.03l0.48,-0.04l0.43,-0.7l1.02,0.07l0.32,-0.27l0.25,-2.72l1.84,-1.67l1.23,-1.89l0.73,-0.01l1.12,1.11l0.1,0.99l0.18,0.24l1.66,0.71l1.85,0.67l-0.09,0.51l-1.45,0.11l-0.26,0.4l0.35,0.97ZM673.78,269.53l0.17,1.14l0.35,0.25l1.65,-0.3l0.18,-0.11l0.68,-0.86l0.31,0.13l1.41,1.45l0.99,1.59l0.13,1.57l-0.26,1.09l0.0,0.15l0.24,0.84l0.18,1.46l0.11,0.2l0.82,0.64l0.92,2.08l-0.03,0.52l-1.4,0.13l-2.29,-1.79l-2.86,-1.92l-0.27,-1.16l-0.07,-0.13l-1.39,-1.61l-0.33,-1.99l-0.05,-0.12l-0.84,-1.27l0.26,-1.72l-0.03,-0.18l-0.45,-0.87l0.13,-0.13l1.71,0.92Z" data-code="MY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M133.41,213.83l0.61,0.09l0.27,-0.09l0.93,-1.01l0.08,-0.18l0.09,-1.22l-0.09,-0.23l-1.93,-1.94l-1.46,-0.77l-2.96,-5.62l-0.86,-2.1l2.44,-0.18l2.68,-0.25l-0.03,0.08l0.17,0.4l3.79,1.35l5.81,1.97l6.96,-0.02l0.3,-0.3l0.0,-0.84l3.91,0.0l0.87,0.93l1.27,0.87l1.44,1.17l0.79,1.37l0.62,1.49l0.12,0.14l1.35,0.85l2.08,0.82l0.35,-0.1l1.49,-2.04l1.81,-0.05l1.63,1.01l1.21,1.8l0.86,1.58l1.47,1.55l0.53,1.82l0.73,1.32l0.14,0.13l1.98,0.84l1.78,0.59l0.61,-0.03l-0.78,1.89l-0.45,1.96l-0.19,3.58l-0.24,1.27l0.01,0.14l0.43,1.43l0.78,1.31l0.49,1.98l0.06,0.12l1.63,1.9l0.61,1.51l0.98,1.28l0.16,0.11l2.58,0.67l0.98,1.02l0.31,0.08l2.17,-0.71l1.91,-0.26l1.87,-0.47l1.67,-0.49l1.59,-1.06l0.11,-0.14l0.6,-1.52l0.22,-2.21l0.35,-0.62l1.58,-0.64l2.59,-0.59l2.18,0.09l1.43,-0.2l0.39,0.36l-0.07,1.02l-1.28,1.48l-0.65,1.68l0.07,0.32l0.33,0.32l-0.79,2.49l-0.28,-0.3l-0.24,-0.09l-1.0,0.08l-0.24,0.15l-0.74,1.28l-0.19,-0.13l-0.28,-0.03l-0.3,0.12l-0.19,0.29l0.0,0.06l-4.34,-0.02l-0.3,0.3l-0.0,1.16l-0.83,0.0l-0.28,0.19l0.08,0.33l0.93,0.86l0.9,0.58l0.24,0.48l0.16,0.15l0.2,0.08l-0.03,0.38l-2.94,0.01l-0.26,0.15l-1.21,2.09l0.02,0.33l0.25,0.33l-0.21,0.44l-0.04,0.22l-2.42,-2.35l-1.36,-0.87l-2.04,-0.67l-0.13,-0.01l-1.4,0.19l-2.07,0.98l-1.14,0.23l-1.72,-0.66l-1.85,-0.48l-2.31,-1.16l-1.92,-0.38l-2.79,-1.18l-2.04,-1.2l-0.6,-0.66l-0.19,-0.1l-1.37,-0.15l-2.45,-0.78l-1.07,-1.18l-2.63,-1.44l-1.2,-1.56l-0.44,-0.93l0.5,-0.15l0.2,-0.39l-0.2,-0.58l0.46,-0.55l0.07,-0.19l0.01,-0.91l-0.06,-0.18l-0.81,-1.13l-0.25,-1.08l-0.86,-1.36l-2.21,-2.63l-2.53,-2.09l-1.2,-1.63l-0.11,-0.09l-2.08,-1.06l-0.34,-0.48l0.35,-1.53l-0.16,-0.34l-1.24,-0.61l-1.39,-1.23l-0.6,-1.81l-0.24,-0.2l-1.25,-0.2l-1.38,-1.35l-1.11,-1.25l-0.1,-0.76l-0.05,-0.13l-1.33,-2.04l-0.85,-2.02l0.04,-0.99l-0.14,-0.27l-1.81,-1.1l-0.2,-0.04l-0.74,0.11l-1.34,-0.72l-0.42,0.16l-0.4,1.12l-0.0,0.19l0.41,1.3l0.24,2.04l0.06,0.15l0.88,1.16l1.84,1.86l0.4,0.61l0.12,0.1l0.27,0.14l0.29,0.82l0.31,0.2l0.2,-0.02l0.43,1.51l0.09,0.14l0.72,0.65l0.51,0.91l1.58,1.4l0.8,2.42l0.77,1.23l0.66,1.19l0.13,1.34l0.28,0.27l1.08,0.08l0.92,1.1l0.83,1.08l-0.03,0.24l-0.88,0.81l-0.13,-0.0l-0.59,-1.42l-0.07,-0.11l-1.67,-1.53l-1.81,-1.28l-1.15,-0.61l0.07,-1.85l-0.38,-1.45l-0.12,-0.17l-2.91,-2.03l-0.39,0.04l-0.11,0.11l-0.42,-0.46l-0.11,-0.08l-1.49,-0.63l-1.09,-1.16Z" data-code="MX" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M839.92,325.66l0.78,0.73l-0.18,0.07l-0.6,-0.8ZM839.13,322.74l0.27,1.36l-0.13,-0.06l-0.21,-0.02l-0.29,0.08l-0.22,-0.43l-0.03,-1.32l0.61,0.4Z" data-code="VU" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M444.58,172.63l-0.68,1.92l-0.72,-0.38l-0.51,-1.79l0.43,-0.95l1.15,-0.83l0.33,2.04ZM429.71,147.03l1.77,1.57l0.26,0.07l1.16,-0.23l2.12,1.44l0.56,0.28l0.16,0.03l0.61,-0.06l1.09,0.78l0.13,0.05l3.18,0.53l-1.09,1.94l-0.3,2.16l-0.48,0.38l-1.0,-0.26l-0.37,0.32l0.07,0.66l-1.73,1.68l-0.09,0.21l-0.04,1.42l0.41,0.29l0.96,-0.4l0.67,1.07l-0.09,0.78l0.04,0.19l0.61,0.97l-0.71,0.78l-0.07,0.28l0.65,2.39l0.21,0.21l1.09,0.31l-0.2,0.95l-2.08,1.58l-4.81,-0.8l-0.13,0.01l-3.65,0.99l-0.22,0.24l-0.25,1.6l-2.59,0.35l-2.74,-1.33l-0.31,0.03l-0.79,0.57l-4.38,-1.31l-0.79,-0.94l1.16,-1.64l0.05,-0.15l0.48,-6.17l-0.06,-0.21l-2.58,-3.3l-1.89,-1.65l-0.11,-0.06l-3.64,-1.17l-0.2,-1.88l2.92,-0.63l4.14,0.82l0.35,-0.36l-0.65,-3.0l1.77,1.05l0.27,0.02l5.83,-2.54l0.17,-0.19l0.71,-2.54l1.75,-0.53l0.27,0.88l0.27,0.21l1.04,0.05l1.08,1.23ZM289.1,278.45l-0.85,0.84l-0.88,0.13l-0.25,-0.51l-0.21,-0.16l-0.56,-0.1l-0.25,0.07l-0.63,0.55l-0.62,-0.29l0.5,-0.88l0.21,-1.11l0.42,-1.05l-0.03,-0.28l-0.93,-1.42l-0.18,-1.54l1.13,-1.87l2.42,0.78l2.55,2.04l0.33,0.81l-1.4,2.16l-0.77,1.84Z" data-code="FR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M492.26,76.42l-0.38,3.12l0.12,0.28l3.6,2.69l-2.14,2.96l-0.01,0.33l2.83,4.61l-1.61,3.36l0.03,0.31l2.15,2.87l-0.96,2.44l0.1,0.35l3.51,2.55l-0.81,1.72l-2.28,2.19l-5.28,4.79l-4.51,0.31l-4.39,1.37l-3.87,0.75l-1.34,-1.89l-0.11,-0.09l-2.23,-1.14l0.53,-3.54l-0.01,-0.14l-1.17,-3.37l1.12,-2.13l2.23,-2.44l5.69,-4.33l1.65,-0.84l0.16,-0.31l-0.26,-1.73l-0.15,-0.22l-3.4,-1.91l-0.77,-1.47l-0.07,-6.45l-0.12,-0.24l-3.91,-2.94l-3.0,-1.92l0.97,-0.76l2.6,2.17l0.21,0.07l3.2,-0.21l2.63,1.03l0.3,-0.05l2.39,-1.94l0.09,-0.13l1.18,-3.12l3.63,-1.42l2.87,1.59l-0.98,2.87Z" data-code="FI" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M869.98,327.07l-1.31,0.44l-0.14,-0.41l0.96,-0.41l0.85,-0.17l1.43,-0.78l-0.16,0.65l-1.64,0.67ZM867.58,329.12l0.54,0.47l-0.31,1.0l-1.32,0.3l-1.13,-0.26l-0.17,-0.78l0"""),
format.raw(""".72,-0.66l0.98,0.27l0.25,-0.04l0.43,-0.29Z" data-code="FJ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M268.15,427.89l2.6,-1.73l1.98,0.77l0.31,-0.05l1.32,-1.17l1.58,1.18l-0.54,0.84l-3.1,0.92l-1.0,-1.04l-0.39,-0.04l-1.9,1.35l-0.86,-1.04Z" data-code="FK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M202.1,252.6l0.23,-0.0l0.12,-0.11l0.68,-0.09l0.22,-0.15l0.23,-0.43l0.2,-0.01l0.28,-0.31l-0.04,-0.97l0.29,-0.03l0.5,0.02l0.25,-0.11l0.37,-0.46l0.51,0.35l0.4,-0.06l0.23,-0.28l0.45,-0.29l0.87,-0.7l0.11,-0.21l0.02,-0.26l0.23,-0.12l0.25,-0.48l0.29,0.27l0.14,0.07l0.5,0.12l0.22,-0.03l0.48,-0.28l0.66,-0.02l0.87,-0.33l0.36,-0.32l0.21,0.01l-0.11,0.48l0.0,0.14l0.22,0.8l-0.54,0.85l-0.27,1.03l-0.09,1.18l0.14,0.72l0.05,0.95l-0.24,0.15l-0.13,0.19l-0.23,1.09l0.0,0.14l0.14,0.53l-0.42,0.53l-0.06,0.24l0.12,0.69l0.08,0.15l0.18,0.19l-0.26,0.23l-0.49,-0.11l-0.35,-0.44l-0.16,-0.1l-0.79,-0.21l-0.23,0.03l-0.45,0.26l-1.51,-0.62l-0.31,0.05l-0.17,0.15l-1.81,-1.62l-0.6,-0.9l-1.04,-0.79l-0.77,-0.71Z" data-code="NI" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M436.22,136.65l1.82,0.08l0.36,0.89l-0.6,2.96l-0.53,1.06l-1.32,0.0l-0.3,0.34l0.35,2.89l-0.83,-0.47l-1.56,-1.43l-0.29,-0.07l-2.26,0.67l-1.02,-0.15l0.68,-0.48l0.1,-0.12l2.14,-4.84l3.25,-1.35Z" data-code="NL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M491.45,67.31l7.06,3.0l-2.52,0.94l-0.11,0.49l2.43,2.49l-3.82,1.59l-1.48,0.3l0.89,-2.61l-0.14,-0.36l-3.21,-1.78l-0.25,-0.02l-3.89,1.52l-0.17,0.17l-1.2,3.17l-2.19,1.78l-2.53,-0.99l-0.13,-0.02l-3.15,0.21l-2.69,-2.25l-0.38,-0.01l-1.43,1.11l-1.47,0.17l-0.26,0.26l-0.33,2.57l-4.42,-0.65l-0.33,0.22l-0.6,2.19l-2.17,-0.01l-0.27,0.16l-4.15,7.68l-3.88,5.76l-0.0,0.33l0.81,1.23l-0.7,1.27l-2.3,-0.06l-0.28,0.18l-1.63,3.72l-0.02,0.13l0.15,5.17l0.07,0.18l1.51,1.84l-0.79,4.24l-2.04,2.5l-0.92,1.75l-1.39,-1.88l-0.44,-0.05l-4.89,4.21l-3.16,0.81l-3.24,-1.74l-0.86,-3.82l-0.78,-8.6l2.18,-2.36l6.56,-3.28l5.0,-4.16l4.63,-5.74l5.99,-8.09l4.17,-3.23l6.84,-5.49l5.39,-1.92l4.06,0.24l0.23,-0.09l3.72,-3.67l4.51,0.19l4.4,-0.89ZM484.58,19.95l4.42,1.82l-3.25,2.68l-7.14,0.65l-7.16,-0.91l-0.39,-1.37l-0.28,-0.22l-3.48,-0.1l-2.25,-2.15l7.09,-1.48l3.55,1.36l0.28,-0.03l2.42,-1.66l6.18,1.41ZM481.99,33.92l-4.73,1.85l-3.76,-1.06l1.27,-1.02l0.04,-0.43l-1.18,-1.35l4.46,-0.94l0.89,1.83l0.17,0.15l2.83,0.96ZM466.5,23.95l7.64,3.87l-5.63,1.94l-0.19,0.19l-1.35,3.88l-2.08,0.96l-0.16,0.19l-1.14,4.18l-2.71,0.18l-4.94,-2.95l1.95,-1.63l-0.08,-0.51l-3.7,-1.54l-4.79,-4.54l-1.78,-4.01l6.29,-1.88l1.25,1.81l0.25,0.13l3.57,-0.08l0.26,-0.17l0.87,-1.79l3.41,-0.18l3.08,1.94Z" data-code="NO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M461.88,357.98l-1.61,-1.77l-0.94,-1.9l-0.54,-2.58l-0.62,-1.95l-0.83,-4.05l-0.06,-3.13l-0.33,-1.5l-0.07,-0.14l-0.95,-1.06l-1.27,-2.12l-1.3,-3.1l-0.59,-1.71l-1.98,-2.46l-0.13,-1.67l0.99,-0.4l1.44,-0.42l1.48,0.07l1.42,1.11l0.31,0.03l0.32,-0.15l9.99,-0.11l1.66,1.18l0.16,0.06l6.06,0.37l4.69,-1.06l2.01,-0.57l1.5,0.14l0.63,0.37l-1.0,0.41l-0.7,0.01l-0.16,0.05l-1.38,0.88l-0.79,-0.88l-0.29,-0.09l-3.83,0.9l-1.84,0.08l-0.29,0.3l-0.07,8.99l-2.18,0.08l-0.29,0.3l-0.0,17.47l-2.04,1.27l-1.21,0.18l-1.51,-0.49l-0.99,-0.18l-0.36,-1.0l-0.1,-0.14l-0.99,-0.74l-0.4,0.04l-0.98,1.09Z" data-code="NA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M835.87,338.68l2.06,1.63l1.01,0.94l-0.49,0.32l-1.21,-0.62l-1.76,-1.16l-1.58,-1.36l-1.61,-1.79l-0.16,-0.41l0.54,0.02l1.32,0.83l1.08,0.87l0.79,0.73Z" data-code="NC" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M426.67,254.17l0.03,-1.04l-0.24,-0.3l-2.66,-0.53l-0.06,-1.0l-0.07,-0.17l-1.37,-1.62l-0.3,-1.04l0.15,-0.94l1.37,-0.09l0.19,-0.09l0.85,-0.83l3.34,-0.22l2.22,-0.41l0.24,-0.26l0.2,-1.5l1.32,-1.65l0.07,-0.19l-0.01,-5.74l3.4,-1.13l7.24,-5.12l8.46,-4.95l3.76,1.08l1.35,1.39l0.36,0.05l1.39,-0.77l0.55,3.66l0.12,0.2l0.82,0.6l0.03,0.69l0.1,0.21l0.87,0.74l-0.47,0.99l-0.96,5.26l-0.13,3.25l-3.08,2.34l-0.1,0.15l-1.08,3.37l0.08,0.31l0.94,0.86l-0.01,1.51l0.29,0.3l1.25,0.05l-0.14,0.66l-0.51,0.11l-0.24,0.26l-0.06,0.57l-0.04,0.0l-1.59,-2.62l-0.21,-0.14l-0.59,-0.1l-0.23,0.05l-1.83,1.33l-1.79,-0.68l-1.42,-0.17l-0.17,0.03l-0.65,0.32l-1.39,-0.07l-0.19,0.06l-1.4,1.03l-1.12,0.05l-2.97,-1.29l-0.26,0.01l-1.12,0.59l-1.08,-0.04l-0.85,-0.88l-0.11,-0.07l-2.51,-0.95l-0.14,-0.02l-2.69,0.3l-0.16,0.07l-0.65,0.55l-0.1,0.16l-0.34,1.41l-0.69,0.98l-0.05,0.15l-0.13,1.72l-1.47,-1.13l-0.18,-0.06l-0.9,0.01l-0.2,0.08l-0.32,0.28Z" data-code="NE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M442.0,272.7l-2.4,0.83l-0.88,-0.12l-0.19,0.04l-0.89,0.52l-1.78,-0.05l-1.23,-1.44l-0.88,-1.87l-1.77,-1.66l-0.21,-0.08l-3.78,0.03l0.13,-3.75l-0.06,-1.58l0.44,-1.47l0.74,-0.75l1.21,-1.56l0.04,-0.29l-0.22,-0.56l0.44,-0.9l0.01,-0.24l-0.54,-1.44l0.26,-2.97l0.72,-1.06l0.33,-1.37l0.51,-0.43l2.53,-0.28l2.38,0.9l0.89,0.91l0.2,0.09l1.28,0.04l0.15,-0.03l1.06,-0.56l2.9,1.26l0.13,0.02l1.28,-0.06l0.16,-0.06l1.39,-1.02l1.36,0.07l0.15,-0.03l0.64,-0.32l1.22,0.13l1.9,0.73l0.28,-0.04l1.86,-1.35l0.33,0.06l1.62,2.67l0.29,0.14l0.32,-0.04l0.73,0.74l-0.19,0.37l-0.12,0.74l-2.03,1.89l-0.07,0.11l-0.66,1.62l-0.35,1.28l-0.48,0.51l-0.07,0.12l-0.48,1.67l-1.26,0.98l-0.1,0.15l-0.38,1.24l-0.58,1.07l-0.2,0.91l-1.43,0.7l-1.26,-0.93l-0.19,-0.06l-0.95,0.04l-0.2,0.09l-1.41,1.39l-0.61,0.02l-0.26,0.17l-1.19,2.42l-0.61,1.67Z" data-code="NG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M857.9,379.62l1.85,3.1l0.33,0.14l0.22,-0.28l0.04,-1.41l0.57,0.4l0.35,2.06l0.17,0.22l2.02,0.94l1.78,0.26l0.22,-0.06l1.31,-1.01l0.84,0.22l-0.53,2.27l-0.67,1.5l-1.71,-0.05l-0.25,0.12l-0.67,0.89l-0.05,0.23l0.21,1.15l-0.31,0.46l-2.15,3.57l-1.6,0.99l-0.28,-0.51l-0.15,-0.13l-0.72,-0.3l1.27,-2.15l0.01,-0.29l-0.82,-1.63l-0.15,-0.14l-2.5,-1.09l0.05,-0.69l1.67,-0.94l0.15,-0.21l0.42,-2.24l-0.11,-1.95l-0.03,-0.12l-0.97,-1.85l0.05,-0.41l-0.09,-0.25l-1.18,-1.17l-1.94,-2.49l-0.86,-1.64l0.38,-0.09l1.24,1.43l0.12,0.08l1.81,0.68l0.67,2.39ZM853.93,393.55l0.57,1.24l0.44,0.12l1.51,-1.03l0.52,0.91l0.0,1.09l-0.88,1.31l-1.62,2.2l-1.26,1.2l-0.05,0.38l0.64,1.02l-1.4,0.03l-0.14,0.04l-2.14,1.16l-0.14,0.17l-0.67,2.0l-1.38,3.06l-3.07,2.19l-2.12,-0.06l-1.55,-0.99l-0.14,-0.05l-2.53,-0.2l-0.31,-0.84l1.25,-2.15l3.07,-2.97l1.62,-0.59l1.81,-1.17l2.18,-1.63l1.55,-1.65l1.08,-2.18l0.9,-0.72l0.11,-0.17l0.35,-1.56l1.37,-1.07l0.4,0.91Z" data-code="NZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M641.26,213.53l-0.14,0.95l0.32,1.64l-0.21,0.78l-1.83,0.04l-2.98,-0.62l-1.86,-0.25l-1.37,-1.3l-0.18,-0.08l-3.38,-0.34l-3.21,-1.49l-2.38,-1.34l-2.16,-0.92l0.84,-2.2l1.51,-1.18l0.89,-0.57l1.83,0.77l2.5,1.76l1.39,0.41l0.78,1.21l0.17,0.13l1.91,0.53l2.0,1.17l2.92,0.66l2.63,0.24Z" data-code="NP" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M413.53,272.08l-0.83,0.02l-1.79,-0.49l-1.64,0.03l-3.04,0.46l-1.73,0.72l-2.4,0.89l-0.12,-0.02l0.16,-1.7l0.19,-0.25l0.06,-0.2l-0.08,-0.99l-0.09,-0.19l-1.06,-1.05l-0.15,-0.08l-0.71,-0.15l-0.51,-0.48l0.45,-0.92l0.02,-0.19l-0.24,-1.16l0.07,-0.43l0.14,-0.0l0.3,-0.26l0.15,-1.1l-0.02,-0.15l-0.13,-0.34l0.09,-0.13l0.83,-0.27l0.19,-0.37l-0.62,-2.02l-0.55,-1.0l0.14,-0.59l0.35,-0.14l0.24,-0.16l0.53,0.29l0.14,0.04l1.93,0.02l0.26,-0.14l0.36,-0.58l0.39,0.01l0.43,-0.17l0.28,0.79l0.43,0.16l0.56,-0.31l0.89,-0.32l0.92,0.45l0.39,0.75l0.14,0.13l1.13,0.53l0.3,-0.03l0.81,-0.59l1.02,-0.08l1.49,0.57l0.62,3.33l-1.03,2.09l-0.65,2.84l0.02,0.2l1.05,2.08l-0.07,0.64Z" data-code="CI" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M444.71,156.27l0.05,0.3l-0.34,0.69l0.13,0.4l1.13,0.58l1.07,0.1l-0.12,0.81l-0.87,0.42l-1.75,-0.37l-0.34,0.18l-0.47,1.1l-0.86,0.07l-0.33,-0.38l-0.41,-0.04l-1.34,1.01l-1.02,0.13l-0.93,-0.58l-0.82,-1.32l-0.37,-0.12l-0.77,0.32l0.02,-0.84l1.74,-1.69l0.09,-0.25l-0.04,-0.38l0.73,0.19l0.26,-0.06l0.6,-0.48l2.02,0.02l0.24,-0.12l0.38,-0.51l2.31,0.84Z" data-code="CH" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M232.24,284.95l-0.94,-0.52l-1.22,-0.82l-0.31,-0.01l-0.62,0.35l-1.88,-0.31l-0.54,-0.95l-0.29,-0.15l-0.37,0.03l-2.34,-1.33l-0.15,-0.35l0.57,-0.11l0.24,-0.32l-0.1,-1.15l0.46,-0.71l1.11,-0.15l0.21,-0.13l1.05,-1.57l0.95,-1.31l-0.08,-0.43l-0.73,-0.47l0.4,-1.24l0.01,-0.16l-0.53,-2.15l0.44,-0.54l0.06,-0.24l-0.4,-2.13l-0.06,-0.13l-0.93,-1.22l0.21,-0.8l0.52,0.12l0.32,-0.13l0.47,-0.75l0.03,-0.27l-0.52,-1.32l0.09,-0.11l1.14,0.07l0.22,-0.08l1.82,-1.71l0.96,-0.25l0.22,-0.28l0.02,-0.81l0.43,-2.01l1.28,-1.04l1.48,-0.05l0.27,-0.19l0.12,-0.31l1.73,0.19l0.2,-0.05l1.96,-1.28l0.97,-0.56l1.16,-1.16l0.64,0.11l0.43,0.44l-0.31,0.55l-1.49,0.39l-0.19,0.16l-0.6,1.2l-0.97,0.74l-0.73,0.94l-0.06,0.13l-0.3,1.76l-0.68,1.44l0.23,0.43l1.1,0.14l0.27,0.97l0.08,0.13l0.49,0.49l0.17,0.85l-0.27,0.86l-0.01,0.14l0.09,0.53l0.2,0.23l0.52,0.18l0.54,0.79l0.27,0.13l3.18,-0.24l1.31,0.29l1.7,2.08l0.31,0.1l0.96,-0.26l1.75,0.13l1.41,-0.27l0.56,0.27l-0.36,1.07l-0.54,0.81l-0.05,0.13l-0.2,1.8l0.51,1.79l0.07,0.12l0.65,0.68l0.05,0.32l-1.16,1.14l0.05,0.47l0.86,0.52l0.6,0.79l0.31,1.01l-0.7,-0.81l-0.44,-0.01l-0.74,0.77l-4.75,-0.05l-0.3,0.31l0.03,1.57l0.25,0.29l1.2,0.21l-0.02,0.24l-0.1,-0.05l-0.22,-0.02l-1.41,0.41l-0.22,0.29l-0.01,1.82l0.11,0.23l1.04,0.85l0.35,1.3l-0.06,1.02l-1.02,6.26l-0.84,-0.89l-0.19,-0.09l-0.25,-0.02l1.35,-2.13l-0.1,-0.42l-1.92,-1.17l-0.2,-0.04l-1.41,0.2l-0.82,-0.39l-0.26,0.0l-1.29,0.62l-1.63,-0.27l-1.4,-2.5l-0.12,-0.12l-1.1,-0.61l-0.83,-1.2l-1.67,-1.19l-0.27,-0.04l-0.54,0.19Z" data-code="CO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M740.32,148.94l0.22,0.21l4.3,1.03l2.84,2.2l0.99,2.92l0.28,0.2l3.8,0.0l0.15,-0.04l2.13,-1.24l3.5,-0.8l-1.05,2.29l-0.95,1.13l-0.06,0.12l-0.85,3.41l-1.56,2.81l-2.83,-0.51l-0.19,0.03l-2.15,1.09l-0.15,0.34l0.65,2.59l-0.33,3.3l-1.03,0.07l-0.28,0.3l0.01,0.75l-1.09,-1.2l-0.48,0.05l-0.94,1.6l-3.76,1.26l-0.2,0.36l0.29,1.19l-1.67,-0.08l-1.11,-0.88l-0.42,0.05l-1.69,2.08l-2.71,1.57l-2.04,1.88l-3.42,0.84l-0.11,0.05l-1.8,1.34l-1.54,0.46l0.52,-0.53l0.06,-0.33l-0.44,-0.96l1.84,-1.84l0.02,-0.41l-1.32,-1.56l-0.36,-0.08l-2.23,1.08l-2.83,2.06l-1.52,1.85l-2.32,0.13l-0.2,0.09l-1.28,1.37l-0.03,0.37l1.32,1.97l0.18,0.13l1.83,0.43l0.07,1.08l0.18,0.26l1.98,0.84l0.3,-0.03l2.66,-1.96l2.06,1.04l0.12,0.03l1.4,0.07l0.27,1.0l-3.24,0.73l-0.17,0.11l-1.13,1.5l-2.38,1.4l-0.1,0.1l-1.29,1.99l0.1,0.42l2.6,1.5l0.97,2.72l1.52,2.56l1.66,2.08l-0.03,1.76l-1.4,0.67l-0.15,0.38l0.6,1.47l0.13,0.15l1.29,0.75l-0.35,2.0l-0.58,1.96l-1.22,0.21l-0.2,0.14l-1.83,2.93l-2.02,3.51l-2.29,3.13l-3.4,2.42l-3.42,2.18l-2.75,0.3l-0.15,0.06l-1.32,1.01l-0.68,-0.67l-0.41,-0.01l-1.37,1.27l-3.42,1.28l-2.62,0.4l-0.24,0.21l-0.8,2.57l-0.95,0.11l-0.53,-1.54l0.52,-0.89l-0.19,-0.44l-3.36,-0.84l-0.17,0.01l-1.09,0.4l-2.36,-0.64l-1.0,-0.9l0.35,-1.34l-0.23,-0.37l-2.22,-0.47l-1.15,-0.94l-0.36,-0.02l-2.08,1.37l-2.35,0.29l-1.98,-0.01l-0.13,0.03l-1.32,0.63l-1.28,0.38l-0.21,0.33l0.33,2.65l-0.78,-0.04l-0.14,-0.39l-0.07,-1.04l-0.41,-0.26l-1.72,0.71l-0.96,-0.43l-1.63,-0.86l0.65,-1.95l-0.19,-0.38l-1.43,-0.46l-0.56,-2.27l-0.34,-0.22l-2.26,0.38l0.25,-2.65l2.29,-2.15l0.09,-0.2l0.1,-2.21l-0.07,-2.09l-0.15,-0.25l-1.02,-0.6l-0.8,-1.52l-0.31,-0.16l-1.42,0.2l-2.16,-0.32l0.55,-0.74l0.01,-0.35l-1.17,-1.7l-0.41,-0.08l-1.67,1.07l-1.97,-0.63l-0.25,0.03l-2.89,1.73l-2.26,1.99l-1.82,0.3l-1.0,-0.66l-0.15,-0.05l-1.28,-0.06l-1.75,-0.61l-0.24,0.02l-1.35,0.69l-0.1,0.08l-1.2,1.45l-0.14,-1.41l-0.4,-0.25l-1.46,0.55l-2.83,-0.26l-2.77,-0.61l-1.99,-1.17l-1.91,-0.54l-0.78,-1.21l-0.17,-0.13l-1.36,-0.38l-2.54,-1.79l-2.01,-0.84l-0.28,0.02l-0.89,0.56l-3.31,-1.83l-2.35,-1.67l-0.57,-2.49l1.34,0.28l0.36,-0.28l0.08,-1.42l-0.05,-0.19l-0.93,-1.34l0.24,-2.18l-0.07,-0.22l-2.69,-3.32l-0.15,-0.1l-3.97,-1.11l-0.69,-2.05l-0.11,-0.15l-1.79,-1.3l-0.39,-0.73l-0.36,-1.57l0.08,-1.09l-0.18,-0.3l-1.52,-0.66l-0.22,-0.01l-0.51,0.18l-0.52,-2.21l0.59,-0.55l0.06,-0.35l-0.22,-0.44l2.12,-1.24l1.63,-0.55l2.58,0.39l0.31,-0.16l0.87,-1.75l3.05,-0.34l0.21,-0.12l0.84,-1.12l3.87,-1.59l0.15,-0.14l0.35,-0.68l0.03,-0.17l-0.17,-1.51l1.52,-0.7l0.15,-0.39l-2.12,-5.0l4.62,-1.15l1.35,-0.72l0.14,-0.17l1.72,-5.37l4.7,0.99l0.28,-0.08l1.39,-1.43l0.08,-0.2l0.11,-2.95l1.83,-0.26l0.18,-0.1l1.85,-2.08l0.61,-0.17l0.57,1.97l0.1,0.15l2.2,1.75l3.48,1.17l1.59,2.36l-0.93,3.53l0.04,0.24l0.9,1.35l0.2,0.13l2.98,0.53l3.32,0.43l2.97,1.89l1.49,0.35l1.08,2.67l1.52,1.88l0.24,0.11l2.74,-0.07l5.15,0.67l3.36,-0.41l2.39,0.43l3.67,1.81l0.13,0.03l2.92,-0.0l1.02,0.86l0.34,0.03l2.88,-1.59l3.98,-1.03l3.81,-0.13l3.02,-1.12l1.77,-1.61l1.73,-1.01l0.13,-0.37l-0.41,-1.01l-0.72,-1.07l1.09,-1.66l1.21,0.24l2.57,0.63l0.24,-0.04l2.46,-1.62l3.78,-1.19l0.13,-0.09l1.8,-2.03l1.66,-0.84l3.54,-0.41l1.93,0.35l0.34,-0.22l0.27,-1.12l-0.08,-0.29l-2.27,-2.22l-2.08,-1.07l-0.29,0.01l-1.82,1.12l-2.36,-0.47l-0.14,0.01l-1.18,0.34l-0.46,-0.94l1.69,-3.08l1.1,-2.21l2.75,1.12l0.26,-0.02l3.53,-2.06l0.15,-0.26l-0.02,-1.35l2.18,-3.39l1.35,-1.04l0.12,-0.24l-0.03,-1.85l-0.15,-0.25l-1.0,-0.58l1.68,-1.37l3.01,-0.59l3.25,-0.09l3.67,0.99l2.08,1.18l1.51,3.3l0.95,1.45l0.85,1.99l0.92,3.19ZM697.0,237.37l-1.95,1.12l-1.74,-0.68l-0.06,-1.9l1.08,-1.03l2.62,-0.7l1.23,0.05l0.37,0.65l-1.01,1.08l-0.54,1.4Z" data-code="CN" fill="#81a5b3" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M453.76,278.92l-0.26,-0.11l-0.18,-0.02l-1.42,0.31l-1.56,-0.33l-1.17,0.16l-3.7,-0.05l0.3,-1.63l-0.04,-0.21l-0.98,-1.66l-0.15,-0.13l-1.03,-0.38l-0.46,-1.01l-0.13,-0.14l-0.48,-0.27l0.02,-0.46l0.62,-1.72l1.1,-2.25l0.54,-0.02l0.2,-0.09l1.41,-1.39l0.73,-0.03l1.32,0.97l0.31,0.03l1.72,-0.85l0.16,-0.2l0.22,-1.0l0.57,-1.03l0.36,-1.18l1.26,-0.98l0.1,-0.15l0.49,-1.7l0.48,-0.51l0.07,-0.13l0.35,-1.3l0.63,-1.54l2.06,-1.92l0.09,-0.17l0.12,-0.79l0.24,-0.41l-0.04,-0.36l-0.89,-0.91l0.04,-0.45l0.28,-0.06l0.85,1.39l0.16,1.59l-0.09,1.66l0.04,0.17l1.09,1.84l-0.86,-0.02l-0.72,0.17l-1.07,-0.24l-0.34,0.17l-0.54,1.19l0.06,0.34l1.48,1.47l1.06,0.44l0.32,0.94l0.73,1.6l-0.32,0.57l-1.23,2.49l-0.54,0.41l-0.12,0.21l-0.19,1.95l0.24,1.08l-0.18,0.67l0.07,0.28l1.13,1.25l0.24,0.93l0.92,1.29l1.1,0.8l0.1,1.01l0.26,0.73l-0.12,0.93l-1.65,-0.49l-2.02,-0.66l-3.19,-0.11Z" data-code="CM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M246.8,429.1l-1.14,0.78l-2.25,1.21l-0.16,0.23l-0.37,2.94l-0.75,0.06l-2.72,-1.07l-2.83,-2.34l-3.06,-1.9l-0.71,-1.92l0.67,-1.84l-0.02,-0.25l-1.22,-2.13l-0.31,-5.41l1.02,-2.95l2.59,-2.4l-0.13,-0.51l-3.32,-0.8l2.06,-2.4l0.07,-0.15l0.79,-4.77l2.44,0.95l0.4,-0.22l1.31,-6.31l-0.16,-0.33l-1.68,-0.8l-0.42,0.21l-0.72,3.47l-1.01,-0.27l0.74,-4.06l0.85,-5.46l1.12,-1.96l0.03,-0.22l-0.71,-2.82l-0.19,-2.94l0.76,-0.07l0.26,-0.2l1.53,-4.62l1.73,-4.52l1.07,-4.2l-0.56,-4.2l0.73,-2.2l0.01,-0.12l-0.29,-3.3l1.46,-3.34l0.45,-5.19l0.8,-5.52l0.78,-5.89l-0.18,-4.33l-0.49,-3.47l1.1,-0.56l0.13,-0.13l0.44,-0.88l0.9,1.29l0.32,1.8l0.1,0.18l1.16,0.97l-0.73,2.33l0.01,0.21l1.33,2.91l0.97,3.6l0.35,0.22l1.57,-0.31l0.16,0.34l-0.79,2.51l-2.61,1.25l-0.17,0.28l0.08,4.36l-0.48,0.79l0.01,0.33l0.6,0.84l-1.62,1.55l-1.67,2.6l-0.89,2.47l-0.02,0.13l0.23,2.56l-1.5,2.76l-0.03,0.21l1.15,4.8l0.11,0.17l0.54,0.42l-0.01,2.37l-1.4,2.7l-0.03,0.15l0.06,2.25l-1.8,1.78l-0.09,0.21l0.02,2.73l0.71,2.63l-1.33,0.94l-0.12,0.17l-0.67,2.64l-0.59,3.03l0.4,3.55l-0.84,0.51l-0.14,0.31l0.58,3.5l0.08,0.16l0.96,0.99l-0.7,1.08l0.11,0.43l1.04,0.55l0.19,0.8l-0.89,0.48l-0.16,0.31l0.26,1.77l-0.89,4.06l-1.31,2.67l-0.03,0.19l0.28,1.53l-0.73,1.88l-1.85,1.37l-0.12,0.26l0.22,3.46l0.06,0.16l0.88,1.19l0.28,0.12l1.32,-0.17l-0.04,2.13l0.04,0.15l1.04,1.95l0.24,0.16l5.94,0.44ZM248.79,430.71l0.0,7.41l0.3,0.3l2.67,0.0l1.01,0.06l-0.54,0.91l-1.99,1.01l-1.13,-0.1l-1.42,-0.27l-1.87,-1.06l-2.57,-0.49l-3.09,-1.9l-2.52,-1.83l-2.65,-2.93l0.93,0.32l3.54,2.29l3.32,1.23l0.34,-0.09l1.29,-1.57l0.83,-2.32l2.11,-1.28l1.43,0.32Z" data-code="CL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M280.14,145.66l-1.66,2.88l0.06,0.37l0.37,0.03l1.5,-1.01l1.17,0.49l-0.64,0.83l0.13,0.46l2.22,0.89l0.28,-0.03l1.02,-0.7l2.09,0.83l-0.69,2.1l0.37,0.38l1.43,-0.45l0.27,1.43l0.74,1.88l-0.95,2.5l-0.88,0.09l-1.34,-0.48l0.49,-2.34l-0.14,-0.32l-0.7,-0.4l-0.36,0.04l-2.81,2.66l-0.63,-0.05l1.2,-1.01l-0.1,-0.52l-2.4,-0.77l-2.79,0.18l-4.65,-0.09l-0.22,-0.54l1.37,-0.99l0.01,-0.48l-0.82,-0.65l1.91,-1.79l2.57,-5.17l1.49,-1.81l2.04,-1.07l0.63,0.08l-0.27,0.51l-1.33,2.07ZM193.92,74.85l-0.01,4.24l0.19,0.28l0.33,-0.07l3.14,-3.22l2.65,2.5l-0.71,3.04l0.06,0.26l2.42,2.88l0.46,0.0l2.66,-3.14l1.83,-3.74l0.03,-0.12l0.13,-4.53l3.23,0.31l3.63,0.64l3.18,2.08l0.13,1.91l-1.79,2.22l-0.0,0.37l1.69,2.2l-0.28,1.8l-4.74,2.84l-3.33,0.62l-2.5,-1.21l-0.41,0.17l-0.73,2.05l-2.39,3.44l-0.74,1.78l-2.78,2.61l-3.48,0.26l-0.17,0.07l-1.98,1.68l-0.1,0.21l-0.15,2.33l-2.68,0.45l-0.17,0.09l-3.1,3.2l-2.75,4.38l-0.99,3.06l-0.14,4.31l0.25,0.31l3.5,0.58l1.07,3.24l1.18,2.76l0.34,0.18l3.43,-0.69l4.55,1.52l2.45,1.32l1.76,1.65l0.12,0.07l3.11,0.96l2.63,1.46l0.13,0.04l4.12,0.2l2.41,0.3l-0.36,2.81l0.8,3.51l1.81,3.78l0.08,0.1l3.73,3.17l0.34,0.03l1.93,-1.08l0.13,-0.15l1.35,-3.44l0.01,-0.18l-1.31,-5.38l-0.08,-0.14l-1.46,-1.5l3.68,-1.51l2.84,-2.46l1.45,-2.55l0.04,-0.17l-0.2,-2.39l-0.04,-0.12l-1.7,-3.07l-2.9,-2.64l2.79,-3.66l0.05,-0.27l-1.08,-3.38l-0.8,-5.75l1.45,-0.75l4.18,1.03l2.6,0.38l0.18,-0.03l1.93,-0.95l2.18,1.23l3.01,2.18l0.73,1.42l0.25,0.16l4.18,0.27l-0.06,2.95l0.83,4.7l0.22,0.24l2.19,0.55l1.75,2.08l0.38,0.07l3.63,-2.03l0.11,-0.11l2.38,-4.06l1.36,-1.43l1.76,3.01l3.26,4.68l2.68,4.19l-0.94,2.09l0.12,0.38l3.31,1.98l2.23,1.98l0.13,0.07l3.94,0.89l1.48,1.02l0.96,2.82l0.22,0.2l1.85,0.43l0.88,1.13l0.17,3.53l-1.68,1.16l-1.76,1.14l-4.08,1.17l-0.11,0.06l-3.08,2.65l-4.11,0.52l-5.35,-0.69l-3.76,-0.02l-2.62,0.23l-0.2,0.1l-2.05,2.29l-3.13,1.41l-0.11,0.08l-3.6,4.24l-2.87,2.92l-0.05,0.36l0.33,0.14l2.13,-0.52l0.15,-0.08l3.98,-4.15l5.16,-2.63l3.58,-0.31l1.82,1.3l-2.09,1.91l-0.09,0.29l0.8,3.46l0.82,2.37l0.15,0.17l3.25,1.56l0.16,0.03l4.14,-0.45l0.21,-0.12l2.03,-2.86l0.11,1.46l0.13,0.22l1.26,0.88l-2.7,1.78l-5.51,1.83l-2.52,1.26l-2.75,2.16l-1.52,-0.18l-0.08,-2.16l4.19,-2.47l0.14,-0.34l-0.3,-0.22l-4.01,0.1l-2.66,0.36l-1.45,-1.56l0.0,-4.16l-0.11,-0.23l-1.11,-0.91l-0.28,-0.05l-1.5,0.48l-0.7,-0.7l-0.45,0.02l-1.91,2.39l-0.8,2.5l-0.82,1.31l-0.95,0.43l-0.77,0.15l-0.23,0.2l-0.18,0.56l-8.2,0.02l-0.13,0.03l-1.19,0.61l-2.95,2.45l-0.78,1.13l-4.6,0.01l-0.12,0.02l-1.13,0.48l-0.13,0.44l0.37,0.55l0.2,0.82l-0.01,0.09l-3.1,1.42l-2.63,0.5l-2.84,1.57l-0.47,0.0l-0.72,-0.4l-0.18,-0.27l0.03,-0.15l0.52,-1.0l1.2,-1.71l0.73,-1.8l0.02,-0.17l-1.03,-5.47l-0.15,-0.21l-2.35,-1.32l0.16,-0.29l-0.05,-0.35l-0.37,-0.38l-0.22,-0.09l-0.56,0.0l-0.35,-0.34l-0.11,-0.65l-0.46,-0.2l-0.39,0.26l-0.2,-0.03l-0.11,-0."""),
format.raw("""33l-0.48,-0.25l-0.21,-0.71l-0.15,-0.18l-3.97,-2.07l-4.8,-2.39l-0.25,-0.01l-2.19,0.89l-0.72,0.03l-3.04,-0.82l-0.14,-0.0l-1.94,0.4l-2.4,-0.98l-2.56,-0.51l-1.7,-0.19l-0.62,-0.44l-0.42,-1.67l-0.3,-0.23l-0.85,0.02l-0.29,0.3l-0.01,0.95l-69.26,-0.01l-4.77,-3.14l-1.78,-1.41l-4.51,-1.38l-1.3,-2.73l0.34,-1.96l-0.17,-0.33l-3.06,-1.37l-0.41,-2.58l-0.11,-0.18l-2.92,-2.4l-0.05,-1.53l1.32,-1.59l0.07,-0.2l-0.07,-2.21l-0.16,-0.26l-4.19,-2.22l-2.52,-4.02l-1.56,-2.6l-0.08,-0.09l-2.28,-1.64l-1.65,-1.48l-1.31,-1.89l-0.38,-0.1l-2.51,1.21l-2.28,1.92l-2.03,-2.22l-1.85,-1.71l-2.44,-1.04l-2.28,-0.12l0.03,-37.72l4.27,0.98l4.0,2.13l2.61,0.4l0.24,-0.07l2.17,-1.81l2.92,-1.33l3.63,0.53l0.18,-0.03l3.72,-1.94l3.89,-1.06l1.6,1.72l0.37,0.06l1.87,-1.04l0.14,-0.19l0.48,-1.83l1.37,0.38l4.18,3.96l0.41,0.0l2.89,-2.62l0.28,2.79l0.37,0.26l3.08,-0.73l0.17,-0.12l0.85,-1.16l2.81,0.24l3.83,1.86l5.86,1.61l3.46,0.75l2.44,-0.26l2.89,1.89l-3.12,1.89l-0.14,0.31l0.24,0.24l4.53,0.92l6.84,-0.5l2.04,-0.71l2.54,2.44l0.39,0.02l2.72,-2.16l-0.01,-0.48l-2.26,-1.61l1.27,-1.16l2.94,-0.19l1.94,-0.42l1.89,0.97l2.49,2.32l0.24,0.08l2.71,-0.33l4.35,1.9l0.17,0.02l3.86,-0.67l3.62,0.1l0.31,-0.33l-0.26,-2.44l1.9,-0.65l3.58,1.36l-0.01,3.84l0.23,0.29l0.34,-0.17l1.51,-3.23l1.81,0.1l0.31,-0.22l1.13,-4.37l-0.08,-0.29l-2.68,-2.73l-2.83,-1.76l0.19,-4.73l2.77,-3.15l3.06,0.69l2.44,1.97l3.24,4.88l-2.05,2.02l0.15,0.51l4.41,0.85ZM265.85,150.7l-0.84,0.04l-3.15,-0.99l-1.77,-1.17l0.19,-0.06l3.17,0.79l2.39,1.27l0.01,0.12ZM249.41,3.71l6.68,0.49l5.34,0.79l4.34,1.6l-0.08,1.24l-5.91,2.56l-6.03,1.21l-2.36,1.38l-0.14,0.34l0.29,0.22l4.37,-0.02l-4.96,3.01l-4.06,1.64l-0.11,0.08l-4.21,4.62l-5.07,0.92l-0.12,0.05l-1.53,1.1l-7.5,0.59l-0.28,0.28l0.24,0.31l2.67,0.54l-1.04,0.6l-0.09,0.44l1.89,2.49l-2.11,1.66l-3.83,1.52l-0.15,0.13l-1.14,2.01l-3.41,1.55l-0.16,0.36l0.35,1.19l0.3,0.22l3.98,-0.19l0.03,0.78l-6.42,2.99l-6.44,-1.41l-7.41,0.79l-3.72,-0.62l-4.48,-0.26l-0.25,-2.0l4.37,-1.13l0.21,-0.38l-1.14,-3.55l1.13,-0.28l6.61,2.29l0.35,-0.12l-0.04,-0.37l-3.41,-3.45l-0.14,-0.08l-3.57,-0.92l1.62,-1.7l4.36,-1.3l0.2,-0.18l0.71,-1.94l-0.12,-0.36l-3.45,-2.15l-0.88,-2.43l6.36,0.23l1.94,0.61l0.23,-0.02l3.91,-2.1l0.15,-0.32l-0.26,-0.24l-5.69,-0.67l-8.69,0.37l-4.3,-1.92l-2.12,-2.39l-2.82,-1.68l-0.44,-1.65l3.41,-1.06l2.93,-0.2l4.91,-0.99l3.69,-2.28l2.93,0.31l2.64,1.68l0.42,-0.1l1.84,-3.23l3.17,-0.96l4.45,-0.69l7.56,-0.26l1.26,0.64l0.18,0.03l7.2,-1.06l10.81,0.8ZM203.94,57.59l0.01,0.32l1.97,2.97l0.51,-0.01l2.26,-3.75l6.05,-1.89l4.08,4.72l-0.36,2.95l0.38,0.33l4.95,-1.36l0.11,-0.05l2.23,-1.77l5.37,2.31l3.32,2.14l0.3,1.89l0.36,0.25l4.48,-1.01l2.49,2.8l0.14,0.09l5.99,1.78l2.09,1.74l2.18,3.83l-4.29,1.91l-0.01,0.54l5.9,2.83l3.95,0.94l3.54,3.84l0.2,0.1l3.58,0.25l-0.67,2.51l-4.18,4.54l-2.84,-1.61l-3.91,-3.95l-0.26,-0.09l-3.24,0.52l-0.25,0.26l-0.32,2.37l0.1,0.26l2.63,2.38l3.42,1.89l0.96,1.0l1.57,3.8l-0.74,2.43l-2.85,-0.96l-6.26,-3.15l-0.38,0.09l0.04,0.39l3.54,3.4l2.55,2.31l0.23,0.78l-6.26,-1.43l-5.33,-2.25l-2.73,-1.73l0.67,-0.86l-0.09,-0.45l-7.38,-4.01l-0.44,0.27l0.03,0.89l-6.85,0.61l-1.8,-1.17l1.43,-2.6l4.56,-0.07l5.15,-0.52l0.23,-0.45l-0.76,-1.34l0.8,-1.89l3.21,-4.06l0.05,-0.29l-0.72,-1.95l-0.97,-1.47l-0.11,-0.1l-3.84,-2.1l-4.53,-1.33l1.09,-0.75l0.05,-0.45l-2.65,-2.75l-0.18,-0.09l-2.12,-0.24l-1.91,-1.47l-0.39,0.02l-1.27,1.25l-4.4,0.56l-9.06,-0.99l-5.28,-1.31l-4.01,-0.67l-1.72,-1.31l2.32,-1.85l0.1,-0.33l-0.28,-0.2l-3.3,-0.02l-0.74,-4.36l1.86,-4.09l2.46,-1.88l5.74,-1.15l-1.5,2.55ZM261.28,159.28l0.19,0.14l1.82,0.42l1.66,-0.05l-0.66,0.68l-0.75,0.16l-3.0,-1.25l-0.46,-0.77l0.51,-0.52l0.68,1.19ZM230.87,84.48l-2.48,0.19l-0.52,-1.74l0.96,-2.17l2.03,-0.53l1.71,1.04l0.02,1.6l-0.22,0.46l-1.5,1.16ZM229.52,58.19l0.14,0.82l-4.99,-0.22l-2.73,0.63l-0.59,-0.23l-2.61,-2.4l0.08,-1.38l0.94,-0.25l5.61,0.51l4.14,2.54ZM222.12,105.0l-0.79,1.63l-0.75,-0.22l-0.52,-0.91l0.04,-0.09l0.84,-1.01l0.74,0.06l0.44,0.55ZM183.77,38.22l2.72,1.65l0.16,0.04l4.83,-0.01l1.92,1.52l-0.51,1.75l0.18,0.36l2.84,1.14l1.56,1.19l0.16,0.06l3.37,0.22l3.65,0.42l4.07,-1.1l5.05,-0.43l3.96,0.35l2.53,1.8l0.48,1.79l-1.37,1.16l-3.6,1.03l-3.22,-0.59l-7.17,0.76l-5.1,0.09l-4.0,-0.6l-6.48,-1.56l-0.81,-2.57l-0.3,-2.49l-0.1,-0.19l-2.51,-2.25l-0.16,-0.07l-5.12,-0.63l-2.61,-1.45l0.75,-1.71l4.88,0.32ZM207.46,91.26l0.42,1.62l0.42,0.19l1.12,-0.55l1.35,0.99l2.74,1.39l2.73,1.2l0.2,1.74l0.35,0.26l1.72,-0.29l1.31,0.97l-1.72,0.96l-3.68,-0.9l-1.34,-1.71l-0.43,-0.04l-2.46,2.1l-3.23,1.85l-0.74,-1.98l-0.31,-0.19l-2.47,0.28l1.49,-1.34l0.1,-0.19l0.32,-3.15l0.79,-3.45l1.34,0.25ZM215.59,102.66l-2.73,2.0l-1.49,-0.08l-0.37,-0.7l1.61,-1.56l3.0,0.03l-0.02,0.3ZM202.79,24.07l0.11,0.12l2.54,1.53l-3.01,1.47l-4.55,4.07l-4.3,0.38l-5.07,-0.68l-2.51,-2.09l0.03,-1.72l1.86,-1.4l0.1,-0.34l-0.29,-0.2l-4.49,0.04l-2.63,-1.79l-1.45,-2.36l1.61,-2.38l1.65,-1.69l2.47,-0.4l0.19,-0.48l-0.72,-0.89l5.1,-0.26l3.1,3.05l0.13,0.07l4.21,1.25l3.99,1.06l1.92,3.65ZM187.5,59.3l-0.15,0.1l-2.59,3.4l-2.5,-0.15l-1.47,-3.92l0.04,-2.24l1.22,-1.92l2.34,-1.26l5.11,0.17l4.28,1.06l-3.36,3.86l-2.9,0.9ZM186.19,48.8l-1.15,1.63l-3.42,-0.35l-2.68,-1.15l1.11,-1.88l3.34,-1.27l2.01,1.63l0.79,1.38ZM185.78,35.41l-0.95,0.13l-4.48,-0.33l-0.4,-0.91l4.5,0.07l1.45,0.82l-0.1,0.21ZM180.76,32.56l-3.43,1.03l-1.85,-1.14l-1.01,-1.92l-0.16,-1.87l2.87,0.2l1.39,0.35l2.75,1.75l-0.55,1.6ZM181.03,76.32l-1.21,1.2l-3.19,-1.26l-0.18,-0.01l-1.92,0.45l-2.88,-1.67l1.84,-1.16l1.6,-1.77l2.45,1.17l1.45,0.77l2.05,2.28ZM169.72,54.76l2.83,0.97l0.14,0.01l4.25,-0.58l0.47,1.01l-2.19,2.16l0.07,0.48l3.61,1.95l-0.41,3.84l-3.87,1.68l-2.23,-0.36l-1.73,-1.75l-6.07,-3.53l0.03,-1.01l4.79,0.55l0.3,-0.16l-0.04,-0.34l-2.55,-2.89l2.59,-2.05ZM174.44,40.56l1.49,1.87l0.07,2.48l-1.07,3.52l-3.87,0.48l-2.41,-0.72l0.05,-2.72l-0.33,-0.3l-3.79,0.36l-0.13,-3.31l2.36,0.14l0.15,-0.03l3.7,-1.74l3.44,0.29l0.31,-0.22l0.03,-0.12ZM170.14,31.5l0.75,1.74l-3.52,-0.52l-4.19,-1.77l-4.65,-0.17l1.65,-1.11l-0.05,-0.52l-2.86,-1.26l-0.13,-1.58l4.52,0.7l6.66,1.99l1.84,2.5ZM134.64,58.08l-1.08,1.93l0.34,0.44l5.44,-1.41l3.37,2.32l0.37,-0.02l2.66,-2.28l2.03,1.38l2.01,4.53l0.53,0.04l1.26,-1.93l0.03,-0.27l-1.67,-4.55l1.82,-0.58l2.36,0.73l2.69,1.84l1.53,4.46l0.77,3.24l0.15,0.19l4.22,2.26l4.32,2.04l-0.21,1.51l-3.87,0.34l-0.19,0.5l1.45,1.54l-0.65,1.23l-4.3,-0.65l-4.4,-1.19l-2.97,0.28l-4.67,1.48l-6.31,0.65l-4.27,0.39l-1.26,-1.91l-0.15,-0.12l-3.42,-1.2l-0.16,-0.01l-2.05,0.45l-2.66,-3.02l1.2,-0.34l3.82,-0.76l3.58,0.19l3.27,-0.78l0.23,-0.29l-0.24,-0.29l-4.84,-1.06l-5.42,0.35l-3.4,-0.09l-0.97,-1.22l5.39,-1.7l0.21,-0.33l-0.3,-0.25l-3.82,0.06l-3.95,-1.1l1.88,-3.13l1.68,-1.81l6.54,-2.84l2.11,0.77ZM158.85,56.58l-1.82,2.62l-3.38,-2.9l0.49,-0.39l3.17,-0.18l1.54,0.86ZM149.71,42.7l1.0,1.87l0.37,0.14l2.17,-0.83l2.33,0.2l0.38,2.16l-1.38,2.17l-8.33,0.76l-6.34,2.15l-3.51,0.1l-0.22,-1.13l4.98,-2.12l0.17,-0.34l-0.31,-0.23l-11.27,0.6l-3.04,-0.78l3.14,-4.57l2.2,-1.35l6.87,1.7l4.4,3.0l0.14,0.05l4.37,0.39l0.27,-0.48l-3.41,-4.68l1.96,-1.62l2.28,0.53l0.79,2.32ZM145.44,29.83l-2.18,0.77l-3.79,-0.0l0.02,-0.31l2.34,-1.5l1.2,0.23l2.42,0.83ZM144.83,34.5l-4.44,1.46l-3.18,-1.48l1.6,-1.36l3.51,-0.53l3.1,0.75l-0.6,1.16ZM119.02,65.87l-6.17,2.07l-1.19,-1.82l-0.13,-0.11l-5.48,-2.32l0.92,-1.7l1.73,-3.44l2.16,-3.15l-0.02,-0.36l-2.09,-2.56l7.84,-0.71l3.59,1.02l6.32,0.27l2.35,1.37l2.25,1.71l-2.68,1.04l-6.21,3.41l-3.1,3.28l-0.08,0.21l0.0,1.81ZM129.66,35.4l-0.3,3.55l-1.77,1.67l-2.34,0.27l-4.62,2.2l-3.89,0.76l-2.83,-0.93l3.85,-3.52l5.04,-3.36l3.75,0.07l3.11,-0.7ZM111.24,152.74l-0.82,0.29l-3.92,-1.39l-0.7,-1.06l-0.12,-0.1l-2.15,-1.09l-0.41,-0.84l-0.2,-0.16l-2.44,-0.56l-0.84,-1.56l0.1,-0.36l2.34,0.64l1.53,0.5l2.28,0.34l0.78,1.04l1.24,1.55l0.09,0.08l2.42,1.3l0.81,1.39ZM88.54,134.82l0.14,0.02l2.0,-0.23l-0.67,3.48l0.06,0.24l1.78,2.22l-0.24,-0.0l-1.4,-1.42l-0.91,-1.53l-1.26,-1.08l-0.42,-1.35l0.09,-0.66l0.82,0.31Z" data-code="CA" fill="#82a5b4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M453.66,296.61l-0.9,-0.82l-0.35,-0.04l-0.83,0.48l-0.77,0.83l-1.65,-2.13l1.66,-1.2l0.08,-0.39l-0.81,-1.43l0.59,-0.43l1.62,-0.29l0.24,-0.24l0.1,-0.58l0.94,0.84l0.19,0.08l2.21,0.11l0.27,-0.14l0.81,-1.29l0.32,-1.76l-0.27,-1.96l-0.06,-0.15l-1.08,-1.35l1.02,-2.74l-0.09,-0.34l-0.62,-0.5l-0.22,-0.06l-1.66,0.18l-0.55,-1.03l0.12,-0.73l2.85,0.09l1.98,0.65l2.0,0.59l0.38,-0.25l0.17,-1.3l1.26,-2.24l1.34,-1.19l1.54,0.38l1.35,0.12l-0.11,1.15l-0.74,1.34l-0.5,1.61l-0.31,2.22l0.12,1.41l-0.4,0.9l-0.06,0.88l-0.24,0.67l-1.57,1.15l-1.24,1.41l-1.09,2.43l-0.03,0.13l0.08,1.95l-0.55,0.69l-1.46,1.23l-1.32,1.41l-0.61,-0.29l-0.13,-0.57l-0.29,-0.23l-1.36,-0.02l-0.23,0.1l-0.72,0.81l-0.41,-0.16Z" data-code="CG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M459.41,266.56l1.9,-0.17l0.22,-0.12l0.36,-0.5l0.14,0.02l0.55,0.51l0.29,0.07l3.15,-0.96l0.12,-0.07l1.05,-0.97l1.29,-0.87l0.12,-0.33l-0.17,-0.61l0.38,-0.12l2.36,0.15l0.15,-0.03l2.36,-1.17l0.12,-0.1l1.78,-2.72l1.18,-0.96l1.23,-0.34l0.21,0.79l0.07,0.13l1.37,1.5l0.01,0.86l-0.39,1.0l-0.01,0.17l0.16,0.78l0.1,0.17l0.91,0.76l1.89,1.09l1.24,0.92l0.02,0.67l0.12,0.23l1.67,1.3l0.99,1.03l0.61,1.46l0.14,0.15l1.79,0.95l0.2,0.4l-0.44,0.14l-1.54,-0.06l-1.98,-0.26l-0.93,0.22l-0.19,0.14l-0.3,0.48l-0.57,0.05l-0.91,-0.49l-0.26,-0.01l-2.7,1.21l-1.04,-0.23l-0.21,0.03l-0.34,0.19l-0.12,0.13l-0.64,1.3l-1.67,-0.43l-1.77,-0.24l-1.58,-0.91l-2.06,-0.85l-0.27,0.02l-1.42,0.88l-0.97,1.27l-0.06,0.14l-0.19,1.46l-1.3,-0.11l-1.67,-0.42l-0.27,0.07l-1.55,1.41l-0.99,1.76l-0.14,-1.18l-0.13,-0.22l-1.1,-0.78l-0.86,-1.2l-0.2,-0.84l-0.07,-0.13l-1.07,-1.19l0.16,-0.59l0.0,-0.15l-0.24,-1.01l0.18,-1.77l0.5,-0.38l0.09,-0.11l1.18,-2.4Z" data-code="CF" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M497.85,276.25l-0.14,2.77l0.2,0.3l0.57,0.19l-0.47,0.52l-1.0,0.71l-0.96,1.31l-0.56,1.22l-0.16,2.04l-0.54,0.89l-0.04,0.15l-0.02,1.76l-0.63,0.61l-0.09,0.2l-0.08,1.33l-0.2,0.11l-0.15,0.21l-0.23,1.37l0.03,0.2l0.6,1.08l0.16,2.96l0.44,2.29l-0.24,1.25l0.01,0.15l0.5,1.46l0.07,0.12l1.41,1.37l1.09,2.56l-0.51,-0.11l-3.45,0.45l-0.67,0.3l-0.15,0.15l-0.71,1.61l0.01,0.26l0.52,1.03l-0.43,2.9l-0.31,2.55l0.13,0.29l0.7,0.46l1.75,0.99l0.31,-0.01l0.26,-0.17l0.15,1.9l-1.44,-0.02l-0.94,-1.28l-0.94,-1.1l-0.17,-0.1l-1.76,-0.33l-0.5,-1.18l-0.42,-0.15l-1.44,0.75l-1.79,-0.32l-0.77,-1.05l-0.2,-0.12l-1.59,-0.23l-0.97,0.04l-0.1,-0.53l-0.27,-0.25l-0.86,-0.06l-1.13,-0.15l-1.62,0.37l-1.04,-0.06l-0.32,0.09l0.11,-2.56l-0.08,-0.21l-0.77,-0.87l-0.17,-1.41l0.36,-1.47l-0.03,-0.21l-0.48,-0.91l-0.04,-1.52l-0.3,-0.29l-2.65,0.02l0.13,-0.53l-0.29,-0.37l-1.28,0.01l-0.28,0.21l-0.07,0.24l-1.35,0.09l-0.26,0.18l-0.62,1.45l-0.25,0.42l-1.17,-0.3l-0.19,0.01l-0.79,0.34l-1.44,0.18l-1.41,-1.96l-0.7,-1.47l-0.61,-1.86l-0.28,-0.21l-7.39,-0.03l-0.92,0.3l-0.78,-0.03l-0.78,0.25l-0.11,-0.25l0.35,-0.15l0.18,-0.26l0.07,-1.02l0.33,-0.52l0.72,-0.42l0.52,0.2l0.33,-0.08l0.76,-0.86l0.99,0.02l0.11,0.48l0.16,0.2l0.94,0.44l0.35,-0.07l1.46,-1.56l1.44,-1.21l0.68,-0.85l0.06,-0.2l-0.08,-1.99l1.04,-2.33l1.1,-1.23l1.62,-1.19l0.11,-0.14l0.29,-0.8l0.08,-0.94l0.38,-0.82l0.03,-0.16l-0.13,-1.38l0.3,-2.16l0.47,-1.51l0.73,-1.31l0.04,-0.12l0.15,-1.51l0.21,-1.66l0.89,-1.16l1.16,-0.7l1.9,0.79l1.69,0.95l1.81,0.24l1.85,0.48l0.35,-0.16l0.71,-1.43l0.16,-0.09l1.03,0.23l0.19,-0.02l2.65,-1.19l0.86,0.46l0.17,0.03l0.81,-0.08l0.23,-0.14l0.31,-0.5l0.75,-0.17l1.83,0.26l1.64,0.06l0.72,-0.21l1.39,1.9l0.16,0.11l1.12,0.3l0.24,-0.04l0.58,-0.36l1.05,0.15l0.15,-0.02l1.15,-0.44l0.47,0.84l0.08,0.09l2.08,1.57Z" data-code="CD" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M463.29,152.22l-0.88,-0.47l-0.18,-0.03l-1.08,0.15l-1.86,-0.94l-0.21,-0.02l-0.88,0.24l-0.13,0.07l-1.25,1.17l-1.63,-0.91l-1.38,-1.36l-1.22,-0.75l-0.24,-1.24l-0.33,-0.75l1.53,-0.6l0.98,-0.84l1.74,-0.62l0.11,-0.07l0.47,-0.47l0.46,0.27l0.24,0.03l0.96,-0.3l1.06,0.95l0.15,0.07l1.57,0.24l-0.1,0.6l0.16,0.32l1.36,0.68l0.41,-0.15l0.28,-0.62l1.29,0.28l0.19,0.84l0.26,0.23l1.73,0.18l0.74,1.02l-0.17,0.0l-0.25,0.13l-0.32,0.49l-0.46,0.11l-0.22,0.23l-0.13,0.57l-0.32,0.1l-0.2,0.22l-0.03,0.14l-0.65,0.25l-1.05,-0.05l-0.28,0.17l-0.22,0.43Z" data-code="CZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M505.03,193.75l-1.51,0.68l-1.0,-0.3l-0.32,-0.63l0.69,-0.06l0.41,0.13l0.19,-0.0l0.62,-0.22l0.31,0.02l0.06,0.22l0.49,0.17l0.06,-0.01Z" data-code="CY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M213.0,263.84l-0.98,-0.4l-0.3,-0.31l0.16,-0.24l0.05,-0.21l-0.09,-0.56l-0.1,-0.18l-0.76,-0.65l-0.99,-0.5l-0.74,-0.28l-0.13,-0.58l-0.12,-0.18l-0.66,-0.45l-0.34,-0.0l-0.13,0.31l0.13,0.59l-0.17,0.21l-0.34,-0.42l-0.14,-0.1l-0.7,-0.22l-0.23,-0.34l0.01,-0.62l0.31,-0.74l-0.14,-0.38l-0.3,-0.15l0.47,-0.4l1.48,0.6l0.26,-0.02l0.47,-0.27l0.58,0.15l0.35,0.44l0.17,0.11l0.74,0.17l0.27,-0.07l0.3,-0.27l0.52,1.09l0.97,1.02l0.77,0.71l-0.41,0.1l-0.23,0.3l0.01,1.02l0.12,0.24l0.2,0.14l-0.07,0.05l-0.11,0.3l0.08,0.37l-0.23,0.63Z" data-code="CR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M215.01,226.09l2.08,0.18l1.94,0.03l2.24,0.86l0.95,0.92l0.25,0.08l2.22,-0.28l0.79,0.55l3.68,2.81l0.19,0.06l0.77,-0.03l1.18,0.42l-0.12,0.47l0.27,0.37l1.78,0.1l1.59,0.9l-0.11,0.22l-1.5,0.3l-1.64,0.13l-1.75,-0.2l-2.69,0.19l1.0,-0.86l-0.03,-0.48l-1.02,-0.68l-0.13,-0.05l-1.52,-0.16l-0.74,-0.64l-0.57,-1.42l-0.3,-0.19l-1.36,0.1l-2.23,-0.67l-0.71,-0.52l-0.14,-0.06l-3.2,-0.4l-0.42,-0.25l0.56,-0.39l0.12,-0.33l-0.27,-0.22l-2.46,-0.13l-0.2,0.06l-1.72,1.31l-0.94,0.03l-0.25,0.15l-0.29,0.53l-1.04,0.24l-0.29,-0.07l0.7,-0.43l0.1,-0.11l0.5,-0.87l1.04,-0.54l1.23,-0.49l1.86,-0.25l0.62,-0.28Z" data-code="CU" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M500.95,353.41l-0.41,0.97l-1.16,0.23l-1.29,-1.26l-0.02,-0.71l0.63,-0.93l0.23,-0.7l0.47,-0.12l1.04,0.4l0.32,1.05l0.2,1.08Z" data-code="SZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M510.84,199.83l0.09,-0.11l0.07,-0.2l-0.04,-1.08l0.56,-1.4l1.3,-1.01l0.1,-0.34l-0.41,-1.11l-0.24,-0.19l-0.89,-0.11l-0.2,-1.84l0.55,-1.05l1.3,-1.22l0.09,-0.19l0.09,-1.09l0.39,0.27l0.25,0.04l2.66,-0.77l1.35,0.52l2.06,-0.01l2.93,-1.08l1.35,0.04l2.14,-0.34l-0.83,1.16l-1.31,0.68l-0.16,0.3l0.23,2.03l-0.9,3.25l-5.43,2.87l-4.79,2.91l-2.32,-0.92Z" data-code="SY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M599.04,172.15l0.38,-0.9l1.43,-0.37l4.04,1.02l0.37,-0.23l0.36,-1.64l1.17,-0.52l3.45,1.24l0.2,-0.0l0.86,-0.31l4.09,0.08l3.61,0.31l1.18,1.02l0.11,0.06l1.19,0.34l-0.13,0.26l-3.84,1.58l-0.13,0.1l-0.81,1.08l-3.08,0.34l-0.24,0.16l-0.85,1.7l-2.43,-0.37l-0.14,0.01l-1.79,0.61l-2.39,1.4l-0.12,0.39l0.25,0.49l-0.48,0.45l-4.57,0.43l-3.04,-0.94l-2.45,0.18l0.14,-1.02l2.42,0.44l0.27,-0.08l0.81,-0.81l1.76,0.27l0.21,-0.05l3.21,-2.14l-0.03,-0.51l-2.97,-1.57l-0.26,-0.01l-1.64,0.69l-1.38,-0.84l1.81,-1.67l-0.09,-0.5l-0.46,-0.18Z" data-code="KG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M523.3,287.04l0.06,0.17l1.29,1.8l-1.46,0.84l-0.11,0.11l-0.55,0.93l-0.81,0.16l-0.24,0.24l-0.34,1.69l-0.81,1.06l-0.46,1.58l-0.76,0.63l-3.3,-2.3l-0.16,-1.32l-0.15,-0.23l-9.35,-5.28l-0.02,-2.4l1.92,-2.63l0.91,-1.83l0.01,-0.24l-1.09,-2.86l-0.29,-1.24l-1.09,-1.63l2.93,-2.85l0.92,0.3l0.0,1.19l0.09,0.22l0.86,0.83l0.21,0.08l1.65,0.0l3.09,2.08l0.16,0.05l0.79,0.03l0.54,-0.06l0.58,0.28l1.67,0.2l0.28,-0.12l0.69,-0.98l2.04,-0.94l0.86,0.73l0.19,0.07l1.1,0.0l-1.82,2.36l-0.06,0.18l0.03,9.12Z" data-code="KE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M505.7,261.39l0.02,1.64l-0.27,0.55l-1.15,0.05l-0.24,0.15l-0.85,1.44l0.22,0.45l1.44,0.17l1.15,1.12l0.42,0.95l0.14,0.15l1.06,0.54l1.33,2.45l-3.06,2.98l-1.44,1.08l-1.75,0.01l-1.92,0.56l-1.5,-0.53l-0.27,0.03l-0.85,0.57l-1.98,-1.5l-0.56,-1.02l-0.37,-0.13l-1.32,0.5l-1.08,-0.15l-0.2,0.04l-0.56,0.35l-0.9,-0.24l-1.44,-1.97l-0.39,-0.77l-0.13,-0.13l-1.78,-0.94l-0.65,-1.5l-1.08,-1.12l-1.57,-1.22l-0.02,-0.68l-0.12,-0.23l-1.37,-1.02l-1.17,-0.68l0.2,-0.08l0.86,-0.48l0.14,-0.18l0.63,-2.22l0.6,-1.02l1.47,-0.28l0.35,0.56l1.29,1.48l0.14,0.09l0.69,0.22l0.22,-0.02l0.83,-0.4l1.58,0.08l0.26,0.39l0.25,0.13l2.49,0.0l0.3,-0.25l0.06,-0.35l1.13,-0.42l0.18,-0.18l0.22,-0.63l0.68,-0.38l1.95,1.37l0.23,0.05l1.29,-0.26l0.19,-0.12l1.23,-1.8l1.36,-1.37l0.08,-0.25l-0.21,-1.52l-0.06,-0.15l-0.25,-0.3l0.94,-0.08l0.26,-0.21l0.1,-0.32l0.6,0.09l-0.25,1.67l0.3,1.83l0.11,0.19l1.22,0.94l0.25,0.73l-0.04,1.2l0.26,0.31l0.09,0.01Z" data-code="SS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M278.1,270.26l2.71,0.45l0.31,-0.14l0.19,-0.32l1.82,-0.16l2.25,0.56l-1.09,1.81l-0.04,0.19l0.2,1.72l0.05,0.13l0.9,1.35l-0.39,0.99l-0.21,1.09l-0.48,0.8l-1.2,-0.44l-0.17,-0.01l-1.12,0.24l-0.95,-0.21l-0.35,0.2l-0.25,0.73l0.05,0.29l0.3,0.35l-0.06,0.13l-1.01,-0.15l-1.42,-2.03l-0.32,-1.36l-0.29,-0.23l-0.63,-0.0l-0.95,-1.56l0.41,-1.16l0.01,-0.17l-0.08,-0.35l1.29,-0.56l0.18,-0.22l0.35,-1.97Z" data-code="SR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M680.28,257.89l-0.93,-1.2l-1.24,-2.56l-0.56,-2.9l1.45,-1.92l3.07,-0.46l2.26,0.35l2.03,0.98l0.38,-0.11l1.0,-1.55l1.86,0.79l0.52,1.51l-0.28,2.82l-4.05,1.88l-0.12,0.45l0.79,1.1l-2.2,0.17l-2.08,0.98l-1.89,-0.33Z" data-code="KH" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M197.02,248.89l0.18,-0.05l0.59,0.17l0.55,0.51l0.64,0.35l0.06,0.22l0.37,0.21l1.01,-0.28l0.38,0.13l0.16,0.13l-0.14,0.81l-0.18,0.38l-1.22,-0.03l-0.84,-0.23l-1.11,-0.52l-1.31,-0.15l-0.49,-0.38l0.02,-0.08l0.76,-0.57l0.46,-0.27l0.11,-0.35Z" data-code="SV" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M468.01,150.02l0.05,0.07l0.36,0.1l0.85,-0.37l1.12,1.02l0.33,0.05l1.38,-0.65l1.07,0.3l0.16,0.0l1.69,-0.43l1.95,1.02l-0.51,0.64l-0.45,1.2l-0.32,0.2l-2.55,-0.93l-0.17,-0.01l-0.82,0.2l-0.17,0.11l-0.53,0.68l-0.94,0.32l-0.14,-0.11l-0.29,-0.04l-1.18,0.48l-0.95,0.09l-0.26,0.21l-0.15,0.47l-1.84,0.34l-0.82,-0.31l-1.14,-0.73l-0.2,-0.89l0.42,-0.84l0.91,0.05l0.12,-0.02l0.86,-0.33l0.18,-0.21l0.03,-0.13l0.32,-0.1l0.2,-0.22l0.12,-0.55l0.39,-0.1l0.18,-0.13l0.3,-0.45l0.43,-0.0Z" data-code="SK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M737.31,185.72l0.84,0.08l0.27,-0.12l0.89,-1.2l1.63,-0.13l1.1,-0.2l0.21,-0.16l0.12,-0.24l1.86,2.95l0.59,1.79l0.02,3.17l-0.84,1.38l-2.23,0.55l-1.95,1.14l-1.91,0.21l-0.22,-1.21l0.45,-2.07l-0.01,-0.17l-0.99,-2.67l1.54,-0.4l0.17,-0.46l-1.55,-2.24Z" data-code="KR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M455.77,159.59l1.79,0.21l0.18,-0.04l1.2,-0.68l2.12,-0.08l0.21,-0.1l0.38,-0.42l0.1,0.01l0.28,0.62l-1.71,0.71l-0.18,0.22l-0.21,1.1l-0.71,0.26l-0.2,0.28l0.01,0.55l-0.59,-0.04l-0.79,-0.47l-0"""),
format.raw(""".38,0.06l-0.36,0.41l-0.84,-0.05l0.05,-0.15l-0.56,-1.24l0.21,-1.17Z" data-code="SI" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M747.76,172.02l-0.23,-0.04l-0.26,0.08l-1.09,1.02l-0.78,1.06l-0.06,0.19l0.09,1.95l-1.12,0.57l-0.53,0.58l-0.88,0.82l-1.69,0.51l-1.09,0.79l-0.12,0.22l-0.07,1.17l-0.22,0.25l0.09,0.47l0.96,0.46l1.22,1.1l-0.19,0.37l-0.91,0.16l-1.75,0.14l-0.22,0.12l-0.87,1.18l-0.95,-0.09l-0.3,0.18l-0.97,-0.44l-0.39,0.13l-0.25,0.44l-0.29,0.09l-0.03,-0.2l-0.18,-0.23l-0.62,-0.25l-0.43,-0.29l0.52,-0.97l0.52,-0.3l0.13,-0.38l-0.18,-0.42l0.59,-1.47l0.01,-0.21l-0.16,-0.48l-0.22,-0.2l-1.41,-0.31l-0.82,-0.55l1.74,-1.62l2.73,-1.58l1.62,-1.96l0.96,0.76l0.17,0.06l2.17,0.11l0.31,-0.37l-0.32,-1.31l3.61,-1.21l0.16,-0.13l0.79,-1.34l1.25,1.38Z" data-code="KP" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M543.8,256.48l0.61,-0.05l1.14,-0.37l1.31,-0.25l0.12,-0.05l1.11,-0.81l0.57,-0.0l0.03,0.39l-0.23,1.49l0.01,1.25l-0.52,0.92l-0.7,2.71l-1.19,2.79l-1.54,3.2l-2.13,3.66l-2.12,2.79l-2.92,3.39l-2.47,2.0l-3.76,2.5l-2.33,1.9l-2.77,3.06l-0.61,1.35l-0.28,0.29l-1.22,-1.69l-0.03,-8.92l2.12,-2.76l0.59,-0.68l1.47,-0.04l0.18,-0.06l2.15,-1.71l3.16,-0.11l0.21,-0.09l7.08,-7.55l1.76,-2.12l1.14,-1.57l0.06,-0.18l0.01,-4.67Z" data-code="SO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M379.28,250.34l-0.95,-1.82l-0.09,-0.1l-0.83,-0.6l0.62,-0.28l0.13,-0.11l1.21,-1.8l0.6,-1.31l0.71,-0.68l1.09,0.2l0.18,-0.02l1.17,-0.53l1.25,-0.03l1.17,0.73l1.59,0.65l1.47,1.83l1.59,1.7l0.12,1.56l0.49,1.46l0.1,0.14l0.85,0.65l0.18,0.82l-0.08,0.57l-0.13,0.05l-1.29,-0.19l-0.29,0.13l-0.11,0.16l-0.35,0.04l-1.83,-0.61l-5.84,-0.13l-0.12,0.02l-0.6,0.26l-0.87,-0.06l-1.01,0.32l-0.26,-1.26l1.9,0.04l0.16,-0.04l0.54,-0.32l0.37,-0.02l0.15,-0.05l0.78,-0.5l0.92,0.46l0.12,0.03l1.09,0.04l0.15,-0.03l1.08,-0.57l0.11,-0.44l-0.51,-0.74l-0.39,-0.1l-0.76,0.39l-0.62,-0.01l-0.92,-0.58l-0.18,-0.05l-0.79,0.04l-0.2,0.09l-0.48,0.51l-2.41,0.06Z" data-code="SN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M392.19,267.53l-0.44,-0.12l-1.73,-0.97l-1.24,-1.28l-0.4,-0.84l-0.27,-1.65l1.21,-1.0l0.09,-0.12l0.27,-0.66l0.32,-0.41l0.56,-0.05l0.16,-0.07l0.5,-0.41l1.75,0.0l0.59,0.77l0.49,0.96l-0.07,0.64l0.04,0.19l0.36,0.58l-0.03,0.84l0.24,0.2l-0.64,0.65l-1.13,1.37l-0.06,0.14l-0.12,0.66l-0.43,0.58Z" data-code="SL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M826.74,311.51l0.23,0.29l-0.95,-0.01l-0.39,-0.63l0.65,0.27l0.45,0.09ZM825.01,308.52l-1.18,-1.39l-0.37,-1.06l0.24,0.0l0.82,1.84l0.49,0.6ZM823.21,309.42l-0.44,0.03l-1.43,-0.24l-0.32,-0.24l0.08,-0.5l1.29,0.31l0.72,0.47l0.11,0.18ZM817.9,303.81l2.59,1.44l0.3,0.41l-1.21,-0.66l-1.34,-0.89l-0.34,-0.3ZM813.77,302.4l0.48,0.34l0.1,0.08l-0.33,-0.17l-0.25,-0.25Z" data-code="SB" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M528.24,243.1l-0.2,-0.69l-0.07,-0.12l-0.69,-0.71l-0.18,-0.94l-0.12,-0.19l-1.24,-0.89l-1.28,-2.09l-0.7,-2.08l-0.07,-0.11l-1.73,-1.79l-0.11,-0.07l-1.03,-0.39l-1.57,-2.36l-0.27,-1.72l0.1,-1.53l-0.03,-0.15l-1.44,-2.93l-1.25,-1.13l-1.34,-0.56l-0.72,-1.33l0.11,-0.49l-0.02,-0.2l-0.7,-1.38l-0.08,-0.1l-0.68,-0.56l-0.97,-1.98l-2.8,-4.03l-0.25,-0.13l-0.85,0.01l0.29,-1.11l0.12,-0.97l0.23,-0.81l2.52,0.39l0.23,-0.06l1.08,-0.84l0.6,-0.95l1.78,-0.35l0.22,-0.17l0.37,-0.83l0.74,-0.42l0.08,-0.46l-2.17,-2.4l4.55,-1.26l0.12,-0.06l0.36,-0.32l2.83,0.71l3.67,1.91l7.04,5.5l0.17,0.06l4.64,0.22l2.06,0.24l0.55,1.15l0.28,0.17l1.56,-0.06l0.9,2.15l0.14,0.15l1.14,0.57l0.39,0.85l0.11,0.13l1.59,1.06l0.12,0.91l-0.23,0.83l0.01,0.18l0.32,0.9l0.07,0.11l0.68,0.7l0.33,0.86l0.37,0.65l0.09,0.1l0.76,0.53l0.25,0.04l0.45,-0.12l0.35,0.75l0.1,0.63l0.96,2.68l0.23,0.19l7.53,1.33l0.27,-0.09l0.24,-0.26l0.87,1.41l-1.58,4.96l-7.34,2.54l-7.28,1.02l-2.34,1.17l-0.12,0.1l-1.74,2.63l-0.86,0.32l-0.49,-0.68l-0.28,-0.12l-0.92,0.12l-2.32,-0.25l-0.41,-0.23l-0.15,-0.04l-2.89,0.06l-0.63,0.2l-0.91,-0.59l-0.43,0.11l-0.66,1.27l-0.03,0.21l0.21,0.89l-0.6,0.45Z" data-code="SA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M476.42,90.44l-0.15,0.1l-2.43,2.86l-0.07,0.24l0.36,2.31l-3.84,3.1l-4.83,3.38l-0.11,0.15l-1.82,5.45l0.03,0.26l1.78,2.68l2.27,1.99l-2.13,3.88l-2.49,0.82l-0.2,0.24l-0.95,6.05l-1.32,3.09l-2.82,-0.32l-0.3,0.16l-1.34,2.64l-2.48,0.14l-0.76,-3.15l-2.09,-4.04l-1.85,-5.01l1.03,-1.98l2.06,-2.53l0.06,-0.13l0.83,-4.45l-0.06,-0.25l-1.54,-1.86l-0.15,-5.0l1.52,-3.48l2.28,0.06l0.27,-0.16l0.87,-1.59l-0.01,-0.31l-0.8,-1.21l3.79,-5.63l4.07,-7.54l2.23,0.01l0.29,-0.22l0.59,-2.15l4.46,0.66l0.34,-0.26l0.34,-2.64l1.21,-0.14l3.24,2.08l3.78,2.85l0.06,6.37l0.03,0.14l0.67,1.29l-3.95,1.07Z" data-code="SE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M505.98,259.75l-0.31,-0.9l-0.1,-0.14l-1.2,-0.93l-0.27,-1.66l0.29,-1.83l-0.25,-0.34l-1.16,-0.17l-0.33,0.21l-0.11,0.37l-1.3,0.11l-0.21,0.49l0.55,0.68l0.18,1.29l-1.31,1.33l-1.18,1.72l-1.04,0.21l-2.0,-1.4l-0.32,-0.02l-0.95,0.52l-0.14,0.16l-0.21,0.6l-1.16,0.43l-0.19,0.23l-0.04,0.27l-2.08,0.0l-0.25,-0.39l-0.24,-0.13l-1.81,-0.09l-0.14,0.03l-0.8,0.38l-0.49,-0.16l-1.22,-1.39l-0.42,-0.67l-0.31,-0.14l-1.81,0.35l-0.2,0.14l-0.72,1.24l-0.61,2.14l-0.73,0.4l-0.62,0.22l-0.83,-0.68l-0.12,-0.6l0.38,-0.97l0.01,-1.14l-0.08,-0.2l-1.39,-1.53l-0.25,-0.97l0.03,-0.57l-0.11,-0.25l-0.81,-0.66l-0.03,-1.34l-0.04,-0.14l-0.52,-0.98l-0.31,-0.15l-0.42,0.07l0.12,-0.44l0.63,-1.03l0.03,-0.23l-0.24,-0.88l0.69,-0.66l0.02,-0.41l-0.4,-0.46l0.58,-1.39l1.04,-1.71l1.97,0.16l0.32,-0.3l-0.12,-10.24l0.02,-0.8l2.59,-0.01l0.3,-0.3l0.0,-4.92l29.19,0.0l0.68,2.17l-0.4,0.35l-0.1,0.27l0.36,2.69l0.93,3.15l0.12,0.16l2.05,1.4l-0.99,1.15l-1.75,0.4l-0.15,0.08l-0.79,0.79l-0.08,0.17l-0.24,1.69l-1.07,3.75l-0.0,0.16l0.25,0.96l-0.38,2.1l-0.98,2.41l-1.52,1.3l-1.07,1.94l-0.25,0.99l-1.08,0.64l-0.13,0.18l-0.46,1.65Z" data-code="SD" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M241.7,234.97l0.15,-0.22l1.73,0.01l1.43,0.64l0.15,0.03l0.45,-0.04l0.36,0.74l0.28,0.17l1.02,-0.04l-0.04,0.43l0.27,0.33l1.03,0.09l0.91,0.7l-0.57,0.64l-0.99,-0.47l-0.16,-0.03l-1.11,0.11l-0.79,-0.12l-0.26,0.09l-0.38,0.4l-0.66,0.11l-0.28,-0.45l-0.38,-0.12l-0.83,0.37l-0.14,0.13l-0.85,1.49l-0.27,-0.17l-0.1,-0.58l0.05,-0.67l-0.07,-0.21l-0.44,-0.53l0.35,-0.25l0.12,-0.19l0.19,-1.0l-0.2,-1.4Z" data-code="DO" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M528.78,253.36l0.34,0.45l-0.06,0.76l-1.26,0.54l-0.05,0.53l0.82,0.53l-0.57,0.83l-0.3,-0.25l-0.27,-0.05l-0.56,0.17l-1.07,-0.03l-0.04,-0.56l-0.16,-0.56l0.76,-1.07l0.76,-0.97l0.89,0.18l0.25,-0.06l0.51,-0.42Z" data-code="DJ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M452.4,129.07l-1.27,2.39l-2.25,-1.69l-0.26,-1.08l3.15,-1.0l0.63,1.39ZM447.87,126.25l-0.35,0.76l-0.47,-0.24l-0.38,0.09l-1.8,2.53l-0.03,0.29l0.56,1.4l-1.22,0.4l-1.68,-0.41l-0.92,-1.76l-0.07,-3.47l0.38,-0.88l0.62,-0.93l2.07,-0.21l0.19,-0.1l0.84,-0.95l1.5,-0.76l-0.06,1.26l-0.7,1.1l-0.03,0.25l0.3,1.0l0.18,0.19l1.06,0.42Z" data-code="DK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M445.51,131.69l0.03,0.94l0.21,0.28l2.32,0.74l-0.02,1.0l0.37,0.3l2.55,-0.65l1.36,-0.89l2.63,1.27l1.09,1.01l0.51,1.51l-0.6,0.78l-0.0,0.36l0.88,1.17l0.58,1.68l-0.18,1.08l0.03,0.18l0.87,1.81l-0.66,0.2l-0.55,-0.32l-0.36,0.05l-0.58,0.58l-1.73,0.62l-0.99,0.84l-1.77,0.7l-0.16,0.4l0.42,0.94l0.26,1.34l0.14,0.2l1.25,0.76l1.22,1.2l-0.71,1.2l-0.81,0.37l-0.17,0.32l0.34,1.99l-0.04,0.09l-0.47,-0.39l-0.17,-0.07l-1.2,-0.1l-1.85,0.57l-2.15,-0.13l-0.29,0.18l-0.21,0.5l-0.96,-0.67l-0.24,-0.05l-0.67,0.16l-2.6,-0.94l-0.34,0.1l-0.42,0.57l-1.64,-0.02l0.26,-1.88l1.24,-2.15l-0.21,-0.45l-3.54,-0.58l-0.98,-0.71l0.12,-1.26l-0.05,-0.2l-0.44,-0.64l0.27,-2.18l-0.38,-3.14l1.17,-0.0l0.27,-0.17l0.63,-1.26l0.65,-3.17l-0.02,-0.17l-0.41,-1.0l0.32,-0.47l1.77,-0.16l0.37,0.6l0.47,0.06l1.7,-1.69l0.06,-0.33l-0.55,-1.24l-0.09,-1.51l1.5,0.36l0.16,-0.01l1.22,-0.4Z" data-code="DE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M553.53,242.65l-1.51,0.58l-0.17,0.16l-0.48,1.14l-0.07,0.79l-2.31,1.0l-3.98,1.19l-2.28,1.8l-0.97,0.12l-0.7,-0.14l-0.23,0.05l-1.42,1.03l-1.51,0.47l-2.07,0.13l-0.68,0.15l-0.17,0.1l-0.49,0.6l-0.57,0.16l-0.18,0.13l-0.3,0.49l-1.06,-0.05l-0.13,0.02l-0.73,0.32l-1.48,-0.11l-0.55,-1.26l0.07,-1.32l-0.04,-0.16l-0.39,-0.72l-0.48,-1.85l-0.52,-0.79l0.08,-0.02l0.22,-0.36l-0.23,-1.05l0.24,-0.39l0.04,-0.19l-0.09,-0.95l0.96,-0.72l0.11,-0.31l-0.23,-0.98l0.46,-0.88l0.75,0.49l0.26,0.03l0.63,-0.22l2.76,-0.06l0.5,0.25l2.42,0.26l0.85,-0.11l0.52,0.71l0.35,0.1l1.17,-0.43l0.15,-0.12l1.75,-2.64l2.22,-1.11l6.95,-0.96l2.55,5.58Z" data-code="YE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M463.17,154.15l-0.14,0.99l-1.15,0.01l-0.24,0.47l0.39,0.56l-0.75,1.84l-0.36,0.4l-2.06,0.07l-0.14,0.04l-1.18,0.67l-1.96,-0.23l-3.43,-0.78l-0.5,-0.97l-0.33,-0.16l-2.47,0.55l-0.2,0.16l-0.18,0.37l-1.27,-0.38l-1.28,-0.09l-0.81,-0.41l0.25,-0.51l0.03,-0.18l-0.05,-0.28l0.35,-0.08l1.16,0.81l0.45,-0.13l0.27,-0.64l2.0,0.12l1.84,-0.57l1.05,0.09l0.71,0.59l0.47,-0.11l0.23,-0.54l0.02,-0.17l-0.32,-1.85l0.69,-0.31l0.13,-0.12l0.73,-1.23l1.61,0.89l0.35,-0.04l1.35,-1.27l0.7,-0.19l1.84,0.93l0.18,0.03l1.08,-0.15l0.81,0.43l-0.07,0.15l-0.02,0.2l0.24,1.06Z" data-code="AT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M450.58,224.94l-8.31,4.86l-7.23,5.12l-3.46,1.13l-2.42,0.22l-0.02,-1.33l-0.2,-0.28l-1.15,-0.42l-1.45,-0.69l-0.55,-1.13l-0.1,-0.12l-8.45,-5.72l-17.72,-12.17l0.03,-0.38l-0.02,-3.21l3.84,-1.91l2.46,-0.41l2.1,-0.75l0.14,-0.11l0.9,-1.3l2.84,-1.06l0.19,-0.27l0.09,-1.81l1.21,-0.2l0.15,-0.07l1.06,-0.96l3.19,-0.46l0.23,-0.18l0.46,-1.08l-0.08,-0.34l-0.6,-0.54l-0.83,-2.85l-0.18,-1.8l-0.82,-1.57l2.13,-1.37l2.65,-0.49l0.13,-0.05l1.55,-1.15l2.34,-0.85l4.2,-0.51l4.07,-0.23l1.21,0.41l0.23,-0.01l2.3,-1.11l2.52,-0.02l0.94,0.62l0.2,0.05l1.25,-0.13l-0.36,1.03l-0.01,0.14l0.39,2.66l-0.56,2.2l-1.49,1.52l-0.08,0.24l0.22,2.12l0.11,0.2l1.94,1.58l0.02,0.54l0.12,0.23l1.45,1.06l1.04,4.85l0.81,2.42l0.13,1.19l-0.43,2.17l0.17,1.28l-0.31,1.53l0.2,1.56l-0.9,1.02l-0.01,0.38l1.43,1.88l0.09,1.06l0.04,0.13l0.89,1.48l0.37,0.12l1.03,-0.43l1.79,1.12l0.89,1.34Z" data-code="DZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M892.64,99.05l1.16,0.57l0.21,0.02l1.45,-0.38l1.92,0.99l2.17,0.47l-1.65,0.72l-1.75,-0.79l-0.93,-0.7l-0.21,-0.06l-2.11,0.22l-0.35,-0.2l0.09,-0.87ZM183.29,150.37l0.39,1.54l0.12,0.17l0.78,0.55l0.14,0.05l1.74,0.2l2.52,0.5l2.4,0.98l0.17,0.02l1.96,-0.4l3.01,0.81l0.91,-0.02l2.22,-0.88l4.67,2.33l3.86,2.01l0.21,0.71l0.15,0.18l0.33,0.17l-0.02,0.05l0.23,0.43l0.67,0.1l0.21,-0.05l0.1,-0.07l0.05,0.29l0.09,0.16l0.5,0.5l0.21,0.09l0.56,0.0l0.13,0.13l-0.2,0.36l0.12,0.41l2.49,1.39l0.99,5.24l-0.69,1.68l-1.16,1.64l-0.6,1.18l-0.06,0.31l0.04,0.22l0.28,0.43l0.11,0.1l0.85,0.47l0.15,0.04l0.63,0.0l0.14,-0.04l2.87,-1.58l2.6,-0.49l3.28,-1.5l0.17,-0.23l0.04,-0.43l-0.23,-0.93l-0.24,-0.39l0.74,-0.32l4.7,-0.01l0.25,-0.13l0.77,-1.15l2.9,-2.41l1.04,-0.52l8.35,-0.02l0.28,-0.21l0.2,-0.6l0.7,-0.14l1.06,-0.48l0.13,-0.11l0.92,-1.49l0.75,-2.39l1.67,-2.08l0.59,0.6l0.3,0.07l1.52,-0.49l0.88,0.72l-0.0,4.14l0.08,0.2l1.6,1.72l0.31,0.72l-2.42,1.35l-2.55,1.05l-2.64,0.9l-0.14,0.11l-1.33,1.81l-0.44,0.7l-0.05,0.15l-0.03,1.6l0.03,0.14l0.83,1.59l0.24,0.16l0.78,0.06l-1.15,0.33l-1.25,-0.04l-1.83,0.52l-2.51,0.29l-2.17,0.88l-0.17,0.36l0.33,0.22l3.55,-0.54l0.15,0.11l-2.87,0.73l-1.19,0.0l-0.16,-0.33l-0.36,0.06l-0.76,0.82l0.17,0.5l0.42,0.08l-0.45,1.75l-1.4,1.74l-0.04,-0.17l-0.21,-0.22l-0.48,-0.13l-0.77,-0.69l-0.36,-0.03l-0.12,0.34l0.52,1.58l0.09,0.14l0.52,0.43l0.03,0.87l-0.74,1.05l-0.39,0.63l0.05,-0.12l-0.08,-0.34l-1.19,-1.03l-0.28,-2.31l-0.26,-0.26l-0.32,0.19l-0.48,1.27l-0.01,0.19l0.39,1.33l-1.14,-0.31l-0.36,0.18l0.14,0.38l1.57,0.85l0.1,2.58l0.22,0.28l0.55,0.15l0.21,0.81l0.33,2.72l-1.46,1.94l-2.5,0.81l-0.12,0.07l-1.58,1.58l-1.15,0.17l-0.15,0.06l-1.27,1.03l-0.09,0.13l-0.32,0.85l-2.71,1.79l-1.45,1.37l-1.18,1.64l-0.05,0.12l-0.39,1.96l0.0,0.13l0.44,1.91l0.85,2.37l1.1,1.91l0.03,1.2l1.16,3.07l-0.08,1.74l-0.1,0.99l-0.57,1.48l-0.54,0.24l-0.97,-0.26l-0.34,-1.02l-0.12,-0.16l-0.89,-0.58l-2.44,-4.28l-0.34,-0.94l0.49,-1.71l-0.02,-0.21l-0.7,-1.5l-2.0,-2.35l-0.11,-0.08l-0.98,-0.42l-0.25,0.01l-2.42,1.19l-0.26,-0.08l-1.26,-1.29l-1.57,-0.68l-0.16,-0.02l-2.79,0.34l-2.18,-0.3l-1.98,0.19l-1.12,0.45l-0.14,0.44l0.4,0.65l-0.04,1.02l0.09,0.22l0.29,0.3l-0.06,0.05l-0.77,-0.33l-0.26,0.01l-0.87,0.48l-1.64,-0.08l-1.79,-1.39l-0.23,-0.06l-2.11,0.33l-1.75,-0.61l-0.14,-0.01l-1.61,0.2l-2.11,0.64l-0.11,0.06l-2.25,1.99l-2.53,1.21l-1.43,1.38l-0.58,1.22l-0.03,0.12l-0.03,1.86l0.13,1.32l0.3,0.62l-0.46,0.04l-1.71,-0.57l-1.85,-0.79l-0.63,-1.14l-0.54,-1.85l-0.07,-0.12l-1.45,-1.51l-0.86,-1.58l-1.26,-1.87l-0.09,-0.09l-1.76,-1.09l-0.17,-0.04l-2.05,0.05l-0.23,0.12l-1.44,1.97l-1.84,-0.72l-1.19,-0.76l-0.6,-1.45l-0.9,-1.52l-1.49,-1.21l-1.27,-0.87l-0.89,-0.96l-0.22,-0.1l-4.34,-0.0l-0.3,0.3l-0.0,0.84l-6.62,0.02l-5.66,-1.93l-3.48,-1.24l0.11,-0.25l-0.3,-0.42l-3.18,0.3l-2.6,0.2l-0.35,-1.19l-0.08,-0.13l-1.62,-1.61l-0.13,-0.08l-1.02,-0.29l-0.22,-0.66l-0.25,-0.2l-1.31,-0.13l-0.82,-0.7l-0.16,-0.07l-2.25,-0.27l-0.48,-0.34l-0.28,-1.44l-0.07,-0.14l-2.41,-2.84l-2.03,-3.89l0.08,-0.58l-0.1,-0.27l-1.08,-0.94l-1.87,-2.36l-0.33,-2.31l-0.07,-0.15l-1.24,-1.5l0.52,-2.4l-0.09,-2.57l-0.78,-2.3l0.96,-2.83l0.61,-5.66l-0.46,-4.26l-0.79,-2.71l-0.68,-1.4l0.13,-0.26l3.24,0.97l1.28,2.88l0.52,0.06l0.62,-0.84l0.06,-0.22l-0.4,-2.61l-0.74,-2.29l68.9,-0.0l0.3,-0.3l0.01,-0.95l0.32,-0.01ZM32.5,67.43l1.75,1.99l0.41,0.04l1.02,-0.81l3.79,0.25l-0.1,0.72l0.24,0.34l3.83,0.77l2.6,-0.44l5.21,1.41l4.84,0.43l1.9,0.57l0.15,0.01l3.25,-0.71l3.72,1.32l2.52,0.58l-0.03,38.14l0.29,0.3l2.41,0.11l2.34,1.0l1.7,1.59l2.22,2.42l0.42,0.03l2.41,-2.04l2.25,-1.08l1.23,1.76l1.71,1.53l2.24,1.62l1.54,2.56l2.56,4.09l0.11,0.11l4.1,2.17l0.06,1.93l-1.12,1.35l-1.22,-1.14l-2.08,-1.05l-0.68,-2.94l-0.09,-0.16l-3.18,-2.84l-1.32,-3.35l-0.25,-0.19l-2.43,-0.24l-3.93,-0.09l-2.85,-1.02l-5.24,-3.85l-6.77,-2.04l-3.52,0.3l-4.84,-1.7l-2.96,-1.6l-0.23,-0.02l-2.78,0.8l-0.21,0.35l0.46,2.31l-1.11,0.19l-2.9,0.78l-2.24,1.26l-2.42,0.68l-0.29,-1.79l1.07,-3.49l2.54,-1.11l0.12,-0.45l-0.69,-0.96l-0.41,-0.07l-3.19,2.12l-1.76,2.54l-3.57,2.62l-0.03,0.46l1.63,1.59l-2.14,2.38l-2.64,1.49l-2.49,1.09l-0.16,0.17l-0.58,1.48l-3.8,1.79l-0.14,0.14l-0.75,1.57l-2.75,1.41l-1.62,-0.25l-0.16,0.02l-2.35,0.98l-2.54,1.19l-2.06,1.15l-4.05,0.93l-0.1,-0.15l2.45,-1.45l2.49,-1.1l2.61,-1.88l3.03,-0.39l0.19,-0.1l1.2,-1.41l3.43,-2.11l0.61,-0.75l1.81,-1.24l0.13,-0.2l0.42,-2.7l1.24,-2.12l-0.03,-0.35l-0.34,-0.09l-2.73,1.05l-0.67,-0.53l-0.39,0.02l-1.13,1.11l-1.43,-1.62l-0.49,0.06l-0.41,0.8l-0.67,-1.31l-0.42,-0.12l-2.43,1.43l-1.18,-0.0l-0.18,-1.86l0.43,-1.3l-0.09,-0.33l-1.61,-1.33l-0.26,-0.06l-3.11,0.68l-2.0,-1.66l-1.61,-0.85l-0.01,-1.97l-0.11,-0.23l-1.76,-1.48l0.86,-1.96l2.01,-2.13l0.88,-1.94l1.79,-0.25l1.65,0.6l0.31,-0.06l1.91,-1.8l1.67,0.31l0.22,-0.04l1.91,-1.23l0.13,-0.33l-0.47,-1.82l-0.15,-0.19l-1.0,-0.52l1.51,-1.27l0.09,-0.34l-0.29,-0.19l-1.62,0.06l-2.66,0.88l-0.13,0.09l-0.62,0.72l-1.77,-0.8l-0.16,-0.02l-3.48,0.44l-3.5,-0.92l-1.06,-1.61l-2.78,-2.09l3.07,-1.51l5.52,-2.01l1.65,0.0l-0.28,1.73l0.31,0.35l5.29,-0.16l0.23,-0.49l-2.03,-2.59l-0.1,-0.08l-3.03,-1.58l-1.79,-2.12l-2.4,-1.83l-3.18,-1.27l1.13,-1.84l4.28,-0.14l0.15,-0.05l3.16,-2.0l0.13,-0.17l0.57,-2.07l2.43,-2.02l2.42,-0.52l4.67,-1.98l2.22,0.29l0.2,-0.04l3.74,-2.37l3.57,0.91ZM37.66,123.49l-2.31,1.26l-1.04,-0.75l-0.31,-1.35l2.06,-1.16l1.24,-0.51l1.48,0.22l0.76,0.81l-1.89,1.49ZM30.89,233.84l1.2,0.57l0.35,0.3l0.48,0.69l-1.6,0.86l-0.3,0.31l-0.24,-0.14l0.05,-0.54l-0.02,-0.15l-0.36,-0.83l0.05,-0.12l0.39,-0.38l0.07,-0.31l-0.09,-0.27ZM29.06,231.89l0.5,0.14l0.31,0.19l-0.46,0.1l-0.34,-0.43ZM25.02,230.13l0.2,-0.11l0.4,0.47l-0.43,-0.05l-0.17,-0.31ZM21.29,228.68l0.1,-0.07l0.22,0.02l0.02,0.21l-0.02,0.02l-0.32,-0.18ZM6.0,113.33l-1.19,0.45l-1.5,-0.64l-0.94,-0.63l1.76,-0.46l1.71,0.29l0.16,0.98Z" data-code="US" fill="#4d7686" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M473.99,127.16l0.07,-2.15l1.15,-2.11l2.05,-1.07l1.84,2.48l0.25,0.12l2.01,-0.07l0.29,-0.25l0.45,-2.58l1.85,-0.56l0.98,0.4l2.13,1.33l0.16,0.05l1.97,0.01l1.02,0.7l0.21,1.67l0.71,1.84l-2.44,1.23l-1.36,0.53l-2.28,-1.62l-0.12,-0.05l-1.18,-0.2l-0.28,-0.6l-0.31,-0.17l-2.43,0.35l-4.17,-0.23l-0.12,0.02l-2.45,0.93Z" data-code="LV" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M276.9,363.17l1.3,-0.23l2.4,2.04l0.22,0.07l0.82,-0.07l2.48,1.7l1.93,1.5l1.28,1.67l-0.95,1.14l-0.04,0.31l0.63,1.45l-0.96,1.57l-2.65,1.47l-1.73,-0.53l-0.15,-0.01l-1.25,0.28l-2.22,-1.16l-0.16,-0.03l-1.56,0.08l-1.33,-1.36l0.17,-1.58l0.48,-0.55l0.07,-0.2l-0.02,-2.74l0.66,-2.8l0.57,-2.02Z" data-code="UY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M510.44,198.11l-0.48,0.03l-0.26,0.17l-0.15,0.32l-0.21,-0.0l0.72,-1.85l1.19,-1.9l0.74,0.09l0.27,0.73l-1.19,0.93l-0.09,0.13l-0.54,1.36Z" data-code="LB" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M684.87,248.8l0.61,-0.86l0.05,-0.16l0.11,-2.17l-0.08,-0.22l-1.96,-2.16l-0.15,-2.44l-0.08,-0.18l-1.9,-2.1l-0.19,-0.1l-1.89,-0.18l-0.29,0.15l-0.42,0.76l-1.21,0.06l-0.67,-0.41l-0.31,-0.0l-2.2,1.29l-0.05,-1.77l0.61,-2.7l-0.27,-0.37l-1.44,-0.1l-0.12,-1.31l-0.12,-0.21l-0.87,-0.65l0.38,-0.68l1.76,-1.41l0.08,0.22l0.27,0.2l1.33,0.07l0.31,-0.34l-0.35,-2.75l0.85,-0.25l1.32,1.88l1.11,2.36l0.27,0.17l2.89,0.02l0.78,1.82l-1.32,0.56l-0.12,0.09l-0.72,0.93l0.1,0.45l2.93,1.52l3.62,5.27l1.88,1.78l0.58,1.67l-0.38,2.11l-1.87,-0.79l-0.37,0.11l-0.99,1.54l-1.51,-0.73Z" data-code="LA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M725.6,222.5l-1.5,4.22l-0.82,1.65l-1.01,-1.7l-0.26,-1.8l1.4,-2.48l1.8,-1.81l0.76,0.53l-0.38,1.39Z" data-code="TW" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M266.35,259.46l0.41,-0.39l0.09,-0.23l-0.04,-0.75l1.14,-0.26l0.2,0.03l-0.07,1.37l-1.73,0.23Z" data-code="TT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M513.25,175.38l3.63,1.17l0"""),
format.raw(""".14,0.01l2.88,-0.45l2.11,0.26l0.18,-0.03l2.9,-1.53l2.51,-0.13l2.25,1.37l0.36,0.88l-0.23,1.36l0.19,0.33l1.81,0.72l0.61,0.53l-1.31,0.64l-0.16,0.34l0.76,3.24l-0.44,0.8l0.01,0.3l1.19,2.02l-0.71,0.29l-0.74,-0.62l-0.15,-0.07l-2.91,-0.37l-0.15,0.02l-1.04,0.43l-2.78,0.44l-1.44,-0.03l-2.83,1.06l-1.95,0.01l-1.28,-0.52l-0.2,-0.01l-2.62,0.76l-0.7,-0.48l-0.47,0.22l-0.13,1.49l-1.01,0.94l-0.58,-0.82l0.79,-0.9l0.04,-0.34l-0.31,-0.15l-1.46,0.23l-2.03,-0.64l-0.3,0.07l-1.65,1.58l-3.58,0.3l-1.94,-1.47l-0.17,-0.06l-2.7,-0.1l-0.28,0.17l-0.51,1.06l-1.47,0.29l-2.32,-1.46l-0.17,-0.05l-2.55,0.05l-1.4,-2.7l-1.72,-1.54l1.11,-2.06l-0.07,-0.37l-1.35,-1.19l2.47,-2.51l3.74,-0.11l0.26,-0.17l0.96,-2.07l4.56,0.38l0.19,-0.05l2.97,-1.92l2.84,-0.83l4.03,-0.06l4.31,2.08ZM488.85,176.8l-1.81,1.38l-0.57,-1.01l0.02,-0.36l0.45,-0.25l0.13,-0.15l0.78,-1.87l-0.11,-0.37l-0.72,-0.47l1.91,-0.71l1.89,0.35l0.25,0.97l0.17,0.2l1.87,0.83l-0.19,0.31l-2.82,0.16l-0.18,0.07l-1.06,0.91Z" data-code="TR" fill="#638a99" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M625.44,266.07l-0.35,2.4l-0.9,0.61l-1.91,0.5l-1.04,-1.75l-0.43,-3.5l1.0,-3.6l1.34,1.09l1.13,1.72l1.16,2.52Z" data-code="LK" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M444.91,206.18l-0.99,-4.57l-0.12,-0.18l-1.43,-1.04l-0.02,-0.53l-0.11,-0.22l-1.95,-1.59l-0.19,-1.85l1.44,-1.47l0.08,-0.14l0.59,-2.34l-0.38,-2.77l0.44,-1.28l2.52,-1.08l1.41,0.28l-0.06,1.2l0.43,0.28l1.81,-0.9l0.02,0.06l-1.14,1.28l-0.08,0.2l-0.02,1.32l0.11,0.24l0.74,0.6l-0.29,2.18l-1.56,1.35l-0.09,0.32l0.48,1.54l0.28,0.21l1.11,0.04l0.55,1.17l0.15,0.14l0.76,0.35l-0.12,1.79l-1.1,0.72l-0.8,0.91l-1.68,1.04l-0.13,0.32l0.25,1.08l-0.18,0.96l-0.74,0.39Z" data-code="TN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M734.21,307.22l0.17,-0.34l1.99,-0.52l1.72,-0.08l0.78,-0.3l0.29,0.1l-0.43,0.32l-2.57,1.09l-1.71,0.59l-0.05,-0.49l-0.19,-0.36Z" data-code="TL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M553.16,173.51l-0.12,1.0l-0.26,-0.65l0.38,-0.34ZM553.54,173.16l0.13,-0.12l0.43,-0.09l-0.56,0.21ZM555.68,172.6l0.65,-0.14l1.53,0.76l1.71,2.29l0.27,0.12l1.27,-0.14l2.81,-0.04l0.29,-0.38l-0.35,-1.27l1.98,-0.97l1.96,-1.63l3.05,1.44l0.25,2.23l0.14,0.22l0.96,0.61l0.18,0.05l2.61,-0.13l0.68,0.44l1.2,2.97l0.1,0.13l2.85,2.03l1.67,1.41l2.66,1.45l3.13,1.17l-0.05,1.23l-0.36,-0.04l-1.12,-0.73l-0.44,0.14l-0.34,0.89l-1.96,0.52l-0.22,0.23l-0.47,2.17l-1.26,0.78l-1.93,0.42l-0.21,0.18l-0.46,1.14l-1.64,0.33l-2.3,-0.97l-0.2,-2.23l-0.28,-0.27l-1.76,-0.1l-2.78,-2.48l-0.15,-0.07l-1.95,-0.31l-2.82,-1.48l-1.78,-0.27l-0.18,0.03l-1.03,0.51l-1.6,-0.08l-0.22,0.08l-1.72,1.6l-1.83,0.46l-0.39,-1.7l0.36,-3.0l-0.16,-0.3l-1.73,-0.88l0.57,-1.77l-0.25,-0.39l-1.33,-0.14l0.41,-1.85l2.05,0.63l0.21,-0.01l2.2,-0.95l0.09,-0.49l-1.78,-1.75l-0.69,-1.66l-0.07,-0.03Z" data-code="TM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M597.99,178.71l-0.23,0.23l-2.57,-0.47l-0.35,0.25l-0.24,1.7l0.32,0.34l2.66,-0.22l3.15,0.95l4.47,-0.42l0.58,2.45l0.39,0.21l0.71,-0.25l1.22,0.53l-0.06,1.01l0.29,1.28l-2.19,-0.0l-1.71,-0.21l-0.23,0.07l-1.51,1.25l-1.05,0.27l-0.77,0.51l-0.71,-0.67l0.22,-2.28l-0.24,-0.32l-0.43,-0.08l0.17,-0.57l-0.16,-0.36l-1.36,-0.66l-0.34,0.05l-1.08,1.01l-0.09,0.15l-0.25,1.09l-0.24,0.26l-1.36,-0.05l-0.27,0.14l-0.65,1.06l-0.58,-0.39l-0.3,-0.02l-1.68,0.86l-0.36,-0.16l1.28,-2.65l0.02,-0.2l-0.54,-2.17l-0.18,-0.21l-1.53,-0.58l0.41,-0.82l1.89,0.13l0.26,-0.12l1.19,-1.63l0.77,-1.82l2.66,-0.55l-0.33,0.87l0.01,0.23l0.36,0.82l0.3,0.18l0.23,-0.02Z" data-code="TJ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M493.32,359.69l0.69,0.65l-0.65,1.12l-0.38,0.8l-1.27,0.39l-0.18,0.15l-0.4,0.77l-0.59,0.18l-1.59,-1.78l1.16,-1.5l1.3,-1.02l0.97,-0.46l0.94,0.72Z" data-code="LS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M677.42,253.68l-1.7,-0.88l-0.14,-0.03l-1.77,0.04l0.3,-1.64l-0.3,-0.35l-2.21,0.01l-0.3,0.28l-0.2,2.76l-2.15,5.9l-0.02,0.13l0.17,1.83l0.28,0.27l1.45,0.07l0.93,2.1l0.44,2.15l0.08,0.15l1.4,1.44l0.16,0.09l1.43,0.27l1.04,1.05l-0.58,0.73l-1.24,0.22l-0.15,-0.99l-0.15,-0.22l-2.04,-1.1l-0.36,0.06l-0.23,0.23l-0.72,-0.71l-0.41,-1.18l-0.06,-0.11l-1.33,-1.42l-1.22,-1.2l-0.5,0.13l-0.15,0.54l-0.14,-0.41l0.26,-1.48l0.73,-2.38l1.2,-2.57l1.37,-2.35l0.02,-0.27l-0.95,-2.26l0.03,-1.19l-0.29,-1.42l-0.06,-0.13l-1.65,-2.0l-0.46,-0.99l0.62,-0.34l0.13,-0.15l0.92,-2.23l-0.02,-0.27l-1.05,-1.74l-1.57,-1.86l-1.04,-1.96l0.76,-0.34l0.16,-0.16l1.07,-2.63l1.58,-0.1l0.16,-0.06l1.43,-1.11l1.24,-0.52l0.84,0.62l0.13,1.43l0.28,0.27l1.34,0.09l-0.54,2.39l0.05,2.39l0.45,0.25l2.48,-1.45l0.6,0.36l0.17,0.04l1.47,-0.07l0.25,-0.15l0.41,-0.73l1.58,0.15l1.76,1.93l0.15,2.44l0.08,0.18l1.94,2.15l-0.1,1.96l-0.66,0.93l-2.25,-0.34l-3.24,0.49l-0.19,0.12l-1.6,2.12l-0.06,0.24l0.48,2.46Z" data-code="TH" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M593.76,417.73l1.38,0.84l2.15,0.37l0.04,0.31l-0.59,1.24l-3.36,0.19l-0.05,-1.38l0.43,-1.56Z" data-code="TF" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M425.23,269.29l-1.49,0.4l-0.43,-0.68l-0.64,-1.54l-0.18,-1.16l0.54,-2.21l-0.04,-0.24l-0.59,-0.86l-0.23,-1.9l0.0,-1.82l-0.07,-0.19l-0.95,-1.19l0.1,-0.41l1.58,0.04l-0.23,0.97l0.08,0.28l1.55,1.55l0.09,1.13l0.08,0.19l0.42,0.43l-0.11,5.66l0.52,1.53Z" data-code="TG" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M457.57,252.46l0.23,-1.08l-0.28,-0.36l-1.32,-0.05l0.0,-1.35l-0.1,-0.22l-0.9,-0.82l0.99,-3.1l3.12,-2.37l0.12,-0.23l0.13,-3.33l0.95,-5.2l0.53,-1.09l-0.07,-0.36l-0.94,-0.81l-0.03,-0.7l-0.12,-0.23l-0.84,-0.61l-0.57,-3.76l2.21,-1.26l19.67,9.88l0.12,9.74l-1.83,-0.15l-0.28,0.14l-1.14,1.89l-0.68,1.62l0.05,0.31l0.33,0.38l-0.61,0.58l-0.08,0.3l0.25,0.93l-0.58,0.95l-0.29,1.01l0.34,0.37l0.67,-0.11l0.39,0.73l0.03,1.4l0.11,0.23l0.8,0.65l-0.01,0.24l-1.38,0.37l-0.11,0.06l-1.27,1.03l-1.83,2.76l-2.21,1.1l-2.34,-0.15l-0.82,0.25l-0.2,0.37l0.19,0.68l-1.16,0.79l-1.01,0.94l-2.92,0.89l-0.5,-0.46l-0.17,-0.08l-0.41,-0.05l-0.28,0.12l-0.38,0.54l-1.36,0.12l0.1,-0.18l0.01,-0.27l-0.78,-1.72l-0.35,-1.03l-0.17,-0.18l-1.03,-0.41l-1.29,-1.28l0.36,-0.78l0.9,0.2l0.14,-0.0l0.67,-0.17l1.36,0.02l0.26,-0.45l-1.32,-2.22l0.09,-1.64l-0.17,-1.68l-0.04,-0.13l-0.93,-1.53Z" data-code="TD" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M457.99,226.38l-1.57,0.87l-1.25,-1.28l-0.13,-0.08l-3.85,-1.11l-1.04,-1.57l-0.09,-0.09l-1.98,-1.23l-0.27,-0.02l-0.93,0.39l-0.72,-1.2l-0.09,-1.07l-0.06,-0.16l-1.33,-1.75l0.83,-0.94l0.07,-0.24l-0.21,-1.64l0.31,-1.43l-0.17,-1.29l0.43,-2.26l-0.15,-1.33l-0.73,-2.18l0.99,-0.52l0.16,-0.21l0.22,-1.16l-0.22,-1.06l1.54,-0.95l0.81,-0.92l1.19,-0.78l0.14,-0.23l0.12,-1.76l2.57,0.84l0.16,0.01l0.99,-0.23l2.01,0.45l3.19,1.2l1.12,2.36l0.2,0.16l2.24,0.53l3.5,1.14l2.65,1.36l0.29,-0.01l1.22,-0.71l1.27,-1.32l0.07,-0.29l-0.55,-2.0l0.69,-1.19l1.7,-1.23l1.61,-0.35l3.2,0.54l0.78,1.14l0.24,0.13l0.85,0.01l0.84,0.47l2.35,0.31l0.42,0.63l-0.79,1.16l-0.04,0.26l0.35,1.08l-0.61,1.6l-0.0,0.2l0.73,2.16l0.0,24.24l-2.58,0.01l-0.3,0.29l-0.02,0.62l-19.55,-9.83l-0.28,0.01l-2.53,1.44Z" data-code="LY" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M550.59,223.8l0.12,0.08l1.92,-0.41l3.54,0.15l0.23,-0.09l1.71,-1.79l1.86,-1.7l1.31,-1.36l0.26,0.5l0.28,1.72l-0.93,0.01l-0.3,0.26l-0.21,1.73l0.11,0.27l0.08,0.06l-0.7,0.32l-0.17,0.27l-0.01,0.99l-0.68,1.02l-0.05,0.15l-0.06,0.96l-0.32,0.36l-7.19,-1.27l-0.79,-2.22Z" data-code="AE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M240.66,256.5l0.65,0.91l-0.03,1.13l-1.05,1.39l-0.03,0.31l0.95,2.0l0.32,0.17l1.08,-0.16l0.24,-0.21l0.56,-1.83l-0.06,-0.29l-0.71,-0.81l-0.1,-1.58l2.9,-0.96l0.19,-0.37l-0.29,-1.02l0.45,-0.41l0.72,1.43l0.26,0.16l1.65,0.04l1.46,1.27l0.08,0.72l0.3,0.27l2.28,0.02l2.55,-0.25l1.34,1.06l0.14,0.06l1.92,0.31l0.2,-0.03l1.4,-0.79l0.15,-0.25l0.02,-0.36l2.82,-0.14l1.17,-0.01l-0.41,0.14l-0.14,0.46l0.86,1.19l0.22,0.12l1.93,0.18l1.73,1.13l0.37,1.9l0.31,0.24l1.21,-0.05l0.52,0.32l-1.63,1.21l-0.11,0.17l-0.22,0.92l0.07,0.27l0.63,0.69l-0.31,0.24l-1.48,0.39l-0.22,0.3l0.04,1.03l-0.59,0.6l-0.01,0.41l1.67,1.87l0.23,0.48l-0.72,0.76l-2.71,0.91l-1.78,0.39l-0.13,0.06l-0.6,0.49l-1.84,-0.58l-1.89,-0.33l-0.18,0.03l-0.47,0.23l-0.02,0.53l0.96,0.56l-0.08,1.58l0.35,1.58l0.26,0.23l1.91,0.19l0.02,0.07l-1.54,0.62l-0.18,0.2l-0.25,0.92l-0.88,0.35l-1.85,0.58l-0.16,0.13l-0.4,0.64l-1.66,0.14l-1.22,-1.18l-0.79,-2.52l-0.67,-0.88l-0.66,-0.43l0.99,-0.98l0.09,-0.26l-0.09,-0.56l-0.08,-0.16l-0.66,-0.69l-0.47,-1.54l0.18,-1.67l0.55,-0.85l0.45,-1.35l-0.15,-0.36l-0.89,-0.43l-0.19,-0.02l-1.39,0.28l-1.76,-0.13l-0.92,0.23l-1.64,-2.01l-0.17,-0.1l-1.54,-0.33l-3.05,0.23l-0.5,-0.73l-0.15,-0.12l-0.45,-0.15l-0.05,-0.28l0.28,-0.86l0.01,-0.15l-0.2,-1.01l-0.08,-0.15l-0.5,-0.5l-0.3,-1.08l-0.25,-0.22l-0.89,-0.12l0.54,-1.18l0.29,-1.73l0.66,-0.85l0.94,-0.7l0.09,-0.11l0.3,-0.6Z" data-code="VE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M574.42,192.1l2.24,0.95l0.18,0.02l1.89,-0.38l0.22,-0.18l0.46,-1.14l1.82,-0.4l1.5,-0.91l0.14,-0.19l0.46,-2.12l1.93,-0.51l0.2,-0.18l0.26,-0.68l0.87,0.57l0.13,0.05l0.79,0.09l1.35,0.02l1.83,0.59l0.75,0.34l0.26,-0.01l1.66,-0.85l0.7,0.46l0.42,-0.09l0.72,-1.17l1.32,0.05l0.23,-0.1l0.39,-0.43l0.07,-0.14l0.24,-1.08l0.86,-0.81l0.94,0.46l-0.2,0.64l0.23,0.38l0.49,0.09l-0.21,2.15l0.09,0.25l0.99,0.94l0.38,0.03l0.83,-0.57l1.06,-0.27l0.12,-0.06l1.46,-1.21l1.63,0.2l2.4,0.0l0.17,0.32l-1.12,0.25l-1.23,0.52l-2.86,0.33l-2.69,0.6l-0.13,0.06l-1.46,1.25l-0.07,0.36l0.58,1.18l0.25,1.21l-1.13,1.08l-0.09,0.25l0.09,0.98l-0.53,0.79l-2.22,-0.08l-0.28,0.44l0.83,1.57l-1.3,0.58l-0.13,0.11l-1.06,1.69l-0.05,0.18l0.13,1.51l-0.73,0.58l-0.78,-0.22l-0.14,-0.01l-1.91,0.36l-0.23,0.19l-0.2,0.57l-1.65,-0.0l-0.22,0.1l-1.4,1.56l-0.08,0.19l-0.08,2.13l-2.99,1.05l-1.67,-0.23l-0.27,0.1l-0.39,0.46l-1.43,-0.31l-2.43,0.4l-3.69,-1.23l1.96,-2.15l0.08,-0.24l-0.21,-1.78l-0.23,-0.26l-1.69,-0.42l-0.19,-1.62l-0.77,-2.08l0.98,-1.41l-0.14,-0.45l-0.82,-0.31l0.6,-1.79l0.93,-3.21Z" data-code="AF" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M534.42,190.89l0.13,0.14l1.5,0.78l0.15,1.34l-1.13,0.87l-0.11,0.16l-0.58,2.2l0.04,0.24l1.73,2.67l0.12,0.1l2.99,1.49l1.18,1.94l-0.39,1.89l0.29,0.36l0.5,-0.0l0.02,1.17l0.08,0.2l0.83,0.86l-2.36,-0.29l-0.29,0.13l-1.74,2.49l-4.4,-0.21l-7.03,-5.49l-3.73,-1.94l-2.92,-0.74l-0.89,-3.0l5.33,-2.81l0.15,-0.19l0.95,-3.43l-0.2,-2.0l1.19,-0.61l0.11,-0.09l1.23,-1.73l0.92,-0.38l2.75,0.35l0.81,0.68l0.31,0.05l0.94,-0.38l1.5,3.17Z" data-code="IQ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M384.26,87.96l-0.51,2.35l0.08,0.28l2.61,2.58l-2.99,2.83l-7.16,2.72l-2.08,0.7l-9.51,-1.71l1.89,-1.36l-0.07,-0.53l-4.4,-1.59l3.33,-0.59l0.25,-0.32l-0.11,-1.2l-0.25,-0.27l-4.82,-0.88l1.38,-2.2l3.54,-0.57l3.8,2.74l0.33,0.01l3.68,-2.18l3.02,1.12l0.25,-0.02l4.01,-2.18l3.72,0.27Z" data-code="IS" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M556.2,187.5l2.05,-0.52l0.13,-0.07l1.69,-1.57l1.55,0.08l0.15,-0.03l1.02,-0.5l1.64,0.25l2.82,1.48l1.91,0.3l2.8,2.49l0.18,0.08l1.61,0.09l0.19,2.09l-1.0,3.47l-0.69,2.04l0.18,0.38l0.73,0.28l-0.85,1.22l-0.04,0.28l0.81,2.19l0.19,1.72l0.23,0.26l1.69,0.42l0.17,1.43l-2.18,2.39l-0.01,0.4l1.22,1.42l1.0,1.62l0.12,0.11l2.23,1.11l0.06,2.2l0.2,0.27l1.03,0.38l0.14,0.83l-3.38,1.3l-0.18,0.19l-0.87,2.85l-4.44,-0.76l-2.75,-0.62l-2.64,-0.32l-1.01,-3.11l-0.17,-0.19l-1.2,-0.48l-0.18,-0.01l-1.99,0.51l-2.42,1.25l-2.89,-0.84l-2.48,-2.03l-2.41,-0.79l-1.61,-2.47l-1.84,-3.63l-0.36,-0.15l-1.22,0.4l-1.48,-0.84l-0.37,0.06l-0.72,0.82l-1.08,-1.12l-0.02,-1.35l-0.3,-0.29l-0.43,0.0l0.34,-1.64l-0.04,-0.22l-1.29,-2.11l-0.12,-0.11l-3.0,-1.49l-1.62,-2.49l0.52,-1.98l1.18,-0.92l0.11,-0.27l-0.19,-1.66l-0.16,-0.23l-1.55,-0.81l-1.58,-3.33l-1.3,-2.2l0.41,-0.75l0.03,-0.21l-0.73,-3.12l1.2,-0.59l0.35,0.9l1.26,1.35l0.15,0.09l1.81,0.39l0.91,-0.09l0.15,-0.06l2.9,-2.13l0.7,-0.16l0.48,0.56l-0.75,1.26l0.05,0.37l1.56,1.53l0.28,0.08l0.37,-0.09l0.7,1.89l0.21,0.19l2.31,0.59l1.69,1.4l0.15,0.07l3.66,0.49l3.91,-0.76l0.23,-0.19l0.19,-0.52Z" data-code="IR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M530.51,176.08l2.91,-0.39l0.41,0.63l0.11,0.1l0.66,0.36l-0.32,0.47l0.07,0.41l1.1,0.84l-0.53,0.7l0.06,0.42l1.06,0.8l1.01,0.44l0.04,1.56l-0.44,0.04l-0.88,-1.46l0.01,-0.37l-0.3,-0.31l-0.98,0.01l-0.65,-0.69l-0.26,-0.09l-0.38,0.06l-0.97,-0.82l-1.64,-0.65l0.2,-1.2l-0.02,-0.16l-0.28,-0.69Z" data-code="AM" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M451.68,158.58l0.2,0.16l3.3,0.75l-0.22,1.26l0.02,0.18l0.35,0.78l-1.4,-0.32l-0.21,0.03l-2.04,1.1l-0.16,0.29l0.13,1.47l-0.29,0.82l0.02,0.24l0.82,1.57l0.1,0.11l2.28,1.5l1.29,2.53l2.79,2.43l0.2,0.07l1.83,-0.02l0.31,0.34l-0.46,0.39l0.06,0.5l4.06,1.97l2.06,1.49l0.17,0.36l-0.24,0.53l-1.08,-1.07l-0.15,-0.08l-2.18,-0.49l-0.33,0.15l-1.05,1.91l0.11,0.4l1.63,0.98l-0.22,1.12l-0.84,0.14l-0.22,0.15l-1.27,2.38l-0.54,0.12l0.01,-0.47l0.48,-1.46l0.5,-0.58l0.03,-0.35l-0.97,-1.69l-0.76,-1.48l-0.17,-0.15l-0.94,-0.33l-0.68,-1.18l-0.16,-0.13l-1.53,-0.52l-1.03,-1.14l-0.19,-0.1l-1.78,-0.19l-1.88,-1.3l-2.27,-1.94l-1.64,-1.68l-0.76,-2.94l-0.21,-0.21l-1.22,-0.35l-2.01,-1.0l-0.24,-0.01l-1.15,0.42l-0.11,0.07l-1.38,1.36l-0.5,0.11l0.19,-0.87l-0.21,-0.35l-1.19,-0.34l-0.56,-2.06l0.76,-0.82l0.03,-0.36l-0.68,-1.08l0.04,-0.31l0.68,0.42l0.19,0.04l1.21,-0.15l0.14,-0.06l1.18,-0.89l0.25,0.29l0.25,0.1l1.19,-0.1l0.25,-0.18l0.45,-1.04l1.61,0.34l0.19,-0.02l1.1,-0.53l0.17,-0.22l0.15,-0.95l1.19,0.35l0.35,-0.16l0.23,-0.47l2.11,-0.47l0.45,0.89ZM459.35,184.63l-0.71,1.81l0.0,0.23l0.33,0.79l-0.37,1.03l-1.6,-0.91l-1.33,-0.34l-3.24,-1.36l0.23,-0.99l2.73,0.24l3.95,-0.5ZM443.95,175.91l1.26,1.77l-0.31,3.47l-0.82,-0.13l-0.26,0.08l-0.83,0.79l-0.64,-0.52l-0.1,-3.42l-0.44,-1.34l0.91,0.1l0.21,-0.06l1.01,-0.74Z" data-code="IT" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M690.8,230.21l-2.86,1.93l-2.09,2.46l-0.06,0.11l-0.55,1.8l0.04,0.26l4.26,6.1l2.31,1.63l1.46,1.97l1.12,4.62l-0.32,4.3l-1.97,1.57l-2.85,1.62l-2.09,2.14l-2.83,2.13l-0.67,-1.19l0.65,-1.58l-0.09,-0.35l-1.47,-1.14l1.67,-0.79l2.57,-0.18l0.22,-0.47l-0.89,-1.24l3.88,-1.8l0.17,-0.24l0.31,-3.05l-0.01,-0.13l-0.56,-1.63l0.44,-2.48l-0.01,-0.15l-0.63,-1.81l-0.08,-0.12l-1.87,-1.77l-3.64,-5.3l-0.11,-0.1l-2.68,-1.39l0.45,-0.59l1.53,-0.65l0.16,-0.39l-0.97,-2.27l-0.27,-0.18l-2.89,-0.02l-1.04,-2.21l-1.28,-1.83l0.96,-0.46l1.97,0.01l2.43,-0.3l0.13,-0.05l1.95,-1.29l1.04,0.85l0.13,0.06l1.98,0.42l-0.32,1.21l0.09,0.3l1.19,1.07l0.12,0.07l1.88,0.51Z" data-code="VN" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M258.11,341.34l1.4,1.81l0.51,-0.06l0.89,-1.94l2.51,0.1l0.36,0.49l4.6,4.31l0.15,0.08l1.99,0.39l3.01,1.93l2.5,1.01l0.28,0.91l-2.4,3.97l0.17,0.44l2.57,0.74l2.81,0.41l2.09,-0.44l0.14,-0.07l2.27,-2.06l0.09,-0.17l0.38,-2.2l0.88,-0.36l1.05,1.29l-0.04,1.88l-1.98,1.4l-1.72,1.13l-2.84,2.65l-3.34,3.73l-0.07,0.12l-0.63,2.22l-0.67,2.85l0.02,2.73l-0.47,0.54l-0.07,0.17l-0.36,3.28l0.12,0.27l3.03,2.32l-0.31,1.78l0.11,0.29l1.44,1.15l-0.11,1.17l-2.32,3.57l-3.59,1.51l-4.95,0.6l-2.72,-0.29l-0.32,0.38l0.5,1.67l-0.49,2.13l0.01,0.16l0.4,1.29l-1.27,0.88l-2.41,0.39l-2.33,-1.05l-0.31,0.04l-0.97,0.78l-0.11,0.27l0.35,2.98l0.16,0.23l1.69,0.91l0.31,-0.02l1.08,-0.75l0.46,0.96l-2.1,0.88l-2.01,1.89l-0.09,0.18l-0.36,3.05l-0.51,1.42l-2.16,0.01l-0.19,0.07l-1.96,1.59l-0.1,0.15l-0.72,2.34l0.08,0.31l2.46,2.31l0.13,0.07l2.09,0.56l-0.74,2.45l-2.86,1.75l-0.12,0.14l-1.59,3.71l-2.2,1.24l-0.1,0.09l-1.03,1.54l-0.04,0.23l0.81,3.45l0.06,0.13l1.13,1.32l-2.59,-0.57l-5.89,-0.44l-0.92,-1.73l0.05,-2.4l-0.34,-0.3l-1.49,0.19l-0.72,-0.98l-0.2,-3.21l1.79,-1.33l0.1,-0.13l0.79,-2.04l0.02,-0.16l-0.27,-1.52l1.31,-2.69l0.91,-4.15l-0.23,-1.72l0.91,-0.49l0.15,-0.33l-0.27,-1.16l-0.15,-0.2l-0.87,-0.46l0.65,-1.01l-0.04,-0.37l-1.06,-1.09l-0.54,-3.2l0.83,-0.51l0.14,-0.29l-0.42,-3.6l0.58,-2.98l0.64,-2.5l1.41,-1.0l0.12,-0.32l-0.75,-2.8l-0.01,-2.48l1.81,-1.78l0.09,-0.22l-0.06,-2.3l1.39,-2.69l0.03,-0.14l0.01,-2.58l-0.11,-0.24l-0.57,-0.45l-1.1,-4.59l1.49,-2.73l0.04,-0.17l-0.23,-2.59l0.86,-2.38l1.6,-2.48l1.74,-1.65l0.04,-0.39l-0.64,-0.89l0.42,-0.7l0.04,-0.16l-0.08,-4.26l2.55,-1.23l0.16,-0.18l0.86,-2.75l-0.01,-0.22l-0.22,-0.48l1.84,-2.1l3.0,0.59ZM256.77,438.98l-2.1,0.15l-1.18,-1.14l-0.19,-0.08l-1.53,-0.09l-2.38,-0.0l-0.0,-6.28l0.4,0.65l1.25,2.55l0.11,0.12l3.26,2.07l3.19,0.8l-0.82,1.26Z" data-code="AR" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M705.55,353.06l0.09,0.09l0.37,0.05l0.13,-0.35l-0.57,-1.69l0.48,0.3l0.71,0.99l0.34,0.11l0.2,-0.29l-0.04,-1.37l-0.04,-0.14l-1.22,-2.07l-0.28,-0.9l-0.51,-0.69l0.24,-1.33l0.52,-0.7l0.34,-1.32l0.01,-0.13l-0.25,-1.44l0.51,-0.94l0.1,1.03l0.23,0.26l0.32,-0.14l1.01,-1.72l1.94,-0.84l1.27,-1.14l1.84,-0.92l1.0,-0.18l0.6,0.28l0.26,-0.0l1.94,-0.96l1.48,-0.28l0.19,-0.13l0.32,-0.49l0.51,-0.18l1.42,0.05l2.63,-0.76l0.11,-0.06l1.36,-1.15l0.08,-0.1l0.61,-1.33l1.42,-1.27l0.1,-0.19l0.11,-1.03l0.06,-1.32l1.39,-1.74l0.85,1.79l0.4,0.14l1.07,-0.51l0.11,-0.45l-0.77,-1.05l0.53,-0.84l0.86,0.43l0.43,-0.22l0.29,-1.85l1.29,-1.19l0.6,-0.98l1.16,-0.4l0.2,-0.27l0.02,-0.34l0.74,0.2l0.38,-0.27l0.03,-0.44l1.98,-0.61l1.7,1.08l1.36,1.48l0.22,0.1l1.55,0.02l1.57,0.24l0.33,-0.4l-0.48,-1.27l1.09,-1.86l1.06,-0.63l0.1,-0.42l-0.28,-0.46l0.93,-1.24l1.36,-0.8l1.16,0.27l0.14,0.0l2.1,-0.48l0.23,-0.3l-0.05,-1.3l-0.18,-0.26l-1.08,-0.49l0.44,-0.12l1.52,0.58l1.39,1.06l2.11,0.65l0.19,-0.0l0.59,-0.21l1.44,0.72l0.27,0.0l1.37,-0.68l0.84,0.2l0.26,-0.06l0.37,-0.3l0.82,0.89l-0.56,1.14l-0.84,0.91l-0.75,0.07l-0.26,0.38l0.26,0.9l-0.67,1.15l-0.88,1.24l-0.05,0.25l0.18,0.72l0.12,0.17l1.99,1.42l1.96,0.84l1.25,0.86l1.8,1.51l0.19,0.07l0.63,-0.0l1.15,0.58l0.34,0.7l0.17,0.15l2.39,0.88l0.24,-0.02l1.65,-0.88l0.14,-0.16l0.49,-1.37l0.52,-1.19l0.31,-1.39l0.75,-2.02l0.01,-0.19l-0.33,-1.16l0.16,-0.67l0.0,-0.13l-0.28,-1.41l0.3,-1.78l0.42,-0.45l0.05,-0.33l-0.33,-0.73l0.56,-1.25l0.48,-1.39l0.07,-0.69l0.58,-0.59l0.48,0.84l0.17,1.53l0.17,0.24l0.47,0.23l0.09,0.9l0.05,0.14l0.87,1.23l0.17,1.33l-0.09,0.89l0.03,0.15l0.9,2.0l0.43,0.13l1.38,-0.83l0.71,0.92l1.06,0.88l-0.22,0.96l0.0,0.14l0.53,2.2l0.38,1.3l0.15,0.18l0.52,0."""),
format.raw("""26l0.62,2.01l-0.23,1.27l0.02,0.18l0.81,1.76l0.14,0.14l2.69,1.35l3.21,2.21l-0.2,0.4l0.04,0.34l1.39,1.6l0.95,2.78l0.43,0.16l0.79,-0.46l0.85,0.96l0.39,0.05l0.22,-0.15l0.36,2.33l0.09,0.18l1.78,1.63l1.16,1.01l1.9,2.1l0.67,2.05l0.06,1.47l-0.17,1.64l0.03,0.17l1.16,2.22l-0.14,2.28l-0.43,1.24l-0.68,2.44l0.04,1.63l-0.48,1.92l-1.06,2.43l-1.79,1.32l-0.1,0.12l-0.91,2.15l-0.82,1.37l-0.76,2.47l-0.98,1.46l-0.63,2.14l-0.33,2.02l0.1,0.82l-1.21,0.85l-2.71,0.1l-0.13,0.03l-2.31,1.19l-1.21,1.17l-1.34,1.11l-1.89,-1.18l-1.33,-0.46l0.32,-1.24l-0.4,-0.35l-1.46,0.61l-2.06,1.98l-1.99,-0.73l-1.43,-0.46l-1.45,-0.22l-2.32,-0.81l-1.51,-1.67l-0.45,-2.11l-0.6,-1.5l-0.07,-0.11l-1.23,-1.16l-0.16,-0.08l-1.96,-0.28l0.59,-0.99l0.03,-0.24l-0.61,-2.1l-0.54,-0.08l-1.16,1.85l-1.23,0.29l0.73,-0.88l0.06,-0.12l0.37,-1.57l0.93,-1.33l0.05,-0.2l-0.2,-2.07l-0.53,-0.17l-2.01,2.35l-1.52,0.94l-0.12,0.14l-0.82,1.93l-1.5,-0.9l0.07,-1.32l-0.06,-0.2l-1.57,-2.04l-1.15,-0.92l0.3,-0.41l-0.1,-0.44l-3.21,-1.69l-0.13,-0.03l-1.69,-0.08l-2.35,-1.31l-0.16,-0.04l-4.55,0.27l-3.24,0.99l-2.8,0.91l-2.33,-0.18l-0.17,0.03l-2.63,1.41l-2.14,0.64l-0.2,0.19l-0.47,1.42l-0.8,0.99l-1.99,0.06l-1.55,0.24l-2.27,-0.5l-1.79,0.3l-1.71,0.13l-0.19,0.09l-1.38,1.39l-0.58,-0.1l-0.21,0.04l-1.26,0.8l-1.13,0.85l-1.72,-0.1l-1.6,-0.0l-2.58,-1.76l-1.21,-0.49l0.04,-1.19l1.04,-0.32l0.16,-0.12l0.42,-0.64l0.05,-0.19l-0.09,-0.97l0.3,-2.0l-0.28,-1.64l-1.34,-2.84l-0.39,-1.49l0.1,-1.51l-0.04,-0.17l-0.96,-1.72l-0.06,-0.73l-0.09,-0.19l-1.04,-1.01l-0.3,-2.02l-0.05,-0.12l-1.23,-1.83ZM784.95,393.35l2.39,1.01l0.2,0.01l3.26,-0.96l1.19,0.16l0.16,3.19l-0.78,0.95l-0.07,0.16l-0.19,1.83l-0.43,-0.41l-0.44,0.03l-1.61,1.96l-0.4,-0.12l-1.38,-0.09l-1.43,-2.42l-0.37,-2.03l-1.4,-2.53l0.04,-0.94l1.27,0.2Z" data-code="AU" fill="#4d7686" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M509.04,199.22l0.71,0.0l0.27,-0.17l0.15,-0.33l0.19,-0.01l0.02,0.73l-0.27,0.34l0.02,0.08l-0.32,0.62l-0.65,-0.27l-0.41,0.19l-0.52,1.85l0.16,0.35l0.14,0.07l-0.17,0.1l-0.14,0.21l-0.11,0.73l0.39,0.33l0.81,-0.26l0.03,0.64l-0.97,3.43l-1.28,-3.67l0.62,-0.78l-0.03,-0.41l0.58,-1.16l0.5,-2.07l0.27,-0.54Z" data-code="IL" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M615.84,192.58l2.4,2.97l-0.24,2.17l0.05,0.2l0.94,1.35l-0.06,0.97l-1.46,-0.3l-0.35,0.36l0.7,3.06l0.12,0.18l2.46,1.75l3.11,1.72l-1.23,0.96l-0.1,0.13l-0.97,2.55l0.16,0.38l2.41,1.02l2.37,1.33l3.27,1.52l3.43,0.37l1.37,1.3l0.17,0.08l1.92,0.25l3.0,0.62l2.15,-0.04l0.28,-0.22l0.29,-1.06l0.0,-0.13l-0.32,-1.66l0.16,-0.94l1.0,-0.37l0.23,2.28l0.18,0.24l2.28,1.02l0.2,0.02l1.52,-0.41l2.06,0.18l2.08,-0.08l0.29,-0.27l0.18,-1.66l-0.1,-0.26l-0.53,-0.44l1.38,-0.23l0.15,-0.07l2.26,-2.0l2.75,-1.65l1.97,0.63l0.25,-0.03l1.54,-0.99l0.89,1.28l-0.72,0.97l0.2,0.48l2.49,0.37l0.11,0.61l-0.69,0.39l-0.15,0.3l0.15,1.22l-1.36,-0.37l-0.23,0.03l-3.24,1.86l-0.15,0.28l0.07,1.44l-1.33,2.16l-0.04,0.13l-0.12,1.24l-0.98,1.91l-1.72,-0.53l-0.39,0.28l-0.09,2.66l-0.52,0.83l-0.04,0.23l0.21,0.89l-0.71,0.36l-1.21,-3.85l-0.29,-0.21l-0.69,0.01l-0.29,0.23l-0.28,1.17l-0.84,-0.84l0.6,-1.17l0.97,-0.13l0.23,-0.16l1.15,-2.25l-0.18,-0.42l-1.54,-0.47l-2.3,0.04l-2.13,-0.33l-0.19,-1.63l-0.26,-0.26l-1.13,-0.13l-1.93,-1.13l-0.42,0.13l-0.88,1.82l0.08,0.37l1.47,1.15l-1.21,0.77l-0.1,0.1l-0.56,0.97l0.13,0.42l1.31,0.61l-0.36,1.35l0.01,0.2l0.85,1.95l0.37,2.05l-0.26,0.68l-1.55,-0.02l-3.09,0.54l-0.25,0.32l0.13,1.84l-1.21,1.4l-3.64,1.79l-2.79,3.04l-1.86,1.61l-2.48,1.68l-0.13,0.25l-0.0,1.0l-1.07,0.55l-2.21,0.9l-1.13,0.13l-0.25,0.19l-0.75,1.96l-0.02,0.15l0.52,3.31l0.13,2.03l-1.03,2.35l-0.03,0.12l-0.01,4.03l-1.02,0.1l-0.23,0.15l-1.14,1.93l0.04,0.36l0.44,0.48l-1.83,0.57l-0.18,0.15l-0.81,1.65l-0.74,0.53l-2.14,-2.12l-1.14,-3.47l-0.96,-2.57l-0.9,-1.26l-1.3,-2.38l-0.61,-3.14l-0.44,-1.62l-2.29,-3.56l-1.03,-4.94l-0.74,-3.29l0.01,-3.12l-0.49,-2.51l-0.41,-0.22l-3.56,1.53l-1.59,-0.28l-2.96,-2.87l0.94,-0.74l0.06,-0.41l-0.74,-1.03l-2.73,-2.1l1.35,-1.43l5.38,0.01l0.29,-0.36l-0.5,-2.29l-0.09,-0.15l-1.33,-1.28l-0.27,-1.96l-0.12,-0.2l-1.36,-1.0l2.42,-2.48l2.77,0.2l0.24,-0.1l2.62,-2.85l1.59,-2.8l2.41,-2.74l0.07,-0.2l-0.04,-1.82l2.01,-1.51l-0.01,-0.49l-1.95,-1.33l-0.83,-1.81l-0.82,-2.27l0.98,-0.97l3.64,0.66l2.89,-0.42l0.17,-0.08l2.18,-2.15Z" data-code="IN" fill="#537b8b" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M505.77,287.58l0.36,0.23l8.95,5.03l0.15,1.3l0.13,0.21l3.4,2.37l-1.07,2.88l-0.02,0.14l0.15,1.42l0.15,0.23l1.47,0.84l0.05,0.42l-0.66,1.44l-0.02,0.18l0.13,0.72l-0.16,1.16l0.03,0.19l0.87,1.57l1.03,2.48l0.12,0.14l0.53,0.32l-1.59,1.18l-2.64,0.95l-1.45,-0.04l-0.2,0.07l-0.81,0.69l-1.64,0.06l-0.68,0.3l-2.9,-0.69l-1.71,0.17l-0.65,-3.18l-0.05,-0.12l-1.35,-1.88l-0.19,-0.12l-2.41,-0.46l-1.38,-0.74l-1.63,-0.44l-0.96,-0.41l-0.95,-0.58l-1.31,-3.09l-1.47,-1.46l-0.45,-1.31l0.24,-1.34l-0.39,-1.99l0.71,-0.08l0.18,-0.09l0.91,-0.91l0.98,-1.31l0.59,-0.5l0.11,-0.24l-0.02,-0.81l-0.08,-0.2l-0.47,-0.5l-0.1,-0.67l0.51,-0.23l0.18,-0.25l0.14,-1.47l-0.05,-0.2l-0.76,-1.09l0.45,-0.15l2.71,0.03l5.01,-0.19Z" data-code="TZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M539.36,175.66l0.16,0.09l1.11,0.2l0.32,-0.15l0.4,-0.71l1.22,-0.99l1.11,1.33l1.26,2.09l0.22,0.14l1.06,0.13l0.28,0.29l-1.46,0.17l-0.26,0.24l-0.43,2.26l-0.39,0.92l-0.85,0.63l-0.12,0.25l0.06,1.2l-0.22,0.05l-1.28,-1.25l0.74,-1.25l-0.03,-0.35l-0.74,-0.86l-0.3,-0.1l-1.05,0.27l-2.49,1.82l-0.04,-1.46l-0.18,-0.27l-1.09,-0.47l-0.8,-0.6l0.53,-0.7l-0.06,-0.42l-1.11,-0.84l0.34,-0.51l-0.11,-0.43l-0.89,-0.48l-0.33,-0.49l0.25,-0.2l1.78,0.81l1.35,0.18l0.25,-0.09l0.34,-0.35l0.02,-0.39l-1.04,-1.36l0.28,-0.18l0.49,0.07l1.65,1.74ZM533.53,180.16l0.63,0.67l0.22,0.09l0.8,-0.0l0.04,0.31l0.66,1.09l-0.94,-0.21l-1.16,-1.24l-0.25,-0.71Z" data-code="AZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M405.17,135.35l0.36,2.16l-1.78,2.84l-4.28,1.91l-3.02,-0.43l1.81,-3.13l0.02,-0.26l-1.23,-3.26l3.24,-2.56l1.54,-1.32l0.37,1.33l-0.49,1.77l0.3,0.38l1.49,-0.05l1.68,0.63Z" data-code="IE" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M756.56,287.86l0.69,4.02l0.15,0.21l2.59,1.5l0.39,-0.07l2.05,-2.61l2.75,-1.45l2.09,-0.0l2.08,0.85l1.85,0.89l2.52,0.46l0.08,15.44l-1.72,-1.6l-0.15,-0.07l-2.54,-0.51l-0.29,0.1l-0.53,0.62l-2.53,0.06l0.78,-1.51l1.48,-0.66l0.17,-0.34l-0.65,-2.74l-1.23,-2.19l-0.14,-0.13l-4.85,-2.13l-2.09,-0.23l-3.7,-2.28l-0.41,0.1l-0.67,1.11l-0.63,0.14l-0.41,-0.67l-0.01,-1.01l-0.14,-0.25l-1.39,-0.89l2.05,-0.69l1.73,0.05l0.29,-0.39l-0.21,-0.66l-0.29,-0.21l-3.5,-0.0l-0.9,-1.36l-0.19,-0.13l-2.14,-0.44l-0.65,-0.76l2.86,-0.51l1.28,-0.79l3.75,0.96l0.32,0.76ZM758.01,300.37l-0.79,1.04l-0.14,-1.07l0.4,-0.81l0.29,-0.47l0.24,0.31l-0.0,1.0ZM747.45,292.9l0.48,1.02l-1.45,-0.69l-2.09,-0.21l-1.45,0.16l-1.28,-0.07l0.35,-0.81l2.86,-0.1l2.58,0.68ZM741.15,285.69l-0.16,-0.25l-0.72,-3.08l0.47,-1.86l0.35,-0.38l0.1,0.73l0.25,0.26l1.28,0.19l0.18,0.78l-0.11,1.8l-0.96,-0.18l-0.35,0.22l-0.38,1.52l0.05,0.24ZM741.19,285.75l0.76,0.97l-0.11,0.05l-0.65,-1.02ZM739.18,293.52l-0.61,0.54l-1.44,-0.38l-0.25,-0.55l1.93,-0.09l0.36,0.48ZM728.4,295.87l-0.27,-0.07l-2.26,0.89l-0.37,-0.41l0.27,-0.8l-0.09,-0.33l-1.68,-1.37l0.17,-2.29l-0.42,-0.3l-1.67,0.76l-0.17,0.29l0.21,2.92l0.09,3.34l-1.22,0.28l-0.78,-0.54l0.65,-2.1l0.01,-0.14l-0.39,-2.42l-0.29,-0.25l-0.86,-0.02l-0.63,-1.4l0.99,-1.61l0.35,-1.97l1.24,-3.73l0.49,-0.96l1.95,-1.7l1.86,0.69l3.16,0.35l2.92,-0.1l0.17,-0.06l2.24,-1.65l0.11,0.14l-1.8,2.22l-1.72,0.44l-2.41,-0.48l-4.21,0.13l-2.19,0.36l-0.25,0.24l-0.36,1.9l0.08,0.27l2.24,2.23l0.4,0.02l1.29,-1.08l3.19,-0.58l-0.19,0.06l-1.04,1.4l-2.13,0.94l-0.12,0.45l2.26,3.06l-0.37,0.69l0.03,0.32l1.51,1.95ZM728.48,295.97l0.59,0.76l-0.02,1.37l-1.0,0.55l-0.64,-0.58l1.09,-1.84l-0.02,-0.26ZM728.64,286.95l0.79,-0.14l-0.07,0.39l-0.72,-0.24ZM732.38,310.1l-1.89,0.49l-0.06,-0.06l0.17,-0.64l1.0,-1.42l2.14,-0.87l0.1,0.2l0.04,0.58l-1.49,1.72ZM728.26,305.71l-0.17,0.63l-3.53,0.67l-3.02,-0.28l-0.0,-0.42l1.66,-0.44l1.47,0.71l0.16,0.03l1.75,-0.21l1.69,-0.69ZM722.98,310.33l-0.74,0.03l-2.52,-1.35l1.42,-0.3l1.19,0.7l0.72,0.63l-0.06,0.28ZM716.24,305.63l0.66,0.49l0.22,0.06l1.35,-0.18l0.31,0.53l-4.18,0.77l-0.8,-0.01l0.51,-0.86l1.2,-0.02l0.24,-0.12l0.49,-0.65ZM715.84,280.21l0.09,0.34l2.25,1.86l-2.25,0.22l-0.24,0.17l-0.84,1.71l-0.03,0.15l0.1,2.11l-2.27,1.62l-0.13,0.24l-0.06,2.46l-0.74,2.92l-0.02,-0.05l-0.39,-0.16l-2.62,1.04l-0.86,-1.33l-0.23,-0.14l-1.71,-0.14l-1.19,-0.76l-0.25,-0.03l-2.78,0.84l-0.79,-1.05l-0.26,-0.12l-1.61,0.13l-1.8,-0.25l-0.36,-3.13l-0.15,-0.23l-1.18,-0.65l-1.13,-2.02l-0.33,-2.1l0.27,-2.19l1.05,-1.17l0.28,1.12l0.1,0.16l1.71,1.41l0.28,0.05l1.55,-0.49l1.54,0.17l0.23,-0.07l1.4,-1.21l1.05,-0.19l2.3,0.68l0.16,0.0l2.04,-0.53l0.21,-0.19l1.26,-3.41l0.91,-0.82l0.09,-0.14l0.8,-2.64l2.63,0.0l1.71,0.33l-1.19,1.89l0.02,0.34l1.74,2.24l-0.37,1.0ZM692.67,302.0l0.26,0.19l4.8,0.25l0.28,-0.16l0.44,-0.83l4.29,1.12l0.85,1.52l0.23,0.15l3.71,0.45l2.37,1.15l-2.06,0.69l-2.77,-1.0l-2.25,0.07l-2.57,-0.18l-2.31,-0.45l-2.94,-0.97l-1.84,-0.25l-0.13,0.01l-0.97,0.29l-4.34,-0.98l-0.38,-0.94l-0.25,-0.19l-1.76,-0.14l1.31,-1.84l2.81,0.14l1.97,0.96l0.95,0.19l0.28,0.74ZM685.63,299.27l-2.36,0.04l-2.07,-2.05l-3.17,-2.02l-1.06,-1.5l-1.88,-2.02l-1.22,-1.85l-1.9,-3.49l-2.2,-2.11l-0.71,-2.08l-0.94,-1.99l-0.1,-0.12l-2.21,-1.54l-1.35,-2.17l-1.86,-1.39l-2.53,-2.68l-0.14,-0.81l1.22,0.08l3.76,0.47l2.16,2.4l1.94,1.7l1.37,1.04l2.35,2.67l0.22,0.1l2.44,0.04l1.99,1.62l1.42,2.06l0.09,0.09l1.67,1.0l-0.88,1.8l0.11,0.39l1.44,0.87l0.13,0.04l0.68,0.05l0.41,1.62l0.87,1.4l0.22,0.14l1.71,0.21l1.06,1.38l-0.61,3.04l-0.09,3.6Z" data-code="ID" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M500.54,141.42l0.9,0.13l0.27,-0.11l0.52,-0.62l0.68,0.13l2.43,-0.3l1.32,1.57l-0.45,0.48l-0.07,0.26l0.21,1.03l0.27,0.24l1.85,0.15l0.76,1.22l-0.05,0.55l0.2,0.31l3.18,1.15l0.18,0.01l1.75,-0.47l1.42,1.41l0.22,0.09l1.42,-0.03l3.44,0.99l0.02,0.65l-0.97,1.62l-0.03,0.24l0.52,1.67l-0.29,0.79l-2.24,0.22l-0.14,0.05l-1.29,0.89l-0.13,0.23l-0.07,1.16l-1.75,0.22l-0.12,0.04l-1.6,0.98l-2.27,0.16l-0.12,0.04l-2.16,1.17l-0.16,0.29l0.15,1.94l0.14,0.23l1.23,0.75l0.18,0.04l2.06,-0.15l-0.22,0.51l-2.67,0.54l-3.27,1.72l-1.0,-0.45l0.45,-1.19l-0.19,-0.39l-2.34,-0.78l0.15,-0.2l2.32,-1.0l0.09,-0.49l-0.73,-0.72l-0.15,-0.08l-3.69,-0.75l-0.14,-0.96l-0.35,-0.25l-2.32,0.39l-0.21,0.15l-0.91,1.7l-1.77,2.1l-0.93,-0.44l-0.24,-0.0l-1.05,0.45l-0.48,-0.25l0.13,-0.07l0.14,-0.15l0.43,-1.04l0.67,-0.97l0.04,-0.26l-0.1,-0.31l0.04,-0.02l0.11,0.19l0.24,0.15l1.48,0.09l0.78,-0.25l0.07,-0.53l-0.27,-0.19l0.09,-0.25l-0.08,-0.33l-0.81,-0.74l-0.34,-1.24l-0.14,-0.18l-0.73,-0.42l0.15,-0.87l-0.11,-0.29l-1.13,-0.86l-0.15,-0.06l-0.97,-0.11l-1.79,-0.97l-0.2,-0.03l-1.66,0.32l-0.13,0.06l-0.52,0.41l-0.95,-0.0l-0.23,0.11l-0.56,0.66l-1.74,0.29l-0.79,0.43l-1.01,-0.68l-0.16,-0.05l-1.57,-0.01l-1.52,-0.35l-0.23,0.04l-0.71,0.45l-0.09,-0.43l-0.13,-0.19l-1.18,-0.74l0.38,-1.02l0.53,-0.64l0.35,0.12l0.37,-0.41l-0.57,-1.29l2.1,-2.5l1.16,-0.36l0.2,-0.2l0.27,-0.92l-0.01,-0.2l-1.1,-2.52l0.79,-0.09l0.13,-0.05l1.3,-0.86l1.83,-0.07l2.48,0.26l2.84,0.8l1.91,0.06l0.88,0.45l0.29,-0.01l0.72,-0.44l0.49,0.58l0.25,0.11l2.2,-0.16l0.94,0.3l0.39,-0.26l0.15,-1.57l0.61,-0.59l2.01,-0.19Z" data-code="UA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M548.47,221.47l-0.15,-1.72l0.59,-1.23l0.38,-0.16l0.54,0.6l0.04,1.4l-0.47,1.37l-0.41,0.11l-0.53,-0.37Z" data-code="QA" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path><path d="M507.71,314.14l1.65,-0.18l2.96,0.7l0.2,-0.02l0.6,-0.29l1.68,-0.06l0.18,-0.07l0.8,-0.69l1.5,0.02l2.74,-0.98l1.74,-1.27l0.25,0.7l-0.1,2.47l0.31,2.27l0.1,3.97l0.42,1.24l-0.7,1.71l-0.94,1.73l-1.52,1.52l-5.06,2.21l-2.88,2.8l-1.01,0.51l-1.72,1.81l-0.99,0.58l-0.15,0.23l-0.21,1.86l0.04,0.19l1.17,1.95l0.47,1.47l0.03,0.74l0.39,0.28l0.05,-0.01l-0.06,2.13l-0.39,1.19l0.1,0.33l0.42,0.32l-0.28,0.83l-0.95,0.86l-2.03,0.88l-3.08,1.49l-1.1,0.99l-0.09,0.28l0.21,1.13l0.21,0.23l0.38,0.11l-0.14,0.89l-1.39,-0.02l-0.17,-0.94l-0.38,-1.23l-0.2,-0.89l0.44,-2.91l-0.01,-0.14l-0.65,-1.88l-1.15,-3.55l2.52,-2.85l0.68,-1.89l0.29,-0.18l0.14,-0.2l0.28,-1.53l-0.03,-0.19l-0.36,-0.7l0.1,-1.83l0.49,-1.84l-0.01,-3.26l-0.14,-0.25l-1.3,-0.83l-0.11,-0.04l-1.08,-0.17l-0.47,-0.55l-0.1,-0.08l-1.16,-0.54l-0.13,-0.03l-1.83,0.04l-0.32,-2.25l7.19,-1.99l1.32,1.12l0.29,0.06l0.55,-0.19l0.75,0.49l0.11,0.81l-0.49,1.11l-0.02,0.15l0.19,1.81l0.09,0.18l1.63,1.59l0.48,-0.1l0.72,-1.68l0.99,-0.49l0.17,-0.29l-0.21,-3.29l-0.04,-0.13l-1.11,-1.92l-0.9,-0.82l-0.21,-0.08l-0.62,0.03l-0.63,-2.98l0.61,-1.67Z" data-code="MZ" fill="#c4c4c4" fill-opacity="1" stroke="none" stroke-width="0" stroke-opacity="1" fill-rule="evenodd" class="jvectormap-region jvectormap-element"></path></g><g></g></svg><div class="jvectormap-zoomin"><i class="fa fa-plus"></i></div><div class="jvectormap-zoomout"><i class="fa fa-minus"></i></div></div></div>
                                <div id="heat-fill">
                                    <span class="fill-a">0</span>

                                    <span class="fill-b">5,000</span>
                                </div>

                                    <!-- table responsive -->
                                <div class="table-responsive no-margin">

                                    <table class="table table-striped table-hover table-condensed">
                                        <thead>
                                            <tr>
                                                <th>Country</th>
                                                <th>Visits</th>
                                                <th class="text-align-center">User Activity</th>
                                                <th class="text-align-center hidden-xs">Online</th>
                                                <th class="text-align-center">Demographic</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td><a href="javascript:void(0);">USA</a></td>
                                                <td>4,977</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-blue text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="50" height="22" style="display : inline-block ; width : 50 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs">143</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
                                                            </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                            <tr>
                                                <td><a href="javascript:void(0);">Australia</a></td>
                                                <td>4,873</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-blue text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="50" height="22" style="display : inline-block ; width : 50 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs">247</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
           """),
format.raw("""                                                 </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                            <tr>
                                                <td><a href="javascript:void(0);">India</a></td>
                                                <td>3,671</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-blue text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="50" height="22" style="display : inline-block ; width : 50 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs">373</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
                                                            </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                            <tr>
                                                <td><a href="javascript:void(0);">Brazil</a></td>
                                                <td>2,476</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-blue text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="54" height="22" style="display : inline-block ; width : 54 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs ">741</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
                                                            </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                            <tr>
                                                <td><a href="javascript:void(0);">Turkey</a></td>
                                                <td>1,476</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-blue text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="50" height="22" style="display : inline-block ; width : 50 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs">123</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
                                                            </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                            <tr>
                                                <td><a href="javascript:void(0);">Canada</a></td>
                                                <td>146</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline txt-color-orange text-align-center" data-sparkline-height="22px" data-sparkline-width="90px" data-sparkline-barwidth="2"><canvas width="50" height="22" style="display : inline-block ; width : 50 px ; height : 22 px ; vertical-align : top ;"></canvas></div></td>
                                                <td class="text-align-center hidden-xs">23</td>
                                                <td class="text-align-center">
                                                    <div class="sparkline display-inline" data-sparkline-type="pie" data-sparkline-piecolor="[&quot;#E979BB&quot;, &quot;#57889C&quot;]" data-sparkline-offset="90" data-sparkline-piesize="23px"><canvas width="23" height="23" style="display : inline-block ; width : 23 px ; height : 23 px ; vertical-align : top ;"></canvas></div>
                                                    <div class="btn-group display-inline pull-right text-align-left hidden-tablet">
                                                        <button class="btn btn-xs btn-default dropdown-toggle" data-toggle="dropdown">
                                                            <i class="fa fa-cog fa-lg"></i>
                                                        </button>
                                                        <ul class="dropdown-menu dropdown-menu-xs pull-right">
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-file fa-lg fa-fw txt-color-greenLight"></i> <u>
                                                                    P</u>DF</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);"><i class="fa fa-times fa-lg fa-fw txt-color-red"></i> <u>
                                                                    D</u>elete</a>
                                                            </li>
                                                            <li class="divider"></li>
                                                            <li class="text-align-center">
                                                                <a href="javascript:void(0);">Cancel</a>
                                                            </li>
                                                        </ul>
                                                    </div></td>
                                            </tr>
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <td colspan="5">
                                                    <ul class="pagination pagination-xs no-margin">
                                                        <li class="prev disabled">
                                                            <a href="javascript:void(0);">Previous</a>
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
                                                        <li class="next">
                                                            <a href="javascript:void(0);">Next</a>
                                                        </li>
                                                    </ul></td>
                                            </tr>
                                        </tfoot>
                                    </table>

                                </div>
                                    <!-- end table responsive-->

                                    <!-- end content -->

                            </div>

                        </div>
                            <!-- end widget div -->
                    </div>
                        <!-- end widget -->

                        <!-- new widget -->
                    <div class="jarviswidget jarviswidget-color-blue" id="wid-id-4" data-widget-editbutton="false" data-widget-colorbutton="false">

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
                            <span class="widget-icon"> <i class="fa fa-check txt-color-white"></i> </span>
                            <h2> ToDo's </h2>
                                <!-- <div class="widget-toolbar">
					add: non-hidden - to disable auto hide

					</div>-->
                        </header>

                            <!-- widget div-->
                        <div>
                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                <div>
                                    <label>Title:</label>
                                    <input type="text">
                                </div>
                            </div>
                                <!-- end widget edit box -->

                            <div class="widget-body no-padding smart-form">
                                    <!-- content goes here -->
                                <h5 class="todo-group-title"><i class="fa fa-warning"></i>
                                    Critical Tasks (<small class="num-of-tasks">1</small>)</h5>
                                <ul id="sortable1" class="todo ui-sortable">
                                    <li>
                                        <span class="handle"> <label class="checkbox">
                                            <input type="checkbox" name="checkbox-inline">
                                            <i></i> </label> </span>
                                        <p>
                                            <strong>Ticket #17643</strong>
                                            - Hotfix for WebApp interface issue [<a href="javascript:void(0);" class="font-xs">
                                            More Details</a>] <span class="text-muted">
                                            Sea deep blessed bearing under darkness from God air living isn't. </span>
                                            <span class="date">Jan 1, 2014</span>
                                        </p>
                                    </li>
                                </ul>
                                <h5 class="todo-group-title"><i class="fa fa-exclamation"></i>
                                    Important Tasks (<small class="num-of-tasks">3</small>)</h5>
                                <ul id="sortable2" class="todo ui-sortable">
                                    <li>
                                        <span class="handle"> <label class="checkbox">
                                            <input type="checkbox" name="checkbox-inline">
                                            <i></i> </label> </span>
                                        <p>
                                            <strong>Ticket #1347</strong> - Inbox email is being sent twice <small>
                                            (bug fix)</small> [<a href="javascript:void(0);" class="font-xs">
                                            More Details</a>] <span class="date">Nov 22, 2013</span>
                                        </p>
                                    </li>
                                    <li>
                                        <span class="handle"> <label class="checkbox">
                                            <input type="checkbox" name="checkbox-inline">
                                            <i></i> </label> </span>
                                        <p>
                                            <strong>Ticket #1314</strong>
                                            - Call customer support re: Issue <a href="javascript:void(0);" class="font-xs">
                                            #6134</a><small> (code review)</small>
                                            <span class="date">Nov 22, 2013</span>
                                        </p>
                                    </li>
                                    <li>
                                        <span class="handle"> <label class="checkbox">
                                            <input type="checkbox" name="checkbox-inline">
                                            <i></i> </label> </span>
                                        <p>
                                            <strong>Ticket #17643</strong>
                                            - Hotfix for WebApp interface issue [<a href="javascript:void(0);" class="font-xs">
                                            More Details</a>] <span class="text-muted">
                                            Sea deep blessed bearing under darkness from God air living isn't. </span>
                                            <span class="date">Jan 1, 2014</span>
                                        </p>
                             """),
format.raw("""       </li>
                                </ul>

                                <h5 class="todo-group-title"><i class="fa fa-check"></i>
                                    Completed Tasks (<small class="num-of-tasks">1</small>)</h5>
                                <ul id="sortable3" class="todo">
                                    <li class="complete">
                                        <span class="handle"> <label class="checkbox state-disabled" style="display : none">
                                            <input type="checkbox" name="checkbox-inline" checked="checked" disabled="disabled">
                                            <i></i> </label> </span>
                                        <p>
                                            <strong>Ticket #17643</strong>
                                            - Hotfix for WebApp interface issue [<a href="javascript:void(0);" class="font-xs">
                                            More Details</a>] <span class="text-muted">
                                            Sea deep blessed bearing under darkness from God air living isn't. </span>
                                            <span class="date">Jan 1, 2014</span>
                                        </p>
                                    </li>
                                </ul>

                                    <!-- end content -->
                            </div>

                        </div>
                            <!-- end widget div -->
                    </div>
                        <!-- end widget -->

                </article>

            </div>

                <!-- end row -->

        </section>
            <!-- end widget grid -->
    </div>
""")))}),format.raw/*1804.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/dashboard.scala.html
                  HASH: 50dfbbce6d6aa034923699ff2d167709328bbbc2
                  MATRIX: 514->1|602->24|617->31|697->35|732->44|1179->463|1208->464|1237->465|1282->482|1311->483|1965->1109|1994->1110|2031->1120|2108->1169|2137->1170|2173->1179|2529->1508|2558->1509|2587->1510|2780->1675|2809->1676|2845->1685|2959->1772|2988->1773|3017->1774|3179->1908|3208->1909|3244->1918|3376->2022|3405->2023|3441->2032|3782->2345|3811->2346|3847->2355|3940->2420|3969->2421|3998->2422|4027->2423|4124->2493|4153->2494|4182->2495|4221->2507|4250->2508|4279->2509|4312->2514|4341->2515|4377->2524|4440->2560|4469->2561|4506->2571|4535->2572|4564->2573|4649->2630|4678->2631|4715->2641|4789->2687|4818->2688|4854->2697|5002->2818|5031->2819|5060->2820|5100->2833|5129->2834|5166->2844|5422->3071|5452->3072|5489->3081|5614->3178|5644->3179|5682->3189|5740->3218|5770->3219|5807->3228|5936->3329|5966->3330|6004->3340|6065->3372|6095->3373|6133->3383|6445->3666|6475->3667|6512->3676|6671->3806|6701->3807|6738->3816|6988->4038|7018->4039|7056->4049|7272->4237|7302->4238|7340->4248|7506->4385|7536->4386|7574->4396|7668->4461|7698->4462|7735->4471|7843->4551|7873->4552|7911->4562|7941->4563|7971->4564|8049->4613|8079->4614|8116->4623|8153->4631|8183->4632|8220->4641|8283->4676|8313->4677|8360->4695|8390->4696|8427->4705|8490->4740|8520->4741|8610->4802|8640->4803|8677->4812|8714->4820|8744->4821|8781->4830|8866->4886|8896->4887|8933->4896|8972->4906|9002->4907|9039->4916|9089->4938|9119->4939|9150->4941|9180->4942|9217->4951|9265->4971|9295->4972|9325->4973|9363->4983|9393->4984|9454->5017|9484->5018|9521->5027|9551->5028|9588->5037|9618->5038|9648->5039|9870->5232|9900->5233|9937->5242|10003->5279|10033->5280|10070->5289|10172->5363|10202->5364|10232->5365|10266->5370|10296->5371|10333->5380|10426->5445|10456->5446|10493->5455|10523->5456|10553->5457|10615->5490|10645->5491|10682->5500|10730->5519|10760->5520|10797->5529|10946->5650|10976->5651|11006->5652|11040->5657|11070->5658|11107->5667|11176->5708|11206->5709|11244->5719|11274->5720|11312->5730|11455->5844|11485->5845|11522->5854|12153->6456|12183->6457|12220->6466|12308->6525|12338->6526|12375->6535|12481->6612|12511->6613|12548->6622|12587->6632|12617->6633|12654->6642|12704->6664|12734->6665|12765->6667|12795->6668|12832->6677|12883->6700|12913->6701|12943->6702|12981->6712|13011->6713|13048->6722|13078->6723|13126->6742|13156->6743|13193->6752|13241->6772|13271->6773|13308->6782|13338->6783|13369->6785|13399->6786|13436->6795|13526->6856|13556->6857|13593->6866|13699->6943|13729->6944|13766->6953|13805->6963|13835->6964|13872->6973|13922->6995|13952->6996|13983->6998|14013->6999|14050->7008|14101->7031|14131->7032|14161->7033|14199->7043|14229->7044|14266->7053|14296->7054|14344->7073|14374->7074|14411->7083|14459->7103|14489->7104|14526->7113|14556->7114|14586->7115|14642->7142|14672->7143|14709->7152|14745->7159|14775->7160|14812->7169|14865->7194|14895->7195|15014->7285|15044->7286|15081->7295|15199->7385|15229->7386|15276->7404|15306->7405|15343->7414|15689->7732|15719->7733|15766->7751|15796->7752|15834->7762|15864->7763|15901->7772|15931->7773|15961->7774|16068->7853|16098->7854|16128->7855|16270->7968|16300->7969|16338->7979|17691->9303|17721->9304|17758->9313|17848->9374|17878->9375|17915->9384|18034->9475|18064->9476|18101->9485|18131->9486|18162->9488|18192->9489|18229->9498|18347->9587|18377->9588|18414->9597|18485->9640|18515->9641|18563->9660|18593->9661|18630->9670|18678->9690|18708->9691|18745->9700|18775->9701|18806->9703|18836->9704|18873->9713|18994->9805|19024->9806|19061->9815|19132->9858|19162->9859|19210->9878|19240->9879|19277->9888|19325->9908|19355->9909|19392->9918|19422->9919|19452->9920|19506->9945|19536->9946|19573->9955|19609->9962|19639->9963|19676->9972|19729->9997|19759->9998|19836->10046|19866->10047|19903->10056|20021->10146|20051->10147|20098->10165|20128->10166|20165->10175|20215->10197|20245->10198|20292->10216|20322->10217|20359->10226|20427->10265|20457->10266|20494->10275|20549->10302|20579->10303|20636->10332|20666->10333|20704->10343|20734->10344|20764->10345|20849->10401|20879->10402|20916->10411|21015->10481|21045->10482|21082->10491|21147->10527|21177->10528|21214->10537|21314->10609|21344->10610|21381->10619|21411->10620|21441->10621|21502->10653|21532->10654|21569->10663|21611->10676|21641->10677|21678->10686|21761->10741|21791->10742|21821->10743|21855->10748|21885->10749|21922->10758|21998->10806|22028->10807|22065->10816|22095->10817|22133->10827|22163->10828|22193->10829|22290->10897|22320->10898|22357->10907|22407->10929|22437->10930|22467->10931|22528->10964|22558->10965|22588->10966|22629->10979|22659->10980|22697->10990|22785->11049|22815->11050|22852->11059|23044->11223|23074->11224|23104->11225|23388->11480|23418->11481|23455->11490|23598->11605|23628->11606|23666->11616|23724->11645|23754->11646|23791->11655|23852->11687|23882->11688|23919->11697|24027->11776|24057->11777|24094->11786|24133->11796|24163->11797|24200->11806|24253->11831|24283->11832|24330->11850|24360->11851|24397->11860|24452->11887|24482->11888|24519->11897|24549->11898|24597->11917|24627->11918|24664->11927|24704->11938|24734->11939|24771->11948|24910->12059|24940->12060|24970->12061|25008->12071|25038->12072|25122->12127|25152->12128|25189->12137|25266->12185|25296->12186|25333->12195|25392->12226|25422->12227|25452->12228|25486->12233|25516->12234|25553->12243|25693->12355|25723->12356|25760->12365|25790->12366|25827->12375|25857->12376|25887->12377|25927->12389|25957->12390|25995->12400|26268->12644|26298->12645|26336->12655|26397->12687|26427->12688|26464->12697|26686->12890|26716->12891|26754->12901|26964->13082|26994->13083|27031->13092|27195->13228|27225->13229|27306->13281|27336->13282|27373->13291|27463->13352|27493->13353|27530->13362|27598->13401|27628->13402|27665->13411|27782->13500|27812->13501|27893->13554|27923->13555|27960->13564|28035->13611|28065->13612|28115->13633|28145->13634|28182->13643|28404->13837|28434->13838|28465->13840|28495->13841|28532->13850|28745->14035|28775->14036|28806->14038|28836->14039|28873->14048|29104->14251|29134->14252|29165->14254|29195->14255|29232->14264|29463->14467|29493->14468|29524->14470|29554->14471|29591->14480|29766->14627|29796->14628|29827->14630|29857->14631|29894->14640|30109->14827|30139->14828|30170->14830|30200->14831|30237->14840|30470->15045|30500->15046|30531->15048|30561->15049|30598->15058|30791->15223|30821->15224|30851->15225|30940->15285|30970->15286|31007->15295|31069->15328|31099->15329|31136->15338|31294->15468|31324->15469|31361->15478|31416->15504|31446->15505|31483->15514|31634->15637|31664->15638|31701->15647|31731->15648|31768->15657|31798->15658|31828->15659|31869->15672|31899->15673|31929->15674|32067->15784|32097->15785|32135->15795|32246->15877|32276->15878|32313->15887|32408->15954|32438->15955|32468->15956|32592->16051|32622->16052|32659->16061|32754->16128|32784->16129|32814->16130|32940->16227|32970->16228|33007->16237|33103->16305|33133->16306|33163->16307|33264->16379|33294->16380|33331->16389|33426->16456|33456->16457|33486->16458|33593->16536|33623->16537|33660->16546|33760->16618|33790->16619|33820->16620|33926->16697|33956->16698|33993->16707|34092->16778|34122->16779|34152->16780|34691->17290|34721->17291|34758->17300|34898->17412|34928->17413|34958->17414|35027->17454|35057->17455|35087->17456|35268->17608|35298->17609|35335->17618|35420->17674|35450->17675|35487->17684|35838->18007|35868->18008|35898->18009|35932->18014|35962->18015|35999->18024|36076->18073|36106->18074|36143->18083|36194->18106|36224->18107|36254->18108|36306->18131|36336->18132|36373->18141|36492->18232|36522->18233|36552->18234|36593->18247|36623->18248|36661->18258|36812->18380|36842->18381|36879->18390|36980->18463|37010->18464|37040->18465|37100->18496|37130->18497|37167->18506|37243->18554|37273->18555|37320->18574|37350->18575|37380->18576|37539->18|37572->18696|37601->18698|37632->18719|37673->18721|37706->18726|74145->55116|74162->55122|74220->55156|74698->55605|74715->55611|74776->55648|75202->56045|75219->56051|75280->56088|75704->56483|75721->56489|75782->56526|76166->56881|76183->56887|76244->56924|76621->57272|76638->57278|76699->57315|77115->57702|77132->57708|77194->57746|77609->58132|77626->58138|77687->58175|79117->59576|79134->59582|79191->59616|81252->61648|81269->61654|81331->61692|303327->283436
                  LINES: 19->1|21->2|21->2|23->2|24->3|36->15|36->15|36->15|36->15|36->15|63->42|63->42|65->44|65->44|65->44|66->45|71->50|71->50|71->50|79->58|79->58|80->59|83->62|83->62|83->62|87->66|87->66|88->67|90->69|90->69|91->70|98->77|98->77|99->78|99->78|99->78|99->78|99->78|102->81|102->81|102->81|103->82|103->82|103->82|103->82|103->82|104->83|105->84|105->84|107->86|107->86|107->86|109->88|109->88|111->90|111->90|111->90|112->91|114->93|114->93|114->93|116->95|116->95|118->97|125->104|125->104|126->105|127->106|127->106|129->108|129->108|129->108|130->109|131->110|131->110|133->112|133->112|133->112|135->114|142->121|142->121|143->122|147->126|147->126|148->127|155->134|155->134|157->136|162->141|162->141|164->143|166->145|166->145|168->147|169->148|169->148|170->149|172->151|172->151|174->153|174->153|174->153|177->156|177->156|178->157|178->157|178->157|179->158|181->160|181->160|182->161|182->161|183->162|185->164|185->164|187->166|187->166|188->167|188->167|188->167|189->168|191->170|191->170|192->171|192->171|192->171|193->172|194->173|194->173|194->173|194->173|195->174|196->175|196->175|196->175|197->176|197->176|200->179|200->179|201->180|201->180|202->181|202->181|202->181|207->186|207->186|208->187|208->187|208->187|209->188|212->191|212->191|212->191|212->191|212->191|213->192|215->194|215->194|216->195|216->195|216->195|218->197|218->197|219->198|219->198|219->198|220->199|224->203|224->203|224->203|224->203|224->203|225->204|226->205|226->205|228->207|228->207|230->209|236->215|236->215|237->216|268->247|268->247|269->248|271->250|271->250|272->251|275->254|275->254|276->255|276->255|276->255|277->256|278->257|278->257|278->257|278->257|279->258|280->259|280->259|280->259|281->260|281->260|282->261|282->261|283->262|283->262|284->263|285->264|285->264|286->265|286->265|286->265|286->265|287->266|289->268|289->268|290->269|293->272|293->272|294->273|294->273|294->273|295->274|296->275|296->275|296->275|296->275|297->276|298->277|298->277|298->277|299->278|299->278|300->279|300->279|301->280|301->280|302->281|303->282|303->282|304->283|304->283|304->283|306->285|306->285|307->286|307->286|307->286|308->287|309->288|309->288|312->291|312->291|313->292|315->294|315->294|316->295|316->295|317->296|332->311|332->311|333->312|333->312|335->314|335->314|336->315|336->315|336->315|339->318|339->318|339->318|346->325|346->325|348->327|393->372|393->372|394->373|396->375|396->375|397->376|400->379|400->379|401->380|401->380|401->380|401->380|402->381|405->384|405->384|406->385|408->387|408->387|409->388|409->388|410->389|411->390|411->390|412->391|412->391|412->391|412->391|413->392|416->395|416->395|417->396|419->398|419->398|420->399|420->399|421->400|422->401|422->401|423->402|423->402|423->402|425->404|425->404|426->405|426->405|426->405|427->406|428->407|428->407|430->409|430->409|431->410|434->413|434->413|435->414|435->414|436->415|437->416|437->416|438->417|438->417|439->418|439->418|439->418|440->419|441->420|441->420|443->422|443->422|445->424|445->424|445->424|449->428|449->428|450->429|451->430|451->430|452->431|452->431|452->431|453->432|454->433|454->433|455->434|455->434|455->434|456->435|456->435|457->436|457->436|457->436|458->437|460->439|460->439|460->439|460->439|460->439|461->440|462->441|462->441|463->442|463->442|465->444|465->444|465->444|467->446|467->446|468->447|469->448|469->448|469->448|472->451|472->451|472->451|474->453|474->453|476->455|480->459|480->459|481->460|489->468|489->468|489->468|495->474|495->474|496->475|497->476|497->476|499->478|499->478|499->478|500->479|500->479|500->479|501->480|503->482|503->482|504->483|504->483|504->483|505->484|506->485|506->485|507->486|507->486|508->487|509->488|509->488|510->489|510->489|511->490|511->490|512->491|512->491|512->491|513->492|516->495|516->495|516->495|517->496|517->496|518->497|518->497|519->498|519->498|519->498|520->499|521->500|521->500|521->500|521->500|521->500|522->501|524->503|524->503|525->504|525->504|526->505|526->505|526->505|527->506|527->506|529->508|536->515|536->515|538->517|538->517|538->517|539->518|544->523|544->523|546->525|553->532|553->532|554->533|557->536|557->536|559->538|559->538|560->539|561->540|561->540|562->541|562->541|562->541|563->542|567->546|567->546|569->548|569->548|570->549|571->550|571->550|573->552|573->552|574->553|579->558|579->558|579->558|579->558|580->559|585->564|585->564|585->564|585->564|586->565|592->571|592->571|592->571|592->571|593->572|599->578|599->578|599->578|599->578|600->579|604->583|604->583|604->583|604->583|605->584|610->589|610->589|610->589|610->589|611->590|616->595|616->595|616->595|616->595|617->596|621->600|621->600|621->600|623->602|623->602|624->603|624->603|624->603|625->604|627->606|627->606|628->607|628->607|628->607|629->608|631->610|631->610|632->611|632->611|633->612|633->612|633->612|635->614|635->614|635->614|640->619|640->619|642->621|643->622|643->622|644->623|646->625|646->625|646->625|649->628|649->628|650->629|652->631|652->631|652->631|655->634|655->634|656->635|658->637|658->637|658->637|661->640|661->640|662->641|663->642|663->642|663->642|666->645|666->645|667->646|668->647|668->647|668->647|671->650|671->650|672->651|673->652|673->652|673->652|690->669|690->669|691->670|692->671|692->671|692->671|694->673|694->673|694->673|697->676|697->676|698->677|699->678|699->678|700->679|704->683|704->683|704->683|704->683|704->683|705->684|706->685|706->685|707->686|708->687|708->687|708->687|708->687|708->687|709->688|712->691|712->691|712->691|714->693|714->693|716->695|720->699|720->699|721->700|722->701|722->701|722->701|724->703|724->703|725->704|726->705|726->705|728->707|728->707|728->707|738->1|739->716|740->717|740->717|740->717|741->718|1163->1139|1163->1139|1163->1139|1168->1144|1168->1144|1168->1144|1173->1149|1173->1149|1173->1149|1178->1154|1178->1154|1178->1154|1182->1158|1182->1158|1182->1158|1186->1162|1186->1162|1186->1162|1191->1167|1191->1167|1191->1167|1196->1172|1196->1172|1196->1172|1226->1202|1226->1202|1226->1202|1247->1223|1247->1223|1247->1223|1839->1804
                  -- GENERATED --
              */
          