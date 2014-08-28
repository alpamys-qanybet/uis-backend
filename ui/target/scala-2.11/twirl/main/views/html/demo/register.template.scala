
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
object register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<!-- saved from url=(0079)http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/register.html -->
<html lang="en-us" id="extr-page" data-ember-extension="1"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title> SmartAdmin (AJAX)</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- #CSS Links -->
        <!-- Basic Styles -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.66*/routes/*12.72*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*12.115*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.66*/routes/*13.72*/.Assets.at("stylesheets/font-awesome.css")),format.raw/*13.114*/("""">

        <!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*16.66*/routes/*16.72*/.Assets.at("stylesheets/smartadmin-production.css")),format.raw/*16.123*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*17.66*/routes/*17.72*/.Assets.at("stylesheets/smartadmin-skins.css")),format.raw/*17.118*/("""">

        <!-- SmartAdmin RTL Support is under construction
			 This RTL CSS will be released in version 1.5
		<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-rtl.min.css"> -->

        <!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

        <!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*28.66*/routes/*28.72*/.Assets.at("stylesheets/demo.min.css")),format.raw/*28.110*/("""">

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

    <style type="text/css"></style>
</head>
    <body id="login" class=" desktop-detected pace-done" style="">
        <div class="pace  pace-inactive"><div class="pace-progress" data-progress-text="100%" data-progress="99" style="width : 100 % ;">
            <div class="pace-progress-inner"></div>
        </div>
            <div class="pace-activity"></div>
        </div>
            <!-- possible classes: minified, no-right-panel, fixed-ribbon, fixed-header, fixed-width-->
        <header id="header">
                <!--<span id="logo"></span>-->

            <div id="logo-group">
                <span id="logo"> <img src=""""),_display_(/*67.45*/routes/*67.51*/.Assets.at("images/logo.png")),format.raw/*67.80*/("""" alt="SmartAdmin"> </span>

                    <!-- END AJAX-DROPDOWN -->
            </div>

            <span id="extr-page-header-space"> <span class="hidden-mobile">Already registered?</span> <a href=""""),_display_(/*72.113*/routes/*72.119*/.Demo.login()),format.raw/*72.132*/("""" class="btn btn-danger">Sign In</a> </span>

        </header>

        <div id="main" role="main">

                <!-- MAIN CONTENT -->
            <div id="content" class="container">

                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7 hidden-xs hidden-sm">
                        <h1 class="txt-color-red login-header-big">SmartAdmin</h1>
                        <div class="hero">

                            <div class="pull-left login-desc-box-l">
                                <h4 class="paragraph-header">It's Okay to be Smart. Experience the simplicity of SmartAdmin, everywhere you go!</h4>
                                <div class="login-app-icons">
                                    <a href="javascript:void(0);" class="btn btn-danger btn-sm">Frontend Template</a>
                                    <a href="javascript:void(0);" class="btn btn-danger btn-sm">Find out more</a>
                                </div>
                            </div>

                            <img src=""""),_display_(/*94.40*/routes/*94.46*/.Assets.at("images/iphoneview.png")),format.raw/*94.81*/("""" alt="" class="pull-right display-image" style="width:210px;">

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
                    <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
                        <div class="well no-padding">

                            <form action="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/php/demo-register.php" id="smart-form-register" class="smart-form client-form" novalidate="novalidate">
                                <header>
									Registration is FREE*
                                </header>

                                <fieldset>
                                    <section>
                                        <label class="input"> <i class="icon-append fa fa-user"></i>
                                            <input type="text" name="username" placeholder="Username">
                                            <b class="tooltip tooltip-bottom-right">Needed to enter the website</b> </label>
                                    </section>

                                    <section>
                                        <label class="input"> <i class="icon-append fa fa-envelope"></i>
                                            <input type="email" name="email" placeholder="Email address">
                                            <b class="tooltip tooltip-bottom-right">Needed to verify your account</b> </label>
                                    </section>

                                    <section>
                                        <label class="input"> <i class="icon-append fa fa-lock"></i>
                                            <input type="password" name="password" placeholder="Password" id="password">
                                            <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                                    </section>

                                    <section>
                                        <label class="input"> <i class="icon-append fa fa-lock"></i>
                                            <input type="password" name="passwordConfirm" placeholder="Confirm password">
                                            <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                                    </section>
                                </fieldset>

                                <fieldset>
                                    <div class="row">
                                        <section class="col col-6">
                                            <label class="input">
                                                <input type="text" name="firstname" placeholder="First name">
                                            </label>
                                        </section>
                                        <section class="col col-6">
                                            <label class="input">
                                                <input type="text" name="lastname" placeholder="Last name">
                                            </label>
                                        </section>
                                    </div>

                                    <div class="row">
                                        <section class="col col-6">
                                            <label class="select">
                                                <select name="gender">
                                                    <option value="0" selected="" disabled="">Gender</option>
                                                    <option value="1">Male</option>
                                                    <option value="2">Female</option>
                                                    <option value="3">Prefer not to answer</option>
                                                </select> <i></i> </label>
                                        </section>
                                        <section class="col col-6">
                                            <label class="input"> <i class="icon-append fa fa-calendar"></i>
                                                <input type="text" name="request" placeholder="Request activation on" class="datepicker hasDatepicker" data-dateformat="dd/mm/yy" id="dp1408968389231">
                                            </label>
                                        </section>
                                    </div>

                                    <section>
                                        <label class="checkbox">
                                            <input type="checkbox" name="subscription" id="subscription">
                                            <i></i>I want to receive news and special offers</label>
                                        <label class="checkbox">
                                            <input type="checkbox" name="terms" id="terms">
                                            <i></i>
                                            I agree with the <a href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/register.html#" data-toggle="modal" data-target="#myModal"> Terms and Conditions </a></label>
                                    </section>
                                </fieldset>
                                <footer>
                                    <button type="submit" class="btn btn-primary">
										Register
                                    </button>
                                </footer>

                                <div class="message">
                                    <i class="fa fa-check"></i>
                                    <p>
										Thank you for your registration!
                                    </p>
                                </div>
                            </form>

                        </div>
                        <p class="note text-center">*FREE Registration ends on October 2015.</p>
                        <h5 class="text-center">- Or sign in using -</h5>
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

            <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							×
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Terms &amp; Conditions</h4>
                    </div>
                    <div class="modal-body custom-scroll terms-body">

                        <div id="left">

                            <h1>SMARTADMIN TERMS &amp; CONDITIONS TEMPLATE</h1>



                            <h2>Introduction</h2>

                            <p>These terms and conditions govern your use of this website; by using this website, you accept these terms and conditions in full.   If you disagree with these terms and conditions or any part of these terms and conditions, you must not use this website.</p>

                            <p>[You must be at least [18] years of age to use this website.  By using this website [and by agreeing to these terms and conditions] you warrant and represent that you are at least [18] years of age.]</p>


                            <h2>License to use website</h2>
                            <p>Unless otherwise stated, [NAME] and/or its licensors own the intellectual property rights in the website and material on the website.  Subject to the license below, all these intellectual property rights are reserved.</p>

                            <p>You may view, download for caching purposes only, and print pages [or [OTHER CONTENT]] from the website for your own personal use, subject to the restrictions set out below and elsewhere in these terms and conditions.</p>

                            <p>You must not:</p>
                            <ul>
                                <li>republish material from this website (including republication on another website);</li>
                                <li>sell, rent or sub-license material from the website;</li>
                                <li>show any material from the website in public;</li>
                                <li>reproduce, duplicate, copy or otherwise exploit material on this website for a commercial purpose;]</li>
                                <li>[edit or otherwise modify any material on the website; or]</li>
                                <li>[redistribute material from this website [except for content specifically and expressly made available for redistribution].]</li>
                            </ul>
                            <p>[Where content is specifically made available for redistribution, it may only be redistributed [within your organisation].]</p>

                            <h2>Acceptable use</h2>

                            <p>You must not use this website in any way that causes, or may cause, damage to the website or impairment of the availability or accessibility of the website; or in any way which is unlawful, illegal, fraudulent or harmful, or in connection with any unlawful, illegal, fraudulent or harmful purpose or activity.</p>

                            <p>You must not use this website to copy, store, host, transmit, send, use, publish or distribute any material which consists of (or is linked to) any spyware, computer virus, Trojan horse, worm, keystroke logger, rootkit or other malicious computer software.</p>

                            <p>You must not conduct any systematic or automated data collection activities (including without limitation scraping, data mining, data extraction and data harvesting) on or in relation to this website without [NAME'S] express written consent.</p>

                            <p>[You must not use this website to transmit or send unsolicited commercial communications.]</p>

                            <p>[You must not use this website for any purposes related to marketing without [NAME'S] express written consent.]</p>

                            <h2>[Restricted access</h2>

                            <p>[Access to certain areas of this website is restricted.]  [NAME] reserves the right to restrict access to [other] areas of this website, or indeed this entire website, at [NAME'S] discretion.</p>

                            <p>If [NAME] provides you with a user ID and password to enable you to access restricted areas of this website or other content or services, you must ensure that the user ID and password are kept confidential.</p>

                            <p>[[NAME] may disable your user ID and password in [NAME'S] sole discretion without notice or explanation.]</p>

                            <h2>[User content</h2>

                            <p>In these terms and conditions, “your user content” means material (including without limitation text, images, audio material, video material and audio-visual material) that you submit to this website, for whatever purpose.</p>

                            <p>You grant to [NAME] a worldwide, irrevocable, non-exclusive, royalty-free license to use, reproduce, adapt, publish, translate and distribute your user content in any existing or future media.  You also grant to [NAME] the right to sub-license these rights, and the right to bring an action for infringement of these rights.</p>

                            <p>Your user content must not be illegal or unlawful, must not infringe any third party's legal rights, and must not be capable of giving rise to legal action whether against you or [NAME] or a third party (in each case under any applicable law).</p>

                            <p>You must not submit any user content to the website that is or has ever been the subject of any threatened or actual legal proceedings or other similar complaint.</p>

                            <p>[NAME] reserves the right to edit or remove any material submitted to this website, or stored on [NAME'S] servers, or hosted or published upon this website.</p>

                            <p>[Notwithstanding [NAME'S] rights under these terms and conditions in relation to user content, [NAME] does not undertake to monitor the submission of such content to, or the publication of such content on, this website.]</p>

                            <h2>No warranties</h2>

                            <p>This website is provided “as is” without any representations or warranties, express or implied.  [NAME] makes no representations or warranties in relation to this website or the information and materials provided on this website.</p>

                            <p>Without prejudice to the generality of the foregoing paragraph, [NAME] does not warrant that:</p>
                            <ul>
                                <li>this website will be constantly available, or available at all; or</li>
                                <li>the information on this website is complete, true, accurate or non-misleading.</li>
                            </ul>
                            <p>Nothing on this website constitutes, or is meant to constitute, advice of any kind.  [If you require advice in relation to any [legal, financial or medical] matter you should consult an appropriate professional.]</p>

                            <h2>Limitations of liability</h2>

                            <p>[NAME] will not be liable to you (whether under the law of contact, the law of torts or otherwise) in relation to the contents of, or use of, or otherwise in connection with, this website:</p>
                            <ul>
                                <li>[to the extent that the website is provided free-of-charge, for any direct loss;]</li>
                                <li>for any indirect, special or consequential loss; or</li>
                                <li>for any business losses, loss of revenue, income, profits or anticipated savings, loss of contracts or business relationships, loss of reputation or goodwill, or loss or corruption of information or data.</li>
                            </ul>
                            <p>These limitations of liability apply even if [NAME] has been expressly advised of the potential loss.</p>

                            <h2>Exceptions</h2>

                            <p>Nothing in this website disclaimer will exclude or limit any warranty implied by law that it would be unlawful to exclude or limit; and nothing in this website disclaimer will exclude or limit [NAME'S] liability in respect of any:</p>
                            <ul>
                                <li>death or personal injury caused by [NAME'S] negligence;</li>
                                <li>fraud or fraudulent misrepresentation on the part of [NAME]; or</li>
                                <li>matter which it would be illegal or unlawful for [NAME] to exclude or limit, or to attempt or purport to exclude or limit, its liability.</li>
                            </ul>
                            <h2>Reasonableness</h2>

                            <p>By using this website, you agree that the exclusions and limitations of liability set out in this website disclaimer are reasonable.</p>

                            <p>If you do not think they are reasonable, you must not use this website.</p>

                            <h2>Other parties</h2>

                            <p>[You accept that, as a limited liability entity, [NAME] has an interest in limiting the personal liability of its officers and employees.  You agree that you will not bring any claim personally against [NAME'S] officers or employees in respect of any losses you suffer in connection with the website.]</p>

                            <p>[Without prejudice to the foregoing paragraph,] you agree that the limitations of warranties and liability set out in this website disclaimer will protect [NAME'S] officers, employees, agents, subsidiaries, successors, assigns and sub-contractors as well as [NAME].</p>

                            <h2>Unenforceable provisions</h2>

                            <p>If any provision of this website disclaimer is, or is found to be, unenforceable under applicable law, that will not affect the enforceability of the other provisions of this website disclaimer.</p>

                            <h2>Indemnity</h2>

                            <p>You hereby indemnify [NAME] and undertake to keep [NAME] indemnified against any losses, damages, costs, liabilities and expenses (including without limitation legal expenses and any amounts paid by [NAME] to a third party in settlement of a claim or dispute on the advice of [NAME'S] legal advisers) incurred or suffered by [NAME] arising out of any breach by you of any provision of these terms and conditions[, or arising out of any claim that you have breached any provision of these terms and conditions].</p>

                            <h2>Breaches of these terms and conditions</h2>

                            <p>Without prejudice to [NAME'S] other rights under these terms and conditions, if you breach these terms and conditions in any way, [NAME] may take such action as [NAME] deems appropriate to deal with the breach, including suspending your access to the website, prohibiting you from accessing the website, blocking computers using your IP address from accessing the website, contacting your internet service provider to request that they block your access to the website and/or bringing court proceedings against you.</p>

                            <h2>Variation</h2>

                            <p>[NAME] may revise these terms and conditions from time-to-time.  Revised terms and conditions will apply to the use of this website from the date of the publication of the revised terms and conditions on this website.  Please check this page regularly to ensure you are familiar with the current version.</p>

                            <h2>Assignment</h2>

                            <p>[NAME] may transfer, sub-contract or otherwise deal with [NAME'S] rig"""),
