
package views.html

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<div class="container-fluid">
      <h1>Welcome to the <a href="https://github.com/michaelhawkins/playful-prelaunch"
        target="_blank">
        Playful Prelaunch App</a></h1>
      <p>
        sulta
      </p>

      <p>
        Praesent porta placerat nulla, a vulputate tortor auctor et. Suspendisse
        vitae ligula arcu. Proin fermentum sem vel enim eleifend, fermentum
        lobortis tortor aliquet. Sed eleifend tristique mauris quis egestas. Sed
        eleifend vestibulum ipsum ac sagittis. Sed varius, est sit amet lobortis
        vehicula, risus leo laoreet est, eget faucibus magna massa vel neque.
        Aenean vehicula nisi vitae elit ultricies, quis suscipit massa convallis.
        Phasellus mauris sapien, elementum vitae scelerisque eget, fermentum sit
        amet sapien. Etiam eget consequat urna. Suspendisse id semper nunc.
        Pellentesque et bibendum diam. Integer porttitor neque nec nunc ultrices
        convallis. Vestibulum ante ipsum primis in faucibus orci luctus et
        ultrices posuere cubilia Curae; Maecenas dignissim adipiscing feugiat.
        Mauris a tincidunt enim, id fringilla elit. Lorem ipsum dolor sit amet,
        consectetur adipiscing elit.
      </p>
    </div>
""")))}),format.raw/*28.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:41 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/index.scala.html
                  HASH: 5cb9dd0ffd451561732074f2e54ac0d237bebc66
                  MATRIX: 505->1|610->18|638->21|659->34|697->35|728->40|1996->1278
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|49->28
                  -- GENERATED --
              */
          