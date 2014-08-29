package controllers

import models._
import play.api.Play.current
import play.api.data.Forms._
import play.api.data._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.libs.json.Json
import play.api.mvc._
import com.typesafe.plugin._
import com.fasterxml.jackson._

object Demo extends Controller {

  def dashboard = Action {
    Ok(views.html.demo.dashboard("Home"))
  }
  def inbox = Action {
    Ok(views.html.demo.inbox("Home"))
  }
  def flot = Action {
    Ok(views.html.demo.flot("Home"))
  }
  def morris = Action {
    Ok(views.html.demo.morris("Home"))
  }
  def inline_charts = Action {
    Ok(views.html.demo.inline_charts("Home"))
  }
  def dygraphs = Action {
    Ok(views.html.demo.dygraphs("Home"))
  }
  def table = Action {
    Ok(views.html.demo.table("Home"))
  }
  def datatables = Action {
    Ok(views.html.demo.datatables("Home"))
  }
  def jqgrid = Action {
    Ok(views.html.demo.jqgrid("Home"))
  }
  def form_elements = Action {
    Ok(views.html.demo.form_elements("Home"))
  }
  def form_templates = Action {
    Ok(views.html.demo.form_templates("Home"))
  }
  def validation = Action {
    Ok(views.html.demo.validation("Home"))
  }
  def bootstrap_forms = Action {
    Ok(views.html.demo.bootstrap_forms("Home"))
  }
  def plugins = Action {
    Ok(views.html.demo.plugins("Home"))
  }
  def wizard = Action {
    Ok(views.html.demo.wizard("Home"))
  }
  def other_editors = Action {
    Ok(views.html.demo.other_editors("Home"))
  }
  def dropzone = Action {
    Ok(views.html.demo.dropzone("Home"))
  }
  def image_editor = Action {
    Ok(views.html.demo.image_editor("Home"))
  }
  def general_elements = Action {
    Ok(views.html.demo.general_elements("Home"))
  }
  def buttons = Action {
    Ok(views.html.demo.buttons("Home"))
  }
  def fa = Action {
    Ok(views.html.demo.fa("Home"))
  }
  def glyph = Action {
    Ok(views.html.demo.glyph("Home"))
  }
  def flags = Action {
    Ok(views.html.demo.flags("Home"))
  }
  def grid = Action {
    Ok(views.html.demo.grid("Home"))
  }
  def treeview = Action {
    Ok(views.html.demo.treeview("Home"))
  }
  def nestable_list = Action {
    Ok(views.html.demo.nestable_list("Home"))
  }
  def jqui = Action {
    Ok(views.html.demo.jqui("Home"))
  }
  def typography = Action {
    Ok(views.html.demo.typography("Home"))
  }
  def calendar = Action {
    Ok(views.html.demo.calendar("Home"))
  }
  def widgets = Action {
    Ok(views.html.demo.widgets("Home"))
  }
  def gallery = Action {
    Ok(views.html.demo.gallery("Home"))
  }
  def gmap_xml = Action {
    Ok(views.html.demo.gmap_xml("Home"))
  }
  def forum = Action {
    Ok(views.html.demo.forum("Home"))
  }
  def profile = Action {
    Ok(views.html.demo.profile("Home"))
  }
  def timeline = Action {
    Ok(views.html.demo.timeline("Home"))
  }
  def pricing_table = Action {
    Ok(views.html.demo.pricing_table("Home"))
  }
  def invoice = Action {
    Ok(views.html.demo.invoice("Home"))
  }
  def login = Action {
    Ok(views.html.demo.login())
  }
  def register = Action {
    Ok(views.html.demo.register())
  }
  def lock = Action {
    Ok(views.html.demo.lock())
  }
  def error500 = Action {
    Ok(views.html.demo.error500("Home"))
  }
  def error404 = Action {
    Ok(views.html.demo.error404("Home"))
  }
  def blank = Action {
    Ok(views.html.demo.blank("Home"))
  }
  def email_template = Action {
    Ok(views.html.demo.email_template("Home"))
  }
  def search = Action {
    Ok(views.html.demo.search("Home"))
  }
  def ckeditor = Action {
    Ok(views.html.demo.ckeditor("Home"))
  }
  def difver = Action {
    Ok(views.html.demo.difver("Home"))
  }
  def applayout = Action {
    Ok(views.html.demo.applayout("Home"))
  }
  def forgotpassword = Action {
    Ok(views.html.demo.forgotpassword())
  }
}
