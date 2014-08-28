
package views.html.partials

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
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/">Playful Prelaunch</a>
    </div>
    <div class="nav-collapse">
        <ul class="nav navbar-nav">
          <li><a href="">How it works</a></li>
        </ul>
    </div>
  </div>
</nav>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 22:27:36 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/partials/header.scala.html
                  HASH: 4ca714d1f274cdfe386ce9f83a81831b00b42cfd
                  MATRIX: 590->0
                  LINES: 22->1
                  -- GENERATED --
              */
          