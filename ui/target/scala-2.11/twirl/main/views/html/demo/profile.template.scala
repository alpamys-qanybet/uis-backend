
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
object profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><!-- Bread crumb is created dynamically -->
        <!-- row -->
        <div class="row">

                <!-- col -->
            <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
                <h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-file-o"></i> Other Pages <span>&gt;
                    Profile </span></h1>
            </div>
                <!-- end col -->

                <!-- right side of the page with the sparkline graphs -->
                <!-- col -->
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
                    <!-- sparks -->
                <ul id="sparks">
                    <li class="sparks-info">
                        <h5> My Income <span class="txt-color-blue">$47,171</span></h5>
                        <div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm"><canvas width="89" height="26" style="display: inline-block; width: 89px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                    <li class="sparks-info">
                        <h5> Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip" title="Increased"></i>&nbsp;45%</span></h5>
                        <div class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display: inline-block; width: 82px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                    <li class="sparks-info">
                        <h5> Site Orders <span class="txt-color-greenDark"><i class="fa fa-shopping-cart"></i>&nbsp;2447</span></h5>
                        <div class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm"><canvas width="82" height="26" style="display: inline-block; width: 82px; height: 26px; vertical-align: top;"></canvas></div>
                    </li>
                </ul>
                    <!-- end sparks -->
            </div>
                <!-- end col -->

        </div>
            <!-- end row -->

            <!-- row -->

        <div class="row">

            <div class="col-sm-12">


                <div class="well well-sm">

                    <div class="row">

                        <div class="col-sm-12 col-md-12 col-lg-6">
                            <div class="well well-light well-sm no-margin no-padding">

                                <div class="row">

                                    <div class="col-sm-12">
                                        <div id="myCarousel" class="carousel fade profile-carousel">
                                            <div class="air air-bottom-right padding-10">
                                                <a href="javascript:void(0);" class="btn txt-color-white bg-color-teal btn-sm"><i class="fa fa-check"></i> Follow</a>&nbsp; <a href="javascript:void(0);" class="btn txt-color-white bg-color-pinkDark btn-sm"><i class="fa fa-link"></i> Connect</a>
                                            </div>
                                            <div class="air air-top-left padding-10">
                                                <h4 class="txt-color-white font-md">Jan 1, 2014</h4>
                                            </div>
                                            <ol class="carousel-indicators">
                                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                                                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
                                            </ol>
                                            <div class="carousel-inner">
                                                    <!-- Slide 1 -->
                                                <div class="item active">
                                                    <img src="img/demo/s1.jpg" alt="">
                                                </div>
                                                    <!-- Slide 2 -->
                                                <div class="item">
                                                    <img src="img/demo/s2.jpg" alt="">
                                                </div>
                                                    <!-- Slide 3 -->
                                                <div class="item">
                                                    <img src="img/demo/m3.jpg" alt="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-12">

                                        <div class="row">

                                            <div class="col-sm-3 profile-pic">
                                                <img src="img/avatars/sunny-big.png">
                                                <div class="padding-10">
                                                    <h4 class="font-md"><strong>1,543</strong>
                                                        <br>
                                                        <small>Followers</small></h4>
                                                    <br>
                                                    <h4 class="font-md"><strong>419</strong>
                                                        <br>
                                                        <small>Connections</small></h4>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <h1>John <span class="semi-bold">Doe</span>
                                                    <br>
                                                    <small> CEO, SmartAdmin</small></h1>

                                                <ul class="list-unstyled">
                                                    <li>
                                                        <p class="text-muted">
                                                            <i class="fa fa-phone"></i>&nbsp;&nbsp;(<span class="txt-color-darken">313</span>) <span class="txt-color-darken">464</span> - <span class="txt-color-darken">6473</span>
                                                        </p>
                                                    </li>
                                                    <li>
                                                        <p class="text-muted">
                                                            <i class="fa fa-envelope"></i>&nbsp;&nbsp;<a href="mailto:simmons@smartadmin">ceo@smartadmin.com</a>
                                                        </p>
                                                    </li>
                                                    <li>
                                                        <p class="text-muted">
                                                            <i class="fa fa-skype"></i>&nbsp;&nbsp;<span class="txt-color-darken">john12</span>
                                                        </p>
                                                    </li>
                                                    <li>
                                                        <p class="text-muted">
                                                            <i class="fa fa-calendar"></i>&nbsp;&nbsp;<span class="txt-color-darken">Free after <a href="javascript:void(0);" rel="tooltip" title="" data-placement="top" data-original-title="Create an Appointment">4:30 PM</a></span>
                                                        </p>
                                                    </li>
                                                </ul>
                                                <br>
                                                <p class="font-md">
                                                    <i>A little about me...</i>
                                                </p>
                                                <p>

                                                    Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio
                                                    cumque nihil impedit quo minus id quod maxime placeat facere

                                                </p>
                                                <br>
                                                <a href="javascript:void(0);" class="btn btn-default btn-xs"><i class="fa fa-envelope-o"></i> Send Message</a>
                                                <br>
                                                <br>

                                            </div>
                                            <div class="col-sm-3">
                                                <h1><small>Connections</small></h1>
                                                <ul class="list-inline friends-list">
                                                    <li><img src="img/avatars/1.png" alt="friend-1">
                                                    </li>
                                                    <li><img src="img/avatars/2.png" alt="friend-2">
                                                    </li>
                                                    <li><img src="img/avatars/3.png" alt="friend-3">
                                                    </li>
                                                    <li><img src="img/avatars/4.png" alt="friend-4">
                                                    </li>
                                                    <li><img src="img/avatars/5.png" alt="friend-5">
                                                    </li>
                                                    <li><img src="img/avatars/male.png" alt="friend-6">
                                                    </li>
                                                    <li>
                                                        <a href="javascript:void(0);">413 more</a>
                                                    </li>
                                                </ul>

                                                <h1><small>Recent visitors</small></h1>
                                                <ul class="list-inline friends-list">
                                                    <li><img src="img/avatars/male.png" alt="friend-1">
                                                    </li>
                                                    <li><img src="img/avatars/female.png" alt="friend-2">
                                                    </li>
                                                    <li><img src="img/avatars/female.png" alt="friend-3">
                                                    </li>
                                                </ul>

                                            </div>

                                        </div>

                                    </div>

                                </div>

                                <div class="row">

                                    <div class="col-sm-12">

                                        <hr>

                                        <div class="padding-10">

                                            <ul class="nav nav-tabs tabs-pull-right">
                                                <li class="active">
                                                    <a href="#a1" data-toggle="tab">Recent Articles</a>
                                                </li>
                                                <li>
                                                    <a href="#a2" data-toggle="tab">New Members</a>
                                                </li>
                                                <li class="pull-left">
                                                    <span class="margin-top-10 display-inline"><i class="fa fa-rss text-success"></i> Activity</span>
                                                </li>
                                            </ul>

                                            <div class="tab-content padding-top-10">
                                                <div class="tab-pane fade in active" id="a1">

                                                    <div class="row">

                                                        <div class="col-xs-2 col-sm-1">
                                                            <time datetime="2014-09-20" class="icon">
                                                                <strong>Jan</strong>
                                                                <span>10</span>
                                                            </time>
                                                        </div>

                                                        <div class="col-xs-10 col-sm-11">
                                                            <h6 class="no-margin"><a href="javascript:void(0);">Allice in Wonderland</a></h6>
                                                            <p>
                                                                Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi Nam eget dui.
                                                                Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero,
                                                                sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel.
                                                            </p>
                                                        </div>

                                                        <div class="col-sm-12">

                                                            <hr>

                                                        </div>

                                                        <div class="col-xs-2 col-sm-1">
                                                            <time datetime="2014-09-20" class="icon">
                                                                <strong>Jan</strong>
                                                                <span>10</span>
                                                            </time>
                                                        </div>

                                                        <div class="col-xs-10 col-sm-11">
                                                            <h6 class="no-margin"><a href="javascript:void(0);">World Report</a></h6>
                                                            <p>
                                                                Morning our be dry. Life also third land after first beginning to evening cattle created let subdue you'll winged don't Face firmament.
                                                                You winged you're was Fruit divided signs lights i living cattle yielding over light life life sea, so deep.
                                                                Abundantly given years bring were after. Greater you're meat beast creeping behold he unto She'd doesn't. Replenish brought kind gathering Meat.
                                                            </p>
                                                        </div>

                                                        <div class="col-sm-12">

                                                            <br>

                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="tab-pane fade" id="a2">

                                                    <div class="alert alert-info fade in">
                                                        <button class="close" data-dismiss="alert">
                                                            ×
                                                        </button>
                                                        <i class="fa-fw fa fa-info"></i>
                                                        <strong>51 new members </strong>joined today!
                                                    </div>

                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/female.png"><a href="javascript:void(0);">Jenn Wilson</a>
                                                        <div class="email">
                                                            travis@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Marshall Hitt</a>
                                                        <div class="email">
                                                            marshall@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Joe Cadena</a>
                                                        <div class="email">
                                                            joe@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Mike McBride</a>
                                                        <div class="email">
                                                            mike@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Travis Wilson</a>
                                                        <div class="email">
                                                            travis@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Marshall Hitt</a>
                                                        <div class="email">
                                                            marshall@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="Joe """),
