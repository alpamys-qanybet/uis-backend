
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
object flot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""
    """),format.raw/*3.5*/("""<script type="text/javascript">

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

    pageSetUp ( ) ;

    // PAGE RELATED SCRIPTS

    var pagefunction = function ( ) """),format.raw/*39.37*/("""{"""),format.raw/*39.38*/("""

    """),format.raw/*41.5*/("""/* chart colors default */
    var $chrt_border_color = "#efefef" ;
    var $chrt_grid_color = "#DDD"
    var $chrt_main = "#E24913" ; /* red       */
    var $chrt_second = "#6595b4" ; /* blue      */
    var $chrt_third = "#FF9F01" ; /* orange    */
    var $chrt_fourth = "#7e9d3a" ; /* green     */
    var $chrt_fifth = "#BD362F" ; /* dark red  */
    var $chrt_mono = "#000" ;

    /* sales chart */

    if ( $ ( "#saleschart" ).length ) """),format.raw/*53.39*/("""{"""),format.raw/*53.40*/("""
    """),format.raw/*54.5*/("""var d =[[ 1196463600000, 0 ], [ 1196550000000, 0 ], [ 1196636400000, 0 ], [ 1196722800000, 77 ], [ 1196809200000, 3636 ], [ 1196895600000, 3575 ], [ 1196982000000, 2736 ], [ 1197068400000, 1086 ], [ 1197154800000, 676 ], [ 1197241200000, 1205 ], [ 1197327600000, 906 ], [ 1197414000000, 710 ], [ 1197500400000, 639 ], [ 1197586800000, 540 ], [ 1197673200000, 435 ], [ 1197759600000, 301 ], [ 1197846000000, 575 ], [ 1197932400000, 481 ], [ 1198018800000, 591 ], [ 1198105200000, 608 ], [ 1198191600000, 459 ], [ 1198278000000, 234 ], [ 1198364400000, 1352 ], [ 1198450800000, 686 ], [ 1198537200000, 279 ], [ 1198623600000, 449 ], [ 1198710000000, 468 ], [ 1198796400000, 392 ], [ 1198882800000, 282 ], [ 1198969200000, 208 ], [ 1199055600000, 229 ], [ 1199142000000, 177 ], [ 1199228400000, 374 ], [ 1199314800000, 436 ], [ 1199401200000, 404 ], [ 1199487600000, 253 ], [ 1199574000000, 218 ], [ 1199660400000, 476 ], [ 1199746800000, 462 ], [ 1199833200000, 500 ], [ 1199919600000, 700 ], [ 1200006000000, 750 ], [ 1200092400000, 600 ], [ 1200178800000, 500 ], [ 1200265200000, 900 ], [ 1200351600000, 930 ], [ 1200438000000, 1200 ], [ 1200524400000, 980 ], [ 1200610800000, 950 ], [ 1200697200000, 900 ], [ 1200783600000, 1000 ], [ 1200870000000, 1050 ], [ 1200956400000, 1150 ], [ 1201042800000, 1100 ], [ 1201129200000, 1200 ], [ 1201215600000, 1300 ], [ 1201302000000, 1700 ], [ 1201388400000, 1450 ], [ 1201474800000, 1500 ], [ 1201561200000, 546 ], [ 1201647600000, 614 ], [ 1201734000000, 954 ], [ 1201820400000, 1700 ], [ 1201906800000, 1800 ], [ 1201993200000, 1900 ], [ 1202079600000, 2000 ], [ 1202166000000, 2100 ], [ 1202252400000, 2200 ], [ 1202338800000, 2300 ], [ 1202425200000, 2400 ], [ 1202511600000, 2550 ], [ 1202598000000, 2600 ], [ 1202684400000, 2500 ], [ 1202770800000, 2700 ], [ 1202857200000, 2750 ], [ 1202943600000, 2800 ], [ 1203030000000, 3245 ], [ 1203116400000, 3345 ], [ 1203202800000, 3000 ], [ 1203289200000, 3200 ], [ 1203375600000, 3300 ], [ 1203462000000, 3400 ], [ 1203548400000, 3600 ], [ 1203634800000, 3700 ], [ 1203721200000, 3800 ], [ 1203807600000, 4000 ], [ 1203894000000, 4500 ] ] ;

    for ( var i = 0 ; i < d.length ; ++ i )
    d[ i ][ 0 ] += 60 * 60 * 1000 ;

    function weekendAreas ( axes ) """),format.raw/*59.36*/("""{"""),format.raw/*59.37*/("""
    """),format.raw/*60.5*/("""var markings =[ ] ;
    var d = new Date ( axes.xaxis.min ) ;
    // go to the first Saturday
    d.setUTCDate ( d.getUTCDate ( ) - ( ( d.getUTCDay ( ) + 1 ) % 7 ) )
    d.setUTCSeconds ( 0 ) ;
    d.setUTCMinutes ( 0 ) ;
    d.setUTCHours ( 0 ) ;
    var i = d.getTime ( ) ;
    do """),format.raw/*68.8*/("""{"""),format.raw/*68.9*/("""
    """),format.raw/*69.5*/("""// when we don't set yaxis, the rectangle automatically
    // extends to infinity upwards and downwards
    markings.push ( """),format.raw/*71.21*/("""{"""),format.raw/*71.22*/("""
    """),format.raw/*72.5*/("""xaxis : """),format.raw/*72.13*/("""{"""),format.raw/*72.14*/("""
    """),format.raw/*73.5*/("""from : i,
    to : i + 2 * 24 * 60 * 60 * 1000
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""" """),format.raw/*76.7*/(""") ;
    i += 7 * 24 * 60 * 60 * 1000 ;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""" """),format.raw/*78.7*/("""while ( i < axes.xaxis.max ) ;

    return markings ;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""

    """),format.raw/*83.5*/("""var options = """),format.raw/*83.19*/("""{"""),format.raw/*83.20*/("""
    """),format.raw/*84.5*/("""xaxis : """),format.raw/*84.13*/("""{"""),format.raw/*84.14*/("""
    """),format.raw/*85.5*/("""mode : "time",
    tickLength : 5
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/(""",
    series : """),format.raw/*88.14*/("""{"""),format.raw/*88.15*/("""
    """),format.raw/*89.5*/("""lines : """),format.raw/*89.13*/("""{"""),format.raw/*89.14*/("""
    """),format.raw/*90.5*/("""show : true,
    lineWidth : 1,
    fill : true,
    fillColor : """),format.raw/*93.17*/("""{"""),format.raw/*93.18*/("""
    """),format.raw/*94.5*/("""colors :[ """),format.raw/*94.15*/("""{"""),format.raw/*94.16*/("""
    """),format.raw/*95.5*/("""opacity : 0.1
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""", """),format.raw/*96.8*/("""{"""),format.raw/*96.9*/("""
    """),format.raw/*97.5*/("""opacity : 0.15
    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/(""" """),format.raw/*98.7*/("""]
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""",
    //points: """),format.raw/*101.15*/("""{"""),format.raw/*101.16*/(""" """),format.raw/*101.17*/("""show: true """),format.raw/*101.28*/("""}"""),format.raw/*101.29*/(""",
    shadowSize : 0
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""",
    selection : """),format.raw/*104.17*/("""{"""),format.raw/*104.18*/("""
    """),format.raw/*105.5*/("""mode : "x"
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/(""",
    grid : """),format.raw/*107.12*/("""{"""),format.raw/*107.13*/("""
    """),format.raw/*108.5*/("""hoverable : true,
    clickable : true,
    tickColor : $chrt_border_color,
    borderWidth : 0,
    borderColor : $chrt_border_color,
    """),format.raw/*113.5*/("""}"""),format.raw/*113.6*/(""",
    tooltip : true,
    tooltipOpts : """),format.raw/*115.19*/("""{"""),format.raw/*115.20*/("""
    """),format.raw/*116.5*/("""content : "Your sales for <b>%x</b> was <span>$%y</span>",
    dateFormat : "%y-%0m-%0d",
    defaultTheme : false
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/(""",
    colors :[ $chrt_second ],

    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""" """),format.raw/*122.7*/(""";

    var plot = $.plot ( $ ( "#saleschart" ), [ d ], options ) ;
    """),format.raw/*125.5*/("""}"""),format.raw/*125.6*/(""" """),format.raw/*125.7*/(""";

    /* end sales chart */

    /* Sin chart */

    if ( $ ( "#sin-chart" ).length ) """),format.raw/*131.38*/("""{"""),format.raw/*131.39*/("""
    """),format.raw/*132.5*/("""var sin =[ ], cos =[ ] ;
    for ( var i = 0 ; i < 16 ; i += 0.5 ) """),format.raw/*133.43*/("""{"""),format.raw/*133.44*/("""
    """),format.raw/*134.5*/("""sin.push ([ i, Math.sin ( i ) ] ) ;
    cos.push ([ i, Math.cos ( i ) ] ) ;
    """),format.raw/*136.5*/("""}"""),format.raw/*136.6*/("""

    """),format.raw/*138.5*/("""var plot = $.plot ( $ ( "#sin-chart" ), [ """),format.raw/*138.47*/("""{"""),format.raw/*138.48*/("""
    """),format.raw/*139.5*/("""data : sin,
    label : "sin(x)"
    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/(""", """),format.raw/*141.8*/("""{"""),format.raw/*141.9*/("""
    """),format.raw/*142.5*/("""data : cos,
    label : "cos(x)"
    """),format.raw/*144.5*/("""}"""),format.raw/*144.6*/(""" """),format.raw/*144.7*/("""], """),format.raw/*144.10*/("""{"""),format.raw/*144.11*/("""
    """),format.raw/*145.5*/("""series : """),format.raw/*145.14*/("""{"""),format.raw/*145.15*/("""
    """),format.raw/*146.5*/("""lines : """),format.raw/*146.13*/("""{"""),format.raw/*146.14*/("""
    """),format.raw/*147.5*/("""show : true
    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/(""",
    points : """),format.raw/*149.14*/("""{"""),format.raw/*149.15*/("""
    """),format.raw/*150.5*/("""show : true
    """),format.raw/*151.5*/("""}"""),format.raw/*151.6*/("""
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""",
    grid : """),format.raw/*153.12*/("""{"""),format.raw/*153.13*/("""
    """),format.raw/*154.5*/("""hoverable : true,
    clickable : true,
    tickColor : $chrt_border_color,
    borderWidth : 0,
    borderColor : $chrt_border_color,
    """),format.raw/*159.5*/("""}"""),format.raw/*159.6*/(""",
    tooltip : true,
    tooltipOpts : """),format.raw/*161.19*/("""{"""),format.raw/*161.20*/("""
    """),format.raw/*162.5*/("""//content : "Value <b>$x</b> Value <span>$y</span>",
    defaultTheme : false
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/(""",
    colors :[ $chrt_second, $chrt_fourth ],
    yaxis : """),format.raw/*166.13*/("""{"""),format.raw/*166.14*/("""
    """),format.raw/*167.5*/("""min : - 1.1,
    max : 1.1
    """),format.raw/*169.5*/("""}"""),format.raw/*169.6*/(""",
    xaxis : """),format.raw/*170.13*/("""{"""),format.raw/*170.14*/("""
    """),format.raw/*171.5*/("""min : 0,
    max : 15
    """),format.raw/*173.5*/("""}"""),format.raw/*173.6*/("""
    """),format.raw/*174.5*/("""}"""),format.raw/*174.6*/(""" """),format.raw/*174.7*/(""") ;

    $ ( "#sin-chart" ).bind ( "plotclick", function ( event, pos, item ) """),format.raw/*176.74*/("""{"""),format.raw/*176.75*/("""
    """),format.raw/*177.5*/("""if ( item ) """),format.raw/*177.17*/("""{"""),format.raw/*177.18*/("""
    """),format.raw/*178.5*/("""$ ( "#clickdata" ).text ( "You clicked point " + item.dataIndex + " in " + item.series.label + "." ) ;
    plot.highlight ( item.series, item.datapoint ) ;
    """),format.raw/*180.5*/("""}"""),format.raw/*180.6*/("""
    """),format.raw/*181.5*/("""}"""),format.raw/*181.6*/(""" """),format.raw/*181.7*/(""") ;
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/("""

    """),format.raw/*184.5*/("""/* end sin chart */

    /* bar chart */

    if ( $ ( "#bar-chart" ).length ) """),format.raw/*188.38*/("""{"""),format.raw/*188.39*/("""

    """),format.raw/*190.5*/("""var data1 =[ ] ;
    for ( var i = 0 ; i <= 12 ; i += 1 )
    data1.push ([ i, parseInt ( Math.random ( ) * 30 ) ] ) ;

    var data2 =[ ] ;
    for ( var i = 0 ; i <= 12 ; i += 1 )
    data2.push ([ i, parseInt ( Math.random ( ) * 30 ) ] ) ;

    var data3 =[ ] ;
    for ( var i = 0 ; i <= 12 ; i += 1 )
    data3.push ([ i, parseInt ( Math.random ( ) * 30 ) ] ) ;

    var ds = new Array ( ) ;

    ds.push ( """),format.raw/*204.15*/("""{"""),format.raw/*204.16*/("""
    """),format.raw/*205.5*/("""data : data1,
    bars : """),format.raw/*206.12*/("""{"""),format.raw/*206.13*/("""
    """),format.raw/*207.5*/("""show : true,
    barWidth : 0.2,
    order : 1,
    """),format.raw/*210.5*/("""}"""),format.raw/*210.6*/("""
    """),format.raw/*211.5*/("""}"""),format.raw/*211.6*/(""" """),format.raw/*211.7*/(""") ;
    ds.push ( """),format.raw/*212.15*/("""{"""),format.raw/*212.16*/("""
    """),format.raw/*213.5*/("""data : data2,
    bars : """),format.raw/*214.12*/("""{"""),format.raw/*214.13*/("""
    """),format.raw/*215.5*/("""show : true,
    barWidth : 0.2,
    order : 2
    """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/("""
    """),format.raw/*219.5*/("""}"""),format.raw/*219.6*/(""" """),format.raw/*219.7*/(""") ;
    ds.push ( """),format.raw/*220.15*/("""{"""),format.raw/*220.16*/("""
    """),format.raw/*221.5*/("""data : data3,
    bars : """),format.raw/*222.12*/("""{"""),format.raw/*222.13*/("""
    """),format.raw/*223.5*/("""show : true,
    barWidth : 0.2,
    order : 3
    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/("""
    """),format.raw/*227.5*/("""}"""),format.raw/*227.6*/(""" """),format.raw/*227.7*/(""") ;

    //Display graph
    $.plot ( $ ( "#bar-chart" ), ds, """),format.raw/*230.38*/("""{"""),format.raw/*230.39*/("""
    """),format.raw/*231.5*/("""colors :[ $chrt_second, $chrt_fourth, "#666", "#BBB" ],
    grid : """),format.raw/*232.12*/("""{"""),format.raw/*232.13*/("""
    """),format.raw/*233.5*/("""show : true,
    hoverable : true,
    clickable : true,
    tickColor : $chrt_border_color,
    borderWidth : 0,
    borderColor : $chrt_border_color,
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/(""",
    legend : true,
    tooltip : true,
    tooltipOpts : """),format.raw/*242.19*/("""{"""),format.raw/*242.20*/("""
    """),format.raw/*243.5*/("""content : "<b>%x</b> = <span>%y</span>",
    defaultTheme : false
    """),format.raw/*245.5*/("""}"""),format.raw/*245.6*/("""

    """),format.raw/*247.5*/("""}"""),format.raw/*247.6*/(""" """),format.raw/*247.7*/(""") ;

    """),format.raw/*249.5*/("""}"""),format.raw/*249.6*/("""

    """),format.raw/*251.5*/("""/* end bar chart */

    /* bar-chart-h */
    if ( $ ( "#bar-chart-h" ).length ) """),format.raw/*254.40*/("""{"""),format.raw/*254.41*/("""
    """),format.raw/*255.5*/("""//Display horizontal graph
    var d1_h =[ ] ;
    for ( var i = 0 ; i <= 3 ; i += 1 )
    d1_h.push ([ parseInt ( Math.random ( ) * 30 ), i ] ) ;

    var d2_h =[ ] ;
    for ( var i = 0 ; i <= 3 ; i += 1 )
    d2_h.push ([ parseInt ( Math.random ( ) * 30 ), i ] ) ;

    var d3_h =[ ] ;
    for ( var i = 0 ; i <= 3 ; i += 1 )
    d3_h.push ([ parseInt ( Math.random ( ) * 30 ), i ] ) ;

    var ds_h = new Array ( ) ;
    ds_h.push ( """),format.raw/*269.17*/("""{"""),format.raw/*269.18*/("""
    """),format.raw/*270.5*/("""data : d1_h,
    bars : """),format.raw/*271.12*/("""{"""),format.raw/*271.13*/("""
    """),format.raw/*272.5*/("""horizontal : true,
    show : true,
    barWidth : 0.2,
    order : 1,
    """),format.raw/*276.5*/("""}"""),format.raw/*276.6*/("""
    """),format.raw/*277.5*/("""}"""),format.raw/*277.6*/(""" """),format.raw/*277.7*/(""") ;
    ds_h.push ( """),format.raw/*278.17*/("""{"""),format.raw/*278.18*/("""
    """),format.raw/*279.5*/("""data : d2_h,
    bars : """),format.raw/*280.12*/("""{"""),format.raw/*280.13*/("""
    """),format.raw/*281.5*/("""horizontal : true,
    show : true,
    barWidth : 0.2,
    order : 2
    """),format.raw/*285.5*/("""}"""),format.raw/*285.6*/("""
    """),format.raw/*286.5*/("""}"""),format.raw/*286.6*/(""" """),format.raw/*286.7*/(""") ;
    ds_h.push ( """),format.raw/*287.17*/("""{"""),format.raw/*287.18*/("""
    """),format.raw/*288.5*/("""data : d3_h,
    bars : """),format.raw/*289.12*/("""{"""),format.raw/*289.13*/("""
    """),format.raw/*290.5*/("""horizontal : true,
    show : true,
    barWidth : 0.2,
    order : 3
    """),format.raw/*294.5*/("""}"""),format.raw/*294.6*/("""
    """),format.raw/*295.5*/("""}"""),format.raw/*295.6*/(""" """),format.raw/*295.7*/(""") ;

    // display graph
    $.plot ( $ ( "#bar-chart-h" ), ds_h, """),format.raw/*298.42*/("""{"""),format.raw/*298.43*/("""
    """),format.raw/*299.5*/("""colors :[ $chrt_second, $chrt_fourth, "#666", "#BBB" ],
    grid : """),format.raw/*300.12*/("""{"""),format.raw/*300.13*/("""
    """),format.raw/*301.5*/("""show : true,
    hoverable : true,
    clickable : true,
    tickColor : $chrt_border_color,
    borderWidth : 0,
    borderColor : $chrt_border_color,
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/(""",
    legend : true,
    tooltip : true,
    tooltipOpts : """),format.raw/*310.19*/("""{"""),format.raw/*310.20*/("""
    """),format.raw/*311.5*/("""content : "<b>%x</b> = <span>%y</span>",
    defaultTheme : false
    """),format.raw/*313.5*/("""}"""),format.raw/*313.6*/("""
    """),format.raw/*314.5*/("""}"""),format.raw/*314.6*/(""" """),format.raw/*314.7*/(""") ;

    """),format.raw/*316.5*/("""}"""),format.raw/*316.6*/("""

    """),format.raw/*318.5*/("""/* end bar-chart-h

    /* fill chart */

    if ( $ ( "#fill-chart" ).length ) """),format.raw/*322.39*/("""{"""),format.raw/*322.40*/("""
    """),format.raw/*323.5*/("""var males = """),format.raw/*323.17*/("""{"""),format.raw/*323.18*/("""
    """),format.raw/*324.5*/("""'15%' :[[ 2, 88.0 ], [ 3, 93.3 ], [ 4, 102.0 ], [ 5, 108.5 ], [ 6, 115.7 ], [ 7, 115.6 ], [ 8, 124.6 ], [ 9, 130.3 ], [ 10, 134.3 ], [ 11, 141.4 ], [ 12, 146.5 ], [ 13, 151.7 ], [ 14, 159.9 ], [ 15, 165.4 ], [ 16, 167.8 ], [ 17, 168.7 ], [ 18, 169.5 ], [ 19, 168.0 ] ],
    '90%' :[[ 2, 96.8 ], [ 3, 105.2 ], [ 4, 113.9 ], [ 5, 120.8 ], [ 6, 127.0 ], [ 7, 133.1 ], [ 8, 139.1 ], [ 9, 143.9 ], [ 10, 151.3 ], [ 11, 161.1 ], [ 12, 164.8 ], [ 13, 173.5 ], [ 14, 179.0 ], [ 15, 182.0 ], [ 16, 186.9 ], [ 17, 185.2 ], [ 18, 186.3 ], [ 19, 186.6 ] ],
    '25%' :[[ 2, 89.2 ], [ 3, 94.9 ], [ 4, 104.4 ], [ 5, 111.4 ], [ 6, 117.5 ], [ 7, 120.2 ], [ 8, 127.1 ], [ 9, 132.9 ], [ 10, 136.8 ], [ 11, 144.4 ], [ 12, 149.5 ], [ 13, 154.1 ], [ 14, 163.1 ], [ 15, 169.2 ], [ 16, 170.4 ], [ 17, 171.2 ], [ 18, 172.4 ], [ 19, 170.8 ] ],
    '10%' :[[ 2, 86.9 ], [ 3, 92.6 ], [ 4, 99.9 ], [ 5, 107.0 ], [ 6, 114.0 ], [ 7, 113.5 ], [ 8, 123.6 ], [ 9, 129.2 ], [ 10, 133.0 ], [ 11, 140.6 ], [ 12, 145.2 ], [ 13, 149.7 ], [ 14, 158.4 ], [ 15, 163.5 ], [ 16, 166.9 ], [ 17, 167.5 ], [ 18, 167.1 ], [ 19, 165.3 ] ],
    'mean' :[[ 2, 91.9 ], [ 3, 98.5 ], [ 4, 107.1 ], [ 5, 114.4 ], [ 6, 120.6 ], [ 7, 124.7 ], [ 8, 131.1 ], [ 9, 136.8 ], [ 10, 142.3 ], [ 11, 150.0 ], [ 12, 154.7 ], [ 13, 161.9 ], [ 14, 168.7 ], [ 15, 173.6 ], [ 16, 175.9 ], [ 17, 176.6 ], [ 18, 176.8 ], [ 19, 176.7 ] ],
    '75%' :[[ 2, 94.5 ], [ 3, 102.1 ], [ 4, 110.8 ], [ 5, 117.9 ], [ 6, 124.0 ], [ 7, 129.3 ], [ 8, 134.6 ], [ 9, 141.4 ], [ 10, 147.0 ], [ 11, 156.1 ], [ 12, 160.3 ], [ 13, 168.3 ], [ 14, 174.7 ], [ 15, 178.0 ], [ 16, 180.2 ], [ 17, 181.7 ], [ 18, 181.3 ], [ 19, 182.5 ] ],
    '85%' :[[ 2, 96.2 ], [ 3, 103.8 ], [ 4, 111.8 ], [ 5, 119.6 ], [ 6, 125.6 ], [ 7, 131.5 ], [ 8, 138.0 ], [ 9, 143.3 ], [ 10, 149.3 ], [ 11, 159.8 ], [ 12, 162.5 ], [ 13, 171.3 ], [ 14, 177.5 ], [ 15, 180.2 ], [ 16, 183.8 ], [ 17, 183.4 ], [ 18, 183.5 ], [ 19, 185.5 ] ],
    '50%' :[[ 2, 91.9 ], [ 3, 98.2 ], [ 4, 106.8 ], [ 5, 114.6 ], [ 6, 120.8 ], [ 7, 125.2 ], [ 8, 130.3 ], [ 9, 137.1 ], [ 10, 141.5 ], [ 11, 149.4 ], [ 12, 153.9 ], [ 13, 162.2 ], [ 14, 169.0 ], [ 15, 174.8 ], [ 16, 176.0 ], [ 17, 176.8 ], [ 18, 176.4 ], [ 19, 177.4 ] ]
    """),format.raw/*332.5*/("""}"""),format.raw/*332.6*/(""" """),format.raw/*332.7*/(""";

    var females = """),format.raw/*334.19*/("""{"""),format.raw/*334.20*/("""
    """),format.raw/*335.5*/("""'15%' :[[ 2, 84.8 ], [ 3, 93.7 ], [ 4, 100.6 ], [ 5, 105.8 ], [ 6, 113.3 ], [ 7, 119.3 ], [ 8, 124.3 ], [ 9, 131.4 ], [ 10, 136.9 ], [ 11, 143.8 ], [ 12, 149.4 ], [ 13, 151.2 ], [ 14, 152.3 ], [ 15, 155.9 ], [ 16, 154.7 ], [ 17, 157.0 ], [ 18, 156.1 ], [ 19, 155.4 ] ],
    '90%' :[[ 2, 95.6 ], [ 3, 104.1 ], [ 4, 111.9 ], [ 5, 119.6 ], [ 6, 127.6 ], [ 7, 133.1 ], [ 8, 138.7 ], [ 9, 147.1 ], [ 10, 152.8 ], [ 11, 161.3 ], [ 12, 166.6 ], [ 13, 167.9 ], [ 14, 169.3 ], [ 15, 170.1 ], [ 16, 172.4 ], [ 17, 169.2 ], [ 18, 171.1 ], [ 19, 172.4 ] ],
    '25%' :[[ 2, 87.2 ], [ 3, 95.9 ], [ 4, 101.9 ], [ 5, 107.4 ], [ 6, 114.8 ], [ 7, 121.4 ], [ 8, 126.8 ], [ 9, 133.4 ], [ 10, 138.6 ], [ 11, 146.2 ], [ 12, 152.0 ], [ 13, 153.8 ], [ 14, 155.7 ], [ 15, 158.4 ], [ 16, 157.0 ], [ 17, 158.5 ], [ 18, 158.4 ], [ 19, 158.1 ] ],
    '10%' :[[ 2, 84.0 ], [ 3, 91.9 ], [ 4, 99.2 ], [ 5, 105.2 ], [ 6, 112.7 ], [ 7, 118.0 ], [ 8, 123.3 ], [ 9, 130.2 ], [ 10, 135.0 ], [ 11, 141.1 ], [ 12, 148.3 ], [ 13, 150.0 ], [ 14, 150.7 ], [ 15, 154.3 ], [ 16, 153.6 ], [ 17, 155.6 ], [ 18, 154.7 ], [ 19, 153.1 ] ],
    'mean' :[[ 2, 90.2 ], [ 3, 98.3 ], [ 4, 105.2 ], [ 5, 112.2 ], [ 6, 119.0 ], [ 7, 125.8 ], [ 8, 131.3 ], [ 9, 138.6 ], [ 10, 144.2 ], [ 11, 151.3 ], [ 12, 156.7 ], [ 13, 158.6 ], [ 14, 160.5 ], [ 15, 162.1 ], [ 16, 162.9 ], [ 17, 162.2 ], [ 18, 163.0 ], [ 19, 163.1 ] ],
    '75%' :[[ 2, 93.2 ], [ 3, 101.5 ], [ 4, 107.9 ], [ 5, 116.6 ], [ 6, 122.8 ], [ 7, 129.3 ], [ 8, 135.2 ], [ 9, 143.7 ], [ 10, 148.7 ], [ 11, 156.9 ], [ 12, 160.8 ], [ 13, 163.0 ], [ 14, 165.0 ], [ 15, 165.8 ], [ 16, 168.7 ], [ 17, 166.2 ], [ 18, 167.6 ], [ 19, 168.0 ] ],
    '85%' :[[ 2, 94.5 ], [ 3, 102.8 ], [ 4, 110.4 ], [ 5, 119.0 ], [ 6, 125.7 ], [ 7, 131.5 ], [ 8, 137.9 ], [ 9, 146.0 ], [ 10, 151.3 ], [ 11, 159.9 ], [ 12, 164.0 ], [ 13, 166.5 ], [ 14, 167.5 ], [ 15, 168.5 ], [ 16, 171.5 ], [ 17, 168.0 ], [ 18, 169.8 ], [ 19, 170.3 ] ],
    '50%' :[[ 2, 90.2 ], [ 3, 98.1 ], [ 4, 105.2 ], [ 5, 111.7 ], [ 6, 118.2 ], [ 7, 125.6 ], [ 8, 130.5 ], [ 9, 138.3 ], [ 10, 143.7 ], [ 11, 151.4 ], [ 12, 156.7 ], [ 13, 157.7 ], [ 14, 161.0 ], [ 15, 162.0 ], [ 16, 162.8 ], [ 17, 162.2 ], [ 18, 162.8 ], [ 19, 163.3 ] ]
    """),format.raw/*343.5*/("""}"""),format.raw/*343.6*/(""" """),format.raw/*343.7*/(""";

    var dataset =[ """),format.raw/*345.20*/("""{"""),format.raw/*345.21*/("""
    """),format.raw/*346.5*/("""label : 'female mean',
    data : females[ 'mean' ],
    lines : """),format.raw/*348.13*/("""{"""),format.raw/*348.14*/("""
    """),format.raw/*349.5*/("""show : true
    """),format.raw/*350.5*/("""}"""),format.raw/*350.6*/(""",
    color : "rgb(255,50,50)"
    """),format.raw/*352.5*/("""}"""),format.raw/*352.6*/(""", """),format.raw/*352.8*/("""{"""),format.raw/*352.9*/("""
    """),format.raw/*353.5*/("""id : 'f15%',
    data : females[ '15%' ],
    lines : """),format.raw/*355.13*/("""{"""),format.raw/*355.14*/("""
    """),format.raw/*356.5*/("""show : true,
    lineWidth : 0,
    fill : false
    """),format.raw/*359.5*/("""}"""),format.raw/*359.6*/(""",
    color : "rgb(255,50,50)"
    """),format.raw/*361.5*/("""}"""),format.raw/*361.6*/(""", """),format.raw/*361.8*/("""{"""),format.raw/*361.9*/("""
    """),format.raw/*362.5*/("""id : 'f25%',
    data : females[ '25%' ],
    lines : """),format.raw/*364.13*/("""{"""),format.raw/*364.14*/("""
    """),format.raw/*365.5*/("""show : true,
    lineWidth : 0,
    fill : 0.2
    """),format.raw/*368.5*/("""}"""),format.raw/*368.6*/(""",
    color : "rgb(255,50,50)",
    fillBetween : 'f15%'
    """),format.raw/*371.5*/("""}"""),format.raw/*371.6*/(""", """),format.raw/*371.8*/("""{"""),format.raw/*371.9*/("""
    """),format.raw/*372.5*/("""id : 'f50%',
    data : females[ '50%' ],
    lines : """),format.raw/*374.13*/("""{"""),format.raw/*374.14*/("""
    """),format.raw/*375.5*/("""show : true,
    lineWidth : 0.5,
    fill : 0.4,
    shadowSize : 0
    """),format.raw/*379.5*/("""}"""),format.raw/*379.6*/(""",
    color : "rgb(255,50,50)",
    fillBetween : 'f25%'
    """),format.raw/*382.5*/("""}"""),format.raw/*382.6*/(""", """),format.raw/*382.8*/("""{"""),format.raw/*382.9*/("""
    """),format.raw/*383.5*/("""id : 'f75%',
    data : females[ '75%' ],
    lines : """),format.raw/*385.13*/("""{"""),format.raw/*385.14*/("""
    """),format.raw/*386.5*/("""show : true,
    lineWidth : 0,
    fill : 0.4
    """),format.raw/*389.5*/("""}"""),format.raw/*389.6*/(""",
    color : "rgb(255,50,50)",
    fillBetween : 'f50%'
    """),format.raw/*392.5*/("""}"""),format.raw/*392.6*/(""", """),format.raw/*392.8*/("""{"""),format.raw/*392.9*/("""
    """),format.raw/*393.5*/("""id : 'f85%',
    data : females[ '85%' ],
    lines : """),format.raw/*395.13*/("""{"""),format.raw/*395.14*/("""
    """),format.raw/*396.5*/("""show : true,
    lineWidth : 0,
    fill : 0.2
    """),format.raw/*399.5*/("""}"""),format.raw/*399.6*/(""",
    color : "rgb(255,50,50)",
    fillBetween : 'f75%'
    """),format.raw/*402.5*/("""}"""),format.raw/*402.6*/(""", """),format.raw/*402.8*/("""{"""),format.raw/*402.9*/("""
    """),format.raw/*403.5*/("""label : 'male mean',
    data : males[ 'mean' ],
    lines : """),format.raw/*405.13*/("""{"""),format.raw/*405.14*/("""
    """),format.raw/*406.5*/("""show : true
    """),format.raw/*407.5*/("""}"""),format.raw/*407.6*/(""",
    color : "rgb(50,50,255)"
    """),format.raw/*409.5*/("""}"""),format.raw/*409.6*/(""", """),format.raw/*409.8*/("""{"""),format.raw/*409.9*/("""
    """),format.raw/*410.5*/("""id : 'm15%',
    data : males[ '15%' ],
    lines : """),format.raw/*412.13*/("""{"""),format.raw/*412.14*/("""
    """),format.raw/*413.5*/("""show : true,
    lineWidth : 0,
    fill : false
    """),format.raw/*416.5*/("""}"""),format.raw/*416.6*/(""",
    color : "rgb(50,50,255)"
    """),format.raw/*418.5*/("""}"""),format.raw/*418.6*/(""", """),format.raw/*418.8*/("""{"""),format.raw/*418.9*/("""
    """),format.raw/*419.5*/("""id : 'm25%',
    data : males[ '25%' ],
    lines : """),format.raw/*421.13*/("""{"""),format.raw/*421.14*/("""
    """),format.raw/*422.5*/("""show : true,
    lineWidth : 0,
    fill : 0.2
    """),format.raw/*425.5*/("""}"""),format.raw/*425.6*/(""",
    color : "rgb(50,50,255)",
    fillBetween : 'm15%'
    """),format.raw/*428.5*/("""}"""),format.raw/*428.6*/(""", """),format.raw/*428.8*/("""{"""),format.raw/*428.9*/("""
    """),format.raw/*429.5*/("""id : 'm50%',
    data : males[ '50%' ],
    lines : """),format.raw/*431.13*/("""{"""),format.raw/*431.14*/("""
    """),format.raw/*432.5*/("""show : true,
    lineWidth : 0.5,
    fill : 0.4,
    shadowSize : 0
    """),format.raw/*436.5*/("""}"""),format.raw/*436.6*/(""",
    color : "rgb(50,50,255)",
    fillBetween : 'm25%'
    """),format.raw/*439.5*/("""}"""),format.raw/*439.6*/(""", """),format.raw/*439.8*/("""{"""),format.raw/*439.9*/("""
    """),format.raw/*440.5*/("""id : 'm75%',
    data : males[ '75%' ],
    lines : """),format.raw/*442.13*/("""{"""),format.raw/*442.14*/("""
    """),format.raw/*443.5*/("""show : true,
    lineWidth : 0,
    fill : 0.4
    """),format.raw/*446.5*/("""}"""),format.raw/*446.6*/(""",
    color : "rgb(50,50,255)",
    fillBetween : 'm50%'
    """),format.raw/*449.5*/("""}"""),format.raw/*449.6*/(""", """),format.raw/*449.8*/("""{"""),format.raw/*449.9*/("""
    """),format.raw/*450.5*/("""id : 'm85%',
    data : males[ '85%' ],
    lines : """),format.raw/*452.13*/("""{"""),format.raw/*452.14*/("""
    """),format.raw/*453.5*/("""show : true,
    lineWidth : 0,
    fill : 0.2
    """),format.raw/*456.5*/("""}"""),format.raw/*456.6*/(""",
    color : "rgb(50,50,255)",
    fillBetween : 'm75%'
    """),format.raw/*459.5*/("""}"""),format.raw/*459.6*/(""" """),format.raw/*459.7*/("""]

    $.plot ( $ ( "#fill-chart" ), dataset, """),format.raw/*461.44*/("""{"""),format.raw/*461.45*/("""

    """),format.raw/*463.5*/("""xaxis : """),format.raw/*463.13*/("""{"""),format.raw/*463.14*/("""
    """),format.raw/*464.5*/("""tickDecimals : 0
    """),format.raw/*465.5*/("""}"""),format.raw/*465.6*/(""",

    yaxis : """),format.raw/*467.13*/("""{"""),format.raw/*467.14*/("""
    """),format.raw/*468.5*/("""tickFormatter : function ( v ) """),format.raw/*468.36*/("""{"""),format.raw/*468.37*/("""
    """),format.raw/*469.5*/("""return v + " cm" ;
    """),format.raw/*470.5*/("""}"""),format.raw/*470.6*/("""
    """),format.raw/*471.5*/("""}"""),format.raw/*471.6*/(""",

    """),format.raw/*473.5*/("""}"""),format.raw/*473.6*/(""" """),format.raw/*473.7*/(""") ;
    """),format.raw/*474.5*/("""}"""),format.raw/*474.6*/("""

    """),format.raw/*476.5*/("""/* end fill chart */

    /* pie chart */

    if ( $ ( '#pie-chart' ).length ) """),format.raw/*480.38*/("""{"""),format.raw/*480.39*/("""

    """),format.raw/*482.5*/("""var data_pie =[ ] ;
    var series = Math.floor ( Math.random ( ) * 10 ) + 1 ;
    for ( var i = 0 ; i < series ; i ++ ) """),format.raw/*484.43*/("""{"""),format.raw/*484.44*/("""
    """),format.raw/*485.5*/("""data_pie[ i ] = """),format.raw/*485.21*/("""{"""),format.raw/*485.22*/("""
    """),format.raw/*486.5*/("""label : "Series" + ( i + 1 ),
    data : Math.floor ( Math.random ( ) * 100 ) + 1
    """),format.raw/*488.5*/("""}"""),format.raw/*488.6*/("""
    """),format.raw/*489.5*/("""}"""),format.raw/*489.6*/("""

    """),format.raw/*491.5*/("""$.plot ( $ ( "#pie-chart" ), data_pie, """),format.raw/*491.44*/("""{"""),format.raw/*491.45*/("""
    """),format.raw/*492.5*/("""series : """),format.raw/*492.14*/("""{"""),format.raw/*492.15*/("""
    """),format.raw/*493.5*/("""pie : """),format.raw/*493.11*/("""{"""),format.raw/*493.12*/("""
    """),format.raw/*494.5*/("""show : true,
    innerRadius : 0.5,
    radius : 1,
    label : """),format.raw/*497.13*/("""{"""),format.raw/*497.14*/("""
    """),format.raw/*498.5*/("""show : false,
    radius : 2 / 3,
    formatter : function ( label, series ) """),format.raw/*500.44*/("""{"""),format.raw/*500.45*/("""
    """),format.raw/*501.5*/("""return '<div style="font-size:11px;text-align:center;padding:4px;color:white;">' + label + '<br/>' + Math.round ( series.percent ) + '%</div>' ;
    """),format.raw/*502.5*/("""}"""),format.raw/*502.6*/(""",
    threshold : 0.1
    """),format.raw/*504.5*/("""}"""),format.raw/*504.6*/("""
    """),format.raw/*505.5*/("""}"""),format.raw/*505.6*/("""
    """),format.raw/*506.5*/("""}"""),format.raw/*506.6*/(""",
    legend : """),format.raw/*507.14*/("""{"""),format.raw/*507.15*/("""
    """),format.raw/*508.5*/("""show : true,
    noColumns : 1, // number of colums in legend table
    labelFormatter : null, // fn: string -> string
    labelBoxBorderColor : "#000", // border color for the little label boxes
    container : null, // container (as jQuery object) to put legend in, null means default on top of graph
    position : "ne", // position of default legend container within plot
    margin :[ 5, 10 ], // distance from grid edge to default legend container within plot
    backgroundColor : "#efefef", // null means auto-detect
    backgroundOpacity : 1 // set to 0 to avoid background
    """),format.raw/*517.5*/("""}"""),format.raw/*517.6*/(""",
    grid : """),format.raw/*518.12*/("""{"""),format.raw/*518.13*/("""
    """),format.raw/*519.5*/("""hoverable : true,
    clickable : true
    """),format.raw/*521.5*/("""}"""),format.raw/*521.6*/(""",
    """),format.raw/*522.5*/("""}"""),format.raw/*522.6*/(""" """),format.raw/*522.7*/(""") ;

    """),format.raw/*524.5*/("""}"""),format.raw/*524.6*/("""

    """),format.raw/*526.5*/("""/* end pie chart */

    /* site stats chart */

    if ( $ ( "#site-stats" ).length ) """),format.raw/*530.39*/("""{"""),format.raw/*530.40*/("""

    """),format.raw/*532.5*/("""var pageviews =[[ 1, 75 ], [ 3, 87 ], [ 4, 93 ], [ 5, 127 ], [ 6, 116 ], [ 7, 137 ], [ 8, 135 ], [ 9, 130 ], [ 10, 167 ], [ 11, 169 ], [ 12, 179 ], [ 13, 185 ], [ 14, 176 ], [ 15, 180 ], [ 16, 174 ], [ 17, 193 ], [ 18, 186 ], [ 19, 177 ], [ 20, 153 ], [ 21, 149 ], [ 22, 130 ], [ 23, 100 ], [ 24, 50 ] ] ;
    var visitors =[[ 1, 65 ], [ 3, 50 ], [ 4, 73 ], [ 5, 100 ], [ 6, 95 ], [ 7, 103 ], [ 8, 111 ], [ 9, 97 ], [ 10, 125 ], [ 11, 100 ], [ 12, 95 ], [ 13, 141 ], [ 14, 126 ], [ 15, 131 ], [ 16, 146 ], [ 17, 158 ], [ 18, 160 ], [ 19, 151 ], [ 20, 125 ], [ 21, 110 ], [ 22, 100 ], [ 23, 85 ], [ 24, 37 ] ] ;
    //console.log(pageviews)
    var plot = $.plot ( $ ( "#site-stats" ), [ """),format.raw/*535.48*/("""{"""),format.raw/*535.49*/("""
    """),format.raw/*536.5*/("""data : pageviews,
    label : "Your pageviews"
    """),format.raw/*538.5*/("""}"""),format.raw/*538.6*/(""", """),format.raw/*538.8*/("""{"""),format.raw/*538.9*/("""
    """),format.raw/*539.5*/("""data : visitors,
    label : "Site visitors"
    """),format.raw/*541.5*/("""}"""),format.raw/*541.6*/(""" """),format.raw/*541.7*/("""], """),format.raw/*541.10*/("""{"""),format.raw/*541.11*/("""
    """),format.raw/*542.5*/("""series : """),format.raw/*542.14*/("""{"""),format.raw/*542.15*/("""
    """),format.raw/*543.5*/("""lines : """),format.raw/*543.13*/("""{"""),format.raw/*543.14*/("""
    """),format.raw/*544.5*/("""show : true,
    lineWidth : 1,
    fill : true,
    fillColor : """),format.raw/*547.17*/("""{"""),format.raw/*547.18*/("""
    """),format.raw/*548.5*/("""colors :[ """),format.raw/*548.15*/("""{"""),format.raw/*548.16*/("""
    """),format.raw/*549.5*/("""opacity : 0.1
    """),format.raw/*550.5*/("""}"""),format.raw/*550.6*/(""", """),format.raw/*550.8*/("""{"""),format.raw/*550.9*/("""
    """),format.raw/*551.5*/("""opacity : 0.15
    """),format.raw/*552.5*/("""}"""),format.raw/*552.6*/(""" """),format.raw/*552.7*/("""]
    """),format.raw/*553.5*/("""}"""),format.raw/*553.6*/("""
    """),format.raw/*554.5*/("""}"""),format.raw/*554.6*/(""",
    points : """),format.raw/*555.14*/("""{"""),format.raw/*555.15*/("""
    """),format.raw/*556.5*/("""show : true
    """),format.raw/*557.5*/("""}"""),format.raw/*557.6*/(""",
    shadowSize : 0
    """),format.raw/*559.5*/("""}"""),format.raw/*559.6*/(""",
    xaxis : """),format.raw/*560.13*/("""{"""),format.raw/*560.14*/("""
    """),format.raw/*561.5*/("""mode : "time",
    tickLength : 10
    """),format.raw/*563.5*/("""}"""),format.raw/*563.6*/(""",

    yaxes :[ """),format.raw/*565.14*/("""{"""),format.raw/*565.15*/("""
    """),format.raw/*566.5*/("""min : 20,
    tickLength : 5
    """),format.raw/*568.5*/("""}"""),format.raw/*568.6*/(""" """),format.raw/*568.7*/("""],
    grid : """),format.raw/*569.12*/("""{"""),format.raw/*569.13*/("""
    """),format.raw/*570.5*/("""hoverable : true,
    clickable : true,
    tickColor : $chrt_border_color,
    borderWidth : 0,
    borderColor : $chrt_border_color,
    """),format.raw/*575.5*/("""}"""),format.raw/*575.6*/(""",
    tooltip : true,
    tooltipOpts : """),format.raw/*577.19*/("""{"""),format.raw/*577.20*/("""
    """),format.raw/*578.5*/("""content : "%s for <b>%x:00 hrs</b> was %y",
    dateFormat : "%y-%0m-%0d",
    defaultTheme : false
    """),format.raw/*581.5*/("""}"""),format.raw/*581.6*/(""",
    colors :[ $chrt_main, $chrt_second ],
    xaxis : """),format.raw/*583.13*/("""{"""),format.raw/*583.14*/("""
    """),format.raw/*584.5*/("""ticks : 15,
    tickDecimals : 2
    """),format.raw/*586.5*/("""}"""),format.raw/*586.6*/(""",
    yaxis : """),format.raw/*587.13*/("""{"""),format.raw/*587.14*/("""
    """),format.raw/*588.5*/("""ticks : 15,
    tickDecimals : 0
    """),format.raw/*590.5*/("""}"""),format.raw/*590.6*/(""",
    """),format.raw/*591.5*/("""}"""),format.raw/*591.6*/(""" """),format.raw/*591.7*/(""") ;

    """),format.raw/*593.5*/("""}"""),format.raw/*593.6*/("""

    """),format.raw/*595.5*/("""/* end site stats */

    /* updating chart */

    if ( $ ( '#updating-chart' ).length ) """),format.raw/*599.43*/("""{"""),format.raw/*599.44*/("""

    """),format.raw/*601.5*/("""// For the demo we use generated data, but normally it would be coming from the server
    var data =[ ], totalPoints = 200 ;
    function getRandomData ( ) """),format.raw/*603.32*/("""{"""),format.raw/*603.33*/("""
    """),format.raw/*604.5*/("""if ( data.length > 0 )
    data = data.slice ( 1 ) ;

    // do a random walk
    while ( data.length < totalPoints ) """),format.raw/*608.41*/("""{"""),format.raw/*608.42*/("""
    """),format.raw/*609.5*/("""var prev = data.length > 0 ? data[ data.length - 1 ] : 50 ;
    var y = prev + Math.random ( ) * 10 - 5 ;
    if ( y < 0 )
    y = 0 ;
    if ( y > 100 )
    y = 100 ;
    data.push ( y ) ;
    """),format.raw/*616.5*/("""}"""),format.raw/*616.6*/("""

    """),format.raw/*618.5*/("""// zip the generated y values with the x values
    var res =[ ] ;
    for ( var i = 0 ; i < data.length ; ++ i )
    res.push ([ i, data[ i ] ] )
    return res ;
    """),format.raw/*623.5*/("""}"""),format.raw/*623.6*/("""

    """),format.raw/*625.5*/("""// setup control widget
    var updateInterval = 1000 ;
    $ ( "#updating-chart" ).val ( updateInterval ).change ( function ( ) """),format.raw/*627.74*/("""{"""),format.raw/*627.75*/("""
    """),format.raw/*628.5*/("""var v = $ ( this ).val ( ) ;
    if ( v && ! isNaN ( + v ) ) """),format.raw/*629.33*/("""{"""),format.raw/*629.34*/("""
    """),format.raw/*630.5*/("""updateInterval = + v ;
    if ( updateInterval < 1 )
    updateInterval = 1 ;
    if ( updateInterval > 2000 )
    updateInterval = 2000 ;
    $ ( this ).val ( "" + updateInterval ) ;
    """),format.raw/*636.5*/("""}"""),format.raw/*636.6*/("""
    """),format.raw/*637.5*/("""}"""),format.raw/*637.6*/(""" """),format.raw/*637.7*/(""") ;

    // setup plot
    var options = """),format.raw/*640.19*/("""{"""),format.raw/*640.20*/("""
    """),format.raw/*641.5*/("""yaxis : """),format.raw/*641.13*/("""{"""),format.raw/*641.14*/("""
    """),format.raw/*642.5*/("""min : 0,
    max : 100
    """),format.raw/*644.5*/("""}"""),format.raw/*644.6*/(""",
    xaxis : """),format.raw/*645.13*/("""{"""),format.raw/*645.14*/("""
    """),format.raw/*646.5*/("""min : 0,
    max : 100
    """),format.raw/*648.5*/("""}"""),format.raw/*648.6*/(""",
    colors :[ $chrt_fourth ],
    series : """),format.raw/*650.14*/("""{"""),format.raw/*650.15*/("""
    """),format.raw/*651.5*/("""lines : """),format.raw/*651.13*/("""{"""),format.raw/*651.14*/("""
    """),format.raw/*652.5*/("""lineWidth : 1,
    fill : true,
    fillColor : """),format.raw/*654.17*/("""{"""),format.raw/*654.18*/("""
    """),format.raw/*655.5*/("""colors :[ """),format.raw/*655.15*/("""{"""),format.raw/*655.16*/("""
    """),format.raw/*656.5*/("""opacity : 0.4
    """),format.raw/*657.5*/("""}"""),format.raw/*657.6*/(""", """),format.raw/*657.8*/("""{"""),format.raw/*657.9*/("""
    """),format.raw/*658.5*/("""opacity : 0
    """),format.raw/*659.5*/("""}"""),format.raw/*659.6*/(""" """),format.raw/*659.7*/("""]
    """),format.raw/*660.5*/("""}"""),format.raw/*660.6*/(""",
    steps : false

    """),format.raw/*663.5*/("""}"""),format.raw/*663.6*/("""
    """),format.raw/*664.5*/("""}"""),format.raw/*664.6*/("""
    """),format.raw/*665.5*/("""}"""),format.raw/*665.6*/(""" """),format.raw/*665.7*/(""";
    var plot = $.plot ( $ ( "#updating-chart" ), [ getRandomData ( ) ], options ) ;

    function update ( ) """),format.raw/*668.25*/("""{"""),format.raw/*668.26*/("""
    """),format.raw/*669.5*/("""plot.setData ([ getRandomData ( ) ] ) ;
    // since the axes don't change, we don't need to call plot.setupGrid()
    plot.draw ( ) ;

    setTimeout ( update, updateInterval ) ;
    """),format.raw/*674.5*/("""}"""),format.raw/*674.6*/("""

    """),format.raw/*676.5*/("""update ( ) ;

    """),format.raw/*678.5*/("""}"""),format.raw/*678.6*/("""

    """),format.raw/*680.5*/("""/*end updating chart*/

    """),format.raw/*682.5*/("""}"""),format.raw/*682.6*/(""" """),format.raw/*682.7*/(""";

    // end pagefunction

    // load all flot plugins
    loadScript ( "assets/javascripts/plugin/flot/jquery.flot.cust.js", function ( ) """),format.raw/*687.85*/("""{"""),format.raw/*687.86*/("""
    """),format.raw/*688.5*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.resize.js", function ( ) """),format.raw/*688.87*/("""{"""),format.raw/*688.88*/("""
    """),format.raw/*689.5*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.fillbetween.min.js", function ( ) """),format.raw/*689.96*/("""{"""),format.raw/*689.97*/("""
    """),format.raw/*690.5*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.orderBar.min.js", function ( ) """),format.raw/*690.93*/("""{"""),format.raw/*690.94*/("""
    """),format.raw/*691.5*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.pie.min.js", function ( ) """),format.raw/*691.88*/("""{"""),format.raw/*691.89*/("""
    """),format.raw/*692.5*/("""loadScript ( "assets/javascripts/plugin/flot/jquery.flot.tooltip.js", pagefunction ) ;
    """),format.raw/*693.5*/("""}"""),format.raw/*693.6*/(""" """),format.raw/*693.7*/(""") ;
    """),format.raw/*694.5*/("""}"""),format.raw/*694.6*/(""" """),format.raw/*694.7*/(""") ;
    """),format.raw/*695.5*/("""}"""),format.raw/*695.6*/(""" """),format.raw/*695.7*/(""") ;
    """),format.raw/*696.5*/("""}"""),format.raw/*696.6*/(""" """),format.raw/*696.7*/(""") ;
    """),format.raw/*697.5*/("""}"""),format.raw/*697.6*/(""" """),format.raw/*697.7*/(""") ;


    </script>
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*701.2*/("""
"""),_display_(/*702.2*/main(message,scripts)/*702.23*/ {_display_(Seq[Any](format.raw/*702.25*/("""
    """),format.raw/*703.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa fa-bar-chart-o fa-fw "></i> Graph <span>&gt; Flot Chart</span></h1>
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
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Bar Chart</h2>

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

                                <div id="bar-chart" class="chart" style="padding: 0px; position: relative;"><canvas class="base" width="1021" height="220"></canvas></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Sin Chart</h2>

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

                                <div id="sin-chart" class="chart has-legend" style="padding: 0px; position: relative;"><canvas class="base" width="1021" height="220"></canvas><canvas class="overlay" width="1021" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:-27px;top:205px;width:113px">0</div><div class="tickLabel" style="position:absolute;text-align:center;left:103px;top:205px;width:113px">2</div><div class="tickLabel" style="position:absolute;text-align:center;left:234px;top:205px;width:113px">4</div><div class="tickLabel" style="position:absolute;text-align:center;left:365px;top:205px;width:113px">6</div><div class="tickLabel" style="position:absolute;text-align:center;left:496px;top:205px;width:113px">8</div><div class="tickLabel" style="position:absolute;text-align:center;left:627px;top:205px;width:113px">10</div><div class="tickLabel" style="position:absolute;text-align:center;left:758px;top:205px;width:113px">12</div><div class="tickLabel" style="position:absolute;text-align:center;left:889px;top:205px;width:113px">14</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:179px;right:1002px;width:19px">-1.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:137px;right:1002px;width:19px">-0.5</div><div class="tickLabel" style="position:absolute;text-align:right;top:95px;right:1002px;width:19px">0.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:53px;right:1002px;width:19px">0.5</div><div class="tickLabel" style="position:absolute;text-align:right;top:11px;right:1002px;width:19px">1.0</div></div></div><div class="legend"><div style="position: absolute; width: 112px; height: 15px; top: -22px; right: 5px; opacity: 1;"> </div><table style="position:absolute;top:-22px;right:5px;;font-size: 11px; color:#545454"><tbody><tr><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(101,149,180);overflow:hidden"></div></div></td><td class="legendLabel"><span>sin(x)</span></td><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(126,157,58);overflow:hidden"></div></div></td><td class="legendLabel"><span>cos(x)</span></td></tr></tbody></table></div></div>

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

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-2" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Auto Updating Chart </h2>

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

                                <div id="updating-chart" class="chart" style="padding: 0px; position: relative;"><canvas class="base" width="489" height="220"></canvas><canvas class="overlay" width="489" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:-12px;top:205px;width:81px">0</div><div class="tickLabel" style="position:absolute;text-align:center;left:78px;top:205px;width:81px">20</div><div class="tickLabel" style="position:absolute;text-align:center;left:168px;top:205px;width:81px">40</div><div class="tickLabel" style="position:absolute;text-align:center;left:258px;top:205px;width:81px">60</div><div class="tickLabel" style="position:absolute;text-align:center;left:348px;top:205px;width:81px">80</div><div class="tickLabel" style="position:absolute;text-align:center;left:439px;top:205px;width:81px">100</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:188px;right:471px;width:18px">0</div><div class="tickLabel" style="position:absolute;text-align:right;top:151px;right:471px;width:18px">20</div><div class="tickLabel" style="position:absolute;text-align:right;top:114px;right:471px;width:18px">40</div><div class="tickLabel" style="position:absolute;text-align:right;top:77px;right:471px;width:18px">60</div><div class="tickLabel" style="position:absolute;text-align:right;top:40px;right:471px;width:18px">80</div><div class="tickLabel" style="position:absolute;text-align:right;top:3px;right:471px;width:18px">100</div></div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-6 col-md-6 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-3" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Horizontal Bar Chart </h2>

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

                                <div id="bar-chart-h" class="chart" style="padding: 0px; position: relative;"><canvas class="base" width="489" height="220"></canvas><canvas class="overlay" width="489" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:-11px;top:205px;width:81px">0</div><div class="tickLabel" style="position:absolute;text-align:center;left:91px;top:205px;width:81px">5</div><div class="tickLabel" style="position:absolute;text-align:center;left:193px;top:205px;width:81px">10</div><div class="tickLabel" style="position:absolute;text-align:center;left:295px;top:205px;width:81px">15</div><div class="tickLabel" style="position:absolute;text-align:center;left:398px;top:205px;width:81px">20</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:188px;right:470px;width:19px">-1.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:151px;right:470px;width:19px">0.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:114px;right:470px;width:19px">1.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:77px;right:470px;width:19px">2.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:40px;right:470px;width:19px">3.0</div><div class="tickLabel" style="position:absolute;text-align:right;top:3px;right:470px;width:19px">4.0</div></div></div></div>

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

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-4" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Sales Chart</h2>

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

                                <div id="saleschart" class="chart" style="padding: 0px; position: relative;"><canvas class="base" width="1021" height="220"></canvas><canvas class="overlay" width="1021" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:-5px;top:205px;width:78px">Dec 1</div><div class="tickLabel" style="position:absolute;text-align:center;left:75px;top:205px;width:78px">Dec 8</div><div class="tickLabel" style="position:absolute;text-align:center;left:165px;top:205px;width:78px">Dec 16</div><div class="tickLabel" style="position:absolute;text-align:center;left:256px;top:205px;width:78px">Dec 24</div><div class="tickLabel" style="position:absolute;text-align:center;left:347px;top:205px;width:78px">Jan 1</div><div class="tickLabel" style="position:absolute;text-align:center;left:427px;top:205px;width:78px">Jan 8</div><div class="tickLabel" style="position:absolute;text-align:center;left:518px;top:205px;width:78px">Jan 16</div><div class="tickLabel" style="position:absolute;text-align:center;left:608px;top:205px;width:78px">Jan 24</div><div class="tickLabel" style="position:absolute;text-align:center;left:699px;top:205px;width:78px">Feb 1</div><div class="tickLabel" style="position:absolute;text-align:center;left:779px;top:205px;width:78px">Feb 8</div><div class="tickLabel" style="position:absolute;text-align:center;left:858px;top:205px;width:78px">Feb 15</div><div class="tickLabel" style="position:absolute;text-align:center;left:938px;top:205px;width:78px">Feb 22</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:183px;right:997px;width:24px">0</div><div class="tickLabel" style="position:absolute;text-align:right;top:147px;right:997px;width:24px">1000</div><div class="tickLabel" style="position:absolute;text-align:right;top:110px;right:997px;width:24px">2000</div><div class="tickLabel" style="position:absolute;text-align:right;top:75px;right:997px;width:24px">3000</div><div class="tickLabel" style="position:absolute;text-align:right;top:39px;right:997px;width:24px">4000</div><div class="tickLabel" style="position:absolute;text-align:right;top:3px;right:997px;width:24px">5000</div></div></div></div>

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

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-8 col-md-7 col-lg-7">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-5" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar"""),
format.raw("""-chart-o"></i> </span>
                            <h2>Plot Percentiles</h2>

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

                                <div id="fill-chart" class="chart has-legend" style="padding: 0px; position: relative;"><canvas class="base" width="578" height="220"></canvas><canvas class="overlay" width="578" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:18px;top:205px;width:57px">2</div><div class="tickLabel" style="position:absolute;text-align:center;left:79px;top:205px;width:57px">4</div><div class="tickLabel" style="position:absolute;text-align:center;left:140px;top:205px;width:57px">6</div><div class="tickLabel" style="position:absolute;text-align:center;left:202px;top:205px;width:57px">8</div><div class="tickLabel" style="position:absolute;text-align:center;left:263px;top:205px;width:57px">10</div><div class="tickLabel" style="position:absolute;text-align:center;left:325px;top:205px;width:57px">12</div><div class="tickLabel" style="position:absolute;text-align:center;left:386px;top:205px;width:57px">14</div><div class="tickLabel" style="position:absolute;text-align:center;left:447px;top:205px;width:57px">16</div><div class="tickLabel" style="position:absolute;text-align:center;left:509px;top:205px;width:57px">18</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:188px;right:542px;width:36px">75 cm</div><div class="tickLabel" style="position:absolute;text-align:right;top:151px;right:542px;width:36px">100 cm</div><div class="tickLabel" style="position:absolute;text-align:right;top:114px;right:542px;width:36px">125 cm</div><div class="tickLabel" style="position:absolute;text-align:right;top:77px;right:542px;width:36px">150 cm</div><div class="tickLabel" style="position:absolute;text-align:right;top:40px;right:542px;width:36px">175 cm</div><div class="tickLabel" style="position:absolute;text-align:right;top:3px;right:542px;width:36px">200 cm</div></div></div><div class="legend"><div style="position: absolute; width: 180px; height: 15px; top: -22px; right: 5px; opacity: 1;"> </div><table style="position:absolute;top:-22px;right:5px;;font-size: 11px; color:#545454"><tbody><tr><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(255,50,50);overflow:hidden"></div></div></td><td class="legendLabel"><span>female mean</span></td><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(50,50,255);overflow:hidden"></div></div></td><td class="legendLabel"><span>male mean</span></td></tr></tbody></table></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-4 col-md-5 col-lg-5">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-6" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Pie Chart</h2>

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

                                <div id="pie-chart" class="chart" style="padding: 0px; position: relative;"><canvas class="base" width="400" height="220"></canvas><canvas class="overlay" width="400" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="legend"><div style="position: absolute; width: 64px; height: 105px; top: 10px; right: 5px; background-color: rgb(239, 239, 239); opacity: 1;"> </div><table style="position:absolute;top:10px;right:5px;;font-size: 11px; color:#545454"><tbody><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(147,19,19);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series1</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(99,129,103);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series2</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(101,89,107);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series3</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(96,116,124);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series4</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(176,155,91);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series5</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(117,15,15);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series6</span></td></tr><tr><td class="legendColorBox"><div style="#000"><div style="border:2px solid rgb(79,103,82);overflow:hidden"></div></div></td><td class="legendLabel"><span>Series7</span></td></tr></tbody></table></div></div>

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

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-7" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Site Stats Chart</h2>

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

                                <div id="site-stats" class="chart has-legend" style="padding: 0px; position: relative;"><canvas class="base" width="1021" height="220"></canvas><canvas class="overlay" width="1021" height="220" style="position: absolute; left: 0px; top: 0px;"></canvas><div class="tickLabels" style="font-size:smaller"><div class="xAxis x1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:center;left:37px;top:205px;width:78px">2.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:122px;top:205px;width:78px">4.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:207px;top:205px;width:78px">6.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:292px;top:205px;width:78px">8.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:377px;top:205px;width:78px">10.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:462px;top:205px;width:78px">12.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:547px;top:205px;width:78px">14.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:632px;top:205px;width:78px">16.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:717px;top:205px;width:78px">18.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:802px;top:205px;width:78px">20.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:887px;top:205px;width:78px">22.00</div><div class="tickLabel" style="position:absolute;text-align:center;left:972px;top:205px;width:78px">24.00</div></div><div class="yAxis y1Axis" style="color:#545454"><div class="tickLabel" style="position:absolute;text-align:right;top:187px;right:1003px;width:18px">20</div><div class="tickLabel" style="position:absolute;text-align:right;top:177px;right:1003px;width:18px">30</div><div class="tickLabel" style="position:absolute;text-align:right;top:167px;right:1003px;width:18px">40</div><div class="tickLabel" style="position:absolute;text-align:right;top:157px;right:1003px;width:18px">50</div><div class="tickLabel" style="position:absolute;text-align:right;top:146px;right:1003px;width:18px">60</div><div class="tickLabel" style="position:absolute;text-align:right;top:136px;right:1003px;width:18px">70</div><div class="tickLabel" style="position:absolute;text-align:right;top:126px;right:1003px;width:18px">80</div><div class="tickLabel" style="position:absolute;text-align:right;top:116px;right:1003px;width:18px">90</div><div class="tickLabel" style="position:absolute;text-align:right;top:105px;right:1003px;width:18px">100</div><div class="tickLabel" style="position:absolute;text-align:right;top:95px;right:1003px;width:18px">110</div><div class="tickLabel" style="position:absolute;text-align:right;top:85px;right:1003px;width:18px">120</div><div class="tickLabel" style="position:absolute;text-align:right;top:74px;right:1003px;width:18px">130</div><div class="tickLabel" style="position:absolute;text-align:right;top:64px;right:1003px;width:18px">140</div><div class="tickLabel" style="position:absolute;text-align:right;top:54px;right:1003px;width:18px">150</div><div class="tickLabel" style="position:absolute;text-align:right;top:44px;right:1003px;width:18px">160</div><div class="tickLabel" style="position:absolute;text-align:right;top:33px;right:1003px;width:18px">170</div><div class="tickLabel" style="position:absolute;text-align:right;top:23px;right:1003px;width:18px">180</div><div class="tickLabel" style="position:absolute;text-align:right;top:13px;right:1003px;width:18px">190</div><div class="tickLabel" style="position:absolute;text-align:right;top:3px;right:1003px;width:18px">200</div></div></div><div class="legend"><div style="position: absolute; width: 196px; height: 15px; top: -22px; right: 5px; opacity: 1;"> </div><table style="position:absolute;top:-22px;right:5px;;font-size: 11px; color:#545454"><tbody><tr><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(226,73,19);overflow:hidden"></div></div></td><td class="legendLabel"><span>Your pageviews</span></td><td class="legendColorBox"><div style=""><div style="border:2px solid rgb(101,149,180);overflow:hidden"></div></div></td><td class="legendLabel"><span>Site visitors</span></td></tr></tbody></table></div></div>

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
                  DATE: Thu Aug 28 21:08:46 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/flot.scala.html
                  HASH: 689644929e9d47189e41888907c46d36b371c9da
                  MATRIX: 509->1|597->20|611->27|691->31|722->36|1122->408|1151->409|1180->410|1225->427|1254->428|1780->926|1809->927|1842->933|2315->1378|2344->1379|2376->1384|4654->3634|4683->3635|4715->3640|5025->3923|5053->3924|5085->3929|5238->4054|5267->4055|5299->4060|5335->4068|5364->4069|5396->4074|5474->4125|5502->4126|5534->4131|5562->4132|5590->4133|5660->4176|5688->4177|5716->4178|5801->4236|5829->4237|5862->4243|5904->4257|5933->4258|5965->4263|6001->4271|6030->4272|6062->4277|6127->4315|6155->4316|6198->4331|6227->4332|6259->4337|6295->4345|6324->4346|6356->4351|6449->4416|6478->4417|6510->4422|6548->4432|6577->4433|6609->4438|6654->4456|6682->4457|6711->4459|6739->4460|6771->4465|6817->4484|6845->4485|6873->4486|6906->4492|6934->4493|6967->4498|6996->4499|7041->4515|7071->4516|7101->4517|7141->4528|7171->4529|7224->4554|7253->4555|7300->4573|7330->4574|7363->4579|7406->4594|7435->4595|7477->4608|7507->4609|7540->4614|7707->4753|7736->4754|7805->4794|7835->4795|7868->4800|8015->4919|8044->4920|8109->4957|8138->4958|8167->4959|8266->5030|8295->5031|8324->5032|8441->5120|8471->5121|8504->5126|8600->5193|8630->5194|8663->5199|8771->5279|8800->5280|8834->5286|8905->5328|8935->5329|8968->5334|9033->5371|9062->5372|9092->5374|9121->5375|9154->5380|9219->5417|9248->5418|9277->5419|9309->5422|9339->5423|9372->5428|9410->5437|9440->5438|9473->5443|9510->5451|9540->5452|9573->5457|9617->5473|9646->5474|9690->5489|9720->5490|9753->5495|9797->5511|9826->5512|9859->5517|9888->5518|9930->5531|9960->5532|9993->5537|10160->5676|10189->5677|10258->5717|10288->5718|10321->5723|10431->5805|10460->5806|10547->5864|10577->5865|10610->5870|10669->5901|10698->5902|10741->5916|10771->5917|10804->5922|10858->5948|10887->5949|10920->5954|10949->5955|10978->5956|11085->6034|11115->6035|11148->6040|11189->6052|11219->6053|11252->6058|11440->6218|11469->6219|11502->6224|11531->6225|11560->6226|11596->6234|11625->6235|11659->6241|11767->6320|11797->6321|11831->6327|12272->6739|12302->6740|12335->6745|12389->6770|12419->6771|12452->6776|12532->6828|12561->6829|12594->6834|12623->6835|12652->6836|12699->6854|12729->6855|12762->6860|12816->6885|12846->6886|12879->6891|12958->6942|12987->6943|13020->6948|13049->6949|13078->6950|13125->6968|13155->6969|13188->6974|13242->6999|13272->7000|13305->7005|13384->7056|13413->7057|13446->7062|13475->7063|13504->7064|13595->7126|13625->7127|13658->7132|13754->7199|13784->7200|13817->7205|14001->7361|14030->7362|14118->7421|14148->7422|14181->7427|14279->7497|14308->7498|14342->7504|14371->7505|14400->7506|14437->7515|14466->7516|14500->7522|14611->7604|14641->7605|14674->7610|15140->8047|15170->8048|15203->8053|15256->8077|15286->8078|15319->8083|15422->8158|15451->8159|15484->8164|15513->8165|15542->8166|15591->8186|15621->8187|15654->8192|15707->8216|15737->8217|15770->8222|15872->8296|15901->8297|15934->8302|15963->8303|15992->8304|16041->8324|16071->8325|16104->8330|16157->8354|16187->8355|16220->8360|16322->8434|16351->8435|16384->8440|16413->8441|16442->8442|16538->8509|16568->8510|16601->8515|16697->8582|16727->8583|16760->8588|16944->8744|16973->8745|17061->8804|17091->8805|17124->8810|17222->8880|17251->8881|17284->8886|17313->8887|17342->8888|17379->8897|17408->8898|17442->8904|17551->8984|17581->8985|17614->8990|17655->9002|17685->9003|17718->9008|19940->11202|19969->11203|19998->11204|20048->11225|20078->11226|20111->11231|22333->13425|22362->13426|22391->13427|22442->13449|22472->13450|22505->13455|22599->13520|22629->13521|22662->13526|22706->13542|22735->13543|22798->13578|22827->13579|22857->13581|22886->13582|22919->13587|23002->13641|23032->13642|23065->13647|23146->13700|23175->13701|23238->13736|23267->13737|23297->13739|23326->13740|23359->13745|23442->13799|23472->13800|23505->13805|23584->13856|23613->13857|23702->13918|23731->13919|23761->13921|23790->13922|23823->13927|23906->13981|23936->13982|23969->13987|24070->14060|24099->14061|24188->14122|24217->14123|24247->14125|24276->14126|24309->14131|24392->14185|24422->14186|24455->14191|24534->14242|24563->14243|24652->14304|24681->14305|24711->14307|24740->14308|24773->14313|24856->14367|24886->14368|24919->14373|24998->14424|25027->14425|25116->14486|25145->14487|25175->14489|25204->14490|25237->14495|25327->14556|25357->14557|25390->14562|25434->14578|25463->14579|25526->14614|25555->14615|25585->14617|25614->14618|25647->14623|25728->14675|25758->14676|25791->14681|25872->14734|25901->14735|25964->14770|25993->14771|26023->14773|26052->14774|26085->14779|26166->14831|26196->14832|26229->14837|26308->14888|26337->14889|26426->14950|26455->14951|26485->14953|26514->14954|26547->14959|26628->15011|26658->15012|26691->15017|26792->15090|26821->15091|26910->15152|26939->15153|26969->15155|26998->15156|27031->15161|27112->15213|27142->15214|27175->15219|27254->15270|27283->15271|27372->15332|27401->15333|27431->15335|27460->15336|27493->15341|27574->15393|27604->15394|27637->15399|27716->15450|27745->15451|27834->15512|27863->15513|27892->15514|27967->15560|27997->15561|28031->15567|28068->15575|28098->15576|28131->15581|28180->15602|28209->15603|28253->15618|28283->15619|28316->15624|28376->15655|28406->15656|28439->15661|28490->15684|28519->15685|28552->15690|28581->15691|28616->15698|28645->15699|28674->15700|28710->15708|28739->15709|28773->15715|28882->15795|28912->15796|28946->15802|29096->15923|29126->15924|29159->15929|29204->15945|29234->15946|29267->15951|29381->16037|29410->16038|29443->16043|29472->16044|29506->16050|29574->16089|29604->16090|29637->16095|29675->16104|29705->16105|29738->16110|29773->16116|29803->16117|29836->16122|29929->16186|29959->16187|29992->16192|30098->16269|30128->16270|30161->16275|30338->16424|30367->16425|30421->16451|30450->16452|30483->16457|30512->16458|30545->16463|30574->16464|30618->16479|30648->16480|30681->16485|31296->17072|31325->17073|31367->17086|31397->17087|31430->17092|31501->17135|31530->17136|31564->17142|31593->17143|31622->17144|31659->17153|31688->17154|31722->17160|31838->17247|31868->17248|31902->17254|32618->17941|32648->17942|32681->17947|32760->17998|32789->17999|32819->18001|32848->18002|32881->18007|32958->18056|32987->18057|33016->18058|33048->18061|33078->18062|33111->18067|33149->18076|33179->18077|33212->18082|33249->18090|33279->18091|33312->18096|33406->18161|33436->18162|33469->18167|33508->18177|33538->18178|33571->18183|33617->18201|33646->18202|33676->18204|33705->18205|33738->18210|33785->18229|33814->18230|33843->18231|33877->18237|33906->18238|33939->18243|33968->18244|34012->18259|34042->18260|34075->18265|34119->18281|34148->18282|34201->18307|34230->18308|34273->18322|34303->18323|34336->18328|34403->18367|34432->18368|34477->18384|34507->18385|34540->18390|34601->18423|34630->18424|34659->18425|34702->18439|34732->18440|34765->18445|34932->18584|34961->18585|35030->18625|35060->18626|35093->18631|35225->18735|35254->18736|35339->18792|35369->18793|35402->18798|35467->18835|35496->18836|35539->18850|35569->18851|35602->18856|35667->18893|35696->18894|35730->18900|35759->18901|35788->18902|35825->18911|35854->18912|35888->18918|36007->19008|36037->19009|36071->19015|36257->19172|36287->19173|36320->19178|36467->19296|36497->19297|36530->19302|36752->19496|36781->19497|36815->19503|37011->19671|37040->19672|37074->19678|37232->19807|37262->19808|37295->19813|37385->19874|37415->19875|37448->19880|37664->20068|37693->20069|37726->20074|37755->20075|37784->20076|37854->20117|37884->20118|37917->20123|37954->20131|37984->20132|38017->20137|38072->20164|38101->20165|38144->20179|38174->20180|38207->20185|38262->20212|38291->20213|38365->20258|38395->20259|38428->20264|38465->20272|38495->20273|38528->20278|38605->20326|38635->20327|38668->20332|38707->20342|38737->20343|38770->20348|38816->20366|38845->20367|38875->20369|38904->20370|38937->20375|38981->20391|39010->20392|39039->20393|39073->20399|39102->20400|39155->20425|39184->20426|39217->20431|39246->20432|39279->20437|39308->20438|39337->20439|39477->20550|39507->20551|39540->20556|39752->20740|39781->20741|39815->20747|39861->20765|39890->20766|39924->20772|39980->20800|40009->20801|40038->20802|40208->20943|40238->20944|40271->20949|40382->21031|40412->21032|40445->21037|40565->21128|40595->21129|40628->21134|40745->21222|40775->21223|40808->21228|40920->21311|40950->21312|40983->21317|41102->21408|41131->21409|41160->21410|41196->21418|41225->21419|41254->21420|41290->21428|41319->21429|41348->21430|41384->21438|41413->21439|41442->21440|41478->21448|41507->21449|41536->21450|41596->18|41625->21471|41654->21473|41685->21494|41726->21496|41759->21501
                  LINES: 19->1|21->2|21->2|23->2|24->3|37->16|37->16|37->16|37->16|37->16|60->39|60->39|62->41|74->53|74->53|75->54|80->59|80->59|81->60|89->68|89->68|90->69|92->71|92->71|93->72|93->72|93->72|94->73|96->75|96->75|97->76|97->76|97->76|99->78|99->78|99->78|102->81|102->81|104->83|104->83|104->83|105->84|105->84|105->84|106->85|108->87|108->87|109->88|109->88|110->89|110->89|110->89|111->90|114->93|114->93|115->94|115->94|115->94|116->95|117->96|117->96|117->96|117->96|118->97|119->98|119->98|119->98|120->99|120->99|121->100|121->100|122->101|122->101|122->101|122->101|122->101|124->103|124->103|125->104|125->104|126->105|127->106|127->106|128->107|128->107|129->108|134->113|134->113|136->115|136->115|137->116|140->119|140->119|143->122|143->122|143->122|146->125|146->125|146->125|152->131|152->131|153->132|154->133|154->133|155->134|157->136|157->136|159->138|159->138|159->138|160->139|162->141|162->141|162->141|162->141|163->142|165->144|165->144|165->144|165->144|165->144|166->145|166->145|166->145|167->146|167->146|167->146|168->147|169->148|169->148|170->149|170->149|171->150|172->151|172->151|173->152|173->152|174->153|174->153|175->154|180->159|180->159|182->161|182->161|183->162|185->164|185->164|187->166|187->166|188->167|190->169|190->169|191->170|191->170|192->171|194->173|194->173|195->174|195->174|195->174|197->176|197->176|198->177|198->177|198->177|199->178|201->180|201->180|202->181|202->181|202->181|203->182|203->182|205->184|209->188|209->188|211->190|225->204|225->204|226->205|227->206|227->206|228->207|231->210|231->210|232->211|232->211|232->211|233->212|233->212|234->213|235->214|235->214|236->215|239->218|239->218|240->219|240->219|240->219|241->220|241->220|242->221|243->222|243->222|244->223|247->226|247->226|248->227|248->227|248->227|251->230|251->230|252->231|253->232|253->232|254->233|260->239|260->239|263->242|263->242|264->243|266->245|266->245|268->247|268->247|268->247|270->249|270->249|272->251|275->254|275->254|276->255|290->269|290->269|291->270|292->271|292->271|293->272|297->276|297->276|298->277|298->277|298->277|299->278|299->278|300->279|301->280|301->280|302->281|306->285|306->285|307->286|307->286|307->286|308->287|308->287|309->288|310->289|310->289|311->290|315->294|315->294|316->295|316->295|316->295|319->298|319->298|320->299|321->300|321->300|322->301|328->307|328->307|331->310|331->310|332->311|334->313|334->313|335->314|335->314|335->314|337->316|337->316|339->318|343->322|343->322|344->323|344->323|344->323|345->324|353->332|353->332|353->332|355->334|355->334|356->335|364->343|364->343|364->343|366->345|366->345|367->346|369->348|369->348|370->349|371->350|371->350|373->352|373->352|373->352|373->352|374->353|376->355|376->355|377->356|380->359|380->359|382->361|382->361|382->361|382->361|383->362|385->364|385->364|386->365|389->368|389->368|392->371|392->371|392->371|392->371|393->372|395->374|395->374|396->375|400->379|400->379|403->382|403->382|403->382|403->382|404->383|406->385|406->385|407->386|410->389|410->389|413->392|413->392|413->392|413->392|414->393|416->395|416->395|417->396|420->399|420->399|423->402|423->402|423->402|423->402|424->403|426->405|426->405|427->406|428->407|428->407|430->409|430->409|430->409|430->409|431->410|433->412|433->412|434->413|437->416|437->416|439->418|439->418|439->418|439->418|440->419|442->421|442->421|443->422|446->425|446->425|449->428|449->428|449->428|449->428|450->429|452->431|452->431|453->432|457->436|457->436|460->439|460->439|460->439|460->439|461->440|463->442|463->442|464->443|467->446|467->446|470->449|470->449|470->449|470->449|471->450|473->452|473->452|474->453|477->456|477->456|480->459|480->459|480->459|482->461|482->461|484->463|484->463|484->463|485->464|486->465|486->465|488->467|488->467|489->468|489->468|489->468|490->469|491->470|491->470|492->471|492->471|494->473|494->473|494->473|495->474|495->474|497->476|501->480|501->480|503->482|505->484|505->484|506->485|506->485|506->485|507->486|509->488|509->488|510->489|510->489|512->491|512->491|512->491|513->492|513->492|513->492|514->493|514->493|514->493|515->494|518->497|518->497|519->498|521->500|521->500|522->501|523->502|523->502|525->504|525->504|526->505|526->505|527->506|527->506|528->507|528->507|529->508|538->517|538->517|539->518|539->518|540->519|542->521|542->521|543->522|543->522|543->522|545->524|545->524|547->526|551->530|551->530|553->532|556->535|556->535|557->536|559->538|559->538|559->538|559->538|560->539|562->541|562->541|562->541|562->541|562->541|563->542|563->542|563->542|564->543|564->543|564->543|565->544|568->547|568->547|569->548|569->548|569->548|570->549|571->550|571->550|571->550|571->550|572->551|573->552|573->552|573->552|574->553|574->553|575->554|575->554|576->555|576->555|577->556|578->557|578->557|580->559|580->559|581->560|581->560|582->561|584->563|584->563|586->565|586->565|587->566|589->568|589->568|589->568|590->569|590->569|591->570|596->575|596->575|598->577|598->577|599->578|602->581|602->581|604->583|604->583|605->584|607->586|607->586|608->587|608->587|609->588|611->590|611->590|612->591|612->591|612->591|614->593|614->593|616->595|620->599|620->599|622->601|624->603|624->603|625->604|629->608|629->608|630->609|637->616|637->616|639->618|644->623|644->623|646->625|648->627|648->627|649->628|650->629|650->629|651->630|657->636|657->636|658->637|658->637|658->637|661->640|661->640|662->641|662->641|662->641|663->642|665->644|665->644|666->645|666->645|667->646|669->648|669->648|671->650|671->650|672->651|672->651|672->651|673->652|675->654|675->654|676->655|676->655|676->655|677->656|678->657|678->657|678->657|678->657|679->658|680->659|680->659|680->659|681->660|681->660|684->663|684->663|685->664|685->664|686->665|686->665|686->665|689->668|689->668|690->669|695->674|695->674|697->676|699->678|699->678|701->680|703->682|703->682|703->682|708->687|708->687|709->688|709->688|709->688|710->689|710->689|710->689|711->690|711->690|711->690|712->691|712->691|712->691|713->692|714->693|714->693|714->693|715->694|715->694|715->694|716->695|716->695|716->695|717->696|717->696|717->696|718->697|718->697|718->697|723->1|724->701|725->702|725->702|725->702|726->703
                  -- GENERATED --
              */
          