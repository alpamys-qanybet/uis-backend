
package views.html

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
object maindev extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta charset="utf-8">
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="description" content="">
        <meta name="author" content="">

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

            <!-- #CSS Links -->
            <!-- Basic Styles -->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*15.119*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.70*/routes/*16.76*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*16.118*/("""">


            <!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*20.70*/routes/*20.76*/.Assets.at("stylesheets/smartadmin-production.css")),format.raw/*20.127*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*21.70*/routes/*21.76*/.Assets.at("stylesheets/smartadmin-skins.min.css")),format.raw/*21.126*/("""">

            <!-- SmartAdmin RTL Support is under construction
			 This RTL CSS will be released in version 1.5
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> -->

            <!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

            <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*32.70*/routes/*32.76*/.Assets.at("stylesheets/demo.min.css")),format.raw/*32.114*/("""">

            <!-- #FAVICONS -->
        <link rel="shortcut icon" href=""""),_display_(/*35.42*/routes/*35.48*/.Assets.at("images/favicon/favicon.ico")),format.raw/*35.88*/("""" type="image/x-icon">
        <link rel="icon" href=""""),_display_(/*36.33*/routes/*36.39*/.Assets.at("images/favicon/favicon.ico")),format.raw/*36.79*/("""" type="image/x-icon">

            <!-- #GOOGLE FONT -->
        <link rel="stylesheet" href=""""),_display_(/*39.39*/routes/*39.45*/.Assets.at("stylesheets/fonts.googleapis.com.css")),format.raw/*39.95*/("""">

            <!-- #APP SCREEN / ICONS -->
            <!-- Specifying a Webpage Icon for Web Clip
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
        <link rel="apple-touch-icon" href=""""),_display_(/*44.45*/routes/*44.51*/.Assets.at("images/splash/sptouch-icon-iphone.png")),format.raw/*44.102*/("""">
        <link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(/*45.59*/routes/*45.65*/.Assets.at("images/splash/touch-icon-ipad.png")),format.raw/*45.112*/("""">
        <link rel="apple-touch-icon" sizes="120x120" href=""""),_display_(/*46.61*/routes/*46.67*/.Assets.at("images/splash/touch-icon-iphone-retina.png")),format.raw/*46.123*/("""">
        <link rel="apple-touch-icon" sizes="152x152" href=""""),_display_(/*47.61*/routes/*47.67*/.Assets.at("images/splash/touch-icon-ipad-retina.png")),format.raw/*47.121*/("""">

            <!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">

            <!-- Startup image for web apps -->
        <link rel="apple-touch-startup-image" href=""""),_display_(/*54.54*/routes/*54.60*/.Assets.at("images/splash/ipad-landscape.png")),format.raw/*54.106*/(""""
        media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
        <link rel="apple-touch-startup-image" href=""""),_display_(/*56.54*/routes/*56.60*/.Assets.at("images/splash/ipad-portrait.png")),format.raw/*56.105*/(""""
        media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
        <link rel="apple-touch-startup-image" href=""""),_display_(/*58.54*/routes/*58.60*/.Assets.at("images/splash/iphone.png")),format.raw/*58.98*/("""" media="screen and (max-device-width: 320px)">


    </head>

        <!--

	TABLE OF CONTENTS.

	Use search to find needed section.

	===================================================================

	|  01. #CSS Links                |  all CSS links and file paths  |
	|  02. #FAVICONS                 |  Favicon links and file paths  |
	|  03. #GOOGLE FONT              |  Google font link              |
	|  04. #APP SCREEN / ICONS       |  app icons, screen backdrops   |
	|  05. #BODY                     |  body tag                      |
	|  06. #HEADER                   |  header tag                    |
	|  07. #PROJECTS                 |  project lists                 |
	|  08. #TOGGLE LAYOUT BUTTONS    |  layout buttons and actions    |
	|  09. #MOBILE                   |  mobile view dropdown          |
	|  10. #SEARCH                   |  search field                  |
	|  11. #NAVIGATION               |  left panel & navigation       |
	|  12. #MAIN PANEL               |  main panel                    |
	|  13. #MAIN CONTENT             |  content holder                |
	|  14. #PAGE FOOTER              |  page footer                   |
	|  15. #SHORTCUT AREA            |  dropdown shortcuts area       |
	|  16. #PLUGINS                  |  all scripts and plugins       |

	===================================================================

	-->

        <!-- #BODY -->
        <!-- Possible Classes

		* 'smart-skin-"""),format.raw/*95.17*/("""{"""),format.raw/*95.18*/("""SKIN#"""),format.raw/*95.23*/("""}"""),format.raw/*95.24*/("""'
		* 'smart-rtl'         - Switch theme mode to RTL (will be avilable from version SmartAdmin 1.5)
		* 'menu-on-top'       - Switch to top navigation (no DOM change required)
		* 'hidden-menu'       - Hides the main menu but still accessable by hovering over left edge
		* 'fixed-header'      - Fixes the header
		* 'fixed-navigation'  - Fixes the main menu
		* 'fixed-ribbon'      - Fixes breadcrumb
		* 'fixed-footer'      - Fixes footer
		* 'container'         - boxed layout mode (non-responsive: will not work with fixed-navigation & fixed-ribbon)
	-->
    <body class="">
            <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
        <script src=""""),_display_(/*107.23*/routes/*107.29*/.Assets.at("javascripts/libs/jquery-2.0.2.min.js")),format.raw/*107.79*/(""""></script>

        <script src=""""),_display_(/*109.23*/routes/*109.29*/.Assets.at("javascripts/libs/jquery-ui-1.10.3.min.js")),format.raw/*109.83*/(""""></script>

            <!-- #HEADER -->
        <header id="header">
            <div id="logo-group">

                    <!-- PLACE YOUR LOGO HERE -->
                <span id="logo"> <img src=""""),_display_(/*116.45*/routes/*116.51*/.Assets.at("images/logo.png")),format.raw/*116.80*/("""" alt="SmartAdmin"> </span>
                    <!-- END LOGO PLACEHOLDER -->

                    <!-- Note: The activity badge color changes when clicked and resets the number to 0
					 Suggestion: You may want to set a flag when this happens to tick off all checked messages / notifications -->
                <span id="activity" class="activity-dropdown"> <i class="fa fa-user"></i> <b class="badge"> 21 </b> </span>

                    <!-- AJAX-DROPDOWN : control this dropdown height, look and feel from the LESS variable file -->
                <div class="ajax-dropdown">

                        <!-- the ID links are fetched via AJAX to the ajax container "ajax-notifications" -->
                    <div class="btn-group btn-group-justified" data-toggle="buttons">
                        <label class="btn btn-default">
                            <input type="radio" name="activity" id="ajax/notify/mail.html">
                            Msgs (14) </label>
                        <label class="btn btn-default">
                            <input type="radio" name="activity" id="ajax/notify/notifications.html">
                            notify (3) </label>
                        <label class="btn btn-default">
                            <input type="radio" name="activity" id="ajax/notify/tasks.html">
                            Tasks (4) </label>
                    </div>

                        <!-- notification content -->
                    <div class="ajax-notifications custom-scroll">

                        <div class="alert alert-transparent">
                            <h4>Click a button to show messages here</h4>
                            This blank page message helps protect your privacy, or you can show the first message here
                            automatically.
                        </div>

                        <i class="fa fa-lock fa-4x fa-border"></i>

                    </div>
                        <!-- end notification content -->

                        <!-- footer: refresh area -->
                    <span> Last updated on: 12/12/2013 9:43AM
                        <button type="button" data-loading-text="<i class='fa fa-refresh fa-spin'></i> Loading..."
                        class="btn btn-xs btn-default pull-right">
                            <i class="fa fa-refresh"></i>
                        </button> </span>
                        <!-- end footer -->

                </div>
                    <!-- END AJAX-DROPDOWN -->
            </div>

                <!-- #PROJECTS: projects dropdown -->
            <div class="project-context hidden-xs">

                <span class="label">Projects:</span>
                <span class="project-selector dropdown-toggle" data-toggle="dropdown">Recent projects <i
                class="fa fa-angle-down"></i></span>

                    <!-- Suggestion: populate this list with fetch and push technique -->
                <ul class="dropdown-menu">
                    <li>
                        <a href="javascript:void(0);">Online e-merchant management system - attaching integration with the iOS</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Notes on pipeline upgradee</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Assesment Report for merchant account</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="javascript:void(0);"><i class="fa fa-power-off"></i> Clear</a>
                    </li>
                </ul>
                    <!-- end dropdown-menu-->

            </div>
                <!-- end projects dropdown -->

                <!-- #TOGGLE LAYOUT BUTTONS -->
                <!-- pulled right: nav area -->
            <div class="pull-right">

                    <!-- collapse menu button -->
                <div id="hide-menu" class="btn-header pull-right">
                    <span> <a href="javascript:void(0);" data-action="toggleMenu" title="Collapse Menu"><i
                    class="fa fa-reorder"></i></a> </span>
                </div>
                    <!-- end collapse menu -->

                    <!-- #MOBILE -->
                    <!-- Top menu profile link : this shows only when top menu is active -->
                <ul id="mobile-profile-img" class="header-dropdown-list hidden-xs padding-5">
                    <li class="">
                        <a href="#" class="dropdown-toggle no-margin userdropdown" data-toggle="dropdown">
                            <img src=""""),_display_(/*209.40*/routes/*209.46*/.Assets.at("images/avatars/sunny.png")),format.raw/*209.84*/("""" alt="John Doe" class="online"/>
                        </a>
                        <ul class="dropdown-menu pull-right">
                            <li>
                                <a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0"><i
                                class="fa fa-cog"></i> Setting</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#ajax/profile.html" class="padding-10 padding-top-0 padding-bottom-0"> <i
                                class="fa fa-user"></i> <u>P</u>rofile</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0"
                                data-action="toggleShortcut"><i class="fa fa-arrow-down"></i> <u>S</u>hortcut</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0"
                                data-action="launchFullscreen"><i class="fa fa-arrows-alt"></i> Full <u>S</u>creen</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="login.html" class="padding-10 padding-top-5 padding-bottom-5" data-action="userLogout"><i
                                class="fa fa-sign-out fa-lg"></i> <strong><u>L</u>ogout</strong></a>
                            </li>
                        </ul>
                    </li>
                </ul>

                    <!-- logout button -->
                <div id="logout" class="btn-header transparent pull-right">
                    <span> <a href="login.html" title="Sign Out" data-action="userLogout"
                    data-logout-msg="You can improve your security further after logging out by closing this opened browser"><i
                    class="fa fa-sign-out"></i></a> </span>
                </div>
                    <!-- end logout button -->

                    <!-- search mobile button (this is hidden till mobile view port) -->
                <div id="search-mobile" class="btn-header transparent pull-right">
                    <span> <a href="javascript:void(0)" title="Search"><i class="fa fa-search"></i></a> </span>
                </div>
                    <!-- end search mobile button -->

                    <!-- #SEARCH -->
                    <!-- input: search field -->
                <form action="#ajax/search.html" class="header-search pull-right">
                    <input id="search-fld" type="text" name="param" placeholder="Find reports and more">
                    <button type="submit">
                        <i class="fa fa-search"></i>
                    </button>
                    <a href="javascript:void(0);" id="cancel-search-js" title="Cancel Search"><i class="fa fa-times"></i></a>
                </form>
                    <!-- end input: search field -->

                    <!-- fullscreen button -->
                <div id="fullscreen" class="btn-header transparent pull-right">
                    <span> <a href="javascript:void(0);" data-action="launchFullscreen" title="Full Screen"><i
                    class="fa fa-arrows-alt"></i></a> </span>
                </div>
                    <!-- end fullscreen button -->

                    <!-- #Voice Command: Start Speech -->
                <div id="speech-btn" class="btn-header transparent pull-right hidden-sm hidden-xs">
                    <div>
                        <a href="javascript:void(0)" title="Voice Command" data-action="voiceCommand"><i
                        class="fa fa-microphone"></i></a>

                        <div class="popover bottom">
                            <div class="arrow"></div>
                            <div class="popover-content">
                                <h4 class="vc-title">Voice command activated <br>
                                    <small>Please speak clearly into the mic</small>
                                </h4>
                                <h4 class="vc-title-error text-center">
                                    <i class="fa fa-microphone-slash"></i> Voice command failed
                                    <br>
                                    <small class="txt-color-red">Must <strong>"Allow"</strong> Microphone</small>
                                    <br>
                                    <small class="txt-color-red">Must have <strong>Internet Connection</strong></small>
                                </h4>
                                <a href="javascript:void(0);" class="btn btn-success" onclick="commands.help()">See Commands</a>
                                <a href="javascript:void(0);" class="btn bg-color-purple txt-color-white"
                                onclick="$('#speech-btn .popover').fadeOut(50);">Close Popup</a>
                            </div>
                        </div>
                    </div>
                </div>
                    <!-- end voice command -->

                    <!-- multiple lang dropdown : find all flags in the flags page -->
                <ul class="header-dropdown-list hidden-xs">
                    <li>
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <img src=""""),_display_(/*303.96*/routes/*303.102*/.Assets.at("images/blank.gif")),format.raw/*303.132*/("""" class="flag flag-us"
                        alt="United States"> <span> US</span> <i
                        class="fa fa-angle-down"></i> </a>
                        <ul class="dropdown-menu pull-right">
                            <li class="active">
                                <a href="javascript:void(0);"><img src=""""),_display_(/*308.74*/routes/*308.80*/.Assets.at("images/blank.gif")),format.raw/*308.110*/("""" class="flag flag-us" alt="United States">
                                    English (US)</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*312.74*/routes/*312.80*/.Assets.at("images/blank.gif")),format.raw/*312.110*/("""" class="flag flag-fr" alt="France">
                                    Français</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*316.74*/routes/*316.80*/.Assets.at("images/blank.gif")),format.raw/*316.110*/("""" class="flag flag-es" alt="Spanish">
                                    Español</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*320.74*/routes/*320.80*/.Assets.at("images/blank.gif")),format.raw/*320.110*/("""" class="flag flag-de" alt="German">
                                    Deutsch</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*324.74*/routes/*324.80*/.Assets.at("images/blank.gif")),format.raw/*324.110*/("""" class="flag flag-jp" alt="Japan"> 日本語</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*327.74*/routes/*327.80*/.Assets.at("images/blank.gif")),format.raw/*327.110*/("""" class="flag flag-cn" alt="China"> 中文</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*330.74*/routes/*330.80*/.Assets.at("images/blank.gif")),format.raw/*330.110*/("""" class="flag flag-it" alt="Italy">
                                    Italiano</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*334.74*/routes/*334.80*/.Assets.at("images/blank.gif")),format.raw/*334.110*/("""" class="flag flag-pt" alt="Portugal"> Portugal</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*337.74*/routes/*337.80*/.Assets.at("images/blank.gif")),format.raw/*337.110*/("""" class="flag flag-ru" alt="Russia"> Русский
                                    язык</a>
                            </li>
                            <li>
                                <a href="javascript:void(0);"><img src=""""),_display_(/*341.74*/routes/*341.80*/.Assets.at("images/blank.gif")),format.raw/*341.110*/("""" class="flag flag-kp" alt="Korea"> 한국어</a>
                            </li>

                        </ul>
                    </li>
                </ul>
                    <!-- end multiple lang -->

            </div>
                <!-- end pulled right: nav area -->

        </header>
            <!-- END HEADER -->

            <!-- #NAVIGATION -->
            <!-- Left panel : Navigation area -->
            <!-- Note: This width of the aside area can be adjusted through LESS variables -->
        <aside id="left-panel">

                <!-- User info -->
            <div class="login-info">
                <span> <!-- User image size is adjusted inside CSS, it should stay as is -->

                    <a href="javascript:void(0);" id="show-shortcut" data-action="toggleShortcut">
                        <img src=""""),_display_(/*365.36*/routes/*365.42*/.Assets.at("images/avatars/sunny.png")),format.raw/*365.80*/("""" alt="me" class="online"/>
                        <span>
                            john.doe
                        </span>
                        <i class="fa fa-angle-down"></i>
                    </a>

                </span>
            </div>
                <!-- end user info -->

                <!-- NAVIGATION : This navigation is also responsive

			To make this navigation dynamic please make sure to link the node
			(the reference to the nav > ul) after page load. Or the navigation
			will not initialize.
			-->
            <nav>
                    <!--
				NOTE: Notice the gaps after each icon usage <i></i>..
				Please note that these links work a bit different than
				traditional href="" links. See documentation for details.
				-->

                <ul>
                    <li class="">
                        <a href=""""),_display_(/*391.35*/routes/*391.41*/.Demo.dashboard()),format.raw/*391.58*/("""" title="Dashboard"><i class="fa fa-lg fa-fw fa-home"></i> <span
                        class="menu-item-parent">Dashboard</span></a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*395.35*/routes/*395.41*/.Demo.inbox()),format.raw/*395.54*/(""""><i class="fa fa-lg fa-fw fa-inbox"></i> <span class="menu-item-parent">Inbox</span><span
                        class="badge pull-right inbox-badge">14</span></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-lg fa-fw fa-bar-chart-o"></i> <span class="menu-item-parent">Graphs</span></a>
                        <ul>
                            <li>
                                <a href=""""),_display_(/*402.43*/routes/*402.49*/.Demo.flot()),format.raw/*402.61*/("""">Flot Chart</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*405.43*/routes/*405.49*/.Demo.morris()),format.raw/*405.63*/("""">Morris Charts</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*408.43*/routes/*408.49*/.Demo.inline_charts()),format.raw/*408.70*/("""">Inline Charts</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*411.43*/routes/*411.49*/.Demo.dygraphs()),format.raw/*411.65*/("""">Dygraphs <span class="badge pull-right inbox-badge bg-color-yellow">new</span></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-lg fa-fw fa-table"></i> <span class="menu-item-parent">Tables</span></a>
                        <ul>
                            <li>
                                <a href=""""),_display_(/*419.43*/routes/*419.49*/.Demo.table()),format.raw/*419.62*/("""">Normal Tables</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*422.43*/routes/*422.49*/.Demo.datatables()),format.raw/*422.67*/("""">Data Tables <span class="badge inbox-badge bg-color-greenLight">v1.10</span></a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*425.43*/routes/*425.49*/.Demo.jqgrid()),format.raw/*425.63*/("""">Jquery Grid</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-lg fa-fw fa-pencil-square-o"></i> <span class="menu-item-parent">Forms</span></a>
                        <ul>
                            <li>
                                <a href=""""),_display_(/*433.43*/routes/*433.49*/.Demo.form_elements()),format.raw/*433.70*/("""">Smart Form Elements</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*436.43*/routes/*436.49*/.Demo.form_templates()),format.raw/*436.71*/("""">Smart Form Layouts</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*439.43*/routes/*439.49*/.Demo.validation()),format.raw/*439.67*/("""">Smart Form Validation</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*442.43*/routes/*442.49*/.Demo.bootstrap_forms()),format.raw/*442.72*/("""">Bootstrap Form Elements</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*445.43*/routes/*445.49*/.Demo.plugins()),format.raw/*445.64*/("""">Form Plugins</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*448.43*/routes/*448.49*/.Demo.wizard()),format.raw/*448.63*/("""">Wizards</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*451.43*/routes/*451.49*/.Demo.other_editors()),format.raw/*451.70*/("""">Bootstrap Editors</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*454.43*/routes/*454.49*/.Demo.dropzone()),format.raw/*454.65*/("""">Dropzone</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*457.43*/routes/*457.49*/.Demo.image_editor()),format.raw/*457.69*/("""">Image Cropping <span class="badge pull-right inbox-badge bg-color-yellow">new</span></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-lg fa-fw fa-desktop"></i> <span class="menu-item-parent">UI Elements</span></a>
                        <ul>
                            <li>
                                <a href=""""),_display_(/*465.43*/routes/*465.49*/.Demo.general_elements()),format.raw/*465.73*/("""">General Elements</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*468.43*/routes/*468.49*/.Demo.buttons()),format.raw/*468.64*/("""">Buttons</a>
                            </li>
                            <li>
                                <a href="#">Icons</a>
                                <ul>
                                    <li>
                                        <a href=""""),_display_(/*474.51*/routes/*474.57*/.Demo.fa()),format.raw/*474.67*/(""""><i class="fa fa-plane"></i> Font Awesome</a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*477.51*/routes/*477.57*/.Demo.glyph()),format.raw/*477.70*/(""""><i class="glyphicon glyphicon-plane"></i> Glyph Icons</a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*480.51*/routes/*480.57*/.Demo.flags()),format.raw/*480.70*/(""""><i class="fa fa-flag"></i> Flags</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href=""""),_display_(/*485.43*/routes/*485.49*/.Demo.grid()),format.raw/*485.61*/("""">Grid</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*488.43*/routes/*488.49*/.Demo.treeview()),format.raw/*488.65*/("""">Tree View</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*491.43*/routes/*491.49*/.Demo.nestable_list()),format.raw/*491.70*/("""">Nestable Lists</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*494.43*/routes/*494.49*/.Demo.jqui()),format.raw/*494.61*/("""">JQuery UI</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*497.43*/routes/*497.49*/.Demo.typography()),format.raw/*497.67*/("""">Typography</a>
                            </li>
                            <li>
                                <a href="#">Six Level Menu</a>
                                <ul>
                                    <li>
                                        <a href="#"><i class="fa fa-fw fa-folder-open"></i> Item #2</a>
                                        <ul>
                                            <li>
                                                <a href="#"><i class="fa fa-fw fa-folder-open"></i> Sub #2.1 </a>
                                                <ul>
                                                    <li>
                                                        <a href="#"><i class="fa fa-fw fa-file-text"></i> Item #2.1.1</a>
                                                    </li>
                                                    <li>
                                                        <a href="#"><i class="fa fa-fw fa-plus"></i> Expand</a>
                                                        <ul>
                                                            <li>
                                                                <a href="#"><i class="fa fa-fw fa-file-text"></i> File</a>
                                                            </li>
                                                            <li>
                                                                <a href="#"><i class="fa fa-fw fa-trash-o"></i> Delete</a></li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li>
                                        <a href="#"><i class="fa fa-fw fa-folder-open"></i> Item #3</a>

                                        <ul>
                                            <li>
                                                <a href="#"><i class="fa fa-fw fa-folder-open"></i> 3ed Level </a>
                                                <ul>
                                                    <li>
                                                        <a href="#"><i class="fa fa-fw fa-file-text"></i> File</a>
                                                    </li>
                                                    <li>
                                                        <a href="#"><i class="fa fa-fw fa-file-text"></i> File</a>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>

                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href=""""),_display_(/*548.35*/routes/*548.41*/.Demo.calendar()),format.raw/*548.57*/(""""><i class="fa fa-lg fa-fw fa-calendar"><em>3</em></i> <span class="menu-item-parent">Calendar</span></a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*551.35*/routes/*551.41*/.Demo.widgets()),format.raw/*551.56*/(""""><i class="fa fa-lg fa-fw fa-list-alt"></i> <span class="menu-item-parent">Widgets</span></a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*554.35*/routes/*554.41*/.Demo.gallery()),format.raw/*554.56*/(""""><i class="fa fa-lg fa-fw fa-picture-o"></i> <span
                        class="menu-item-parent">Gallery</span></a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*558.35*/routes/*558.41*/.Demo.gmap_xml()),format.raw/*558.57*/(""""><i class="fa fa-lg fa-fw fa-map-marker"></i> <span
                        class="menu-item-parent">GMap Skins</span><span
                        class="badge bg-color-greenLight pull-right inbox-badge">9</span></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-lg fa-fw fa-windows"></i> <span class="menu-item-parent">Miscellaneous</span></a>
                        <ul>
                            <li>
                                <a href="#"><i class="fa fa-file"></i> Other Pages</a>
                                <ul>
                                    <li>
                                        <a href=""""),_display_(/*569.51*/routes/*569.57*/.Demo.forum()),format.raw/*569.70*/("""">Forum Layout</a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*572.51*/routes/*572.57*/.Demo.profile()),format.raw/*572.72*/("""">Profile</a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(/*575.51*/routes/*575.57*/.Demo.timeline()),format.raw/*575.73*/("""">Timeline</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href=""""),_display_(/*580.43*/routes/*580.49*/.Demo.pricing_table()),format.raw/*580.70*/("""">Pricing Tables</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*583.43*/routes/*583.49*/.Demo.invoice()),format.raw/*583.64*/("""">Invoice</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*586.43*/routes/*586.49*/.Demo.login()),format.raw/*586.62*/("""" target="_top">Login</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*589.43*/routes/*589.49*/.Demo.register()),format.raw/*589.65*/("""" target="_top">Register</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*592.43*/routes/*592.49*/.Demo.lock()),format.raw/*592.61*/("""" target="_top">Locked Screen</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*595.43*/routes/*595.49*/.Demo.error404()),format.raw/*595.65*/("""=">Error 404</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*598.43*/routes/*598.49*/.Demo.error500()),format.raw/*598.65*/("""">Error 500</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*601.43*/routes/*601.49*/.Demo.blank()),format.raw/*601.62*/("""">Blank Page</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*604.43*/routes/*604.49*/.Demo.email_template()),format.raw/*604.71*/("""">Email Template</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*607.43*/routes/*607.49*/.Demo.search()),format.raw/*607.63*/("""/">Search Page</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*610.43*/routes/*610.49*/.Demo.ckeditor()),format.raw/*610.65*/("""">CK Editor</a>
                            </li>
                        </ul>
                    </li>
                    <li class="top-menu-hidden">
                        <a href="#"><i class="fa fa-lg fa-fw fa-cube txt-color-blue"></i> <span
                        class="menu-item-parent">SmartAdmin Intel</span></a>
                        <ul>
                            <li>
                                <a href=""""),_display_(/*619.43*/routes/*619.49*/.Demo.difver()),format.raw/*619.63*/(""""><i class="fa fa-stack-overflow"></i> Different Versions</a>
                            </li>
                            <li>
                                <a href=""""),_display_(/*622.43*/routes/*622.49*/.Demo.applayout()),format.raw/*622.66*/(""""><i class="fa fa-cube"></i> App Settings</a>
                            </li>
                            <li>
                                <a href="http://192.241.236.31/smartadmin/BUGTRACK/track_/documentation/index.html" target="_blank"><i
                                class="fa fa-book"></i> Documentation</a>
                            </li>
                            <li>
                                <a href="http://192.241.236.31/smartadmin/BUGTRACK/track_/" target="_blank"><i class="fa fa-bug"></i> Bug
                                    Tracker</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <span class="minifyme" data-action="minifyMenu"> <i class="fa fa-arrow-circle-left hit"></i> </span>

        </aside>
            <!-- END NAVIGATION -->

            <!-- #MAIN PANEL -->
        <div id="main" role="main">

                <!-- RIBBON -->
            <div id="ribbon">

                <span class="ribbon-button-alignment">
                    <span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"
                    rel="tooltip" data-placement="bottom"
                    data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings."
                    data-html="true"
                    data-reset-msg="Would you like to RESET all your saved widgets and clear LocalStorage?"><i
                    class="fa fa-refresh"></i></span>
                </span>

                    <!-- breadcrumb -->
                <ol class="breadcrumb">
                        <!-- This is auto generated -->
                </ol>
                    <!-- end breadcrumb -->

                    <!-- You can also add more buttons to the
				ribbon for further usability

				Example below:

				<span class="ribbon-button-alignment pull-right" style="margin-right:25px">
					<span id="search" class="btn btn-ribbon hidden-xs" data-title="search"><i class="fa fa-grid"></i> Change Grid</span>
					<span id="add" class="btn btn-ribbon hidden-xs" data-title="add"><i class="fa fa-plus"></i> Add</span>
					<span id="search" class="btn btn-ribbon" data-title="search"><i class="fa fa-search"></i> <span class="hidden-mobile">Search</span></span>
				</span> -->

            </div>
                <!-- END RIBBON -->

                <!-- #MAIN CONTENT -->
            """),_display_(/*677.14*/content),format.raw/*677.21*/("""
                """),format.raw/*678.17*/("""<!-- END #MAIN CONTENT -->

        </div>
            <!-- END #MAIN PANEL -->

          """),_display_(/*683.12*/partials/*683.20*/.footer()),format.raw/*683.29*/("""

            """),format.raw/*685.13*/("""<!-- #SHORTCUT AREA : With large tiles (activated via clicking user name tag)
			 Note: These tiles are completely responsive, you can add as many as you like -->
        <div id="shortcut">
            <ul>
                <li>
                    <a href="#ajax/inbox.html" class="jarvismetro-tile big-cubes bg-color-blue"> <span class="iconbox"> <i
                    class="fa fa-envelope fa-4x"></i> <span>Mail <span
                    class="label pull-right bg-color-darken">14</span></span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/calendar.html" class="jarvismetro-tile big-cubes bg-color-orangeDark"> <span class="iconbox"> <i
                    class="fa fa-calendar fa-4x"></i> <span>Calendar</span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/gmap-xml.html" class="jarvismetro-tile big-cubes bg-color-purple"> <span class="iconbox"> <i
                    class="fa fa-map-marker fa-4x"></i> <span>Maps</span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/invoice.html" class="jarvismetro-tile big-cubes bg-color-blueDark"> <span class="iconbox"> <i
                    class="fa fa-book fa-4x"></i> <span>Invoice <span class="label pull-right bg-color-darken">99</span></span> </span>
                    </a>
                </li>
                <li>
                    <a href="#ajax/gallery.html" class="jarvismetro-tile big-cubes bg-color-greenLight"> <span class="iconbox"> <i
                    class="fa fa-picture-o fa-4x"></i> <span>Gallery </span> </span> </a>
                </li>
                <li>
                    <a href="#ajax/profile.html" class="jarvismetro-tile big-cubes selected bg-color-pinkDark"> <span
                    class="iconbox"> <i class="fa fa-user fa-4x"></i> <span>My Profile </span> </span> </a>
                </li>
            </ul>
        </div>
            <!-- END SHORTCUT AREA -->

            <!--================================================== -->

            <!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)
		<script data-pace-options='"""),format.raw/*722.30*/("""{"""),format.raw/*722.31*/(""" """),format.raw/*722.32*/(""""restartOnRequestAfter": true """),format.raw/*722.62*/("""}"""),format.raw/*722.63*/("""' src="js/plugin/pace/pace.min.js"></script>-->


            <!-- #PLUGINS -->


            <!-- IMPORTANT: APP CONFIG -->
        <script src=""""),_display_(/*729.23*/routes/*729.29*/.Assets.at("javascripts/app.config.js")),format.raw/*729.68*/(""""></script>

            <!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
        <script src=""""),_display_(/*732.23*/routes/*732.29*/.Assets.at("javascripts/plugin/jquery-touch/jquery.ui.touch-punch.min.js")),format.raw/*732.103*/(""""></script>

            <!-- BOOTSTRAP JS -->
        <script src=""""),_display_(/*735.23*/routes/*735.29*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*735.81*/(""""></script>

            <!-- CUSTOM NOTIFICATION -->
        <script src=""""),_display_(/*738.23*/routes/*738.29*/.Assets.at("javascripts/notification/SmartNotification.min.js")),format.raw/*738.92*/(""""></script>

            <!-- JARVIS WIDGETS -->
        <script src=""""),_display_(/*741.23*/routes/*741.29*/.Assets.at("javascripts/smartwidgets/jarvis.widget.min.js")),format.raw/*741.88*/(""""></script>

            <!-- EASY PIE CHARTS -->
        <script src=""""),_display_(/*744.23*/routes/*744.29*/.Assets.at("javascripts/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js")),format.raw/*744.105*/(""""></script>

            <!-- SPARKLINES -->
        <script src=""""),_display_(/*747.23*/routes/*747.29*/.Assets.at("javascripts/plugin/sparkline/jquery.sparkline.min.js")),format.raw/*747.95*/(""""></script>

            <!-- JQUERY VALIDATE -->
        <script src=""""),_display_(/*750.23*/routes/*750.29*/.Assets.at("javascripts/plugin/jquery-validate/jquery.validate.min.js")),format.raw/*750.100*/(""""></script>

            <!-- JQUERY MASKED INPUT -->
        <script src=""""),_display_(/*753.23*/routes/*753.29*/.Assets.at("javascripts/plugin/masked-input/jquery.maskedinput.min.js")),format.raw/*753.100*/(""""></script>

            <!-- JQUERY SELECT2 INPUT -->
        <script src=""""),_display_(/*756.23*/routes/*756.29*/.Assets.at("javascripts/plugin/select2/select2.min.js")),format.raw/*756.84*/(""""></script>

            <!-- JQUERY UI + Bootstrap Slider -->
        <script src=""""),_display_(/*759.23*/routes/*759.29*/.Assets.at("javascripts/plugin/bootstrap-slider/bootstrap-slider.min.js")),format.raw/*759.102*/(""""></script>

            <!-- browser msie issue fix -->
        <script src=""""),_display_(/*762.23*/routes/*762.29*/.Assets.at("javascripts/plugin/msie-fix/jquery.mb.browser.min.js")),format.raw/*762.95*/(""""></script>

            <!-- FastClick: For mobile devices: you can disable this in app.js -->
        <script src=""""),_display_(/*765.23*/routes/*765.29*/.Assets.at("javascripts/plugin/fastclick/fastclick.min.js")),format.raw/*765.88*/(""""></script>

            <!--[if IE 8]>
<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
<![endif]-->

            <!-- Demo purpose only -->
        """),format.raw/*772.77*/("""

            """),format.raw/*774.13*/("""<!-- MAIN APP JS FILE -->
        <script src=""""),_display_(/*775.23*/routes/*775.29*/.Assets.at("javascripts/app.js")),format.raw/*775.61*/(""""></script>

            <!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
            <!-- Voice command : plugin -->
        <script src=""""),_display_(/*779.23*/routes/*779.29*/.Assets.at("javascripts/speech/voicecommand.min.js")),format.raw/*779.81*/(""""></script>

            <!-- Your GOOGLE ANALYTICS CODE Below -->
        <script type="text/javascript">
        </script>
        """),_display_(/*784.10*/scripts),format.raw/*784.17*/("""
    """),format.raw/*785.5*/("""</body>

</html>"""))}
  }

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts) => (content) => apply(title,scripts)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:42 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/maindev.scala.html
                  HASH: 1c3122bfa573f253b4057577aba0a58431c6eaf9
                  MATRIX: 517->1|661->57|689->59|809->153|834->158|1208->505|1223->511|1288->554|1387->626|1402->632|1466->674|1681->862|1696->868|1769->919|1868->991|1883->997|1955->1047|2647->1712|2662->1718|2722->1756|2825->1832|2840->1838|2901->1878|2983->1933|2998->1939|3059->1979|3182->2075|3197->2081|3268->2131|3611->2447|3626->2453|3699->2504|3787->2565|3802->2571|3871->2618|3961->2681|3976->2687|4054->2743|4144->2806|4159->2812|4235->2866|4611->3215|4626->3221|4694->3267|4889->3435|4904->3441|4971->3486|5165->3653|5180->3659|5239->3697|6723->5153|6752->5154|6785->5159|6814->5160|7523->5841|7539->5847|7611->5897|7674->5932|7690->5938|7766->5992|7994->6192|8010->6198|8061->6227|12772->10910|12788->10916|12848->10954|18504->16582|18521->16588|18574->16618|18932->16948|18948->16954|19001->16984|19266->17221|19282->17227|19335->17257|19589->17483|19605->17489|19658->17519|19912->17745|19928->17751|19981->17781|20234->18006|20250->18012|20303->18042|20515->18226|20531->18232|20584->18262|20795->18445|20811->18451|20864->18481|21117->18706|21133->18712|21186->18742|21406->18934|21422->18940|21475->18970|21733->19200|21749->19206|21802->19236|22669->20075|22685->20081|22745->20119|23627->20973|23643->20979|23682->20996|23930->21216|23946->21222|23981->21235|24461->21687|24477->21693|24511->21705|24665->21831|24681->21837|24717->21851|24874->21980|24890->21986|24933->22007|25090->22136|25106->22142|25144->22158|25601->22587|25617->22593|25652->22606|25809->22735|25825->22741|25865->22759|26085->22951|26101->22957|26137->22971|26536->23342|26552->23348|26595->23369|26758->23504|26774->23510|26818->23532|26980->23666|26996->23672|27036->23690|27201->23827|27217->23833|27262->23856|27429->23995|27445->24001|27482->24016|27638->24144|27654->24150|27690->24164|27841->24287|27857->24293|27900->24314|28061->24447|28077->24453|28115->24469|28267->24593|28283->24599|28325->24619|28795->25061|28811->25067|28857->25091|29017->25223|29033->25229|29070->25244|29361->25507|29377->25513|29409->25523|29617->25703|29633->25709|29668->25722|29889->25915|29905->25921|29940->25934|30196->26162|30212->26168|30246->26180|30394->26300|30410->26306|30448->26322|30601->26447|30617->26453|30660->26474|30818->26604|30834->26610|30868->26622|31021->26747|31037->26753|31077->26771|34169->29835|34185->29841|34223->29857|34442->30048|34458->30054|34495->30069|34703->30249|34719->30255|34756->30270|34989->30475|35005->30481|35043->30497|35752->31178|35768->31184|35803->31197|35983->31349|35999->31355|36036->31370|36211->31517|36227->31523|36265->31539|36497->31743|36513->31749|36556->31770|36714->31900|36730->31906|36767->31921|36918->32044|36934->32050|36969->32063|37132->32198|37148->32204|37186->32220|37352->32358|37368->32364|37402->32376|37573->32519|37589->32525|37627->32541|37781->32667|37797->32673|37835->32689|37988->32814|38004->32820|38039->32833|38193->32959|38209->32965|38253->32987|38411->33117|38427->33123|38463->33137|38619->33265|38635->33271|38673->33287|39133->33719|39149->33725|39185->33739|39384->33910|39400->33916|39439->33933|41958->36424|41987->36431|42033->36448|42153->36540|42171->36548|42202->36557|42245->36571|44492->38789|44522->38790|44552->38791|44611->38821|44641->38822|44816->38969|44832->38975|44893->39014|45043->39136|45059->39142|45156->39216|45253->39285|45269->39291|45343->39343|45447->39419|45463->39425|45548->39488|45647->39559|45663->39565|45744->39624|45844->39696|45860->39702|45959->39778|46054->39845|46070->39851|46158->39917|46258->39989|46274->39995|46368->40066|46472->40142|46488->40148|46582->40219|46687->40296|46703->40302|46780->40357|46893->40442|46909->40448|47005->40521|47112->40600|47128->40606|47216->40672|47362->40790|47378->40796|47459->40855|47693->41128|47736->41142|47812->41190|47828->41196|47882->41228|48050->41368|48066->41374|48140->41426|48302->41560|48331->41567|48364->41572
                  LINES: 19->1|22->1|24->3|28->7|28->7|36->15|36->15|36->15|37->16|37->16|37->16|41->20|41->20|41->20|42->21|42->21|42->21|53->32|53->32|53->32|56->35|56->35|56->35|57->36|57->36|57->36|60->39|60->39|60->39|65->44|65->44|65->44|66->45|66->45|66->45|67->46|67->46|67->46|68->47|68->47|68->47|75->54|75->54|75->54|77->56|77->56|77->56|79->58|79->58|79->58|116->95|116->95|116->95|116->95|128->107|128->107|128->107|130->109|130->109|130->109|137->116|137->116|137->116|230->209|230->209|230->209|324->303|324->303|324->303|329->308|329->308|329->308|333->312|333->312|333->312|337->316|337->316|337->316|341->320|341->320|341->320|345->324|345->324|345->324|348->327|348->327|348->327|351->330|351->330|351->330|355->334|355->334|355->334|358->337|358->337|358->337|362->341|362->341|362->341|386->365|386->365|386->365|412->391|412->391|412->391|416->395|416->395|416->395|423->402|423->402|423->402|426->405|426->405|426->405|429->408|429->408|429->408|432->411|432->411|432->411|440->419|440->419|440->419|443->422|443->422|443->422|446->425|446->425|446->425|454->433|454->433|454->433|457->436|457->436|457->436|460->439|460->439|460->439|463->442|463->442|463->442|466->445|466->445|466->445|469->448|469->448|469->448|472->451|472->451|472->451|475->454|475->454|475->454|478->457|478->457|478->457|486->465|486->465|486->465|489->468|489->468|489->468|495->474|495->474|495->474|498->477|498->477|498->477|501->480|501->480|501->480|506->485|506->485|506->485|509->488|509->488|509->488|512->491|512->491|512->491|515->494|515->494|515->494|518->497|518->497|518->497|569->548|569->548|569->548|572->551|572->551|572->551|575->554|575->554|575->554|579->558|579->558|579->558|590->569|590->569|590->569|593->572|593->572|593->572|596->575|596->575|596->575|601->580|601->580|601->580|604->583|604->583|604->583|607->586|607->586|607->586|610->589|610->589|610->589|613->592|613->592|613->592|616->595|616->595|616->595|619->598|619->598|619->598|622->601|622->601|622->601|625->604|625->604|625->604|628->607|628->607|628->607|631->610|631->610|631->610|640->619|640->619|640->619|643->622|643->622|643->622|698->677|698->677|699->678|704->683|704->683|704->683|706->685|743->722|743->722|743->722|743->722|743->722|750->729|750->729|750->729|753->732|753->732|753->732|756->735|756->735|756->735|759->738|759->738|759->738|762->741|762->741|762->741|765->744|765->744|765->744|768->747|768->747|768->747|771->750|771->750|771->750|774->753|774->753|774->753|777->756|777->756|777->756|780->759|780->759|780->759|783->762|783->762|783->762|786->765|786->765|786->765|793->772|795->774|796->775|796->775|796->775|800->779|800->779|800->779|805->784|805->784|806->785
                  -- GENERATED --
              */
          