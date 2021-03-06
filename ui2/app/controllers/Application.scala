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
import scala.concurrent.ExecutionContext.Implicits.global._
import play.api.Play.current
import play.api.libs.ws._
import scala.concurrent.Future


object Application extends Controller {

  def index = Action {

//    val mail = use[MailerPlugin].email
//      .setSubject("essc.kz")
//      .setRecipient("Sultan Zhiyenbay essc.kz <zh.sulta@gmail.com>")
//      .setFrom("Sultan Zhiyenbay <myyk@egraphs.com>")
//
//    mail.send("Sultan Zhiyenbay", "<html>I like you.</html>")
    val url = "http://api.geonames.org/postalCodeLookupJSON?postalcode=6600&country=AT&username=demo"
//    val holder: WSRequestHolder = WS.url(url)
//    val futureResponse: Future[WSResponse] = holder.get()
//    println(futureResponse)

//    WS.url(url).get().map { response =>
//      Ok(response.body)
//    }

    Ok(views.html.index("Home"))
  }
  def dashboard = Action {
    Ok(views.html.demo.dashboard("Home"))
  }

}
