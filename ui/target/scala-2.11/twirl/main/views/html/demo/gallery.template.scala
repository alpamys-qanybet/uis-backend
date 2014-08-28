
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
object gallery extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row hidden-mobile">
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa-fw fa fa-picture-o"></i>
                Gallery <span>&gt;
                Smart Responsive gallery </span></h1>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-align-right">
            <div class="page-title">
                <a href="javascript:void(0);" class="btn btn-default">Upload</a>
                <a href="javascript:void(0);" class="btn btn-default">Load Library</a>
            </div>
        </div>
    </div>

            <!-- row -->
        <div class="row">

                <!-- SuperBox -->
            <div class="superbox col-sm-12">
                <div class="superbox-list">
                    <img src="img/superbox/superbox-thumb-1.jpg" data-img="img/superbox/superbox-full-1.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Miller Cine" class="superbox-img">
                </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-2.jpg" data-img="img/superbox/superbox-full-2.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Bridge of Edgen" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-3.jpg" data-img="img/superbox/superbox-full-3.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Lines of Friendship" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-4.jpg" data-img="img/superbox/superbox-full-4.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="My new car!" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-5.jpg" data-img="img/superbox/superbox-full-5.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Study Time" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-6.jpg" data-img="img/superbox/superbox-full-6.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="San Francisco Bridge" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-7.jpg" data-img="img/superbox/superbox-full-7.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="New Styla" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-8.jpg" data-img="img/superbox/superbox-full-8.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Cristpta" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-9.jpg" data-img="img/superbox/superbox-full-9.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Cristine Dine" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-10.jpg" data-img="img/superbox/superbox-full-10.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Mosaic Clock" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-11.jpg" data-img="img/superbox/superbox-full-11.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Elegance" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-12.jpg" data-img="img/superbox/superbox-full-12.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="China Town" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-13.jpg" data-img="img/superbox/superbox-full-13.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Sky Diving" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-14.jpg" data-img="img/superbox/superbox-full-14.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Country Music" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-15.jpg" data-img="img/superbox/superbox-full-15.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="You are late!" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-16.jpg" data-img="img/superbox/superbox-full-16.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Royal Bengle Tiger" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-17.jpg" data-img="img/superbox/superbox-full-17.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Snowpine" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-18.jpg" data-img="img/superbox/superbox-full-18.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Hop Jop Mop" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-19.jpg" data-img="img/superbox/superbox-full-19.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Party Girls" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-20.jpg" data-img="img/superbox/superbox-full-20.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Dragon Fly" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-21.jpg" data-img="img/superbox/superbox-full-21.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Kinds Road" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-22.jpg" data-img="img/superbox/superbox-full-22.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Tokyo" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-23.jpg" data-img="img/superbox/superbox-full-23.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Rome" class="superbox-img">
            </div><!--
            --><div class="superbox-list">
                <img src="img/superbox/superbox-thumb-24.jpg" data-img="img/superbox/superbox-full-24.jpg" alt="My first photoshop layer mask on a high end PSD template theme" title="Traning" class="superbox-img">
            </div>
                <div class="superbox-float"></div>
            </div>
                <!-- /SuperBox -->

            <div class="superbox-show" style="height:300px; display: none"></div>

        </div>

            <!-- end row -->

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
         * $("[rel=popover-hover]").popover("""),format.raw/*119.45*/("""{"""),format.raw/*119.46*/(""" """),format.raw/*119.47*/("""trigger: "hover" """),format.raw/*119.64*/("""}"""),format.raw/*119.65*/(""");
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
         * var pagefunction = function() """),format.raw/*144.42*/("""{"""),format.raw/*144.43*/("""
         """),format.raw/*145.10*/("""*   ...
         * """),format.raw/*146.12*/("""}"""),format.raw/*146.13*/("""
         """),format.raw/*147.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*150.42*/("""{"""),format.raw/*150.43*/("""
         """),format.raw/*151.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*152.12*/("""}"""),format.raw/*152.13*/("""
         """),format.raw/*153.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*163.39*/("""{"""),format.raw/*163.40*/("""

        """),format.raw/*165.9*/("""$('.superbox').SuperBox();

        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/(""";

        // end pagefunction

        // run pagefunction on load

        // load bootstrap-progress bar script
        loadScript("js/plugin/superbox/superbox.min.js", pagefunction);


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
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/gallery.scala.html
                  HASH: 5df37f1fbeee759ceed89e9c293c4fcbc79e3ca7
                  MATRIX: 512->1|617->18|645->21|666->34|705->36|736->41|9033->8309|9063->8310|9093->8311|9139->8328|9169->8329|9858->8989|9888->8990|9927->9000|9975->9019|10005->9020|10044->9030|10212->9169|10242->9170|10281->9180|10371->9241|10401->9242|10440->9252|10663->9446|10693->9447|10731->9457|10795->9493|10825->9494
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|140->119|140->119|140->119|140->119|140->119|165->144|165->144|166->145|167->146|167->146|168->147|171->150|171->150|172->151|173->152|173->152|174->153|184->163|184->163|186->165|188->167|188->167
                  -- GENERATED --
              */
          