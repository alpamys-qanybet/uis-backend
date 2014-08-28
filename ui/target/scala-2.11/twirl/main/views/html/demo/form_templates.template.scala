
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
object form_templates extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""


    """),format.raw/*5.5*/("""<!-- SCRIPTS ON PAGE EVENT -->
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
     * $("[rel=popover-hover]").popover("""),format.raw/*19.41*/("""{"""),format.raw/*19.42*/(""" """),format.raw/*19.43*/("""trigger: "hover" """),format.raw/*19.60*/("""}"""),format.raw/*19.61*/(""");
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

    var pagefunction = function() """),format.raw/*45.35*/("""{"""),format.raw/*45.36*/("""

    """),format.raw/*47.5*/("""var $checkoutForm = $('#checkout-form').validate("""),format.raw/*47.54*/("""{"""),format.raw/*47.55*/("""
    """),format.raw/*48.5*/("""// Rules for form validation
    rules : """),format.raw/*49.13*/("""{"""),format.raw/*49.14*/("""
    """),format.raw/*50.5*/("""fname : """),format.raw/*50.13*/("""{"""),format.raw/*50.14*/("""
    """),format.raw/*51.5*/("""required : true
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""",
    lname : """),format.raw/*53.13*/("""{"""),format.raw/*53.14*/("""
    """),format.raw/*54.5*/("""required : true
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/(""",
    email : """),format.raw/*56.13*/("""{"""),format.raw/*56.14*/("""
    """),format.raw/*57.5*/("""required : true,
    email : true
    """),format.raw/*59.5*/("""}"""),format.raw/*59.6*/(""",
    phone : """),format.raw/*60.13*/("""{"""),format.raw/*60.14*/("""
    """),format.raw/*61.5*/("""required : true
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""",
    country : """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""
    """),format.raw/*64.5*/("""required : true
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/(""",
    city : """),format.raw/*66.12*/("""{"""),format.raw/*66.13*/("""
    """),format.raw/*67.5*/("""required : true
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""",
    code : """),format.raw/*69.12*/("""{"""),format.raw/*69.13*/("""
    """),format.raw/*70.5*/("""required : true,
    digits : true
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/(""",
    address : """),format.raw/*73.15*/("""{"""),format.raw/*73.16*/("""
    """),format.raw/*74.5*/("""required : true
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""",
    name : """),format.raw/*76.12*/("""{"""),format.raw/*76.13*/("""
    """),format.raw/*77.5*/("""required : true
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""",
    card : """),format.raw/*79.12*/("""{"""),format.raw/*79.13*/("""
    """),format.raw/*80.5*/("""required : true,
    creditcard : true
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""",
    cvv : """),format.raw/*83.11*/("""{"""),format.raw/*83.12*/("""
    """),format.raw/*84.5*/("""required : true,
    digits : true
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/(""",
    month : """),format.raw/*87.13*/("""{"""),format.raw/*87.14*/("""
    """),format.raw/*88.5*/("""required : true
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""",
    year : """),format.raw/*90.12*/("""{"""),format.raw/*90.13*/("""
    """),format.raw/*91.5*/("""required : true,
    digits : true
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""
    """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*97.16*/("""{"""),format.raw/*97.17*/("""
    """),format.raw/*98.5*/("""fname : """),format.raw/*98.13*/("""{"""),format.raw/*98.14*/("""
    """),format.raw/*99.5*/("""required : 'Please enter your first name'
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""",
    lname : """),format.raw/*101.13*/("""{"""),format.raw/*101.14*/("""
    """),format.raw/*102.5*/("""required : 'Please enter your last name'
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""",
    email : """),format.raw/*104.13*/("""{"""),format.raw/*104.14*/("""
    """),format.raw/*105.5*/("""required : 'Please enter your email address',
    email : 'Please enter a VALID email address'
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/(""",
    phone : """),format.raw/*108.13*/("""{"""),format.raw/*108.14*/("""
    """),format.raw/*109.5*/("""required : 'Please enter your phone number'
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/(""",
    country : """),format.raw/*111.15*/("""{"""),format.raw/*111.16*/("""
    """),format.raw/*112.5*/("""required : 'Please select your country'
    """),format.raw/*113.5*/("""}"""),format.raw/*113.6*/(""",
    city : """),format.raw/*114.12*/("""{"""),format.raw/*114.13*/("""
    """),format.raw/*115.5*/("""required : 'Please enter your city'
    """),format.raw/*116.5*/("""}"""),format.raw/*116.6*/(""",
    code : """),format.raw/*117.12*/("""{"""),format.raw/*117.13*/("""
    """),format.raw/*118.5*/("""required : 'Please enter code',
    digits : 'Digits only please'
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""",
    address : """),format.raw/*121.15*/("""{"""),format.raw/*121.16*/("""
    """),format.raw/*122.5*/("""required : 'Please enter your full address'
    """),format.raw/*123.5*/("""}"""),format.raw/*123.6*/(""",
    name : """),format.raw/*124.12*/("""{"""),format.raw/*124.13*/("""
    """),format.raw/*125.5*/("""required : 'Please enter name on your card'
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/(""",
    card : """),format.raw/*127.12*/("""{"""),format.raw/*127.13*/("""
    """),format.raw/*128.5*/("""required : 'Please enter your card number'
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""",
    cvv : """),format.raw/*130.11*/("""{"""),format.raw/*130.12*/("""
    """),format.raw/*131.5*/("""required : 'Enter CVV2',
    digits : 'Digits only'
    """),format.raw/*133.5*/("""}"""),format.raw/*133.6*/(""",
    month : """),format.raw/*134.13*/("""{"""),format.raw/*134.14*/("""
    """),format.raw/*135.5*/("""required : 'Select month'
    """),format.raw/*136.5*/("""}"""),format.raw/*136.6*/(""",
    year : """),format.raw/*137.12*/("""{"""),format.raw/*137.13*/("""
    """),format.raw/*138.5*/("""required : 'Enter year',
    digits : 'Digits only please'
    """),format.raw/*140.5*/("""}"""),format.raw/*140.6*/("""
    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*144.47*/("""{"""),format.raw/*144.48*/("""
    """),format.raw/*145.5*/("""error.insertAfter(element.parent());
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/("""
    """),format.raw/*147.5*/("""}"""),format.raw/*147.6*/(""");

    var $registerForm = $("#smart-form-register").validate("""),format.raw/*149.60*/("""{"""),format.raw/*149.61*/("""

    """),format.raw/*151.5*/("""// Rules for form validation
    rules : """),format.raw/*152.13*/("""{"""),format.raw/*152.14*/("""
    """),format.raw/*153.5*/("""username : """),format.raw/*153.16*/("""{"""),format.raw/*153.17*/("""
    """),format.raw/*154.5*/("""required : true
    """),format.raw/*155.5*/("""}"""),format.raw/*155.6*/(""",
    email : """),format.raw/*156.13*/("""{"""),format.raw/*156.14*/("""
    """),format.raw/*157.5*/("""required : true,
    email : true
    """),format.raw/*159.5*/("""}"""),format.raw/*159.6*/(""",
    password : """),format.raw/*160.16*/("""{"""),format.raw/*160.17*/("""
    """),format.raw/*161.5*/("""required : true,
    minlength : 3,
    maxlength : 20
    """),format.raw/*164.5*/("""}"""),format.raw/*164.6*/(""",
    passwordConfirm : """),format.raw/*165.23*/("""{"""),format.raw/*165.24*/("""
    """),format.raw/*166.5*/("""required : true,
    minlength : 3,
    maxlength : 20,
    equalTo : '#password'
    """),format.raw/*170.5*/("""}"""),format.raw/*170.6*/(""",
    firstname : """),format.raw/*171.17*/("""{"""),format.raw/*171.18*/("""
    """),format.raw/*172.5*/("""required : true
    """),format.raw/*173.5*/("""}"""),format.raw/*173.6*/(""",
    lastname : """),format.raw/*174.16*/("""{"""),format.raw/*174.17*/("""
    """),format.raw/*175.5*/("""required : true
    """),format.raw/*176.5*/("""}"""),format.raw/*176.6*/(""",
    gender : """),format.raw/*177.14*/("""{"""),format.raw/*177.15*/("""
    """),format.raw/*178.5*/("""required : true
    """),format.raw/*179.5*/("""}"""),format.raw/*179.6*/(""",
    terms : """),format.raw/*180.13*/("""{"""),format.raw/*180.14*/("""
    """),format.raw/*181.5*/("""required : true
    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/("""
    """),format.raw/*183.5*/("""}"""),format.raw/*183.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*186.16*/("""{"""),format.raw/*186.17*/("""
    """),format.raw/*187.5*/("""login : """),format.raw/*187.13*/("""{"""),format.raw/*187.14*/("""
    """),format.raw/*188.5*/("""required : 'Please enter your login'
    """),format.raw/*189.5*/("""}"""),format.raw/*189.6*/(""",
    email : """),format.raw/*190.13*/("""{"""),format.raw/*190.14*/("""
    """),format.raw/*191.5*/("""required : 'Please enter your email address',
    email : 'Please enter a VALID email address'
    """),format.raw/*193.5*/("""}"""),format.raw/*193.6*/(""",
    password : """),format.raw/*194.16*/("""{"""),format.raw/*194.17*/("""
    """),format.raw/*195.5*/("""required : 'Please enter your password'
    """),format.raw/*196.5*/("""}"""),format.raw/*196.6*/(""",
    passwordConfirm : """),format.raw/*197.23*/("""{"""),format.raw/*197.24*/("""
    """),format.raw/*198.5*/("""required : 'Please enter your password one more time',
    equalTo : 'Please enter the same password as above'
    """),format.raw/*200.5*/("""}"""),format.raw/*200.6*/(""",
    firstname : """),format.raw/*201.17*/("""{"""),format.raw/*201.18*/("""
    """),format.raw/*202.5*/("""required : 'Please select your first name'
    """),format.raw/*203.5*/("""}"""),format.raw/*203.6*/(""",
    lastname : """),format.raw/*204.16*/("""{"""),format.raw/*204.17*/("""
    """),format.raw/*205.5*/("""required : 'Please select your last name'
    """),format.raw/*206.5*/("""}"""),format.raw/*206.6*/(""",
    gender : """),format.raw/*207.14*/("""{"""),format.raw/*207.15*/("""
    """),format.raw/*208.5*/("""required : 'Please select your gender'
    """),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""",
    terms : """),format.raw/*210.13*/("""{"""),format.raw/*210.14*/("""
    """),format.raw/*211.5*/("""required : 'You must agree with Terms and Conditions'
    """),format.raw/*212.5*/("""}"""),format.raw/*212.6*/("""
    """),format.raw/*213.5*/("""}"""),format.raw/*213.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*216.47*/("""{"""),format.raw/*216.48*/("""
    """),format.raw/*217.5*/("""error.insertAfter(element.parent());
    """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/("""
    """),format.raw/*219.5*/("""}"""),format.raw/*219.6*/(""");

    var $reviewForm = $("#review-form").validate("""),format.raw/*221.50*/("""{"""),format.raw/*221.51*/("""
    """),format.raw/*222.5*/("""// Rules for form validation
    rules : """),format.raw/*223.13*/("""{"""),format.raw/*223.14*/("""
    """),format.raw/*224.5*/("""name : """),format.raw/*224.12*/("""{"""),format.raw/*224.13*/("""
    """),format.raw/*225.5*/("""required : true
    """),format.raw/*226.5*/("""}"""),format.raw/*226.6*/(""",
    email : """),format.raw/*227.13*/("""{"""),format.raw/*227.14*/("""
    """),format.raw/*228.5*/("""required : true,
    email : true
    """),format.raw/*230.5*/("""}"""),format.raw/*230.6*/(""",
    review : """),format.raw/*231.14*/("""{"""),format.raw/*231.15*/("""
    """),format.raw/*232.5*/("""required : true,
    minlength : 20
    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/(""",
    quality : """),format.raw/*235.15*/("""{"""),format.raw/*235.16*/("""
    """),format.raw/*236.5*/("""required : true
    """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/(""",
    reliability : """),format.raw/*238.19*/("""{"""),format.raw/*238.20*/("""
    """),format.raw/*239.5*/("""required : true
    """),format.raw/*240.5*/("""}"""),format.raw/*240.6*/(""",
    overall : """),format.raw/*241.15*/("""{"""),format.raw/*241.16*/("""
    """),format.raw/*242.5*/("""required : true
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""
    """),format.raw/*244.5*/("""}"""),format.raw/*244.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*247.16*/("""{"""),format.raw/*247.17*/("""
    """),format.raw/*248.5*/("""name : """),format.raw/*248.12*/("""{"""),format.raw/*248.13*/("""
    """),format.raw/*249.5*/("""required : 'Please enter your name'
    """),format.raw/*250.5*/("""}"""),format.raw/*250.6*/(""",
    email : """),format.raw/*251.13*/("""{"""),format.raw/*251.14*/("""
    """),format.raw/*252.5*/("""required : 'Please enter your email address',
    email : '<i class="fa fa-warning"></i><strong>Please enter a VALID email addres</strong>'
    """),format.raw/*254.5*/("""}"""),format.raw/*254.6*/(""",
    review : """),format.raw/*255.14*/("""{"""),format.raw/*255.15*/("""
    """),format.raw/*256.5*/("""required : 'Please enter your review'
    """),format.raw/*257.5*/("""}"""),format.raw/*257.6*/(""",
    quality : """),format.raw/*258.15*/("""{"""),format.raw/*258.16*/("""
    """),format.raw/*259.5*/("""required : 'Please rate quality of the product'
    """),format.raw/*260.5*/("""}"""),format.raw/*260.6*/(""",
    reliability : """),format.raw/*261.19*/("""{"""),format.raw/*261.20*/("""
    """),format.raw/*262.5*/("""required : 'Please rate reliability of the product'
    """),format.raw/*263.5*/("""}"""),format.raw/*263.6*/(""",
    overall : """),format.raw/*264.15*/("""{"""),format.raw/*264.16*/("""
    """),format.raw/*265.5*/("""required : 'Please rate the product'
    """),format.raw/*266.5*/("""}"""),format.raw/*266.6*/("""
    """),format.raw/*267.5*/("""}"""),format.raw/*267.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*270.47*/("""{"""),format.raw/*270.48*/("""
    """),format.raw/*271.5*/("""error.insertAfter(element.parent());
    """),format.raw/*272.5*/("""}"""),format.raw/*272.6*/("""
    """),format.raw/*273.5*/("""}"""),format.raw/*273.6*/(""");

    var $commentForm = $("#comment-form").validate("""),format.raw/*275.52*/("""{"""),format.raw/*275.53*/("""
    """),format.raw/*276.5*/("""// Rules for form validation
    rules : """),format.raw/*277.13*/("""{"""),format.raw/*277.14*/("""
    """),format.raw/*278.5*/("""name : """),format.raw/*278.12*/("""{"""),format.raw/*278.13*/("""
    """),format.raw/*279.5*/("""required : true
    """),format.raw/*280.5*/("""}"""),format.raw/*280.6*/(""",
    email : """),format.raw/*281.13*/("""{"""),format.raw/*281.14*/("""
    """),format.raw/*282.5*/("""required : true,
    email : true
    """),format.raw/*284.5*/("""}"""),format.raw/*284.6*/(""",
    url : """),format.raw/*285.11*/("""{"""),format.raw/*285.12*/("""
    """),format.raw/*286.5*/("""url : true
    """),format.raw/*287.5*/("""}"""),format.raw/*287.6*/(""",
    comment : """),format.raw/*288.15*/("""{"""),format.raw/*288.16*/("""
    """),format.raw/*289.5*/("""required : true
    """),format.raw/*290.5*/("""}"""),format.raw/*290.6*/("""
    """),format.raw/*291.5*/("""}"""),format.raw/*291.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*294.16*/("""{"""),format.raw/*294.17*/("""
    """),format.raw/*295.5*/("""name : """),format.raw/*295.12*/("""{"""),format.raw/*295.13*/("""
    """),format.raw/*296.5*/("""required : 'Enter your name',
    """),format.raw/*297.5*/("""}"""),format.raw/*297.6*/(""",
    email : """),format.raw/*298.13*/("""{"""),format.raw/*298.14*/("""
    """),format.raw/*299.5*/("""required : 'Enter your email address',
    email : 'Enter a VALID email'
    """),format.raw/*301.5*/("""}"""),format.raw/*301.6*/(""",
    url : """),format.raw/*302.11*/("""{"""),format.raw/*302.12*/("""
    """),format.raw/*303.5*/("""email : 'Enter a VALID url'
    """),format.raw/*304.5*/("""}"""),format.raw/*304.6*/(""",
    comment : """),format.raw/*305.15*/("""{"""),format.raw/*305.16*/("""
    """),format.raw/*306.5*/("""required : 'Please enter your comment'
    """),format.raw/*307.5*/("""}"""),format.raw/*307.6*/("""
    """),format.raw/*308.5*/("""}"""),format.raw/*308.6*/(""",

    // Ajax form submition
    submitHandler : function(form) """),format.raw/*311.36*/("""{"""),format.raw/*311.37*/("""
    """),format.raw/*312.5*/("""$(form).ajaxSubmit("""),format.raw/*312.24*/("""{"""),format.raw/*312.25*/("""
    """),format.raw/*313.5*/("""success : function() """),format.raw/*313.26*/("""{"""),format.raw/*313.27*/("""
    """),format.raw/*314.5*/("""$("#comment-form").addClass('submited');
    """),format.raw/*315.5*/("""}"""),format.raw/*315.6*/("""
    """),format.raw/*316.5*/("""}"""),format.raw/*316.6*/(""");
    """),format.raw/*317.5*/("""}"""),format.raw/*317.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*320.47*/("""{"""),format.raw/*320.48*/("""
    """),format.raw/*321.5*/("""error.insertAfter(element.parent());
    """),format.raw/*322.5*/("""}"""),format.raw/*322.6*/("""
    """),format.raw/*323.5*/("""}"""),format.raw/*323.6*/(""");

    var $contactForm = $("#contact-form").validate("""),format.raw/*325.52*/("""{"""),format.raw/*325.53*/("""
    """),format.raw/*326.5*/("""// Rules for form validation
    rules : """),format.raw/*327.13*/("""{"""),format.raw/*327.14*/("""
    """),format.raw/*328.5*/("""name : """),format.raw/*328.12*/("""{"""),format.raw/*328.13*/("""
    """),format.raw/*329.5*/("""required : true
    """),format.raw/*330.5*/("""}"""),format.raw/*330.6*/(""",
    email : """),format.raw/*331.13*/("""{"""),format.raw/*331.14*/("""
    """),format.raw/*332.5*/("""required : true,
    email : true
    """),format.raw/*334.5*/("""}"""),format.raw/*334.6*/(""",
    message : """),format.raw/*335.15*/("""{"""),format.raw/*335.16*/("""
    """),format.raw/*336.5*/("""required : true,
    minlength : 10
    """),format.raw/*338.5*/("""}"""),format.raw/*338.6*/("""
    """),format.raw/*339.5*/("""}"""),format.raw/*339.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*342.16*/("""{"""),format.raw/*342.17*/("""
    """),format.raw/*343.5*/("""name : """),format.raw/*343.12*/("""{"""),format.raw/*343.13*/("""
    """),format.raw/*344.5*/("""required : 'Please enter your name',
    """),format.raw/*345.5*/("""}"""),format.raw/*345.6*/(""",
    email : """),format.raw/*346.13*/("""{"""),format.raw/*346.14*/("""
    """),format.raw/*347.5*/("""required : 'Please enter your email address',
    email : 'Please enter a VALID email address'
    """),format.raw/*349.5*/("""}"""),format.raw/*349.6*/(""",
    message : """),format.raw/*350.15*/("""{"""),format.raw/*350.16*/("""
    """),format.raw/*351.5*/("""required : 'Please enter your message'
    """),format.raw/*352.5*/("""}"""),format.raw/*352.6*/("""
    """),format.raw/*353.5*/("""}"""),format.raw/*353.6*/(""",

    // Ajax form submition
    submitHandler : function(form) """),format.raw/*356.36*/("""{"""),format.raw/*356.37*/("""
    """),format.raw/*357.5*/("""$(form).ajaxSubmit("""),format.raw/*357.24*/("""{"""),format.raw/*357.25*/("""
    """),format.raw/*358.5*/("""success : function() """),format.raw/*358.26*/("""{"""),format.raw/*358.27*/("""
    """),format.raw/*359.5*/("""$("#contact-form").addClass('submited');
    """),format.raw/*360.5*/("""}"""),format.raw/*360.6*/("""
    """),format.raw/*361.5*/("""}"""),format.raw/*361.6*/(""");
    """),format.raw/*362.5*/("""}"""),format.raw/*362.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*365.47*/("""{"""),format.raw/*365.48*/("""
    """),format.raw/*366.5*/("""error.insertAfter(element.parent());
    """),format.raw/*367.5*/("""}"""),format.raw/*367.6*/("""
    """),format.raw/*368.5*/("""}"""),format.raw/*368.6*/(""");

    var $orderForm = $("#order-form").validate("""),format.raw/*370.48*/("""{"""),format.raw/*370.49*/("""
    """),format.raw/*371.5*/("""// Rules for form validation
    rules : """),format.raw/*372.13*/("""{"""),format.raw/*372.14*/("""
    """),format.raw/*373.5*/("""name : """),format.raw/*373.12*/("""{"""),format.raw/*373.13*/("""
    """),format.raw/*374.5*/("""required : true
    """),format.raw/*375.5*/("""}"""),format.raw/*375.6*/(""",
    email : """),format.raw/*376.13*/("""{"""),format.raw/*376.14*/("""
    """),format.raw/*377.5*/("""required : true,
    email : true
    """),format.raw/*379.5*/("""}"""),format.raw/*379.6*/(""",
    phone : """),format.raw/*380.13*/("""{"""),format.raw/*380.14*/("""
    """),format.raw/*381.5*/("""required : true
    """),format.raw/*382.5*/("""}"""),format.raw/*382.6*/(""",
    interested : """),format.raw/*383.18*/("""{"""),format.raw/*383.19*/("""
    """),format.raw/*384.5*/("""required : true
    """),format.raw/*385.5*/("""}"""),format.raw/*385.6*/(""",
    budget : """),format.raw/*386.14*/("""{"""),format.raw/*386.15*/("""
    """),format.raw/*387.5*/("""required : true
    """),format.raw/*388.5*/("""}"""),format.raw/*388.6*/("""
    """),format.raw/*389.5*/("""}"""),format.raw/*389.6*/(""",

    // Messages for form validation
    messages : """),format.raw/*392.16*/("""{"""),format.raw/*392.17*/("""
    """),format.raw/*393.5*/("""name : """),format.raw/*393.12*/("""{"""),format.raw/*393.13*/("""
    """),format.raw/*394.5*/("""required : 'Please enter your name'
    """),format.raw/*395.5*/("""}"""),format.raw/*395.6*/(""",
    email : """),format.raw/*396.13*/("""{"""),format.raw/*396.14*/("""
    """),format.raw/*397.5*/("""required : 'Please enter your email address',
    email : 'Please enter a VALID email address'
    """),format.raw/*399.5*/("""}"""),format.raw/*399.6*/(""",
    phone : """),format.raw/*400.13*/("""{"""),format.raw/*400.14*/("""
    """),format.raw/*401.5*/("""required : 'Please enter your phone number'
    """),format.raw/*402.5*/("""}"""),format.raw/*402.6*/(""",
    interested : """),format.raw/*403.18*/("""{"""),format.raw/*403.19*/("""
    """),format.raw/*404.5*/("""required : 'Please select interested service'
    """),format.raw/*405.5*/("""}"""),format.raw/*405.6*/(""",
    budget : """),format.raw/*406.14*/("""{"""),format.raw/*406.15*/("""
    """),format.raw/*407.5*/("""required : 'Please select your budget'
    """),format.raw/*408.5*/("""}"""),format.raw/*408.6*/("""
    """),format.raw/*409.5*/("""}"""),format.raw/*409.6*/(""",

    // Do not change code below
    errorPlacement : function(error, element) """),format.raw/*412.47*/("""{"""),format.raw/*412.48*/("""
    """),format.raw/*413.5*/("""error.insertAfter(element.parent());
    """),format.raw/*414.5*/("""}"""),format.raw/*414.6*/("""
    """),format.raw/*415.5*/("""}"""),format.raw/*415.6*/(""");

    // START AND FINISH DATE
    $('#startdate').datepicker("""),format.raw/*418.32*/("""{"""),format.raw/*418.33*/("""
    """),format.raw/*419.5*/("""dateFormat : 'dd.mm.yy',
    prevText : '<i class="fa fa-chevron-left"></i>',
    nextText : '<i class="fa fa-chevron-right"></i>',
    onSelect : function(selectedDate) """),format.raw/*422.39*/("""{"""),format.raw/*422.40*/("""
    """),format.raw/*423.5*/("""$('#finishdate').datepicker('option', 'minDate', selectedDate);
    """),format.raw/*424.5*/("""}"""),format.raw/*424.6*/("""
    """),format.raw/*425.5*/("""}"""),format.raw/*425.6*/(""");

    $('#finishdate').datepicker("""),format.raw/*427.33*/("""{"""),format.raw/*427.34*/("""
    """),format.raw/*428.5*/("""dateFormat : 'dd.mm.yy',
    prevText : '<i class="fa fa-chevron-left"></i>',
    nextText : '<i class="fa fa-chevron-right"></i>',
    onSelect : function(selectedDate) """),format.raw/*431.39*/("""{"""),format.raw/*431.40*/("""
    """),format.raw/*432.5*/("""$('#startdate').datepicker('option', 'maxDate', selectedDate);
    """),format.raw/*433.5*/("""}"""),format.raw/*433.6*/("""
    """),format.raw/*434.5*/("""}"""),format.raw/*434.6*/(""");

    """),format.raw/*436.5*/("""}"""),format.raw/*436.6*/(""";

    // end pagefunction

    // Load form valisation dependency
    loadScript("js/plugin/jquery-form/jquery-form.min.js", pagefunction);

    </script>

""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*445.2*/("""
"""),_display_(/*446.2*/main(message,scripts)/*446.23*/ {_display_(Seq[Any](format.raw/*446.25*/("""
    """),format.raw/*447.5*/("""<div id="content" style="opacity: 1;">
        <div class="row">
            <div class="col-xs-12 col-sm-9 col-md-9 col-lg-9">
                <h1 class="page-title txt-color-blueDark">

                        <!-- PAGE HEADER -->
                    <i class="fa-fw fa fa-pencil-square-o"></i>
                    Forms
                    <span>&gt;
                        Form Layouts
                    </span>
                </h1>
            </div>

            <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3">

                    <!-- Button trigger modal -->
                <a href="ajax/modal-content/model-content-2.html" data-toggle="modal" data-target="#remoteModal" class="btn btn-success btn-lg pull-right header-btn hidden-mobile">
                    <i class="fa fa-circle-arrow-up fa-lg"></i>
                    Launch form modal
                </a>

                    <!-- MODAL PLACE HOLDER -->
                <div class="modal fade" id="remoteModal" tabindex="-1" role="dialog" aria-labelledby="remoteModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content"></div>
                    </div>
                </div>
                    <!-- END MODAL -->

            </div>
        </div>

        <div class="alert alert-block alert-success">
            <a class="close" data-dismiss="alert" href="#">×</a>
            <h4 class="alert-heading"><i class="fa fa-check-square-o"></i> Check validation!</h4>
            <p>
                You may also check the form validation by clicking on the form action button. Please try and see the results below!
            </p>
        </div>

            <!-- widget grid -->
        <section id="widget-grid" class="">


                <!-- START ROW -->

            <div class="row">

                    <!-- NEW COL START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Checkout Form </h2>

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

                                <form action="" id="checkout-form" class="smart-form" novalidate="novalidate">

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-prepend fa fa-user"></i>
                                                    <input type="text" name="fname" placeholder="First name">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-prepend fa fa-user"></i>
                                                    <input type="text" name="lname" placeholder="Last name">
                                                </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-prepend fa fa-envelope-o"></i>
                                                    <input type="email" name="email" placeholder="E-mail">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-prepend fa fa-phone"></i>
                                                    <input type="tel" name="phone" placeholder="Phone" data-mask="(999) 999-9999">
                                                </label>
                                            </section>
                                        </div>
                                    </fieldset>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-5">
                                                <label class="select">
                                                    <select name="country">
                                                        <option value="0" selected="" disabled="">Country</option>
                                                        <option value="244">Aaland Islands</option>
                                                        <option value="1">Afghanistan</option>
                                                        <option value="2">Albania</option>
                                                        <option value="3">Algeria</option>
                                                        <option value="4">American Samoa</option>
                                                        <option value="5">Andorra</option>
                                                        <option value="6">Angola</option>
                                                        <option value="7">Anguilla</option>
                                                        <option value="8">Antarctica</option>
                                                        <option value="9">Antigua and Barbuda</option>
                                                        <option value="10">Argentina</option>
                                                        <option value="11">Armenia</option>
                                                        <option value="12">Aruba</option>
                                                        <option value="13">Australia</option>
                                                        <option value="14">Austria</option>
                                                        <option value="15">Azerbaijan</option>
                                                        <option value="16">Bahamas</option>
                                                        <option value="17">Bahrain</option>
                                                        <option value="18">Bangladesh</option>
                                                        <option value="19">Barbados</option>
                                                        <option value="20">Belarus</option>
                                                        <option value="21">Belgium</option>
                                                        <option value="22">Belize</option>
                                                        <option value="23">Benin</option>
                                                        <option value="24">Bermuda</option>
                                                        <option value="25">Bhutan</option>
                                                        <option value="26">Bolivia</option>
                                                        <option value="245">Bonaire, Sint Eustatius and Saba</option>
                                                        <option value="27">Bosnia and Herzegovina</option>
                                                        <option value="28">Botswana</option>
                                                        <option value="29">Bouvet Island</option>
                                                        <option value="30">Brazil</option>
                                                        <option value="31">British Indian Ocean Territory</option>
                                                        <option value="32">Brunei Darussalam</option>
                                                        <option value="33">Bulgaria</option>
                                                        <option value="34">Burkina Faso</option>
                                                        <option value="35">Burundi</option>
                                                        <option value="36">Cambodia</option>
                                                        <option value="37">Cameroon</option>
                                                        <option value="38">Canada</option>
                                                        <option value="251">Canary Islands</option>
                                                        <option value="39">Cape Verde</option>
                                                        <option value="40">Cayman Islands</option>
                                                        <option value="41">Central African Republic</option>
                                                        <option value="42">Chad</option>
                                                        <option value="43">Chile</option>
                                                        <option value="44">China</option>
                                                        <option value="45">Christmas Island</option>
                                                        <option value="46">Cocos (Keeling) Islands</option>
                                                        <option value="47">Colombia</option>
                                                        <option value="48">Comoros</option>
                                                        <option value="49">Congo</option>
                                                        <option value="50">Cook Islands</option>
                                                        <option value="51">Costa Rica</option>
                                                        <option value="52">Cote D'Ivoire</option>
                                                        <option value="53">Croatia</option>
                                                        <option value="54">Cuba</option>
                                                        <option value="246">Curacao</option>
                                                        <option value="55">Cyprus</option>
                                                        <option value="56">Czech Republic</option>
                                                        <option value="237">Democratic Republic of Congo</option>
                                                        <option value="57">Denmark</option>
                                                        <option value="58">Djibouti</option>
                                                        <option value="59">Dominica</option>
                                                        <option value="60">Dominican Republic</option>
                                                        <option value="61">East Timor</option>
                                                        <option value="62">Ecuador</option>
                                                        <option value="63">Egypt</option>
                                                        <option value="64">El Salvador</option>
                                                        <option value="65">Equatorial Guinea</option>
                                                        <option value="66">Eritrea</option>
                                                        <option value="67">Estonia</option>
                                                        <option value="68">Ethiopia</option>
                                                        <option value="69">Falkland Islands (Malvinas)</option>
                                                        <option value="70">Faroe Islands</option>
                                                        <option value="71">Fiji</option>
                                                        <option value="72">Finland</option>
                                                        <option value="74">France, skypolitan</option>
                                                        <option value="75">French Guiana</option>
                                                        <option value="76">French Polynesia</option>
                                                        <option value="77">French Southern Territories</option>
                                                        <option value="126">FYROM</option>
                                                        <option value="78">Gabon</option>
                                                        <option value="79">Gambia</option>
                                                        <option value="80">Georgia</option>
                                                        <option value="81">Germany</option>
                                                        <option value="82">Ghana</option>
                                                        <option value="83">Gibraltar</option>
                                                        <option value="84">Greece</option>
                                                        <option value="85">Greenland</option>
                                                        <option value="86">Grenada</option>
                                                        <option value="87">Guadeloupe</option>
                                                        <option value="88">Guam</option>
                                                        <option value="89">Guatemala</option>
                                                        <option value="241">Guernsey</option>
                                                        <option value="90">Guinea</option>
                                                        <option value="91">Guinea-Bissau</option>
                                                        <option value="92">Guyana</option>
                                                        <option value="93">Haiti</option>
                                                        <option value="94">Heard and Mc Donald Islands</option>
                                                        <option value="95">Honduras</option>
                                                        <option value="96">Hong Kong</option>
                                                        <option value="97">Hungary</option>
                                                        <option value="98">Iceland</option>
                                                        <option value="99">India</option>
                                                        <option value="100">Indonesia</option>
                                                        <option value="101">Iran (Islamic Republic of)</option>
                                                        <option value="102">Iraq</option>
                                                        <option value="103">Ireland</option>
                                                        <option value="104">Israel</option>
                                                        <option value="105">Italy</option>
                                                        <option value="106">Jamaica</option>
                                                        <option value="107">Japan</option>
                                                        <option value="240">Jersey</option>
                                                        <option value="108">Jordan</option>
                                                        <option value="109">Kazakhstan</option>
                                                        <option value="110">Kenya</option>
                                                        <option value="111">Kiribati</option>
                                                        <option value="113">Korea, Republic of</option>
                                                        <option value="114">Kuwait</option>
                                                        <option value="115">Kyrgyzstan</option>
                                                        <option value="116">Lao People's Democratic Republic</option>
                                                        <option value="117">Latvia</option>
                                                        <option value="118">Lebanon</option>
                                                        <option value="119">Lesotho</option>
                                                        <option value="120">Liberia</option>
                                                        <option value="121">Libyan Arab Jamahiriya</option>
                                                        <option value="122">Liechtenstein</option>
                                                        <option value="123">Lithuania</option>
                                                        <option value="124">Luxembourg</option>
                                                        <option value="125">Macau</option>
                                                        <option value="127">Madagascar</option>
                                                        <option value="128">Malawi</option>
                                                        <option value="129">Malaysia</option>
                                                        <option value="130">Maldives</option>
                                                        <option value="131">Mali</option>
                                                        <option value="132">Malta</option>
                                                        <option value="133">Marshall Islands</option>
                                                        <option value="134">Martinique</option>
                                                        <option value="135">Mauritania</option>
                                                        <option value="136">Mauritius</option>
                                                        <option value="137">Mayotte</option>
                                                        <option value="138">Mexico</option>
                                                        <option value="139">Micronesia, Federated States of</option>
                                                        <option value="140">Moldova, Republic of</option>
                                                        <option value="141">Monaco</option>
                                                        <option value="142">Mongolia</option>
                                                        <option value="242">Montenegro</option>
                                                        <option value="143">Montser"""),
format.raw("""rat</option>
                                                        <option value="144">Morocco</option>
                                                        <option value="145">Mozambique</option>
                                                        <option value="146">Myanmar</option>
                                                        <option value="147">Namibia</option>
                                                        <option value="148">Nauru</option>
                                                        <option value="149">Nepal</option>
                                                        <option value="150">Netherlands</option>
                                                        <option value="151">Netherlands Antilles</option>
                                                        <option value="152">New Caledonia</option>
                                                        <option value="153">New Zealand</option>
                                                        <option value="154">Nicaragua</option>
                                                        <option value="155">Niger</option>
                                                        <option value="156">Nigeria</option>
                                                        <option value="157">Niue</option>
                                                        <option value="158">Norfolk Island</option>
                                                        <option value="112">North Korea</option>
                                                        <option value="159">Northern Mariana Islands</option>
                                                        <option value="160">Norway</option>
                                                        <option value="161">Oman</option>
                                                        <option value="162">Pakistan</option>
                                                        <option value="163">Palau</option>
                                                        <option value="247">Palestinian Territory, Occupied</option>
                                                        <option value="164">Panama</option>
                                                        <option value="165">Papua New Guinea</option>
                                                        <option value="166">Paraguay</option>
                                                        <option value="167">Peru</option>
                                                        <option value="168">Philippines</option>
                                                        <option value="169">Pitcairn</option>
                                                        <option value="170">Poland</option>
                                                        <option value="171">Portugal</option>
                                                        <option value="172">Puerto Rico</option>
                                                        <option value="173">Qatar</option>
                                                        <option value="174">Reunion</option>
                                                        <option value="175">Romania</option>
                                                        <option value="176">Russian Federation</option>
                                                        <option value="177">Rwanda</option>
                                                        <option value="178">Saint Kitts and Nevis</option>
                                                        <option value="179">Saint Lucia</option>
                                                        <option value="180">Saint Vincent and the Grenadines</option>
                                                        <option value="181">Samoa</option>
                                                        <option value="182">San Marino</option>
                                                        <option value="183">Sao Tome and Principe</option>
                                                        <option value="184">Saudi Arabia</option>
                                                        <option value="185">Senegal</option>
                                                        <option value="243">Serbia</option>
                                                        <option value="186">Seychelles</option>
                                                        <option value="187">Sierra Leone</option>
                                                        <option value="188">Singapore</option>
                                                        <option value="189">Slovak Republic</option>
                                                        <option value="190">Slovenia</option>
                                                        <option value="191">Solomon Islands</option>
                                                        <option value="192">Somalia</option>
                                                        <option value="193">South Africa</option>
                                                        <option value="194">South Georgia &amp; South Sandwich Islands</option>
                                                        <option value="248">South Sudan</option>
                                                        <option value="195">Spain</option>
                                                        <option value="196">Sri Lanka</option>
                                                        <option value="249">St. Barthelemy</option>
                                                        <option value="197">St. Helena</option>
                                                        <option value="250">St. Martin (French part)</option>
                                                        <option value="198">St. Pierre and Miquelon</option>
                                                        <option value="199">Sudan</option>
                                                        <option value="200">Suriname</option>
                                                        <option value="201">Svalbard and Jan Mayen Islands</option>
                                                        <option value="202">Swaziland</option>
                                                        <option value="203">Sweden</option>
                                                        <option value="204">Switzerland</option>
                                                        <option value="205">Syrian Arab Republic</option>
                                                        <option value="206">Taiwan</option>
                                                        <option value="207">Tajikistan</option>
                                                        <option value="208">Tanzania, United Republic of</option>
                                                        <option value="209">Thailand</option>
                                                        <option value="210">Togo</option>
                                                        <option value="211">Tokelau</option>
                                                        <option value="212">Tonga</option>
                                                        <option value="213">Trinidad and Tobago</option>
                                                        <option value="214">Tunisia</option>
                                                        <option value="215">Turkey</option>
                                                        <option value="216">Turkmenistan</option>
                                                        <option value="217">Turks and Caicos Islands</option>
                                                        <option value="218">Tuvalu</option>
                                                        <option value="219">Uganda</option>
                                                        <option value="220">Ukraine</option>
                                                        <option value="221">United Arab Emirates</option>
                                                        <option value="222">United Kingdom</option>
                                                        <option value="223">United States</option>
                                                        <option value="224">United States Minor Outlying Islands</option>
                                                        <option value="225">Uruguay</option>
                                                        <option value="226">Uzbekistan</option>
                                                        <option value="227">Vanuatu</option>
                                                        <option value="228">Vatican City State (Holy See)</option>
                                                        <option value="229">Venezuela</option>
                                                        <option value="230">Viet Nam</option>
                                                        <option value="231">Virgin Islands (British)</option>
                                                        <option value="232">Virgin Islands (U.S.)</option>
                                                        <option value="233">Wallis and Futuna Islands</option>
                                                        <option value="234">Western Sahara</option>
                                                        <option value="235">Yemen</option>
                                                        <option value="238">Zambia</option>
                                                        <option value="239">Zimbabwe</option>
                                                    </select> <i></i> </label>
                                            </section>

                                            <section class="col col-4">
                                                <label class="input">
                                                    <input type="text" name="city" placeholder="City">
                                                </label>
                                            </section>

                                            <section class="col col-3">
                                                <label class="input">
                                                    <input type="text" name="code" placeholder="Post code">
                                                </label>
                                            </section>
                                        </div>

                                        <section>
                                            <label for="address" class="input">
                                                <input type="text" name="address" placeholder="Address">
                                            </label>
                                        </section>

                                        <section>
                                            <label class="textarea">
                                                <textarea rows="3" name="info" placeholder="Additional info"></textarea>
                                            </label>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <section>
                                            <div class="inline-group">
                                                <label class="radio">
                                                    <input type="radio" name="radio-inline" checked="">
                                                    <i></i>Visa</label>
                                                <label class="radio">
                                                    <input type="radio" name="radio-inline">
                                                    <i></i>MasterCard</label>
                                                <label class="radio">
                                                    <input type="radio" name="radio-inline">
                                                    <i></i>American Express</label>
                                            </div>
                                        </section>

                                        <section>
                                            <label class="input">
                                                <input type="text" name="name" placeholder="Name on card">
                                            </label>
                                        </section>

                                        <div class="row">
                                            <section class="col col-10">
                                                <label class="input">
                                                    <input type="text" name="card" placeholder="Card number" data-mask="9999-9999-9999-9999">
                                                </label>
                                            </section>
                                            <section class="col col-2">
                                                <label class="input">
                                                    <input type="text" name="cvv" placeholder="CVV2" data-mask="999">
                                                </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <label class="label col col-4">Expiration date</label>
                                            <section class="col col-5">
                                                <label class="select">
                                                    <select name="month">
                                                        <option value="0" selected="" disabled="">Month</option>
                                                        <option value="1">January</option>
                                                        <option value="1">February</option>
                                                        <option value="3">March</option>
                                                        <option value="4">April</option>
                                                        <option value="5">May</option>
                                                        <option value="6">June</option>
                                                        <option value="7">July</option>
                                                        <option value="8">August</option>
                                                        <option value="9">September</option>
                                                        <option value="10">October</option>
                                                        <option value="11">November</option>
                                                        <option value="12">December</option>
                                                    </select> <i></i> </label>
                                            </section>
                                            <section class="col col-3">
                                                <label class="input">
                                                    <input type="text" name="year" placeholder="Year" data-mask="2099">
                                                </label>
                                            </section>
                                        </div>
                                    </fieldset>

                                    <footer>
                                        <button type="submit" class="btn btn-primary">
                                            Validate Form
                                        </button>
                                    </footer>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-3" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Registration form </h2>

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

                                <form action="" id="order-form" class="smart-form" novalidate="novalidate">
                                    <header>
                                        Order services
                                    </header>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-user"></i>
                                                    <input type="text" name="name" placeholder="Name">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-briefcase"></i>
                                                    <input type="text" name="company" placeholder="Company">
                                                </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-envelope-o"></i>
                                                    <input type="email" name="email" placeholder="E-mail">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-phone"></i>
                                                    <input type="tel" name="phone" placeholder="Phone" data-mask="(999) 999-9999">
                                                </label>
                                            </section>
                                        </div>
                                    </fieldset>

                                    <fiel"""),
format.raw("""dset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="select">
                                                    <select name="interested">
                                                        <option value="0" selected="" disabled="">Interested in</option>
                                                        <option value="1">design</option>
                                                        <option value="1">development</option>
                                                        <option value="2">illustration</option>
                                                        <option value="2">branding</option>
                                                        <option value="3">video</option>
                                                    </select> <i></i> </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="select">
                                                    <select name="budget">
                                                        <option value="0" selected="" disabled="">Budget</option>
                                                        <option value="1">less than 5000$</option>
                                                        <option value="2">5000$ - 10000$</option>
                                                        <option value="3">10000$ - 20000$</option>
                                                        <option value="4">more than 20000$</option>
                                                    </select> <i></i> </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-calendar"></i>
                                                    <input type="text" name="startdate" id="startdate" placeholder="Expected start date" class="hasDatepicker">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-calendar"></i>
                                                    <input type="text" name="finishdate" id="finishdate" placeholder="Expected finish date" class="hasDatepicker">
                                                </label>
                                            </section>
                                        </div>

                                        <section>
                                            <label for="file" class="input input-file">
                                                <div class="button"><input type="file" name="file" onchange="this.parentNode.nextSibling.value = this.value">Browse</div><input type="text" placeholder="Include some files" readonly="">
                                            </label>
                                        </section>

                                        <section>
                                            <label class="textarea"> <i class="icon-append fa fa-comment"></i>
                                                <textarea rows="5" name="comment" placeholder="Tell us about your project"></textarea>
                                            </label>
                                        </section>
                                    </fieldset>
                                    <footer>
                                        <button type="submit" class="btn btn-primary">
                                            Validate Form
                                        </button>
                                    </footer>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-7" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Review form </h2>

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

                                <form action="" id="review-form" class="smart-form" novalidate="novalidate">
                                    <header>
                                        Review form
                                    </header>

                                    <fieldset>
                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-user"></i>
                                                <input type="text" name="name" id="name" placeholder="Your name">
                                            </label>
                                        </section>

                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-envelope-o"></i>
                                                <input type="email" name="email" id="email" placeholder="Your e-mail">
                                            </label>
                                        </section>

                                        <section>
                                            <label class="label"></label>
                                            <label class="textarea"> <i class="icon-append fa fa-comment"></i>
                                                <textarea rows="3" name="review" id="review" placeholder="Text of the review"></textarea>
                                            </label>
                                        </section>

                                        <section>
                                            <div class="rating">
                                                <input type="radio" name="quality" id="quality-5">
                                                <label for="quality-5"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="quality" id="quality-4">
                                                <label for="quality-4"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="quality" id="quality-3">
                                                <label for="quality-3"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="quality" id="quality-2">
                                                <label for="quality-2"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="quality" id="quality-1">
                                                <label for="quality-1"><i class="fa fa-star"></i></label>
                                                Quality of the product
                                            </div>

                                            <div class="rating">
                                                <input type="radio" name="reliability" id="reliability-5">
                                                <label for="reliability-5"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="reliability" id="reliability-4">
                                                <label for="reliability-4"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="reliability" id="reliability-3">
                                                <label for="reliability-3"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="reliability" id="reliability-2">
                                                <label for="reliability-2"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="reliability" id="reliability-1">
                                                <label for="reliability-1"><i class="fa fa-star"></i></label>
                                                Reliability of the product
                                            </div>

                                            <div class="rating">
                                                <input type="radio" name="overall" id="overall-5">
                                                <label for="overall-5"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="overall" id="overall-4">
                                                <label for="overall-4"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="overall" id="overall-3">
                                                <label for="overall-3"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="overall" id="overall-2">
                                                <label for="overall-2"><i class="fa fa-star"></i></label>
                                                <input type="radio" name="overall" id="overall-1">
                                                <label for="overall-1"><i class="fa fa-star"></i></label>
                                                Overall rating
                                            </div>
                                        </section>
                                    </fieldset>
                                    <footer>
                                        <button type="submit" class="btn btn-primary">
                                            Validate Form
                                        </button>
                                    </footer>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- END COL -->

                    <!-- NEW COL START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-4" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Registration form </h2>

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

                                <form action="" id="smart-form-register" class="smart-form" novalidate="novalidate">
                                    <header>
                                        Registration form
                                    </header>

                                    <fieldset>
                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-user"></i>
                                                <input type="text" name="username" placeholder="Username">
                                                <b class="tooltip tooltip-bottom-right">Needed to enter the website</b> </label>
                                        </section>



                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-envelope-o"></i>
                                                <input type="email" name="email" placeholder="Email address">
                                                <b class="tooltip tooltip-bottom-right">Needed to verify your account</b> </label>
                                        </section>

                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-lock"></i>
                                                <input type="password" name="password" placeholder="Password" id="password">
                                                <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                                        </section>

                                        <section>
                                            <label class="input"> <i class="icon-append fa fa-lock"></i>
                                                <input type="password" name="passwordConfirm" placeholder="Confirm password">
                                                <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                                        </section>
                                    </fieldset>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="input">
                                                    <input type="text" name="firstname" placeholder="First name">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input">
                                                    <input type="text" name="lastname" placeholder="Last name">
                                                </label>
                                            </section>
                                        </div>

                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="select">
                                                    <select name="gender">
                                                        <option value="0" selected="" disabled="">Gender</option>
                                                        <option value="1">Male</option>
                                                        <option value="2">Female</option>
                                                        <option value="3">Prefer not to answer</option>
                                                    </select> <i></i> </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="input"> <i class="icon-append fa fa-calendar"></i>
                                                    <input type="text" name="request" placeholder="Request activation on" class="datepicker hasDatepicker" data-dateformat="dd/mm/yy" id="dp1408942959518">
                                                </label>
                                            </section>
                                        </div>

                                        <section>
                                            <label class="checkbox">
                                                <input type="checkbox" name="subscription" id="subscription">
                                                <i></i>I want to receive news and special offers</label>
                                            <label class="checkbox">
                                                <input type="checkbox" name="terms" id="terms">
                                                <i></i>I agree with the Terms and Conditions</label>
                                        </section>
                                    </fieldset>
                                    <footer>
                                        <button type="submit" class="btn btn-primary">
                                            Validate Form
                                        </button>
                                    </footer>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-6" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Comment form </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div clas"""),
format.raw("""s="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body no-padding">

                                <form action="php/demo-comment.php" method="post" id="comment-form" class="smart-form" novalidate="novalidate">
                                    <header>
                                        Comment form
                                    </header>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-4">
                                                <label class="label">Name</label>
                                                <label class="input"> <i class="icon-append fa fa-user"></i>
                                                    <input type="text" name="name">
                                                </label>
                                            </section>
                                            <section class="col col-4">
                                                <label class="label">E-mail</label>
                                                <label class="input"> <i class="icon-append fa fa-envelope-o"></i>
                                                    <input type="email" name="email">
                                                </label>
                                            </section>
                                            <section class="col col-4">
                                                <label class="label">Website</label>
                                                <label class="input"> <i class="icon-append fa fa-globe"></i>
                                                    <input type="url" name="url">
                                                </label>
                                            </section>
                                        </div>

                                        <section>
                                            <label class="label">Comment</label>
                                            <label class="textarea"> <i class="icon-append fa fa-comment"></i> 										<textarea rows="4" name="comment"></textarea> </label>
                                            <div class="note">
                                                You may use these HTML tags and attributes: &lt;a href="" title=""&gt;, &lt;abbr title=""&gt;, &lt;acronym title=""&gt;, &lt;b&gt;, &lt;blockquote cite=""&gt;, &lt;cite&gt;, &lt;code&gt;, &lt;del datetime=""&gt;, &lt;em&gt;, &lt;i&gt;, &lt;q cite=""&gt;, &lt;strike&gt;, &lt;strong&gt;.
                                            </div>
                                        </section>
                                    </fieldset>

                                    <footer>
                                        <button type="submit" name="submit" class="btn btn-primary">
                                            Validate Form
                                        </button>
                                    </footer>

                                    <div class="message">
                                        <i class="fa fa-check fa-lg"></i>
                                        <p>
                                            Your comment was successfully added!
                                        </p>
                                    </div>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->


                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-8" data-widget-editbutton="false" data-widget-custombutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-edit"></i> </span>
                            <h2>Contacts form </h2>

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

                                <form action="demo-contacts.php" method="post" id="contact-form" class="smart-form" novalidate="novalidate">
                                    <header>Contacts form</header>

                                    <fieldset>
                                        <div class="row">
                                            <section class="col col-6">
                                                <label class="label">Name</label>
                                                <label class="input">
                                                    <i class="icon-append fa fa-user"></i>
                                                    <input type="text" name="name" id="name">
                                                </label>
                                            </section>
                                            <section class="col col-6">
                                                <label class="label">E-mail</label>
                                                <label class="input">
                                                    <i class="icon-append fa fa-envelope-o"></i>
                                                    <input type="email" name="email" id="email">
                                                </label>
                                            </section>
                                        </div>

                                        <section>
                                            <label class="label">Subject</label>
                                            <label class="input">
                                                <i class="icon-append fa fa-tag"></i>
                                                <input type="text" name="subject" id="subject">
                                            </label>
                                        </section>

                                        <section>
                                            <label class="label">Message</label>
                                            <label class="textarea">
                                                <i class="icon-append fa fa-comment"></i>
                                                <textarea rows="4" name="message" id="message"></textarea>
                                            </label>
                                        </section>

                                        <section>
                                            <label class="checkbox"><input type="checkbox" name="copy" id="copy"><i></i>Send a copy to my e-mail address</label>
                                        </section>
                                    </fieldset>

                                    <footer>
                                        <button type="submit" class="btn btn-primary">Validate Form</button>
                                    </footer>

                                    <div class="message">
                                        <i class="fa fa-thumbs-up"></i>
                                        <p>Your message was successfully sent!</p>
                                    </div>
                                </form>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->


                </article>
                    <!-- END COL -->

            </div>

                <!-- END ROW -->

        </section>
            <!-- end widget grid -->
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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/form_templates.scala.html
                  HASH: f9381a95fa577a52abce792a787ad45a6a8c6ec2
                  MATRIX: 519->1|607->20|621->27|701->31|734->38|1169->445|1198->446|1227->447|1272->464|1301->465|1844->980|1873->981|1906->987|1983->1036|2012->1037|2044->1042|2113->1083|2142->1084|2174->1089|2210->1097|2239->1098|2271->1103|2318->1123|2346->1124|2388->1138|2417->1139|2449->1144|2496->1164|2524->1165|2566->1179|2595->1180|2627->1185|2692->1223|2720->1224|2762->1238|2791->1239|2823->1244|2870->1264|2898->1265|2942->1281|2971->1282|3003->1287|3050->1307|3078->1308|3119->1321|3148->1322|3180->1327|3227->1347|3255->1348|3296->1361|3325->1362|3357->1367|3423->1406|3451->1407|3495->1423|3524->1424|3556->1429|3603->1449|3631->1450|3672->1463|3701->1464|3733->1469|3780->1489|3808->1490|3849->1503|3878->1504|3910->1509|3980->1552|4008->1553|4048->1565|4077->1566|4109->1571|4175->1610|4203->1611|4245->1625|4274->1626|4306->1631|4353->1651|4381->1652|4422->1665|4451->1666|4483->1671|4549->1710|4577->1711|4609->1716|4637->1717|4719->1771|4748->1772|4780->1777|4816->1785|4845->1786|4877->1791|4951->1837|4980->1838|5023->1852|5053->1853|5086->1858|5159->1903|5188->1904|5231->1918|5261->1919|5294->1924|5421->2023|5450->2024|5493->2038|5523->2039|5556->2044|5632->2092|5661->2093|5706->2109|5736->2110|5769->2115|5841->2159|5870->2160|5912->2173|5942->2174|5975->2179|6043->2219|6072->2220|6114->2233|6144->2234|6177->2239|6275->2309|6304->2310|6349->2326|6379->2327|6412->2332|6488->2380|6517->2381|6559->2394|6589->2395|6622->2400|6698->2448|6727->2449|6769->2462|6799->2463|6832->2468|6907->2515|6936->2516|6977->2528|7007->2529|7040->2534|7124->2590|7153->2591|7196->2605|7226->2606|7259->2611|7317->2641|7346->2642|7388->2655|7418->2656|7451->2661|7542->2724|7571->2725|7604->2730|7633->2731|7743->2812|7773->2813|7806->2818|7875->2859|7904->2860|7937->2865|7966->2866|8058->2929|8088->2930|8122->2936|8192->2977|8222->2978|8255->2983|8295->2994|8325->2995|8358->3000|8406->3020|8435->3021|8478->3035|8508->3036|8541->3041|8607->3079|8636->3080|8682->3097|8712->3098|8745->3103|8832->3162|8861->3163|8914->3187|8944->3188|8977->3193|9091->3279|9120->3280|9167->3298|9197->3299|9230->3304|9278->3324|9307->3325|9353->3342|9383->3343|9416->3348|9464->3368|9493->3369|9537->3384|9567->3385|9600->3390|9648->3410|9677->3411|9720->3425|9750->3426|9783->3431|9831->3451|9860->3452|9893->3457|9922->3458|10005->3512|10035->3513|10068->3518|10105->3526|10135->3527|10168->3532|10237->3573|10266->3574|10309->3588|10339->3589|10372->3594|10499->3693|10528->3694|10574->3711|10604->3712|10637->3717|10709->3761|10738->3762|10791->3786|10821->3787|10854->3792|10997->3907|11026->3908|11073->3926|11103->3927|11136->3932|11211->3979|11240->3980|11286->3997|11316->3998|11349->4003|11423->4049|11452->4050|11496->4065|11526->4066|11559->4071|11630->4114|11659->4115|11702->4129|11732->4130|11765->4135|11851->4193|11880->4194|11913->4199|11942->4200|12052->4281|12082->4282|12115->4287|12184->4328|12213->4329|12246->4334|12275->4335|12357->4388|12387->4389|12420->4394|12490->4435|12520->4436|12553->4441|12589->4448|12619->4449|12652->4454|12700->4474|12729->4475|12772->4489|12802->4490|12835->4495|12901->4533|12930->4534|12974->4549|13004->4550|13037->4555|13105->4595|13134->4596|13179->4612|13209->4613|13242->4618|13290->4638|13319->4639|13368->4659|13398->4660|13431->4665|13479->4685|13508->4686|13553->4702|13583->4703|13616->4708|13664->4728|13693->4729|13726->4734|13755->4735|13838->4789|13868->4790|13901->4795|13937->4802|13967->4803|14000->4808|14068->4848|14097->4849|14140->4863|14170->4864|14203->4869|14375->5013|14404->5014|14448->5029|14478->5030|14511->5035|14581->5077|14610->5078|14655->5094|14685->5095|14718->5100|14798->5152|14827->5153|14876->5173|14906->5174|14939->5179|15023->5235|15052->5236|15097->5252|15127->5253|15160->5258|15229->5299|15258->5300|15291->5305|15320->5306|15430->5387|15460->5388|15493->5393|15562->5434|15591->5435|15624->5440|15653->5441|15737->5496|15767->5497|15800->5502|15870->5543|15900->5544|15933->5549|15969->5556|15999->5557|16032->5562|16080->5582|16109->5583|16152->5597|16182->5598|16215->5603|16281->5641|16310->5642|16351->5654|16381->5655|16414->5660|16457->5675|16486->5676|16531->5692|16561->5693|16594->5698|16642->5718|16671->5719|16704->5724|16733->5725|16816->5779|16846->5780|16879->5785|16915->5792|16945->5793|16978->5798|17040->5832|17069->5833|17112->5847|17142->5848|17175->5853|17280->5930|17309->5931|17350->5943|17380->5944|17413->5949|17473->5981|17502->5982|17547->5998|17577->5999|17610->6004|17681->6047|17710->6048|17743->6053|17772->6054|17866->6119|17896->6120|17929->6125|17977->6144|18007->6145|18040->6150|18090->6171|18120->6172|18153->6177|18226->6222|18255->6223|18288->6228|18317->6229|18352->6236|18381->6237|18491->6318|18521->6319|18554->6324|18623->6365|18652->6366|18685->6371|18714->6372|18798->6427|18828->6428|18861->6433|18931->6474|18961->6475|18994->6480|19030->6487|19060->6488|19093->6493|19141->6513|19170->6514|19213->6528|19243->6529|19276->6534|19342->6572|19371->6573|19416->6589|19446->6590|19479->6595|19547->6635|19576->6636|19609->6641|19638->6642|19721->6696|19751->6697|19784->6702|19820->6709|19850->6710|19883->6715|19952->6756|19981->6757|20024->6771|20054->6772|20087->6777|20214->6876|20243->6877|20288->6893|20318->6894|20351->6899|20422->6942|20451->6943|20484->6948|20513->6949|20607->7014|20637->7015|20670->7020|20718->7039|20748->7040|20781->7045|20831->7066|20861->7067|20894->7072|20967->7117|20996->7118|21029->7123|21058->7124|21093->7131|21122->7132|21232->7213|21262->7214|21295->7219|21364->7260|21393->7261|21426->7266|21455->7267|21535->7318|21565->7319|21598->7324|21668->7365|21698->7366|21731->7371|21767->7378|21797->7379|21830->7384|21878->7404|21907->7405|21950->7419|21980->7420|22013->7425|22079->7463|22108->7464|22151->7478|22181->7479|22214->7484|22262->7504|22291->7505|22339->7524|22369->7525|22402->7530|22450->7550|22479->7551|22523->7566|22553->7567|22586->7572|22634->7592|22663->7593|22696->7598|22725->7599|22808->7653|22838->7654|22871->7659|22907->7666|22937->7667|22970->7672|23038->7712|23067->7713|23110->7727|23140->7728|23173->7733|23300->7832|23329->7833|23372->7847|23402->7848|23435->7853|23511->7901|23540->7902|23588->7921|23618->7922|23651->7927|23729->7977|23758->7978|23802->7993|23832->7994|23865->7999|23936->8042|23965->8043|23998->8048|24027->8049|24137->8130|24167->8131|24200->8136|24269->8177|24298->8178|24331->8183|24360->8184|24453->8248|24483->8249|24516->8254|24715->8424|24745->8425|24778->8430|24874->8498|24903->8499|24936->8504|24965->8505|25030->8541|25060->8542|25093->8547|25292->8717|25322->8718|25355->8723|25450->8790|25479->8791|25512->8796|25541->8797|25577->8805|25606->8806|25803->18|25832->8964|25861->8966|25892->8987|25933->8989|25966->8994
                  LINES: 19->1|21->2|21->2|23->2|26->5|40->19|40->19|40->19|40->19|40->19|66->45|66->45|68->47|68->47|68->47|69->48|70->49|70->49|71->50|71->50|71->50|72->51|73->52|73->52|74->53|74->53|75->54|76->55|76->55|77->56|77->56|78->57|80->59|80->59|81->60|81->60|82->61|83->62|83->62|84->63|84->63|85->64|86->65|86->65|87->66|87->66|88->67|89->68|89->68|90->69|90->69|91->70|93->72|93->72|94->73|94->73|95->74|96->75|96->75|97->76|97->76|98->77|99->78|99->78|100->79|100->79|101->80|103->82|103->82|104->83|104->83|105->84|107->86|107->86|108->87|108->87|109->88|110->89|110->89|111->90|111->90|112->91|114->93|114->93|115->94|115->94|118->97|118->97|119->98|119->98|119->98|120->99|121->100|121->100|122->101|122->101|123->102|124->103|124->103|125->104|125->104|126->105|128->107|128->107|129->108|129->108|130->109|131->110|131->110|132->111|132->111|133->112|134->113|134->113|135->114|135->114|136->115|137->116|137->116|138->117|138->117|139->118|141->120|141->120|142->121|142->121|143->122|144->123|144->123|145->124|145->124|146->125|147->126|147->126|148->127|148->127|149->128|150->129|150->129|151->130|151->130|152->131|154->133|154->133|155->134|155->134|156->135|157->136|157->136|158->137|158->137|159->138|161->140|161->140|162->141|162->141|165->144|165->144|166->145|167->146|167->146|168->147|168->147|170->149|170->149|172->151|173->152|173->152|174->153|174->153|174->153|175->154|176->155|176->155|177->156|177->156|178->157|180->159|180->159|181->160|181->160|182->161|185->164|185->164|186->165|186->165|187->166|191->170|191->170|192->171|192->171|193->172|194->173|194->173|195->174|195->174|196->175|197->176|197->176|198->177|198->177|199->178|200->179|200->179|201->180|201->180|202->181|203->182|203->182|204->183|204->183|207->186|207->186|208->187|208->187|208->187|209->188|210->189|210->189|211->190|211->190|212->191|214->193|214->193|215->194|215->194|216->195|217->196|217->196|218->197|218->197|219->198|221->200|221->200|222->201|222->201|223->202|224->203|224->203|225->204|225->204|226->205|227->206|227->206|228->207|228->207|229->208|230->209|230->209|231->210|231->210|232->211|233->212|233->212|234->213|234->213|237->216|237->216|238->217|239->218|239->218|240->219|240->219|242->221|242->221|243->222|244->223|244->223|245->224|245->224|245->224|246->225|247->226|247->226|248->227|248->227|249->228|251->230|251->230|252->231|252->231|253->232|255->234|255->234|256->235|256->235|257->236|258->237|258->237|259->238|259->238|260->239|261->240|261->240|262->241|262->241|263->242|264->243|264->243|265->244|265->244|268->247|268->247|269->248|269->248|269->248|270->249|271->250|271->250|272->251|272->251|273->252|275->254|275->254|276->255|276->255|277->256|278->257|278->257|279->258|279->258|280->259|281->260|281->260|282->261|282->261|283->262|284->263|284->263|285->264|285->264|286->265|287->266|287->266|288->267|288->267|291->270|291->270|292->271|293->272|293->272|294->273|294->273|296->275|296->275|297->276|298->277|298->277|299->278|299->278|299->278|300->279|301->280|301->280|302->281|302->281|303->282|305->284|305->284|306->285|306->285|307->286|308->287|308->287|309->288|309->288|310->289|311->290|311->290|312->291|312->291|315->294|315->294|316->295|316->295|316->295|317->296|318->297|318->297|319->298|319->298|320->299|322->301|322->301|323->302|323->302|324->303|325->304|325->304|326->305|326->305|327->306|328->307|328->307|329->308|329->308|332->311|332->311|333->312|333->312|333->312|334->313|334->313|334->313|335->314|336->315|336->315|337->316|337->316|338->317|338->317|341->320|341->320|342->321|343->322|343->322|344->323|344->323|346->325|346->325|347->326|348->327|348->327|349->328|349->328|349->328|350->329|351->330|351->330|352->331|352->331|353->332|355->334|355->334|356->335|356->335|357->336|359->338|359->338|360->339|360->339|363->342|363->342|364->343|364->343|364->343|365->344|366->345|366->345|367->346|367->346|368->347|370->349|370->349|371->350|371->350|372->351|373->352|373->352|374->353|374->353|377->356|377->356|378->357|378->357|378->357|379->358|379->358|379->358|380->359|381->360|381->360|382->361|382->361|383->362|383->362|386->365|386->365|387->366|388->367|388->367|389->368|389->368|391->370|391->370|392->371|393->372|393->372|394->373|394->373|394->373|395->374|396->375|396->375|397->376|397->376|398->377|400->379|400->379|401->380|401->380|402->381|403->382|403->382|404->383|404->383|405->384|406->385|406->385|407->386|407->386|408->387|409->388|409->388|410->389|410->389|413->392|413->392|414->393|414->393|414->393|415->394|416->395|416->395|417->396|417->396|418->397|420->399|420->399|421->400|421->400|422->401|423->402|423->402|424->403|424->403|425->404|426->405|426->405|427->406|427->406|428->407|429->408|429->408|430->409|430->409|433->412|433->412|434->413|435->414|435->414|436->415|436->415|439->418|439->418|440->419|443->422|443->422|444->423|445->424|445->424|446->425|446->425|448->427|448->427|449->428|452->431|452->431|453->432|454->433|454->433|455->434|455->434|457->436|457->436|467->1|468->445|469->446|469->446|469->446|470->447
                  -- GENERATED --
              */
          