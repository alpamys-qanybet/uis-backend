
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
object forgotpassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en-us" id="extr-page">
	<head>
		<meta charset="utf-8">
		<title> SmartAdmin</title>
		<meta name="description" content="">
		<meta name="author" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		
		<!-- #CSS Links -->
		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.64*/routes/*12.70*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.113*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.64*/routes/*13.70*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*13.112*/("""">

		<!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.64*/routes/*16.70*/.Assets.at("stylesheets/smartadmin-production.css")),format.raw/*16.121*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*17.64*/routes/*17.70*/.Assets.at("stylesheets/smartadmin-skins.css")),format.raw/*17.116*/("""">

		<!-- SmartAdmin RTL Support is under construction
			 This RTL CSS will be released in version 1.5
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*21.64*/routes/*21.70*/.Assets.at("stylesheets/smartadmin-rtl.min.css")),format.raw/*21.118*/(""""> -->

		<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*25.64*/routes/*25.70*/.Assets.at("stylesheets/your_style.css")),format.raw/*25.110*/(""""> -->

		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*28.64*/routes/*28.70*/.Assets.at("stylesheets/demo.min.css")),format.raw/*28.108*/("""">

		<!-- #FAVICONS -->
		<link rel="shortcut icon" href=""""),_display_(/*31.36*/routes/*31.42*/.Assets.at("images/favicon/favicon.ico")),format.raw/*31.82*/("""" type="image/x-icon">
		<link rel="icon" href=""""),_display_(/*32.27*/routes/*32.33*/.Assets.at("images/favicon/favicon.ico")),format.raw/*32.73*/("""" type="image/x-icon">

		<!-- #GOOGLE FONT -->
		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

		<!-- #APP SCREEN / ICONS -->
		<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
		<link rel="apple-touch-icon" href=""""),_display_(/*40.39*/routes/*40.45*/.Assets.at("images/splash/sptouch-icon-iphone.png")),format.raw/*40.96*/("""">
		<link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(/*41.53*/routes/*41.59*/.Assets.at("images/splash/touch-icon-ipad.png")),format.raw/*41.106*/("""">
		<link rel="apple-touch-icon" sizes="120x120" href=""""),_display_(/*42.55*/routes/*42.61*/.Assets.at("images/splash/touch-icon-iphone-retina.png")),format.raw/*42.117*/("""">
		<link rel="apple-touch-icon" sizes="152x152" href=""""),_display_(/*43.55*/routes/*43.61*/.Assets.at("images/splash/touch-icon-ipad-retina.png")),format.raw/*43.115*/("""">
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		
		<!-- Startup image for web apps -->
		<link rel="apple-touch-startup-image" href=""""),_display_(/*50.48*/routes/*50.54*/.Assets.at("images/splash/ipad-landscape.png")),format.raw/*50.100*/("""" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
		<link rel="apple-touch-startup-image" href=""""),_display_(/*51.48*/routes/*51.54*/.Assets.at("images/splash/ipad-portrait.png")),format.raw/*51.99*/("""" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
		<link rel="apple-touch-startup-image" href=""""),_display_(/*52.48*/routes/*52.54*/.Assets.at("images/splash/iphone.png")),format.raw/*52.92*/("""" media="screen and (max-device-width: 320px)">

	</head>
	
	<body class="animated fadeInDown">
		<!-- possible classes: minified, no-right-panel, fixed-ribbon, fixed-header, fixed-width-->
		<header id="header">
			<!--<span id="logo"></span>-->

			<div id="logo-group">
				<span id="logo"> <img src=""""),_display_(/*62.33*/routes/*62.39*/.Assets.at("images/logo.png")),format.raw/*62.68*/("""" alt="SmartAdmin"> </span>

				<!-- END AJAX-DROPDOWN -->
			</div>

			<span id="extr-page-header-space"> <span class="hidden-mobile">Need an account?</span> <a href=""""),_display_(/*67.101*/routes/*67.107*/.Demo.register()),format.raw/*67.123*/("""" class="btn btn-danger">Creat account</a> </span>

		</header>

		<div id="main" role="main">

			<!-- MAIN CONTENT -->
			<div id="content" class="container">

				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-7 col-lg-8 hidden-xs hidden-sm">
						<h1 class="txt-color-red login-header-big">SmartAdmin</h1>
						<div class="hero">

							<div class="pull-left login-desc-box-l">
								<h4 class="paragraph-header">It's Okay to be Smart. Experience the simplicity of SmartAdmin, everywhere you go!</h4>
								<div class="login-app-icons">
									<a href="javascript:void(0);" class="btn btn-danger btn-sm">Frontend Template</a>
									<a href="javascript:void(0);" class="btn btn-danger btn-sm">Find out more</a>
								</div>
							</div>
							
							<img src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.at("images/iphoneview.png")),format.raw/*89.60*/("""" class="pull-right display-image" alt="" style="width:210px">

						</div>

						<div class="row">
							<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
								<h5 class="about-heading">About SmartAdmin - Are you up to date?</h5>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa.
								</p>
							</div>
							<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
								<h5 class="about-heading">Not just your average template!</h5>
								<p>
									Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi voluptatem accusantium!
								</p>
							</div>
						</div>

					</div>
					<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
						<div class="well no-padding">
							<form action=""""),_display_(/*111.23*/routes/*111.29*/.Demo.login()),format.raw/*111.42*/("""" id="login-form" class="smart-form client-form">
								<header>
									Forgot Password
								</header>

								<fieldset>
									
									<section>
										<label class="label">Enter your email address</label>
										<label class="input"> <i class="icon-append fa fa-envelope"></i>
											<input type="email" name="email">
											<b class="tooltip tooltip-top-right"><i class="fa fa-envelope txt-color-teal"></i> Please enter email address for password reset</b></label>
									</section>
									<section>
										<span class="timeline-seperator text-center text-primary"></span>
                                        <span class="font-sm">OR</span>
									</section>
									<section>
										<label class="label">Your Username</label>
										<label class="input"> <i class="icon-append fa fa-user"></i>
											<input type="text" name="username">
											<b class="tooltip tooltip-top-right"><i class="fa fa-user txt-color-teal"></i> Enter your username</b> </label>
										<div class="note">
											<a href=""""),_display_(/*134.22*/routes/*134.28*/.Demo.login()),format.raw/*134.41*/("""">I remembered my password!</a>
										</div>
									</section>

								</fieldset>
								<footer>
									<button type="submit" class="btn btn-primary">
										<i class="fa fa-refresh"></i> Reset Password
									</button>
								</footer>
							</form>

						</div>
						
						<h5 class="text-center"> - Or sign in using -</h5>
															
										<ul class="list-inline text-center">
											<li>
												<a href="javascript:void(0);" class="btn btn-primary btn-circle"><i class="fa fa-facebook"></i></a>
											</li>
											<li>
												<a href="javascript:void(0);" class="btn btn-info btn-circle"><i class="fa fa-twitter"></i></a>
											</li>
											<li>
												<a href="javascript:void(0);" class="btn btn-warning btn-circle"><i class="fa fa-linkedin"></i></a>
											</li>
										</ul>
						
					</div>
				</div>
			</div>

		</div>

		<!--================================================== -->	

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script src=""""),_display_(/*171.17*/routes/*171.23*/.Assets.at("javascripts/plugin/pace/pace.min.js")),format.raw/*171.72*/(""""></script>

	    <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js")"></script>
		<script>
            if (!window.jQuery) """),format.raw/*176.33*/("""{"""),format.raw/*176.34*/("""
                """),format.raw/*177.17*/("""document.write('<script src="js/libs/jquery-2.0.2.min.js"><\/script>');
            """),format.raw/*178.13*/("""}"""),format.raw/*178.14*/("""
        """),format.raw/*179.9*/("""</script>

	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js")"></script>
		<script> if (!window.jQuery.ui) """),format.raw/*182.35*/("""{"""),format.raw/*182.36*/(""" """),format.raw/*182.37*/("""document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');"""),format.raw/*182.112*/("""}"""),format.raw/*182.113*/(""" """),format.raw/*182.114*/("""</script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src=""""),_display_(/*185.17*/routes/*185.23*/.Assets.at("javascripts/app.config.js")),format.raw/*185.62*/(""""></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events 		
		<script src=""""),_display_(/*188.17*/routes/*188.23*/.Assets.at("javascripts/jquery-touch/jquery.ui.touch-punch.min.js")),format.raw/*188.90*/(""""></script> -->

		<!-- BOOTSTRAP JS -->		
		<script src=""""),_display_(/*191.17*/routes/*191.23*/.Assets.at("javascripts/bootstrap/bootstrap.min.js")),format.raw/*191.75*/(""""></script>

		<!-- JQUERY VALIDATE -->
		<script src=""""),_display_(/*194.17*/routes/*194.23*/.Assets.at("javascripts/register/jquery.validate.min.js")),format.raw/*194.80*/(""""></script>
		
		<!-- JQUERY MASKED INPUT -->
		<script src=""""),_display_(/*197.17*/routes/*197.23*/.Assets.at("javascripts/register/jquery.maskedinput.min.js")),format.raw/*197.83*/(""""></script>
		
		<!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

		<!-- MAIN APP JS FILE -->
		<script src=""""),_display_(/*206.17*/routes/*206.23*/.Assets.at("javascripts/app.js")),format.raw/*206.55*/(""""></script>
	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/forgotpassword.scala.html
                  HASH: db044c9d347c4fcfbd18eec1a2ee4c2d9c33ca03
                  MATRIX: 594->0|1040->419|1055->425|1120->468|1214->535|1229->541|1293->583|1494->757|1509->763|1582->814|1676->881|1691->887|1759->933|1958->1105|1973->1111|2043->1159|2318->1407|2333->1413|2395->1453|2600->1631|2615->1637|2675->1675|2765->1738|2780->1744|2841->1784|2918->1834|2933->1840|2994->1880|3479->2338|3494->2344|3566->2395|3649->2451|3664->2457|3733->2504|3818->2562|3833->2568|3911->2624|3996->2682|4011->2688|4087->2742|4436->3064|4451->3070|4519->3116|4701->3271|4716->3277|4782->3322|4963->3476|4978->3482|5037->3520|5379->3835|5394->3841|5444->3870|5648->4046|5664->4052|5702->4068|6547->4886|6562->4892|6618->4927|7535->5816|7551->5822|7586->5835|8702->6923|8718->6929|8753->6942|9919->8080|9935->8086|10006->8135|10259->8359|10289->8360|10336->8378|10450->8463|10480->8464|10518->8474|10691->8618|10721->8619|10751->8620|10856->8695|10887->8696|10918->8697|11009->8760|11025->8766|11086->8805|11223->8914|11239->8920|11328->8987|11418->9049|11434->9055|11508->9107|11595->9166|11611->9172|11690->9229|11783->9294|11799->9300|11881->9360|12125->9576|12141->9582|12195->9614
                  LINES: 22->1|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16|37->16|38->17|38->17|38->17|42->21|42->21|42->21|46->25|46->25|46->25|49->28|49->28|49->28|52->31|52->31|52->31|53->32|53->32|53->32|61->40|61->40|61->40|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|71->50|71->50|71->50|72->51|72->51|72->51|73->52|73->52|73->52|83->62|83->62|83->62|88->67|88->67|88->67|110->89|110->89|110->89|132->111|132->111|132->111|155->134|155->134|155->134|192->171|192->171|192->171|197->176|197->176|198->177|199->178|199->178|200->179|203->182|203->182|203->182|203->182|203->182|203->182|206->185|206->185|206->185|209->188|209->188|209->188|212->191|212->191|212->191|215->194|215->194|215->194|218->197|218->197|218->197|227->206|227->206|227->206
                  -- GENERATED --
              */
          