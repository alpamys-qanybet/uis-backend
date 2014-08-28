
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
object typography extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><style>
    /*
     * Examples
     *
     * Isolated sections of example content for each component or feature. Usually
     * followed by a code snippet.
     */

    .bs-example """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/("""
    """),format.raw/*13.5*/("""position: relative;
    padding: 15px 15px 15px;
    margin: 0 0px 15px;
    background-color: #fafafa;
    border-color: #e5e5e5 #eee #eee;
    border-style: solid;
    border-width: 1px;
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""/* Echo out a label for the example */
    .bs-example:after """),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""
    """),format.raw/*23.5*/("""content: "";
    position: absolute;
    top: 15px;
    left: 15px;
    font-size: 12px;
    font-weight: bold;
    color: #bbb;
    text-transform: uppercase;
    letter-spacing: 1px;
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""

    """),format.raw/*34.5*/("""/* Tweak display of the code snippets when following an example */
    .bs-example + .highlight """),format.raw/*35.30*/("""{"""),format.raw/*35.31*/("""
    """),format.raw/*36.5*/("""margin: -15px 0px 15px;
    border-radius: 0;
    border-width: 0 0 1px;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""/* Make the examples and snippets not full-width */
        @media (min-width: 768px) """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
    """),format.raw/*43.5*/(""".bs-example """),format.raw/*43.17*/("""{"""),format.raw/*43.18*/("""
    """),format.raw/*44.5*/("""margin-left: 0;
    margin-right: 0;
    background-color: #fff;
    border-width: 1px;
    border-color: #ddd;
    border-radius: 4px 4px 0 0;
    box-shadow: none;
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""
    """),format.raw/*52.5*/(""".bs-example + .highlight """),format.raw/*52.30*/("""{"""),format.raw/*52.31*/("""
    """),format.raw/*53.5*/("""margin-top: -16px;
    margin-left: 0;
    margin-right: 0;
    border-width: 1px;
    border-bottom-left-radius: 4px;
    border-bottom-right-radius: 4px;
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/("""
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""

    """),format.raw/*62.5*/("""/* Undo width of container */
    .bs-example .container """),format.raw/*63.28*/("""{"""),format.raw/*63.29*/("""
    """),format.raw/*64.5*/("""width: auto;
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""

    """),format.raw/*67.5*/("""/* Tweak content of examples for optimum awesome */
    .bs-example > p:last-child, .bs-example > ul:last-child, .bs-example > ol:last-child, .bs-example > blockquote:last-child, .bs-example > .form-control:last-child, .bs-example > .table:last-child, .bs-example > .navbar:last-child, .bs-example > .jumbotron:last-child, .bs-example > .alert:last-child, .bs-example > .panel:last-child, .bs-example > .list-group:last-child, .bs-example > .well:last-child, .bs-example > .progress:last-child, .bs-example > .table-responsive:last-child > .table """),format.raw/*68.496*/("""{"""),format.raw/*68.497*/("""
    """),format.raw/*69.5*/("""margin-bottom: 0;
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""
    """),format.raw/*71.5*/(""".bs-example > p > .close """),format.raw/*71.30*/("""{"""),format.raw/*71.31*/("""
    """),format.raw/*72.5*/("""float: none;
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""

    """),format.raw/*75.5*/("""/* Typography */
    .bs-example-type .table .info """),format.raw/*76.35*/("""{"""),format.raw/*76.36*/("""
    """),format.raw/*77.5*/("""color: #999;
    vertical-align: middle;
    background:none;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""
    """),format.raw/*81.5*/(""".bs-example-type .table td """),format.raw/*81.32*/("""{"""),format.raw/*81.33*/("""
    """),format.raw/*82.5*/("""padding: 15px 0;
    border-color: #eee;
    vertical-align: top !important;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""
    """),format.raw/*86.5*/(""".bs-example-type .table tr:first-child td """),format.raw/*86.47*/("""{"""),format.raw/*86.48*/("""
    """),format.raw/*87.5*/("""border-top: 0;
    vertical-align: top;
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""
    """),format.raw/*90.5*/(""".bs-example-type h1, .bs-example-type h2, .bs-example-type h3, .bs-example-type h4, .bs-example-type h5, .bs-example-type h6 """),format.raw/*90.130*/("""{"""),format.raw/*90.131*/("""
    """),format.raw/*91.5*/("""margin-top: 0;
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""

    """),format.raw/*94.5*/("""/* Images */
    .bs-example > .img-circle, .bs-example > .img-rounded, .bs-example > .img-thumbnail """),format.raw/*95.89*/("""{"""),format.raw/*95.90*/("""
    """),format.raw/*96.5*/("""margin: 5px;
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""

    """),format.raw/*99.5*/("""/* Tables */
    .bs-example > .table-responsive > .table """),format.raw/*100.46*/("""{"""),format.raw/*100.47*/("""
    """),format.raw/*101.5*/("""background-color: #fff;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""

    """),format.raw/*104.5*/("""/* Buttons */
    .bs-example > .btn, .bs-example > .btn-group """),format.raw/*105.50*/("""{"""),format.raw/*105.51*/("""
    """),format.raw/*106.5*/("""margin-top: 5px;
    margin-bottom: 5px;
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
    """),format.raw/*109.5*/(""".bs-example > .btn-toolbar + .btn-toolbar """),format.raw/*109.47*/("""{"""),format.raw/*109.48*/("""
    """),format.raw/*110.5*/("""margin-top: 10px;
    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""

    """),format.raw/*113.5*/("""/* Forms */
    .bs-example-control-sizing select, .bs-example-control-sizing input[type="text"] + input[type="text"] """),format.raw/*114.107*/("""{"""),format.raw/*114.108*/("""
    """),format.raw/*115.5*/("""margin-top: 10px;
    """),format.raw/*116.5*/("""}"""),format.raw/*116.6*/("""
    """),format.raw/*117.5*/(""".bs-example-form .input-group """),format.raw/*117.35*/("""{"""),format.raw/*117.36*/("""
    """),format.raw/*118.5*/("""margin-bottom: 10px;
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/("""
    """),format.raw/*120.5*/(""".bs-example > textarea.form-control """),format.raw/*120.41*/("""{"""),format.raw/*120.42*/("""
    """),format.raw/*121.5*/("""resize: vertical;
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/("""

    """),format.raw/*124.5*/("""/* List groups */
    .bs-example > .list-group """),format.raw/*125.31*/("""{"""),format.raw/*125.32*/("""
    """),format.raw/*126.5*/("""max-width: 400px;
    """),format.raw/*127.5*/("""}"""),format.raw/*127.6*/("""

    """),format.raw/*129.5*/("""/* Navbars */
    .bs-example .navbar:last-child """),format.raw/*130.36*/("""{"""),format.raw/*130.37*/("""
    """),format.raw/*131.5*/("""margin-bottom: 0;
    """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/("""
    """),format.raw/*133.5*/(""".bs-navbar-top-example, .bs-navbar-bottom-example """),format.raw/*133.55*/("""{"""),format.raw/*133.56*/("""
    """),format.raw/*134.5*/("""z-index: 1;
    padding: 0;
    overflow: hidden; /* cut the drop shadows off */
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/("""
    """),format.raw/*138.5*/(""".bs-navbar-top-example .navbar-header, .bs-navbar-bottom-example .navbar-header """),format.raw/*138.85*/("""{"""),format.raw/*138.86*/("""
    """),format.raw/*139.5*/("""margin-left: 0;
    """),format.raw/*140.5*/("""}"""),format.raw/*140.6*/("""
    """),format.raw/*141.5*/(""".bs-navbar-top-example .navbar-fixed-top, .bs-navbar-bottom-example .navbar-fixed-bottom """),format.raw/*141.94*/("""{"""),format.raw/*141.95*/("""
    """),format.raw/*142.5*/("""position: relative;
    margin-left: 0;
    margin-right: 0;
    """),format.raw/*145.5*/("""}"""),format.raw/*145.6*/("""
    """),format.raw/*146.5*/(""".bs-navbar-top-example """),format.raw/*146.28*/("""{"""),format.raw/*146.29*/("""
    """),format.raw/*147.5*/("""padding-bottom: 45px;
    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/("""
    """),format.raw/*149.5*/(""".bs-navbar-top-example:after """),format.raw/*149.34*/("""{"""),format.raw/*149.35*/("""
    """),format.raw/*150.5*/("""top: auto;
    bottom: 15px;
    """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/("""
    """),format.raw/*153.5*/(""".bs-navbar-top-example .navbar-fixed-top """),format.raw/*153.46*/("""{"""),format.raw/*153.47*/("""
    """),format.raw/*154.5*/("""top: -1px;
    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/("""
    """),format.raw/*156.5*/(""".bs-navbar-bottom-example """),format.raw/*156.31*/("""{"""),format.raw/*156.32*/("""
    """),format.raw/*157.5*/("""padding-top: 45px;
    """),format.raw/*158.5*/("""}"""),format.raw/*158.6*/("""
    """),format.raw/*159.5*/(""".bs-navbar-bottom-example .navbar-fixed-bottom """),format.raw/*159.52*/("""{"""),format.raw/*159.53*/("""
    """),format.raw/*160.5*/("""bottom: -1px;
    """),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
    """),format.raw/*162.5*/(""".bs-navbar-bottom-example .navbar """),format.raw/*162.39*/("""{"""),format.raw/*162.40*/("""
    """),format.raw/*163.5*/("""margin-bottom: 0;
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/("""
        """),format.raw/*165.9*/("""@media (min-width: 768px) """),format.raw/*165.36*/("""{"""),format.raw/*165.37*/("""
    """),format.raw/*166.5*/(""".bs-navbar-top-example .navbar-fixed-top, .bs-navbar-bottom-example .navbar-fixed-bottom """),format.raw/*166.94*/("""{"""),format.raw/*166.95*/("""
    """),format.raw/*167.5*/("""position: absolute;
    """),format.raw/*168.5*/("""}"""),format.raw/*168.6*/("""
    """),format.raw/*169.5*/(""".bs-navbar-top-example """),format.raw/*169.28*/("""{"""),format.raw/*169.29*/("""
    """),format.raw/*170.5*/("""border-radius: 0 0 4px 4px;
    """),format.raw/*171.5*/("""}"""),format.raw/*171.6*/("""
    """),format.raw/*172.5*/(""".bs-navbar-bottom-example """),format.raw/*172.31*/("""{"""),format.raw/*172.32*/("""
    """),format.raw/*173.5*/("""border-radius: 4px 4px 0 0;
    """),format.raw/*174.5*/("""}"""),format.raw/*174.6*/("""
    """),format.raw/*175.5*/("""}"""),format.raw/*175.6*/("""

    """),format.raw/*177.5*/("""/* Pagination */
    .bs-example .pagination """),format.raw/*178.29*/("""{"""),format.raw/*178.30*/("""
    """),format.raw/*179.5*/("""margin-top: 10px;
    margin-bottom: 10px;
    """),format.raw/*181.5*/("""}"""),format.raw/*181.6*/("""

    """),format.raw/*183.5*/("""/* Pager */
    .bs-example > .pager """),format.raw/*184.26*/("""{"""),format.raw/*184.27*/("""
    """),format.raw/*185.5*/("""margin-top: 0;
    """),format.raw/*186.5*/("""}"""),format.raw/*186.6*/("""

    """),format.raw/*188.5*/("""/* Example modals */
    .bs-example-modal """),format.raw/*189.23*/("""{"""),format.raw/*189.24*/("""
    """),format.raw/*190.5*/("""background-color: #f5f5f5;
    """),format.raw/*191.5*/("""}"""),format.raw/*191.6*/("""
    """),format.raw/*192.5*/(""".bs-example-modal .modal """),format.raw/*192.30*/("""{"""),format.raw/*192.31*/("""
    """),format.raw/*193.5*/("""position: relative;
    top: auto;
    right: auto;
    left: auto;
    bottom: auto;
    z-index: 1;
    display: block;
    """),format.raw/*200.5*/("""}"""),format.raw/*200.6*/("""
    """),format.raw/*201.5*/(""".bs-example-modal .modal-dialog """),format.raw/*201.37*/("""{"""),format.raw/*201.38*/("""
    """),format.raw/*202.5*/("""left: auto;
    margin-left: auto;
    margin-right: auto;
    """),format.raw/*205.5*/("""}"""),format.raw/*205.6*/("""

    """),format.raw/*207.5*/("""/* Example dropdowns */
    .bs-example > .dropdown > .dropdown-menu """),format.raw/*208.46*/("""{"""),format.raw/*208.47*/("""
    """),format.raw/*209.5*/("""position: static;
    display: block;
    margin-bottom: 5px;
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/("""

    """),format.raw/*214.5*/("""/* Example tabbable tabs */
    .bs-example-tabs .nav-tabs """),format.raw/*215.32*/("""{"""),format.raw/*215.33*/("""
    """),format.raw/*216.5*/("""margin-bottom: 15px;
    """),format.raw/*217.5*/("""}"""),format.raw/*217.6*/("""

    """),format.raw/*219.5*/("""/* Tooltips */
    .bs-example-tooltips """),format.raw/*220.26*/("""{"""),format.raw/*220.27*/("""
    """),format.raw/*221.5*/("""text-align: center;
    """),format.raw/*222.5*/("""}"""),format.raw/*222.6*/("""
    """),format.raw/*223.5*/(""".bs-example-tooltips > .btn """),format.raw/*223.33*/("""{"""),format.raw/*223.34*/("""
    """),format.raw/*224.5*/("""margin-top: 5px;
    margin-bottom: 5px;
    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/("""

    """),format.raw/*228.5*/("""/* Popovers */
    .bs-example-popover """),format.raw/*229.25*/("""{"""),format.raw/*229.26*/("""
    """),format.raw/*230.5*/("""padding-bottom: 24px;
    background-color: #f9f9f9;
    """),format.raw/*232.5*/("""}"""),format.raw/*232.6*/("""
    """),format.raw/*233.5*/(""".bs-example-popover .popover """),format.raw/*233.34*/("""{"""),format.raw/*233.35*/("""
    """),format.raw/*234.5*/("""position: relative;
    display: block;
    float: left;
    width: 260px;
    margin: 20px;
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/("""

    """),format.raw/*241.5*/("""/* Scrollspy demo on fixed height div */
    .scrollspy-example """),format.raw/*242.24*/("""{"""),format.raw/*242.25*/("""
    """),format.raw/*243.5*/("""position: relative;
    height: 200px;
    margin-top: 10px;
    overflow: auto;
    """),format.raw/*247.5*/("""}"""),format.raw/*247.6*/("""

    """),format.raw/*249.5*/("""/*
     * Code snippets
     *
     * Generated via Pygments and Jekyll, these are snippets of HTML, CSS, and JS.
     */

    .highlight """),format.raw/*255.16*/("""{"""),format.raw/*255.17*/("""
    """),format.raw/*256.5*/("""display: none; /* hidden by default, until >480px */
    padding: 9px 14px;
    margin-bottom: 14px;
    background-color: #f7f7f9;
    border: 1px solid #e1e1e8;
    border-radius: 4px;
    """),format.raw/*262.5*/("""}"""),format.raw/*262.6*/("""
    """),format.raw/*263.5*/(""".highlight pre """),format.raw/*263.20*/("""{"""),format.raw/*263.21*/("""
    """),format.raw/*264.5*/("""padding: 0;
    margin-top: 0;
    margin-bottom: 0;
    background-color: transparent;
    border: 0;
    white-space: nowrap;
    """),format.raw/*270.5*/("""}"""),format.raw/*270.6*/("""
    """),format.raw/*271.5*/(""".highlight pre code """),format.raw/*271.25*/("""{"""),format.raw/*271.26*/("""
    """),format.raw/*272.5*/("""font-size: inherit;
    color: #333; /* Effectively the base text color */
    """),format.raw/*274.5*/("""}"""),format.raw/*274.6*/("""
    """),format.raw/*275.5*/(""".highlight pre .lineno """),format.raw/*275.28*/("""{"""),format.raw/*275.29*/("""
    """),format.raw/*276.5*/("""display: inline-block;
    width: 22px;
    padding-right: 5px;
    margin-right: 10px;
    text-align: right;
    color: #bebec5;
    """),format.raw/*282.5*/("""}"""),format.raw/*282.6*/("""

    """),format.raw/*284.5*/("""/* Show code snippets when we have the space */
        @media (min-width: 481px) """),format.raw/*285.36*/("""{"""),format.raw/*285.37*/("""
    """),format.raw/*286.5*/(""".highlight """),format.raw/*286.16*/("""{"""),format.raw/*286.17*/("""
    """),format.raw/*287.5*/("""display: block;
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""
    """),format.raw/*289.5*/("""}"""),format.raw/*289.6*/("""

    """),format.raw/*291.5*/(""".hll """),format.raw/*291.10*/("""{"""),format.raw/*291.11*/("""
    """),format.raw/*292.5*/("""background-color: #ffffcc
    """),format.raw/*293.5*/("""}"""),format.raw/*293.6*/("""
    """),format.raw/*294.5*/("""/*"""),format.raw/*294.7*/("""{"""),format.raw/*294.8*/(""" """),format.raw/*294.9*/("""background: #f0f3f3; """),format.raw/*294.30*/("""}"""),format.raw/*294.31*/("""*/
    .c """),format.raw/*295.8*/("""{"""),format.raw/*295.9*/("""
    """),format.raw/*296.5*/("""color: #999;
    """),format.raw/*297.5*/("""}"""),format.raw/*297.6*/("""/* Comment */
    .err """),format.raw/*298.10*/("""{"""),format.raw/*298.11*/("""
    """),format.raw/*299.5*/("""color: #AA0000;
    background-color: #FFAAAA
    """),format.raw/*301.5*/("""}"""),format.raw/*301.6*/("""/* Error */
    .k """),format.raw/*302.8*/("""{"""),format.raw/*302.9*/("""
    """),format.raw/*303.5*/("""color: #006699;
    """),format.raw/*304.5*/("""}"""),format.raw/*304.6*/("""/* Keyword */
    .o """),format.raw/*305.8*/("""{"""),format.raw/*305.9*/("""
    """),format.raw/*306.5*/("""color: #555555
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/("""/* Operator */
    .cm """),format.raw/*308.9*/("""{"""),format.raw/*308.10*/("""
    """),format.raw/*309.5*/("""color: #0099FF;
    font-style: italic
    """),format.raw/*311.5*/("""}"""),format.raw/*311.6*/("""/* Comment.Multiline */
    .cp """),format.raw/*312.9*/("""{"""),format.raw/*312.10*/("""
    """),format.raw/*313.5*/("""color: #009999
    """),format.raw/*314.5*/("""}"""),format.raw/*314.6*/("""/* Comment.Preproc */
    .c1 """),format.raw/*315.9*/("""{"""),format.raw/*315.10*/("""
    """),format.raw/*316.5*/("""color: #999;
    """),format.raw/*317.5*/("""}"""),format.raw/*317.6*/("""/* Comment.Single */
    .cs """),format.raw/*318.9*/("""{"""),format.raw/*318.10*/("""
    """),format.raw/*319.5*/("""color: #999;
    """),format.raw/*320.5*/("""}"""),format.raw/*320.6*/("""/* Comment.Special */
    .gd """),format.raw/*321.9*/("""{"""),format.raw/*321.10*/("""
    """),format.raw/*322.5*/("""background-color: #FFCCCC;
    border: 1px solid #CC0000
    """),format.raw/*324.5*/("""}"""),format.raw/*324.6*/("""/* Generic.Deleted */
    .ge """),format.raw/*325.9*/("""{"""),format.raw/*325.10*/("""
    """),format.raw/*326.5*/("""font-style: italic
    """),format.raw/*327.5*/("""}"""),format.raw/*327.6*/("""/* Generic.Emph */
    .gr """),format.raw/*328.9*/("""{"""),format.raw/*328.10*/("""
    """),format.raw/*329.5*/("""color: #FF0000
    """),format.raw/*330.5*/("""}"""),format.raw/*330.6*/("""/* Generic.Error */
    .gh """),format.raw/*331.9*/("""{"""),format.raw/*331.10*/("""
    """),format.raw/*332.5*/("""color: #003300;
    """),format.raw/*333.5*/("""}"""),format.raw/*333.6*/("""/* Generic.Heading */
    .gi """),format.raw/*334.9*/("""{"""),format.raw/*334.10*/("""
    """),format.raw/*335.5*/("""background-color: #CCFFCC;
    border: 1px solid #00CC00
    """),format.raw/*337.5*/("""}"""),format.raw/*337.6*/("""/* Generic.Inserted */
    .go """),format.raw/*338.9*/("""{"""),format.raw/*338.10*/("""
    """),format.raw/*339.5*/("""color: #AAAAAA
    """),format.raw/*340.5*/("""}"""),format.raw/*340.6*/("""/* Generic.Output */
    .gp """),format.raw/*341.9*/("""{"""),format.raw/*341.10*/("""
    """),format.raw/*342.5*/("""color: #000099;
    """),format.raw/*343.5*/("""}"""),format.raw/*343.6*/("""/* Generic.Prompt */
    .gs """),format.raw/*344.9*/("""{"""),format.raw/*344.10*/("""
    """),format.raw/*345.5*/("""}"""),format.raw/*345.6*/("""/* Generic.Strong */
    .gu """),format.raw/*346.9*/("""{"""),format.raw/*346.10*/("""
    """),format.raw/*347.5*/("""color: #003300;
    """),format.raw/*348.5*/("""}"""),format.raw/*348.6*/("""/* Generic.Subheading */
    .gt """),format.raw/*349.9*/("""{"""),format.raw/*349.10*/("""
    """),format.raw/*350.5*/("""color: #99CC66
    """),format.raw/*351.5*/("""}"""),format.raw/*351.6*/("""/* Generic.Traceback */
    .kc """),format.raw/*352.9*/("""{"""),format.raw/*352.10*/("""
    """),format.raw/*353.5*/("""color: #006699;
    """),format.raw/*354.5*/("""}"""),format.raw/*354.6*/("""/* Keyword.Constant */
    .kd """),format.raw/*355.9*/("""{"""),format.raw/*355.10*/("""
    """),format.raw/*356.5*/("""color: #006699;
    """),format.raw/*357.5*/("""}"""),format.raw/*357.6*/("""/* Keyword.Declaration */
    .kn """),format.raw/*358.9*/("""{"""),format.raw/*358.10*/("""
    """),format.raw/*359.5*/("""color: #006699;
    """),format.raw/*360.5*/("""}"""),format.raw/*360.6*/("""/* Keyword.Namespace */
    .kp """),format.raw/*361.9*/("""{"""),format.raw/*361.10*/("""
    """),format.raw/*362.5*/("""color: #006699
    """),format.raw/*363.5*/("""}"""),format.raw/*363.6*/("""/* Keyword.Pseudo */
    .kr """),format.raw/*364.9*/("""{"""),format.raw/*364.10*/("""
    """),format.raw/*365.5*/("""color: #006699;
    """),format.raw/*366.5*/("""}"""),format.raw/*366.6*/("""/* Keyword.Reserved */
    .kt """),format.raw/*367.9*/("""{"""),format.raw/*367.10*/("""
    """),format.raw/*368.5*/("""color: #007788;
    """),format.raw/*369.5*/("""}"""),format.raw/*369.6*/("""/* Keyword.Type */
    .m """),format.raw/*370.8*/("""{"""),format.raw/*370.9*/("""
    """),format.raw/*371.5*/("""color: #FF6600
    """),format.raw/*372.5*/("""}"""),format.raw/*372.6*/("""/* Literal.Number */
    .s """),format.raw/*373.8*/("""{"""),format.raw/*373.9*/("""
    """),format.raw/*374.5*/("""color: #d44950
    """),format.raw/*375.5*/("""}"""),format.raw/*375.6*/("""/* Literal.String */
    .na """),format.raw/*376.9*/("""{"""),format.raw/*376.10*/("""
    """),format.raw/*377.5*/("""color: #4f9fcf
    """),format.raw/*378.5*/("""}"""),format.raw/*378.6*/("""/* Name.Attribute */
    .nb """),format.raw/*379.9*/("""{"""),format.raw/*379.10*/("""
    """),format.raw/*380.5*/("""color: #336666
    """),format.raw/*381.5*/("""}"""),format.raw/*381.6*/("""/* Name.Builtin */
    .nc """),format.raw/*382.9*/("""{"""),format.raw/*382.10*/("""
    """),format.raw/*383.5*/("""color: #00AA88;
    """),format.raw/*384.5*/("""}"""),format.raw/*384.6*/("""/* Name.Class */
    .no """),format.raw/*385.9*/("""{"""),format.raw/*385.10*/("""
    """),format.raw/*386.5*/("""color: #336600
    """),format.raw/*387.5*/("""}"""),format.raw/*387.6*/("""/* Name.Constant */
    .nd """),format.raw/*388.9*/("""{"""),format.raw/*388.10*/("""
    """),format.raw/*389.5*/("""color: #9999FF
    """),format.raw/*390.5*/("""}"""),format.raw/*390.6*/("""/* Name.Decorator */
    .ni """),format.raw/*391.9*/("""{"""),format.raw/*391.10*/("""
    """),format.raw/*392.5*/("""color: #999999;
    """),format.raw/*393.5*/("""}"""),format.raw/*393.6*/("""/* Name.Entity */
    .ne """),format.raw/*394.9*/("""{"""),format.raw/*394.10*/("""
    """),format.raw/*395.5*/("""color: #CC0000;
    """),format.raw/*396.5*/("""}"""),format.raw/*396.6*/("""/* Name.Exception */
    .nf """),format.raw/*397.9*/("""{"""),format.raw/*397.10*/("""
    """),format.raw/*398.5*/("""color: #CC00FF
    """),format.raw/*399.5*/("""}"""),format.raw/*399.6*/("""/* Name.Function */
    .nl """),format.raw/*400.9*/("""{"""),format.raw/*400.10*/("""
    """),format.raw/*401.5*/("""color: #9999FF
    """),format.raw/*402.5*/("""}"""),format.raw/*402.6*/("""/* Name.Label */
    .nn """),format.raw/*403.9*/("""{"""),format.raw/*403.10*/("""
    """),format.raw/*404.5*/("""color: #00CCFF;
    """),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""/* Name.Namespace */
    .nt """),format.raw/*406.9*/("""{"""),format.raw/*406.10*/("""
    """),format.raw/*407.5*/("""color: #2f6f9f;
    """),format.raw/*408.5*/("""}"""),format.raw/*408.6*/("""/* Name.Tag */
    .nv """),format.raw/*409.9*/("""{"""),format.raw/*409.10*/("""
    """),format.raw/*410.5*/("""color: #003333
    """),format.raw/*411.5*/("""}"""),format.raw/*411.6*/("""/* Name.Variable */
    .ow """),format.raw/*412.9*/("""{"""),format.raw/*412.10*/("""
    """),format.raw/*413.5*/("""color: #000000;
    """),format.raw/*414.5*/("""}"""),format.raw/*414.6*/("""/* Operator.Word */
    .w """),format.raw/*415.8*/("""{"""),format.raw/*415.9*/("""
    """),format.raw/*416.5*/("""color: #bbbbbb
    """),format.raw/*417.5*/("""}"""),format.raw/*417.6*/("""/* Text.Whitespace */
    .mf """),format.raw/*418.9*/("""{"""),format.raw/*418.10*/("""
    """),format.raw/*419.5*/("""color: #FF6600
    """),format.raw/*420.5*/("""}"""),format.raw/*420.6*/("""/* Literal.Number.Float */
    .mh """),format.raw/*421.9*/("""{"""),format.raw/*421.10*/("""
    """),format.raw/*422.5*/("""color: #FF6600
    """),format.raw/*423.5*/("""}"""),format.raw/*423.6*/("""/* Literal.Number.Hex */
    .mi """),format.raw/*424.9*/("""{"""),format.raw/*424.10*/("""
    """),format.raw/*425.5*/("""color: #FF6600
    """),format.raw/*426.5*/("""}"""),format.raw/*426.6*/("""/* Literal.Number.Integer */
    .mo """),format.raw/*427.9*/("""{"""),format.raw/*427.10*/("""
    """),format.raw/*428.5*/("""color: #FF6600
    """),format.raw/*429.5*/("""}"""),format.raw/*429.6*/("""/* Literal.Number.Oct */
    .sb """),format.raw/*430.9*/("""{"""),format.raw/*430.10*/("""
    """),format.raw/*431.5*/("""color: #CC3300
    """),format.raw/*432.5*/("""}"""),format.raw/*432.6*/("""/* Literal.String.Backtick */
    .sc """),format.raw/*433.9*/("""{"""),format.raw/*433.10*/("""
    """),format.raw/*434.5*/("""color: #CC3300
    """),format.raw/*435.5*/("""}"""),format.raw/*435.6*/("""/* Literal.String.Char */
    .sd """),format.raw/*436.9*/("""{"""),format.raw/*436.10*/("""
    """),format.raw/*437.5*/("""color: #CC3300;
    font-style: italic
    """),format.raw/*439.5*/("""}"""),format.raw/*439.6*/("""/* Literal.String.Doc */
    .s2 """),format.raw/*440.9*/("""{"""),format.raw/*440.10*/("""
    """),format.raw/*441.5*/("""color: #CC3300
    """),format.raw/*442.5*/("""}"""),format.raw/*442.6*/("""/* Literal.String.Double */
    .se """),format.raw/*443.9*/("""{"""),format.raw/*443.10*/("""
    """),format.raw/*444.5*/("""color: #CC3300;
    """),format.raw/*445.5*/("""}"""),format.raw/*445.6*/("""/* Literal.String.Escape */
    .sh """),format.raw/*446.9*/("""{"""),format.raw/*446.10*/("""
    """),format.raw/*447.5*/("""color: #CC3300
    """),format.raw/*448.5*/("""}"""),format.raw/*448.6*/("""/* Literal.String.Heredoc */
    .si """),format.raw/*449.9*/("""{"""),format.raw/*449.10*/("""
    """),format.raw/*450.5*/("""color: #AA0000
    """),format.raw/*451.5*/("""}"""),format.raw/*451.6*/("""/* Literal.String.Interpol */
    .sx """),format.raw/*452.9*/("""{"""),format.raw/*452.10*/("""
    """),format.raw/*453.5*/("""color: #CC3300
    """),format.raw/*454.5*/("""}"""),format.raw/*454.6*/("""/* Literal.String.Other */
    .sr """),format.raw/*455.9*/("""{"""),format.raw/*455.10*/("""
    """),format.raw/*456.5*/("""color: #33AAAA
    """),format.raw/*457.5*/("""}"""),format.raw/*457.6*/("""/* Literal.String.Regex */
    .s1 """),format.raw/*458.9*/("""{"""),format.raw/*458.10*/("""
    """),format.raw/*459.5*/("""color: #CC3300
    """),format.raw/*460.5*/("""}"""),format.raw/*460.6*/("""/* Literal.String.Single */
    .ss """),format.raw/*461.9*/("""{"""),format.raw/*461.10*/("""
    """),format.raw/*462.5*/("""color: #FFCC33
    """),format.raw/*463.5*/("""}"""),format.raw/*463.6*/("""/* Literal.String.Symbol */
    .bp """),format.raw/*464.9*/("""{"""),format.raw/*464.10*/("""
    """),format.raw/*465.5*/("""color: #336666
    """),format.raw/*466.5*/("""}"""),format.raw/*466.6*/("""/* Name.Builtin.Pseudo */
    .vc """),format.raw/*467.9*/("""{"""),format.raw/*467.10*/("""
    """),format.raw/*468.5*/("""color: #003333
    """),format.raw/*469.5*/("""}"""),format.raw/*469.6*/("""/* Name.Variable.Class */
    .vg """),format.raw/*470.9*/("""{"""),format.raw/*470.10*/("""
    """),format.raw/*471.5*/("""color: #003333
    """),format.raw/*472.5*/("""}"""),format.raw/*472.6*/("""/* Name.Variable.Global */
    .vi """),format.raw/*473.9*/("""{"""),format.raw/*473.10*/("""
    """),format.raw/*474.5*/("""color: #003333
    """),format.raw/*475.5*/("""}"""),format.raw/*475.6*/("""/* Name.Variable.Instance */
    .il """),format.raw/*476.9*/("""{"""),format.raw/*476.10*/("""
    """),format.raw/*477.5*/("""color: #FF6600
    """),format.raw/*478.5*/("""}"""),format.raw/*478.6*/("""/* Literal.Number.Integer.Long */

    .css .o, .css .o + .nt, .css .nt + .nt """),format.raw/*480.44*/("""{"""),format.raw/*480.45*/("""
    """),format.raw/*481.5*/("""color: #999;
    """),format.raw/*482.5*/("""}"""),format.raw/*482.6*/("""

    """),format.raw/*484.5*/("""/*
     * DEMO
     */

    .eg-1 td:first-child """),format.raw/*488.26*/("""{"""),format.raw/*488.27*/("""
    """),format.raw/*489.5*/("""width: 70%;
    text-align:left;
    """),format.raw/*491.5*/("""}"""),format.raw/*491.6*/("""

    """),format.raw/*493.5*/(""".eg-1 td:last-child """),format.raw/*493.25*/("""{"""),format.raw/*493.26*/("""
    """),format.raw/*494.5*/("""width: 30%;
    text-align:right;
    """),format.raw/*496.5*/("""}"""),format.raw/*496.6*/("""

    """),format.raw/*498.5*/("""</style>




            <!-- row -->
        <div class="row">

                <!-- NEW WIDGET START -->
            <div class="col-sm-6">

                    <!-- widget content -->


                <div class="bs-example bs-example-type">
                    <h3 class="text-primary" style="margin: 20px 0;">Headers and leads</h3>
                    <table class="table eg-1">
                        <tbody>
                            <tr>
                                <td>
                                    <h1>h1. SmartAdmin heading</h1>
                                    <p class="lead">Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus.</p>
                                </td>
                                <td class="info">'Open Sans' 26px Light</td>
                            </tr>
                            <tr>
                                <td>
                                    <h2>h2. SmartAdmin heading</h2>
                                    <p>SmartAdmins's global default <code>font-size</code> is <strong>13px</strong>, with a <code>line-height</code> of <strong>1.428</strong>. This is applied to the <code>&lt;body&gt;</code> and all paragraphs. In addition, <code>&lt;p&gt;</code> (paragraphs) receive a bottom margin of half their computed line-height (10px by default).</p>
                                </td>
                                <td class="info">'Open Sans' 22px Light</td>
                            </tr>
                            <tr>
                                <td>
                                    <h3>h3. SmartAdmin heading</h3>
                                    <p>An abbreviation of the word attribute is <abbr title="attribute">attr</abbr>.</p>
                                    <p></p><pre><code class="html"><span class="nt">&lt;abbr</span> <span class="na">title=</span><span class="s">"attribute"</span><span class="nt">&gt;</span>attr<span class="nt">&lt;/abbr&gt;</span>
                                </code></pre><p></p>
                                </td>
                                <td class="info">'Open Sans' 18px Light</td>
                            </tr>
                            <tr>
                                <td><h4>h4. SmartAdmin heading</h4></td>
                                <td class="info">'Open Sans' 17px Light</td>
                            </tr>
                            <tr>
                                <td><h5>h5. SmartAdmin heading</h5></td>
                                <td class="info">'Open Sans' 16px Light</td>
                            </tr>
                            <tr>
                                <td><h6>h6. SmartAdmin heading</h6></td>
                                <td class="info">'Open Sans' 14px Bold</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="highlight">
                    <pre><code class="html"><span class="nt">&lt;h1&gt;</span>h1. SmartAdmin heading<span class="nt">&lt;/h1&gt;</span>
                        <span class="nt">&lt;h2&gt;</span>h2. SmartAdmin heading<span class="nt">&lt;/h2&gt;</span>
                        <span class="nt">&lt;h3&gt;</span>h3. SmartAdmin heading<span class="nt">&lt;/h3&gt;</span>
                        <span class="nt">&lt;h4&gt;</span>h4. SmartAdmin heading<span class="nt">&lt;/h4&gt;</span>
                        <span class="nt">&lt;h5&gt;</span>h5. SmartAdmin heading<span class="nt">&lt;/h5&gt;</span>
                        <span class="nt">&lt;h6&gt;</span>h6. SmartAdmin heading<span class="nt">&lt;/h6&gt;</span>
                    </code></pre>
                </div>

                <div class="bs-example bs-example-type">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td><h1>h1. SmartAdmin heading <small>Secondary text</small></h1></td>
                            </tr>
                            <tr>
                                <td><h2>h2. SmartAdmin heading <small>Secondary text</small></h2></td>
                            </tr>
                            <tr>
                                <td><h3>h3. SmartAdmin heading <small>Secondary text</small></h3></td>
                            </tr>
                            <tr>
                                <td><h4>h4. SmartAdmin heading <small>Secondary text</small></h4></td>
                            </tr>
                            <tr>
                                <td><h5>h5. SmartAdmin heading <small>Secondary text</small></h5></td>
                            </tr>
                            <tr>
                                <td><h6>h6. SmartAdmin heading <small>Secondary text</small></h6></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="highlight">
                    <pre><code class="html"><span class="nt">&lt;h1&gt;</span>h1. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h1&gt;</span>
                        <span class="nt">&lt;h2&gt;</span>h2. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h2&gt;</span>
                        <span class="nt">&lt;h3&gt;</span>h3. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h3&gt;</span>
                        <span class="nt">&lt;h4&gt;</span>h4. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h4&gt;</span>
                        <span class="nt">&lt;h5&gt;</span>h5. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h5&gt;</span>
                        <span class="nt">&lt;h6&gt;</span>h6. SmartAdmin heading <span class="nt">&lt;small&gt;</span>Secondary text<span class="nt">&lt;/small&gt;&lt;/h6&gt;</span>
                    </code></pre>
                </div>



                    <!-- end widget content -->

                    <!-- Widget ID (each widget will need unique ID)-->

                <div class="well well-sm">
                    <h3 class="text-primary">Text and BG color options</h3>
                    <table class="table table-bordered">

                        <tbody>
                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-green">
                                        Fusce dapibus, tellus ac cursus commodo, tortor mauris nibh. <span class="label bg-color-green pull-right">.bg-color-green</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-green</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-greenDark">
                                        Nullam id dolor id nibh ultricies vehicula ut id elit. <span class="label bg-color-greenDark pull-right">.bg-color-greenDark</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-greenDark</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-greenLight">
                                        Duis mollis, est non commodo luctus, nisi erat porttitor ligula. <span class="label bg-color-greenLight pull-right">.bg-color-greenLight</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-greenLight</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-purple">
                                        Maecenas sed diam eget risus varius blandit sit amet non magna. <span class="label bg-color-purple pull-right">.bg-color-purple</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-purple</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-magenta">
                                        Etiam porta sem malesuada magna mollis euismod. <span class="label bg-color-magenta pull-right">.bg-color-magenta</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-magenta</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-pink">
                                        Donec ullamcorper nulla non metus auctor fringilla. <span class="label bg-color-pink pull-right">.bg-color-pink</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-pink</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-pinkDark">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. <span class="label bg-color-pinkDark pull-right">.bg-color-pinkDark</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-pinkDark</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-blue">
                                        Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. <span class="label bg-color-blue pull-right">.bg-color-blue</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-blue</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-blueLight">
                                        Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien. <span class="label bg-color-blueLight pull-right">bg-color-blueLight</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-blueLight</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-blueDark">
                                        Libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros. <span class="label bg-color-blueDark pull-right">.bg-color-blueDark</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-blueDark</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-teal">
                                        Donec sodales sagittis magna. Sed consequat. <span class="label bg-color-teal pull-right">.bg-color-teal</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-teal</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-yellow">
                                        Leo eget bibendum sodales, augue velit cursus nunc. <span class="label bg-color-yellow pull-right">.bg-color-yellow</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-yellow</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-orange">
                                        Sed ut perspiciatis unde omnis iste natus error. <span class="label bg-color-orange pull-right">.bg-color-orange</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-orange</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-orangeDark">
                                        Nemo enim ipsam voluptatem quia voluptas sit aspernatur. <span class="label bg-color-orangeDark pull-right">.bg-color-orangeDark</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-orangeDark</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-red">
                                        Qui dolorem ipsum quia dolor sit amet, consectetur. <span class="label bg-color-red pull-right">.bg-color-red</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-red</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="txt-color-redLight">
                                        Nam libero tempore, cum soluta nobis est eligendi optio. <span class="label bg-color-redLight pull-right">.bg-color-redLight</span>
                                    </p></td>

                                <td><code class="pull-right">
                                    .txt-color-redLight</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-muted">
                                        Cumque nihil impedit quo minus id quod maxime placeat facere.
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-muted</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-primary">
                                        Qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-primary</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-success">
                                        Ducimus qui blanditiis praesentium voluptatum deleniti.
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-success</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-danger">
                                        Aolorem eum fugiat quo voluptas nulla pariatur?
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-danger</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-warning">
                                        Ut enim ad minima veniam, quis nostrum exercitationem.
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-warning</code></td>
                            </tr>

                                <!-- new tr -->
                            <tr>
                                <td>
                                    <p class="text-info">
                                        Tempora incidunt ut labore et dolore magnam aliquam quaerat.
                                    </p></td>

                                <td><code class="pull-right">
                                    .text-info</code></td>
                            </tr>

                        </tbody>

                    </table>

                </div>

                    <!-- end widget -->

            </div>
                <!-- WIDGET END -->


                <!-- NEW WIDGET START -->
            <div class="col-sm-6">

                    <!-- widget content -->
                <div class="well well-sm">
                    <h3 class="text-primary">All Lists</h3>
                    <div class="row">

                        <div class="col-sm-6">

                            <div class="bs-example">

                                <ul>
                                    <li>Unordered List Item </li>
                                    <li><strong>I am inside a strong tag</strong></li>

                                    <li><i>I am Italic!</i>
                                        <ul>
                                            <li class="text-danger">We can also be red</li>
                                            <li class="text-success">Or green</li>
                                            <li class="txt-color-purple">Even purple!</li>

                                        </ul>
                                    </li>

                                    <li><strong><i>I am inside a strong and Italic tag, I may also break into a new line if <u>squized</u></i></strong></li>
                                    <li><small>I am inside a small tag</small></li>
                                </ul>
                            </div>
             """),
format.raw("""               <div class="highlight"><pre><code class="html"><span class="nt">&lt;ul&gt;</span>
                                <span class="nt">&lt;li&gt;</span>...<span class="nt">&lt;/li&gt;</span>
                                <span class="nt">&lt;/ul&gt;</span>
                            </code></pre></div>
                        </div>


                        <div class="col-sm-6">

                            <div class="bs-example">

                                <ol>
                                    <li>Ordered List Item </li>
                                    <li><u>Ordered List Item</u></li>

                                    <li><strong>Ordered List Item</strong>
                                        <ul class="list-unstyled">
                                            <li><i class="fa fa-bell text-danger"></i> Unstyled list with custom icon</li>
                                            <li class="text-success"><i class="fa fa-check"></i> <strong><u>Unstyled list</u> with custom icon</strong></li>
                                            <li><i class="fa fa-warning text-warning"></i> <i>Unstyled list with custom icon</i></li>

                                        </ul>
                                    </li>

                                    <li class="text-info"><strong><i>I am inside a strong and Italic tag, I may also break into a new line if squized</i></strong></li>
                                    <li><span class="label label-danger">I am a label</span></li>
                                </ol>
                            </div>
                            <div class="highlight"><pre><code class="html"><span class="nt">&lt;ol&gt;</span>
                                <span class="nt">&lt;li&gt;</span>...<span class="nt">&lt;/li&gt;</span>
                                <span class="nt">&lt;/ol&gt;</span>
                            </code></pre></div>

                        </div>


                    </div>

                    <div class="row">

                        <div class="col-sm-12">



                            <div class="bs-example">
                                <ul class="list-inline">
                                    <li class="text-success">
                                        <strong>Inline List Item #1</strong>
                                    </li>
                                    <li class="text-danger">
                                        <strong><u>Inline List Item #2</u></strong>
                                    </li>
                                    <li class="text-primary">
                                        <strong><i>Inline List Item #3</i></strong>
                                    </li>
                                </ul>
                            </div>
                            <div class="highlight"><pre><code class="html"><span class="nt">&lt;ul</span> <span class="na">class=</span><span class="s">"list-inline"</span><span class="nt">&gt;</span>
                                <span class="nt">&lt;li&gt;</span>...<span class="nt">&lt;/li&gt;</span>
                                <span class="nt">&lt;/ul&gt;</span>
                            </code></pre></div>



                        </div>

                    </div>

                </div>
                    <!-- end widget content -->

                <div class="well well-sm">
                    <h3 class="text-primary">Quotes</h3>

                    <div class="bs-example">
                        <blockquote>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
                            </p>
                            <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                        </blockquote>
                    </div>
                    <div class="highlight">
                        <pre><code class="html"><span class="nt">&lt;blockquote&gt;</span>
                            <span class="nt">&lt;p&gt;</span>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.<span class="nt">&lt;/p&gt;</span>
                            <span class="nt">&lt;small&gt;</span>Someone famous in <span class="nt">&lt;cite</span> <span class="na">title=</span><span class="s">"Source Title"</span><span class="nt">&gt;</span>Source Title<span class="nt">&lt;/cite&gt;&lt;/small&gt;</span>
                            <span class="nt">&lt;/blockquote&gt;</span>
                        </code></pre>
                    </div>


                    <div class="bs-example" style="overflow: hidden;">
                        <blockquote class="pull-right">
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
                            </p>
                            <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                        </blockquote>
                    </div>
                    <div class="highlight">
                        <pre><code class="html"><span class="nt">&lt;blockquote</span> <span class="na">class=</span><span class="s">"pull-right"</span><span class="nt">&gt;</span>
                            ...
                            <span class="nt">&lt;/blockquote&gt;</span>
                        </code></pre>
                    </div>

                </div>


                    <!-- widget content -->


                <div class="well well-sm">
                    <h3 class="text-primary">Discription Lists</h3>

                    <div class="bs-example">
                        <dl>
                            <dt>Description lists</dt>
                            <dd>A description list is perfect for defining terms.</dd>
                            <dt>Euismod</dt>
                            <dd>Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.</dd>
                            <dd>Donec id elit non mi porta gravida at eget metus.</dd>
                            <dt>Malesuada porta</dt>
                            <dd>Etiam porta sem malesuada magna mollis euismod.</dd>
                        </dl>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;dl&gt;</span>
                        <span class="nt">&lt;dt&gt;</span>...<span class="nt">&lt;/dt&gt;</span>
                        <span class="nt">&lt;dd&gt;</span>...<span class="nt">&lt;/dd&gt;</span>
                        <span class="nt">&lt;/dl&gt;</span>
                    </code></pre></div>


                    <div class="bs-example">
                        <dl class="dl-horizontal">
                            <dt>Description lists</dt>
                            <dd>A description list is perfect for defining terms.</dd>
                            <dt>Euismod</dt>
                            <dd>Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.</dd>
                            <dd>Donec id elit non mi porta gravida at eget metus.</dd>
                            <dt>Malesuada porta</dt>
                            <dd>Etiam porta sem malesuada magna mollis euismod.</dd>
                            <dt>Felis euismod semper eget lacinia</dt>
                            <dd>Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</dd>
                        </dl>
                    </div>
                    <div class="highlight"><pre><code class="html"><span class="nt">&lt;dl</span> <span class="na">class=</span><span class="s">"dl-horizontal"</span><span class="nt">&gt;</span>
                        <span class="nt">&lt;dt&gt;</span>...<span class="nt">&lt;/dt&gt;</span>
                        <span class="nt">&lt;dd&gt;</span>...<span class="nt">&lt;/dd&gt;</span>
                        <span class="nt">&lt;/dl&gt;</span>
                    </code></pre></div>

                </div>

                    <!-- end widget content -->

                    <!-- widget content -->



                <div class="bs-example">
                    <h3 class="text-primary">Address</h3>
                    <address>
                        <strong>Twitter, Inc.</strong><br>
                        795 Folsom Ave, Suite 600<br>
                        San Francisco, CA 94107<br>
                        <abbr title="Phone">P:</abbr> (123) 456-7890
                    </address>
                    <address>
                        <strong>Full Name</strong><br>
                        <a href="mailto:#">first.last@example.com</a>
                    </address>
                </div>
                <div class="highlight"><pre><code class="html"><span class="nt">&lt;address&gt;</span>
                    <span class="nt">&lt;strong&gt;</span>Twitter, Inc.<span class="nt">&lt;/strong&gt;&lt;br&gt;</span>
                    795 Folsom Ave, Suite 600<span class="nt">&lt;br&gt;</span>
                    San Francisco, CA 94107<span class="nt">&lt;br&gt;</span>
                    <span class="nt">&lt;abbr</span> <span class="na">title=</span><span class="s">"Phone"</span><span class="nt">&gt;</span>P:<span class="nt">&lt;/abbr&gt;</span> (123) 456-7890
                    <span class="nt">&lt;/address&gt;</span>

                    <span class="nt">&lt;address&gt;</span>
                    <span class="nt">&lt;strong&gt;</span>Full Name<span class="nt">&lt;/strong&gt;&lt;br&gt;</span>
                    <span class="nt">&lt;a</span> <span class="na">href=</span><span class="s">"mailto:#"</span><span class="nt">&gt;</span>first.last@example.com<span class="nt">&lt;/a&gt;</span>
                    <span class="nt">&lt;/address&gt;</span>
                </code></pre></div>

                <hr>



                <div class="bs-example">
                    <h3 class="text-primary">Alignment</h3>
                    <p class="text-left">Left aligned text.</p>
                    <p class="text-center">Center aligned text.</p>
                    <p class="text-right">Right aligned text.</p>
                </div>
                <div class="highlight"><pre><code class="html"><span class="nt">&lt;p</span> <span class="na">class=</span><span class="s">"text-left"</span><span class="nt">&gt;</span>Left aligned text.<span class="nt">&lt;/p&gt;</span>
                    <span class="nt">&lt;p</span> <span class="na">class=</span><span class="s">"text-center"</span><span class="nt">&gt;</span>Center aligned text.<span class="nt">&lt;/p&gt;</span>
                    <span class="nt">&lt;p</span> <span class="na">class=</span><span class="s">"text-right"</span><span class="nt">&gt;</span>Right aligned text.<span class="nt">&lt;/p&gt;</span>
                </code></pre></div>


                    <!-- end widget content -->

                    <!-- widget content -->
                <div class="well well-sm">
                    <h3 class="text-primary">Text sizes</h3>
                    <p class="alert alert-info">Take full control over the font by controling the size with the following CSS</p>
                    <ul class="list-inline">
                        <li>
                            <span class="font-xl">.font-xl</span>
                        </li>
                        <li>
                            <span class="font-lg">.font-lg</span>
                        </li>
                        <li>
                            <span class="font-md">.font-md</span>
                        </li>
                        <li>
                            <span class="font-sm">.font-sm</span>
                        </li>
                        <li>
                            <span class="font-xs">.font-xs</span>
                        </li>
                    </ul>

                </div>


                    <!-- end widget content -->

            </div>
                <!-- WIDGET END -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*1145.45*/("""{"""),format.raw/*1145.46*/(""" """),format.raw/*1145.47*/("""trigger: "hover" """),format.raw/*1145.64*/("""}"""),format.raw/*1145.65*/(""");
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
         * var pagefunction = function() """),format.raw/*1170.42*/("""{"""),format.raw/*1170.43*/("""
         """),format.raw/*1171.10*/("""*   ...
         * """),format.raw/*1172.12*/("""}"""),format.raw/*1172.13*/("""
         """),format.raw/*1173.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*1176.42*/("""{"""),format.raw/*1176.43*/("""
         """),format.raw/*1177.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*1178.12*/("""}"""),format.raw/*1178.13*/("""
         """),format.raw/*1179.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*1189.39*/("""{"""),format.raw/*1189.40*/("""

        """),format.raw/*1191.9*/("""}"""),format.raw/*1191.10*/(""";

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
                  DATE: Thu Aug 28 21:09:00 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/typography.scala.html
                  HASH: 6a9003d2cfe301df59a60512d829a2970d5e8a61
                  MATRIX: 515->1|620->18|648->21|669->34|708->36|739->41|986->260|1015->261|1047->266|1267->459|1295->460|1327->465|1416->526|1445->527|1477->532|1693->721|1721->722|1754->728|1878->824|1907->825|1939->830|2043->907|2071->908|2104->914|2218->1001|2247->1002|2279->1007|2319->1019|2348->1020|2380->1025|2577->1195|2605->1196|2637->1201|2690->1226|2719->1227|2751->1232|2938->1392|2966->1393|2998->1398|3026->1399|3059->1405|3144->1462|3173->1463|3205->1468|3249->1485|3277->1486|3310->1492|3886->2039|3916->2040|3948->2045|3997->2067|4025->2068|4057->2073|4110->2098|4139->2099|4171->2104|4215->2121|4243->2122|4276->2128|4355->2179|4384->2180|4416->2185|4509->2251|4537->2252|4569->2257|4624->2284|4653->2285|4685->2290|4793->2371|4821->2372|4853->2377|4923->2419|4952->2420|4984->2425|5055->2469|5083->2470|5115->2475|5269->2600|5299->2601|5331->2606|5377->2625|5405->2626|5438->2632|5567->2733|5596->2734|5628->2739|5672->2756|5700->2757|5733->2763|5820->2821|5850->2822|5883->2827|5939->2855|5968->2856|6002->2862|6094->2925|6124->2926|6157->2931|6230->2976|6259->2977|6292->2982|6363->3024|6393->3025|6426->3030|6476->3052|6505->3053|6539->3059|6687->3177|6718->3178|6751->3183|6801->3205|6830->3206|6863->3211|6922->3241|6952->3242|6985->3247|7038->3272|7067->3273|7100->3278|7165->3314|7195->3315|7228->3320|7278->3342|7307->3343|7341->3349|7418->3397|7448->3398|7481->3403|7531->3425|7560->3426|7594->3432|7672->3481|7702->3482|7735->3487|7785->3509|7814->3510|7847->3515|7926->3565|7956->3566|7989->3571|8102->3656|8131->3657|8164->3662|8273->3742|8303->3743|8336->3748|8384->3768|8413->3769|8446->3774|8564->3863|8594->3864|8627->3869|8720->3934|8749->3935|8782->3940|8834->3963|8864->3964|8897->3969|8951->3995|8980->3996|9013->4001|9071->4030|9101->4031|9134->4036|9195->4069|9224->4070|9257->4075|9327->4116|9357->4117|9390->4122|9433->4137|9462->4138|9495->4143|9550->4169|9580->4170|9613->4175|9664->4198|9693->4199|9726->4204|9802->4251|9832->4252|9865->4257|9911->4275|9940->4276|9973->4281|10036->4315|10066->4316|10099->4321|10149->4343|10178->4344|10215->4353|10270->4380|10300->4381|10333->4386|10451->4475|10481->4476|10514->4481|10566->4505|10595->4506|10628->4511|10680->4534|10710->4535|10743->4540|10803->4572|10832->4573|10865->4578|10920->4604|10950->4605|10983->4610|11043->4642|11072->4643|11105->4648|11134->4649|11168->4655|11242->4700|11272->4701|11305->4706|11380->4753|11409->4754|11443->4760|11509->4797|11539->4798|11572->4803|11619->4822|11648->4823|11682->4829|11754->4872|11784->4873|11817->4878|11876->4909|11905->4910|11938->4915|11992->4940|12022->4941|12055->4946|12209->5072|12238->5073|12271->5078|12332->5110|12362->5111|12395->5116|12486->5179|12515->5180|12549->5186|12647->5255|12677->5256|12710->5261|12804->5327|12833->5328|12867->5334|12955->5393|12985->5394|13018->5399|13071->5424|13100->5425|13134->5431|13203->5471|13233->5472|13266->5477|13318->5501|13347->5502|13380->5507|13437->5535|13467->5536|13500->5541|13573->5586|13602->5587|13636->5593|13704->5632|13734->5633|13767->5638|13852->5695|13881->5696|13914->5701|13972->5730|14002->5731|14035->5736|14160->5833|14189->5834|14223->5840|14316->5904|14346->5905|14379->5910|14492->5995|14521->5996|14555->6002|14722->6140|14752->6141|14785->6146|15004->6337|15033->6338|15066->6343|15110->6358|15140->6359|15173->6364|15333->6496|15362->6497|15395->6502|15444->6522|15474->6523|15507->6528|15614->6607|15643->6608|15676->6613|15728->6636|15758->6637|15791->6642|15954->6777|15983->6778|16017->6784|16128->6867|16158->6868|16191->6873|16231->6884|16261->6885|16294->6890|16342->6910|16371->6911|16404->6916|16433->6917|16467->6923|16501->6928|16531->6929|16564->6934|16622->6964|16651->6965|16684->6970|16714->6972|16743->6973|16772->6974|16822->6995|16852->6996|16890->7006|16919->7007|16952->7012|16997->7029|17026->7030|17078->7053|17108->7054|17141->7059|17219->7109|17248->7110|17295->7129|17324->7130|17357->7135|17405->7155|17434->7156|17483->7177|17512->7178|17545->7183|17592->7202|17621->7203|17672->7226|17702->7227|17735->7232|17806->7275|17835->7276|17895->7308|17925->7309|17958->7314|18005->7333|18034->7334|18092->7364|18122->7365|18155->7370|18200->7387|18229->7388|18286->7417|18316->7418|18349->7423|18394->7440|18423->7441|18481->7471|18511->7472|18544->7477|18633->7538|18662->7539|18720->7569|18750->7570|18783->7575|18834->7598|18863->7599|18918->7626|18948->7627|18981->7632|19028->7651|19057->7652|19113->7680|19143->7681|19176->7686|19224->7706|19253->7707|19311->7737|19341->7738|19374->7743|19463->7804|19492->7805|19551->7836|19581->7837|19614->7842|19661->7861|19690->7862|19747->7891|19777->7892|19810->7897|19858->7917|19887->7918|19944->7947|19974->7948|20007->7953|20036->7954|20093->7983|20123->7984|20156->7989|20204->8009|20233->8010|20294->8043|20324->8044|20357->8049|20404->8068|20433->8069|20493->8101|20523->8102|20556->8107|20604->8127|20633->8128|20692->8159|20722->8160|20755->8165|20803->8185|20832->8186|20894->8220|20924->8221|20957->8226|21005->8246|21034->8247|21094->8279|21124->8280|21157->8285|21204->8304|21233->8305|21290->8334|21320->8335|21353->8340|21401->8360|21430->8361|21489->8392|21519->8393|21552->8398|21600->8418|21629->8419|21683->8445|21712->8446|21745->8451|21792->8470|21821->8471|21877->8499|21906->8500|21939->8505|21986->8524|22015->8525|22072->8554|22102->8555|22135->8560|22182->8579|22211->8580|22268->8609|22298->8610|22331->8615|22378->8634|22407->8635|22462->8662|22492->8663|22525->8668|22573->8688|22602->8689|22655->8714|22685->8715|22718->8720|22765->8739|22794->8740|22850->8768|22880->8769|22913->8774|22960->8793|22989->8794|23046->8823|23076->8824|23109->8829|23157->8849|23186->8850|23240->8876|23270->8877|23303->8882|23351->8902|23380->8903|23437->8932|23467->8933|23500->8938|23547->8957|23576->8958|23632->8986|23662->8987|23695->8992|23742->9011|23771->9012|23824->9037|23854->9038|23887->9043|23935->9063|23964->9064|24021->9093|24051->9094|24084->9099|24132->9119|24161->9120|24212->9143|24242->9144|24275->9149|24322->9168|24351->9169|24407->9197|24437->9198|24470->9203|24518->9223|24547->9224|24602->9251|24631->9252|24664->9257|24711->9276|24740->9277|24798->9307|24828->9308|24861->9313|24908->9332|24937->9333|25000->9368|25030->9369|25063->9374|25110->9393|25139->9394|25200->9427|25230->9428|25263->9433|25310->9452|25339->9453|25404->9490|25434->9491|25467->9496|25514->9515|25543->9516|25604->9549|25634->9550|25667->9555|25714->9574|25743->9575|25809->9613|25839->9614|25872->9619|25919->9638|25948->9639|26010->9673|26040->9674|26073->9679|26144->9722|26173->9723|26234->9756|26264->9757|26297->9762|26344->9781|26373->9782|26437->9818|26467->9819|26500->9824|26548->9844|26577->9845|26641->9881|26671->9882|26704->9887|26751->9906|26780->9907|26845->9944|26875->9945|26908->9950|26955->9969|26984->9970|27050->10008|27080->10009|27113->10014|27160->10033|27189->10034|27252->10069|27282->10070|27315->10075|27362->10094|27391->10095|27454->10130|27484->10131|27517->10136|27564->10155|27593->10156|27657->10192|27687->10193|27720->10198|27767->10217|27796->10218|27860->10254|27890->10255|27923->10260|27970->10279|27999->10280|28061->10314|28091->10315|28124->10320|28171->10339|28200->10340|28262->10374|28292->10375|28325->10380|28372->10399|28401->10400|28464->10435|28494->10436|28527->10441|28574->10460|28603->10461|28668->10498|28698->10499|28731->10504|28778->10523|28807->10524|28914->10602|28944->10603|28977->10608|29022->10625|29051->10626|29085->10632|29163->10681|29193->10682|29226->10687|29291->10724|29320->10725|29354->10731|29403->10751|29433->10752|29466->10757|29532->10795|29561->10796|29595->10802|62299->43458|62330->43459|62361->43460|62408->43477|62439->43478|63129->44138|63160->44139|63200->44149|63249->44168|63280->44169|63320->44179|63489->44318|63520->44319|63560->44329|63651->44390|63682->44391|63722->44401|63946->44595|63977->44596|64016->44606|64047->44607
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|33->12|33->12|34->13|41->20|41->20|42->21|43->22|43->22|44->23|53->32|53->32|55->34|56->35|56->35|57->36|60->39|60->39|62->41|63->42|63->42|64->43|64->43|64->43|65->44|72->51|72->51|73->52|73->52|73->52|74->53|80->59|80->59|81->60|81->60|83->62|84->63|84->63|85->64|86->65|86->65|88->67|89->68|89->68|90->69|91->70|91->70|92->71|92->71|92->71|93->72|94->73|94->73|96->75|97->76|97->76|98->77|101->80|101->80|102->81|102->81|102->81|103->82|106->85|106->85|107->86|107->86|107->86|108->87|110->89|110->89|111->90|111->90|111->90|112->91|113->92|113->92|115->94|116->95|116->95|117->96|118->97|118->97|120->99|121->100|121->100|122->101|123->102|123->102|125->104|126->105|126->105|127->106|129->108|129->108|130->109|130->109|130->109|131->110|132->111|132->111|134->113|135->114|135->114|136->115|137->116|137->116|138->117|138->117|138->117|139->118|140->119|140->119|141->120|141->120|141->120|142->121|143->122|143->122|145->124|146->125|146->125|147->126|148->127|148->127|150->129|151->130|151->130|152->131|153->132|153->132|154->133|154->133|154->133|155->134|158->137|158->137|159->138|159->138|159->138|160->139|161->140|161->140|162->141|162->141|162->141|163->142|166->145|166->145|167->146|167->146|167->146|168->147|169->148|169->148|170->149|170->149|170->149|171->150|173->152|173->152|174->153|174->153|174->153|175->154|176->155|176->155|177->156|177->156|177->156|178->157|179->158|179->158|180->159|180->159|180->159|181->160|182->161|182->161|183->162|183->162|183->162|184->163|185->164|185->164|186->165|186->165|186->165|187->166|187->166|187->166|188->167|189->168|189->168|190->169|190->169|190->169|191->170|192->171|192->171|193->172|193->172|193->172|194->173|195->174|195->174|196->175|196->175|198->177|199->178|199->178|200->179|202->181|202->181|204->183|205->184|205->184|206->185|207->186|207->186|209->188|210->189|210->189|211->190|212->191|212->191|213->192|213->192|213->192|214->193|221->200|221->200|222->201|222->201|222->201|223->202|226->205|226->205|228->207|229->208|229->208|230->209|233->212|233->212|235->214|236->215|236->215|237->216|238->217|238->217|240->219|241->220|241->220|242->221|243->222|243->222|244->223|244->223|244->223|245->224|247->226|247->226|249->228|250->229|250->229|251->230|253->232|253->232|254->233|254->233|254->233|255->234|260->239|260->239|262->241|263->242|263->242|264->243|268->247|268->247|270->249|276->255|276->255|277->256|283->262|283->262|284->263|284->263|284->263|285->264|291->270|291->270|292->271|292->271|292->271|293->272|295->274|295->274|296->275|296->275|296->275|297->276|303->282|303->282|305->284|306->285|306->285|307->286|307->286|307->286|308->287|309->288|309->288|310->289|310->289|312->291|312->291|312->291|313->292|314->293|314->293|315->294|315->294|315->294|315->294|315->294|315->294|316->295|316->295|317->296|318->297|318->297|319->298|319->298|320->299|322->301|322->301|323->302|323->302|324->303|325->304|325->304|326->305|326->305|327->306|328->307|328->307|329->308|329->308|330->309|332->311|332->311|333->312|333->312|334->313|335->314|335->314|336->315|336->315|337->316|338->317|338->317|339->318|339->318|340->319|341->320|341->320|342->321|342->321|343->322|345->324|345->324|346->325|346->325|347->326|348->327|348->327|349->328|349->328|350->329|351->330|351->330|352->331|352->331|353->332|354->333|354->333|355->334|355->334|356->335|358->337|358->337|359->338|359->338|360->339|361->340|361->340|362->341|362->341|363->342|364->343|364->343|365->344|365->344|366->345|366->345|367->346|367->346|368->347|369->348|369->348|370->349|370->349|371->350|372->351|372->351|373->352|373->352|374->353|375->354|375->354|376->355|376->355|377->356|378->357|378->357|379->358|379->358|380->359|381->360|381->360|382->361|382->361|383->362|384->363|384->363|385->364|385->364|386->365|387->366|387->366|388->367|388->367|389->368|390->369|390->369|391->370|391->370|392->371|393->372|393->372|394->373|394->373|395->374|396->375|396->375|397->376|397->376|398->377|399->378|399->378|400->379|400->379|401->380|402->381|402->381|403->382|403->382|404->383|405->384|405->384|406->385|406->385|407->386|408->387|408->387|409->388|409->388|410->389|411->390|411->390|412->391|412->391|413->392|414->393|414->393|415->394|415->394|416->395|417->396|417->396|418->397|418->397|419->398|420->399|420->399|421->400|421->400|422->401|423->402|423->402|424->403|424->403|425->404|426->405|426->405|427->406|427->406|428->407|429->408|429->408|430->409|430->409|431->410|432->411|432->411|433->412|433->412|434->413|435->414|435->414|436->415|436->415|437->416|438->417|438->417|439->418|439->418|440->419|441->420|441->420|442->421|442->421|443->422|444->423|444->423|445->424|445->424|446->425|447->426|447->426|448->427|448->427|449->428|450->429|450->429|451->430|451->430|452->431|453->432|453->432|454->433|454->433|455->434|456->435|456->435|457->436|457->436|458->437|460->439|460->439|461->440|461->440|462->441|463->442|463->442|464->443|464->443|465->444|466->445|466->445|467->446|467->446|468->447|469->448|469->448|470->449|470->449|471->450|472->451|472->451|473->452|473->452|474->453|475->454|475->454|476->455|476->455|477->456|478->457|478->457|479->458|479->458|480->459|481->460|481->460|482->461|482->461|483->462|484->463|484->463|485->464|485->464|486->465|487->466|487->466|488->467|488->467|489->468|490->469|490->469|491->470|491->470|492->471|493->472|493->472|494->473|494->473|495->474|496->475|496->475|497->476|497->476|498->477|499->478|499->478|501->480|501->480|502->481|503->482|503->482|505->484|509->488|509->488|510->489|512->491|512->491|514->493|514->493|514->493|515->494|517->496|517->496|519->498|1167->1145|1167->1145|1167->1145|1167->1145|1167->1145|1192->1170|1192->1170|1193->1171|1194->1172|1194->1172|1195->1173|1198->1176|1198->1176|1199->1177|1200->1178|1200->1178|1201->1179|1211->1189|1211->1189|1213->1191|1213->1191
                  -- GENERATED --
              */
          