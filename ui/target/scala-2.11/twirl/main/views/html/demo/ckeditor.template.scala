
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
object ckeditor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;">
            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12 sortable-grid ui-sortable">

                    <div class="alert alert-danger alert-block">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">CKEditor Warning!</h4>
                        If you plan to use CKEditor in your project for this theme, please be sure to read full documentation of its use on their website. It is important to note that CKEditor may conflict with other editors and textareas. You must destroy the CKeditor instance before pulling it into another object.

                    </div>

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-fullscreenbutton="false" data-widget-sortable="false" role="widget">
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
                        <header role="heading"><div class="jarviswidget-ctrls" role="menu">     <a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete"><i class="fa fa-times"></i></a></div>
                            <span class="widget-icon"> <i class="fa fa-pencil"></i> </span>
                            <h2>CK Editor (Full version) </h2>

                            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

                            <!-- widget div-->
                        <div role="content">

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <textarea name="ckeditor">								&lt;h1&gt;&lt;img alt="Saturn V carrying Apollo 11" class="right" src="img/demo/sample.jpg"/&gt; Apollo 11&lt;/h1&gt; &lt;p&gt;&lt;b&gt;Apollo 11&lt;/b&gt; was the spaceflight that landed the first humans, Americans &lt;a href="http://en.wikipedia.org/wiki/Neil_Armstrong" title="Neil Armstrong"&gt;Neil Armstrong&lt;/a&gt; and &lt;a href="http://en.wikipedia.org/wiki/Buzz_Aldrin" title="Buzz Aldrin"&gt;Buzz Aldrin&lt;/a&gt;, on the Moon on July 20, 1969, at 20:18 UTC. Armstrong became the first to step onto the lunar surface 6 hours later on July 21 at 02:56 UTC.&lt;/p&gt; &lt;p&gt;Armstrong spent about &lt;strike&gt;three and a half&lt;/strike&gt; two and a half hours outside the spacecraft, Aldrin slightly less; and together they collected 47.5 pounds (21.5&amp;nbsp;kg) of lunar material for return to Earth. A third member of the mission, &lt;a href="http://en.wikipedia.org/wiki/Michael_Collins_(astronaut)" title="Michael Collins (astronaut)"&gt;Michael Collins&lt;/a&gt;, piloted the &lt;a href="http://en.wikipedia.org/wiki/Apollo_Command/Service_Module" title="Apollo Command/Service Module"&gt;command&lt;/a&gt; spacecraft alone in lunar orbit until Armstrong and Aldrin returned to it for the trip back to Earth.&lt;/p&gt; &lt;h2&gt;Broadcasting and &lt;em&gt;quotes&lt;/em&gt; &lt;a id="quotes" name="quotes"&gt;&lt;/a&gt;&lt;/h2&gt; &lt;p&gt;Broadcast on live TV to a world-wide audience, Armstrong stepped onto the lunar surface and described the event as:&lt;/p&gt; &lt;blockquote&gt;&lt;p&gt;One small step for [a] man, one giant leap for mankind.&lt;/p&gt;&lt;/blockquote&gt; &lt;p&gt;Apollo 11 effectively ended the &lt;a href="http://en.wikipedia.org/wiki/Space_Race" title="Space Race"&gt;Space Race&lt;/a&gt; and fulfilled a national goal proposed in 1961 by the late U.S. President &lt;a href="http://en.wikipedia.org/wiki/John_F._Kennedy" title="John F. Kennedy"&gt;John F. Kennedy&lt;/a&gt; in a speech before the United States Congress:&lt;/p&gt; &lt;blockquote&gt;&lt;p&gt;[...] before this decade is out, of landing a man on the Moon and returning him safely to the Earth.&lt;/p&gt;&lt;/blockquote&gt; &lt;h2&gt;Technical details &lt;a id="tech-details" name="tech-details"&gt;&lt;/a&gt;&lt;/h2&gt; &lt;table align="right" border="1" bordercolor="#ccc" cellpadding="5" cellspacing="0" style="border-collapse:collapse;margin:10px 0 10px 15px;"&gt; &lt;caption&gt;&lt;strong&gt;Mission crew&lt;/strong&gt;&lt;/caption&gt; &lt;thead&gt; &lt;tr&gt; &lt;th scope="col"&gt;Position&lt;/th&gt; &lt;th scope="col"&gt;Astronaut&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td&gt;Commander&lt;/td&gt; &lt;td&gt;Neil A. Armstrong&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;Command Module Pilot&lt;/td&gt; &lt;td&gt;Michael Collins&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;Lunar Module Pilot&lt;/td&gt; &lt;td&gt;Edwin &amp;quot;Buzz&amp;quot; E. Aldrin, Jr.&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt; &lt;p&gt;Launched by a &lt;strong&gt;Saturn V&lt;/strong&gt; rocket from &lt;a href="http://en.wikipedia.org/wiki/Kennedy_Space_Center" title="Kennedy Space Center"&gt;Kennedy Space Center&lt;/a&gt; in Merritt Island, Florida on July 16, Apollo 11 was the fifth manned mission of &lt;a href="http://en.wikipedia.org/wiki/NASA" title="NASA"&gt;NASA&lt;/a&gt;&amp;#39;s Apollo program. The Apollo spacecraft had three parts:&lt;/p&gt; &lt;ol&gt; &lt;li&gt;&lt;strong&gt;Command Module&lt;/strong&gt; with a cabin for the three astronauts which was the only part which landed back on Earth&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Service Module&lt;/strong&gt; which supported the Command Module with propulsion, electrical power, oxygen and water&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Lunar Module&lt;/strong&gt; for landing on the Moon.&lt;/li&gt; &lt;/ol&gt; &lt;p&gt;After being sent to the Moon by the Saturn V&amp;#39;s upper stage, the astronauts separated the spacecraft from it and travelled for three days until they entered into lunar orbit. Armstrong and Aldrin then moved into the Lunar Module and landed in the &lt;a href="http://en.wikipedia.org/wiki/Mare_Tranquillitatis" title="Mare Tranquillitatis"&gt;Sea of Tranquility&lt;/a&gt;. They stayed a total of about 21 and a half hours on the lunar surface. After lifting off in the upper part of the Lunar Module and rejoining Collins in the Command Module, they returned to Earth and landed in the &lt;a href="http://en.wikipedia.org/wiki/Pacific_Ocean" title="Pacific Ocean"&gt;Pacific Ocean&lt;/a&gt; on July 24.&lt;/p&gt; &lt;hr/&gt; &lt;p style="text-align: right;"&gt;&lt;small&gt;Source: &lt;a href="http://en.wikipedia.org/wiki/Apollo_11"&gt;Wikipedia.org&lt;/a&gt;&lt;/small&gt;&lt;/p&gt;
                                </textarea>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*90.45*/("""{"""),format.raw/*90.46*/(""" """),format.raw/*90.47*/("""trigger: "hover" """),format.raw/*90.64*/("""}"""),format.raw/*90.65*/(""");
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
         * var pagefunction = function() """),format.raw/*115.42*/("""{"""),format.raw/*115.43*/("""
         """),format.raw/*116.10*/("""*   ...
         * """),format.raw/*117.12*/("""}"""),format.raw/*117.13*/("""
         """),format.raw/*118.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*121.42*/("""{"""),format.raw/*121.43*/("""
         """),format.raw/*122.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*123.12*/("""}"""),format.raw/*123.13*/("""
         """),format.raw/*124.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */


        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*135.39*/("""{"""),format.raw/*135.40*/("""
        """),format.raw/*136.9*/("""CKEDITOR.replace( 'ckeditor', """),format.raw/*136.39*/("""{"""),format.raw/*136.40*/(""" """),format.raw/*136.41*/("""height: '380px', startupFocus : true"""),format.raw/*136.77*/("""}"""),format.raw/*136.78*/(""" """),format.raw/*136.79*/(""");
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/(""";

        // end pagefunction

        // run pagefunction on load
        loadScript("js/plugin/ckeditor/ckeditor.js", pagefunction);


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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/ckeditor.scala.html
                  HASH: d6745ea009797ffc366ab9c701035e54e8f6f548
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|9183->8459|9212->8460|9241->8461|9286->8478|9315->8479|10004->9139|10034->9140|10073->9150|10121->9169|10151->9170|10190->9180|10358->9319|10388->9320|10427->9330|10517->9391|10547->9392|10586->9402|10810->9597|10840->9598|10877->9607|10936->9637|10966->9638|10996->9639|11061->9675|11091->9676|11121->9677|11160->9688|11190->9689
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|111->90|111->90|111->90|111->90|111->90|136->115|136->115|137->116|138->117|138->117|139->118|142->121|142->121|143->122|144->123|144->123|145->124|156->135|156->135|157->136|157->136|157->136|157->136|157->136|157->136|157->136|158->137|158->137
                  -- GENERATED --
              */
          