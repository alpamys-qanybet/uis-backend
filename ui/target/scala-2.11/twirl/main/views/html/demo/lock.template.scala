
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
object lock extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<!-- saved from url=(0075)http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/lock.html -->
<html lang="en-us" id="lock-page" data-ember-extension="1"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title> SmartAdmin</title>
		<meta name="description" content="">
		<meta name="author" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		
		<!-- #CSS Links -->
		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/font-awesome.min.css">

		<!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/smartadmin-production.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/smartadmin-skins.min.css">

		<!-- SmartAdmin RTL Support is under construction
			 This RTL CSS will be released in version 1.5
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> -->

		<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/demo.min.css">

		<!-- page related CSS -->
		<link rel="stylesheet" type="text/css" media="screen" href="./lock.scala_files/lockscreen.min.css">

		<!-- #FAVICONS -->
		<link rel="shortcut icon" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/favicon/favicon.ico" type="image/x-icon">
		<link rel="icon" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/favicon/favicon.ico" type="image/x-icon">

		<!-- #GOOGLE FONT -->
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

		<!-- #APP SCREEN / ICONS -->
		<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
		<link rel="apple-touch-icon" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/sptouch-icon-iphone.png">
		<link rel="apple-touch-icon" sizes="76x76" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/touch-icon-ipad.png">
		<link rel="apple-touch-icon" sizes="120x120" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/touch-icon-iphone-retina.png">
		<link rel="apple-touch-icon" sizes="152x152" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/touch-icon-ipad-retina.png">
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		
		<!-- Startup image for web apps -->
		<link rel="apple-touch-startup-image" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/ipad-landscape.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
		<link rel="apple-touch-startup-image" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/ipad-portrait.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
		<link rel="apple-touch-startup-image" href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/img/splash/iphone.png" media="screen and (max-device-width: 320px)">

	<style type="text/css"></style><script type="text/javascript" src="chrome-extension://bfbmjmiodbnnpllbbbfblcplfjjepjdn/js/injected.js"></script></head>
	
	<body class=" desktop-detected pace-done" style=""><div class="pace  pace-inactive"><div class="pace-progress" data-progress-text="100%" data-progress="99" style="width: 100%;">
  <div class="pace-progress-inner"></div>
</div>
<div class="pace-activity"></div></div>

		<div id="main" role="main">

			<!-- MAIN CONTENT -->

			<form class="lockscreen animated flipInY" action="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/index.html">
				<div class="logo">
					<h1 class="semi-bold"><img src="./lock.scala_files/logo-o.png" alt=""> SmartAdmin</h1>
				</div>
				<div>
					<img src="./lock.scala_files/sunny-big.png" alt="" width="120" height="120">
					<div>
						<h1><i class="fa fa-user fa-3x text-muted air air-top-right hidden-mobile"></i>John Doe <small><i class="fa fa-lock text-muted"></i> &nbsp;Locked</small></h1>
						<p class="text-muted">
							<a href="mailto:simmons@smartadmin">john.doe@smartadmin.com</a>
						</p>

						<div class="input-group">
							<input class="form-control" type="password" placeholder="Password">
							<div class="input-group-btn">
								<button class="btn btn-primary" type="submit">
									<i class="fa fa-key"></i>
								</button>
							</div>
						</div>
						<p class="no-margin margin-top-5">
							Logged as someone else? <a href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/login.html"> Click here</a>
						</p>
					</div>

				</div>
				<p class="font-xs margin-top-5">
					Copyright SmartAdmin 2014-2020.

				</p>
			</form>

		</div>

		<!--================================================== -->	

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script type="text/javascript" async="" src="./lock.scala_files/ga.js"></script><script src="./lock.scala_files/pace.min.js"></script>

	    <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	    <script src="./lock.scala_files/jquery.min.js"></script>
		<script> if (!window.jQuery) """),format.raw/*109.32*/("""{"""),format.raw/*109.33*/(""" """),format.raw/*109.34*/("""document.write('<script src="js/libs/jquery-2.0.2.min.js"><\/script>');"""),format.raw/*109.105*/("""}"""),format.raw/*109.106*/(""" """),format.raw/*109.107*/("""</script>

	    <script src="./lock.scala_files/jquery-ui.min.js"></script>
		<script> if (!window.jQuery.ui) """),format.raw/*112.35*/("""{"""),format.raw/*112.36*/(""" """),format.raw/*112.37*/("""document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');"""),format.raw/*112.112*/("""}"""),format.raw/*112.113*/(""" """),format.raw/*112.114*/("""</script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src="./lock.scala_files/app.config.js"></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events 		
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

		<!-- BOOTSTRAP JS -->		
		<script src="./lock.scala_files/bootstrap.min.js"></script>

		<!-- JQUERY VALIDATE -->
		<script src="./lock.scala_files/jquery.validate.min.js"></script>
		
		<!-- JQUERY MASKED INPUT -->
		<script src="./lock.scala_files/jquery.maskedinput.min.js"></script>
		
		<!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

		<!-- MAIN APP JS FILE -->
		<script src="./lock.scala_files/app.min.js"></script>

		<!-- Your GOOGLE ANALYTICS CODE Below -->
		<script type="text/javascript">
		
		  var _gaq = _gaq || [];
		  _gaq.push(['_setAccount', 'UA-43548732-3']);
		  _gaq.push(['_trackPageview']);
		
		  (function() """),format.raw/*145.17*/("""{"""),format.raw/*145.18*/("""
		    """),format.raw/*146.7*/("""var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
		    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
		    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
		  """),format.raw/*149.5*/("""}"""),format.raw/*149.6*/(""")();
		
		</script>

	
<script type="text/javascript" src="chrome-extension://bmdblncegkenkacieihfhpjfppoconhi/in-page-script.js"></script></body></html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/lock.scala.html
                  HASH: 8e97c6a1b9bc77d6b9a7484d9d5e95328fc2b24a
                  MATRIX: 584->0|6914->6303|6944->6304|6974->6305|7075->6376|7106->6377|7137->6378|7276->6488|7306->6489|7336->6490|7441->6565|7472->6566|7503->6567|8532->7567|8562->7568|8597->7575|8930->7880|8959->7881
                  LINES: 22->1|130->109|130->109|130->109|130->109|130->109|130->109|133->112|133->112|133->112|133->112|133->112|133->112|166->145|166->145|167->146|170->149|170->149
                  -- GENERATED --
              */
          