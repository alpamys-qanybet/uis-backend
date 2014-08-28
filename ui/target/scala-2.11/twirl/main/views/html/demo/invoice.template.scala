
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
object invoice extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><link href="css/invoice.min.css" rel="stylesheet">

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well jarviswidget-color-darken" id="wid-id-0" data-widget-sortable="false" data-widget-deletebutton="false" data-widget-editbutton="false" data-widget-colorbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-barcode"></i> </span>
                            <h2>Item #44761 </h2>

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

                                <div class="widget-body-toolbar">

                                    <div class="row">

                                        <div class="col-sm-4">

                                            <div class="input-group">
                                                <input class="form-control" type="text" placeholder="Type invoice number or date...">
                                                <div class="input-group-btn">
                                                    <button class="btn btn-default" type="button">
                                                        <i class="fa fa-search"></i> Search
                                                    </button>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-sm-8 text-align-right">

                                            <div class="btn-group">
                                                <a href="javascript:void(0)" class="btn btn-sm btn-primary"> <i class="fa fa-edit"></i> Edit </a>
                                            </div>

                                            <div class="btn-group">
                                                <a href="javascript:void(0)" class="btn btn-sm btn-success"> <i class="fa fa-plus"></i> Create New </a>
                                            </div>

                                        </div>

                                    </div>

                                </div>

                                <div class="padding-10">
                                    <br>
                                    <div class="pull-left">
                                        <img src="img/logo-blacknwhite.png" width="150" height="32" alt="invoice icon">

                                        <address>
                                            <br>
                                            <strong>SmartAdmin, Inc.</strong>
                                            <br>
                                            231 Ajax Rd,
                                            <br>
                                            Detroit MI - 48212, USA
                                            <br>
                                            <abbr title="Phone">P:</abbr> (123) 456-7890
                                        </address>
                                    </div>
                                    <div class="pull-right">
                                        <h1 class="font-400">invoice</h1>
                                    </div>
                                    <div class="clearfix"></div>
                                    <br>
                                    <br>
                                    <div class="row">
                                        <div class="col-sm-9">
                                            <h4 class="semi-bold">Rogers, Inc.</h4>
                                            <address>
                                                <strong>Mr. Simon Hedger</strong>
                                                <br>
                                                342 Mirlington Road,
                                                <br>
                                                Calfornia, CA 431464
                                                <br>
                                                <abbr title="Phone">P:</abbr> (467) 143-4317
                                            </address>
                                        </div>
                                        <div class="col-sm-3">
                                            <div>
                                                <div>
                                                    <strong>INVOICE NO :</strong>
                                                    <span class="pull-right"> #AA-454-4113-00 </span>
                                                </div>

                                            </div>
                                            <div>
                                                <div class="font-md">
                                                    <strong>INVOICE DATE :</strong>
                                                    <span class="pull-right"> <i class="fa fa-calendar"></i> 15/02/13 </span>
                                                </div>

                                            </div>
                                            <br>
                                            <div class="well well-sm  bg-color-darken txt-color-white no-border">
                                                <div class="fa-lg">
                                                    Total Due :
                                                    <span class="pull-right"> 4,972 USD** </span>
                                                </div>

                                            </div>
                                            <br>
                                            <br>
                                        </div>
                                    </div>
                                    <table class="table table-hover">
                                        <thead>
                                            <tr>
                                                <th class="text-center">QTY</th>
                                                <th>ITEM</th>
                                                <th>DESCRIPTION</th>
                                                <th>PRICE</th>
                                                <th>SUBTOTAL</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td class="text-center"><strong>1</strong></td>
                                                <td><a href="javascript:void(0);">Print and Web Logo Design</a></td>
                                                <td>Perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium totam rem aperiam xplicabo.</td>
                                                <td>$1,300.00</td>

                                                <td>$1,300.00</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center"><strong>1</strong></td>
                                                <td><a href="javascript:void(0);">SEO Management</a></td>
                                                <td>Sit voluptatem accusantium doloremque laudantium inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</td>
                                                <td>$1,400.00</td>
                                                <td>$1,400.00</td>
                                            </tr>
                                            <tr>
                                                <td class="text-center"><strong>1</strong></td>
                                                <td><a href="javascript:void(0);">Backend Support and Upgrade</a></td>
                                                <td>Inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</td>
                                                <td>$1,700.00</td>
                                                <td>$1,700.00</td>
                                            </tr>
                                            <tr>
                                                <td colspan="4">Total</td>
                                                <td><strong>$4,400.00</strong></td>
                                            </tr>
                                            <tr>
                                                <td colspan="4">HST/GST</td>
                                                <td><strong>13%</strong></td>
                                            </tr>
                                        </tbody>
                                    </table>

                                    <div class="invoice-footer">

                                        <div class="row">

                                            <div class="col-sm-7">
                                                <div class="payment-methods">
                                                    <h5>Payment Methods</h5>
                                                    <img src="img/invoice/paypal.png" width="64" height="64" alt="paypal">
                                                    <img src="img/invoice/americanexpress.png" width="64" height="64" alt="american express">
                                                    <img src="img/invoice/mastercard.png" width="64" height="64" alt="mastercard">
                                                    <img src="img/invoice/visa.png" width="64" height="64" alt="visa">
                                                </div>
                                            </div>
                                            <div class="col-sm-5">
                                                <div class="invoice-sum-total pull-right">
                                                    <h3><strong>Total: <span class="text-success">$4,972 USD</span></strong></h3>
                                                </div>
                                            </div>

                                        </div>

                                        <div class="row">
                                            <div class="col-sm-12">
                                                <p class="note">**To avoid any excess penalty charges, please make payments within 30 days of the due date. There will be a 2% interest charge per month on all late invoices.</p>
                                            </div>
                                        </div>

                                    </div>
                                </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*248.45*/("""{"""),format.raw/*248.46*/(""" """),format.raw/*248.47*/("""trigger: "hover" """),format.raw/*248.64*/("""}"""),format.raw/*248.65*/(""");
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

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*273.39*/("""{"""),format.raw/*273.40*/("""

        """),format.raw/*275.9*/("""}"""),format.raw/*275.10*/(""";

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/invoice.scala.html
                  HASH: 3e6cc2405a74a5afac9334b036dd71f3954ae39e
                  MATRIX: 512->1|617->18|645->21|666->34|705->36|736->41|13707->12983|13737->12984|13767->12985|13813->13002|13843->13003|14470->13601|14500->13602|14538->13612|14568->13613
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|269->248|269->248|269->248|269->248|269->248|294->273|294->273|296->275|296->275
                  -- GENERATED --
              */
          