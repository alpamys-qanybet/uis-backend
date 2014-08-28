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
import play.api.Play.current
import play.api.libs.ws._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global._

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
  //create an instance of the table
  val cats = TableQuery[CatsTable] //see a way to architect your app in the computers-database-slick sample

  //JSON read/write macro
  implicit val catFormat = Json.format[Cat]

  val catForm = Form(
    mapping(
      "name" -> text(),
      "color" -> text()
    )(Cat.apply)(Cat.unapply)
  )

  def insert = DBAction { implicit rs =>
    val cat = catForm.bindFromRequest.get
    cats.insert(cat)
    Ok("assets")
//    Redirect(routes.Application.index)
  }

}
