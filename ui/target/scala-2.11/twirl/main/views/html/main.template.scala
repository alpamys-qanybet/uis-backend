
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/maindev(title,scripts)/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
""")))}))}
  }

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts) => (content) => apply(title,scripts)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:41 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/main.scala.html
                  HASH: cd160476e0da4df2063c10e7e530dffbc8b7aed4
                  MATRIX: 514->1|658->57|686->60|716->82|754->83|785->89|812->96
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4
                  -- GENERATED --
              */
          