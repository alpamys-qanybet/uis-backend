
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
object inbox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*3.6*/scripts/*3.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        """),format.raw/*4.9*/("""<script>
        //Gets tooltips activated
        $ ( "#inbox-table [rel=tooltip]" ).tooltip ( ) ;

        $ ( "#inbox-table input[type='checkbox']" ).change ( function ( ) """),format.raw/*8.75*/("""{"""),format.raw/*8.76*/("""
        """),format.raw/*9.9*/("""$ ( this ).closest ( 'tr' ).toggleClass ( "highlight", this.checked ) ;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/(""" """),format.raw/*10.11*/(""") ;

        $ ( "#inbox-table .inbox-data-message" ).click ( function ( ) """),format.raw/*12.71*/("""{"""),format.raw/*12.72*/("""
        """),format.raw/*13.9*/("""$this = $ ( this ) ;
        getMail ( $this ) ;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/(""" """),format.raw/*15.11*/(""")
        $ ( "#inbox-table .inbox-data-from" ).click ( function ( ) """),format.raw/*16.68*/("""{"""),format.raw/*16.69*/("""
        """),format.raw/*17.9*/("""$this = $ ( this ) ;
        getMail ( $this ) ;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/(""" """),format.raw/*19.11*/(""")
        function getMail ( $this ) """),format.raw/*20.36*/("""{"""),format.raw/*20.37*/("""
        """),format.raw/*21.9*/("""//console.log($this.closest("tr").attr("id"));
//        loadURL ( "ajax/email-opened.html", $ ( '#inbox-content > .table-wrap' ) ) ;
            """),_display_(/*23.14*/demo/*23.18*/.tags.email_opened()),format.raw/*23.38*/("""
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""


        """),format.raw/*27.9*/("""$ ( '.inbox-table-icon input:checkbox' ).click ( function ( ) """),format.raw/*27.71*/("""{"""),format.raw/*27.72*/("""
        """),format.raw/*28.9*/("""enableDeleteButton ( ) ;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""" """),format.raw/*29.11*/(""")

        $ ( ".deletebutton" ).click ( function ( ) """),format.raw/*31.52*/("""{"""),format.raw/*31.53*/("""
        """),format.raw/*32.9*/("""$ ( '#inbox-table td input:checkbox:checked' ).parents ( "tr" ).rowslide ( ) ;
        //$(".inbox-checkbox-triggered").removeClass('visible');
        //$("#compose-mail").show();
        """),format.raw/*35.9*/("""}"""),format.raw/*35.10*/(""" """),format.raw/*35.11*/(""") ;

        function enableDeleteButton ( ) """),format.raw/*37.41*/("""{"""),format.raw/*37.42*/("""
        """),format.raw/*38.9*/("""var isChecked = $ ( '.inbox-table-icon input:checkbox' ).is ( ':checked' ) ;

        if ( isChecked ) """),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""
        """),format.raw/*41.9*/("""$ ( ".inbox-checkbox-triggered" ).addClass ( 'visible' ) ;
        //$("#compose-mail").hide();
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/(""" """),format.raw/*43.11*/("""else """),format.raw/*43.16*/("""{"""),format.raw/*43.17*/("""
        """),format.raw/*44.9*/("""$ ( ".inbox-checkbox-triggered" ).removeClass ( 'visible' ) ;
        //$("#compose-mail").show();
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""

        """),format.raw/*49.9*/("""</script>
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
         * $("[rel=popover-hover]").popover("""),format.raw/*62.45*/("""{"""),format.raw/*62.46*/(""" """),format.raw/*62.47*/("""trigger: "hover" """),format.raw/*62.64*/("""}"""),format.raw/*62.65*/(""");
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

        var pagefunction = function ( ) """),format.raw/*87.41*/("""{"""),format.raw/*87.42*/("""

        """),format.raw/*89.9*/("""// fix table height
        tableHeightSize ( ) ;

        $ ( window ).resize ( function ( ) """),format.raw/*92.44*/("""{"""),format.raw/*92.45*/("""
        """),format.raw/*93.9*/("""tableHeightSize ( )
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/(""" """),format.raw/*94.11*/(""")
        function tableHeightSize ( ) """),format.raw/*95.38*/("""{"""),format.raw/*95.39*/("""

        """),format.raw/*97.9*/("""if ( $ ( 'body' ).hasClass ( 'menu-on-top' ) ) """),format.raw/*97.56*/("""{"""),format.raw/*97.57*/("""
        """),format.raw/*98.9*/("""var menuHeight = 68 ;
        // nav height

        var tableHeight = ( $ ( window ).height ( ) - 224 ) - menuHeight ;
        if ( tableHeight < ( 320 - menuHeight ) ) """),format.raw/*102.51*/("""{"""),format.raw/*102.52*/("""
        """),format.raw/*103.9*/("""$ ( '.table-wrap' ).css ( 'height', ( 320 - menuHeight ) + 'px' ) ;
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/(""" """),format.raw/*104.11*/("""else """),format.raw/*104.16*/("""{"""),format.raw/*104.17*/("""
        """),format.raw/*105.9*/("""$ ( '.table-wrap' ).css ( 'height', tableHeight + 'px' ) ;
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/("""

        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/(""" """),format.raw/*108.11*/("""else """),format.raw/*108.16*/("""{"""),format.raw/*108.17*/("""
        """),format.raw/*109.9*/("""var tableHeight = $ ( window ).height ( ) - 224 ;
        if ( tableHeight < 320 ) """),format.raw/*110.34*/("""{"""),format.raw/*110.35*/("""
        """),format.raw/*111.9*/("""$ ( '.table-wrap' ).css ( 'height', 320 + 'px' ) ;
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/(""" """),format.raw/*112.11*/("""else """),format.raw/*112.16*/("""{"""),format.raw/*112.17*/("""
        """),format.raw/*113.9*/("""$ ( '.table-wrap' ).css ( 'height', tableHeight + 'px' ) ;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""

        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/("""

        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/("""


        """),format.raw/*121.9*/("""// compose email
        $ ( "#compose-mail" ).click ( function ( ) """),format.raw/*122.52*/("""{"""),format.raw/*122.53*/("""
            """),format.raw/*123.84*/("""
"""),format.raw/*124.1*/("""//            loadURL ( "email_compose.html",  ) ;
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/(""" """),format.raw/*125.11*/(""") ;

        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/(""" """),format.raw/*127.11*/(""";

        // end pagefunction

        // load delete row plugin and run pagefunction

        loadScript ( "assets/javascripts/plugin/delete-table-row/delete-table-row.min.js", pagefunction ) ;

        </script>
    """)))};
Seq[Any](format.raw/*1.17*/("""

    """),format.raw/*136.6*/("""

"""),_display_(/*138.2*/main(title, scripts)/*138.22*/ {_display_(Seq[Any](format.raw/*138.24*/("""
    """),format.raw/*139.5*/("""<div id="content" style="opacity : 1 ;"><div class="inbox-nav-bar no-content-padding">

        <h1 class="page-title txt-color-blueDark hidden-tablet"><i class="fa fa-fw fa-inbox"></i> Inbox &nbsp;
            <span class="btn-group">
                <a href="#" data-toggle="dropdown" class="btn btn-default btn-xs dropdown-toggle"><span class="caret single"></span></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#">Action</a>
                    </li>
                    <li>
                        <a href="#">Another action</a>
                    </li>
                    <li>
                        <a href="#">Something else here</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">Separated link</a>
                    </li>
                </ul>
            </span>
        </h1>

        <div class="btn-group hidden-desktop visible-tablet">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                Inbox <i class="fa fa-caret-down"></i>
            </button>
            <ul class="dropdown-menu pull-left">
                <li>
                    <a href=""""),_display_(/*168.31*/routes/*168.37*/.Demo.inbox()),format.raw/*168.50*/("""" class="inbox-load">Inbox <i class="fa fa-check"></i></a>
                </li>
                <li>
                    <a href="javascript:void(0);">Sent</a>
                </li>
                <li>
                    <a href="javascript:void(0);">Trash</a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="javascript:void(0);">Spam</a>
                </li>
            </ul>

        </div>

        <div class="inbox-checkbox-triggered">

            <div class="btn-group">
                <a href="javascript:void(0);" rel="tooltip" title="" data-placement="bottom" data-original-title="Mark Important" class="btn btn-default"><strong><i class="fa fa-exclamation fa-lg text-danger"></i></strong></a>
                <a href="javascript:void(0);" rel="tooltip" title="" data-placement="bottom" data-original-title="Move to folder" class="btn btn-default"><strong><i class="fa fa-folder-open fa-lg"></i></strong></a>
                <a href="javascript:void(0);" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete" class="deletebutton btn btn-default"><strong><i class="fa fa-trash-o fa-lg"></i></strong></a>
            </div>

        </div>

        <a href="javascript:void(0);" id="compose-mail-mini" class="btn btn-primary pull-right hidden-desktop visible-tablet"> <strong><i class="fa fa-file fa-lg"></i></strong> </a>

        <div class="btn-group pull-right inbox-paging">
            <a href="javascript:void(0);" class="btn btn-default btn-sm"><strong><i class="fa fa-chevron-left"></i></strong></a>
            <a href="javascript:void(0);" class="btn btn-default btn-sm"><strong><i class="fa fa-chevron-right"></i></strong></a>
        </div>
        <span class="pull-right"><strong>1-30</strong> of <strong>3,452</strong></span>

    </div>

        <div id="inbox-content" class="inbox-body no-content-padding">

            <div class="inbox-side-bar">

                <a href="javascript:void(0);" id="compose-mail" class="btn btn-primary btn-block"> <strong>
                    Compose</strong> </a>

                <h6>
                    Folder <a href="javascript:void(0);" rel="tooltip" title="" data-placement="right" data-original-title="Refresh" class="pull-right txt-color-darken"><i class="fa fa-refresh"></i></a></h6>

                <ul class="inbox-menu-lg">
                    <li class="active">
                        <a class="inbox-load" href=""""),_display_(/*216.54*/routes/*216.60*/.Demo.inbox()),format.raw/*216.73*/(""""> Inbox (14) </a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Sent</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Draft</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Trash</a>
                    </li>
                </ul>

                <h6>
                    Quick Access <a href="javascript:void(0);" rel="tooltip" title="" data-placement="right" data-original-title="Add Another" class="pull-right txt-color-darken"><i class="fa fa-plus"></i></a></h6>

                <ul class="inbox-menu-sm">
                    <li>
                        <a href="javascript:void(0);"> Images (476)</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">Documents (4)</a>
                    </li>
                </ul>

                <div class="air air-bottom inbox-space">

                    3.5GB of <strong>
                    10GB</strong><a href="javascript:void(0);" rel="tooltip" title="" data-placement="top" data-original-title="Empty Spam" class="pull-right txt-color-darken"><i class="fa fa-trash-o fa-lg"></i></a>

                    <div class="progress progress-micro">
                        <div class="progress-bar progress-primary" style="width : 34 % ;"></div>
                    </div>
                </div>

            </div>

            <div class="table-wrap custom-scroll animated fast fadeInRight" style="height : 320px ; opacity : 1 ;">
                """),_display_(/*254.18*/demo/*254.22*/.tags.inbox_table()),format.raw/*254.41*/("""
            """),format.raw/*255.13*/("""</div>

        </div>

    </div>
""")))}))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/inbox.scala.html
                  HASH: f6c30021b0f37b87c331a6c756cfdf221e1f571a
                  MATRIX: 510->1|596->23|611->30|691->34|726->43|928->218|956->219|991->228|1098->308|1127->309|1156->310|1259->385|1288->386|1324->395|1408->452|1437->453|1466->454|1563->523|1592->524|1628->533|1712->590|1741->591|1770->592|1835->629|1864->630|1900->639|2074->786|2087->790|2128->810|2164->819|2193->820|2231->831|2321->893|2350->894|2386->903|2446->936|2475->937|2504->938|2586->992|2615->993|2651->1002|2867->1191|2896->1192|2925->1193|2998->1238|3027->1239|3063->1248|3194->1351|3223->1352|3259->1361|3390->1465|3419->1466|3448->1467|3481->1472|3510->1473|3546->1482|3680->1589|3709->1590|3745->1599|3774->1600|3811->1610|4276->2047|4305->2048|4334->2049|4379->2066|4408->2067|5039->2670|5068->2671|5105->2681|5227->2775|5256->2776|5292->2785|5347->2813|5376->2814|5405->2815|5472->2854|5501->2855|5538->2865|5613->2912|5642->2913|5678->2922|5877->3092|5907->3093|5944->3102|6048->3178|6078->3179|6108->3180|6142->3185|6172->3186|6209->3195|6304->3262|6334->3263|6372->3273|6402->3274|6432->3275|6466->3280|6496->3281|6533->3290|6645->3373|6675->3374|6712->3383|6799->3442|6829->3443|6859->3444|6893->3449|6923->3450|6960->3459|7055->3526|7085->3527|7123->3537|7153->3538|7191->3548|7221->3549|7260->3560|7357->3628|7387->3629|7429->3713|7458->3714|7545->3773|7575->3774|7605->3775|7646->3788|7676->3789|7706->3790|7965->16|7999->4010|8029->4013|8059->4033|8100->4035|8133->4040|9424->5303|9440->5309|9475->5322|11991->7810|12007->7816|12042->7829|13703->9462|13717->9466|13758->9485|13800->9498
                  LINES: 19->1|21->3|21->3|23->3|24->4|28->8|28->8|29->9|30->10|30->10|30->10|32->12|32->12|33->13|35->15|35->15|35->15|36->16|36->16|37->17|39->19|39->19|39->19|40->20|40->20|41->21|43->23|43->23|43->23|44->24|44->24|47->27|47->27|47->27|48->28|49->29|49->29|49->29|51->31|51->31|52->32|55->35|55->35|55->35|57->37|57->37|58->38|60->40|60->40|61->41|63->43|63->43|63->43|63->43|63->43|64->44|66->46|66->46|67->47|67->47|69->49|82->62|82->62|82->62|82->62|82->62|107->87|107->87|109->89|112->92|112->92|113->93|114->94|114->94|114->94|115->95|115->95|117->97|117->97|117->97|118->98|122->102|122->102|123->103|124->104|124->104|124->104|124->104|124->104|125->105|126->106|126->106|128->108|128->108|128->108|128->108|128->108|129->109|130->110|130->110|131->111|132->112|132->112|132->112|132->112|132->112|133->113|134->114|134->114|136->116|136->116|138->118|138->118|141->121|142->122|142->122|143->123|144->124|145->125|145->125|145->125|147->127|147->127|147->127|157->1|159->136|161->138|161->138|161->138|162->139|191->168|191->168|191->168|239->216|239->216|239->216|277->254|277->254|277->254|278->255
                  -- GENERATED --
              */
          