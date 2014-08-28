
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
object pricing_table extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">

        <div class="col-sm-12">

            <div class="well well-light">

                <h1>Professional, <small>4 Plans</small></h1>
                <div class="row">

                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-success pricing-big">

                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Light version</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        <strong>FREE</strong></h1>
                                </div>
                                <div class="price-features">
                                    <ul class="list-unstyled text-left">
                                        <li><i class="fa fa-check text-success"></i> 2 years access <strong> to all storage locations</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> storage</li>
                                        <li><i class="fa fa-check text-success"></i> Limited <strong> download quota</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Cash on Delivery</strong></li>
                                        <li><i class="fa fa-check text-success"></i> All time <strong> updates</strong></li>
                                        <li><i class="fa fa-times text-danger"></i> <strong>Unlimited</strong> access to all files</li>
                                        <li><i class="fa fa-times text-danger"></i> <strong>Allowed</strong> to be exclusing per sale</li>
                                    </ul>
                                </div>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-primary btn-block" role="button">Download <span> now!</span></a>
                                <div>
                                    Or <a href="javascript:void(0);">Sign up</a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-teal pricing-big">

                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Personal Project</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $99<span class="subscript">/ mo</span></h1>
                                </div>
                                <div class="price-features">
                                    <ul class="list-unstyled text-left">
                                        <li><i class="fa fa-check text-success"></i> 2 years access <strong> to all storage locations</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> storage</li>
                                        <li><i class="fa fa-check text-success"></i> Superbig <strong> download quota</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Cash on Delivery</strong></li>
                                        <li><i class="fa fa-check text-success"></i> All time <strong> updates</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> access to all files</li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Allowed</strong> to be exclusing per sale</li>
                                    </ul>
                                </div>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-primary btn-block" role="button">Purchase <span>via Paypal</span></a>
                                <div>
                                    <a href="javascript:void(0);"><i>We accept all major credit cards</i></a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-primary pricing-big">
                            <img src="img/ribbon.png" class="ribbon">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Developer Bundle</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $350<span class="subscript">/ mo</span></h1>
                                </div>
                                <div class="price-features">
                                    <ul class="list-unstyled text-left">
                                        <li><i class="fa fa-check text-success"></i> 2 years access <strong> to all storage locations</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> storage</li>
                                        <li><i class="fa fa-check text-success"></i> Superbig <strong> download quota</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Cash on Delivery</strong></li>
                                        <li><i class="fa fa-check text-success"></i> All time <strong> updates</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> access to all files</li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Allowed</strong> to be exclusing per sale</li>
                                    </ul>
                                </div>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-primary btn-block" role="button">Purchase <span>via Paypal</span></a>
                                <div>
                                    <a href="javascript:void(0);"><i>We accept all major credit cards</i></a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-darken pricing-big">

                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Premium Package</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $999<span class="subscript">/ mo</span></h1>
                                </div>
                                <div class="price-features">
                                    <ul class="list-unstyled text-left">
                                        <li><i class="fa fa-check text-success"></i> Lifetime access <strong> to all storage locations</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> storage</li>
                                        <li><i class="fa fa-check text-success"></i> Superbig <strong> download quota</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Cash on Delivery</strong></li>
                                        <li><i class="fa fa-check text-success"></i> All time <strong> updates</strong></li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Unlimited</strong> access to all files</li>
                                        <li><i class="fa fa-check text-success"></i> <strong>Allowed</strong> to be exclusing per sale</li>
                                    </ul>
                                </div>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-primary btn-block" role="button">Purchase <span>via Paypal</span></a>
                                <div>
                                    <a href="javascript:void(0);"><i>We accept all major credit cards</i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <hr>

                <h1>Simple, <small>4 Plans</small></h1>
                <div class="row">

                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-darken">

                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Bronze</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $10<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            1 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                1 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                100K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                100MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-success" role="button">Sign Up</a>
                                1 month FREE trial</div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-primary">
                            <img src="img/ribbon.png" class="ribbon">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Silver</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $20<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            2 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                5 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                100K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                200MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-success" role="button">Sign Up</a>
                                1 month FREE trial</div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-greenLight">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Gold</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $35<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            5 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                20 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                300K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                500MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-success" role="button">Sign Up</a> 1 month FREE trial</div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading bg-color-blueDark txt-color-white">
                                <h3 class="panel-title">
                                    Diamond</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $99<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            Unlimited Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                3000K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                """),
format.raw("""                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer text-align-center">
                                <a href="javascript:void(0);" class="btn btn-success" role="button">Sign Up</a> 1 month FREE trial</div>
                        </div>
                    </div>

                </div>

                <hr>

                <h1>Simple, <small>6 Plans</small></h1>
                <div class="row">

                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-orange">

                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Bronze</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $10<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            1 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                1 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                100K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                100MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-orange txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-purple">
                            <img src="img/ribbon.png" class="ribbon">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Silver</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $20<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            2 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                5 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                100K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                200MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-purple txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-greenLight">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Gold</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $35<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            5 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                20 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                300K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                500MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-greenLight txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-blue">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Diamond</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $99<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            Unlimited Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                3000K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-blue txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-redLight">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Gold</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $35<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            5 Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                20 Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                300K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                500MB Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-redLight txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-12 col-sm-4 col-md-2">
                        <div class="panel panel-pink">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    Diamond</h3>
                            </div>
                            <div class="panel-body no-padding text-align-center">
                                <div class="the-price">
                                    <h1>
                                        $99<span class="subscript">/mo</span></h1>
                                    <small>1 month FREE trial</small>
                                </div>
                                <table class="table">
                                    <tbody><tr>
                                        <td>
                                            Unlimited Account
                                        </td>
                                    </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Project
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                3000K API Access
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Unlimited Storage
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Custom Cloud Services
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                Weekly Reports
                                            </td>
                                        </tr>
                                    </tbody></table>
                            </div>
                            <div class="panel-footer no-padding">
                                <a href="javascript:void(0);" class="btn bg-color-pink txt-color-white btn-block" role="button">Sign Up</a>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>

    </div>


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
         * $("[rel=popover-hover]").popover("""),format.raw/*684.45*/("""{"""),format.raw/*684.46*/(""" """),format.raw/*684.47*/("""trigger: "hover" """),format.raw/*684.64*/("""}"""),format.raw/*684.65*/(""");
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
         * var pagefunction = function() """),format.raw/*709.42*/("""{"""),format.raw/*709.43*/("""
         """),format.raw/*710.10*/("""*   ...
         * """),format.raw/*711.12*/("""}"""),format.raw/*711.13*/("""
         """),format.raw/*712.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*715.42*/("""{"""),format.raw/*715.43*/("""
         """),format.raw/*716.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*717.12*/("""}"""),format.raw/*717.13*/("""
         """),format.raw/*718.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */


        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*729.39*/("""{"""),format.raw/*729.40*/("""

        """),format.raw/*731.9*/("""}"""),format.raw/*731.10*/(""";

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
                  DATE: Thu Aug 28 21:08:48 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/pricing_table.scala.html
                  HASH: 725f35adeb384ecee79b2b2c4d3345a2d92e352c
                  MATRIX: 518->1|623->18|651->21|672->34|711->36|742->41|38040->37290|38070->37291|38100->37292|38146->37309|38176->37310|38865->37970|38895->37971|38934->37981|38982->38000|39012->38001|39051->38011|39219->38150|39249->38151|39288->38161|39378->38222|39408->38223|39447->38233|39671->38428|39701->38429|39739->38439|39769->38440
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|706->684|706->684|706->684|706->684|706->684|731->709|731->709|732->710|733->711|733->711|734->712|737->715|737->715|738->716|739->717|739->717|740->718|751->729|751->729|753->731|753->731
                  -- GENERATED --
              */
          