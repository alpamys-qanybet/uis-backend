
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
object dropzone extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<div id="content" style="opacity: 1;"><div class="row">
        <div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
            <h1 class="page-title txt-color-blueDark">
                <i class="fa fa-pencil-square-o fa-fw "></i>
                Forms
                <span>&gt;
                    Dropzone
                </span>
            </h1>
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
                <article class="col-sm-12">

                    <p class="alert alert-warning">
                        <i class="fa fa-warning fa-fw fa-lg"></i><strong>Opps!</strong>
                        You may get an error during the upload for this demo. The error will subside once the backend portion is properly configured.
                    </p>
                    <p>
                        <span class="label label-warning">
                            NOTE</span> &nbsp; This plugins works only on Latest Chrome, Firefox, Safari, Opera &amp; Internet Explorer 10.
                    </p>

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-blueLight" id="wid-id-0" data-widget-editbutton="false">
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
                            <span class="widget-icon"> <i class="fa fa-cloud"></i> </span>
                            <h2>My Dropzone! </h2>

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

                                <form action="upload.php" class="dropzone dz-clickable" id="mydropzone"><div class="dz-default dz-message"><span>Drop files here to upload</span></div></form>

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

                <!-- row -->

            <div class="row">

                <style>
                .s2 """),format.raw/*107.21*/("""{"""),format.raw/*107.22*/("""
                """),format.raw/*108.17*/("""color: #D14;
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""

                """),format.raw/*111.17*/(""".c1 """),format.raw/*111.21*/("""{"""),format.raw/*111.22*/("""
                """),format.raw/*112.17*/("""color: #998;
                font-style: italic;
                """),format.raw/*114.17*/("""}"""),format.raw/*114.18*/("""

                """),format.raw/*116.17*/(""".mi """),format.raw/*116.21*/("""{"""),format.raw/*116.22*/("""
                """),format.raw/*117.17*/("""color: #099;
                """),format.raw/*118.17*/("""}"""),format.raw/*118.18*/("""
                """),format.raw/*119.17*/("""</style>

                <div class="col-sm-12 col-md-12">
                    <div class="well">
                        <h1>Dropzone Faqs</h1>
                        <hr class="simple">
                        <p>
                        </p><h3>I get the error "Dropzone already attached." when creating the Dropzone.</h3>

                        <p></p>
                        <p>
                            This is most likely due to the autoDiscover feature of Dropzone.
                        </p>

                        <p>
                            When Dropzone starts, it scans the whole document, and looks for elements with the <code>
                            dropzone</code>
                            class. It then creates an instance of Dropzone for every element found. If you, later on, create a Dropzone instance yourself, you'll create a second Dropzone which causes this error.
                        </p>

                        <p>
                            So you can either:
                        </p>

                        <ol>
                            <li>
                                Turn off autoDiscover globally like this: <code>
                                Dropzone.autoDiscover = false;</code>
                                , or
                            </li>
                            <li>
                                Turn off autoDiscover of specific elements like this: <code>
                                Dropzone.options.myAwesomeDropzone = false;</code>
                            </li>
                        </ol>

                        <blockquote>
                            <p>
                                You don't have to create an instance of Dropzone programmatically in most situations! It's recommended
                                to leave <strong>autoDiscover</strong> enabled, and configure your Dropzone in the <code>
                                init</code>
                                option of your configuration.
                            </p>
                        </blockquote>
                        <br>

                        <h3>Why are large files not uploading?</h3>
                        <p>
                            There is a <code>
                            maxFileSize</code>
                            option in Dropzone which defaults to <code>
                            256</code>
                            (MB). Increase this to upload files bigger than that. If your files upload fine but aren't stored on the server, then it's due to your server configuration. Most servers limit the file upload size as well. Please check with the appropriate documentation.
                        </p>
                        <br>

                        <h3>How to get notified when all files finished uploading?</h3>
                        <p>
                            At the moment there isn't a single event to do that, but you can listen to the <code>
                            complete</code>
                            event, which fires every time a file completed uploading, and see if there are still files in the queue or being processed.
                        </p>
                        <br>

                        <h3>Why are some image thumbnails not generated?</h3>
                        <p>
                            There is a <code>
                            maxThumbnailFilesize</code>
                            option in Dropzone which defaults to <code>
                            10</code>
                            (MB) to prevent the browser from downsizing images that are too big. Increase this to create thumbnails of bigger files.
                        </p>
                        <br>

                        <h3>How to get notified when all files finished uploading?</h3>
                        <p>
                            At the moment there isn't a single event to do that, but you can listen to the <code>
                            complete</code>
                            event, which fires every time a file completed uploading, and see if there are still files in the queue or being processed.
                        </p>
                        <pre><span class="nx">Dropzone</span><span class="p">.</span><span class="nx">options</span><span class="p">.</span><span class="nx">myDrop</span> <span class="o">=</span> <span class="p">"""),format.raw/*199.213*/("""{"""),format.raw/*199.214*/("""</span>
                            <span class="nx">init</span><span class="o">:</span> <span class="kd">function</span><span class="p">()</span> <span class="p">"""),format.raw/*200.156*/("""{"""),format.raw/*200.157*/("""</span>
                            <span class="k">this</span><span class="p">.</span><span class="nx">on</span><span class="p">(</span><span class="s2">"complete"</span><span class="p">,</span> <span class="kd">function</span><span class="p">()</span> <span class="p">"""),format.raw/*201.263*/("""{"""),format.raw/*201.264*/("""</span>
                            <span class="k">if</span> <span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="nx">filesQueue</span><span class="p">.</span><span class="nx">length</span> <span class="o">==</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="k">this</span><span class="p">.</span><span class="nx">filesProcessing</span><span class="p">.</span><span class="nx">length</span> <span class="o">==</span> <span class="mi">0</span><span class="p">)</span> <span class="p">"""),format.raw/*202.542*/("""{"""),format.raw/*202.543*/("""</span>
                            <span class="c1">// File finished uploading, and there aren't any left in the queue.</span>
                            <span class="p">"""),format.raw/*204.45*/("""}"""),format.raw/*204.46*/("""</span>
                            <span class="p">"""),format.raw/*205.45*/("""}"""),format.raw/*205.46*/(""");</span>
                            <span class="p">"""),format.raw/*206.45*/("""}"""),format.raw/*206.46*/("""</span>
                            <span class="p">"""),format.raw/*207.45*/("""}"""),format.raw/*207.46*/(""";</span>
                        </pre>
                        <br>

                        <h3>How to show an error returned by the server?</h3>
                        <p>
                            Very often you have to do some verification on the server to check if the file is actually valid. If you want Dropzone to display any error encountered on the server, all you have to do, is send back a proper <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4" target="_blank">HTTP status code</a> in the range of 400 - 500.
                        </p>
                        <p>
                            Dropzone will then know that the file upload was invalid, and will display the returned text as error message.
                        </p>
                        <p>
                            In most frameworks those error codes are generated automatically when you send back an error to the client. In PHP (for example) you can set it with the <code>
                            header</code>
                            command.
                        </p>
                        <br>
                        <h3>How to add a button to remove each file preview?</h3>

                        <p>
                            Starting with Dropzone version 3.5.0, there is an option that will handle all this for you: <code>
                            addRemoveLinks</code>
                            . This will add an <code>
                                &lt;a class="dz-remove"&gt;Remove file&lt;/a&gt;</code>
                            element to the file preview that will remove the file, and it will change to <em>Cancel upload</em> if the file is currently being uploaded (this will trigger a confirmation dialog).
                        </p>

                        <p>
                            You can change those sentences with the <code>
                            dictRemoveFile</code>
                            , <code>
                            dictCancelUpload</code>
                            and <code>
                            dictCancelUploadConfirmation</code>
                            options.
                        </p>

                        <p>
                            If you still want to create the button yourself, you can do so like this:
                        </p>
                        <pre><span class="nt">&lt;form</span> <span class="na">action=</span><span class="s">"/target-url"</span> <span class="na">id=</span><span class="s">"my-dropzone"</span> <span class="na">class=</span><span class="s">"dropzone"</span><span class="nt">&gt;&lt;/form&gt;</span>

                            <span class="nt">&lt;script&gt;</span>
                            <span class="c1">// myDropzone is the configuration for the element that has an id attribute</span>
                            <span class="c1">// with the value my-dropzone (or myDropzone)</span>
                            <span class="nx">Dropzone</span><span class="p">.</span><span class="nx">options</span><span class="p">.</span><span class="nx">myDropzone</span> <span class="o">=</span> <span class="p">"""),format.raw/*252.216*/("""{"""),format.raw/*252.217*/("""</span>
                            <span class="nx">init</span><span class="o">:</span> <span class="kd">function</span><span class="p">()</span> <span class="p">"""),format.raw/*253.156*/("""{"""),format.raw/*253.157*/("""</span>
                            <span class="k">this</span><span class="p">.</span><span class="nx">on</span><span class="p">(</span><span class="s2">"addedfile"</span><span class="p">,</span> <span class="kd">function</span><span class="p">(</span><span class="nx">file</span><span class="p">)</span> <span class="p">"""),format.raw/*254.315*/("""{"""),format.raw/*254.316*/("""</span>

                            <span class="c1">// Create the remove button</span>
                            <span class="kd">var</span> <span class="nx">removeButton</span> <span class="o">=</span> <span class="nx">Dropzone</span><span class="p">.</span><span class="nx">createElement</span><span class="p">(</span><span class="s2">"&lt;button&gt;Remove file&lt;/button&gt;"</span><span class="p">);</span>


                            <span class="c1">// Capture the Dropzone instance as closure.</span>
                            <span class="kd">var</span> <span class="nx">_this</span> <span class="o">=</span> <span class="k">this</span><span class="p">;</span>

                            <span class="c1">// Listen to the click event</span>
                            <span class="nx">removeButton</span><span class="p">.</span><span class="nx">addEventListener</span><span class="p">(</span><span class="s2">"click"</span><span class="p">,</span> <span class="kd">function</span><span class="p">(</span><span class="nx">e</span><span class="p">)</span> <span class="p">"""),format.raw/*264.331*/("""{"""),format.raw/*264.332*/("""</span>
                            <span class="c1">// Make sure the button click doesn't submit the form:</span>
                            <span class="nx">e</span><span class="p">.</span><span class="nx">preventDefault</span><span class="p">();</span>
                            <span class="nx">e</span><span class="p">.</span><span class="nx">stopPropagation</span><span class="p">();</span>

                            <span class="c1">// Remove the file preview.</span>
                            <span class="nx">_this</span><span class="p">.</span><span class="nx">removeFile</span><span class="p">(</span><span class="nx">file</span><span class="p">);</span>
                            <span class="c1">// If you want to the delete the file on the server as well,</span>
                            <span class="c1">// you can do the AJAX request here.</span>
                            <span class="p">"""),format.raw/*273.45*/("""}"""),format.raw/*273.46*/(""");</span>

                            <span class="c1">// Add the button to the file preview element.</span>
                            <span class="nx">file</span><span class="p">.</span><span class="nx">previewElement</span><span class="p">.</span><span class="nx">appendChild</span><span class="p">(</span><span class="nx">removeButton</span><span class="p">);</span>
                            <span class="p">"""),format.raw/*277.45*/("""}"""),format.raw/*277.46*/(""");</span>
                            <span class="p">"""),format.raw/*278.45*/("""}"""),format.raw/*278.46*/("""</span>
                            <span class="p">"""),format.raw/*279.45*/("""}"""),format.raw/*279.46*/(""";</span>
                            <span class="nt">&lt;/script&gt;</span>
                        </pre>

                        <br>

                        <h3>How to submit additional data along the file upload?</h3>

                        <p>
                            If your Dropzone element is a <code>
                                &lt;form&gt;</code>
                            element, all hidden input fields will automatically be submitted as POST data along with the file upload.
                        </p>

                        <p>
                            Example:
                        </p>


                        <pre><span class="nt">&lt;form</span> <span class="na">action=</span><span class="s">"/"</span> <span class="na">class=</span><span class="s">"dropzone"</span><span class="nt">&gt;</span>
                            <span class="nt">&lt;input</span> <span class="na">type=</span><span class="s">"hidden"</span> <span class="na">name=</span><span class="s">"additionaldata"</span> <span class="na">value=</span><span class="s">"1"</span> <span class="nt">/&gt;</span>

                            <span class="c">&lt;!-- If you want control over the fallback form, just add it here: --&gt;</span>
                            <span class="nt">&lt;div</span> <span class="na">class=</span><span class="s">"fallback"</span><span class="nt">&gt;</span> <span class="c">&lt;!-- This div will be removed if the fallback is not necessary --&gt;</span>
                            <span class="nt">&lt;input</span> <span class="na">type=</span><span class="s">"file"</span> <span class="na">name=</span><span class="s">"youfilename"</span> <span class="nt">/&gt;</span>
                            etc...
                            <span class="nt">&lt;/div&gt;</span>
                            <span class="nt">&lt;/form&gt;</span>
                        </pre>
                        <br>
                        <h3>I want to display additional information after a file uploaded.</h3>

                        <p>
                            To use the information sent back from the server, use the <code>
                            success</code>
                            event, like this:
                        </p>


                        <pre><span class="nx">Dropzone</span><span class="p">.</span><span class="nx">options</span><span class="p">.</span><span class="nx">myDropzone</span> <span class="o">=</span> <span class="p">"""),format.raw/*318.217*/("""{"""),format.raw/*318.218*/("""</span>
                            <span class="nx">init</span><span class="o">:</span> <span class="kd">function</span><span class="p">()</span> <span class="p">"""),format.raw/*319.156*/("""{"""),format.raw/*319.157*/("""</span>
                            <span class="k">this</span><span class="p">.</span><span class="nx">on</span><span class="p">(</span><span class="s2">"success"</span><span class="p">,</span> <span class="kd">function</span><span class="p">(</span><span class="nx">file</span><span class="p">,</span> <span class="nx">responseText</span><span class="p">)</span> <span class="p">"""),format.raw/*320.374*/("""{"""),format.raw/*320.375*/("""</span>
                            <span class="c1">// Handle the responseText here. For example, add the text to the preview element:</span>
                            <span class="nx">file</span><span class="p">.</span><span class="nx">previewTemplate</span><span class="p">.</span><span class="nx">appendChild</span><span class="p">(</span><span class="nb">document</span><span class="p">.</span><span class="nx">createTextNode</span><span class="p">(</span><span class="nx">responseText</span><span class="p">));</span>
                            <span class="p">"""),format.raw/*323.45*/("""}"""),format.raw/*323.46*/(""");</span>
                            <span class="p">"""),format.raw/*324.45*/("""}"""),format.raw/*324.46*/("""</span>
                            <span class="p">"""),format.raw/*325.45*/("""}"""),format.raw/*325.46*/(""";</span>
                        </pre>
                        <br>
                        <h3>How to show files already stored on server</h3>

                        <p>
                            Although there's no builtin functionality to do that, you can use Dropzone's default event handlers to your advantage.
                        </p>

                        <p>
                            The concept is, to create a <em>mock</em> file, and call the event handlers <code>
                            addedfile</code>
                            and <code>
                            thumbnail</code>
                            to draw the preview.
                        </p>


                        <pre><span class="c1">// Create the mock file:</span>
                            <span class="kd">var</span> <span class="nx">mockFile</span> <span class="o">=</span> <span class="p">"""),format.raw/*344.131*/("""{"""),format.raw/*344.132*/("""</span> <span class="nx">name</span><span class="o">:</span> <span class="s2">"Filename"</span><span class="p">,</span> <span class="nx">size</span><span class="o">:</span> <span class="mi">12345</span> <span class="p">"""),format.raw/*344.351*/("""}"""),format.raw/*344.352*/(""";</span>

                            <span class="c1">// Call the default addedfile event handler</span>
                            <span class="nx">myDropzone</span><span class="p">.</span><span class="nx">emit</span><span class="p">(</span><span class="s2">"addedfile"</span><span class="p">,</span> <span class="nx">mockFile</span><span class="p">);</span>

                            <span class="c1">// And optionally show the thumbnail of the file:</span>
                            <span class="nx">myDropzone</span><span class="p">.</span><span class="nx">emit</span><span class="p">(</span><span class="s2">"thumbnail"</span><span class="p">,</span> <span class="nx">mockFile</span><span class="p">,</span> <span class="s2">"/image/url"</span><span class="p">);</span>

                            <span class="c1">// If you use the maxFiles option, make sure you adjust it to the</span>
                            <span class="c1">// correct amount:</span>
                            <span class="kd">var</span> <span class="nx">existingFileCount</span> <span class="o">=</span> <span class="mi">1</span><span class="p">;</span> <span class="c1">// The number of files already uploaded</span>
                            <span class="nx">myDropzone</span><span class="p">.</span><span class="nx">options</span><span class="p">.</span><span class="nx">maxFiles</span> <span class="o">=</span> <span class="nx">myDropzone</span><span class="p">.</span><span class="nx">options</span><span class="p">.</span><span class="nx">maxFiles</span> <span class="o">-</span> <span class="nx">existingFileCount</span><span class="p">;</span>
                        </pre>
                        <br>
                        <h3>Use own <code>
                            confirm</code> implementation</h3>

                        <p>
                            If you are unhappy with the way Dropzone asks a user if she wants to cancel or remove a file, and want to use some other way (e.g.: bootstrap's modal), you can simply overwrite the <code>
                            Dropzone.confirm</code>
                            function.
                        </p>
                        <pre><span class="c1">// accepted and rejected are functions to be called whenever the user response</span>
                            <span class="c1">// has been received.</span>
                            <span class="c1">// rejected is not mandatory! So make sure to check if it exists before</span>
                            <span class="c1">// calling it. Do nothing if it doesn't.</span>
                            <span class="nx">Dropzone</span><span class="p">.</span><span class="nx">confirm</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">question</span><span class="p">,</span> <span class="nx">accepted</span><span class="p">,</span> <span class="nx">rejected</span><span class="p">)</span> <span class="p">"""),format.raw/*370.385*/("""{"""),format.raw/*370.386*/("""</span>
                            <span class="c1">// Do your thing, ask the user for confirmation or rejection, and call</span>
                            <span class="c1">// accepted() if the user accepts, or rejected() otherwise. Make</span>
                            <span class="c1">// sure that rejected is actually defined!</span>
                            <span class="p">"""),format.raw/*374.45*/("""}"""),format.raw/*374.46*/(""";</span>
                        </pre>

                        <br>
                        <h3>How can I limit the number of files</h3>

                        <p>
                            You're in luck! Starting with <code>
                            3.7.0</code>
                            Dropzone supports the <code>
                            maxFiles</code>
                            option. Simply set it to the desired quantity and you're good to go. If you don't want the rejected files to be viewed, simply register for the <code>
                            maxfilesexceeded</code>
                            event, and remove the file immediately:
                        </p>
                        <pre><span class="nx">myDropzone</span><span class="p">.</span><span class="nx">on</span><span class="p">(</span><span class="s2">"maxfilesexceeded"</span><span class="p">,</span> <span class="kd">function</span><span class="p">(</span><span class="nx">file</span><span class="p">)</span> <span class="p">"""),format.raw/*389.330*/("""{"""),format.raw/*389.331*/("""</span> <span class="k">this</span><span class="p">.</span><span class="nx">removeFile</span><span class="p">(</span><span class="nx">file</span><span class="p">);</span> <span class="p">"""),format.raw/*389.518*/("""}"""),format.raw/*389.519*/(""");</span>
                        </pre>





                    </div>

                </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*420.45*/("""{"""),format.raw/*420.46*/(""" """),format.raw/*420.47*/("""trigger: "hover" """),format.raw/*420.64*/("""}"""),format.raw/*420.65*/(""");
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
         * var pagefunction = function() """),format.raw/*445.42*/("""{"""),format.raw/*445.43*/("""
         """),format.raw/*446.10*/("""*   ...
         * """),format.raw/*447.12*/("""}"""),format.raw/*447.13*/("""
         """),format.raw/*448.10*/("""* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
         *
         */

        // PAGE RELATED SCRIPTS

        // pagefunction

        var pagefunction = function() """),format.raw/*456.39*/("""{"""),format.raw/*456.40*/("""

        """),format.raw/*458.9*/("""Dropzone.autoDiscover = false;
        $("#mydropzone").dropzone("""),format.raw/*459.35*/("""{"""),format.raw/*459.36*/("""
        """),format.raw/*460.9*/("""//url: "/file/post",
        addRemoveLinks : true,
        maxFilesize: 0.5,
        dictResponseError: 'Error uploading file!'
        """),format.raw/*464.9*/("""}"""),format.raw/*464.10*/(""");

        """),format.raw/*466.9*/("""}"""),format.raw/*466.10*/(""";

        // end pagefunction

        // run pagefunction on load

        loadScript("js/plugin/dropzone/dropzone.min.js", pagefunction);

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
                  DATE: Thu Aug 28 21:08:57 ALMT 2014
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/dropzone.scala.html
                  HASH: e9ccb095e3a8b8694013ebe5079bf8485a5296d6
                  MATRIX: 513->1|618->18|646->21|667->34|706->36|737->41|5303->4578|5333->4579|5379->4596|5437->4625|5467->4626|5514->4644|5547->4648|5577->4649|5623->4666|5717->4731|5747->4732|5794->4750|5827->4754|5857->4755|5903->4772|5961->4801|5991->4802|6037->4819|10527->9279|10558->9280|10751->9443|10782->9444|11082->9714|11113->9715|11692->10264|11723->10265|11924->10437|11954->10438|12035->10490|12065->10491|12148->10545|12178->10546|12259->10598|12289->10599|15497->13777|15528->13778|15721->13941|15752->13942|16104->14264|16135->14265|17255->15355|17286->15356|18235->16276|18265->16277|18711->16694|18741->16695|18824->16749|18854->16750|18935->16802|18965->16803|21492->19300|21523->19301|21716->19464|21747->19465|22158->19846|22189->19847|22788->20417|22818->20418|22901->20472|22931->20473|23012->20525|23042->20526|23979->21433|24010->21434|24259->21653|24290->21654|27302->24636|27333->24637|27749->25024|27779->25025|28841->26057|28872->26058|29089->26245|29120->26246|29786->26883|29816->26884|29846->26885|29892->26902|29922->26903|30611->27563|30641->27564|30680->27574|30728->27593|30758->27594|30797->27604|31004->27782|31034->27783|31072->27793|31166->27858|31196->27859|31233->27868|31398->28005|31428->28006|31468->28018|31498->28019
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|128->107|128->107|129->108|130->109|130->109|132->111|132->111|132->111|133->112|135->114|135->114|137->116|137->116|137->116|138->117|139->118|139->118|140->119|220->199|220->199|221->200|221->200|222->201|222->201|223->202|223->202|225->204|225->204|226->205|226->205|227->206|227->206|228->207|228->207|273->252|273->252|274->253|274->253|275->254|275->254|285->264|285->264|294->273|294->273|298->277|298->277|299->278|299->278|300->279|300->279|339->318|339->318|340->319|340->319|341->320|341->320|344->323|344->323|345->324|345->324|346->325|346->325|365->344|365->344|365->344|365->344|391->370|391->370|395->374|395->374|410->389|410->389|410->389|410->389|441->420|441->420|441->420|441->420|441->420|466->445|466->445|467->446|468->447|468->447|469->448|477->456|477->456|479->458|480->459|480->459|481->460|485->464|485->464|487->466|487->466
                  -- GENERATED --
              */
          