format.raw("""hts and/or obligations under these terms and conditions without notifying you or obtaining your consent.</p>

                            <p>You may not transfer, sub-contract or otherwise deal with your rights and/or obligations under these terms and conditions.</p>

                            <h2>Severability</h2>

                            <p>If a provision of these terms and conditions is determined by any court or other competent authority to be unlawful and/or unenforceable, the other provisions will continue in effect.  If any unlawful and/or unenforceable provision would be lawful or enforceable if part of it were deleted, that part will be deemed to be deleted, and the rest of the provision will continue in effect.</p>

                            <h2>Entire agreement</h2>

                            <p>These terms and conditions [, together with [DOCUMENTS],] constitute the entire agreement between you and [NAME] in relation to your use of this website, and supersede all previous agreements in respect of your use of this website.</p>

                            <h2>Law and jurisdiction</h2>

                            <p>These terms and conditions will be governed by and construed in accordance with [GOVERNING LAW], and any disputes relating to these terms and conditions will be subject to the [non-]exclusive jurisdiction of the courts of [JURISDICTION].</p>

                            <h2>About these website terms and conditions</h2> <p>We created these website terms and conditions with the help of a free website terms and conditions form developed by Contractology and available at <a href="http://www.smartadmin.com/">www.SmartAdmin.com</a>
                            .
                            Contractology supply a wide variety of commercial legal documents, such as <a href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/register.html#">template data protection statements</a>
                            .
</p>
                            <h2>[Registrations and authorisations</h2>

                            <p>[[NAME] is registered with [TRADE REGISTER].  You can find the online version of the register at [URL].  [NAME'S] registration number is [NUMBER].]</p>

                            <p>[[NAME] is subject to [AUTHORISATION SCHEME], which is supervised by [SUPERVISORY AUTHORITY].]</p>

                            <p>[[NAME] is registered with [PROFESSIONAL BODY].  [NAME'S] professional title is [TITLE] and it has been granted in [JURISDICTION].  [NAME] is subject to the [RULES] which can be found at [URL].]</p>

                            <p>[[NAME] subscribes to the following code[s] of conduct: [CODE(S) OF CONDUCT].  [These codes/this code] can be consulted electronically at [URL(S)].</p>

                            <p>[[NAME'S] [TAX] number is [NUMBER].]]</p>

                            <h2>[NAME'S] details</h2>

                            <p>The full name of [NAME] is [FULL NAME].</p>

                            <p>[[NAME] is registered in [JURISDICTION] under registration number [NUMBER].]</p>

                            <p>[NAME'S] [registered] address is [ADDRESS].</p>

                            <p>You can contact [NAME] by email to [EMAIL].</p>

                        </div>

                        <br> <br>

                        <p><strong>By using this  WEBSITE TERMS AND CONDITIONS template document, you agree to the
                            <a href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/register.html#">terms and conditions</a>
                            set out on
                            <a href="http://192.241.236.31/themes/preview/smartadmin/1.4.1/ajaxversion/register.html#">SmartAdmin.com</a>
                            .  You must retain the credit
                            set out in the section headed "ABOUT THESE WEBSITE TERMS AND CONDITIONS".  Subject to the licensing restrictions, you should
                            edit the document, adapting it to the requirements of your jurisdiction, your business and your
                            website.  If you are not a lawyer, we recommend that you take professional legal advice in relation to the editing and
                            use of the template. </strong>
                        </p>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">
							Cancel
                        </button>
                        <button type="button" class="btn btn-primary" id="i-agree">
                            <i class="fa fa-check"></i> I Agree
                        </button>

                        <button type="button" class="btn btn-danger pull-left" id="print">
                            <i class="fa fa-print"></i> Print
                        </button>
                    </div>
                </div> <!-- /.modal-content -->
            </div> <!-- /.modal-dialog -->
        </div> <!-- /.modal -->

        <!--================================================== -->

        <!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
        <script type="text/javascript" async="" src=""""),_display_(/*435.55*/routes/*435.61*/.Assets.at("javascripts/ga.js")),format.raw/*435.92*/(""""></script>

        <script src=""""),_display_(/*437.23*/routes/*437.29*/.Assets.at("javascripts/register/pace.min.js")),format.raw/*437.75*/(""""></script>

            <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
        <script src=""""),_display_(/*440.23*/routes/*440.29*/.Assets.at("javascripts/register/jquery.min.js")),format.raw/*440.77*/(""""></script>
        <script> if ( ! window.jQuery ) """),format.raw/*441.41*/("""{"""),format.raw/*441.42*/(""" """),format.raw/*441.43*/("""document.write ( '<script src="js/libs/jquery-2.0.2.min.js"><\/script>' ) ; """),format.raw/*441.119*/("""}"""),format.raw/*441.120*/(""" """),format.raw/*441.121*/("""</script>

        <script src=""""),_display_(/*443.23*/routes/*443.29*/.Assets.at("javascripts/register/jquery-ui.min.js")),format.raw/*443.80*/(""""></script>
        <script> if ( ! window.jQuery.ui ) """),format.raw/*444.44*/("""{"""),format.raw/*444.45*/(""" """),format.raw/*444.46*/("""document.write ( '<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>' ) ; """),format.raw/*444.126*/("""}"""),format.raw/*444.127*/(""" """),format.raw/*444.128*/("""</script>

            <!-- IMPORTANT: APP CONFIG -->
        <script src=""""),_display_(/*447.23*/routes/*447.29*/.Assets.at("javascripts/register/app.config.js")),format.raw/*447.77*/(""""></script>

            <!-- JS TOUCH : include this plugin for mobile drag / drop touch events
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

            <!-- BOOTSTRAP JS -->
        <script src=""""),_display_(/*453.23*/routes/*453.29*/.Assets.at("javascripts/register/bootstrap.min.js")),format.raw/*453.80*/(""""></script>

            <!-- JQUERY VALIDATE -->
        <script src=""""),_display_(/*456.23*/routes/*456.29*/.Assets.at("javascripts/register/jquery.validate.min.js")),format.raw/*456.86*/(""""></script>

            <!-- JQUERY MASKED INPUT -->
        <script src=""""),_display_(/*459.23*/routes/*459.29*/.Assets.at("javascripts/register/jquery.maskedinput.min.js")),format.raw/*459.89*/(""""></script>

            <!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

            <!-- MAIN APP JS FILE -->
        <script src=""""),_display_(/*468.23*/routes/*468.29*/.Assets.at("javascripts/register/app.min.js")),format.raw/*468.74*/(""""></script>

        <script type="text/javascript">
        runAllForms ( ) ;

        // Model i agree button
        $ ( "#i-agree" ).click ( function ( ) """),format.raw/*474.47*/("""{"""),format.raw/*474.48*/("""
        """),format.raw/*475.9*/("""$this = $ ( "#terms" ) ;
        if ( $this.checked ) """),format.raw/*476.30*/("""{"""),format.raw/*476.31*/("""
        """),format.raw/*477.9*/("""$ ( '#myModal' ).modal ( 'toggle' ) ;
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""" """),format.raw/*478.11*/("""else """),format.raw/*478.16*/("""{"""),format.raw/*478.17*/("""
        """),format.raw/*479.9*/("""$this.prop ( 'checked', true ) ;
        $ ( '#myModal' ).modal ( 'toggle' ) ;
        """),format.raw/*481.9*/("""}"""),format.raw/*481.10*/("""
        """),format.raw/*482.9*/("""}"""),format.raw/*482.10*/(""" """),format.raw/*482.11*/(""") ;

        // Validation
        $ ( function ( ) """),format.raw/*485.26*/("""{"""),format.raw/*485.27*/("""
        """),format.raw/*486.9*/("""// Validation
        $ ( "#smart-form-register" ).validate ( """),format.raw/*487.49*/("""{"""),format.raw/*487.50*/("""

        """),format.raw/*489.9*/("""// Rules for form validation
        rules : """),format.raw/*490.17*/("""{"""),format.raw/*490.18*/("""
        """),format.raw/*491.9*/("""username : """),format.raw/*491.20*/("""{"""),format.raw/*491.21*/("""
        """),format.raw/*492.9*/("""required : true
        """),format.raw/*493.9*/("""}"""),format.raw/*493.10*/(""",
        email : """),format.raw/*494.17*/("""{"""),format.raw/*494.18*/("""
        """),format.raw/*495.9*/("""required : true,
        email : true
        """),format.raw/*497.9*/("""}"""),format.raw/*497.10*/(""",
        password : """),format.raw/*498.20*/("""{"""),format.raw/*498.21*/("""
        """),format.raw/*499.9*/("""required : true,
        minlength : 3,
        maxlength : 20
        """),format.raw/*502.9*/("""}"""),format.raw/*502.10*/(""",
        passwordConfirm : """),format.raw/*503.27*/("""{"""),format.raw/*503.28*/("""
        """),format.raw/*504.9*/("""required : true,
        minlength : 3,
        maxlength : 20,
        equalTo : '#password'
        """),format.raw/*508.9*/("""}"""),format.raw/*508.10*/(""",
        firstname : """),format.raw/*509.21*/("""{"""),format.raw/*509.22*/("""
        """),format.raw/*510.9*/("""required : true
        """),format.raw/*511.9*/("""}"""),format.raw/*511.10*/(""",
        lastname : """),format.raw/*512.20*/("""{"""),format.raw/*512.21*/("""
        """),format.raw/*513.9*/("""required : true
        """),format.raw/*514.9*/("""}"""),format.raw/*514.10*/(""",
        gender : """),format.raw/*515.18*/("""{"""),format.raw/*515.19*/("""
        """),format.raw/*516.9*/("""required : true
        """),format.raw/*517.9*/("""}"""),format.raw/*517.10*/(""",
        terms : """),format.raw/*518.17*/("""{"""),format.raw/*518.18*/("""
        """),format.raw/*519.9*/("""required : true
        """),format.raw/*520.9*/("""}"""),format.raw/*520.10*/("""
        """),format.raw/*521.9*/("""}"""),format.raw/*521.10*/(""",

        // Messages for form validation
        messages : """),format.raw/*524.20*/("""{"""),format.raw/*524.21*/("""
        """),format.raw/*525.9*/("""login : """),format.raw/*525.17*/("""{"""),format.raw/*525.18*/("""
        """),format.raw/*526.9*/("""required : 'Please enter your login'
        """),format.raw/*527.9*/("""}"""),format.raw/*527.10*/(""",
        email : """),format.raw/*528.17*/("""{"""),format.raw/*528.18*/("""
        """),format.raw/*529.9*/("""required : 'Please enter your email address',
        email : 'Please enter a VALID email address'
        """),format.raw/*531.9*/("""}"""),format.raw/*531.10*/(""",
        password : """),format.raw/*532.20*/("""{"""),format.raw/*532.21*/("""
        """),format.raw/*533.9*/("""required : 'Please enter your password'
        """),format.raw/*534.9*/("""}"""),format.raw/*534.10*/(""",
        passwordConfirm : """),format.raw/*535.27*/("""{"""),format.raw/*535.28*/("""
        """),format.raw/*536.9*/("""required : 'Please enter your password one more time',
        equalTo : 'Please enter the same password as above'
        """),format.raw/*538.9*/("""}"""),format.raw/*538.10*/(""",
        firstname : """),format.raw/*539.21*/("""{"""),format.raw/*539.22*/("""
        """),format.raw/*540.9*/("""required : 'Please select your first name'
        """),format.raw/*541.9*/("""}"""),format.raw/*541.10*/(""",
        lastname : """),format.raw/*542.20*/("""{"""),format.raw/*542.21*/("""
        """),format.raw/*543.9*/("""required : 'Please select your last name'
        """),format.raw/*544.9*/("""}"""),format.raw/*544.10*/(""",
        gender : """),format.raw/*545.18*/("""{"""),format.raw/*545.19*/("""
        """),format.raw/*546.9*/("""required : 'Please select your gender'
        """),format.raw/*547.9*/("""}"""),format.raw/*547.10*/(""",
        terms : """),format.raw/*548.17*/("""{"""),format.raw/*548.18*/("""
        """),format.raw/*549.9*/("""required : 'You must agree with Terms and Conditions'
        """),format.raw/*550.9*/("""}"""),format.raw/*550.10*/("""
        """),format.raw/*551.9*/("""}"""),format.raw/*551.10*/(""",

        // Ajax form submition
        submitHandler : function ( form ) """),format.raw/*554.43*/("""{"""),format.raw/*554.44*/("""
        """),format.raw/*555.9*/("""$ ( form ).ajaxSubmit ( """),format.raw/*555.33*/("""{"""),format.raw/*555.34*/("""
        """),format.raw/*556.9*/("""success : function ( ) """),format.raw/*556.32*/("""{"""),format.raw/*556.33*/("""
        """),format.raw/*557.9*/("""$ ( "#smart-form-register" ).addClass ( 'submited' ) ;
        """),format.raw/*558.9*/("""}"""),format.raw/*558.10*/("""
        """),format.raw/*559.9*/("""}"""),format.raw/*559.10*/(""" """),format.raw/*559.11*/(""") ;
        """),format.raw/*560.9*/("""}"""),format.raw/*560.10*/(""",

        // Do not change code below
        errorPlacement : function ( error, element ) """),format.raw/*563.54*/("""{"""),format.raw/*563.55*/("""
        """),format.raw/*564.9*/("""error.insertAfter ( element.parent ( ) ) ;
        """),format.raw/*565.9*/("""}"""),format.raw/*565.10*/("""
        """),format.raw/*566.9*/("""}"""),format.raw/*566.10*/(""" """),format.raw/*566.11*/(""") ;

        """),format.raw/*568.9*/("""}"""),format.raw/*568.10*/(""" """),format.raw/*568.11*/(""") ;
        </script> <div id="ui-datepicker-div" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>
  </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:46 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/register.scala.html
                  HASH: 5a4d8fb750cf4df7c99ff71abddb3d4ed30d7f03
                  MATRIX: 588->0|1252->637|1267->643|1332->686|1427->754|1442->760|1506->802|1712->981|1727->987|1800->1038|1895->1106|1910->1112|1978->1158|2654->1807|2669->1813|2729->1851|5695->4790|5710->4796|5760->4825|5996->5033|6012->5039|6047->5052|7143->6121|7158->6127|7214->6162|32578->31478|32594->31484|32647->31515|32710->31550|32726->31556|32794->31602|32937->31717|32953->31723|33023->31771|33104->31823|33134->31824|33164->31825|33270->31901|33301->31902|33332->31903|33393->31936|33409->31942|33482->31993|33566->32048|33596->32049|33626->32050|33736->32130|33767->32131|33798->32132|33902->32208|33918->32214|33988->32262|34252->32498|34268->32504|34341->32555|34441->32627|34457->32633|34536->32690|34640->32766|34656->32772|34738->32832|34997->33063|35013->33069|35080->33114|35267->33272|35297->33273|35334->33282|35417->33336|35447->33337|35484->33346|35558->33392|35588->33393|35618->33394|35652->33399|35682->33400|35719->33409|35834->33496|35864->33497|35901->33506|35931->33507|35961->33508|36042->33560|36072->33561|36109->33570|36200->33632|36230->33633|36268->33643|36342->33688|36372->33689|36409->33698|36449->33709|36479->33710|36516->33719|36568->33743|36598->33744|36645->33762|36675->33763|36712->33772|36786->33818|36816->33819|36866->33840|36896->33841|36933->33850|37032->33921|37062->33922|37119->33950|37149->33951|37186->33960|37316->34062|37346->34063|37397->34085|37427->34086|37464->34095|37516->34119|37546->34120|37596->34141|37626->34142|37663->34151|37715->34175|37745->34176|37793->34195|37823->34196|37860->34205|37912->34229|37942->34230|37989->34248|38019->34249|38056->34258|38108->34282|38138->34283|38175->34292|38205->34293|38296->34355|38326->34356|38363->34365|38400->34373|38430->34374|38467->34383|38540->34428|38570->34429|38617->34447|38647->34448|38684->34457|38819->34564|38849->34565|38899->34586|38929->34587|38966->34596|39042->34644|39072->34645|39129->34673|39159->34674|39196->34683|39347->34806|39377->34807|39428->34829|39458->34830|39495->34839|39574->34890|39604->34891|39654->34912|39684->34913|39721->34922|39799->34972|39829->34973|39877->34992|39907->34993|39944->35002|40019->35049|40049->35050|40096->35068|40126->35069|40163->35078|40253->35140|40283->35141|40320->35150|40350->35151|40455->35227|40485->35228|40522->35237|40575->35261|40605->35262|40642->35271|40694->35294|40724->35295|40761->35304|40852->35367|40882->35368|40919->35377|40949->35378|40979->35379|41019->35391|41049->35392|41170->35484|41200->35485|41237->35494|41316->35545|41346->35546|41383->35555|41413->35556|41443->35557|41484->35570|41514->35571|41544->35572
                  LINES: 22->1|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16|37->16|38->17|38->17|38->17|49->28|49->28|49->28|88->67|88->67|88->67|93->72|93->72|93->72|115->94|115->94|115->94|457->435|457->435|457->435|459->437|459->437|459->437|462->440|462->440|462->440|463->441|463->441|463->441|463->441|463->441|463->441|465->443|465->443|465->443|466->444|466->444|466->444|466->444|466->444|466->444|469->447|469->447|469->447|475->453|475->453|475->453|478->456|478->456|478->456|481->459|481->459|481->459|490->468|490->468|490->468|496->474|496->474|497->475|498->476|498->476|499->477|500->478|500->478|500->478|500->478|500->478|501->479|503->481|503->481|504->482|504->482|504->482|507->485|507->485|508->486|509->487|509->487|511->489|512->490|512->490|513->491|513->491|513->491|514->492|515->493|515->493|516->494|516->494|517->495|519->497|519->497|520->498|520->498|521->499|524->502|524->502|525->503|525->503|526->504|530->508|530->508|531->509|531->509|532->510|533->511|533->511|534->512|534->512|535->513|536->514|536->514|537->515|537->515|538->516|539->517|539->517|540->518|540->518|541->519|542->520|542->520|543->521|543->521|546->524|546->524|547->525|547->525|547->525|548->526|549->527|549->527|550->528|550->528|551->529|553->531|553->531|554->532|554->532|555->533|556->534|556->534|557->535|557->535|558->536|560->538|560->538|561->539|561->539|562->540|563->541|563->541|564->542|564->542|565->543|566->544|566->544|567->545|567->545|568->546|569->547|569->547|570->548|570->548|571->549|572->550|572->550|573->551|573->551|576->554|576->554|577->555|577->555|577->555|578->556|578->556|578->556|579->557|580->558|580->558|581->559|581->559|581->559|582->560|582->560|585->563|585->563|586->564|587->565|587->565|588->566|588->566|588->566|590->568|590->568|590->568
                  -- GENERATED --
              */
          