format.raw("""Cadena joe@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Joe Cadena</a>
                                                        <div class="email">
                                                            joe@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Mike McBride</a>
                                                        <div class="email">
                                                            mike@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Marshall Hitt</a>
                                                        <div class="email">
                                                            marshall@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);">Joe Cadena</a>
                                                        <div class="email">
                                                            joe@company.com
                                                        </div>
                                                    </div>
                                                    <div class="user" title="email@company.com">
                                                        <img src="img/avatars/male.png"><a href="javascript:void(0);"> Mike McBride</a>
                                                        <div class="email">
                                                            mike@company.com
                                                        </div>
                                                    </div>

                                                    <div class="text-center">
                                                        <ul class="pagination pagination-sm">
                                                            <li class="disabled">
                                                                <a href="javascript:void(0);">Prev</a>
                                                            </li>
                                                            <li class="active">
                                                                <a href="javascript:void(0);">1</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);">2</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);">3</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);">...</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);">99</a>
                                                            </li>
                                                            <li>
                                                                <a href="javascript:void(0);">Next</a>
                                                            </li>
                                                        </ul>
                                                    </div>

                                                </div><!-- end tab -->
                                            </div>

                                        </div>

                                    </div>

                                </div>
                                    <!-- end row -->

                            </div>

                        </div>
                        <div class="col-sm-12 col-md-12 col-lg-6">

                            <form method="post" class="well padding-bottom-10" onsubmit="return false;">
                                <textarea rows="2" class="form-control" placeholder="What are you thinking?"></textarea>
                                <div class="margin-top-10">
                                    <button type="submit" class="btn btn-sm btn-primary pull-right">
                                        Post
                                    </button>
                                    <a href="javascript:void(0);" class="btn btn-link profile-link-btn" rel="tooltip" data-placement="bottom" title="Add Location"><i class="fa fa-location-arrow"></i></a>
                                    <a href="javascript:void(0);" class="btn btn-link profile-link-btn" rel="tooltip" data-placement="bottom" title="Add Voice"><i class="fa fa-microphone"></i></a>
                                    <a href="javascript:void(0);" class="btn btn-link profile-link-btn" rel="tooltip" data-placement="bottom" title="Add Photo"><i class="fa fa-camera"></i></a>
                                    <a href="javascript:void(0);" class="btn btn-link profile-link-btn" rel="tooltip" data-placement="bottom" title="Add File"><i class="fa fa-file"></i></a>
                                </div>
                            </form>

                            <span class="timeline-seperator text-center"> <span>10:30PM January 1st, 2013</span>
                                <div class="btn-group pull-right">
                                    <a href="javascript:void(0);" data-toggle="dropdown" class="btn btn-default btn-xs dropdown-toggle"><span class="caret single"></span></a>
                                    <ul class="dropdown-menu text-left">
                                        <li>
                                            <a href="javascript:void(0);">Hide this post</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">Hide future posts from this user</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">Mark as spam</a>
                                        </li>
                                    </ul>
                                </div> </span>
                            <div class="chat-body no-padding profile-message">
                                <ul>
                                    <li class="message">
                                        <img src="img/avatars/sunny.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">John Doe <small class="text-muted pull-right ultra-light"> 2 Minutes ago </small></a> Can't divide were divide fish forth fish to. Was can't form the, living life grass darkness very
                                            image let unto fowl isn't in blessed fill life yielding above all moved </span>
                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-info"><i class="fa fa-reply"></i> Reply</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">Show All Comments (14)</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-primary">Edit</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger">Delete</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="message message-reply">
                                        <img src="img/avatars/3.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">Serman Syla</a> Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i> </span>

                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">1 minute ago </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                        </ul>

                                    </li>
                                    <li class="message message-reply">
                                        <img src="img/avatars/4.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">Sadi Orlaf </a> Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i> </span>

                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">a moment ago </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                        </ul>
                                        <input class="form-control input-xs" placeholder="Type and enter" type="text">
                                    </li>
                                </ul>

                            </div>

                            <span class="timeline-seperator text-center"> <span>11:30PM November 27th, 2013</span>
                                <div class="btn-group pull-right">
                                    <a href="javascript:void(0);" data-toggle="dropdown" class="btn btn-default btn-xs dropdown-toggle"><span class="caret single"></span></a>
                                    <ul class="dropdown-menu text-left">
                                        <li>
                                            <a href="javascript:void(0);">Hide this post</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">Hide future posts from this user</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);">Mark as spam</a>
                                        </li>
                                    </ul>
                                </div> </span>
                            <div class="chat-body no-padding profile-message">
                                <ul>
                                    <li class="message">
                                        <img src="img/avatars/1.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">John Doe <small class="text-muted pull-right ultra-light"> 2 Minutes ago </small></a> Can't divide were divide fish forth fish to. Was can't form the, living life grass darkness very image let unto fowl isn't in blessed fill life yielding above all moved </span>
                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-info"><i class="fa fa-reply"></i> Reply</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">Show All Comments (14)</a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-primary">Hide</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="message message-reply">
                                        <img src="img/avatars/3.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">Serman Syla</a> Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i> </span>

                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">1 minute ago </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                        </ul>

                                    </li>
                                    <li class="message message-reply">
                                        <img src="img/avatars/4.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">Sadi Orlaf </a> Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i> </span>

                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">a moment ago </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                        </ul>

                                    </li>
                                    <li class="message message-reply">
                                        <img src="img/avatars/4.png" class="online">
                                        <span class="message-text"> <a href="javascript:void(0);" class="username">Sadi Orlaf </a> Haha! Yeah I know what you mean. Thanks for the file Sadi! <i class="fa fa-smile-o txt-color-orange"></i> </span>

                                        <ul class="list-inline font-xs">
                                            <li>
                                                <a href="javascript:void(0);" class="text-muted">a moment ago </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" class="text-danger"><i class="fa fa-thumbs-up"></i> Like</a>
                                            </li>
                                        </ul>

                                    </li>
                                    <li>
                                        <div class="input-group wall-comment-reply">
                                            <input id="btn-input" type="text" class="form-control" placeholder="Type your message here...">
                                            <span class="input-group-btn">
                                                <button class="btn btn-primary" id="btn-chat">
                                                    <i class="fa fa-reply"></i> Reply
                                                </button> </span>
                                        </div>
                                    </li>
                                </ul>

                            </div>


                        </div>
                    </div>

                </div>


            </div>

        </div>

            <!-- end row -->


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
         * $("[rel=popover-hover]").popover("""),format.raw/*575.45*/("""{"""),format.raw/*575.46*/(""" """),format.raw/*575.47*/("""trigger: "hover" """),format.raw/*575.64*/("""}"""),format.raw/*575.65*/(""");
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
         * var pagefunction = function() """),format.raw/*600.42*/("""{"""),format.raw/*600.43*/("""
         """),format.raw/*601.10*/("""*   ...
         * """),format.raw/*602.12*/("""}"""),format.raw/*602.13*/("""
         """),format.raw/*603.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         * TO LOAD A SCRIPT:
         * var pagefunction = function ()"""),format.raw/*606.42*/("""{"""),format.raw/*606.43*/("""
         """),format.raw/*607.10*/("""*  loadScript(".../plugin.js", run_after_loaded);
         * """),format.raw/*608.12*/("""}"""),format.raw/*608.13*/("""
         """),format.raw/*609.10*/("""*
         * OR
         *
         * loadScript(".../plugin.js", run_after_loaded);
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*619.39*/("""{"""),format.raw/*619.40*/("""

        """),format.raw/*621.9*/("""}"""),format.raw/*621.10*/(""";

        // end pagefunction

        // run pagefunction on load

        pagefunction();

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
                  DATE: Thu Aug 28 21:08:45 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/profile.scala.html
                  HASH: 1912530f491d6078088b3c30eff770dcdb579d2a
                  MATRIX: 512->1|617->18|645->21|666->34|705->36|736->41|39448->38728|39478->38729|39508->38730|39554->38747|39584->38748|40273->39408|40303->39409|40342->39419|40390->39438|40420->39439|40459->39449|40627->39588|40657->39589|40696->39599|40786->39660|40816->39661|40855->39671|41078->39865|41108->39866|41146->39876|41176->39877
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|597->575|597->575|597->575|597->575|597->575|622->600|622->600|623->601|624->602|624->602|625->603|628->606|628->606|629->607|630->608|630->608|631->609|641->619|641->619|643->621|643->621
                  -- GENERATED --
              */
          