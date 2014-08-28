
package views.html.demo.tags

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
object inbox_table extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<script>

//Gets tooltips activated
$ ( "#inbox-table [rel=tooltip]" ).tooltip ( ) ;

$ ( "#inbox-table input[type='checkbox']" ).change ( function ( ) """),format.raw/*6.67*/("""{"""),format.raw/*6.68*/("""
"""),format.raw/*7.1*/("""$ ( this ).closest ( 'tr' ).toggleClass ( "highlight", this.checked ) ;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/(""" """),format.raw/*8.3*/(""") ;

$ ( "#inbox-table .inbox-data-message" ).click ( function ( ) """),format.raw/*10.63*/("""{"""),format.raw/*10.64*/("""
"""),format.raw/*11.1*/("""$this = $ ( this ) ;
getMail ( $this ) ;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/(""" """),format.raw/*13.3*/(""")
$ ( "#inbox-table .inbox-data-from" ).click ( function ( ) """),format.raw/*14.60*/("""{"""),format.raw/*14.61*/("""
"""),format.raw/*15.1*/("""$this = $ ( this ) ;
getMail ( $this ) ;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/(""" """),format.raw/*17.3*/(""")
function getMail ( $this ) """),format.raw/*18.28*/("""{"""),format.raw/*18.29*/("""
"""),format.raw/*19.1*/("""//console.log($this.closest("tr").attr("id"));
loadURL ( "ajax/email-opened.html", $ ( '#inbox-content > .table-wrap' ) ) ;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""


"""),format.raw/*24.1*/("""$ ( '.inbox-table-icon input:checkbox' ).click ( function ( ) """),format.raw/*24.63*/("""{"""),format.raw/*24.64*/("""
"""),format.raw/*25.1*/("""enableDeleteButton ( ) ;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/(""" """),format.raw/*26.3*/(""")

$ ( ".deletebutton" ).click ( function ( ) """),format.raw/*28.44*/("""{"""),format.raw/*28.45*/("""
"""),format.raw/*29.1*/("""$ ( '#inbox-table td input:checkbox:checked' ).parents ( "tr" ).rowslide ( ) ;
//$(".inbox-checkbox-triggered").removeClass('visible');
//$("#compose-mail").show();
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/(""" """),format.raw/*32.3*/(""") ;

function enableDeleteButton ( ) """),format.raw/*34.33*/("""{"""),format.raw/*34.34*/("""
"""),format.raw/*35.1*/("""var isChecked = $ ( '.inbox-table-icon input:checkbox' ).is ( ':checked' ) ;

if ( isChecked ) """),format.raw/*37.18*/("""{"""),format.raw/*37.19*/("""
"""),format.raw/*38.1*/("""$ ( ".inbox-checkbox-triggered" ).addClass ( 'visible' ) ;
//$("#compose-mail").hide();
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/(""" """),format.raw/*40.3*/("""else """),format.raw/*40.8*/("""{"""),format.raw/*40.9*/("""
"""),format.raw/*41.1*/("""$ ( ".inbox-checkbox-triggered" ).removeClass ( 'visible' ) ;
//$("#compose-mail").show();
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/("""</script>

    <table id="inbox-table" class="table table-striped table-hover">
    <tbody>

        <tr id="msg1" class="unread">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Alex Jones
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span><span class="label bg-color-orange">WORK</span> Karjua Marou</span> New server for datacenter needed
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>
                    <a href="javascript:void(0);" rel="tooltip" data-placement="left" data-original-title="FILES: rocketlaunch.jpg, timelogs.xsl" class="txt-color-darken"><i class="fa fa-paperclip fa-lg"></i></a>
                </div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg2" class="unread">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Sadi Orlaf
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span><span class="label bg-color-teal">HOME</span> SmartAdmin.com</span> Sed ut perspiciatis unde....
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>
                    <a href="javascript:void(0);" rel="tooltip" data-placement="left" data-original-title="rocketlaunch.jpg, timelogs.xsl" class="txt-color-darken"><i class="fa fa-paperclip fa-lg"></i></a>
                </div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg3">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Arik Lamora
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Facebook.com</span> Sed ut perspiciatis unde omnis iste natus error...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg4">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Robin Hood
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>10 Jobs</span> Sed ut perspiciatis unde omnis iste natus error...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg5">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					John Limar
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Project Date</span> Sed ut perspiciatis unde omnis iste natus...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>
                    <a href="javascript:void(0);" rel="tooltip" data-placement="left" data-original-title="payscale-changes.pdf" class="txt-color-darken"><i class="fa fa-paperclip fa-lg"></i></a>
                </div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg6">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Jeff Hopkin <span class="text-danger">Draft</span>
				</div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Hey John!</span> Sed ut perspiciatis unde omnis...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg7">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Toronto News
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Mayor Rod Fierd!</span> Sed ut perspiciatis unde sit...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg8">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Michael Bleigh
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Past due</span> Sed ut perspiciatis unde omnis iste na
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg9">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Me, Navin
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span><span class="label bg-color-teal">HOME</span> John!</span> Sed ut perspiciatis...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg10">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Trello Laka
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Project development</span> @Sed ut perspiciatis unde omnis...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg11">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Doug Baird
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Pora korta casta ricka?</span> Sed ut perspiciatis unde omnis iste...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg12">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Michael Ray, P. Eng
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>John, please add me to your linkedin</span> Linked in request pending.
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg13">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Doug Baird
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Pora korta casta ricka?</span> Sed ut perspiciatis unde omnis iste...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg14">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Doug Baird
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Pora korta casta ricka?</span> Sed ut perspiciatis unde omnis iste...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg15" class="unread">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
                    <i class="fa fa-warning text-warning"></i> System Email
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span><span class="label bg-color-orange">WORK</span> Sustem Update</span> 2:00PM to 2PM
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg16">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Amazon.ca
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Baby deal of the week!</span> Two new items on your cart...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg17">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					New server for datacenter needed New server for datacenter ne...
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Header blha blah</span> New server for datacenter needed
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg18">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					New server for datacenter needed New server for datacenter ne...
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Header blha blah</span> New server for datacenter needed
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg19">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg20">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg21">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg22">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
    """),
format.raw("""        <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg23">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Sunny
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Important question!</span> Hey John, I hope you are okay...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg24">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg25">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					Dogue Biryrd
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>Hey whats up?</span> Just checking up on ya...
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>


        <tr id="msg26">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg27">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg28">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg29">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

        <tr id="msg30">
            <td class="inbox-table-icon">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" class="checkbox style-2">
                        <span></span> </label>
                </div>
            </td>
            <td class="inbox-data-from hidden-xs hidden-sm">
                <div>
					System
                </div>
            </td>
            <td class="inbox-data-message">
                <div>
                    <span>SmartAdmin</span> You have a new friend request!
                </div>
            </td>
            <td class="inbox-data-attachment hidden-xs">
                <div>

				</div>
            </td>
            <td class="inbox-data-date hidden-xs">
                <div>
					10:23 am
                </div>
            </td>
        </tr>

    </tbody>
</table>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:09:00 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/tags/inbox_table.scala.html
                  HASH: 6bb7e232261b67e4a5bbb1d23a9eabfbe91152fe
                  MATRIX: 596->0|775->152|803->153|830->154|928->226|955->227|982->228|1077->295|1106->296|1134->297|1202->338|1230->339|1258->340|1347->401|1376->402|1404->403|1472->444|1500->445|1528->446|1585->475|1614->476|1642->477|1793->601|1821->602|1851->605|1941->667|1970->668|1998->669|2050->694|2078->695|2106->696|2180->742|2209->743|2237->744|2429->909|2457->910|2485->911|2550->948|2579->949|2607->950|2730->1045|2759->1046|2787->1047|2902->1135|2930->1136|2958->1137|2990->1142|3018->1143|3046->1144|3164->1235|3192->1236|3220->1237|3248->1238|3277->1240
                  LINES: 22->1|27->6|27->6|28->7|29->8|29->8|29->8|31->10|31->10|32->11|34->13|34->13|34->13|35->14|35->14|36->15|38->17|38->17|38->17|39->18|39->18|40->19|42->21|42->21|45->24|45->24|45->24|46->25|47->26|47->26|47->26|49->28|49->28|50->29|53->32|53->32|53->32|55->34|55->34|56->35|58->37|58->37|59->38|61->40|61->40|61->40|61->40|61->40|62->41|64->43|64->43|65->44|65->44|67->46
                  -- GENERATED --
              */
          