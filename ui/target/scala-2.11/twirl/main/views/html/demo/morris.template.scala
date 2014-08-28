
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
object morris extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

    // pagefunction

    var pagefunction = function ( ) """),format.raw/*41.37*/("""{"""),format.raw/*41.38*/("""

    """),format.raw/*43.5*/("""// sales graph
    if ( $ ( '#sales-graph' ).length ) """),format.raw/*44.40*/("""{"""),format.raw/*44.41*/("""

    """),format.raw/*46.5*/("""Morris.Area ( """),format.raw/*46.19*/("""{"""),format.raw/*46.20*/("""
    """),format.raw/*47.5*/("""element : 'sales-graph',
    data :[ """),format.raw/*48.13*/("""{"""),format.raw/*48.14*/("""
    """),format.raw/*49.5*/("""period : '2010 Q1',
    iphone : 2666,
    ipad : null,
    itouch : 2647
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""", """),format.raw/*53.8*/("""{"""),format.raw/*53.9*/("""
    """),format.raw/*54.5*/("""period : '2010 Q2',
    iphone : 2778,
    ipad : 2294,
    itouch : 2441
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""", """),format.raw/*58.8*/("""{"""),format.raw/*58.9*/("""
    """),format.raw/*59.5*/("""period : '2010 Q3',
    iphone : 4912,
    ipad : 1969,
    itouch : 2501
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""", """),format.raw/*63.8*/("""{"""),format.raw/*63.9*/("""
    """),format.raw/*64.5*/("""period : '2010 Q4',
    iphone : 3767,
    ipad : 3597,
    itouch : 5689
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""", """),format.raw/*68.8*/("""{"""),format.raw/*68.9*/("""
    """),format.raw/*69.5*/("""period : '2011 Q1',
    iphone : 6810,
    ipad : 1914,
    itouch : 2293
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""", """),format.raw/*73.8*/("""{"""),format.raw/*73.9*/("""
    """),format.raw/*74.5*/("""period : '2011 Q2',
    iphone : 5670,
    ipad : 4293,
    itouch : 1881
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""", """),format.raw/*78.8*/("""{"""),format.raw/*78.9*/("""
    """),format.raw/*79.5*/("""period : '2011 Q3',
    iphone : 4820,
    ipad : 3795,
    itouch : 1588
    """),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""", """),format.raw/*83.8*/("""{"""),format.raw/*83.9*/("""
    """),format.raw/*84.5*/("""period : '2011 Q4',
    iphone : 15073,
    ipad : 5967,
    itouch : 5175
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""", """),format.raw/*88.8*/("""{"""),format.raw/*88.9*/("""
    """),format.raw/*89.5*/("""period : '2012 Q1',
    iphone : 10687,
    ipad : 4460,
    itouch : 2028
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""", """),format.raw/*93.8*/("""{"""),format.raw/*93.9*/("""
    """),format.raw/*94.5*/("""period : '2012 Q2',
    iphone : 8432,
    ipad : 5713,
    itouch : 1791
    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/(""" """),format.raw/*98.7*/("""],
    xkey : 'period',
    ykeys :[ 'iphone', 'ipad', 'itouch' ],
    labels :[ 'iPhone', 'iPad', 'iPod Touch' ],
    pointSize : 2,
    hideHover : 'auto'
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/(""" """),format.raw/*104.7*/(""") ;

    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""

    """),format.raw/*108.5*/("""// area graph
    if ( $ ( '#area-graph' ).length ) """),format.raw/*109.39*/("""{"""),format.raw/*109.40*/("""
    """),format.raw/*110.5*/("""Morris.Area ( """),format.raw/*110.19*/("""{"""),format.raw/*110.20*/("""
    """),format.raw/*111.5*/("""element : 'area-graph',
    data :[ """),format.raw/*112.13*/("""{"""),format.raw/*112.14*/(""" """),format.raw/*112.15*/("""x : '2011 Q1', y : 3, z : 3 """),format.raw/*112.43*/("""}"""),format.raw/*112.44*/(""", """),format.raw/*112.46*/("""{"""),format.raw/*112.47*/(""" """),format.raw/*112.48*/("""x : '2011 Q2', y : 2, z : 0 """),format.raw/*112.76*/("""}"""),format.raw/*112.77*/(""", """),format.raw/*112.79*/("""{"""),format.raw/*112.80*/(""" """),format.raw/*112.81*/("""x : '2011 Q3', y : 0, z : 2 """),format.raw/*112.109*/("""}"""),format.raw/*112.110*/(""", """),format.raw/*112.112*/("""{"""),format.raw/*112.113*/(""" """),format.raw/*112.114*/("""x : '2011 Q4', y : 4, z : 4 """),format.raw/*112.142*/("""}"""),format.raw/*112.143*/("""
    """),format.raw/*113.5*/("""],
    xkey : 'x',
    ykeys :[ 'y', 'z' ],
    labels :[ 'Y', 'Z' ]
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""" """),format.raw/*117.7*/(""") ;
    """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""

    """),format.raw/*120.5*/("""// bar graph color
    if ( $ ( '#bar-graph' ).length ) """),format.raw/*121.38*/("""{"""),format.raw/*121.39*/("""

    """),format.raw/*123.5*/("""Morris.Bar ( """),format.raw/*123.18*/("""{"""),format.raw/*123.19*/("""
    """),format.raw/*124.5*/("""element : 'bar-graph',
    data :[ """),format.raw/*125.13*/("""{"""),format.raw/*125.14*/(""" """),format.raw/*125.15*/("""x : '2011 Q1', y : 0 """),format.raw/*125.36*/("""}"""),format.raw/*125.37*/(""", """),format.raw/*125.39*/("""{"""),format.raw/*125.40*/(""" """),format.raw/*125.41*/("""x : '2011 Q2', y : 1 """),format.raw/*125.62*/("""}"""),format.raw/*125.63*/(""", """),format.raw/*125.65*/("""{"""),format.raw/*125.66*/(""" """),format.raw/*125.67*/("""x : '2011 Q3', y : 2 """),format.raw/*125.88*/("""}"""),format.raw/*125.89*/(""", """),format.raw/*125.91*/("""{"""),format.raw/*125.92*/(""" """),format.raw/*125.93*/("""x : '2011 Q4', y : 3 """),format.raw/*125.114*/("""}"""),format.raw/*125.115*/(""", """),format.raw/*125.117*/("""{"""),format.raw/*125.118*/(""" """),format.raw/*125.119*/("""x : '2012 Q1', y : 4 """),format.raw/*125.140*/("""}"""),format.raw/*125.141*/(""", """),format.raw/*125.143*/("""{"""),format.raw/*125.144*/(""" """),format.raw/*125.145*/("""x : '2012 Q2', y : 5 """),format.raw/*125.166*/("""}"""),format.raw/*125.167*/(""", """),format.raw/*125.169*/("""{"""),format.raw/*125.170*/(""" """),format.raw/*125.171*/("""x : '2012 Q3', y : 6 """),format.raw/*125.192*/("""}"""),format.raw/*125.193*/(""", """),format.raw/*125.195*/("""{"""),format.raw/*125.196*/(""" """),format.raw/*125.197*/("""x : '2012 Q4', y : 7 """),format.raw/*125.218*/("""}"""),format.raw/*125.219*/(""", """),format.raw/*125.221*/("""{"""),format.raw/*125.222*/(""" """),format.raw/*125.223*/("""x : '2013 Q1', y : 8 """),format.raw/*125.244*/("""}"""),format.raw/*125.245*/("""
    """),format.raw/*126.5*/("""],
    xkey : 'x',
    ykeys :[ 'y' ],
    labels :[ 'Y' ],
    barColors : function ( row, series, type ) """),format.raw/*130.48*/("""{"""),format.raw/*130.49*/("""
    """),format.raw/*131.5*/("""if ( type === 'bar' ) """),format.raw/*131.27*/("""{"""),format.raw/*131.28*/("""
    """),format.raw/*132.5*/("""var red = Math.ceil ( 150 * row.y / this.ymax ) ;
    return 'rgb(' + red + ',0,0)' ;
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/("""
    """),format.raw/*135.5*/("""else """),format.raw/*135.10*/("""{"""),format.raw/*135.11*/("""
    """),format.raw/*136.5*/("""return '#000' ;
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/("""
    """),format.raw/*138.5*/("""}"""),format.raw/*138.6*/("""
    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/(""" """),format.raw/*139.7*/(""") ;

    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""

    """),format.raw/*143.5*/("""// Use Morris.Bar
    if ( $ ( '#normal-bar-graph' ).length ) """),format.raw/*144.45*/("""{"""),format.raw/*144.46*/("""

    """),format.raw/*146.5*/("""Morris.Bar ( """),format.raw/*146.18*/("""{"""),format.raw/*146.19*/("""
    """),format.raw/*147.5*/("""element : 'normal-bar-graph',
    data :[ """),format.raw/*148.13*/("""{"""),format.raw/*148.14*/(""" """),format.raw/*148.15*/("""x : '2011 Q1', y : 3, z : 2, a : 3 """),format.raw/*148.50*/("""}"""),format.raw/*148.51*/(""", """),format.raw/*148.53*/("""{"""),format.raw/*148.54*/(""" """),format.raw/*148.55*/("""x : '2011 Q2', y : 2, z : null, a : 1 """),format.raw/*148.93*/("""}"""),format.raw/*148.94*/(""", """),format.raw/*148.96*/("""{"""),format.raw/*148.97*/(""" """),format.raw/*148.98*/("""x : '2011 Q3', y : 0, z : 2, a : 4 """),format.raw/*148.133*/("""}"""),format.raw/*148.134*/(""", """),format.raw/*148.136*/("""{"""),format.raw/*148.137*/(""" """),format.raw/*148.138*/("""x : '2011 Q4', y : 2, z : 4, a : 3 """),format.raw/*148.173*/("""}"""),format.raw/*148.174*/("""
    """),format.raw/*149.5*/("""],
    xkey : 'x',
    ykeys :[ 'y', 'z', 'a' ],
    labels :[ 'Y', 'Z', 'A' ]
    """),format.raw/*153.5*/("""}"""),format.raw/*153.6*/(""" """),format.raw/*153.7*/(""") ;

    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/("""

    """),format.raw/*157.5*/("""// Use Morris.Bar 2
    if ( $ ( '#noline-bar-graph' ).length ) """),format.raw/*158.45*/("""{"""),format.raw/*158.46*/("""
    """),format.raw/*159.5*/("""Morris.Bar ( """),format.raw/*159.18*/("""{"""),format.raw/*159.19*/("""
    """),format.raw/*160.5*/("""element : 'noline-bar-graph',
    axes : false,
    data :[ """),format.raw/*162.13*/("""{"""),format.raw/*162.14*/(""" """),format.raw/*162.15*/("""x : '2011 Q1', y : 3, z : 2, a : 3 """),format.raw/*162.50*/("""}"""),format.raw/*162.51*/(""", """),format.raw/*162.53*/("""{"""),format.raw/*162.54*/(""" """),format.raw/*162.55*/("""x : '2011 Q2', y : 2, z : null, a : 1 """),format.raw/*162.93*/("""}"""),format.raw/*162.94*/(""", """),format.raw/*162.96*/("""{"""),format.raw/*162.97*/(""" """),format.raw/*162.98*/("""x : '2011 Q3', y : 0, z : 2, a : 4 """),format.raw/*162.133*/("""}"""),format.raw/*162.134*/(""", """),format.raw/*162.136*/("""{"""),format.raw/*162.137*/(""" """),format.raw/*162.138*/("""x : '2011 Q4', y : 2, z : 4, a : 3 """),format.raw/*162.173*/("""}"""),format.raw/*162.174*/("""
    """),format.raw/*163.5*/("""],
    xkey : 'x',
    ykeys :[ 'y', 'z', 'a' ],
    labels :[ 'Y', 'Z', 'A' ]
    """),format.raw/*167.5*/("""}"""),format.raw/*167.6*/(""" """),format.raw/*167.7*/(""") ;
    """),format.raw/*168.5*/("""}"""),format.raw/*168.6*/("""

    """),format.raw/*170.5*/("""/* data stolen from http://howmanyleft.co.uk/vehicle/jaguar_'e'_type */
    if ( $ ( '#year-graph' ).length ) """),format.raw/*171.39*/("""{"""),format.raw/*171.40*/("""
    """),format.raw/*172.5*/("""var day_data =[ """),format.raw/*172.21*/("""{"""),format.raw/*172.22*/(""" """),format.raw/*172.23*/(""""period" : "2012-10-01", "licensed" : 3407, "sorned" : 660 """),format.raw/*172.82*/("""}"""),format.raw/*172.83*/(""", """),format.raw/*172.85*/("""{"""),format.raw/*172.86*/(""" """),format.raw/*172.87*/(""""period" : "2012-09-30", "licensed" : 3351, "sorned" : 629 """),format.raw/*172.146*/("""}"""),format.raw/*172.147*/(""", """),format.raw/*172.149*/("""{"""),format.raw/*172.150*/(""" """),format.raw/*172.151*/(""""period" : "2012-09-29", "licensed" : 3269, "sorned" : 618 """),format.raw/*172.210*/("""}"""),format.raw/*172.211*/(""", """),format.raw/*172.213*/("""{"""),format.raw/*172.214*/(""" """),format.raw/*172.215*/(""""period" : "2012-09-20", "licensed" : 3246, "sorned" : 661 """),format.raw/*172.274*/("""}"""),format.raw/*172.275*/(""", """),format.raw/*172.277*/("""{"""),format.raw/*172.278*/(""" """),format.raw/*172.279*/(""""period" : "2012-09-19", "licensed" : 3257, "sorned" : 667 """),format.raw/*172.338*/("""}"""),format.raw/*172.339*/(""", """),format.raw/*172.341*/("""{"""),format.raw/*172.342*/(""" """),format.raw/*172.343*/(""""period" : "2012-09-18", "licensed" : 3248, "sorned" : 627 """),format.raw/*172.402*/("""}"""),format.raw/*172.403*/(""", """),format.raw/*172.405*/("""{"""),format.raw/*172.406*/(""" """),format.raw/*172.407*/(""""period" : "2012-09-17", "licensed" : 3171, "sorned" : 660 """),format.raw/*172.466*/("""}"""),format.raw/*172.467*/(""", """),format.raw/*172.469*/("""{"""),format.raw/*172.470*/(""" """),format.raw/*172.471*/(""""period" : "2012-09-16", "licensed" : 3171, "sorned" : 676 """),format.raw/*172.530*/("""}"""),format.raw/*172.531*/(""", """),format.raw/*172.533*/("""{"""),format.raw/*172.534*/(""" """),format.raw/*172.535*/(""""period" : "2012-09-15", "licensed" : 3201, "sorned" : 656 """),format.raw/*172.594*/("""}"""),format.raw/*172.595*/(""", """),format.raw/*172.597*/("""{"""),format.raw/*172.598*/(""" """),format.raw/*172.599*/(""""period" : "2012-09-10", "licensed" : 3215, "sorned" : 622 """),format.raw/*172.658*/("""}"""),format.raw/*172.659*/("""
    """),format.raw/*173.5*/("""] ;
    Morris.Line ( """),format.raw/*174.19*/("""{"""),format.raw/*174.20*/("""
    """),format.raw/*175.5*/("""element : 'year-graph',
    data : day_data,
    xkey : 'period',
    ykeys :[ 'licensed', 'sorned' ],
    labels :[ 'Licensed', 'SORN' ]
    """),format.raw/*180.5*/("""}"""),format.raw/*180.6*/(""" """),format.raw/*180.7*/(""")
    """),format.raw/*181.5*/("""}"""),format.raw/*181.6*/("""

    """),format.raw/*183.5*/("""// decimal data
    if ( $ ( '#decimal-graph' ).length ) """),format.raw/*184.42*/("""{"""),format.raw/*184.43*/("""
    """),format.raw/*185.5*/("""var decimal_data =[ ] ;
    for ( var x = 0 ; x <= 360 ; x += 10 ) """),format.raw/*186.44*/("""{"""),format.raw/*186.45*/("""
    """),format.raw/*187.5*/("""decimal_data.push ( """),format.raw/*187.25*/("""{"""),format.raw/*187.26*/("""
    """),format.raw/*188.5*/("""x : x,
    y : Math.sin ( Math.PI * x / 180 ).toFixed ( 4 )
    """),format.raw/*190.5*/("""}"""),format.raw/*190.6*/(""" """),format.raw/*190.7*/(""") ;
    """),format.raw/*191.5*/("""}"""),format.raw/*191.6*/("""
    """),format.raw/*192.5*/("""window.m = Morris.Line ( """),format.raw/*192.30*/("""{"""),format.raw/*192.31*/("""
    """),format.raw/*193.5*/("""element : 'decimal-graph',
    data : decimal_data,
    xkey : 'x',
    ykeys :[ 'y' ],
    labels :[ 'sin(x)' ],
    parseTime : false,
    hoverCallback : function ( index, options ) """),format.raw/*199.49*/("""{"""),format.raw/*199.50*/("""
    """),format.raw/*200.5*/("""var row = options.data[ index ] ;
    return "sin(" + row.x + ") = " + row.y ;
    """),format.raw/*202.5*/("""}"""),format.raw/*202.6*/(""",
    xLabelMargin : 10
    """),format.raw/*204.5*/("""}"""),format.raw/*204.6*/(""" """),format.raw/*204.7*/(""") ;
    """),format.raw/*205.5*/("""}"""),format.raw/*205.6*/("""

    """),format.raw/*207.5*/("""// donut
    if ( $ ( '#donut-graph' ).length ) """),format.raw/*208.40*/("""{"""),format.raw/*208.41*/("""
    """),format.raw/*209.5*/("""Morris.Donut ( """),format.raw/*209.20*/("""{"""),format.raw/*209.21*/("""
    """),format.raw/*210.5*/("""element : 'donut-graph',
    data :[ """),format.raw/*211.13*/("""{"""),format.raw/*211.14*/(""" """),format.raw/*211.15*/("""value : 70, label : 'foo' """),format.raw/*211.41*/("""}"""),format.raw/*211.42*/(""", """),format.raw/*211.44*/("""{"""),format.raw/*211.45*/(""" """),format.raw/*211.46*/("""value : 15, label : 'bar' """),format.raw/*211.72*/("""}"""),format.raw/*211.73*/(""", """),format.raw/*211.75*/("""{"""),format.raw/*211.76*/(""" """),format.raw/*211.77*/("""value : 10, label : 'baz' """),format.raw/*211.103*/("""}"""),format.raw/*211.104*/(""", """),format.raw/*211.106*/("""{"""),format.raw/*211.107*/(""" """),format.raw/*211.108*/("""value : 5, label : 'A really really long label' """),format.raw/*211.156*/("""}"""),format.raw/*211.157*/("""
    """),format.raw/*212.5*/("""],
    formatter : function ( x ) """),format.raw/*213.32*/("""{"""),format.raw/*213.33*/(""" """),format.raw/*213.34*/("""return x + "%" """),format.raw/*213.49*/("""}"""),format.raw/*213.50*/("""
    """),format.raw/*214.5*/("""}"""),format.raw/*214.6*/(""" """),format.raw/*214.7*/(""") ;
    """),format.raw/*215.5*/("""}"""),format.raw/*215.6*/("""

    """),format.raw/*217.5*/("""// time formatter
    if ( $ ( '#time-graph' ).length ) """),format.raw/*218.39*/("""{"""),format.raw/*218.40*/("""
    """),format.raw/*219.5*/("""var week_data =[ """),format.raw/*219.22*/("""{"""),format.raw/*219.23*/(""" """),format.raw/*219.24*/(""""period" : "2011 W27", "licensed" : 3407, "sorned" : 660 """),format.raw/*219.81*/("""}"""),format.raw/*219.82*/(""", """),format.raw/*219.84*/("""{"""),format.raw/*219.85*/(""" """),format.raw/*219.86*/(""""period" : "2011 W26", "licensed" : 3351, "sorned" : 629 """),format.raw/*219.143*/("""}"""),format.raw/*219.144*/(""", """),format.raw/*219.146*/("""{"""),format.raw/*219.147*/(""" """),format.raw/*219.148*/(""""period" : "2011 W25", "licensed" : 3269, "sorned" : 618 """),format.raw/*219.205*/("""}"""),format.raw/*219.206*/(""", """),format.raw/*219.208*/("""{"""),format.raw/*219.209*/(""" """),format.raw/*219.210*/(""""period" : "2011 W24", "licensed" : 3246, "sorned" : 661 """),format.raw/*219.267*/("""}"""),format.raw/*219.268*/(""", """),format.raw/*219.270*/("""{"""),format.raw/*219.271*/(""" """),format.raw/*219.272*/(""""period" : "2011 W23", "licensed" : 3257, "sorned" : 667 """),format.raw/*219.329*/("""}"""),format.raw/*219.330*/(""", """),format.raw/*219.332*/("""{"""),format.raw/*219.333*/(""" """),format.raw/*219.334*/(""""period" : "2011 W22", "licensed" : 3248, "sorned" : 627 """),format.raw/*219.391*/("""}"""),format.raw/*219.392*/(""", """),format.raw/*219.394*/("""{"""),format.raw/*219.395*/(""" """),format.raw/*219.396*/(""""period" : "2011 W21", "licensed" : 3171, "sorned" : 660 """),format.raw/*219.453*/("""}"""),format.raw/*219.454*/(""", """),format.raw/*219.456*/("""{"""),format.raw/*219.457*/(""" """),format.raw/*219.458*/(""""period" : "2011 W20", "licensed" : 3171, "sorned" : 676 """),format.raw/*219.515*/("""}"""),format.raw/*219.516*/(""", """),format.raw/*219.518*/("""{"""),format.raw/*219.519*/(""" """),format.raw/*219.520*/(""""period" : "2011 W19", "licensed" : 3201, "sorned" : 656 """),format.raw/*219.577*/("""}"""),format.raw/*219.578*/(""", """),format.raw/*219.580*/("""{"""),format.raw/*219.581*/(""" """),format.raw/*219.582*/(""""period" : "2011 W18", "licensed" : 3215, "sorned" : 622 """),format.raw/*219.639*/("""}"""),format.raw/*219.640*/(""", """),format.raw/*219.642*/("""{"""),format.raw/*219.643*/(""" """),format.raw/*219.644*/(""""period" : "2011 W17", "licensed" : 3148, "sorned" : 632 """),format.raw/*219.701*/("""}"""),format.raw/*219.702*/(""", """),format.raw/*219.704*/("""{"""),format.raw/*219.705*/(""" """),format.raw/*219.706*/(""""period" : "2011 W16", "licensed" : 3155, "sorned" : 681 """),format.raw/*219.763*/("""}"""),format.raw/*219.764*/(""", """),format.raw/*219.766*/("""{"""),format.raw/*219.767*/(""" """),format.raw/*219.768*/(""""period" : "2011 W15", "licensed" : 3190, "sorned" : 667 """),format.raw/*219.825*/("""}"""),format.raw/*219.826*/(""", """),format.raw/*219.828*/("""{"""),format.raw/*219.829*/(""" """),format.raw/*219.830*/(""""period" : "2011 W14", "licensed" : 3226, "sorned" : 620 """),format.raw/*219.887*/("""}"""),format.raw/*219.888*/(""", """),format.raw/*219.890*/("""{"""),format.raw/*219.891*/(""" """),format.raw/*219.892*/(""""period" : "2011 W13", "licensed" : 3245, "sorned" : null """),format.raw/*219.950*/("""}"""),format.raw/*219.951*/(""", """),format.raw/*219.953*/("""{"""),format.raw/*219.954*/(""" """),format.raw/*219.955*/(""""period" : "2011 W12", "licensed" : 3289, "sorned" : null """),format.raw/*219.1013*/("""}"""),format.raw/*219.1014*/(""", """),format.raw/*219.1016*/("""{"""),format.raw/*219.1017*/(""" """),format.raw/*219.1018*/(""""period" : "2011 W11", "licensed" : 3263, "sorned" : null """),format.raw/*219.1076*/("""}"""),format.raw/*219.1077*/(""", """),format.raw/*219.1079*/("""{"""),format.raw/*219.1080*/(""" """),format.raw/*219.1081*/(""""period" : "2011 W10", "licensed" : 3189, "sorned" : null """),format.raw/*219.1139*/("""}"""),format.raw/*219.1140*/(""", """),format.raw/*219.1142*/("""{"""),format.raw/*219.1143*/(""" """),format.raw/*219.1144*/(""""period" : "2011 W09", "licensed" : 3079, "sorned" : null """),format.raw/*219.1202*/("""}"""),format.raw/*219.1203*/(""", """),format.raw/*219.1205*/("""{"""),format.raw/*219.1206*/(""" """),format.raw/*219.1207*/(""""period" : "2011 W08", "licensed" : 3085, "sorned" : null """),format.raw/*219.1265*/("""}"""),format.raw/*219.1266*/(""", """),format.raw/*219.1268*/("""{"""),format.raw/*219.1269*/(""" """),format.raw/*219.1270*/(""""period" : "2011 W07", "licensed" : 3055, "sorned" : null """),format.raw/*219.1328*/("""}"""),format.raw/*219.1329*/(""", """),format.raw/*219.1331*/("""{"""),format.raw/*219.1332*/(""" """),format.raw/*219.1333*/(""""period" : "2011 W06", "licensed" : 3063, "sorned" : null """),format.raw/*219.1391*/("""}"""),format.raw/*219.1392*/(""", """),format.raw/*219.1394*/("""{"""),format.raw/*219.1395*/(""" """),format.raw/*219.1396*/(""""period" : "2011 W05", "licensed" : 2943, "sorned" : null """),format.raw/*219.1454*/("""}"""),format.raw/*219.1455*/(""", """),format.raw/*219.1457*/("""{"""),format.raw/*219.1458*/(""" """),format.raw/*219.1459*/(""""period" : "2011 W04", "licensed" : 2806, "sorned" : null """),format.raw/*219.1517*/("""}"""),format.raw/*219.1518*/(""", """),format.raw/*219.1520*/("""{"""),format.raw/*219.1521*/(""" """),format.raw/*219.1522*/(""""period" : "2011 W03", "licensed" : 2674, "sorned" : null """),format.raw/*219.1580*/("""}"""),format.raw/*219.1581*/(""", """),format.raw/*219.1583*/("""{"""),format.raw/*219.1584*/(""" """),format.raw/*219.1585*/(""""period" : "2011 W02", "licensed" : 1702, "sorned" : null """),format.raw/*219.1643*/("""}"""),format.raw/*219.1644*/(""", """),format.raw/*219.1646*/("""{"""),format.raw/*219.1647*/(""" """),format.raw/*219.1648*/(""""period" : "2011 W01", "licensed" : 1732, "sorned" : null """),format.raw/*219.1706*/("""}"""),format.raw/*219.1707*/("""
    """),format.raw/*220.5*/("""] ;
    Morris.Line ( """),format.raw/*221.19*/("""{"""),format.raw/*221.20*/("""
    """),format.raw/*222.5*/("""element : 'time-graph',
    data : week_data,
    xkey : 'period',
    ykeys :[ 'licensed', 'sorned' ],
    labels :[ 'Licensed', 'SORN' ],
    events :[
    '2011-04',
    '2011-08'
    ]
    """),format.raw/*231.5*/("""}"""),format.raw/*231.6*/(""" """),format.raw/*231.7*/(""") ;
    """),format.raw/*232.5*/("""}"""),format.raw/*232.6*/("""

    """),format.raw/*234.5*/("""// negative value
    if ( $ ( '#graph-B' ).length ) """),format.raw/*235.36*/("""{"""),format.raw/*235.37*/("""
    """),format.raw/*236.5*/("""var neg_data =[ """),format.raw/*236.21*/("""{"""),format.raw/*236.22*/(""" """),format.raw/*236.23*/(""""period" : "2011-08-12", "a" : 100 """),format.raw/*236.58*/("""}"""),format.raw/*236.59*/(""", """),format.raw/*236.61*/("""{"""),format.raw/*236.62*/(""" """),format.raw/*236.63*/(""""period" : "2011-03-03", "a" : 75 """),format.raw/*236.97*/("""}"""),format.raw/*236.98*/(""", """),format.raw/*236.100*/("""{"""),format.raw/*236.101*/(""" """),format.raw/*236.102*/(""""period" : "2010-08-08", "a" : 50 """),format.raw/*236.136*/("""}"""),format.raw/*236.137*/(""", """),format.raw/*236.139*/("""{"""),format.raw/*236.140*/(""" """),format.raw/*236.141*/(""""period" : "2010-05-10", "a" : 25 """),format.raw/*236.175*/("""}"""),format.raw/*236.176*/(""", """),format.raw/*236.178*/("""{"""),format.raw/*236.179*/(""" """),format.raw/*236.180*/(""""period" : "2010-03-14", "a" : 0 """),format.raw/*236.213*/("""}"""),format.raw/*236.214*/(""", """),format.raw/*236.216*/("""{"""),format.raw/*236.217*/(""" """),format.raw/*236.218*/(""""period" : "2010-01-10", "a" : - 25 """),format.raw/*236.254*/("""}"""),format.raw/*236.255*/(""", """),format.raw/*236.257*/("""{"""),format.raw/*236.258*/(""" """),format.raw/*236.259*/(""""period" : "2009-12-10", "a" : - 50 """),format.raw/*236.295*/("""}"""),format.raw/*236.296*/(""", """),format.raw/*236.298*/("""{"""),format.raw/*236.299*/(""" """),format.raw/*236.300*/(""""period" : "2009-10-07", "a" : - 75 """),format.raw/*236.336*/("""}"""),format.raw/*236.337*/(""", """),format.raw/*236.339*/("""{"""),format.raw/*236.340*/(""" """),format.raw/*236.341*/(""""period" : "2009-09-25", "a" : - 100 """),format.raw/*236.378*/("""}"""),format.raw/*236.379*/("""
    """),format.raw/*237.5*/("""] ;
    Morris.Line ( """),format.raw/*238.19*/("""{"""),format.raw/*238.20*/("""
    """),format.raw/*239.5*/("""element : 'graph-B',
    data : neg_data,
    xkey : 'period',
    ykeys :[ 'a' ],
    labels :[ 'Series A' ],
    units : '%'
    """),format.raw/*245.5*/("""}"""),format.raw/*245.6*/(""" """),format.raw/*245.7*/(""") ;
    """),format.raw/*246.5*/("""}"""),format.raw/*246.6*/("""

    """),format.raw/*248.5*/("""// no grid
    /* data stolen from http://howmanyleft.co.uk/vehicle/jaguar_'e'_type */
    if ( $ ( '#nogrid-graph' ).length ) """),format.raw/*250.41*/("""{"""),format.raw/*250.42*/("""
    """),format.raw/*251.5*/("""var day_data =[ """),format.raw/*251.21*/("""{"""),format.raw/*251.22*/(""" """),format.raw/*251.23*/(""""period" : "2012-10-01", "licensed" : 3407, "sorned" : 660 """),format.raw/*251.82*/("""}"""),format.raw/*251.83*/(""", """),format.raw/*251.85*/("""{"""),format.raw/*251.86*/(""" """),format.raw/*251.87*/(""""period" : "2012-09-30", "licensed" : 3351, "sorned" : 629 """),format.raw/*251.146*/("""}"""),format.raw/*251.147*/(""", """),format.raw/*251.149*/("""{"""),format.raw/*251.150*/(""" """),format.raw/*251.151*/(""""period" : "2012-09-29", "licensed" : 3269, "sorned" : 618 """),format.raw/*251.210*/("""}"""),format.raw/*251.211*/(""", """),format.raw/*251.213*/("""{"""),format.raw/*251.214*/(""" """),format.raw/*251.215*/(""""period" : "2012-09-20", "licensed" : 3246, "sorned" : 661 """),format.raw/*251.274*/("""}"""),format.raw/*251.275*/(""", """),format.raw/*251.277*/("""{"""),format.raw/*251.278*/(""" """),format.raw/*251.279*/(""""period" : "2012-09-19", "licensed" : 3257, "sorned" : 667 """),format.raw/*251.338*/("""}"""),format.raw/*251.339*/(""", """),format.raw/*251.341*/("""{"""),format.raw/*251.342*/(""" """),format.raw/*251.343*/(""""period" : "2012-09-18", "licensed" : 3248, "sorned" : 627 """),format.raw/*251.402*/("""}"""),format.raw/*251.403*/(""", """),format.raw/*251.405*/("""{"""),format.raw/*251.406*/(""" """),format.raw/*251.407*/(""""period" : "2012-09-17", "licensed" : 3171, "sorned" : 660 """),format.raw/*251.466*/("""}"""),format.raw/*251.467*/(""", """),format.raw/*251.469*/("""{"""),format.raw/*251.470*/(""" """),format.raw/*251.471*/(""""period" : "2012-09-16", "licensed" : 3171, "sorned" : 676 """),format.raw/*251.530*/("""}"""),format.raw/*251.531*/(""", """),format.raw/*251.533*/("""{"""),format.raw/*251.534*/(""" """),format.raw/*251.535*/(""""period" : "2012-09-15", "licensed" : 3201, "sorned" : 656 """),format.raw/*251.594*/("""}"""),format.raw/*251.595*/(""", """),format.raw/*251.597*/("""{"""),format.raw/*251.598*/(""" """),format.raw/*251.599*/(""""period" : "2012-09-10", "licensed" : 3215, "sorned" : 622 """),format.raw/*251.658*/("""}"""),format.raw/*251.659*/("""
    """),format.raw/*252.5*/("""] ;
    Morris.Line ( """),format.raw/*253.19*/("""{"""),format.raw/*253.20*/("""
    """),format.raw/*254.5*/("""element : 'nogrid-graph',
    grid : false,
    data : day_data,
    xkey : 'period',
    ykeys :[ 'licensed', 'sorned' ],
    labels :[ 'Licensed', 'SORN' ]
    """),format.raw/*260.5*/("""}"""),format.raw/*260.6*/(""" """),format.raw/*260.7*/(""") ;
    """),format.raw/*261.5*/("""}"""),format.raw/*261.6*/("""

    """),format.raw/*263.5*/("""// non-continus data
    /* data stolen from http://howmanyleft.co.uk/vehicle/jaguar_'e'_type */
    if ( $ ( '#non-continu-graph' ).length ) """),format.raw/*265.46*/("""{"""),format.raw/*265.47*/("""
    """),format.raw/*266.5*/("""var day_data =[ """),format.raw/*266.21*/("""{"""),format.raw/*266.22*/(""" """),format.raw/*266.23*/(""""period" : "2012-10-01", "licensed" : 3407 """),format.raw/*266.66*/("""}"""),format.raw/*266.67*/(""", """),format.raw/*266.69*/("""{"""),format.raw/*266.70*/(""" """),format.raw/*266.71*/(""""period" : "2012-09-30", "sorned" : 0 """),format.raw/*266.109*/("""}"""),format.raw/*266.110*/(""", """),format.raw/*266.112*/("""{"""),format.raw/*266.113*/(""" """),format.raw/*266.114*/(""""period" : "2012-09-29", "sorned" : 618 """),format.raw/*266.154*/("""}"""),format.raw/*266.155*/(""", """),format.raw/*266.157*/("""{"""),format.raw/*266.158*/(""" """),format.raw/*266.159*/(""""period" : "2012-09-20", "licensed" : 3246, "sorned" : 661 """),format.raw/*266.218*/("""}"""),format.raw/*266.219*/(""", """),format.raw/*266.221*/("""{"""),format.raw/*266.222*/(""" """),format.raw/*266.223*/(""""period" : "2012-09-19", "licensed" : 3257, "sorned" : null """),format.raw/*266.283*/("""}"""),format.raw/*266.284*/(""", """),format.raw/*266.286*/("""{"""),format.raw/*266.287*/(""" """),format.raw/*266.288*/(""""period" : "2012-09-18", "licensed" : 3248, "other" : 1000 """),format.raw/*266.347*/("""}"""),format.raw/*266.348*/(""", """),format.raw/*266.350*/("""{"""),format.raw/*266.351*/(""" """),format.raw/*266.352*/(""""period" : "2012-09-17", "sorned" : 0 """),format.raw/*266.390*/("""}"""),format.raw/*266.391*/(""", """),format.raw/*266.393*/("""{"""),format.raw/*266.394*/(""" """),format.raw/*266.395*/(""""period" : "2012-09-16", "sorned" : 0 """),format.raw/*266.433*/("""}"""),format.raw/*266.434*/(""", """),format.raw/*266.436*/("""{"""),format.raw/*266.437*/(""" """),format.raw/*266.438*/(""""period" : "2012-09-15", "licensed" : 3201, "sorned" : 656 """),format.raw/*266.497*/("""}"""),format.raw/*266.498*/(""", """),format.raw/*266.500*/("""{"""),format.raw/*266.501*/(""" """),format.raw/*266.502*/(""""period" : "2012-09-10", "licensed" : 3215 """),format.raw/*266.545*/("""}"""),format.raw/*266.546*/("""
    """),format.raw/*267.5*/("""] ;
    Morris.Line ( """),format.raw/*268.19*/("""{"""),format.raw/*268.20*/("""
    """),format.raw/*269.5*/("""element : 'non-continu-graph',
    data : day_data,
    xkey : 'period',
    ykeys :[ 'licensed', 'sorned', 'other' ],
    labels :[ 'Licensed', 'SORN', 'Other' ],
    /* custom label formatting with `xLabelFormat` */
    xLabelFormat : function ( d ) """),format.raw/*275.35*/("""{"""),format.raw/*275.36*/(""" """),format.raw/*275.37*/("""return ( d.getMonth ( ) + 1 ) + '/' + d.getDate ( ) + '/' + d.getFullYear ( ) ; """),format.raw/*275.117*/("""}"""),format.raw/*275.118*/(""",
    /* setting `xLabels` is recommended when using xLabelFormat */
    xLabels : 'day'
    """),format.raw/*278.5*/("""}"""),format.raw/*278.6*/(""" """),format.raw/*278.7*/(""") ;
    """),format.raw/*279.5*/("""}"""),format.raw/*279.6*/("""

    """),format.raw/*281.5*/("""// non date data
    if ( $ ( '#non-date-graph' ).length ) """),format.raw/*282.43*/("""{"""),format.raw/*282.44*/("""
    """),format.raw/*283.5*/("""var day_data =[ """),format.raw/*283.21*/("""{"""),format.raw/*283.22*/(""" """),format.raw/*283.23*/(""""elapsed" : "I", "value" : 34 """),format.raw/*283.53*/("""}"""),format.raw/*283.54*/(""", """),format.raw/*283.56*/("""{"""),format.raw/*283.57*/(""" """),format.raw/*283.58*/(""""elapsed" : "II", "value" : 24 """),format.raw/*283.89*/("""}"""),format.raw/*283.90*/(""", """),format.raw/*283.92*/("""{"""),format.raw/*283.93*/(""" """),format.raw/*283.94*/(""""elapsed" : "III", "value" : 3 """),format.raw/*283.125*/("""}"""),format.raw/*283.126*/(""", """),format.raw/*283.128*/("""{"""),format.raw/*283.129*/(""" """),format.raw/*283.130*/(""""elapsed" : "IV", "value" : 12 """),format.raw/*283.161*/("""}"""),format.raw/*283.162*/(""", """),format.raw/*283.164*/("""{"""),format.raw/*283.165*/(""" """),format.raw/*283.166*/(""""elapsed" : "V", "value" : 13 """),format.raw/*283.196*/("""}"""),format.raw/*283.197*/(""", """),format.raw/*283.199*/("""{"""),format.raw/*283.200*/(""" """),format.raw/*283.201*/(""""elapsed" : "VI", "value" : 22 """),format.raw/*283.232*/("""}"""),format.raw/*283.233*/(""", """),format.raw/*283.235*/("""{"""),format.raw/*283.236*/(""" """),format.raw/*283.237*/(""""elapsed" : "VII", "value" : 5 """),format.raw/*283.268*/("""}"""),format.raw/*283.269*/(""", """),format.raw/*283.271*/("""{"""),format.raw/*283.272*/(""" """),format.raw/*283.273*/(""""elapsed" : "VIII", "value" : 26 """),format.raw/*283.306*/("""}"""),format.raw/*283.307*/(""", """),format.raw/*283.309*/("""{"""),format.raw/*283.310*/(""" """),format.raw/*283.311*/(""""elapsed" : "IX", "value" : 12 """),format.raw/*283.342*/("""}"""),format.raw/*283.343*/(""", """),format.raw/*283.345*/("""{"""),format.raw/*283.346*/(""" """),format.raw/*283.347*/(""""elapsed" : "X", "value" : 19 """),format.raw/*283.377*/("""}"""),format.raw/*283.378*/("""
    """),format.raw/*284.5*/("""] ;
    Morris.Line ( """),format.raw/*285.19*/("""{"""),format.raw/*285.20*/("""
    """),format.raw/*286.5*/("""element : 'non-date-graph',
    data : day_data,
    xkey : 'elapsed',
    ykeys :[ 'value' ],
    labels :[ 'value' ],
    parseTime : false
    """),format.raw/*292.5*/("""}"""),format.raw/*292.6*/(""" """),format.raw/*292.7*/(""") ;
    """),format.raw/*293.5*/("""}"""),format.raw/*293.6*/("""

    """),format.raw/*295.5*/("""//stacked bar
    if ( $ ( '#stacked-bar-graph' ).length ) """),format.raw/*296.46*/("""{"""),format.raw/*296.47*/("""
    """),format.raw/*297.5*/("""Morris.Bar ( """),format.raw/*297.18*/("""{"""),format.raw/*297.19*/("""
    """),format.raw/*298.5*/("""element : 'stacked-bar-graph',
    axes : false,
    grid : false,
    data :[ """),format.raw/*301.13*/("""{"""),format.raw/*301.14*/(""" """),format.raw/*301.15*/("""x : '2011 Q1', y : 3, z : 2, a : 3 """),format.raw/*301.50*/("""}"""),format.raw/*301.51*/(""", """),format.raw/*301.53*/("""{"""),format.raw/*301.54*/(""" """),format.raw/*301.55*/("""x : '2011 Q2', y : 2, z : null, a : 1 """),format.raw/*301.93*/("""}"""),format.raw/*301.94*/(""", """),format.raw/*301.96*/("""{"""),format.raw/*301.97*/(""" """),format.raw/*301.98*/("""x : '2011 Q3', y : 0, z : 2, a : 4 """),format.raw/*301.133*/("""}"""),format.raw/*301.134*/(""", """),format.raw/*301.136*/("""{"""),format.raw/*301.137*/(""" """),format.raw/*301.138*/("""x : '2011 Q4', y : 2, z : 4, a : 3 """),format.raw/*301.173*/("""}"""),format.raw/*301.174*/("""
    """),format.raw/*302.5*/("""],
    xkey : 'x',
    ykeys :[ 'y', 'z', 'a' ],
    labels :[ 'Y', 'Z', 'A' ],
    stacked : true
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/(""" """),format.raw/*307.7*/(""") ;
    """),format.raw/*308.5*/("""}"""),format.raw/*308.6*/("""

    """),format.raw/*310.5*/("""// interval
    if ( $ ( '#interval-graph' ).length ) """),format.raw/*311.43*/("""{"""),format.raw/*311.44*/("""

    """),format.raw/*313.5*/("""var nReloads = 0 ;
    function data ( offset ) """),format.raw/*314.30*/("""{"""),format.raw/*314.31*/("""
    """),format.raw/*315.5*/("""var ret =[ ] ;
    for ( var x = 0 ; x <= 360 ; x += 10 ) """),format.raw/*316.44*/("""{"""),format.raw/*316.45*/("""
    """),format.raw/*317.5*/("""var v = ( offset + x ) % 360 ;
    ret.push ( """),format.raw/*318.16*/("""{"""),format.raw/*318.17*/("""
    """),format.raw/*319.5*/("""x : x,
    y : Math.sin ( Math.PI * v / 180 ).toFixed ( 4 ),
    z : Math.cos ( Math.PI * v / 180 ).toFixed ( 4 )
    """),format.raw/*322.5*/("""}"""),format.raw/*322.6*/(""" """),format.raw/*322.7*/(""") ;
    """),format.raw/*323.5*/("""}"""),format.raw/*323.6*/("""
    """),format.raw/*324.5*/("""return ret ;
    """),format.raw/*325.5*/("""}"""),format.raw/*325.6*/("""
    """),format.raw/*326.5*/("""var graph = Morris.Line ( """),format.raw/*326.31*/("""{"""),format.raw/*326.32*/("""
    """),format.raw/*327.5*/("""element : 'interval-graph',
    data : data ( 0 ),
    xkey : 'x',
    ykeys :[ 'y', 'z' ],
    labels :[ 'sin()', 'cos()' ],
    parseTime : false,
    ymin : - 1.0,
    ymax : 1.0,
    hideHover : true
    """),format.raw/*336.5*/("""}"""),format.raw/*336.6*/(""" """),format.raw/*336.7*/(""") ;
    function update ( ) """),format.raw/*337.25*/("""{"""),format.raw/*337.26*/("""
    """),format.raw/*338.5*/("""nReloads ++ ;
    graph.setData ( data ( 5 * nReloads ) ) ;
    $ ( '#reloadStatus' ).text ( nReloads + ' reloads' ) ;
    """),format.raw/*341.5*/("""}"""),format.raw/*341.6*/("""
    """),format.raw/*342.5*/("""setInterval ( update, 100 ) ;
    """),format.raw/*343.5*/("""}"""),format.raw/*343.6*/("""


    """),format.raw/*346.5*/("""}"""),format.raw/*346.6*/(""" """),format.raw/*346.7*/(""";

    // end pagefunction

    // Load morris dependencies and run pagefunction
    loadScript ( "assets/javascripts/plugin/morris/raphael.min.js", function ( ) """),format.raw/*351.82*/("""{"""),format.raw/*351.83*/("""
    """),format.raw/*352.5*/("""loadScript ( "assets/javascripts/plugin/morris/morris.min.js", pagefunction ) ;
    """),format.raw/*353.5*/("""}"""),format.raw/*353.6*/(""" """),format.raw/*353.7*/(""") ;


    </script>
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*357.2*/("""
"""),_display_(/*358.2*/main(message,scripts)/*358.23*/ {_display_(Seq[Any](format.raw/*358.25*/("""
    """),format.raw/*359.5*/("""<div id="content" style="opacity : 1 ;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-bar-chart-o fa-fw "></i>
                Graph
                <span>&gt;
                    Morris Charts
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
                            <h2>Sales Graph</h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->
                                <input type="text">
                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <div id="sales-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="1021" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="50.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M63,177H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="50.5" y="138.99855044821666" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.006362948216662" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    6,554</tspan></text><path fill="none" stroke="#aaaaaa" d="M63,138.99855044821666H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="50.5" y="100.99710089643334" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.004913396433338" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    13,108</tspan></text><path fill="none" stroke="#aaaaaa" d="M63,100.99710089643334H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="50.5" y="63.001449551783324" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="3.993637051783324" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    19,661</tspan></text><path fill="none" stroke="#aaaaaa" d="M63,63.001449551783324H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="50.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    26,215</tspan></text><path fill="none" stroke="#aaaaaa" d="M63,25H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="996" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-06</tspan></text><text x="891.7035236938032" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-03</tspan></text><text x="788.5407047387606" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-12</tspan></text><text x="685.377885783718" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-09</tspan></text><text x="581.0814094775212" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-06</tspan></text><text x="476.7849331713244" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-03</tspan></text><text x="374.75577156743617" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2010-12</tspan></text><text x="271.5929526123937" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2010-09</tspan></text><text x="167.29647630619684" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2010-06</tspan></text><text x="63" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2010-03</tspan></text><path fill="#bfc6c9" stroke="#000000" d="M63,146.19412550066755C89.07411907654921,143.0051115773412,141.22235722964763,136.38718291054738,167.29647630619684,133.43806980736218C193.37059538274605,130.48895670417699,245.51883353584446,126.63842041796036,271.5929526123937,122.60122067518597C297.3836573511543,118.6079035383113,348.96506682867556,102.50755788038353,374.75577156743617,101.31600228876597C400.26306196840824,100.13754071463872,451.2776427703523,112.25452712460151,476.7849331713244,113.12115201220675C502.8590522478736,114.00703523064766,555.007290400972,107.73606713713522,581.0814094775212,108.3260347129506C607.1555285540704,108.91600228876598,659.3037667071688,128.31356364822625,685.377885783718,117.84089261872973C711.1685905224787,107.4820549699886,762.75,30.053137516688917,788.5407047387606,25C814.3314094775212,19.946862483311083,865.9128189550426,70.00653132097025,891.7035236938032,77.41579248521839C917.7776427703524,84.9064741018209,969.9258809234508,82.80377646385656,996,84.59977112340263L996,177L63,177Z" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="#889a59" stroke="#000000" d="M63,161.54197978256724C89.07411907654921,158.05435819187488,141.22235722964763,150.6464238031661,167.29647630619684,147.5914934197978C193.37059538274605,144.53656303642953,245.51883353584446,138.772800580321,271.5929526123937,137.10253671562083C297.3836573511543,135.45042789292827,348.96506682867556,135.64514453894324,374.75577156743617,134.30200267022695C400.26306196840824,132.97362060226578,451.2776427703523,128.2794335932997,476.7849331713244,126.41644096891093C502.8590522478736,124.51204850842464,555.007290400972,119.1534617585352,581.0814094775212,119.23246233072669C607.1555285540704,119.31146290291818,659.3037667071688,135.12065882274467,685.377885783718,127.04844554644288C711.1685905224787,119.06397371879655,762.75,59.739958039290485,788.5407047387606,55.0057219149342C814.3314094775212,50.27148579057791,865.9128189550426,84.20453459152928,891.7035236938032,89.1745565515926C917.7776427703524,94.1991941375907,969.9258809234508,93.53190921228304,996,94.98436009917985L996,177L63,177Z" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="#81a1ad" stroke="#000000" d="M63,161.54197978256724C89.07411907654921,161.37962998283427,141.22235722964763,162.52042723631507,167.29647630619684,160.89258058363532C193.37059538274605,159.26473393095557,245.51883353584446,149.23992687622007,271.5929526123937,148.51920656112912C297.3836573511543,147.80632016250655,348.96506682867556,156.5413785073073,374.75577156743617,155.15815372878123C400.26306196840824,153.79012922254665,451.2776427703523,138.87830136676217,476.7849331713244,137.5142094220866C502.8590522478736,136.11980432308488,555.007290400972,142.6818615296586,581.0814094775212,144.12416555407208C607.1555285540704,145.56646957848557,659.3037667071688,155.90495013387613,685.377885783718,149.0526416173946C711.1685905224787,142.27481471522267,762.75,93.85588403585733,788.5407047387606,89.60362387945833C814.3314094775212,85.35136372305932,865.9128189550426,110.24762550952663,891.7035236938032,115.03456036620256C917.7776427703524,119.87409890262218,969.9258809234508,124.84077818043104,996,128.10951745184053L996,177L63,177Z" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#92a2a8" d="M63,146.19412550066755C89.07411907654921,143.0051115773412,141.22235722964763,136.38718291054738,167.29647630619684,133.43806980736218C193.37059538274605,130.48895670417699,245.51883353584446,126.63842041796036,271.5929526123937,122.60122067518597C297.3836573511543,118.6079035383113,348.96506682867556,102.50755788038353,374.75577156743617,101.31600228876597C400.26306196840824,100.13754071463872,451.2776427703523,112.25452712460151,476.7849331713244,113.12115201220675C502.8590522478736,114.00703523064766,555.007290400972,107.73606713713522,581.0814094775212,108.3260347129506C607.1555285540704,108.91600228876598,659.3037667071688,128.31356364822625,685.377885783718,117.84089261872973C711.1685905224787,107.4820549699886,762.75,30.053137516688917,788.5407047387606,25C814.3314094775212,19.946862483311083,865.9128189550426,70.00653132097025,891.7035236938032,77.41579248521839C917.7776427703524,84.9064741018209,969.9258809234508,82.80377646385656,996,84.59977112340263" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#71843f" d="M63,161.54197978256724C89.07411907654921,158.05435819187488,141.22235722964763,150.6464238031661,167.29647630619684,147.5914934197978C193.37059538274605,144.53656303642953,245.51883353584446,138.772800580321,271.5929526123937,137.10253671562083C297.3836573511543,135.45042789292827,348.96506682867556,135.64514453894324,374.75577156743617,134.30200267022695C400.26306196840824,132.97362060226578,451.2776427703523,128.2794335932997,476.7849331713244,126.41644096891093C502.8590522478736,124.51204850842464,555.007290400972,119.1534617585352,581.0814094775212,119.23246233072669C607.1555285540704,119.31146290291818,659.3037667071688,135.12065882274467,685.377885783718,127.04844554644288C711.1685905224787,119.06397371879655,762.75,59.739958039290485,788.5407047387606,55.0057219149342C814.3314094775212,50.27148579057791,865.9128189550426,84.20453459152928,891.7035236938032,89.1745565515926C917.7776427703524,94.1991941375907,969.9258809234508,93.53190921228304,996,94.98436009917985" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M63,161.54197978256724C89.07411907654921,161.37962998283427,141.22235722964763,162.52042723631507,167.29647630619684,160.89258058363532C193.37059538274605,159.26473393095557,245.51883353584446,149.23992687622007,271.5929526123937,148.51920656112912C297.3836573511543,147.80632016250655,348.96506682867556,156.5413785073073,374.75577156743617,155.15815372878123C400.26306196840824,153.79012922254665,451.2776427703523,138.87830136676217,476.7849331713244,137.5142094220866C502.8590522478736,136.11980432308488,555.007290400972,142.6818615296586,581.0814094775212,144.12416555407208C607.1555285540704,145.56646957848557,659.3037667071688,155.90495013387613,685.377885783718,149.0526416173946C711.1685905224787,142.27481471522267,762.75,93.85588403585733,788.5407047387606,89.60362387945833C814.3314094775212,85.35136372305932,865.9128189550426,110.24762550952663,891.7035236938032,115.03456036620256C917.7776427703524,119.87409890262218,969.9258809234508,124.84077818043104,996,128.10951745184053" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="63" cy="146.19412550066755" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="167.29647630619684" cy="133.43806980736218" r="5" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="271.5929526123937" cy="122.60122067518597" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="374.75577156743617" cy="101.31600228876597" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="476.7849331713244" cy="113.12115201220675" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="581.0814094775212" cy="108.3260347129506" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="685.377885783718" cy="117.84089261872973" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="788.5407047387606" cy="25" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="891.7035236938032" cy="77."""),
format.raw("""41579248521839" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="996" cy="84.59977112340263" r="2" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="63" cy="161.54197978256724" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="167.29647630619684" cy="147.5914934197978" r="5" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="271.5929526123937" cy="137.10253671562083" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="374.75577156743617" cy="134.30200267022695" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="476.7849331713244" cy="126.41644096891093" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="581.0814094775212" cy="119.23246233072669" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="685.377885783718" cy="127.04844554644288" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="788.5407047387606" cy="55.0057219149342" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="891.7035236938032" cy="89.1745565515926" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="996" cy="94.98436009917985" r="2" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="63" cy="161.54197978256724" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="167.29647630619684" cy="160.89258058363532" r="5" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="271.5929526123937" cy="148.51920656112912" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="374.75577156743617" cy="155.15815372878123" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="476.7849331713244" cy="137.5142094220866" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="581.0814094775212" cy="144.12416555407208" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="685.377885783718" cy="149.0526416173946" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="788.5407047387606" cy="89.60362387945833" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="891.7035236938032" cy="115.03456036620256" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="996" cy="128.10951745184053" r="2" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 109.79647630619684 px ; top : 29.438069807362183 px ; display : block ;"><div class="morris-hover-row-label">
                                    2010 Q2</div><div class="morris-hover-point" style="color : #57889c">
                                    iPhone:
                                    2,778
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    iPad:
                                    2,294
                                </div><div class="morris-hover-point" style="color : #92a2a8">
                                    iPod Touch:
                                    2,441
                                </div></div></div>

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
                            <h2>Area Graph</h2>

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

                                <div id="area-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="19.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="139" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,139H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="101" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    4</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,101H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="63" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    6</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,63H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    8</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="464" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-12</tspan></text><text x="321.04727272727274" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-09</tspan></text><text x="223.6509090909091" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-07</tspan></text><text x="80.69818181818181" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-04</tspan></text><path fill="#889a59" stroke="#000000" d="M32,63C68.13090909090909,82,140.39272727272729,129.5,176.52363636363637,139C212.65454545454546,148.5,284.91636363636366,153.327868852459,321.04727272727274,139C356.78545454545457,124.82786885245902,428.26181818181817,53.5,464,25L464,177L32,177Z" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="#81a1ad" stroke="#000000" d="M32,120C68.13090909090909,124.75,140.39272727272729,131.875,176.52363636363637,139C212.65454545454546,146.125,284.91636363636366,177,321.04727272727274,177C356.78545454545457,172.275956284153,428.26181818181817,120,464,101L464,177L32,177Z" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#71843f" d="M32,63C68.13090909090909,82,140.39272727272729,129.5,176.52363636363637,139C212.65454545454546,148.5,284.91636363636366,153.327868852459,321.04727272727274,139C356.78545454545457,124.82786885245902,428.26181818181817,53.5,464,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M32,120C68.13090909090909,124.75,140.39272727272729,131.875,176.52363636363637,139C212.65454545454546,146.125,284.91636363636366,177,321.04727272727274,177C356.78545454545457,172.275956284153,428.26181818181817,120,464,101" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="32" cy="63" r="7" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="176.52363636363637" cy="139" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="321.04727272727274" cy="139" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="25" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="32" cy="120" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="176.52363636363637" cy="139" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="321.04727272727274" cy="177" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="101" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 0.5 px ; top : 73 px ;"><div class="morris-hover-row-label">
                                    2011 Q1</div><div class="morris-hover-point" style="color : #57889c">
                                    Y:
                                    3
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    Z:
                                    3
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

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
                            <h2>Normal Bar Graph</h2>

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

                                <div id="normal-bar-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="19.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="139" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    1</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,139H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="101" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,101H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="63" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    3</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,63H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    4</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,"""),
format.raw("""25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="410" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011 Q4</tspan></text><text x="302" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011 Q3</tspan></text><text x="194" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011 Q2</tspan></text><text x="86" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011 Q1</tspan></text><rect x="45.5" y="63" width="25" height="114" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="73.5" y="101" width="25" height="76" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="101.5" y="63" width="25" height="114" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="153.5" y="101" width="25" height="76" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="209.5" y="139" width="25" height="38" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="261.5" y="177" width="25" height="0" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="289.5" y="101" width="25" height="76" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="317.5" y="25" width="25" height="152" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="369.5" y="101" width="25" height="76" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="397.5" y="25" width="25" height="152" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="425.5" y="63" width="25" height="114" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect></svg><div class="morris-hover morris-default-style" style="left : 54.5 px ; top : 63 px ;"><div class="morris-hover-row-label">
                                    2011 Q1</div><div class="morris-hover-point" style="color : #57889c">
                                    Y:
                                    3
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    Z:
                                    2
                                </div><div class="morris-hover-point" style="color : #92a2a8">
                                    A:
                                    3
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

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
                            <span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
                            <h2>Year Graph</h2>

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

                                <div id="year-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="43.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="138.98884649251542" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="3.996658992515421" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    852</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,138.98884649251542H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="100.97769298503083" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.001130485030828" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    1,704</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,100.97769298503083H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="63.01115350748459" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.003341007484593" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2,555</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,63.01115350748459H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    3,407</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="444.5714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-30</tspan></text><text x="328" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-24</tspan></text><text x="211.42857142857144" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-18</tspan></text><text x="94.85714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-12</tspan></text><path fill="none" stroke="#71843f" d="M56,149.25007337833873C80.28571428571429,148.87085412386264,128.8571428571429,148.23510419724096,153.14285714285717,147.7331963604344C158.00000000000003,147.63281479307307,167.71428571428572,146.86322277663635,172.57142857142858,146.84091576166716C177.42857142857144,146.81860874669798,187.14285714285714,147.2814793073085,192,147.55474024068096C196.85714285714286,147.8280011740534,206.57142857142858,149.06604050484296,211.42857142857144,149.0270032286469C216.2857142857143,148.98796595245082,226,147.43205165835047,230.85714285714286,147.24244203111243C235.71428571428572,147.0528324038744,245.42857142857144,147.45547402406808,250.2857142857143,147.51012621074258C294,148.00199589081302,381.42857142857144,149.10730848253596,425.14285714285717,149.42852949809216C430,149.46422072204285,439.7142857142858,149.1719988259466,444.5714285714286,148.93777516877017C449.42857142857144,148.7035515115938,459.14285714285717,147.90049897270325,464,147.55474024068096" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M56,33.565893748165536C80.28571428571429,33.722042852949805,128.8571428571429,33.781528226200955,153.14285714285717,34.19049016730261C158.00000000000003,34.27228255552294,167.71428571428572,35.36160845318463,172.57142857142858,35.528911065453485C177.42857142857144,35.69621367772234,187.14285714285714,35.95832110361022,192,35.528911065453485C196.85714285714286,35.099501027296746,206.57142857142858,32.573231582036996,211.42857142857144,32.0936307601996C216.2857142857143,31.614029938362208,226,31.680950983269742,230.85714285714286,31.692104490754332C235.71428571428572,31.70325799823892,245.42857142857144,32.196243029057825,250.2857142857143,32.18285882007632C294,32.06240093924274,381.42857142857144,32.21074258878781,425.14285714285717,31.156736131494C430,31.0396243029058,439.7142857142858,28.26797769298503,444.5714285714286,27.49838567654828C449.42857142857144,26.72879366011153,459.14285714285717,25.62459641913707,464,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="56" cy="149.25007337833873" r="7" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="147.7331963604344" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="172.57142857142858" cy="146.84091576166716" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="192" cy="147.55474024068096" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="211.42857142857144" cy="149.0270032286469" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="230.85714285714286" cy="147.24244203111243" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="147.51012621074258" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="425.14285714285717" cy="149.42852949809216" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="444.5714285714286" cy="148.93777516877017" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="147.55474024068096" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="56" cy="33.565893748165536" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="34.19049016730261" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="172.57142857142858" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="192" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="211.42857142857144" cy="32.0936307601996" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="230.85714285714286" cy="31.692104490754332" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="32.18285882007632" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="425.14285714285717" cy="31.156736131494" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="444.5714285714286" cy="27.49838567654828" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="25" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 4.5 px ; top : 43.565893748165536 px ;"><div class="morris-hover-row-label">
                                    2012-09-10</div><div class="morris-hover-point" style="color : #57889c">
                                    Licensed:
                                    3,215
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    SORN:
                                    622
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

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
                            <h2>Time Graph</h2>

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

                                <div id="time-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="43.5" y="177" text-anchor="end" fo"""),
format.raw("""nt="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="138.98884649251542" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="3.996658992515421" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    852</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,138.98884649251542H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="100.97769298503083" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.001130485030828" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    1,704</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,100.97769298503083H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="63.01115350748459" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.003341007484593" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2,555</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,63.01115350748459H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    3,407</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#005a04" d="M215.11999999999998,177V25" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#ccffbb" d="M464,177V25" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="464" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-08</tspan></text><text x="339.56" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-06</tspan></text><text x="215.11999999999998" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-04</tspan></text><text x="94.75999999999999" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011-02</tspan></text><path fill="none" stroke="#71843f" d="M241.64,149.33930143821544C245.20999999999998,148.8150865864397,252.35,147.58262400939245,255.92,147.24244203111243C259.49,146.90226005283242,266.63,146.42265923099504,270.2,146.61784561197535C273.77,146.8130319929557,280.91,148.47490460815965,284.48,148.80393307895508C288.05,149.1329615497505,295.19,149.38391546815382,298.76,149.25007337833873C302.33,149.11623128852364,309.46999999999997,148.03434106251834,313.03999999999996,147.7331963604344C316.60999999999996,147.43205165835045,323.75,146.86322277663635,327.32,146.84091576166716C330.89,146.81860874669798,338.03,147.2814793073085,341.59999999999997,147.55474024068096C345.16999999999996,147.8280011740534,352.31,149.06604050484296,355.88,149.0270032286469C359.45,148.98796595245082,366.59,147.43205165835047,370.15999999999997,147.24244203111243C373.72999999999996,147.0528324038744,380.87,147.23686527737013,384.44,147.51012621074258C388.01,147.78338714411504,395.15,149.25007337833873,398.71999999999997,149.42852949809216C402.28999999999996,149.60698561784562,409.43,149.1719988259466,413,148.93777516877017C416.57,148.7035515115938,423.71,147.90049897270325,427.28,147.55474024068096" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M56,99.72850014675669C59.57,100.0631053712944,66.71000000000001,106.3202230701497,70.28,101.06692104490755C73.85,95.8136190196654,80.99000000000001,63.85882007631348,84.56,57.70208394481949C88.13,51.545347813325506,95.27000000000001,53.31317874963311,98.84,51.813031992955686C102.41,50.31288523627826,109.55000000000001,47.13413560316996,113.12,45.70090989140007C116.69,44.26768417963019,123.83,40.971822717933684,127.39999999999999,40.34722629879661C130.97,39.72262987965954,138.11,40.82682712063401,141.68,40.70413853830351C145.25,40.581449955973014,152.39,39.49955972996772,155.95999999999998,39.36571764015264C159.52999999999997,39.23187555033755,166.67000000000002,40.21338420898153,170.24,39.63340181978282C173.81,39.053419430584114,180.95,35.75198121514531,184.51999999999998,34.72585852656297C188.08999999999997,33.69973583798064,195.23,31.98209568535368,198.79999999999998,31.424420311124152C202.36999999999998,30.866744936894623,209.51,30.164073965365425,213.07999999999998,30.264455532726743C216.64999999999998,30.36483710008806,223.79,31.876137364250088,227.35999999999999,32.22747285001469C230.92999999999998,32.5788083357793,238.07,32.76841796301734,241.64,33.07513941884358C245.20999999999998,33.38186087466981,252.35,34.285294980921634,255.92,34.6812444966246C259.49,35.07719401232757,266.63,36.00851188729088,270.2,36.24273554446728C273.77,36.47695920164368,280.91,36.88963897857352,284.48,36.555033754035804C288.05,36.220428529498086,295.19,33.861461696507185,298.76,33.565893748165536C302.33,33.27032579982389,309.46999999999997,33.94511300264162,313.03999999999996,34.19049016730261C316.60999999999996,34.43586733196361,323.75,35.36160845318462,327.32,35.528911065453485C330.89,35.69621367772234,338.03,35.95832110361022,341.59999999999997,35.528911065453485C345.16999999999996,35.099501027296746,352.31,32.573231582036996,355.88,32.0936307601996C359.45,31.614029938362208,366.59,31.680950983269742,370.15999999999997,31.692104490754332C373.72999999999996,31.70325799823892,380.87,32.249779864983864,384.44,32.18285882007632C388.01,32.11593777516878,395.15,31.742295274435005,398.71999999999997,31.156736131494C402.28999999999996,30.571176988552995,409.43,28.26797769298503,413,27.49838567654828C416.57,26.72879366011153,423.71,25.62459641913707,427.28,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="241.64" cy="149.33930143821544" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="255.92" cy="147.24244203111243" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="270.2" cy="146.61784561197535" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="284.48" cy="148.80393307895508" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="298.76" cy="149.25007337833873" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="313.03999999999996" cy="147.7331963604344" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="327.32" cy="146.84091576166716" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="341.59999999999997" cy="147.55474024068096" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="355.88" cy="149.0270032286469" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="370.15999999999997" cy="147.24244203111243" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="384.44" cy="147.51012621074258" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="398.71999999999997" cy="149.42852949809216" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="413" cy="148.93777516877017" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="427.28" cy="147.55474024068096" r="7" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="56" cy="99.72850014675669" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="70.28" cy="101.06692104490755" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="84.56" cy="57.70208394481949" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="98.84" cy="51.813031992955686" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="113.12" cy="45.70090989140007" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="127.39999999999999" cy="40.34722629879661" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="141.68" cy="40.70413853830351" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="155.95999999999998" cy="39.36571764015264" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="170.24" cy="39.63340181978282" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="184.51999999999998" cy="34.72585852656297" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="198.79999999999998" cy="31.424420311124152" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="213.07999999999998" cy="30.264455532726743" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="227.35999999999999" cy="32.22747285001469" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="241.64" cy="33.07513941884358" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="255.92" cy="34.6812444966246" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="270.2" cy="36.24273554446728" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="284.48" cy="36.555033754035804" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="298.76" cy="33.565893748165536" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="313.03999999999996" cy="34.19049016730261" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="327.32" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="341.59999999999997" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="355.88" cy="32.0936307601996" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="370.15999999999997" cy="31.692104490754332" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="384.44" cy="32.18285882007632" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="398.71999999999997" cy="31.156736131494" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="413" cy="27.49838567654828" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="427.28" cy="25" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 375.78 px ; top : 35 px ;"><div class="morris-hover-row-label">
                                    2011 W27</div><div class="morris-hover-point" style="color : #57889c">
                                    Licensed:
                                    3,407
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    SORN:
                                    660
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-9" data-widget-editbutton="false">
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
                            <h2>No Grid Graph</h2>

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

                                <div id="nogrid-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="43.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><text x="43.5" y="138.98884649251542" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="3.996658992515421" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    852</tspan></text><text x="43.5" y="100.97769298503083" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.001130485030828" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    1,704</tspan></text><text x="43.5" y="63.01"""),
format.raw("""115350748459" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.003341007484593" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2,555</tspan></text><text x="43.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    3,407</tspan></text><text x="444.5714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-30</tspan></text><text x="328" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-24</tspan></text><text x="211.42857142857144" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-18</tspan></text><text x="94.85714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012-09-12</tspan></text><path fill="none" stroke="#71843f" d="M56,149.25007337833873C80.28571428571429,148.87085412386264,128.8571428571429,148.23510419724096,153.14285714285717,147.7331963604344C158.00000000000003,147.63281479307307,167.71428571428572,146.86322277663635,172.57142857142858,146.84091576166716C177.42857142857144,146.81860874669798,187.14285714285714,147.2814793073085,192,147.55474024068096C196.85714285714286,147.8280011740534,206.57142857142858,149.06604050484296,211.42857142857144,149.0270032286469C216.2857142857143,148.98796595245082,226,147.43205165835047,230.85714285714286,147.24244203111243C235.71428571428572,147.0528324038744,245.42857142857144,147.45547402406808,250.2857142857143,147.51012621074258C294,148.00199589081302,381.42857142857144,149.10730848253596,425.14285714285717,149.42852949809216C430,149.46422072204285,439.7142857142858,149.1719988259466,444.5714285714286,148.93777516877017C449.42857142857144,148.7035515115938,459.14285714285717,147.90049897270325,464,147.55474024068096" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M56,33.565893748165536C80.28571428571429,33.722042852949805,128.8571428571429,33.781528226200955,153.14285714285717,34.19049016730261C158.00000000000003,34.27228255552294,167.71428571428572,35.36160845318463,172.57142857142858,35.528911065453485C177.42857142857144,35.69621367772234,187.14285714285714,35.95832110361022,192,35.528911065453485C196.85714285714286,35.099501027296746,206.57142857142858,32.573231582036996,211.42857142857144,32.0936307601996C216.2857142857143,31.614029938362208,226,31.680950983269742,230.85714285714286,31.692104490754332C235.71428571428572,31.70325799823892,245.42857142857144,32.196243029057825,250.2857142857143,32.18285882007632C294,32.06240093924274,381.42857142857144,32.21074258878781,425.14285714285717,31.156736131494C430,31.0396243029058,439.7142857142858,28.26797769298503,444.5714285714286,27.49838567654828C449.42857142857144,26.72879366011153,459.14285714285717,25.62459641913707,464,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="56" cy="149.25007337833873" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="147.7331963604344" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="172.57142857142858" cy="146.84091576166716" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="192" cy="147.55474024068096" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="211.42857142857144" cy="149.0270032286469" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="230.85714285714286" cy="147.24244203111243" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="147.51012621074258" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="425.14285714285717" cy="149.42852949809216" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="444.5714285714286" cy="148.93777516877017" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="147.55474024068096" r="7" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="56" cy="33.565893748165536" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="34.19049016730261" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="172.57142857142858" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="192" cy="35.528911065453485" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="211.42857142857144" cy="32.0936307601996" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="230.85714285714286" cy="31.692104490754332" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="32.18285882007632" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="425.14285714285717" cy="31.156736131494" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="444.5714285714286" cy="27.49838567654828" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="25" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 386 px ; top : 35 px ;"><div class="morris-hover-row-label">
                                    2012-10-01</div><div class="morris-hover-point" style="color : #57889c">
                                    Licensed:
                                    3,407
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    SORN:
                                    660
                                </div></div></div>

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
                            <h2>Bar Graph </h2>

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

                                <div id="bar-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="19.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="139" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,139H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="101" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    4</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,101H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="63" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    6</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,63H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="19.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    8</tspan></text><path fill="none" stroke="#aaaaaa" d="M32,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="440" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2013 Q1</tspan></text><text x="296" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2012 Q2</tspan></text><text x="152" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011 Q3</tspan></text><rect x="38" y="177" width="36" height="0" r="0" rx="0" ry="0" fill="#000000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="86" y="158" width="36" height="19" r="0" rx="0" ry="0" fill="#130000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="134" y="139" width="36" height="38" r="0" rx="0" ry="0" fill="#260000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="182" y="120" width="36" height="57" r="0" rx="0" ry="0" fill="#390000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="230" y="101" width="36" height="76" r="0" rx="0" ry="0" fill="#4b0000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="278" y="82" width="36" height="95" r="0" rx="0" ry="0" fill="#5e0000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="326" y="63" width="36" height="114" r="0" rx="0" ry="0" fill="#710000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="374" y="44" width="36" height="133" r="0" rx="0" ry="0" fill="#840000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="422" y="25" width="36" height="152" r="0" rx="0" ry="0" fill="#960000" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect></svg><div class="morris-hover morris-default-style" style="left : 408.5 px ; top : 81.5 px ;"><div class="morris-hover-row-label">
                                    2013 Q1</div><div class="morris-hover-point" style="color : #000">
                                    Y:
                                    8
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

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
                            <h2>Stacked Bar Graph </h2>

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

                                <div id="stacked-bar-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><rect x="38.71875" y="138.33333333333331" width="82.3125" height="56.666666666666686" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="38.71875" y="100.55555555555554" width="82.3125" height="37.77777777777777" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="""),
format.raw(""""0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="38.71875" y="43.88888888888886" width="82.3125" height="56.666666666666686" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="148.46875" y="157.22222222222223" width="82.3125" height="37.77777777777777" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="148.46875" y="138.33333333333334" width="82.3125" height="18.888888888888886" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="258.21875" y="195" width="82.3125" height="0" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="258.21875" y="157.22222222222223" width="82.3125" height="37.77777777777777" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="258.21875" y="81.66666666666667" width="82.3125" height="75.55555555555556" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="367.96875" y="157.22222222222223" width="82.3125" height="37.77777777777777" r="0" rx="0" ry="0" fill="#57889c" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="367.96875" y="81.66666666666667" width="82.3125" height="75.55555555555556" r="0" rx="0" ry="0" fill="#71843f" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect><rect x="367.96875" y="24.999999999999986" width="82.3125" height="56.666666666666686" r="0" rx="0" ry="0" fill="#92a2a8" stroke="#000" stroke-width="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></rect></svg><div class="morris-hover morris-default-style" style="left : 377.625 px ; top : 63 px ;"><div class="morris-hover-row-label">
                                    2011 Q4</div><div class="morris-hover-point" style="color : #57889c">
                                    Y:
                                    2
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    Z:
                                    4
                                </div><div class="morris-hover-point" style="color : #92a2a8">
                                    A:
                                    3
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

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
                            <h2>Donut Graph</h2>

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

                                <div id="donut-graph" class="chart no-padding"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><path fill="none" stroke="#57889c" d="M244.5,176.66666666666669A66.66666666666667,66.66666666666667,0,1,0,184.4522023010087,81.03957120577357" stroke-width="2" opacity="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; opacity : 1 ;"></path><path fill="#57889c" stroke="#ffffff" d="M244.5,179.66666666666669A69.66666666666667,69.66666666666667,0,1,0,181.75005140455409,79.73635191003339L154.42830345151305,66.55935680866037A100,100,0,1,1,244.5,210Z" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#3980b5" d="M184.4522023010087,81.03957120577357A66.66666666666667,66.66666666666667,0,0,0,186.74673905302433,143.30173110267643" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; opacity : 0 ;"></path><path fill="#3980b5" stroke="#ffffff" d="M181.75005140455409,79.73635191003339A69.66666666666667,69.66666666666667,0,0,0,184.1478423104104,144.80030900229687L162.20160315055966,157.45496682131392A95,95,0,0,1,158.93188827893738,68.73138896822735Z" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#679dc6" d="M186.74673905302433,143.30173110267643A66.66666666666667,66.66666666666667,0,0,0,220.115474901629,172.04707390499055" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; opacity : 0 ;"></path><path fill="#679dc6" stroke="#ffffff" d="M184.1478423104104,144.80030900229687A69.66666666666667,69.66666666666667,0,0,0,219.0181712722023,174.83919223071513L209.75205173482132,198.4170803146115A95,95,0,0,1,162.20160315055966,157.45496682131392Z" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#95bbd7" d="M220.115474901629,172.04707390499055A66.66666666666667,66.66666666666667,0,0,0,244.47905604932066,176.66666337679848" stroke-width="2" opacity="0" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; opacity : 0 ;"></path><path fill="#95bbd7" stroke="#ffffff" d="M219.0181712722023,174.83919223071513A69.66666666666667,69.66666666666667,0,0,0,244.4781135715401,179.66666322875443L244.47015487028193,204.99999531193782A95,95,0,0,1,209.75205173482132,198.4170803146115Z" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="244.5" y="100" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#000000" font-size="15px" font-weight="800" transform="matrix(1.9608,0,0,1.9608,-234.9118,-104.2451)" stroke-width="0.51" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : 800 ; font-size : 15 px ; line-height : normal ; font-family : Arial ;"><tspan dy="5.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    foo</tspan></text><text x="244.5" y="120" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#000000" font-size="14px" transform="matrix(1.3889,0,0,1.3889,-95.0833,-43.5556)" stroke-width="0.7199999999999999" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 14 px ; line-height : normal ; font-family : Arial ;"><tspan dy="5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    70%</tspan></text></svg></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-8" data-widget-editbutton="false">
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
                            <h2>Line Graph A </h2>

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

                                <div id="graph-B" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="48.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    -100%</tspan></text><path fill="none" stroke="#aaaaaa" d="M61,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="48.5" y="139" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    -50%</tspan></text><path fill="none" stroke="#aaaaaa" d="M61,139H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="48.5" y="101" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0%</tspan></text><path fill="none" stroke="#aaaaaa" d="M61,101H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="48.5" y="63" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    50%</tspan></text><path fill="none" stroke="#aaaaaa" d="M61,63H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="48.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    100%</tspan></text><path fill="none" stroke="#aaaaaa" d="M61,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="332.9956268221574" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2011</tspan></text><text x="118.57142857142857" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2010</tspan></text><path fill="none" stroke="#57889c" d="M61,177C62.762390670553934,172.25,66.2871720116618,159.5,68.04956268221574,158C77.44897959183673,150,96.24781341107871,145.4,105.6472303206997,139C110.20007288629738,135.9,119.3057580174927,123.13297872340425,123.85860058309038,120C133.11115160349854,113.63297872340425,151.61625364431487,105.9875,160.86880466472303,101C169.24016034985422,96.4875,185.9828717201166,85.68367346938776,194.3542274052478,82C207.57215743440233,76.18367346938776,234.00801749271136,65.87878787878788,247.2259475218659,63C277.6271865889213,56.37878787878788,338.4296647230321,49.329268292682926,368.83090379008746,44C392.6231778425656,39.829268292682926,440.20772594752185,29.75,464,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="61" cy="177" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="68.04956268221574" cy="158" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="105.6472303206997" cy="139" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="123.85860058309038" cy="120" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="160.86880466472303" cy="101" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="194.3542274052478" cy="82" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="247.2259475218659" cy="63" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="368.83090379008746" cy="44" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="25" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 389 px ; top : 35 px ;"><div class="morris-hover-row-label">
                                    2011-08-12</div><div class="morris-hover-point" style="color : #57889c">
                                    Series A:
                                    100%
                                </div></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-10" data-widget-editbutton="false">
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
                            <h2>Line Graph B </h2>

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

                                <div id="non-continu-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="489" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="43.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,177H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="138.98884649251542" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="3.996658992515421" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    852</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,138.98884649251542H464" stroke-width="0.5" style="-"""),
format.raw("""webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="100.97769298503083" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.001130485030828" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    1,704</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,100.97769298503083H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="63.01115350748459" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.003341007484593" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    2,555</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,63.01115350748459H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="43.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    3,407</tspan></text><path fill="none" stroke="#aaaaaa" d="M56,25H464" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="444.5714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    9/30/2012</tspan></text><text x="328" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    9/24/2012</tspan></text><text x="211.42857142857144" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    9/18/2012</tspan></text><text x="94.85714285714286" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    9/12/2012</tspan></text><path fill="none" stroke="#71843f" d="M153.14285714285717,147.7331963604344C158.00000000000003,155.0498972703258,167.71428571428572,173.3416495450543,172.57142857142858,177C177.42857142857144,177,187.14285714285714,177,192,177C206.57142857142858,171.47064866451424,235.71428571428572,149.23334311711181,250.2857142857143,147.51012621074258C294,142.34047549163486,381.42857142857144,142.79330789550923,425.14285714285717,149.42852949809216C430,150.1657763428236,439.7142857142858,170.10713237452305,444.5714285714286,177" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><path fill="none" stroke="#57889c" d="M56,33.565893748165536C80.28571428571429,33.722042852949805,128.8571428571429,34.42053125917229,153.14285714285717,34.19049016730261C167.71428571428572,34.05246551218081,196.8571428571429,32.5620780745524,211.42857142857144,32.0936307601996C216.2857142857143,31.937481655415336,226,31.680950983269742,230.85714285714286,31.692104490754332C235.71428571428572,31.70325799823892,245.42857142857144,32.3222776636337,250.2857142857143,32.18285882007632C303.7142857142857,30.64925154094512,410.57142857142856,26.79571470501908,464,25" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="211.42857142857144" cy="132.3859700616378" r="4" fill="#92a2a8" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="147.7331963604344" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="172.57142857142858" cy="177" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="192" cy="177" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="147.51012621074258" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="425.14285714285717" cy="149.42852949809216" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="444.5714285714286" cy="177" r="4" fill="#71843f" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="56" cy="33.565893748165536" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="153.14285714285717" cy="34.19049016730261" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="211.42857142857144" cy="32.0936307601996" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="230.85714285714286" cy="31.692104490754332" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="250.2857142857143" cy="32.18285882007632" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464" cy="25" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 386 px ; top : 35 px ;"><div class="morris-hover-row-label">
                                    2012-10-01</div><div class="morris-hover-point" style="color : #57889c">
                                    Licensed:
                                    3,407
                                </div><div class="morris-hover-point" style="color : #71843f">
                                    SORN:
                                    -
                                </div><div class="morris-hover-point" style="color : #92a2a8">
                                    Other:
                                    -
                                </div></div></div>

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
                    <div class="jarviswidget" id="wid-id-11" data-widget-editbutton="false">
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
                            <h2>Line Graph C</h2>

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

                                <div id="non-date-graph" class="chart no-padding" style="position : relative ;"><svg height="220" version="1.1" width="1021" xmlns="http://www.w3.org/2000/svg" style="overflow : hidden ; position : relative ;"><desc style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    Created with Raphaël 2.1.2</desc><defs style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></defs><text x="26.5" y="177" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    0</tspan></text><path fill="none" stroke="#aaaaaa" d="M39,177H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="26.5" y="136.76470588235293" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.006893382352928" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    9</tspan></text><path fill="none" stroke="#aaaaaa" d="M39,136.76470588235293H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="26.5" y="101" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    17</tspan></text><path fill="none" stroke="#aaaaaa" d="M39,101H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="26.5" y="60.76470588235294" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4.006893382352942" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    26</tspan></text><path fill="none" stroke="#aaaaaa" d="M39,60.76470588235294H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="26.5" y="25" text-anchor="end" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : end ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    34</tspan></text><path fill="none" stroke="#aaaaaa" d="M39,25H996" stroke-width="0.5" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><text x="996" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    X</tspan></text><text x="889.6666666666666" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    IX</tspan></text><text x="783.3333333333333" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    VIII</tspan></text><text x="677" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    VII</tspan></text><text x="570.6666666666666" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    VI</tspan></text><text x="464.3333333333333" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    V</tspan></text><text x="358" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    IV</tspan></text><text x="251.66666666666666" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    III</tspan></text><text x="145.33333333333331" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    II</tspan></text><text x="39" y="192" text-anchor="middle" font="10px &quot;Arial&quot;" stroke="none" fill="#888888" font-size="12px" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ; text-anchor : middle ; font-style : normal ; font-variant : normal ; font-weight : normal ; font-size : 12 px ; line-height : normal ; font-family : Arial ;"><tspan dy="4" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;">
                                    I</tspan></text><path fill="none" stroke="#57889c" d="M39,25C65.58333333333333,36.17647058823529,118.74999999999999,52.382352941176464,145.33333333333331,69.70588235294117C171.91666666666666,87.02941176470588,225.08333333333331,156.88235294117646,251.66666666666666,163.58823529411765C278.25,170.29411764705884,331.4166666666667,128.94117647058823,358,123.35294117647058C384.5833333333333,117.76470588235293,437.75,124.47058823529412,464.3333333333333,118.88235294117646C490.91666666666663,113.29411764705881,544.0833333333333,74.17647058823529,570.6666666666666,78.6470588235294C597.25,83.11764705882352,650.4166666666666,156.8823529411765,677,154.64705882352942C703.5833333333333,152.41176470588238,756.75,64.67647058823529,783.3333333333333,60.76470588235294C809.9166666666666,56.85294117647059,863.0833333333333,119.44117647058823,889.6666666666666,123.35294117647058C916.25,127.26470588235293,969.4166666666666,99.88235294117646,996,92.05882352941177" stroke-width="3" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></path><circle cx="39" cy="25" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="145.33333333333331" cy="69.70588235294117" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="251.66666666666666" cy="163.58823529411765" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="358" cy="123.35294117647058" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="464.3333333333333" cy="118.88235294117646" r="4" fill="#57889c" stroke="#fffff"""),
format.raw("""f" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="570.6666666666666" cy="78.6470588235294" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="677" cy="154.64705882352942" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="783.3333333333333" cy="60.76470588235294" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="889.6666666666666" cy="123.35294117647058" r="4" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle><circle cx="996" cy="92.05882352941177" r="7" fill="#57889c" stroke="#ffffff" stroke-width="1" style="-webkit-tap-highlight-color : rgba ( 0, 0, 0, 0 ) ;"></circle></svg><div class="morris-hover morris-default-style" style="left : 955 px ; top : 25.058823529411768 px ;"><div class="morris-hover-row-label">
                                    X</div><div class="morris-hover-point" style="color : #57889c">
                                    value:
                                    19
                                </div></div></div>

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
                  DATE: Thu Aug 28 21:08:44 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/morris.scala.html
                  HASH: c01ee7d926d32f2ec1027d2856e59d547783dc07
                  MATRIX: 511->1|599->20|613->27|693->31|724->36|1124->408|1153->409|1182->410|1227->427|1256->428|1803->947|1832->948|1865->954|1947->1008|1976->1009|2009->1015|2051->1029|2080->1030|2112->1035|2177->1072|2206->1073|2238->1078|2343->1156|2371->1157|2400->1159|2428->1160|2460->1165|2565->1243|2593->1244|2622->1246|2650->1247|2682->1252|2787->1330|2815->1331|2844->1333|2872->1334|2904->1339|3009->1417|3037->1418|3066->1420|3094->1421|3126->1426|3231->1504|3259->1505|3288->1507|3316->1508|3348->1513|3453->1591|3481->1592|3510->1594|3538->1595|3570->1600|3675->1678|3703->1679|3732->1681|3760->1682|3792->1687|3898->1766|3926->1767|3955->1769|3983->1770|4015->1775|4121->1854|4149->1855|4178->1857|4206->1858|4238->1863|4343->1941|4371->1942|4399->1943|4588->2104|4617->2105|4646->2106|4683->2115|4712->2116|4746->2122|4827->2174|4857->2175|4890->2180|4933->2194|4963->2195|4996->2200|5061->2236|5091->2237|5121->2238|5178->2266|5208->2267|5239->2269|5269->2270|5299->2271|5356->2299|5386->2300|5417->2302|5447->2303|5477->2304|5535->2332|5566->2333|5598->2335|5629->2336|5660->2337|5718->2365|5749->2366|5782->2371|5883->2444|5912->2445|5941->2446|5977->2454|6006->2455|6040->2461|6125->2517|6155->2518|6189->2524|6231->2537|6261->2538|6294->2543|6358->2578|6388->2579|6418->2580|6468->2601|6498->2602|6529->2604|6559->2605|6589->2606|6639->2627|6669->2628|6700->2630|6730->2631|6760->2632|6810->2653|6840->2654|6871->2656|6901->2657|6931->2658|6982->2679|7013->2680|7045->2682|7076->2683|7107->2684|7158->2705|7189->2706|7221->2708|7252->2709|7283->2710|7334->2731|7365->2732|7397->2734|7428->2735|7459->2736|7510->2757|7541->2758|7573->2760|7604->2761|7635->2762|7686->2783|7717->2784|7749->2786|7780->2787|7811->2788|7862->2809|7893->2810|7926->2815|8062->2922|8092->2923|8125->2928|8176->2950|8206->2951|8239->2956|8357->3046|8386->3047|8419->3052|8453->3057|8483->3058|8516->3063|8564->3083|8593->3084|8626->3089|8655->3090|8688->3095|8717->3096|8746->3097|8783->3106|8812->3107|8846->3113|8937->3175|8967->3176|9001->3182|9043->3195|9073->3196|9106->3201|9177->3243|9207->3244|9237->3245|9301->3280|9331->3281|9362->3283|9392->3284|9422->3285|9489->3323|9519->3324|9550->3326|9580->3327|9610->3328|9675->3363|9706->3364|9738->3366|9769->3367|9800->3368|9865->3403|9896->3404|9929->3409|10040->3492|10069->3493|10098->3494|10135->3503|10164->3504|10198->3510|10291->3574|10321->3575|10354->3580|10396->3593|10426->3594|10459->3599|10548->3659|10578->3660|10608->3661|10672->3696|10702->3697|10733->3699|10763->3700|10793->3701|10860->3739|10890->3740|10921->3742|10951->3743|10981->3744|11046->3779|11077->3780|11109->3782|11140->3783|11171->3784|11236->3819|11267->3820|11300->3825|11411->3908|11440->3909|11469->3910|11505->3918|11534->3919|11568->3925|11707->4035|11737->4036|11770->4041|11815->4057|11845->4058|11875->4059|11963->4118|11993->4119|12024->4121|12054->4122|12084->4123|12173->4182|12204->4183|12236->4185|12267->4186|12298->4187|12387->4246|12418->4247|12450->4249|12481->4250|12512->4251|12601->4310|12632->4311|12664->4313|12695->4314|12726->4315|12815->4374|12846->4375|12878->4377|12909->4378|12940->4379|13029->4438|13060->4439|13092->4441|13123->4442|13154->4443|13243->4502|13274->4503|13306->4505|13337->4506|13368->4507|13457->4566|13488->4567|13520->4569|13551->4570|13582->4571|13671->4630|13702->4631|13734->4633|13765->4634|13796->4635|13885->4694|13916->4695|13949->4700|14000->4722|14030->4723|14063->4728|14233->4870|14262->4871|14291->4872|14325->4878|14354->4879|14388->4885|14474->4942|14504->4943|14537->4948|14633->5015|14663->5016|14696->5021|14745->5041|14775->5042|14808->5047|14900->5111|14929->5112|14958->5113|14994->5121|15023->5122|15056->5127|15110->5152|15140->5153|15173->5158|15387->5343|15417->5344|15450->5349|15561->5432|15590->5433|15646->5461|15675->5462|15704->5463|15740->5471|15769->5472|15803->5478|15880->5526|15910->5527|15943->5532|15987->5547|16017->5548|16050->5553|16116->5590|16146->5591|16176->5592|16231->5618|16261->5619|16292->5621|16322->5622|16352->5623|16407->5649|16437->5650|16468->5652|16498->5653|16528->5654|16584->5680|16615->5681|16647->5683|16678->5684|16709->5685|16787->5733|16818->5734|16851->5739|16914->5773|16944->5774|16974->5775|17018->5790|17048->5791|17081->5796|17110->5797|17139->5798|17175->5806|17204->5807|17238->5813|17323->5869|17353->5870|17386->5875|17432->5892|17462->5893|17492->5894|17578->5951|17608->5952|17639->5954|17669->5955|17699->5956|17786->6013|17817->6014|17849->6016|17880->6017|17911->6018|17998->6075|18029->6076|18061->6078|18092->6079|18123->6080|18210->6137|18241->6138|18273->6140|18304->6141|18335->6142|18422->6199|18453->6200|18485->6202|18516->6203|18547->6204|18634->6261|18665->6262|18697->6264|18728->6265|18759->6266|18846->6323|18877->6324|18909->6326|18940->6327|18971->6328|19058->6385|19089->6386|19121->6388|19152->6389|19183->6390|19270->6447|19301->6448|19333->6450|19364->6451|19395->6452|19482->6509|19513->6510|19545->6512|19576->6513|19607->6514|19694->6571|19725->6572|19757->6574|19788->6575|19819->6576|19906->6633|19937->6634|19969->6636|20000->6637|20031->6638|20118->6695|20149->6696|20181->6698|20212->6699|20243->6700|20330->6757|20361->6758|20393->6760|20424->6761|20455->6762|20543->6820|20574->6821|20606->6823|20637->6824|20668->6825|20757->6883|20789->6884|20822->6886|20854->6887|20886->6888|20975->6946|21007->6947|21040->6949|21072->6950|21104->6951|21193->7009|21225->7010|21258->7012|21290->7013|21322->7014|21411->7072|21443->7073|21476->7075|21508->7076|21540->7077|21629->7135|21661->7136|21694->7138|21726->7139|21758->7140|21847->7198|21879->7199|21912->7201|21944->7202|21976->7203|22065->7261|22097->7262|22130->7264|22162->7265|22194->7266|22283->7324|22315->7325|22348->7327|22380->7328|22412->7329|22501->7387|22533->7388|22566->7390|22598->7391|22630->7392|22719->7450|22751->7451|22784->7453|22816->7454|22848->7455|22937->7513|22969->7514|23002->7516|23034->7517|23066->7518|23155->7576|23187->7577|23220->7582|23271->7604|23301->7605|23334->7610|23555->7803|23584->7804|23613->7805|23649->7813|23678->7814|23712->7820|23794->7873|23824->7874|23857->7879|23902->7895|23932->7896|23962->7897|24026->7932|24056->7933|24087->7935|24117->7936|24147->7937|24210->7971|24240->7972|24272->7974|24303->7975|24334->7976|24398->8010|24429->8011|24461->8013|24492->8014|24523->8015|24587->8049|24618->8050|24650->8052|24681->8053|24712->8054|24775->8087|24806->8088|24838->8090|24869->8091|24900->8092|24966->8128|24997->8129|25029->8131|25060->8132|25091->8133|25157->8169|25188->8170|25220->8172|25251->8173|25282->8174|25348->8210|25379->8211|25411->8213|25442->8214|25473->8215|25540->8252|25571->8253|25604->8258|25655->8280|25685->8281|25718->8286|25877->8417|25906->8418|25935->8419|25971->8427|26000->8428|26034->8434|26190->8561|26220->8562|26253->8567|26298->8583|26328->8584|26358->8585|26446->8644|26476->8645|26507->8647|26537->8648|26567->8649|26656->8708|26687->8709|26719->8711|26750->8712|26781->8713|26870->8772|26901->8773|26933->8775|26964->8776|26995->8777|27084->8836|27115->8837|27147->8839|27178->8840|27209->8841|27298->8900|27329->8901|27361->8903|27392->8904|27423->8905|27512->8964|27543->8965|27575->8967|27606->8968|27637->8969|27726->9028|27757->9029|27789->9031|27820->9032|27851->9033|27940->9092|27971->9093|28003->9095|28034->9096|28065->9097|28154->9156|28185->9157|28217->9159|28248->9160|28279->9161|28368->9220|28399->9221|28432->9226|28483->9248|28513->9249|28546->9254|28736->9416|28765->9417|28794->9418|28830->9426|28859->9427|28893->9433|29064->9575|29094->9576|29127->9581|29172->9597|29202->9598|29232->9599|29304->9642|29334->9643|29365->9645|29395->9646|29425->9647|29493->9685|29524->9686|29556->9688|29587->9689|29618->9690|29688->9730|29719->9731|29751->9733|29782->9734|29813->9735|29902->9794|29933->9795|29965->9797|29996->9798|30027->9799|30117->9859|30148->9860|30180->9862|30211->9863|30242->9864|30331->9923|30362->9924|30394->9926|30425->9927|30456->9928|30524->9966|30555->9967|30587->9969|30618->9970|30649->9971|30717->10009|30748->10010|30780->10012|30811->10013|30842->10014|30931->10073|30962->10074|30994->10076|31025->10077|31056->10078|31129->10121|31160->10122|31193->10127|31244->10149|31274->10150|31307->10155|31588->10407|31618->10408|31648->10409|31758->10489|31789->10490|31910->10583|31939->10584|31968->10585|32004->10593|32033->10594|32067->10600|32155->10659|32185->10660|32218->10665|32263->10681|32293->10682|32323->10683|32382->10713|32412->10714|32443->10716|32473->10717|32503->10718|32563->10749|32593->10750|32624->10752|32654->10753|32684->10754|32745->10785|32776->10786|32808->10788|32839->10789|32870->10790|32931->10821|32962->10822|32994->10824|33025->10825|33056->10826|33116->10856|33147->10857|33179->10859|33210->10860|33241->10861|33302->10892|33333->10893|33365->10895|33396->10896|33427->10897|33488->10928|33519->10929|33551->10931|33582->10932|33613->10933|33676->10966|33707->10967|33739->10969|33770->10970|33801->10971|33862->11002|33893->11003|33925->11005|33956->11006|33987->11007|34047->11037|34078->11038|34111->11043|34162->11065|34192->11066|34225->11071|34399->11217|34428->11218|34457->11219|34493->11227|34522->11228|34556->11234|34644->11293|34674->11294|34707->11299|34749->11312|34779->11313|34812->11318|34920->11397|34950->11398|34980->11399|35044->11434|35074->11435|35105->11437|35135->11438|35165->11439|35232->11477|35262->11478|35293->11480|35323->11481|35353->11482|35418->11517|35449->11518|35481->11520|35512->11521|35543->11522|35608->11557|35639->11558|35672->11563|35803->11666|35832->11667|35861->11668|35897->11676|35926->11677|35960->11683|36043->11737|36073->11738|36107->11744|36184->11792|36214->11793|36247->11798|36334->11856|36364->11857|36397->11862|36472->11908|36502->11909|36535->11914|36681->12032|36710->12033|36739->12034|36775->12042|36804->12043|36837->12048|36882->12065|36911->12066|36944->12071|36999->12097|37029->12098|37062->12103|37298->12311|37327->12312|37356->12313|37413->12341|37443->12342|37476->12347|37627->12470|37656->12471|37689->12476|37751->12510|37780->12511|37815->12518|37844->12519|37873->12520|38064->12682|38094->12683|38127->12688|38239->12772|38268->12773|38297->12774|38357->18|38386->12795|38415->12797|38446->12818|38487->12820|38520->12825
                  LINES: 19->1|21->2|21->2|23->2|24->3|37->16|37->16|37->16|37->16|37->16|62->41|62->41|64->43|65->44|65->44|67->46|67->46|67->46|68->47|69->48|69->48|70->49|74->53|74->53|74->53|74->53|75->54|79->58|79->58|79->58|79->58|80->59|84->63|84->63|84->63|84->63|85->64|89->68|89->68|89->68|89->68|90->69|94->73|94->73|94->73|94->73|95->74|99->78|99->78|99->78|99->78|100->79|104->83|104->83|104->83|104->83|105->84|109->88|109->88|109->88|109->88|110->89|114->93|114->93|114->93|114->93|115->94|119->98|119->98|119->98|125->104|125->104|125->104|127->106|127->106|129->108|130->109|130->109|131->110|131->110|131->110|132->111|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|133->112|134->113|138->117|138->117|138->117|139->118|139->118|141->120|142->121|142->121|144->123|144->123|144->123|145->124|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|146->125|147->126|151->130|151->130|152->131|152->131|152->131|153->132|155->134|155->134|156->135|156->135|156->135|157->136|158->137|158->137|159->138|159->138|160->139|160->139|160->139|162->141|162->141|164->143|165->144|165->144|167->146|167->146|167->146|168->147|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|169->148|170->149|174->153|174->153|174->153|176->155|176->155|178->157|179->158|179->158|180->159|180->159|180->159|181->160|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|183->162|184->163|188->167|188->167|188->167|189->168|189->168|191->170|192->171|192->171|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|193->172|194->173|195->174|195->174|196->175|201->180|201->180|201->180|202->181|202->181|204->183|205->184|205->184|206->185|207->186|207->186|208->187|208->187|208->187|209->188|211->190|211->190|211->190|212->191|212->191|213->192|213->192|213->192|214->193|220->199|220->199|221->200|223->202|223->202|225->204|225->204|225->204|226->205|226->205|228->207|229->208|229->208|230->209|230->209|230->209|231->210|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|232->211|233->212|234->213|234->213|234->213|234->213|234->213|235->214|235->214|235->214|236->215|236->215|238->217|239->218|239->218|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|240->219|241->220|242->221|242->221|243->222|252->231|252->231|252->231|253->232|253->232|255->234|256->235|256->235|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|257->236|258->237|259->238|259->238|260->239|266->245|266->245|266->245|267->246|267->246|269->248|271->250|271->250|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|272->251|273->252|274->253|274->253|275->254|281->260|281->260|281->260|282->261|282->261|284->263|286->265|286->265|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|287->266|288->267|289->268|289->268|290->269|296->275|296->275|296->275|296->275|296->275|299->278|299->278|299->278|300->279|300->279|302->281|303->282|303->282|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|304->283|305->284|306->285|306->285|307->286|313->292|313->292|313->292|314->293|314->293|316->295|317->296|317->296|318->297|318->297|318->297|319->298|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|322->301|323->302|328->307|328->307|328->307|329->308|329->308|331->310|332->311|332->311|334->313|335->314|335->314|336->315|337->316|337->316|338->317|339->318|339->318|340->319|343->322|343->322|343->322|344->323|344->323|345->324|346->325|346->325|347->326|347->326|347->326|348->327|357->336|357->336|357->336|358->337|358->337|359->338|362->341|362->341|363->342|364->343|364->343|367->346|367->346|367->346|372->351|372->351|373->352|374->353|374->353|374->353|379->1|380->357|381->358|381->358|381->358|382->359
                  -- GENERATED --
              */
          