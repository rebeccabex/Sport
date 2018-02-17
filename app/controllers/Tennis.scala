package controllers

import play.api.mvc._

class Tennis extends Controller {

  def start = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.blankPage("Planned technical updates. Please come back later."))
  }

}