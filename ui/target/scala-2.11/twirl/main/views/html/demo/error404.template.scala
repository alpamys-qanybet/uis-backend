
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
object error404 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><style>
    .error-text-2 """),format.raw/*5.19*/("""{"""),format.raw/*5.20*/("""
    """),format.raw/*6.5*/("""text-align: center;
    font-size: 700%;
    font-weight: bold;
    font-weight: 100;
    color: #333;
    line-height: 1;
    letter-spacing: -.05em;
    background-image: -webkit-linear-gradient(92deg,#333,#ed1c24);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
    """),format.raw/*17.5*/(""".particle """),format.raw/*17.15*/("""{"""),format.raw/*17.16*/("""
    """),format.raw/*18.5*/("""position: absolute;
    top: 50%;
    left: 50%;
    width: 1rem;
    height: 1rem;
    border-radius: 100%;
    background-color: #ed1c24;
    background-image: -webkit-linear-gradient(rgba(0,0,0,0),rgba(0,0,0,.3) 75%,rgba(0,0,0,0));
    box-shadow: inset 0 0 1px 1px rgba(0,0,0,.25);
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    """),format.raw/*28.5*/(""".particle--a """),format.raw/*28.18*/("""{"""),format.raw/*28.19*/("""
    """),format.raw/*29.5*/("""-webkit-animation: particle-a 1.4s infinite linear;
    -moz-animation: particle-a 1.4s infinite linear;
    -o-animation: particle-a 1.4s infinite linear;
    animation: particle-a 1.4s infinite linear;
    """),format.raw/*33.5*/("""}"""),format.raw/*33.6*/("""
    """),format.raw/*34.5*/(""".particle--b """),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
    """),format.raw/*35.5*/("""-webkit-animation: particle-b 1.3s infinite linear;
    -moz-animation: particle-b 1.3s infinite linear;
    -o-animation: particle-b 1.3s infinite linear;
    animation: particle-b 1.3s infinite linear;
    background-color: #00A300;
    """),format.raw/*40.5*/("""}"""),format.raw/*40.6*/("""
    """),format.raw/*41.5*/(""".particle--c """),format.raw/*41.18*/("""{"""),format.raw/*41.19*/("""
    """),format.raw/*42.5*/("""-webkit-animation: particle-c 1.5s infinite linear;
    -moz-animation: particle-c 1.5s infinite linear;
    -o-animation: particle-c 1.5s infinite linear;
    animation: particle-c 1.5s infinite linear;
    background-color: #57889C;
    """),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""@-webkit-keyframes particle-a """),format.raw/*47.37*/("""{"""),format.raw/*47.38*/("""
    """),format.raw/*48.5*/("""0% """),format.raw/*48.8*/("""{"""),format.raw/*48.9*/("""
    """),format.raw/*49.5*/("""-webkit-transform: translate3D(-3rem,-3rem,0);
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""" """),format.raw/*52.7*/("""25% """),format.raw/*52.11*/("""{"""),format.raw/*52.12*/("""
    """),format.raw/*53.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""50% """),format.raw/*57.9*/("""{"""),format.raw/*57.10*/("""
    """),format.raw/*58.5*/("""-webkit-transform: translate3D(4rem, 3rem, 0);
    opacity: 1;
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""

    """),format.raw/*64.5*/("""55% """),format.raw/*64.9*/("""{"""),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""z-index: -1;
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""

    """),format.raw/*68.5*/("""75% """),format.raw/*68.9*/("""{"""),format.raw/*68.10*/("""
    """),format.raw/*69.5*/("""width: .75rem;
    height: .75rem;
    opacity: .5;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""

    """),format.raw/*74.5*/("""100% """),format.raw/*74.10*/("""{"""),format.raw/*74.11*/("""
    """),format.raw/*75.5*/("""-webkit-transform: translate3D(-3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""

        """),format.raw/*80.9*/("""@-moz-keyframes particle-a """),format.raw/*80.37*/("""{"""),format.raw/*80.38*/("""
    """),format.raw/*81.5*/("""0% """),format.raw/*81.8*/("""{"""),format.raw/*81.9*/("""
    """),format.raw/*82.5*/("""-moz-transform: translate3D(-3rem,-3rem,0);
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/("""25% """),format.raw/*87.9*/("""{"""),format.raw/*87.10*/("""
    """),format.raw/*88.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""

    """),format.raw/*92.5*/("""50% """),format.raw/*92.9*/("""{"""),format.raw/*92.10*/("""
    """),format.raw/*93.5*/("""-moz-transform: translate3D(4rem, 3rem, 0);
    opacity: 1;
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*97.5*/("""}"""),format.raw/*97.6*/("""

    """),format.raw/*99.5*/("""55% """),format.raw/*99.9*/("""{"""),format.raw/*99.10*/("""
    """),format.raw/*100.5*/("""z-index: -1;
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""

    """),format.raw/*103.5*/("""75% """),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
    """),format.raw/*104.5*/("""width: .75rem;
    height: .75rem;
    opacity: .5;
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""

    """),format.raw/*109.5*/("""100% """),format.raw/*109.10*/("""{"""),format.raw/*109.11*/("""
    """),format.raw/*110.5*/("""-moz-transform: translate3D(-3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/("""
    """),format.raw/*113.5*/("""}"""),format.raw/*113.6*/("""

        """),format.raw/*115.9*/("""@-o-keyframes particle-a """),format.raw/*115.35*/("""{"""),format.raw/*115.36*/("""
    """),format.raw/*116.5*/("""0% """),format.raw/*116.8*/("""{"""),format.raw/*116.9*/("""
    """),format.raw/*117.5*/("""-o-transform: translate3D(-3rem,-3rem,0);
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""

    """),format.raw/*122.5*/("""25% """),format.raw/*122.9*/("""{"""),format.raw/*122.10*/("""
    """),format.raw/*123.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*125.5*/("""}"""),format.raw/*125.6*/("""

    """),format.raw/*127.5*/("""50% """),format.raw/*127.9*/("""{"""),format.raw/*127.10*/("""
    """),format.raw/*128.5*/("""-o-transform: translate3D(4rem, 3rem, 0);
    opacity: 1;
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/("""

    """),format.raw/*134.5*/("""55% """),format.raw/*134.9*/("""{"""),format.raw/*134.10*/("""
    """),format.raw/*135.5*/("""z-index: -1;
    """),format.raw/*136.5*/("""}"""),format.raw/*136.6*/("""

    """),format.raw/*138.5*/("""75% """),format.raw/*138.9*/("""{"""),format.raw/*138.10*/("""
    """),format.raw/*139.5*/("""width: .75rem;
    height: .75rem;
    opacity: .5;
    """),format.raw/*142.5*/("""}"""),format.raw/*142.6*/("""

    """),format.raw/*144.5*/("""100% """),format.raw/*144.10*/("""{"""),format.raw/*144.11*/("""
    """),format.raw/*145.5*/("""-o-transform: translate3D(-3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*147.5*/("""}"""),format.raw/*147.6*/("""
    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/("""

        """),format.raw/*150.9*/("""@keyframes particle-a """),format.raw/*150.32*/("""{"""),format.raw/*150.33*/("""
    """),format.raw/*151.5*/("""0% """),format.raw/*151.8*/("""{"""),format.raw/*151.9*/("""
    """),format.raw/*152.5*/("""transform: translate3D(-3rem,-3rem,0);
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/("""

    """),format.raw/*157.5*/("""25% """),format.raw/*157.9*/("""{"""),format.raw/*157.10*/("""
    """),format.raw/*158.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*160.5*/("""}"""),format.raw/*160.6*/("""

    """),format.raw/*162.5*/("""50% """),format.raw/*162.9*/("""{"""),format.raw/*162.10*/("""
    """),format.raw/*163.5*/("""transform: translate3D(4rem, 3rem, 0);
    opacity: 1;
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*167.5*/("""}"""),format.raw/*167.6*/("""

    """),format.raw/*169.5*/("""55% """),format.raw/*169.9*/("""{"""),format.raw/*169.10*/("""
    """),format.raw/*170.5*/("""z-index: -1;
    """),format.raw/*171.5*/("""}"""),format.raw/*171.6*/("""

    """),format.raw/*173.5*/("""75% """),format.raw/*173.9*/("""{"""),format.raw/*173.10*/("""
    """),format.raw/*174.5*/("""width: .75rem;
    height: .75rem;
    opacity: .5;
    """),format.raw/*177.5*/("""}"""),format.raw/*177.6*/("""

    """),format.raw/*179.5*/("""100% """),format.raw/*179.10*/("""{"""),format.raw/*179.11*/("""
    """),format.raw/*180.5*/("""transform: translate3D(-3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/("""
    """),format.raw/*183.5*/("""}"""),format.raw/*183.6*/("""

        """),format.raw/*185.9*/("""@-webkit-keyframes particle-b """),format.raw/*185.40*/("""{"""),format.raw/*185.41*/("""
    """),format.raw/*186.5*/("""0% """),format.raw/*186.8*/("""{"""),format.raw/*186.9*/("""
    """),format.raw/*187.5*/("""-webkit-transform: translate3D(3rem,-3rem,0);
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*190.5*/("""}"""),format.raw/*190.6*/("""

    """),format.raw/*192.5*/("""25% """),format.raw/*192.9*/("""{"""),format.raw/*192.10*/("""
    """),format.raw/*193.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*195.5*/("""}"""),format.raw/*195.6*/("""

    """),format.raw/*197.5*/("""50% """),format.raw/*197.9*/("""{"""),format.raw/*197.10*/("""
    """),format.raw/*198.5*/("""-webkit-transform: translate3D(-3rem, 3.5rem, 0);
    opacity: 1;
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*202.5*/("""}"""),format.raw/*202.6*/("""

    """),format.raw/*204.5*/("""55% """),format.raw/*204.9*/("""{"""),format.raw/*204.10*/("""
    """),format.raw/*205.5*/("""z-index: -1;
    """),format.raw/*206.5*/("""}"""),format.raw/*206.6*/("""

    """),format.raw/*208.5*/("""75% """),format.raw/*208.9*/("""{"""),format.raw/*208.10*/("""
    """),format.raw/*209.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/("""

    """),format.raw/*214.5*/("""100% """),format.raw/*214.10*/("""{"""),format.raw/*214.11*/("""
    """),format.raw/*215.5*/("""-webkit-transform: translate3D(3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*217.5*/("""}"""),format.raw/*217.6*/("""
    """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/("""

        """),format.raw/*220.9*/("""@-moz-keyframes particle-b """),format.raw/*220.37*/("""{"""),format.raw/*220.38*/("""
    """),format.raw/*221.5*/("""0% """),format.raw/*221.8*/("""{"""),format.raw/*221.9*/("""
    """),format.raw/*222.5*/("""-moz-transform: translate3D(3rem,-3rem,0);
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*225.5*/("""}"""),format.raw/*225.6*/("""

    """),format.raw/*227.5*/("""25% """),format.raw/*227.9*/("""{"""),format.raw/*227.10*/("""
    """),format.raw/*228.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*230.5*/("""}"""),format.raw/*230.6*/("""

    """),format.raw/*232.5*/("""50% """),format.raw/*232.9*/("""{"""),format.raw/*232.10*/("""
    """),format.raw/*233.5*/("""-moz-transform: translate3D(-3rem, 3.5rem, 0);
    opacity: 1;
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/("""

    """),format.raw/*239.5*/("""55% """),format.raw/*239.9*/("""{"""),format.raw/*239.10*/("""
    """),format.raw/*240.5*/("""z-index: -1;
    """),format.raw/*241.5*/("""}"""),format.raw/*241.6*/("""

    """),format.raw/*243.5*/("""75% """),format.raw/*243.9*/("""{"""),format.raw/*243.10*/("""
    """),format.raw/*244.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*247.5*/("""}"""),format.raw/*247.6*/("""

    """),format.raw/*249.5*/("""100% """),format.raw/*249.10*/("""{"""),format.raw/*249.11*/("""
    """),format.raw/*250.5*/("""-moz-transform: translate3D(3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*252.5*/("""}"""),format.raw/*252.6*/("""
    """),format.raw/*253.5*/("""}"""),format.raw/*253.6*/("""

        """),format.raw/*255.9*/("""@-o-keyframes particle-b """),format.raw/*255.35*/("""{"""),format.raw/*255.36*/("""
    """),format.raw/*256.5*/("""0% """),format.raw/*256.8*/("""{"""),format.raw/*256.9*/("""
    """),format.raw/*257.5*/("""-o-transform: translate3D(3rem,-3rem,0);
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*260.5*/("""}"""),format.raw/*260.6*/("""

    """),format.raw/*262.5*/("""25% """),format.raw/*262.9*/("""{"""),format.raw/*262.10*/("""
    """),format.raw/*263.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*265.5*/("""}"""),format.raw/*265.6*/("""

    """),format.raw/*267.5*/("""50% """),format.raw/*267.9*/("""{"""),format.raw/*267.10*/("""
    """),format.raw/*268.5*/("""-o-transform: translate3D(-3rem, 3.5rem, 0);
    opacity: 1;
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*272.5*/("""}"""),format.raw/*272.6*/("""

    """),format.raw/*274.5*/("""55% """),format.raw/*274.9*/("""{"""),format.raw/*274.10*/("""
    """),format.raw/*275.5*/("""z-index: -1;
    """),format.raw/*276.5*/("""}"""),format.raw/*276.6*/("""

    """),format.raw/*278.5*/("""75% """),format.raw/*278.9*/("""{"""),format.raw/*278.10*/("""
    """),format.raw/*279.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*282.5*/("""}"""),format.raw/*282.6*/("""

    """),format.raw/*284.5*/("""100% """),format.raw/*284.10*/("""{"""),format.raw/*284.11*/("""
    """),format.raw/*285.5*/("""-o-transform: translate3D(3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*287.5*/("""}"""),format.raw/*287.6*/("""
    """),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""

        """),format.raw/*290.9*/("""@keyframes particle-b """),format.raw/*290.32*/("""{"""),format.raw/*290.33*/("""
    """),format.raw/*291.5*/("""0% """),format.raw/*291.8*/("""{"""),format.raw/*291.9*/("""
    """),format.raw/*292.5*/("""transform: translate3D(3rem,-3rem,0);
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*295.5*/("""}"""),format.raw/*295.6*/("""

    """),format.raw/*297.5*/("""25% """),format.raw/*297.9*/("""{"""),format.raw/*297.10*/("""
    """),format.raw/*298.5*/("""width: 1.5rem;
    height: 1.5rem;
    """),format.raw/*300.5*/("""}"""),format.raw/*300.6*/("""

    """),format.raw/*302.5*/("""50% """),format.raw/*302.9*/("""{"""),format.raw/*302.10*/("""
    """),format.raw/*303.5*/("""transform: translate3D(-3rem, 3.5rem, 0);
    opacity: 1;
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/("""

    """),format.raw/*309.5*/("""55% """),format.raw/*309.9*/("""{"""),format.raw/*309.10*/("""
    """),format.raw/*310.5*/("""z-index: -1;
    """),format.raw/*311.5*/("""}"""),format.raw/*311.6*/("""

    """),format.raw/*313.5*/("""75% """),format.raw/*313.9*/("""{"""),format.raw/*313.10*/("""
    """),format.raw/*314.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*317.5*/("""}"""),format.raw/*317.6*/("""

    """),format.raw/*319.5*/("""100% """),format.raw/*319.10*/("""{"""),format.raw/*319.11*/("""
    """),format.raw/*320.5*/("""transform: translate3D(3rem,-3rem,0);
    z-index: -1;
    """),format.raw/*322.5*/("""}"""),format.raw/*322.6*/("""
    """),format.raw/*323.5*/("""}"""),format.raw/*323.6*/("""

        """),format.raw/*325.9*/("""@-webkit-keyframes particle-c """),format.raw/*325.40*/("""{"""),format.raw/*325.41*/("""
    """),format.raw/*326.5*/("""0% """),format.raw/*326.8*/("""{"""),format.raw/*326.9*/("""
    """),format.raw/*327.5*/("""-webkit-transform: translate3D(-1rem,-3rem,0);
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*330.5*/("""}"""),format.raw/*330.6*/("""

    """),format.raw/*332.5*/("""25% """),format.raw/*332.9*/("""{"""),format.raw/*332.10*/("""
    """),format.raw/*333.5*/("""width: 1.3rem;
    height: 1.3rem;
    """),format.raw/*335.5*/("""}"""),format.raw/*335.6*/("""

    """),format.raw/*337.5*/("""50% """),format.raw/*337.9*/("""{"""),format.raw/*337.10*/("""
    """),format.raw/*338.5*/("""-webkit-transform: translate3D(2rem, 2.5rem, 0);
    opacity: 1;
    z-index: 1;
    -webkit-animation-timing-function: ease-in-out;
    """),format.raw/*342.5*/("""}"""),format.raw/*342.6*/("""

    """),format.raw/*344.5*/("""55% """),format.raw/*344.9*/("""{"""),format.raw/*344.10*/("""
    """),format.raw/*345.5*/("""z-index: -1;
    """),format.raw/*346.5*/("""}"""),format.raw/*346.6*/("""

    """),format.raw/*348.5*/("""75% """),format.raw/*348.9*/("""{"""),format.raw/*348.10*/("""
    """),format.raw/*349.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*352.5*/("""}"""),format.raw/*352.6*/("""

    """),format.raw/*354.5*/("""100% """),format.raw/*354.10*/("""{"""),format.raw/*354.11*/("""
    """),format.raw/*355.5*/("""-webkit-transform: translate3D(-1rem,-3rem,0);
    z-index: -1;
    """),format.raw/*357.5*/("""}"""),format.raw/*357.6*/("""
    """),format.raw/*358.5*/("""}"""),format.raw/*358.6*/("""

        """),format.raw/*360.9*/("""@-moz-keyframes particle-c """),format.raw/*360.37*/("""{"""),format.raw/*360.38*/("""
    """),format.raw/*361.5*/("""0% """),format.raw/*361.8*/("""{"""),format.raw/*361.9*/("""
    """),format.raw/*362.5*/("""-moz-transform: translate3D(-1rem,-3rem,0);
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*365.5*/("""}"""),format.raw/*365.6*/("""

    """),format.raw/*367.5*/("""25% """),format.raw/*367.9*/("""{"""),format.raw/*367.10*/("""
    """),format.raw/*368.5*/("""width: 1.3rem;
    height: 1.3rem;
    """),format.raw/*370.5*/("""}"""),format.raw/*370.6*/("""

    """),format.raw/*372.5*/("""50% """),format.raw/*372.9*/("""{"""),format.raw/*372.10*/("""
    """),format.raw/*373.5*/("""-moz-transform: translate3D(2rem, 2.5rem, 0);
    opacity: 1;
    z-index: 1;
    -moz-animation-timing-function: ease-in-out;
    """),format.raw/*377.5*/("""}"""),format.raw/*377.6*/("""

    """),format.raw/*379.5*/("""55% """),format.raw/*379.9*/("""{"""),format.raw/*379.10*/("""
    """),format.raw/*380.5*/("""z-index: -1;
    """),format.raw/*381.5*/("""}"""),format.raw/*381.6*/("""

    """),format.raw/*383.5*/("""75% """),format.raw/*383.9*/("""{"""),format.raw/*383.10*/("""
    """),format.raw/*384.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*387.5*/("""}"""),format.raw/*387.6*/("""

    """),format.raw/*389.5*/("""100% """),format.raw/*389.10*/("""{"""),format.raw/*389.11*/("""
    """),format.raw/*390.5*/("""-moz-transform: translate3D(-1rem,-3rem,0);
    z-index: -1;
    """),format.raw/*392.5*/("""}"""),format.raw/*392.6*/("""
    """),format.raw/*393.5*/("""}"""),format.raw/*393.6*/("""

        """),format.raw/*395.9*/("""@-o-keyframes particle-c """),format.raw/*395.35*/("""{"""),format.raw/*395.36*/("""
    """),format.raw/*396.5*/("""0% """),format.raw/*396.8*/("""{"""),format.raw/*396.9*/("""
    """),format.raw/*397.5*/("""-o-transform: translate3D(-1rem,-3rem,0);
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*400.5*/("""}"""),format.raw/*400.6*/("""

    """),format.raw/*402.5*/("""25% """),format.raw/*402.9*/("""{"""),format.raw/*402.10*/("""
    """),format.raw/*403.5*/("""width: 1.3rem;
    height: 1.3rem;
    """),format.raw/*405.5*/("""}"""),format.raw/*405.6*/("""

    """),format.raw/*407.5*/("""50% """),format.raw/*407.9*/("""{"""),format.raw/*407.10*/("""
    """),format.raw/*408.5*/("""-o-transform: translate3D(2rem, 2.5rem, 0);
    opacity: 1;
    z-index: 1;
    -o-animation-timing-function: ease-in-out;
    """),format.raw/*412.5*/("""}"""),format.raw/*412.6*/("""

    """),format.raw/*414.5*/("""55% """),format.raw/*414.9*/("""{"""),format.raw/*414.10*/("""
    """),format.raw/*415.5*/("""z-index: -1;
    """),format.raw/*416.5*/("""}"""),format.raw/*416.6*/("""

    """),format.raw/*418.5*/("""75% """),format.raw/*418.9*/("""{"""),format.raw/*418.10*/("""
    """),format.raw/*419.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*422.5*/("""}"""),format.raw/*422.6*/("""

    """),format.raw/*424.5*/("""100% """),format.raw/*424.10*/("""{"""),format.raw/*424.11*/("""
    """),format.raw/*425.5*/("""-o-transform: translate3D(-1rem,-3rem,0);
    z-index: -1;
    """),format.raw/*427.5*/("""}"""),format.raw/*427.6*/("""
    """),format.raw/*428.5*/("""}"""),format.raw/*428.6*/("""

        """),format.raw/*430.9*/("""@keyframes particle-c """),format.raw/*430.32*/("""{"""),format.raw/*430.33*/("""
    """),format.raw/*431.5*/("""0% """),format.raw/*431.8*/("""{"""),format.raw/*431.9*/("""
    """),format.raw/*432.5*/("""transform: translate3D(-1rem,-3rem,0);
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*435.5*/("""}"""),format.raw/*435.6*/("""

    """),format.raw/*437.5*/("""25% """),format.raw/*437.9*/("""{"""),format.raw/*437.10*/("""
    """),format.raw/*438.5*/("""width: 1.3rem;
    height: 1.3rem;
    """),format.raw/*440.5*/("""}"""),format.raw/*440.6*/("""

    """),format.raw/*442.5*/("""50% """),format.raw/*442.9*/("""{"""),format.raw/*442.10*/("""
    """),format.raw/*443.5*/("""transform: translate3D(2rem, 2.5rem, 0);
    opacity: 1;
    z-index: 1;
    animation-timing-function: ease-in-out;
    """),format.raw/*447.5*/("""}"""),format.raw/*447.6*/("""

    """),format.raw/*449.5*/("""55% """),format.raw/*449.9*/("""{"""),format.raw/*449.10*/("""
    """),format.raw/*450.5*/("""z-index: -1;
    """),format.raw/*451.5*/("""}"""),format.raw/*451.6*/("""

    """),format.raw/*453.5*/("""75% """),format.raw/*453.9*/("""{"""),format.raw/*453.10*/("""
    """),format.raw/*454.5*/("""width: .5rem;
    height: .5rem;
    opacity: .5;
    """),format.raw/*457.5*/("""}"""),format.raw/*457.6*/("""

    """),format.raw/*459.5*/("""100% """),format.raw/*459.10*/("""{"""),format.raw/*459.11*/("""
    """),format.raw/*460.5*/("""transform: translate3D(-1rem,-3rem,0);
    z-index: -1;
    """),format.raw/*462.5*/("""}"""),format.raw/*462.6*/("""
    """),format.raw/*463.5*/("""}"""),format.raw/*463.6*/("""
    """),format.raw/*464.5*/("""</style>

            <!--[if IE 9]>
<style>
.error-text """),format.raw/*468.13*/("""{"""),format.raw/*468.14*/("""
	"""),format.raw/*469.2*/("""color: #333 !important;
"""),format.raw/*470.1*/("""}"""),format.raw/*470.2*/("""
"""),format.raw/*471.1*/(""".particle """),format.raw/*471.11*/("""{"""),format.raw/*471.12*/("""
	"""),format.raw/*472.2*/("""display:none;
"""),format.raw/*473.1*/("""}"""),format.raw/*473.2*/("""
"""),format.raw/*474.1*/("""</style>
<![endif]-->

            <!-- row -->
        <div class="row">

            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

                <div class="row">
                    <div class="col-sm-12">
                        <div class="text-center error-box">
                            <h1 class="error-text-2 bounceInDown animated"> Error 404 <span class="particle particle--c"></span><span class="particle particle--a"></span><span class="particle particle--b"></span></h1>
                            <h2 class="font-xl"><strong><i class="fa fa-fw fa-warning fa-lg text-warning"></i> Page <u>Not</u> Found</strong></h2>
                            <br>
                            <p class="lead">
                                The page you requested could not be found, either contact your webmaster or try again. Use your browsers <b>Back</b> button to navigate to the page you have prevously come from
                            </p>
                            <p class="font-md">
                                <b>... That didn't work on you? Dang. May we suggest a search, then?</b>
                            </p>
                            <br>
                            <div class="error-search well well-lg padding-10">
                                <div class="input-group">
                                    <input class="form-control input-lg" type="text" placeholder="let's try this again" id="search-error">
                                    <span class="input-group-addon"><i class="fa fa-fw fa-lg fa-search"></i></span>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col-sm-12">
                                    <ul class="list-inline">
                                        <li>
                                                &nbsp;<a href="javascript:void(0);">Dashbaord</a>&nbsp;
                                        </li>
                                        <li>
                                            .
                                        </li>
                                        <li>
                                                &nbsp;<a href="javascript:void(0);">Inbox (14)</a>&nbsp;
                                        </li>
                                        <li>
                                            .
                                        </li>
                                        <li>
                                                &nbsp;<a href="javascript:void(0);">Calendar</a>&nbsp;
                                        </li>
                                        <li>
                                            .
                                        </li>
                                        <li>
                                                &nbsp;<a href="javascript:void(0);">Gallery</a>&nbsp;
                                        </li>
                                        <li>
                                            .
                                        </li>
                                        <li>
                                                &nbsp;<a href="javascript:void(0);">My Profile</a>&nbsp;
                                        </li>
                                    </ul>
                                </div>

                            </div>

                        </div>

                    </div>

                </div>

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
             * $("[rel=popover-hover]").popover("""),format.raw/*560.49*/("""{"""),format.raw/*560.50*/(""" """),format.raw/*560.51*/("""trigger: "hover" """),format.raw/*560.68*/("""}"""),format.raw/*560.69*/(""");
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
             * var pagefunction = function() """),format.raw/*585.46*/("""{"""),format.raw/*585.47*/("""
             """),format.raw/*586.14*/("""*   ...
             * """),format.raw/*587.16*/("""}"""),format.raw/*587.17*/("""
             """),format.raw/*588.14*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
             *
             * TO LOAD A SCRIPT:
             * var pagefunction = function ()"""),format.raw/*591.46*/("""{"""),format.raw/*591.47*/("""
             """),format.raw/*592.14*/("""*  loadScript(".../plugin.js", run_after_loaded);
             * """),format.raw/*593.16*/("""}"""),format.raw/*593.17*/("""
             """),format.raw/*594.14*/("""*
             * OR
             *
             * loadScript(".../plugin.js", run_after_loaded);
             */

            // pagefunction

            var pagefunction = function() """),format.raw/*602.43*/("""{"""),format.raw/*602.44*/("""

            """),format.raw/*604.13*/("""}"""),format.raw/*604.14*/(""";

            // end pagefunction

            // run pagefunction on load
            pagefunction();

            </script>
        </div></div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Aug 28 21:08:48 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/error404.scala.html
                  HASH: f538bd492c9eae0c8b4878ea9b0bc2bfd8815495
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|828->105|856->106|887->111|1213->410|1241->411|1273->416|1311->426|1340->427|1372->432|1689->722|1717->723|1749->728|1790->741|1819->742|1851->747|2086->955|2114->956|2146->961|2187->974|2216->975|2248->980|2514->1219|2542->1220|2574->1225|2615->1238|2644->1239|2676->1244|2942->1483|2970->1484|3028->1515|3057->1516|3089->1521|3119->1524|3147->1525|3179->1530|3325->1649|3353->1650|3381->1651|3413->1655|3442->1656|3474->1661|3540->1700|3568->1701|3601->1707|3632->1711|3661->1712|3693->1717|3855->1852|3883->1853|3916->1859|3947->1863|3976->1864|4008->1869|4052->1886|4080->1887|4113->1893|4144->1897|4173->1898|4205->1903|4288->1959|4316->1960|4349->1966|4382->1971|4411->1972|4443->1977|4538->2045|4566->2046|4598->2051|4626->2052|4663->2062|4718->2090|4747->2091|4779->2096|4809->2099|4837->2100|4869->2105|5009->2218|5037->2219|5070->2225|5101->2229|5130->2230|5162->2235|5228->2274|5256->2275|5289->2281|5320->2285|5349->2286|5381->2291|5537->2420|5565->2421|5598->2427|5629->2431|5658->2432|5691->2437|5736->2454|5765->2455|5799->2461|5831->2465|5861->2466|5894->2471|5978->2527|6007->2528|6041->2534|6075->2539|6105->2540|6138->2545|6231->2610|6260->2611|6293->2616|6322->2617|6360->2627|6414->2653|6444->2654|6477->2659|6508->2662|6537->2663|6570->2668|6707->2777|6736->2778|6770->2784|6802->2788|6832->2789|6865->2794|6932->2833|6961->2834|6995->2840|7027->2844|7057->2845|7090->2850|7243->2975|7272->2976|7306->2982|7338->2986|7368->2987|7401->2992|7446->3009|7475->3010|7509->3016|7541->3020|7571->3021|7604->3026|7688->3082|7717->3083|7751->3089|7785->3094|7815->3095|7848->3100|7939->3163|7968->3164|8001->3169|8030->3170|8068->3180|8119->3203|8149->3204|8182->3209|8213->3212|8242->3213|8275->3218|8406->3321|8435->3322|8469->3328|8501->3332|8531->3333|8564->3338|8631->3377|8660->3378|8694->3384|8726->3388|8756->3389|8789->3394|8936->3513|8965->3514|8999->3520|9031->3524|9061->3525|9094->3530|9139->3547|9168->3548|9202->3554|9234->3558|9264->3559|9297->3564|9381->3620|9410->3621|9444->3627|9478->3632|9508->3633|9541->3638|9629->3698|9658->3699|9691->3704|9720->3705|9758->3715|9817->3746|9847->3747|9880->3752|9911->3755|9940->3756|9973->3761|10119->3879|10148->3880|10182->3886|10214->3890|10244->3891|10277->3896|10344->3935|10373->3936|10407->3942|10439->3946|10469->3947|10502->3952|10668->4090|10697->4091|10731->4097|10763->4101|10793->4102|10826->4107|10871->4124|10900->4125|10934->4131|10966->4135|10996->4136|11029->4141|11111->4195|11140->4196|11174->4202|11208->4207|11238->4208|11271->4213|11366->4280|11395->4281|11428->4286|11457->4287|11495->4297|11551->4325|11581->4326|11614->4331|11645->4334|11674->4335|11707->4340|11847->4452|11876->4453|11910->4459|11942->4463|11972->4464|12005->4469|12072->4508|12101->4509|12135->4515|12167->4519|12197->4520|12230->4525|12390->4657|12419->4658|12453->4664|12485->4668|12515->4669|12548->4674|12593->4691|12622->4692|12656->4698|12688->4702|12718->4703|12751->4708|12833->4762|12862->4763|12896->4769|12930->4774|12960->4775|12993->4780|13085->4844|13114->4845|13147->4850|13176->4851|13214->4861|13268->4887|13298->4888|13331->4893|13362->4896|13391->4897|13424->4902|13560->5010|13589->5011|13623->5017|13655->5021|13685->5022|13718->5027|13785->5066|13814->5067|13848->5073|13880->5077|13910->5078|13943->5083|14099->5211|14128->5212|14162->5218|14194->5222|14224->5223|14257->5228|14302->5245|14331->5246|14365->5252|14397->5256|14427->5257|14460->5262|14542->5316|14571->5317|14605->5323|14639->5328|14669->5329|14702->5334|14792->5396|14821->5397|14854->5402|14883->5403|14921->5413|14972->5436|15002->5437|15035->5442|15066->5445|15095->5446|15128->5451|15258->5553|15287->5554|15321->5560|15353->5564|15383->5565|15416->5570|15483->5609|15512->5610|15546->5616|15578->5620|15608->5621|15641->5626|15791->5748|15820->5749|15854->5755|15886->5759|15916->5760|15949->5765|15994->5782|16023->5783|16057->5789|16089->5793|16119->5794|16152->5799|16234->5853|16263->5854|16297->5860|16331->5865|16361->5866|16394->5871|16481->5930|16510->5931|16543->5936|16572->5937|16610->5947|16669->5978|16699->5979|16732->5984|16763->5987|16792->5988|16825->5993|16972->6112|17001->6113|17035->6119|17067->6123|17097->6124|17130->6129|17197->6168|17226->6169|17260->6175|17292->6179|17322->6180|17355->6185|17520->6322|17549->6323|17583->6329|17615->6333|17645->6334|17678->6339|17723->6356|17752->6357|17786->6363|17818->6367|17848->6368|17881->6373|17963->6427|17992->6428|18026->6434|18060->6439|18090->6440|18123->6445|18219->6513|18248->6514|18281->6519|18310->6520|18348->6530|18404->6558|18434->6559|18467->6564|18498->6567|18527->6568|18560->6573|18701->6686|18730->6687|18764->6693|18796->6697|18826->6698|18859->6703|18926->6742|18955->6743|18989->6749|19021->6753|19051->6754|19084->6759|19243->6890|19272->6891|19306->6897|19338->6901|19368->6902|19401->6907|19446->6924|19475->6925|19509->6931|19541->6935|19571->6936|19604->6941|19686->6995|19715->6996|19749->7002|19783->7007|19813->7008|19846->7013|19939->7078|19968->7079|20001->7084|20030->7085|20068->7095|20122->7121|20152->7122|20185->7127|20216->7130|20245->7131|20278->7136|20415->7245|20444->7246|20478->7252|20510->7256|20540->7257|20573->7262|20640->7301|20669->7302|20703->7308|20735->7312|20765->7313|20798->7318|20953->7445|20982->7446|21016->7452|21048->7456|21078->7457|21111->7462|21156->7479|21185->7480|21219->7486|21251->7490|21281->7491|21314->7496|21396->7550|21425->7551|21459->7557|21493->7562|21523->7563|21556->7568|21647->7631|21676->7632|21709->7637|21738->7638|21776->7648|21827->7671|21857->7672|21890->7677|21921->7680|21950->7681|21983->7686|22114->7789|22143->7790|22177->7796|22209->7800|22239->7801|22272->7806|22339->7845|22368->7846|22402->7852|22434->7856|22464->7857|22497->7862|22646->7983|22675->7984|22709->7990|22741->7994|22771->7995|22804->8000|22849->8017|22878->8018|22912->8024|22944->8028|22974->8029|23007->8034|23089->8088|23118->8089|23152->8095|23186->8100|23216->8101|23249->8106|23337->8166|23366->8167|23399->8172|23428->8173|23461->8178|23547->8235|23577->8236|23607->8238|23659->8262|23688->8263|23717->8264|23756->8274|23786->8275|23816->8277|23858->8291|23887->8292|23916->8293|28017->12365|28047->12366|28077->12367|28123->12384|28153->12385|28934->13137|28964->13138|29007->13152|29059->13175|29089->13176|29132->13190|29312->13341|29342->13342|29385->13356|29479->13421|29509->13422|29552->13436|29766->13621|29796->13622|29839->13636|29869->13637
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|26->5|26->5|27->6|37->16|37->16|38->17|38->17|38->17|39->18|48->27|48->27|49->28|49->28|49->28|50->29|54->33|54->33|55->34|55->34|55->34|56->35|61->40|61->40|62->41|62->41|62->41|63->42|68->47|68->47|68->47|68->47|69->48|69->48|69->48|70->49|73->52|73->52|73->52|73->52|73->52|74->53|76->55|76->55|78->57|78->57|78->57|79->58|83->62|83->62|85->64|85->64|85->64|86->65|87->66|87->66|89->68|89->68|89->68|90->69|93->72|93->72|95->74|95->74|95->74|96->75|98->77|98->77|99->78|99->78|101->80|101->80|101->80|102->81|102->81|102->81|103->82|106->85|106->85|108->87|108->87|108->87|109->88|111->90|111->90|113->92|113->92|113->92|114->93|118->97|118->97|120->99|120->99|120->99|121->100|122->101|122->101|124->103|124->103|124->103|125->104|128->107|128->107|130->109|130->109|130->109|131->110|133->112|133->112|134->113|134->113|136->115|136->115|136->115|137->116|137->116|137->116|138->117|141->120|141->120|143->122|143->122|143->122|144->123|146->125|146->125|148->127|148->127|148->127|149->128|153->132|153->132|155->134|155->134|155->134|156->135|157->136|157->136|159->138|159->138|159->138|160->139|163->142|163->142|165->144|165->144|165->144|166->145|168->147|168->147|169->148|169->148|171->150|171->150|171->150|172->151|172->151|172->151|173->152|176->155|176->155|178->157|178->157|178->157|179->158|181->160|181->160|183->162|183->162|183->162|184->163|188->167|188->167|190->169|190->169|190->169|191->170|192->171|192->171|194->173|194->173|194->173|195->174|198->177|198->177|200->179|200->179|200->179|201->180|203->182|203->182|204->183|204->183|206->185|206->185|206->185|207->186|207->186|207->186|208->187|211->190|211->190|213->192|213->192|213->192|214->193|216->195|216->195|218->197|218->197|218->197|219->198|223->202|223->202|225->204|225->204|225->204|226->205|227->206|227->206|229->208|229->208|229->208|230->209|233->212|233->212|235->214|235->214|235->214|236->215|238->217|238->217|239->218|239->218|241->220|241->220|241->220|242->221|242->221|242->221|243->222|246->225|246->225|248->227|248->227|248->227|249->228|251->230|251->230|253->232|253->232|253->232|254->233|258->237|258->237|260->239|260->239|260->239|261->240|262->241|262->241|264->243|264->243|264->243|265->244|268->247|268->247|270->249|270->249|270->249|271->250|273->252|273->252|274->253|274->253|276->255|276->255|276->255|277->256|277->256|277->256|278->257|281->260|281->260|283->262|283->262|283->262|284->263|286->265|286->265|288->267|288->267|288->267|289->268|293->272|293->272|295->274|295->274|295->274|296->275|297->276|297->276|299->278|299->278|299->278|300->279|303->282|303->282|305->284|305->284|305->284|306->285|308->287|308->287|309->288|309->288|311->290|311->290|311->290|312->291|312->291|312->291|313->292|316->295|316->295|318->297|318->297|318->297|319->298|321->300|321->300|323->302|323->302|323->302|324->303|328->307|328->307|330->309|330->309|330->309|331->310|332->311|332->311|334->313|334->313|334->313|335->314|338->317|338->317|340->319|340->319|340->319|341->320|343->322|343->322|344->323|344->323|346->325|346->325|346->325|347->326|347->326|347->326|348->327|351->330|351->330|353->332|353->332|353->332|354->333|356->335|356->335|358->337|358->337|358->337|359->338|363->342|363->342|365->344|365->344|365->344|366->345|367->346|367->346|369->348|369->348|369->348|370->349|373->352|373->352|375->354|375->354|375->354|376->355|378->357|378->357|379->358|379->358|381->360|381->360|381->360|382->361|382->361|382->361|383->362|386->365|386->365|388->367|388->367|388->367|389->368|391->370|391->370|393->372|393->372|393->372|394->373|398->377|398->377|400->379|400->379|400->379|401->380|402->381|402->381|404->383|404->383|404->383|405->384|408->387|408->387|410->389|410->389|410->389|411->390|413->392|413->392|414->393|414->393|416->395|416->395|416->395|417->396|417->396|417->396|418->397|421->400|421->400|423->402|423->402|423->402|424->403|426->405|426->405|428->407|428->407|428->407|429->408|433->412|433->412|435->414|435->414|435->414|436->415|437->416|437->416|439->418|439->418|439->418|440->419|443->422|443->422|445->424|445->424|445->424|446->425|448->427|448->427|449->428|449->428|451->430|451->430|451->430|452->431|452->431|452->431|453->432|456->435|456->435|458->437|458->437|458->437|459->438|461->440|461->440|463->442|463->442|463->442|464->443|468->447|468->447|470->449|470->449|470->449|471->450|472->451|472->451|474->453|474->453|474->453|475->454|478->457|478->457|480->459|480->459|480->459|481->460|483->462|483->462|484->463|484->463|485->464|489->468|489->468|490->469|491->470|491->470|492->471|492->471|492->471|493->472|494->473|494->473|495->474|581->560|581->560|581->560|581->560|581->560|606->585|606->585|607->586|608->587|608->587|609->588|612->591|612->591|613->592|614->593|614->593|615->594|623->602|623->602|625->604|625->604
                  -- GENERATED --
              */
          