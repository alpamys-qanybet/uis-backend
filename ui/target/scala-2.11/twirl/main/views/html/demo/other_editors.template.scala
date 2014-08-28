
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
object other_editors extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
                    Bootstrap Editors
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
                <article class="col-sm-12 col-md-12 col-lg-6">

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget jarviswidget-color-purple" id="wid-id-2" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-fullscreenbutton="false" data-widget-sortable="false">
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
                            <span class="widget-icon"> <i class="fa fa-pencil"></i> </span>
                            <h2>Markdown</h2>

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

                                <div class="md-editor" id="1408966998023"><div class="md-header btn-toolbar"><div class="btn-group"><button class="btn btn-default btn-sm" title="Bold" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdBold"><span class="glyphicon glyphicon-bold"></span> </button><button class="btn btn-default btn-sm" title="Italic" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdItalic"><span class="glyphicon glyphicon-italic"></span> </button><button class="btn btn-default btn-sm" title="Heading" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdHeading"><span class="glyphicon glyphicon-font"></span> </button></div><div class="btn-group"><button class="btn btn-default btn-sm" title="URL/Link" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdUrl"><span class="glyphicon glyphicon-globe"></span> </button><button class="btn btn-default btn-sm" title="Image" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdImage"><span class="glyphicon glyphicon-picture"></span> </button></div><div class="btn-group"><button class="btn btn-default btn-sm" title="List" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdList"><span class="glyphicon glyphicon-list"></span> </button></div><div class="btn-group"><button class="btn btn-primary btn-sm btn-default btn-sm" title="Preview" tabindex="-1" data-provider="bootstrap-markdown" data-handler="bootstrap-markdown-cmdPreview" data-toggle="button"><span class="glyphicon glyphicon-search"></span> Preview</button></div></div><textarea id="mymarkdown" class="custom-scroll md-input" style="max-height: 180px; resize: none;" rows="14">### Hello there
                                    How are you?

                                    I have bellow task for you :

                                    Select from this text...
                                    Click the bold on THIS WORD and make THESE ONE italic
                                    Link GOOGLE to google.com
                                    Test to insert image (and try to tab after write the image description)
                                    Test Preview
                                    And ending here... Click "List"

                                    Enjoy!
                                </textarea><div class="md-footer"><button class="btn btn-success" data-provider="bootstrap-markdown" data-handler="cmdSave"><i class="fa fa-check"></i> Save</button></div></div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well" id="wid-id-4" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-fullscreenbutton="false" data-widget-sortable="false">
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
                            <span class="widget-icon"> <i class="fa fa-pencil"></i> </span>
                            <h2>Markdown API</h2>

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

                                <h3>Markdown API</h3>

                                <table class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th>Method Name</th>
                                            <th>Description</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td><code>
                                                showEditor()</code></td>
                                            <td>Toggle on the editor visibility</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                showPreview()</code></td>
                                            <td>Toggle on the preview visibility</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                hidePreview()</code></td>
                                            <td>Toggle off the editor visibility</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                isDirty()</code></td>
                                            <td>Check the editor content state, return true if the original content was changed</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                getContent()</code></td>
                                            <td>Get the editor content</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                setContent(<em>string</em> content)</code></td>
                                            <td>Set the editor content</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                findSelection(<em>string</em> words)</code></td>
                                            <td>Find some words/sentence within the editor and returned selection object(containing word position and other useful information).</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                getSelection()</code></td>
                                            <td>Get the current selected chunk of words within the editor.</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                setSelection(<em>int</em> start, <em>int</em> end)</code></td>
                                            <td>Tell the editor to select a span of words from <code>
                                                start</code> to <code>
                                                end</code>.</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                replaceSelection(<em>string</em> content)</code></td>
                                            <td>Replace the current selected chunk of words within the editor with any content.</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                getNextTab()</code></td>
                                            <td>Get the next tab memory. Returned selection object(containing word position and other useful information).</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                setNextTab(<em>int</em> start, <em>int</em> end)</code></td>
                                            <td>Tell the editor to select a span of words from <code>
                                                start</code> to <code>
                                                end</code> at next <code>
                                                tab</code> keypress event.</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                enableButtons(<em>string</em> name)</code></td>
                                            <td>Enabled a button by <code>
                                                name</code> that described in <code>
                                                buttons</code> or <code>
                                                additionalButtons</code> arrays. Passing <code>
                                                all</code> will enabled all buttons.</td>
                                        </tr>
                                        <tr>
                                            <td><code>
                                                disableButtons(<em>string</em> name)</code></td>
                                            <td>Disabled a button by <code>
                                                name</code> that described in <code>
                                                buttons</code> or <code>
                                                additionalButtons</code> arrays. Passing <code>
                                                all</code> will disabled all buttons.</td>
                                        </tr>
                                    </tbody>
                                </table>

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
                    <div class="jarviswidget jarviswidget-color-blue" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-togglebutton="false" data-widget-fullscreenbutton="false" data-widget-sortable="false">
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
                            <span class="widget-icon"> <i class="fa fa-pencil"></i> </span>
                            <h2>Summernote (Lightweight)</h2>

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

                                <div class="summernote" style="display: none;">

                                </div><div class="note-editor"><div class="note-dialog"><div class="note-image-dialog modal" aria-hidden="false"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" aria-hidden="true" tabindex="-1">×</button><h4>Insert Image</h4></div><div class="modal-body"><div class="row-fluid"><div class="note-dropzone span12">Drag an image here</div><div>or if you prefer...</div><input class="note-image-input" type="file"></div></div></div></div></div><div class="note-link-dialog modal" aria-hidden="false"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" aria-hidden="true" tabindex="-1">×</button><h4>Edit Link</h4></div><div class="modal-body"><div class="row-fluid"><div class="form-group"><label>Text to display</label><span class="note-link-text form-control input-xlarge uneditable-input"></span></div><div class="form-group"><label>To what URL should this link go?</label><input class="note-link-url form-control span12" type="text"></div></div></div><div class="modal-footer"><button href="#" class="btn btn-primary note-link-btn disabled" disabled="disabled">Link</button></div></div></div></div><div class="note-help-dialog modal" aria-hidden="false"><div class="modal-dialog"><div class="modal-content"><div class="modal-body"><div class="modal-background"><a class="modal-close pull-right" aria-hidden="true" tabindex="-1">Close</a><div class="title">Smart shortcuts</div><table class="note-shortcut-layout"><tbody><tr><td><table class="note-shortcut"><thead><tr><th></th><th>Action</th></tr></thead><tbody><tr><td>⌘ + Z</td><td>Undo</td></tr><tr><td>⌘ + ⇧ + Z</td><td>Redo</td></tr><tr><td>⌘ + ]</td><td>Indent</td></tr><tr><td>⌘ + [</td><td>Outdent</td></tr><tr><td>⌘ + K</td><td>Insert Link</td></tr><tr><td>⌘ + ENTER</td><td>Insert Horizontal Rule</td></tr></tbody></table></td><td><table class="note-shortcut"><thead><tr><th></th><th>Text formatting</th></tr></thead><tbody><tr><td>⌘ + B</td><td>Toggle Bold</td></tr><tr><td>⌘ + I</td><td>Toggle Italic</td></tr><tr><td>⌘ + U</td><td>Toggle Underline</td></tr><tr><td>⌘ + ⇧ + S</td><td>Toggle Strike</td></tr><tr><td>⌘ + \</td><td>Remove Font Style</td></tr></tbody></table></td></tr><tr><td><table class="note-shortcut"><thead><tr><th></th><th>Document Style</th></tr></thead><tbody><tr><td>⌘ + NUM0</td><td>Normal Text</td></tr><tr><td>⌘ + NUM1</td><td>Heading 1</td></tr><tr><td>⌘ + NUM2</td><td>Heading 2</td></tr><tr><td>⌘ + NUM3</td><td>Heading 3</td></tr><tr><td>⌘ + NUM4</td><td>Heading 4</td></tr><tr><td>⌘ + NUM5</td><td>Heading 5</td></tr><tr><td>⌘ + NUM6</td><td>Heading 6</td></tr></tbody></table></td><td><table class="note-shortcut"><thead><tr><th></th><th>Paragraph formatting</th></tr></thead><tbody><tr><td>⌘ + ⇧ + L</td><td>Align Left</td></tr><tr><td>⌘ + ⇧ + E</td><td>Align Center</td></tr><tr><td>⌘ + ⇧ + R</td><td>Align Right</td></tr><tr><td>⌘ + ⇧ + J</td><td>Justify Full</td></tr><tr><td>⌘ + ⇧ + NUM7</td><td>Ordered List</td></tr><tr><td>⌘ + ⇧ + NUM8</td><td>Unordered List</td></tr></tbody></table></td></tr></tbody></table></div></div></div></div></div></div><div class="note-handle"><div class="note-control-selection"><div class="note-control-selection-bg"></div><div class="note-control-holder note-control-nw"></div><div class="note-control-holder note-control-ne"></div><div class="note-control-holder note-control-sw"></div><div class="note-control-sizing note-control-se"></div><div class="note-control-selection-info"></div></div></div><div class="note-popover"><div class="note-link-popover popover bottom in" style="display: none;"><div class="arrow"></div><div class="popover-content note-link-content"><a href="http://www.google.com" target="_blank">www.google.com</a>&nbsp;&nbsp;<div cla"""),
format.raw("""ss="note-insert btn-group"><button type="button" class="btn btn-default" title="" data-event="showLinkDialog" tabindex="-1" data-original-title="Edit"><i class="fa fa-edit"></i></button><button type="button" class="btn btn-default" title="" data-event="unlink" tabindex="-1" data-original-title="Unlink"><i class="fa fa-unlink"></i></button></div></div></div><div class="note-image-popover popover bottom in" style="display: none;"><div class="arrow"></div><div class="popover-content note-image-content"><div class="btn-group"><button type="button" class="btn btn-default" title="" data-event="resize" data-value="1" tabindex="-1" data-original-title="Resize Full"><i class="fa fa-resize-full"></i></button><button type="button" class="btn btn-default" title="" data-event="resize" data-value="0.5" tabindex="-1" data-original-title="Resize Half">½</button><button type="button" class="btn btn-default" title="" data-event="resize" data-value="0.33" tabindex="-1" data-original-title="Resize Thrid">⅓</button><button type="button" class="btn btn-default" title="" data-event="resize" data-value="0.25" tabindex="-1" data-original-title="Resize Quarter">¼</button></div><div class="btn-group"><button type="button" class="btn btn-default" title="" data-event="float" data-value="left" tabindex="-1" data-original-title="Float Left"><i class="fa fa-align-left"></i></button><button type="button" class="btn btn-default" title="" data-event="float" data-value="right" tabindex="-1" data-original-title="Float Right"><i class="fa fa-align-right"></i></button><button type="button" class="btn btn-default" title="" data-event="float" data-value="none" tabindex="-1" data-original-title="Float None"><i class="fa fa-reorder"></i></button></div></div></div></div><div class="note-toolbar btn-toolbar"><div class="note-style btn-group"><button type="button" class="btn btn-default dropdown-toggle" title="" data-toggle="dropdown" tabindex="-1" data-original-title="Style"><i class="fa fa-magic"></i> <span class="caret"></span></button><ul class="dropdown-menu"><li><a data-event="formatBlock" data-value="p">Normal</a></li><li><a data-event="formatBlock" data-value="blockquote"><blockquote>Quote</blockquote></a></li><li><a data-event="formatBlock" data-value="pre">Code</a></li><li><a data-event="formatBlock" data-value="h1"><h1>Header 1</h1></a></li><li><a data-event="formatBlock" data-value="h2"><h2>Header 2</h2></a></li><li><a data-event="formatBlock" data-value="h3"><h3>Header 3</h3></a></li><li><a data-event="formatBlock" data-value="h4"><h4>Header 4</h4></a></li><li><a data-event="formatBlock" data-value="h5"><h5>Header 5</h5></a></li><li><a data-event="formatBlock" data-value="h6"><h6>Header 6</h6></a></li></ul></div><div class="note-font btn-group"><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+B" data-mac-shortcut="⌘+B" data-event="bold" tabindex="-1" data-original-title="Bold (Ctrl+B)"><i class="fa fa-bold"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+I" data-mac-shortcut="⌘+I" data-event="italic" tabindex="-1" data-original-title="Italic (Ctrl+I)"><i class="fa fa-italic"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+U" data-mac-shortcut="⌘+U" data-event="underline" tabindex="-1" data-original-title="Underline (Ctrl+U)"><i class="fa fa-underline"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+\" data-mac-shortcut="⌘+\" data-event="removeFormat" tabindex="-1" data-original-title="Remove Font Style (Ctrl+\)"><i class="fa fa-eraser"></i></button></div><div class="note-fontsize btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" title="" tabindex="-1" data-original-title="Font Size"><span class="note-current-fontsize">11</span> <b class="caret"></b></button><ul class="dropdown-menu"><li><a data-event="fontSize" data-value="8"><i class="fa fa-check"></i> 8</a></li><li><a data-event="fontSize" data-value="9"><i class="fa fa-check"></i> 9</a></li><li><a data-event="fontSize" data-value="10"><i class="fa fa-check"></i> 10</a></li><li><a data-event="fontSize" data-value="11"><i class="fa fa-check"></i> 11</a></li><li><a data-event="fontSize" data-value="12"><i class="fa fa-check"></i> 12</a></li><li><a data-event="fontSize" data-value="14"><i class="fa fa-check"></i> 14</a></li><li><a data-event="fontSize" data-value="18"><i class="fa fa-check"></i> 18</a></li><li><a data-event="fontSize" data-value="24"><i class="fa fa-check"></i> 24</a></li><li><a data-event="fontSize" data-value="36"><i class="fa fa-check"></i> 36</a></li></ul></div><div class="note-color btn-group"><button type="button" class="btn btn-default note-recent-color" title="" data-event="color" data-value=""""),format.raw/*281.8664*/("""{"""),format.raw/*281.8665*/("""&quot;backColor&quot;:&quot;yellow&quot;"""),format.raw/*281.8705*/("""}"""),format.raw/*281.8706*/("""" tabindex="-1" data-original-title="Recent Color"><i class="fa fa-font" style="color:black;background-color:yellow;"></i></button><button type="button" class="btn btn-default dropdown-toggle" title="" data-toggle="dropdown" tabindex="-1" data-original-title="More Color"><span class="caret"></span></button><ul class="dropdown-menu"><li><div class="btn-group"><div class="note-palette-title">BackColor</div><div class="note-color-reset" data-event="backColor" data-value="inherit" title="Transparent">Set transparent</div><div class="note-color-palette" data-target-event="backColor"><div><button type="button" class="note-color-btn" style="background-color:#000000;" data-event="backColor" data-value="#000000" title="" data-toggle="button" tabindex="-1" data-original-title="#000000"></button><button type="button" class="note-color-btn" style="background-color:#424242;" data-event="backColor" data-value="#424242" title="" data-toggle="button" tabindex="-1" data-original-title="#424242"></button><button type="button" class="note-color-btn" style="background-color:#636363;" data-event="backColor" data-value="#636363" title="" data-toggle="button" tabindex="-1" data-original-title="#636363"></button><button type="button" class="note-color-btn" style="background-color:#9C9C94;" data-event="backColor" data-value="#9C9C94" title="" data-toggle="button" tabindex="-1" data-original-title="#9C9C94"></button><button type="button" class="note-color-btn" style="background-color:#CEC6CE;" data-event="backColor" data-value="#CEC6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#CEC6CE"></button><button type="button" class="note-color-btn" style="background-color:#EFEFEF;" data-event="backColor" data-value="#EFEFEF" title="" data-toggle="button" tabindex="-1" data-original-title="#EFEFEF"></button><button type="button" class="note-color-btn" style="background-color:#EFF7F7;" data-event="backColor" data-value="#EFF7F7" title="" data-toggle="button" tabindex="-1" data-original-title="#EFF7F7"></button><button type="button" class="note-color-btn" style="background-color:#FFFFFF;" data-event="backColor" data-value="#FFFFFF" title="" data-toggle="button" tabindex="-1" data-original-title="#FFFFFF"></button></div><div><button type="button" class="note-color-btn" style="background-color:#FF0000;" data-event="backColor" data-value="#FF0000" title="" data-toggle="button" tabindex="-1" data-original-title="#FF0000"></button><button type="button" class="note-color-btn" style="background-color:#FF9C00;" data-event="backColor" data-value="#FF9C00" title="" data-toggle="button" tabindex="-1" data-original-title="#FF9C00"></button><button type="button" class="note-color-btn" style="background-color:#FFFF00;" data-event="backColor" data-value="#FFFF00" title="" data-toggle="button" tabindex="-1" data-original-title="#FFFF00"></button><button type="button" class="note-color-btn" style="background-color:#00FF00;" data-event="backColor" data-value="#00FF00" title="" data-toggle="button" tabindex="-1" data-original-title="#00FF00"></button><button type="button" class="note-color-btn" style="background-color:#00FFFF;" data-event="backColor" data-value="#00FFFF" title="" data-toggle="button" tabindex="-1" data-original-title="#00FFFF"></button><button type="button" class="note-color-btn" style="background-color:#0000FF;" data-event="backColor" data-value="#0000FF" title="" data-toggle="button" tabindex="-1" data-original-title="#0000FF"></button><button type="button" class="note-color-btn" style="background-color:#9C00FF;" data-event="backColor" data-value="#9C00FF" title="" data-toggle="button" tabindex="-1" data-original-title="#9C00FF"></button><button type="button" class="note-color-btn" style="background-color:#FF00FF;" data-event="backColor" data-value="#FF00FF" title="" data-toggle="button" tabindex="-1" data-original-title="#FF00FF"></button></div><div><button type="button" class="note-color-btn" style="background-color:#F7C6CE;" data-event="backColor" data-value="#F7C6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#F7C6CE"></button><button type="button" class="note-color-btn" style="background-color:#FFE7CE;" data-event="backColor" data-value="#FFE7CE" title="" data-toggle="button" tabindex="-1" data-original-title="#FFE7CE"></button><button type="button" class="note-color-btn" style="background-color:#FFEFC6;" data-event="backColor" data-value="#FFEFC6" title="" data-toggle="button" tabindex="-1" data-original-title="#FFEFC6"></button><button type="button" class="note-color-btn" style="background-color:#D6EFD6;" data-event="backColor" data-value="#D6EFD6" title="" data-toggle="button" tabindex="-1" data-original-title="#D6EFD6"></button><button type="button" class="note-color-btn" style="background-color:#CEDEE7;" data-event="backColor" data-value="#CEDEE7" title="" data-toggle="button" tabindex="-1" data-original-title="#CEDEE7"></button><button type="button" class="note-color-btn" style="background-color:#CEE7F7;" data-event="backColor" data-value="#CEE7F7" title="" data-toggle="button" tabindex="-1" data-original-title="#CEE7F7"></button><button type="button" class="note-color-btn" style="background-color:#D6D6E7;" data-event="backColor" data-value="#D6D6E7" title="" data-toggle="button" tabindex="-1" data-original-title="#D6D6E7"></button><button type="button" class="note-color-btn" style="background-color:#E7D6DE;" data-event="backColor" data-value="#E7D6DE" title="" data-toggle="button" tabindex="-1" data-original-title="#E7D6DE"></button></div><div><button type="button" class="note-color-btn" style="background-color:#E79C9C;" data-event="backColor" data-value="#E79C9C" title="" data-toggle="button" tabindex="-1" data-original-title="#E79C9C"></button><button type="button" class="note-color-btn" style="background-color:#FFC69C;" data-event="backColor" data-value="#FFC69C" title="" data-toggle="button" tabindex="-1" data-original-title="#FFC69C"></button><button type="button" class="note-color-btn" style="background-color:#FFE79C;" data-event="backColor" data-value="#FFE79C" title="" data-toggle="button" tabindex="-1" data-original-title="#FFE79C"></button><button type="button" class="note-color-btn" style="background-color:#B5D6A5;" data-event="backColor" data-value="#B5D6A5" title="" data-toggle="button" tabindex="-1" data-original-title="#B5D6A5"></button><button type="button" class="note-color-btn" style="background-color:#A5C6CE;" data-event="backColor" data-value="#A5C6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#A5C6CE"></button><button type="button" class="note-color-btn" style="background-color:#9CC6EF;" data-event="backColor" data-value="#9CC6EF" title="" data-toggle="button" tabindex="-1" data-original-title="#9CC6EF"></button><button type="button" class="note-color-btn" style="background-color:#B5A5D6;" data-event="backColor" data-value="#B5A5D6" title="" data-toggle="button" tabindex="-1" data-original-title="#B5A5D6"></button><button type="button" class="note-color-btn" style="background-color:#D6A5BD;" data-event="backColor" data-value="#D6A5BD" title="" data-toggle="button" tabindex="-1" data-original-title="#D6A5BD"></button></div><div><button type="button" class="note-color-btn" style="background-color:#E76363;" data-event="backColor" data-value="#E76363" title="" data-toggle="button" tabindex="-1" data-original-title="#E76363"></button><button type="button" class="note-color-btn" style="background-color:#F7AD6B;" data-event="backColor" data-value="#F7AD6B" title="" data-toggle="button" tabindex="-1" data-original-title="#F7AD6B"></button><button type="button" class="note-color-btn" style="background-color:#FFD663;" data-event="backColor" data-value="#FFD663" title="" data-toggle="button" tabindex="-1" data-original-title="#FFD663"></button><button type="button" class="note-color-btn" style="background-color:#94BD7B;" data-event="backColor" data-value="#94BD7B" title="" data-toggle="button" tabindex="-1" data-original-title="#94BD7B"></button><button type="button" class="note-color-btn" style="background-color:#73A5AD;" data-event="backColor" data-value="#73A5AD" title="" data-toggle="button" tabindex="-1" data-original-title="#73A5AD"></button><button type="button" class="note-color-btn" style="background-color:#6BADDE;" data-event="backColor" data-value="#6BADDE" title="" data-toggle="button" tabindex="-1" data-original-title="#6BADDE"></button><button type="button" class="note-color-btn" style="background-color:#8C7BC6;" data-event="backColor" data-value="#8C7BC6" title="" data-toggle="button" tabindex="-1" data-original-title="#8C7BC6"></button><button type="button" class="note-color-btn" style="background-color:#C67BA5;" data-event="backColor" data-value="#C67BA5" title="" data-toggle="button" tabindex="-1" data-original-title="#C67BA5"></button></div><div><button type="button" class="note-color-btn" style="background-color:#CE0000;" data-event="backColor" data-value="#CE0000" title="" data-toggle="button" tabindex="-1" data-original-title="#CE0000"></button><button type="button" class="note-color-btn" style="background-color:#E79439;" data-event="backColor" data-value="#E79439" title="" data-toggle="button" tabindex="-1" data-original-title="#E79439"></button><button type="button" class="note-color-btn" style="background-color:#EFC631;" data-event="backColor" data-value="#EFC631" title="" data-toggle="button" tabindex="-1" data-original-title="#EFC631"></button><button type="button" class="note-color-btn" style="background-color:#6BA54A;" data-event="backColor" data-value="#6BA54A" title="" data-toggle="button" tabindex="-1" data-original-title="#6BA54A"></button><button type="button" class="note-color-btn" style="background-color:#4A7B8C;" data-event="backColor" data-value="#4A7B8C" title="" data-toggle="button" tabindex="-1" data-original-title="#4A7B8C"></button><button type="button" class="note-color-btn" style="background-color:#3984C6;" data-event="backColor" data-value="#3984C6" title="" data-toggle="button" tabindex="-1" data-original-title="#3984C6"></button><button type="button" class="note-color-btn" style="background-color:#634AA5;" data-event="backColor" data-value="#634AA5" title="" data-toggle="button" tabindex="-1" data-original-title="#634AA5"></button><button type="button" class="note-color-btn" style="background-color:#A54A7B;" data-event="backColor" data-value="#A54A7B" title="" data-toggle="button" tabindex="-1" data-original-title="#A54A7B"></button></div><div><button type="button" class="note-color-btn" style="background-color:#9C0000;" data-event="backColor" data-value="#9C0000" title="" data-toggle="button" tabindex="-1" data-original-title="#9C0000"></button><button type="button" class="note-color-btn" style="background-color:#B56308;" data-event="backColor" data-value="#B56308" title="" data-toggle="button" tabindex="-1" data-original-title="#B56308"></button><button type="button" class="note-color-btn" style="background-color:#BD9400;" data-event="backColor" data-value="#BD9400" title="" data-toggle="button" tabindex="-1" data-original-title="#BD9400"></button><button type="button" class="note-color-btn" style="background-color:#397B21;" data-event="backColor" data-value="#397B21" title="" data-toggle="button" tabindex="-1" data-original-title="#397B21"></button><button type="button" class="note-color-btn" style="background-color:#104A5A;" data-event="backColor" data-value="#104A5A" title="" data-toggle="button" tabindex="-1" data-original-title="#104A5A"></button><button type="button" class="note-color-btn" style="background-color:#085294;" data-event="backColor" data-value="#085294" title="" data-toggle="button" tabindex="-1" data-original-title="#085294"></button><button type="button" class="note-color-btn" style="background-color:#311873;" data-event="backColor" data-value="#311873" title="" data-toggle="button" tabindex="-1" data-original-title="#311873"></button><button type="button" class="note-color-btn" style="background-color:#731842;" data-event="backColor" data-value="#731842" title="" data-toggle="button" tabindex="-1" data-original-title="#731842"></button></div><div><button type="button" class="note-color-btn" style="background-color:#630000;" data-event="backColor" data-value="#630000" title="" data-toggle="button" tabindex="-1" data-original-title="#630000"></button><button type="button" class="note-color-btn" style="background-color:#7B3900;" data-event="backColor" data-value="#7B3900" title="" data-toggle="button" tabindex="-1" data-original-title="#7B3900"></button><button type="button" class="note-color-btn" style="background-color:#846300;" data-event="backColor" data-value="#846300" title="" data-toggle="button" tabindex="-1" data-original-title="#846300"></button><button type="button" class="note-color-btn" style="background-color:#295218;" data-event="backColor" data-value="#295218" title="" data-toggle="button" tabindex="-1" data-original-title="#295218"></button><button type="button" class="note-color-btn" style="background-color:#083139;" data-event="backColor" data-value="#083139" title="" data-toggle="button" tabindex="-1" data-original-title="#083139"></button><button type="button" class="note-color-btn" style="background-color:#003163;" data-event="backColor" data-value="#003163" title="" data-toggle="button" tabindex="-1" data-original-title="#003163"></button><button type="button" class="note-color-btn" style="background-color:#21104A;" data-event="backColor" data-value="#21104A" title="" data-toggle="button" tabindex="-1" data-original-title="#21104A"></button><button type="button" class="note-color-btn" style="background-color:#4A1031;" data-event="backColor" data-value="#4A1031" title="" data-toggle="button" tabindex="-1" data-original-title="#4A1031"></button></div></div></div><div class="btn-group"><div class="note-palette-title">FontColor</div><div class="note-color-reset" data-event="foreColor" data-value="inherit" title="Reset">Reset to default</div><div class="note-color-palette" data-target-event="foreColor"><div><button type="button" class="note-color-btn" style="background-color:#000000;" data-event="foreColor" data-value="#000000" title="" data-toggle="button" tabindex="-1" data-original-title="#000000"></button><button type="button" class="note-color-btn" style="background-color:#424242;" data-event="foreColor" data-value="#424242" title="" data-toggle="button" tabindex="-1" data-original-title="#424242"></button><button type="button" class="note-color-btn" style="background-color:#636363;" data-event="foreColor" data-value="#636363" title="" data-toggle="button" tabindex="-1" data-original-title="#636363"></button><button type="button" class="note-color-btn" style="background-color:#9C9C94;" data-event="foreColor" data-value="#9C9C94" title="" data-toggle="button" tabindex="-1" data-original-title="#9C9C94"></button><button type="button" class="note-color-btn" style="background-color:#CEC6CE;" data-event="foreColor" data-value="#CEC6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#CEC6CE"></button><button type="button" class="note-color-btn" style="background-color:#EFEFEF;" data-event="foreColor" data-value="#EFEFEF" title="" data-toggle="button" tabindex="-1" data-original-title="#EFEFEF"></button><button type="button" class="note-color-btn" style="background-color:#EFF7F7;" data-event="foreColor" data-value="#EFF7F7" title="" data-toggle="button" tabindex="-1" data-original-title="#EFF7F7"></button><button type="button" class="note-color-btn" style="background-color:#FFFFFF;" data-event="foreColor" data-value="#FFFFFF" title="" data-toggle="button" tabindex="-1" data-original-title="#FFFFFF"></button></div><div><button type="button" class="note-color-btn" style="background-color:#FF0000;" data-event="foreColor" data-value="#FF0000" title="" data-toggle="button" tabindex="-1" data-original-title="#FF0000"></button><button type="button" class="note-color-btn" style="background-color:#FF9C00;" data-event="foreColor" data-value="#FF9C00" title="" data-toggle="button" tabindex="-1" data-original-title="#FF9C00"></button><button type="button" class="note-color-btn" style="background-color:#FFFF00;" data-event="foreColor" data-value="#FFFF00" title="" data-toggle="button" tabindex="-1" data-original-title="#FFFF00"></button><button type="button" class="note-color-btn" style="background-color:#00FF00;" data-event="foreColor" data-value="#00FF00" title="" data-toggle="button" tabindex="-1" data-original-title="#00FF00"></button><button type="button" class="note-color-btn" style="background-color:#00FFFF;" data-event="foreColor" data-value="#00FFFF" title="" data-toggle="button" tabindex="-1" data-original-title="#00FFFF"></button><button type="button" class="note-color-btn" style="background-color:#0000FF;" data-event="foreColor" data-value="#0000FF" title="" data-toggle="button" tabindex="-1" data-original-title="#0000FF"></button><button type="button" class="note-color-btn" style="background-color:#9C00FF;" data-event="foreColor" data-value="#9C00FF" title="" data-toggle="button" tabindex="-1" data-original-title="#9C00FF"></button><button type="button" class="note-color-btn" style="background-color:#FF00FF;" data-event="foreColor" data-value="#FF00FF" title="" data-toggle="button" tabindex="-1" data-original-title="#FF00FF"></button></div><div><button type="button" class="note-color-btn" style="background-color:#F7C6CE;" data-event="foreColor" data-value="#F7C6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#F7C6CE"></button><button type="button" class="note-color-btn" style="background-color:#FFE7CE;" data-event="foreColor" data-value="#FFE7CE" title="" data-toggle="button" tabindex="-1" data-original-title="#FFE7CE"></button><button type="button" class="note-color-btn" style="background-color:#FFEFC6;" data-event="foreColor" data-value="#FFEFC6" title="" data-toggle="button" tabindex="-1" data-original-title="#FFEFC6"></button><button type="button" class="note-color-btn" style="background-color:#D6EFD6;" data-event="foreColor" data-value="#D6EFD6" title="" data-toggle="button" tabindex="-1" data-original-title="#D6EFD6"></button><button type="button" class="note-color-btn" style="background-color:#CEDEE7;" data-event="foreColor" data-value="#CEDEE7" title="" data-toggle="button" tabindex="-1" data-original-title="#CEDEE7"></button><button type="button" class="note-color-btn" style="background-color:#CEE7F7;" data-event="foreColor" data-value="#CEE7F7" title="" data-toggle="button" tabindex="-1" data-original-title="#CEE7F7"></button><button type="button" class="note-color-btn" style="background-color:#D6D6E7;" data-event="foreColor" data-value="#D6D6E7" title="" data-toggle="button" tabindex="-1" data-original-title="#D6D6E7"></button><button type="button" class="note-color-btn" style="background-color:#E7D6DE;" data-event="foreColor" data-value="#E7D6DE" title="" data-toggle="button" tabindex="-1" data-original-title="#E7D6DE"></button></div><div><button type="button" class="note-color-btn" style="background-color:#E79C9C;" data-event="foreColor" data-value="#E79C9C" title="" data-toggle="button" tabindex="-1" data-original-title="#E79C9C"></button><button type="button" class="note-color-btn" style="background-color:#FFC69C;" data-event="foreColor" data-value="#FFC69C" title="" data-toggle="button" tabindex="-1" data-original-title="#FFC69C"></button><button type="button" class="note-color-btn" style="background-color:#FFE79C;" data-event="foreColor" data-value="#FFE79C" title="" data-toggle="button" tabindex="-1" data-original-title="#FFE79C"></button><button type="button" class="note-color-btn" style="background-color:#B5D6A5;" data-event="foreColor" data-value="#B5D6A5" title="" data-toggle="button" tabindex="-1" data-original-title="#B5D6A5"></button><button type="button" class="note-color-btn" style="background-color:#A5C6CE;" data"""),
format.raw("""-event="foreColor" data-value="#A5C6CE" title="" data-toggle="button" tabindex="-1" data-original-title="#A5C6CE"></button><button type="button" class="note-color-btn" style="background-color:#9CC6EF;" data-event="foreColor" data-value="#9CC6EF" title="" data-toggle="button" tabindex="-1" data-original-title="#9CC6EF"></button><button type="button" class="note-color-btn" style="background-color:#B5A5D6;" data-event="foreColor" data-value="#B5A5D6" title="" data-toggle="button" tabindex="-1" data-original-title="#B5A5D6"></button><button type="button" class="note-color-btn" style="background-color:#D6A5BD;" data-event="foreColor" data-value="#D6A5BD" title="" data-toggle="button" tabindex="-1" data-original-title="#D6A5BD"></button></div><div><button type="button" class="note-color-btn" style="background-color:#E76363;" data-event="foreColor" data-value="#E76363" title="" data-toggle="button" tabindex="-1" data-original-title="#E76363"></button><button type="button" class="note-color-btn" style="background-color:#F7AD6B;" data-event="foreColor" data-value="#F7AD6B" title="" data-toggle="button" tabindex="-1" data-original-title="#F7AD6B"></button><button type="button" class="note-color-btn" style="background-color:#FFD663;" data-event="foreColor" data-value="#FFD663" title="" data-toggle="button" tabindex="-1" data-original-title="#FFD663"></button><button type="button" class="note-color-btn" style="background-color:#94BD7B;" data-event="foreColor" data-value="#94BD7B" title="" data-toggle="button" tabindex="-1" data-original-title="#94BD7B"></button><button type="button" class="note-color-btn" style="background-color:#73A5AD;" data-event="foreColor" data-value="#73A5AD" title="" data-toggle="button" tabindex="-1" data-original-title="#73A5AD"></button><button type="button" class="note-color-btn" style="background-color:#6BADDE;" data-event="foreColor" data-value="#6BADDE" title="" data-toggle="button" tabindex="-1" data-original-title="#6BADDE"></button><button type="button" class="note-color-btn" style="background-color:#8C7BC6;" data-event="foreColor" data-value="#8C7BC6" title="" data-toggle="button" tabindex="-1" data-original-title="#8C7BC6"></button><button type="button" class="note-color-btn" style="background-color:#C67BA5;" data-event="foreColor" data-value="#C67BA5" title="" data-toggle="button" tabindex="-1" data-original-title="#C67BA5"></button></div><div><button type="button" class="note-color-btn" style="background-color:#CE0000;" data-event="foreColor" data-value="#CE0000" title="" data-toggle="button" tabindex="-1" data-original-title="#CE0000"></button><button type="button" class="note-color-btn" style="background-color:#E79439;" data-event="foreColor" data-value="#E79439" title="" data-toggle="button" tabindex="-1" data-original-title="#E79439"></button><button type="button" class="note-color-btn" style="background-color:#EFC631;" data-event="foreColor" data-value="#EFC631" title="" data-toggle="button" tabindex="-1" data-original-title="#EFC631"></button><button type="button" class="note-color-btn" style="background-color:#6BA54A;" data-event="foreColor" data-value="#6BA54A" title="" data-toggle="button" tabindex="-1" data-original-title="#6BA54A"></button><button type="button" class="note-color-btn" style="background-color:#4A7B8C;" data-event="foreColor" data-value="#4A7B8C" title="" data-toggle="button" tabindex="-1" data-original-title="#4A7B8C"></button><button type="button" class="note-color-btn" style="background-color:#3984C6;" data-event="foreColor" data-value="#3984C6" title="" data-toggle="button" tabindex="-1" data-original-title="#3984C6"></button><button type="button" class="note-color-btn" style="background-color:#634AA5;" data-event="foreColor" data-value="#634AA5" title="" data-toggle="button" tabindex="-1" data-original-title="#634AA5"></button><button type="button" class="note-color-btn" style="background-color:#A54A7B;" data-event="foreColor" data-value="#A54A7B" title="" data-toggle="button" tabindex="-1" data-original-title="#A54A7B"></button></div><div><button type="button" class="note-color-btn" style="background-color:#9C0000;" data-event="foreColor" data-value="#9C0000" title="" data-toggle="button" tabindex="-1" data-original-title="#9C0000"></button><button type="button" class="note-color-btn" style="background-color:#B56308;" data-event="foreColor" data-value="#B56308" title="" data-toggle="button" tabindex="-1" data-original-title="#B56308"></button><button type="button" class="note-color-btn" style="background-color:#BD9400;" data-event="foreColor" data-value="#BD9400" title="" data-toggle="button" tabindex="-1" data-original-title="#BD9400"></button><button type="button" class="note-color-btn" style="background-color:#397B21;" data-event="foreColor" data-value="#397B21" title="" data-toggle="button" tabindex="-1" data-original-title="#397B21"></button><button type="button" class="note-color-btn" style="background-color:#104A5A;" data-event="foreColor" data-value="#104A5A" title="" data-toggle="button" tabindex="-1" data-original-title="#104A5A"></button><button type="button" class="note-color-btn" style="background-color:#085294;" data-event="foreColor" data-value="#085294" title="" data-toggle="button" tabindex="-1" data-original-title="#085294"></button><button type="button" class="note-color-btn" style="background-color:#311873;" data-event="foreColor" data-value="#311873" title="" data-toggle="button" tabindex="-1" data-original-title="#311873"></button><button type="button" class="note-color-btn" style="background-color:#731842;" data-event="foreColor" data-value="#731842" title="" data-toggle="button" tabindex="-1" data-original-title="#731842"></button></div><div><button type="button" class="note-color-btn" style="background-color:#630000;" data-event="foreColor" data-value="#630000" title="" data-toggle="button" tabindex="-1" data-original-title="#630000"></button><button type="button" class="note-color-btn" style="background-color:#7B3900;" data-event="foreColor" data-value="#7B3900" title="" data-toggle="button" tabindex="-1" data-original-title="#7B3900"></button><button type="button" class="note-color-btn" style="background-color:#846300;" data-event="foreColor" data-value="#846300" title="" data-toggle="button" tabindex="-1" data-original-title="#846300"></button><button type="button" class="note-color-btn" style="background-color:#295218;" data-event="foreColor" data-value="#295218" title="" data-toggle="button" tabindex="-1" data-original-title="#295218"></button><button type="button" class="note-color-btn" style="background-color:#083139;" data-event="foreColor" data-value="#083139" title="" data-toggle="button" tabindex="-1" data-original-title="#083139"></button><button type="button" class="note-color-btn" style="background-color:#003163;" data-event="foreColor" data-value="#003163" title="" data-toggle="button" tabindex="-1" data-original-title="#003163"></button><button type="button" class="note-color-btn" style="background-color:#21104A;" data-event="foreColor" data-value="#21104A" title="" data-toggle="button" tabindex="-1" data-original-title="#21104A"></button><button type="button" class="note-color-btn" style="background-color:#4A1031;" data-event="foreColor" data-value="#4A1031" title="" data-toggle="button" tabindex="-1" data-original-title="#4A1031"></button></div></div></div></li></ul></div><div class="note-para btn-group"><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+8" data-mac-shortcut="⌘+⇧+7" data-event="insertUnorderedList" tabindex="-1" data-original-title="Unordered list (Ctrl+Shift+8)"><i class="fa fa-list-ul"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+7" data-mac-shortcut="⌘+⇧+8" data-event="insertOrderedList" tabindex="-1" data-original-title="Ordered list (Ctrl+Shift+7)"><i class="fa fa-list-ol"></i></button><button type="button" class="btn btn-default dropdown-toggle" title="" data-toggle="dropdown" tabindex="-1" data-original-title="Paragraph"><i class="fa fa-align-left"></i>  <span class="caret"></span></button><ul class="dropdown-menu"><li><div class="note-align btn-group"><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+L" data-mac-shortcut="⌘+⇧+L" data-event="justifyLeft" tabindex="-1" data-original-title="Align left (Ctrl+Shift+L)"><i class="fa fa-align-left"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+E" data-mac-shortcut="⌘+⇧+E" data-event="justifyCenter" tabindex="-1" data-original-title="Align center (Ctrl+Shift+E)"><i class="fa fa-align-center"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+R" data-mac-shortcut="⌘+⇧+R" data-event="justifyRight" tabindex="-1" data-original-title="Align right (Ctrl+Shift+R)"><i class="fa fa-align-right"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+Shift+J" data-mac-shortcut="⌘+⇧+J" data-event="justifyFull" tabindex="-1" data-original-title="Justify full (Ctrl+Shift+J)"><i class="fa fa-align-justify"></i></button></div></li><li><div class="note-list btn-group"><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+[" data-mac-shortcut="⌘+[" data-event="outdent" tabindex="-1" data-original-title="Outdent (Ctrl+[)"><i class="fa fa-indent"></i></button><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+]" data-mac-shortcut="⌘+]" data-event="indent" tabindex="-1" data-original-title="Indent (Ctrl+])"><i class="fa fa-outdent"></i></button></div></li></ul></div><div class="note-height btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" title="" tabindex="-1" data-original-title="Line Height"><i class="fa fa-text-height"></i>&nbsp; <b class="caret"></b></button><ul class="dropdown-menu"><li><a data-event="lineHeight" data-value="1.0"><i class="fa fa-check"></i> 1.0</a></li><li><a data-event="lineHeight" data-value="1.2"><i class="fa fa-check"></i> 1.2</a></li><li><a data-event="lineHeight" data-value="1.4"><i class="fa fa-check"></i> 1.4</a></li><li><a data-event="lineHeight" data-value="1.5"><i class="fa fa-check"></i> 1.5</a></li><li><a data-event="lineHeight" data-value="1.6"><i class="fa fa-check"></i> 1.6</a></li><li><a data-event="lineHeight" data-value="1.8"><i class="fa fa-check"></i> 1.8</a></li><li><a data-event="lineHeight" data-value="2.0"><i class="fa fa-check"></i> 2.0</a></li><li><a data-event="lineHeight" data-value="3.0"><i class="fa fa-check"></i> 3.0</a></li></ul></div><div class="note-table btn-group"><button type="button" class="btn btn-default dropdown-toggle" title="" data-toggle="dropdown" tabindex="-1" data-original-title="Table"><i class="fa fa-table"></i> <span class="caret"></span></button><ul class="dropdown-menu"><div class="note-dimension-picker"><div class="note-dimension-picker-mousecatcher" data-event="insertTable" data-value="1x1"></div><div class="note-dimension-picker-highlighted"></div><div class="note-dimension-picker-unhighlighted"></div></div><div class="note-dimension-display"> 1 x 1 </div></ul></div><div class="note-insert btn-group"><button type="button" class="btn btn-default" title="" data-event="showLinkDialog" data-shortcut="Ctrl+K" data-mac-shortcut="⌘+K" tabindex="-1" data-original-title="Link (Ctrl+K)"><i class="fa fa-link"></i></button><button type="button" class="btn btn-default" title="" data-event="showImageDialog" tabindex="-1" data-original-title="Picture"><i class="fa fa-picture-o"></i></button></div><div class="note-view btn-group"><button type="button" class="btn btn-default" title="" data-event="fullscreen" tabindex="-1" data-original-title="Full Screen"><i class="fa fa-arrows-alt"></i></button><button type="button" class="btn btn-default" title="" data-event="codeview" tabindex="-1" data-original-title="Code View"><i class="fa fa-code"></i></button></div><div class="note-help btn-group"><button type="button" class="btn btn-default" title="" data-shortcut="Ctrl+/" data-mac-shortcut="⌘+/" data-event="showHelpDialog" tabindex="-1" data-original-title="Help (Ctrl+/)"><i class="fa fa-question"></i></button></div></div><textarea class="note-codeable"></textarea><div class="note-editable custom-scroll" contenteditable="true" style="height: 180px;">

                            </div><div class="note-statusbar"><div class="note-resizebar"><div class="note-icon-bar"></div><div class="note-icon-bar"></div><div class="note-icon-bar"></div></div></div></div>

                                <div class="widget-footer smart-form">

                                    <div class="btn-group">

                                        <button class="btn btn-sm btn-primary" type="button">
                                            <i class="fa fa-times"></i> Cancel
                                        </button>

                                    </div>
                                    <div class="btn-group">

                                        <button class="btn btn-sm btn-success" type="button">
                                            <i class="fa fa-check"></i> Save
                                        </button>

                                    </div>

                                    <label class="checkbox pull-left">
                                        <input type="checkbox" checked="checked" name="autosave" id="autosave">
                                        <i></i>Auto Save
                                    </label>

                                </div>

                            </div>
                                <!-- end widget content -->

                        </div>
                            <!-- end widget div -->

                    </div>
                        <!-- end widget -->

                        <!-- Widget ID (each widget will need unique ID)-->
                    <div class="jarviswidget well" id="wid-id-1">
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
                            <span class="widget-icon"> <i class="fa fa-pencil"></i> </span>
                            <h2>Example </h2>

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

                                <h3>Summernote Example</h3>
                                <p>
                                    <button id="edit" class="btn btn-primary" onclick="edit()" type="button">
                                        Edit
                                    </button>
                                    <button id="save" class="btn btn-primary" onclick="save()" type="button">
                                        Save
                                    </button>
                                </p>
                                <p></p>
                                <div class="click2edit">
                                    <pre><code class="javascript">var edit = function() """),format.raw/*363.89*/("""{"""),format.raw/*363.90*/(""" """),format.raw/*363.91*/("""$('.click2edit').summernote() """),format.raw/*363.121*/("""}"""),format.raw/*363.122*/(""";</code></pre>
                                </div>

                                <h5>HTML:</h5>
                                <pre><code class="xml">&lt;button id="edit" class="btn btn-primary" onclick="edit()" type="button"&gt;Edit 1&lt;/button&gt;
                                    &lt;button id="save" class="btn btn-primary" onclick="save()" type="button"&gt;Save 2&lt;/button&gt;
                                    &lt;div class="click2edit"&gt;click2edit&lt;/div&gt;</code></pre>
                                <h5>Script:</h5>
                                <pre><code class="javascript">var edit = function() """),format.raw/*371.85*/("""{"""),format.raw/*371.86*/("""
                                    """),format.raw/*372.37*/("""$('.click2edit').summernote("""),format.raw/*372.65*/("""{"""),format.raw/*372.66*/("""focus: true"""),format.raw/*372.77*/("""}"""),format.raw/*372.78*/(""");
                                    """),format.raw/*373.37*/("""}"""),format.raw/*373.38*/(""";
                                    var save = function() """),format.raw/*374.59*/("""{"""),format.raw/*374.60*/("""
                                    """),format.raw/*375.37*/("""var aHTML = $('.click2edit').code(); //save HTML If you need(aHTML: array).
                                    $('.click2edit').destroy();
                                    """),format.raw/*377.37*/("""}"""),format.raw/*377.38*/(""";</code></pre>

                                <script>
                                var edit = function() """),format.raw/*380.55*/("""{"""),format.raw/*380.56*/("""
                                """),format.raw/*381.33*/("""$('.click2edit').summernote("""),format.raw/*381.61*/("""{"""),format.raw/*381.62*/("""
                                """),format.raw/*382.33*/("""focus : true
                                """),format.raw/*383.33*/("""}"""),format.raw/*383.34*/(""");
                                """),format.raw/*384.33*/("""}"""),format.raw/*384.34*/(""";
                                var save = function() """),format.raw/*385.55*/("""{"""),format.raw/*385.56*/("""
                                """),format.raw/*386.33*/("""$('.click2edit').destroy();
                                """),format.raw/*387.33*/("""}"""),format.raw/*387.34*/(""";
                                </script>

                                <h5>Documentation:</h5>
                                <p class="alert alert-info">
                                    Full API for Summernote.js, including keybored shortcuts, PHP Examples, Django installation, and Rails (gem) integration can be found <a href="http://hackerwins.github.io/summernote/features.html#api">here</a>
                                </p>
                            </div>
                                <!-- end widget content -->


                                <!-- end widget div -->
                        </div>

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
         * $("[rel=popover-hover]").popover("""),format.raw/*427.45*/("""{"""),format.raw/*427.46*/(""" """),format.raw/*427.47*/("""trigger: "hover" """),format.raw/*427.64*/("""}"""),format.raw/*427.65*/(""");
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

        var pagefunction = function() """),format.raw/*452.39*/("""{"""),format.raw/*452.40*/("""

        """),format.raw/*454.9*/("""// summernote
        $('.summernote').summernote("""),format.raw/*455.37*/("""{"""),format.raw/*455.38*/("""
        """),format.raw/*456.9*/("""height : 180,
        focus : false,
        tabsize : 2
        """),format.raw/*459.9*/("""}"""),format.raw/*459.10*/(""");

        // markdown
        $("#mymarkdown").markdown("""),format.raw/*462.35*/("""{"""),format.raw/*462.36*/("""
        """),format.raw/*463.9*/("""autofocus:false,
        savable:true
        """),format.raw/*465.9*/("""}"""),format.raw/*465.10*/(""")

        """),format.raw/*467.9*/("""}"""),format.raw/*467.10*/(""";

        // end pagefunction

        // load summernote, and all markdown related plugins
        loadScript("js/plugin/summernote/summernote.min.js", function()"""),format.raw/*472.72*/("""{"""),format.raw/*472.73*/("""
        """),format.raw/*473.9*/("""loadScript("js/plugin/markdown/markdown.min.js", function()"""),format.raw/*473.68*/("""{"""),format.raw/*473.69*/("""
        """),format.raw/*474.9*/("""loadScript("js/plugin/markdown/to-markdown.min.js", function()"""),format.raw/*474.71*/("""{"""),format.raw/*474.72*/("""
        """),format.raw/*475.9*/("""loadScript("js/plugin/markdown/bootstrap-markdown.min.js", pagefunction);
        """),format.raw/*476.9*/("""}"""),format.raw/*476.10*/(""");
        """),format.raw/*477.9*/("""}"""),format.raw/*477.10*/(""");
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""");

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
                  SOURCE: /home/sulta/Dropbox/git/uis/ui/app/views/demo/other_editors.scala.html
                  HASH: 0ff5c90fa74ac0228a72a8516dc423a5ac511936
                  MATRIX: 518->1|623->18|651->21|672->34|711->36|742->41|25605->24853|25637->24854|25708->24894|25740->24895|61698->60804|61728->60805|61758->60806|61818->60836|61849->60837|62508->61467|62538->61468|62604->61505|62661->61533|62691->61534|62731->61545|62761->61546|62829->61585|62859->61586|62948->61646|62978->61647|63044->61684|63249->61860|63279->61861|63419->61972|63449->61973|63511->62006|63568->62034|63598->62035|63660->62068|63734->62113|63764->62114|63828->62149|63858->62150|63943->62206|63973->62207|64035->62240|64124->62300|64154->62301|65492->63610|65522->63611|65552->63612|65598->63629|65628->63630|66255->64228|66285->64229|66323->64239|66402->64289|66432->64290|66469->64299|66562->64364|66592->64365|66679->64423|66709->64424|66746->64433|66820->64479|66850->64480|66889->64491|66919->64492|67112->64656|67142->64657|67179->64666|67267->64725|67297->64726|67334->64735|67425->64797|67455->64798|67492->64807|67602->64889|67632->64890|67671->64901|67701->64902|67740->64913|67770->64914
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|303->281|303->281|303->281|303->281|386->363|386->363|386->363|386->363|386->363|394->371|394->371|395->372|395->372|395->372|395->372|395->372|396->373|396->373|397->374|397->374|398->375|400->377|400->377|403->380|403->380|404->381|404->381|404->381|405->382|406->383|406->383|407->384|407->384|408->385|408->385|409->386|410->387|410->387|450->427|450->427|450->427|450->427|450->427|475->452|475->452|477->454|478->455|478->455|479->456|482->459|482->459|485->462|485->462|486->463|488->465|488->465|490->467|490->467|495->472|495->472|496->473|496->473|496->473|497->474|497->474|497->474|498->475|499->476|499->476|500->477|500->477|501->478|501->478
                  -- GENERATED --
              */
          