
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
object mainprod extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/(""" """),format.raw/*7.23*/("""| Playful Prelaunch</title>
        """),format.raw/*8.124*/("""
        """),format.raw/*9.9*/("""<link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("concat/style-group.css")),format.raw/*11.103*/("""">

        """),format.raw/*13.77*/("""
        """),format.raw/*14.76*/("""

        """),format.raw/*16.9*/("""<script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("concat/script-group.js")),format.raw/*16.72*/(""""></script>
    </head>
    <body>
        """),_display_(/*19.10*/partials/*19.18*/.header()),format.raw/*19.27*/("""
        """),_display_(/*20.10*/content),format.raw/*20.17*/("""
    """),format.raw/*21.5*/("""</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:41 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/mainprod.scala.html
                  HASH: edb5dd1f19f02732e15ff5ee0bce1d11ac0e3fc4
                  MATRIX: 513->1|631->31|659->33|736->84|761->89|789->90|853->241|888->250|964->300|978->306|1038->345|1122->402|1137->408|1202->451|1242->531|1279->607|1316->617|1357->631|1372->637|1436->680|1507->724|1524->732|1554->741|1591->751|1619->758|1651->763
                  LINES: 19->1|22->1|24->3|28->7|28->7|28->7|29->8|30->9|30->9|30->9|30->9|32->11|32->11|32->11|34->13|35->14|37->16|37->16|37->16|37->16|40->19|40->19|40->19|41->20|41->20|42->21
                  -- GENERATED --
              */
          