
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en-us" id="extr-page" data-ember-extension="1"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title> SmartAdmin</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- #CSS Links -->
        <!-- Basic Styles -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.66*/routes/*11.72*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*11.115*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.66*/routes/*12.72*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*12.114*/("""">

        <!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.66*/routes/*15.72*/.Assets.at("stylesheets/smartadmin-production.css")),format.raw/*15.123*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.66*/routes/*16.72*/.Assets.at("stylesheets/smartadmin-skins.css")),format.raw/*16.118*/("""">

        <!-- SmartAdmin RTL Support is under construction
			 This RTL CSS will be released in version 1.5
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> -->

        <!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

        <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*27.66*/routes/*27.72*/.Assets.at("stylesheets/demo.min.css")),format.raw/*27.110*/("""">

        <!-- #FAVICONS -->
    <link rel="shortcut icon" href=""""),_display_(/*30.38*/routes/*30.44*/.Assets.at("images/favicon/favicon.ico")),format.raw/*30.84*/("""" type="image/x-icon">
    <link rel="icon" href=""""),_display_(/*31.29*/routes/*31.35*/.Assets.at("images/favicon/favicon.ico")),format.raw/*31.75*/("""" type="image/x-icon">

        <!-- #GOOGLE FONT -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

        <!-- #APP SCREEN / ICONS -->
        <!-- Specifying a Webpage Icon for Web Clip
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
    <link rel="apple-touch-icon" href=""""),_display_(/*39.41*/routes/*39.47*/.Assets.at("images/splash/sptouch-icon-iphone.png")),format.raw/*39.98*/("""">
    <link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(/*40.55*/routes/*40.61*/.Assets.at("images/splash/touch-icon-ipad.png")),format.raw/*40.108*/("""">
    <link rel="apple-touch-icon" sizes="120x120" href=""""),_display_(/*41.57*/routes/*41.63*/.Assets.at("images/splash/touch-icon-iphone-retina.png")),format.raw/*41.119*/("""">
    <link rel="apple-touch-icon" sizes="152x152" href=""""),_display_(/*42.57*/routes/*42.63*/.Assets.at("images/splash/splash/touch-icon-ipad-retina.png")),format.raw/*42.124*/("""">

        <!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

        <!-- Startup image for web apps -->
    <link rel="apple-touch-startup-image" href=""""),_display_(/*49.50*/routes/*49.56*/.Assets.at("images/splash/ipad-landscape.png")),format.raw/*49.102*/("""" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
    <link rel="apple-touch-startup-image" href=""""),_display_(/*50.50*/routes/*50.56*/.Assets.at("images/splash/ipad-portrait.png")),format.raw/*50.101*/("""" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
    <link rel="apple-touch-startup-image" href=""""),_display_(/*51.50*/routes/*51.56*/.Assets.at("images/splash/iphone.png")),format.raw/*51.94*/("""" media="screen and (max-device-width: 320px)">

    <style type="text/css"></style>
</head>

    <body class="animated fadeInDown  desktop-detected pace-done" style=""><div class="pace  pace-inactive"><div class="pace-progress" data-progress-text="100%" data-progress="99" style="width:100%;">
        <div class="pace-progress-inner"></div>
    </div>
        <div class="pace-activity"></div>
    </div>

        <header id="header">

            <div id="logo-group">
                <span id="logo"> <img src=""""),_display_(/*65.45*/routes/*65.51*/.Assets.at("images/logo.png")),format.raw/*65.80*/("""" alt="SmartAdmin"> </span>
            </div>

            <span id="extr-page-header-space"> <span class="hidden-mobile">Need an account?</span>
                <a href=""""),_display_(/*69.27*/routes/*69.33*/.Demo.register()),format.raw/*69.49*/("""" class="btn btn-danger">Create account</a>
            </span>

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

                            <img src=""""),_display_(/*92.40*/routes/*92.46*/.Assets.at("images/iphoneview.png")),format.raw/*92.81*/("""" class="pull-right display-image" alt="" style="width:210px;">

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
                            <form action=""""),_display_(/*114.44*/routes/*114.50*/.Demo.login()),format.raw/*114.63*/("""" id="login-form" class="smart-form client-form" novalidate="novalidate">
                                <header>
									Sign In
                                </header>

                                <fieldset>

                                    <section>
                                        <label class="label">E-mail</label>
                                        <label class="input"> <i class="icon-append fa fa-user"></i>
                                            <input type="email" name="email">
                                            <b class="tooltip tooltip-top-right"><i class="fa fa-user txt-color-teal"></i>
                                                Please enter email address/username</b></label>
                                    </section>

                                    <section>
                                        <label class="label">Password</label>
                                        <label class="input"> <i class="icon-append fa fa-lock"></i>
                                            <input type="password" name="password">
                                            <b class="tooltip tooltip-top-right"><i class="fa fa-lock txt-color-teal"></i>
                                                Enter your password</b> </label>
                                        <div class="note">
                                            <a href=""""),_display_(/*136.55*/routes/*136.61*/.Demo.forgotpassword()),format.raw/*136.83*/("""">Forgot password?</a>
                                        </div>
                                    </section>

                                    <section>
                                        <label class="checkbox">
                                            <input type="checkbox" name="remember" checked="">
                                            <i></i>Stay signed in</label>
                                    </section>
                                </fieldset>
                                <footer>
                                    <button type="submit" class="btn btn-primary">
										Sign in
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
        <script type="text/javascript" async="" src=""""),_display_(/*178.55*/routes/*178.61*/.Assets.at("javascripts/ga.js")),format.raw/*178.92*/("""">
        </script> <script src=""""),_display_(/*179.33*/routes/*179.39*/.Assets.at("javascripts/login/pace.min.js")),format.raw/*179.82*/(""""></script>

            <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
        <script src=""""),_display_(/*182.23*/routes/*182.29*/.Assets.at("javascripts/login/jquery.min.js")),format.raw/*182.74*/(""""></script>
        <script> if ( ! window.jQuery ) """),format.raw/*183.41*/("""{"""),format.raw/*183.42*/(""" """),format.raw/*183.43*/("""document.write ( '<script src="js/libs/jquery-2.0.2.min.js"><\/script>' ) ; """),format.raw/*183.119*/("""}"""),format.raw/*183.120*/(""" """),format.raw/*183.121*/("""</script>

        <script src=""""),_display_(/*185.23*/routes/*185.29*/.Assets.at("javascripts/login/jquery-ui.min.js")),format.raw/*185.77*/(""""></script>
        <script> if ( ! window.jQuery.ui ) """),format.raw/*186.44*/("""{"""),format.raw/*186.45*/(""" """),format.raw/*186.46*/("""document.write ( '<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>' ) ; """),format.raw/*186.126*/("""}"""),format.raw/*186.127*/(""" """),format.raw/*186.128*/("""</script>

            <!-- IMPORTANT: APP CONFIG -->
        <script src=""""),_display_(/*189.23*/routes/*189.29*/.Assets.at("javascripts/login/app.config.js")),format.raw/*189.74*/(""""></script>

            <!-- JS TOUCH : include this plugin for mobile drag / drop touch events
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

            <!-- BOOTSTRAP JS -->
        <script src=""""),_display_(/*195.23*/routes/*195.29*/.Assets.at("javascripts/login/bootstrap.min.js")),format.raw/*195.77*/(""""></script>

            <!-- JQUERY VALIDATE -->
        <script src=""""),_display_(/*198.23*/routes/*198.29*/.Assets.at("javascripts/login/jquery.validate.min.js")),format.raw/*198.83*/(""""></script>

            <!-- JQUERY MASKED INPUT -->
        <script src=""""),_display_(/*201.23*/routes/*201.29*/.Assets.at("javascripts/login/jquery.maskedinput.min.js")),format.raw/*201.86*/(""""></script>

            <!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

            <!-- MAIN APP JS FILE -->
        <script src=""""),_display_(/*210.23*/routes/*210.29*/.Assets.at("javascripts/login/app.min.js")),format.raw/*210.71*/(""""></script>

        <script type="text/javascript">
        runAllForms ( ) ;

        $ ( function ( ) """),format.raw/*215.26*/("""{"""),format.raw/*215.27*/("""
        """),format.raw/*216.9*/("""// Validation
        $ ( "#login-form" ).validate ( """),format.raw/*217.40*/("""{"""),format.raw/*217.41*/("""
        """),format.raw/*218.9*/("""// Rules for form validation
        rules : """),format.raw/*219.17*/("""{"""),format.raw/*219.18*/("""
        """),format.raw/*220.9*/("""email : """),format.raw/*220.17*/("""{"""),format.raw/*220.18*/("""
        """),format.raw/*221.9*/("""required : true,
        email : true
        """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/(""",
        password : """),format.raw/*224.20*/("""{"""),format.raw/*224.21*/("""
        """),format.raw/*225.9*/("""required : true,
        minlength : 3,
        maxlength : 20
        """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/("""
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/(""",

        // Messages for form validation
        messages : """),format.raw/*232.20*/("""{"""),format.raw/*232.21*/("""
        """),format.raw/*233.9*/("""email : """),format.raw/*233.17*/("""{"""),format.raw/*233.18*/("""
        """),format.raw/*234.9*/("""required : 'Please enter your email address',
        email : 'Please enter a VALID email address'
        """),format.raw/*236.9*/("""}"""),format.raw/*236.10*/(""",
        password : """),format.raw/*237.20*/("""{"""),format.raw/*237.21*/("""
        """),format.raw/*238.9*/("""required : 'Please enter your password'
        """),format.raw/*239.9*/("""}"""),format.raw/*239.10*/("""
        """),format.raw/*240.9*/("""}"""),format.raw/*240.10*/(""",

        // Do not change code below
        errorPlacement : function ( error, element ) """),format.raw/*243.54*/("""{"""),format.raw/*243.55*/("""
        """),format.raw/*244.9*/("""error.insertAfter ( element.parent ( ) ) ;
        """),format.raw/*245.9*/("""}"""),format.raw/*245.10*/("""
        """),format.raw/*246.9*/("""}"""),format.raw/*246.10*/(""" """),format.raw/*246.11*/(""") ;
        """),format.raw/*247.9*/("""}"""),format.raw/*247.10*/(""" """),format.raw/*247.11*/(""") ;
        </script>
    </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:48 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/login.scala.html
                  HASH: 0af3095e3778931581a73d53a0b2ae285f0d244c
                  MATRIX: 585->0|1132->520|1147->526|1212->569|1307->637|1322->643|1386->685|1592->864|1607->870|1680->921|1775->989|1790->995|1858->1041|2534->1690|2549->1696|2609->1734|2704->1802|2719->1808|2780->1848|2858->1899|2873->1905|2934->1945|3432->2416|3447->2422|3519->2473|3603->2530|3618->2536|3687->2583|3773->2642|3788->2648|3866->2704|3952->2763|3967->2769|4050->2830|4406->3159|4421->3165|4489->3211|4672->3367|4687->3373|4754->3418|4936->3573|4951->3579|5010->3617|5553->4133|5568->4139|5618->4168|5818->4341|5833->4347|5870->4363|6985->5451|7000->5457|7056->5492|8303->6711|8319->6717|8354->6730|9795->8143|9811->8149|9855->8171|11767->10055|11783->10061|11836->10092|11899->10127|11915->10133|11980->10176|12123->10291|12139->10297|12206->10342|12287->10394|12317->10395|12347->10396|12453->10472|12484->10473|12515->10474|12576->10507|12592->10513|12662->10561|12746->10616|12776->10617|12806->10618|12916->10698|12947->10699|12978->10700|13082->10776|13098->10782|13165->10827|13429->11063|13445->11069|13515->11117|13615->11189|13631->11195|13707->11249|13811->11325|13827->11331|13906->11388|14165->11619|14181->11625|14245->11667|14379->11772|14409->11773|14446->11782|14528->11835|14558->11836|14595->11845|14669->11890|14699->11891|14736->11900|14773->11908|14803->11909|14840->11918|14914->11964|14944->11965|14994->11986|15024->11987|15061->11996|15160->12067|15190->12068|15227->12077|15257->12078|15348->12140|15378->12141|15415->12150|15452->12158|15482->12159|15519->12168|15654->12275|15684->12276|15734->12297|15764->12298|15801->12307|15877->12355|15907->12356|15944->12365|15974->12366|16095->12458|16125->12459|16162->12468|16241->12519|16271->12520|16308->12529|16338->12530|16368->12531|16408->12543|16438->12544|16468->12545
                  LINES: 22->1|32->11|32->11|32->11|33->12|33->12|33->12|36->15|36->15|36->15|37->16|37->16|37->16|48->27|48->27|48->27|51->30|51->30|51->30|52->31|52->31|52->31|60->39|60->39|60->39|61->40|61->40|61->40|62->41|62->41|62->41|63->42|63->42|63->42|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|86->65|86->65|86->65|90->69|90->69|90->69|113->92|113->92|113->92|135->114|135->114|135->114|157->136|157->136|157->136|199->178|199->178|199->178|200->179|200->179|200->179|203->182|203->182|203->182|204->183|204->183|204->183|204->183|204->183|204->183|206->185|206->185|206->185|207->186|207->186|207->186|207->186|207->186|207->186|210->189|210->189|210->189|216->195|216->195|216->195|219->198|219->198|219->198|222->201|222->201|222->201|231->210|231->210|231->210|236->215|236->215|237->216|238->217|238->217|239->218|240->219|240->219|241->220|241->220|241->220|242->221|244->223|244->223|245->224|245->224|246->225|249->228|249->228|250->229|250->229|253->232|253->232|254->233|254->233|254->233|255->234|257->236|257->236|258->237|258->237|259->238|260->239|260->239|261->240|261->240|264->243|264->243|265->244|266->245|266->245|267->246|267->246|267->246|268->247|268->247|268->247
                  -- GENERATED --
              */
          