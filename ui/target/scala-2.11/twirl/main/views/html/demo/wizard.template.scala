
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
object wizard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark"><i class="fa fa-pencil-square-o fa-fw "></i> Forms <span>&gt;
                Wizards </span></h1>
        </div>
        <div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
            <ul id="sparks" class="">
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
        </div>
    </div>

            <!-- widget grid -->
        <section id="widget-grid" class="">

                <!-- row -->
            <div class="row">

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-darken" id="wid-id-0" data-widget-editbutton="false" data-widget-deletebutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-check"></i> </span>
                            <h2>Very Basic Wizard Example </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body">

                                <div class="row">
                                    <form id="wizard-1" novalidate="novalidate">
                                        <div id="bootstrap-wizard-1" class="col-sm-12">
                                            <div class="form-bootstrapWizard">
                                                <ul class="bootstrapWizard form-wizard">
                                                    <li class="active" data-target="#step1">
                                                        <a href="#tab1" data-toggle="tab"> <span class="step">1</span> <span class="title">Basic information</span> </a>
                                                    </li>
                                                    <li data-target="#step2">
                                                        <a href="#tab2" data-toggle="tab"> <span class="step">2</span> <span class="title">Billing information</span> </a>
                                                    </li>
                                                    <li data-target="#step3">
                                                        <a href="#tab3" data-toggle="tab"> <span class="step">3</span> <span class="title">Domain Setup</span> </a>
                                                    </li>
                                                    <li data-target="#step4">
                                                        <a href="#tab4" data-toggle="tab"> <span class="step">4</span> <span class="title">Save Form</span> </a>
                                                    </li>
                                                </ul>
                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="tab1">
                                                    <br>
                                                    <h3><strong>Step 1 </strong> - Basic Information</h3>

                                                    <div class="row">

                                                        <div class="col-sm-12">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-envelope fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" placeholder="email@address.com" type="text" name="email" id="email">

                                                                </div>
                                                            </div>

                                                        </div>

                                                    </div>

                                                    <div class="row">
                                                        <div class="col-sm-6">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-user fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" placeholder="First Name" type="text" name="fname" id="fname">

                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-sm-6">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-user fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" placeholder="Last Name" type="text" name="lname" id="lname">

                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="tab-pane" id="tab2">
                                                    <br>
                                                    <h3><strong>Step 2</strong> - Billing Information</h3>

                                                    <div class="row">
                                                        <div class="col-sm-4">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-flag fa-lg fa-fw"></i></span>
                                                                    <select name="country" class="form-control input-lg">
                                                                        <option value="" selected="selected">Select Country</option>
                                                                        <option value="United States">United States</option>
                                                                        <option value="United Kingdom">United Kingdom</option>
                                                                        <option value="Afghanistan">Afghanistan</option>
                                                                        <option value="Albania">Albania</option>
                                                                        <option value="Algeria">Algeria</option>
                                                                        <option value="American Samoa">American Samoa</option>
                                                                        <option value="Andorra">Andorra</option>
                                                                        <option value="Angola">Angola</option>
                                                                        <option value="Anguilla">Anguilla</option>
                                                                        <option value="Antarctica">Antarctica</option>
                                                                        <option value="Antigua and Barbuda">Antigua and Barbuda</option>
                                                                        <option value="Argentina">Argentina</option>
                                                                        <option value="Armenia">Armenia</option>
                                                                        <option value="Aruba">Aruba</option>
                                                                        <option value="Australia">Australia</option>
                                                                        <option value="Austria">Austria</option>
                                                                        <option value="Azerbaijan">Azerbaijan</option>
                                                                        <option value="Bahamas">Bahamas</option>
                                                                        <option value="Bahrain">Bahrain</option>
                                                                        <option value="Bangladesh">Bangladesh</option>
                                                                        <option value="Barbados">Barbados</option>
                                                                        <option value="Belarus">Belarus</option>
                                                                        <option value="Belgium">Belgium</option>
                                                                        <option value="Belize">Belize</option>
                                                                        <option value="Benin">Benin</option>
                                                                        <option value="Bermuda">Bermuda</option>
                                                                        <option value="Bhutan">Bhutan</option>
                                                                        <option value="Bolivia">Bolivia</option>
                                                                        <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
                                                                        <option value="Botswana">Botswana</option>
                                                                        <option value="Bouvet Island">Bouvet Island</option>
                                                                        <option value="Brazil">Brazil</option>
                                                                        <option value="British Indian Ocean Territory">British Indian Ocean Territory</option>
                                                                        <option value="Brunei Darussalam">Brunei Darussalam</option>
                                                                        <option value="Bulgaria">Bulgaria</option>
                                                                        <option value="Burkina Faso">Burkina Faso</option>
                                                                        <option value="Burundi">Burundi</option>
                                                                        <option value="Cambodia">Cambodia</option>
                                                                        <option value="Cameroon">Cameroon</option>
                                                                        <option value="Canada">Canada</option>
                                                                        <option value="Cape Verde">Cape Verde</option>
                                                                        <option value="Cayman Islands">Cayman Islands</option>
                                                                        <option value="Central African Republic">Central African Republic</option>
                                                                        <option value="Chad">Chad</option>
                                                                        <option value="Chile">Chile</option>
                                                                        <option value="China">China</option>
                                                                        <option value="Christmas Island">Christmas Island</option>
                                                                        <option value="Cocos (Keeling) Islands">Cocos (Keeling) Islands</option>
                                                                        <option value="Colombia">Colombia</option>
                                                                        <option value="Comoros">Comoros</option>
                                                                        <option value="Congo">Congo</option>
                                                                        <option value="Congo, The Democratic Republic of The">Congo, The Democratic Republic of The</option>
                                                                        <option value="Cook Islands">Cook Islands</option>
                                                                        <option value="Costa Rica">Costa Rica</option>
                                                                        <option value="Cote D'ivoire">Cote D'ivoire</option>
                                                                        <option value="Croatia">Croatia</option>
                                                                        <option value="Cuba">Cuba</option>
                                                                        <option value="Cyprus">Cyprus</option>
                                                                        <option value="Czech Republic">Czech Republic</option>
                                                                        <option value="Denmark">Denmark</option>
                                                                        <option value="Djibouti">Djibouti</option>
                                                                        <option value="Dominica">Dominica</option>
                                                                        <option value="Dominican Republic">Dominican Republic</option>
                                                                        <option value="Ecuador">Ecuador</option>
                                                                        <option value="Egypt">Egypt</option>
                                                                        <option value="El Salvador">El Salvador</option>
                                                                        <option value="Equatorial Guinea">Equatorial Guinea</option>
                                                                        <option value="Eritrea">Eritrea</option>
                                                                        <option value="Estonia">Estonia</option>
                                                                        <option value="Ethiopia">Ethiopia</option>
                                                                        <option value="Falkland Islands (Malvinas)">Falkland Islands (Malvinas)</option>
                                                                        <option value="Faroe Islands">Faroe Islands</option>
                                                                        <option value="Fiji">Fiji</option>
                                                                        <option value="Finland">Finland</option>
                                                                        <option value="France">France</option>
                                                                        <option value="French Guiana">French Guiana</option>
                                                                        <option value="French Polynesia">French Polynesia</option>
                                                                        <option value="French Southern Territories">French Southern Territories</option>
                                                                        <option value="Gabon">Gabon</option>
                                                                        <option value="Gambia">Gambia</option>
                                                                        <option value="Georgia">Georgia</option>
                                                                        <option value="Germany">Germany</option>
                                                                        <option value="Ghana">Ghana</option>
                                                                        <option value="Gibraltar">Gibraltar</option>
                                                                        <option value="Greece">Greece</option>
                                                                        <option value="Greenland">Greenland</option>
                                                                        <option value="Grenada">Grenada</option>
                                                                        <option value="Guadeloupe">Guadeloupe</option>
                                                                        <option value="Guam">Guam</option>
                                                                        <option value="Guatemala">Guatemala</option>
                                                                        <option value="Guinea">Guinea</option>
                                                                        <option value="Guinea-bissau">Guinea-bissau</option>
                                 """),
format.raw("""                                       <option value="Guyana">Guyana</option>
                                                                        <option value="Haiti">Haiti</option>
                                                                        <option value="Heard Island and Mcdonald Islands">Heard Island and Mcdonald Islands</option>
                                                                        <option value="Holy See (Vatican City State)">Holy See (Vatican City State)</option>
                                                                        <option value="Honduras">Honduras</option>
                                                                        <option value="Hong Kong">Hong Kong</option>
                                                                        <option value="Hungary">Hungary</option>
                                                                        <option value="Iceland">Iceland</option>
                                                                        <option value="India">India</option>
                                                                        <option value="Indonesia">Indonesia</option>
                                                                        <option value="Iran, Islamic Republic of">Iran, Islamic Republic of</option>
                                                                        <option value="Iraq">Iraq</option>
                                                                        <option value="Ireland">Ireland</option>
                                                                        <option value="Israel">Israel</option>
                                                                        <option value="Italy">Italy</option>
                                                                        <option value="Jamaica">Jamaica</option>
                                                                        <option value="Japan">Japan</option>
                                                                        <option value="Jordan">Jordan</option>
                                                                        <option value="Kazakhstan">Kazakhstan</option>
                                                                        <option value="Kenya">Kenya</option>
                                                                        <option value="Kiribati">Kiribati</option>
                                                                        <option value="Korea, Democratic People's Republic of">Korea, Democratic People's Republic of</option>
                                                                        <option value="Korea, Republic of">Korea, Republic of</option>
                                                                        <option value="Kuwait">Kuwait</option>
                                                                        <option value="Kyrgyzstan">Kyrgyzstan</option>
                                                                        <option value="Lao People's Democratic Republic">Lao People's Democratic Republic</option>
                                                                        <option value="Latvia">Latvia</option>
                                                                        <option value="Lebanon">Lebanon</option>
                                                                        <option value="Lesotho">Lesotho</option>
                                                                        <option value="Liberia">Liberia</option>
                                                                        <option value="Libyan Arab Jamahiriya">Libyan Arab Jamahiriya</option>
                                                                        <option value="Liechtenstein">Liechtenstein</option>
                                                                        <option value="Lithuania">Lithuania</option>
                                                                        <option value="Luxembourg">Luxembourg</option>
                                                                        <option value="Macao">Macao</option>
                                                                        <option value="Macedonia, The Former Yugoslav Republic of">Macedonia, The Former Yugoslav Republic of</option>
                                                                        <option value="Madagascar">Madagascar</option>
                                                                        <option value="Malawi">Malawi</option>
                                                                        <option value="Malaysia">Malaysia</option>
                                                                        <option value="Maldives">Maldives</option>
                                                                        <option value="Mali">Mali</option>
                                                                        <option value="Malta">Malta</option>
                                                                        <option value="Marshall Islands">Marshall Islands</option>
                                                                        <option value="Martinique">Martinique</option>
                                                                        <option value="Mauritania">Mauritania</option>
                                                                        <option value="Mauritius">Mauritius</option>
                                                                        <option value="Mayotte">Mayotte</option>
                                                                        <option value="Mexico">Mexico</option>
                                                                        <option value="Micronesia, Federated States of">Micronesia, Federated States of</option>
                                                                        <option value="Moldova, Republic of">Moldova, Republic of</option>
                                                                        <option value="Monaco">Monaco</option>
                                                                        <option value="Mongolia">Mongolia</option>
                                                                        <option value="Montserrat">Montserrat</option>
                                                                        <option value="Morocco">Morocco</option>
                                                                        <option value="Mozambique">Mozambique</option>
                                                                        <option value="Myanmar">Myanmar</option>
                                                                        <option value="Namibia">Namibia</option>
                                                                        <option value="Nauru">Nauru</option>
                                                                        <option value="Nepal">Nepal</option>
                                                                        <option value="Netherlands">Netherlands</option>
                                                                        <option value="Netherlands Antilles">Netherlands Antilles</option>
                                                                        <option value="New Caledonia">New Caledonia</option>
                                                                        <option value="New Zealand">New Zealand</option>
                                                                        <option value="Nicaragua">Nicaragua</option>
                                                                        <option value="Niger">Niger</option>
                                                                        <option value="Nigeria">Nigeria</option>
                                                                        <option value="Niue">Niue</option>
                                                                        <option value="Norfolk Island">Norfolk Island</option>
                                                                        <option value="Northern Mariana Islands">Northern Mariana Islands</option>
                                                                        <option value="Norway">Norway</option>
                                                                        <option value="Oman">Oman</option>
                                                                        <option value="Pakistan">Pakistan</option>
                                                                        <option value="Palau">Palau</option>
                                                                        <option value="Palestinian Territory, Occupied">Palestinian Territory, Occupied</option>
                                                                        <option value="Panama">Panama</option>
                                                                        <option value="Papua New Guinea">Papua New Guinea</option>
                                                                        <option value="Paraguay">Paraguay</option>
                                                                        <option value="Peru">Peru</option>
                                                                        <option value="Philippines">Philippines</option>
                                                                        <option value="Pitcairn">Pitcairn</option>
                                                                        <option value="Poland">Poland</option>
                                                                        <option value="Portugal">Portugal</option>
                                                                        <option value="Puerto Rico">Puerto Rico</option>
                                                                        <option value="Qatar">Qatar</option>
                                                                        <option value="Reunion">Reunion</option>
                                                                        <option value="Romania">Romania</option>
                                                                        <option value="Russian Federation">Russian Federation</option>
                                                                        <option value="Rwanda">Rwanda</option>
                                                                        <option value="Saint Helena">Saint Helena</option>
                                                                        <option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option>
                                                                        <option value="Saint Lucia">Saint Lucia</option>
                                                                        <option value="Saint Pierre and Miquelon">Saint Pierre and Miquelon</option>
                                                                        <option value="Saint Vincent and The Grenadines">Saint Vincent and The Grenadines</option>
                                                                        <option value="Samoa">Samoa</option>
                                                                        <option value="San Marino">San Marino</option>
                                                                        <option value="Sao Tome and Principe">Sao Tome and Principe</option>
                                                                        <option value="Saudi Arabia">Saudi Arabia</option>
                                                                        <option value="Senegal">Senegal</option>
                                                                        <option value="Serbia and Montenegro">Serbia and Montenegro</option>
                                                                        <option value="Seychelles">Seychelles</option>
                                                                        <option value="Sierra Leone">Sierra Leone</option>
                                                                        <option value="Singapore">Singapore</option>
                                                                        <option value="Slovakia">Slovakia</option>
                                                                        <option value="Slovenia">Slovenia</option>
                                                                        <option value="Solomon Islands">Solomon Islands</option>
                                                                        <option value="Somalia">Somalia</option>
                                                                        <option value="South Africa">South Africa</option>
                                                                        <option value="South Georgia and The South Sandwich Islands">South Georgia and The South Sandwich Islands</option>
                                                                        <option value="Spain">Spain</option>
                                                                        <option value="Sri Lanka">Sri Lanka</option>
                                                                        <option value="Sudan">Sudan</option>
                                                                        <option value="Suriname">Suriname</option>
                                                                        <option value="Svalbard and Jan Mayen">Svalbard and Jan Mayen</option>
                                                                        <option value="Swaziland">Swaziland</option>
                                                                        <option value="Sweden">Sweden</option>
                                                                        <option value="Switzerland">Switzerland</option>
                                                                        <option value="Syrian Arab Republic">Syrian Arab Republic</option>
                                                                        <option value="Taiwan, Province of China">Taiwan, Province of China</option>
                                                                        <option value="Tajikistan">Tajikistan</option>
                                                                        <option value="Tanzania, United Republic of">Tanzania, United Republic of</option>
                                                                        <option value="Thailand">Thailand</option>
                                                                        <option value="Timor-leste">Timor-leste</option>
                                                                        <option value="Togo">Togo</option>
                                                                        <option value="Tokelau">Tokelau</option>
                                                                        <option value="Tonga">Tonga</option>
                                                                        <option value="Trinidad and Tobago">Trinidad and Tobago</option>
                                                                        <option value="Tunisia">Tunisia</option>
                                                                        <option value="Turkey">Turkey</option>
                                                                        <option value="Turkmenistan">Turkmenistan</option>
                                                                        <option value="Turks and Caicos Islands">Turks and Caicos Islands</option>
                                                                        <option value="Tuvalu">Tuvalu</option>
                                                                        <option value="Uganda">Uganda</option>
                                                                        <option value="Ukraine">Ukraine</option>
                                                                        <option value="United Arab Emirates">United Arab Emirates</option>
                                                                        <option value="United Kingdom">United Kingdom</option>
                                                                        <option value="United States">United States</option>
                                                                        <option value="United States Minor Outlying Islands">United States Minor Outlying Islands</option>
                                                                        <option value="Uruguay">Uruguay</option>
                                                                        <option value="Uzbekistan">Uzbekistan</option>
                                                                        <option value="Vanuatu">Vanuatu</option>
                                                                        <option value="Venezuela">Venezuela</option>
                                                                        <option value="Viet Nam">Viet Nam</option>
                                                                        <option value="Virgin Islands, British">Virgin Islands, British</option>
                                                                        <option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option>
                                                                        <option value="Wallis and Futuna">Wallis and Futuna</option>
                                                                        <option value="Western Sahara">Western Sahara</option>
                                                                        <option value="Yemen">Yemen</option>
                                                                        <option value="Zambia">Zambia</option>
                                                                        <option value="Zimbabwe">Zimbabwe</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-sm-4">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-map-marker fa-lg fa-fw"></i></span>
                                                                    <select class="form-control input-lg" name="city">
                                                                        <option value="" selected="selected">Select City</option>
                                                                        <option>Amsterdam</option>
                                                                        <option>Atlanta</option>
                                                                        <option>Baltimore</option>
                                                                        <option>Boston</option>
                                                                        <option>Buenos Aires</option>
                                                                        <option>Calgary</option>
                                                                        <option>Chicago</option>
                                                                        <option>Denver</option>
                                                                        <op"""),
format.raw("""tion>Dubai</option>
                                                                        <option>Frankfurt</option>
                                                                        <option>Hong Kong</option>
                                                                        <option>Honolulu</option>
                                                                        <option>Houston</option>
                                                                        <option>Kuala Lumpur</option>
                                                                        <option>London</option>
                                                                        <option>Los Angeles</option>
                                                                        <option>Melbourne</option>
                                                                        <option>Mexico City</option>
                                                                        <option>Miami</option>
                                                                        <option>Minneapolis</option>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-sm-4">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-envelope-o fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" placeholder="Postal Code" type="text" name="postal" id="postal">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-sm-6">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-phone fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" data-mask="+99 (999) 999-9999" data-mask-placeholder="X" placeholder="+1" type="text" name="wphone" id="wphone">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="col-sm-6">
                                                            <div class="form-group">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon"><i class="fa fa-mobile fa-lg fa-fw"></i></span>
                                                                    <input class="form-control input-lg" data-mask="+99 (999) 999-9999" data-mask-placeholder="X" placeholder="+01" type="text" name="hphone" id="hphone">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="tab-pane" id="tab3">
                                                    <br>
                                                    <h3><strong>Step 3</strong> - Domain Setup</h3>
                                                    <div class="alert alert-info fade in">
                                                        <button class="close" data-dismiss="alert">
                                                            ×
                                                        </button>
                                                        <i class="fa-fw fa fa-info"></i>
                                                        <strong>Info!</strong> Place an info message box if you wish.
                                                    </div>
                                                    <div class="form-group">
                                                        <label>This is a label</label>
                                                        <input class="form-control input-lg" placeholder="Another input box here..." type="text" name="etc" id="etc">
                                                    </div>
                                                </div>
                                                <div class="tab-pane" id="tab4">
                                                    <br>
                                                    <h3><strong>Step 4</strong> - Save Form</h3>
                                                    <br>
                                                    <h1 class="text-center text-success"><strong><i class="fa fa-check fa-lg"></i> Complete</strong></h1>
                                                    <h4 class="text-center">Click next to finish</h4>
                                                    <br>
                                                    <br>
                                                </div>

                                                <div class="form-actions">
                                                    <div class="row">
                                                        <div class="col-sm-12">
                                                            <ul class="pager wizard no-margin">
                                                                    <!--<li class="previous first disabled">
														<a href="javascript:void(0);" class="btn btn-lg btn-default"> First </a>
														</li>-->
                                                                <li class="previous disabled">
                                                                    <a href="javascript:void(0);" class="btn btn-lg btn-default"> Previous </a>
                                                                </li>
                                                                    <!--<li class="next last">
														<a href="javascript:void(0);" class="btn btn-lg btn-primary"> Last </a>
														</li>-->
                                                                <li class="next">
                                                                    <a href="javascript:void(0);" class="btn btn-lg txt-color-darken"> Next </a>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </form>
                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                </article>
                    <!-- WIDGET END -->

                    <!-- NEW WIDGET START -->
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget" id="wid-id-2" data-widget-editbutton="false" data-widget-deletebutton="false">
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
                            <h2>Fuel Wizard </h2>

                        </header>

                            <!-- widget div-->
                        <div>

                                <!-- widget edit box -->
                            <div class="jarviswidget-editbox">
                                    <!-- This area used as dropdown edit box -->

                            </div>
                                <!-- end widget edit box -->

                                <!-- widget content -->
                            <div class="widget-body fuelux">

                                <div class="wizard">
                                    <ul class="steps">
                                        <li data-target="#step1" class="active">
                                            <span class="badge badge-info">1</span>Step 1<span class="chevron"></span>
                                        </li>
                                        <li data-target="#step2">
                                            <span class="badge">2</span>Step 2<span class="chevron"></span>
                                        </li>
                                        <li data-target="#step3">
                                            <span class="badge">3</span>Step 3<span class="chevron"></span>
                                        </li>
                                        <li data-target="#step4">
                                            <span class="badge">4</span>Step 4<span class="chevron"></span>
                                        </li>
                                        <li data-target="#step5">
                                            <span class="badge">5</span>Step 5<span class="chevron"></span>
                                        </li>
                                    </ul>
                                    <div class="actions">
                                        <button type="button" class="btn btn-sm btn-primary btn-prev">
                                            <i class="fa fa-arrow-left"></i>Prev
                                        </button>
                                        <button type="button" class="btn btn-sm btn-success btn-next" data-last="Finish">
                                            Next
                                            <i class="fa fa-arrow-right"></i></button>
                                    </div>
                                </div>
                                <div class="step-content">
                                    <form class="form-horizontal" id="fuelux-wizard" method="post">

                                        <div class="step-pane active" id="step1">
                                            <h3><strong>Step 1 </strong> - Validation states</h3>

                                                <!-- wizard form starts here -->
                                            <fieldset>

                                                <div class="form-group has-warning">
                                                    <label class="col-md-2 control-label">Input warning</label>
                                                    <div class="col-md-10">
                                                        <div class="input-group">
                                                            <input class="form-control" type="text">
                                                            <span class="input-group-addon"><i class="fa fa-warning"></i></span>
                                                        </div>
                                                        <span class="help-block">Something may have gone wrong</span>
                                                    </div>

                                                </div>

                                                <div class="form-group has-error">
                                                    <label class="col-md-2 control-label">Input error</label>
                                                    <div class="col-md-10">
                                                        <div class="input-group">
                                                            <input class="form-control" type="text">
                                                            <span class="input-group-addon"><i class="glyphicon glyphicon-remove-circle"></i></span>
                                                        </div>
                                                        <span class="help-block"><i class="fa fa-warning"></i> Please correct the error</span>
                                                    </div>
                                                </div>

                                                <div class="form-group has-success">
                                                    <label class="col-md-2 control-label">Input success</label>
                                                    <div class="col-md-10">
                                                        <div class="input-group">
                                                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                                                            <input class="form-control" type="text">
                                                            <span class="input-group-addon"><i class="fa fa-check"></i></span>
                                                        </div>
                                                        <span class="help-block">Something may have gone wrong</span>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="control-label col-md-2">Input icon success</label>
                                                    <div class="col-md-10">
                                                        <div class="row">
                                                            <div class="col-sm-12">

                                                                <div class="input-icon-left">
                                                                    <i class="fa txt-color-green fa-check"></i>
                                                                    <input class="form-control" placeholder="Left Icon" type="text">
                                                                </div>

                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                            </fieldset>

                                        </div>

                                        <div class="step-pane" id="step2">
                                            <h3><strong>Step 2 </strong> - Alerts</h3>

                                            <div class="alert alert-warning fade in">
                                                <button class="close" data-dismiss="alert">
                                                    ×
                                                </button>
                                                <i class="fa-fw fa fa-warning"></i>
                                                <strong>Warning</strong> Your monthly traffic is reaching limit.
                                            </div>

                                            <div class="alert alert-success fade in">
                                                <button class="close" data-dismiss="alert">
                                                    ×
                                                </button>
                                                <i class="fa-fw fa fa-check"></i>
                                                <strong>Success</strong> The page has been added.
                                            </div>

                                            <div class="alert alert-info fade in">
                                                <button class="close" data-dismiss="alert">
                                                    ×
                                                </button>
                                                <i class="fa-fw fa fa-info"></i>
                                                <strong>Info!</strong> You have 198 unread messages.
                                            </div>

                                            <div class="alert alert-danger fade in">
                                                <button class="close" data-dismiss="alert">
                                                    ×
                                                </button>
                                                <i class="fa-fw fa fa-times"></i>
                                                <strong>Error!</strong> The daily cronjob has failed.
                                            </div>

                                        </div>

                                        <div class="step-pane" id="step3">
                                            <h3><strong>Step 3 </strong> - Wizard continued</h3>
                                            <br>
                                            <br>
                                            <h1 class="text-center text-primary"> This will be your Step 3 </h1>
                                            <br>
                                            <br>
                                            <br>
                                            <br>
                                        </div>

                                        <div class="step-pane" id="step4">
                                            <h3><strong>Step 4 </strong> - Wizard continued...</h3>
                                            <br>
                                            <br>
                                            <h1 class="text-center text-danger"> This will be your Step 4 </h1>
                                            <br>
                                            <br>
                                            <br>
                                            <br>
                                        </div>

                                        <div class="step-pane" id="step5">
                                            <h3><strong>Step 5 </strong> - Finished!</h3>
                                            <br>
                                            <br>
                                            <h1 class="text-center text-success"><i class="fa fa-check"></i> Congratulations!
                                                <br>
                                                <small>Click finish to end wizard</small></h1>
                    """),
format.raw("""                        <br>
                                            <br>
                                            <br>
                                            <br>
                                        </div>

                                    </form>
                                </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*742.45*/("""{"""),format.raw/*742.46*/(""" """),format.raw/*742.47*/("""trigger: "hover" """),format.raw/*742.64*/("""}"""),format.raw/*742.65*/(""");
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

        var pagefunction = function() """),format.raw/*767.39*/("""{"""),format.raw/*767.40*/("""

        """),format.raw/*769.9*/("""// load bootstrap wizard

        loadScript("js/plugin/bootstrap-wizard/jquery.bootstrap.wizard.min.js", runBootstrapWizard);

        //Bootstrap Wizard Validations

        function runBootstrapWizard() """),format.raw/*775.39*/("""{"""),format.raw/*775.40*/("""

        """),format.raw/*777.9*/("""var $validator = $("#wizard-1").validate("""),format.raw/*777.50*/("""{"""),format.raw/*777.51*/("""

        """),format.raw/*779.9*/("""rules : """),format.raw/*779.17*/("""{"""),format.raw/*779.18*/("""
        """),format.raw/*780.9*/("""email : """),format.raw/*780.17*/("""{"""),format.raw/*780.18*/("""
        """),format.raw/*781.9*/("""required : true,
        email : "Your email address must be in the format of name@domain.com"
        """),format.raw/*783.9*/("""}"""),format.raw/*783.10*/(""",
        fname : """),format.raw/*784.17*/("""{"""),format.raw/*784.18*/("""
        """),format.raw/*785.9*/("""required : true
        """),format.raw/*786.9*/("""}"""),format.raw/*786.10*/(""",
        lname : """),format.raw/*787.17*/("""{"""),format.raw/*787.18*/("""
        """),format.raw/*788.9*/("""required : true
        """),format.raw/*789.9*/("""}"""),format.raw/*789.10*/(""",
        country : """),format.raw/*790.19*/("""{"""),format.raw/*790.20*/("""
        """),format.raw/*791.9*/("""required : true
        """),format.raw/*792.9*/("""}"""),format.raw/*792.10*/(""",
        city : """),format.raw/*793.16*/("""{"""),format.raw/*793.17*/("""
        """),format.raw/*794.9*/("""required : true
        """),format.raw/*795.9*/("""}"""),format.raw/*795.10*/(""",
        postal : """),format.raw/*796.18*/("""{"""),format.raw/*796.19*/("""
        """),format.raw/*797.9*/("""required : true,
        minlength : 4
        """),format.raw/*799.9*/("""}"""),format.raw/*799.10*/(""",
        wphone : """),format.raw/*800.18*/("""{"""),format.raw/*800.19*/("""
        """),format.raw/*801.9*/("""required : true,
        minlength : 10
        """),format.raw/*803.9*/("""}"""),format.raw/*803.10*/(""",
        hphone : """),format.raw/*804.18*/("""{"""),format.raw/*804.19*/("""
        """),format.raw/*805.9*/("""required : true,
        minlength : 10
        """),format.raw/*807.9*/("""}"""),format.raw/*807.10*/("""
        """),format.raw/*808.9*/("""}"""),format.raw/*808.10*/(""",

        messages : """),format.raw/*810.20*/("""{"""),format.raw/*810.21*/("""
        """),format.raw/*811.9*/("""fname : "Please specify your First name",
        lname : "Please specify your Last name",
        email : """),format.raw/*813.17*/("""{"""),format.raw/*813.18*/("""
        """),format.raw/*814.9*/("""required : "We need your email address to contact you",
        email : "Your email address must be in the format of name@domain.com"
        """),format.raw/*816.9*/("""}"""),format.raw/*816.10*/("""
        """),format.raw/*817.9*/("""}"""),format.raw/*817.10*/(""",

        highlight : function(element) """),format.raw/*819.39*/("""{"""),format.raw/*819.40*/("""
        """),format.raw/*820.9*/("""$(element).closest('.form-group').removeClass('has-success').addClass('has-error');
        """),format.raw/*821.9*/("""}"""),format.raw/*821.10*/(""",
        unhighlight : function(element) """),format.raw/*822.41*/("""{"""),format.raw/*822.42*/("""
        """),format.raw/*823.9*/("""$(element).closest('.form-group').removeClass('has-error').addClass('has-success');
        """),format.raw/*824.9*/("""}"""),format.raw/*824.10*/(""",
        errorElement : 'span',
        errorClass : 'help-block',
        errorPlacement : function(error, element) """),format.raw/*827.51*/("""{"""),format.raw/*827.52*/("""
        """),format.raw/*828.9*/("""if (element.parent('.input-group').length) """),format.raw/*828.52*/("""{"""),format.raw/*828.53*/("""
        """),format.raw/*829.9*/("""error.insertAfter(element.parent());
        """),format.raw/*830.9*/("""}"""),format.raw/*830.10*/(""" """),format.raw/*830.11*/("""else """),format.raw/*830.16*/("""{"""),format.raw/*830.17*/("""
        """),format.raw/*831.9*/("""error.insertAfter(element);
        """),format.raw/*832.9*/("""}"""),format.raw/*832.10*/("""
        """),format.raw/*833.9*/("""}"""),format.raw/*833.10*/("""
        """),format.raw/*834.9*/("""}"""),format.raw/*834.10*/(""");

        $('#bootstrap-wizard-1').bootstrapWizard("""),format.raw/*836.50*/("""{"""),format.raw/*836.51*/("""

        """),format.raw/*838.9*/("""'tabClass' : 'form-wizard',
        'onNext' : function(tab, navigation, index) """),format.raw/*839.53*/("""{"""),format.raw/*839.54*/("""
        """),format.raw/*840.9*/("""var $valid = $("#wizard-1").valid();
        if (!$valid) """),format.raw/*841.22*/("""{"""),format.raw/*841.23*/("""
        """),format.raw/*842.9*/("""$validator.focusInvalid();
        return false;
        """),format.raw/*844.9*/("""}"""),format.raw/*844.10*/(""" """),format.raw/*844.11*/("""else """),format.raw/*844.16*/("""{"""),format.raw/*844.17*/("""
        """),format.raw/*845.9*/("""$('#bootstrap-wizard-1').find('.form-wizard').children('li').eq(index - 1).addClass('complete');
        $('#bootstrap-wizard-1').find('.form-wizard').children('li').eq(index - 1).find('.step').html('<i class="fa fa-check"></i>');
        """),format.raw/*847.9*/("""}"""),format.raw/*847.10*/("""
        """),format.raw/*848.9*/("""}"""),format.raw/*848.10*/("""
        """),format.raw/*849.9*/("""}"""),format.raw/*849.10*/(""");

        """),format.raw/*851.9*/("""}"""),format.raw/*851.10*/(""";

        // load fuelux wizard

        loadScript("js/plugin/fuelux/wizard/wizard.min.js", fueluxWizard);

        function fueluxWizard() """),format.raw/*857.33*/("""{"""),format.raw/*857.34*/("""

        """),format.raw/*859.9*/("""var wizard = $('.wizard').wizard();

        wizard.on('finished', function(e, data) """),format.raw/*861.49*/("""{"""),format.raw/*861.50*/("""
        """),format.raw/*862.9*/("""//$("#fuelux-wizard").submit();
        //console.log("submitted!");
        $.smallBox("""),format.raw/*864.20*/("""{"""),format.raw/*864.21*/("""
        """),format.raw/*865.9*/("""title : "Congratulations! Your form was submitted",
        content : "<i class='fa fa-clock-o'></i><i>1 seconds ago...</i>",
        color : "#5F895F",
        iconSmall : "fa fa-check bounce animated",
        timeout : 4000
        """),format.raw/*870.9*/("""}"""),format.raw/*870.10*/(""");

        """),format.raw/*872.9*/("""}"""),format.raw/*872.10*/(""");

        """),format.raw/*874.9*/("""}"""),format.raw/*874.10*/(""";

        """),format.raw/*876.9*/("""}"""),format.raw/*876.10*/(""";

        // end pagefunction

        // Load bootstrap wizard dependency then run pagefunction
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
                  DATE: Thu Aug 28 21:08:43 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/wizard.scala.html
                  HASH: c24e2533745b83d2dad24a51240bb9156ecb68d9
                  MATRIX: 511->1|616->18|644->21|665->34|704->36|735->41|61990->61208|62020->61209|62050->61210|62096->61227|62126->61228|62753->61826|62783->61827|62821->61837|63056->62043|63086->62044|63124->62054|63194->62095|63224->62096|63262->62106|63299->62114|63329->62115|63366->62124|63403->62132|63433->62133|63470->62142|63601->62246|63631->62247|63678->62265|63708->62266|63745->62275|63797->62299|63827->62300|63874->62318|63904->62319|63941->62328|63993->62352|64023->62353|64072->62373|64102->62374|64139->62383|64191->62407|64221->62408|64267->62425|64297->62426|64334->62435|64386->62459|64416->62460|64464->62479|64494->62480|64531->62489|64606->62536|64636->62537|64684->62556|64714->62557|64751->62566|64827->62614|64857->62615|64905->62634|64935->62635|64972->62644|65048->62692|65078->62693|65115->62702|65145->62703|65196->62725|65226->62726|65263->62735|65399->62842|65429->62843|65466->62852|65636->62995|65666->62996|65703->63005|65733->63006|65803->63047|65833->63048|65870->63057|65990->63149|66020->63150|66091->63192|66121->63193|66158->63202|66278->63294|66308->63295|66455->63413|66485->63414|66522->63423|66594->63466|66624->63467|66661->63476|66734->63521|66764->63522|66794->63523|66828->63528|66858->63529|66895->63538|66959->63574|66989->63575|67026->63584|67056->63585|67093->63594|67123->63595|67205->63648|67235->63649|67273->63659|67382->63739|67412->63740|67449->63749|67536->63807|67566->63808|67603->63817|67688->63874|67718->63875|67748->63876|67782->63881|67812->63882|67849->63891|68116->64130|68146->64131|68183->64140|68213->64141|68250->64150|68280->64151|68320->64163|68350->64164|68521->64306|68551->64307|68589->64317|68703->64402|68733->64403|68770->64412|68887->64500|68917->64501|68954->64510|69217->64745|69247->64746|69287->64758|69317->64759|69357->64771|69387->64772|69426->64783|69456->64784
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|766->742|766->742|766->742|766->742|766->742|791->767|791->767|793->769|799->775|799->775|801->777|801->777|801->777|803->779|803->779|803->779|804->780|804->780|804->780|805->781|807->783|807->783|808->784|808->784|809->785|810->786|810->786|811->787|811->787|812->788|813->789|813->789|814->790|814->790|815->791|816->792|816->792|817->793|817->793|818->794|819->795|819->795|820->796|820->796|821->797|823->799|823->799|824->800|824->800|825->801|827->803|827->803|828->804|828->804|829->805|831->807|831->807|832->808|832->808|834->810|834->810|835->811|837->813|837->813|838->814|840->816|840->816|841->817|841->817|843->819|843->819|844->820|845->821|845->821|846->822|846->822|847->823|848->824|848->824|851->827|851->827|852->828|852->828|852->828|853->829|854->830|854->830|854->830|854->830|854->830|855->831|856->832|856->832|857->833|857->833|858->834|858->834|860->836|860->836|862->838|863->839|863->839|864->840|865->841|865->841|866->842|868->844|868->844|868->844|868->844|868->844|869->845|871->847|871->847|872->848|872->848|873->849|873->849|875->851|875->851|881->857|881->857|883->859|885->861|885->861|886->862|888->864|888->864|889->865|894->870|894->870|896->872|896->872|898->874|898->874|900->876|900->876
                  -- GENERATED --
              */
          