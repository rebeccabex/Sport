package controllers

import play.api.mvc._

class Cricket extends Controller {

  def start = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.cricketMain("Setup page"))
  }



}