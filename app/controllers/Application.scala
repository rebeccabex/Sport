package controllers

import play.api.mvc._

class Application extends Controller {
  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Welcome!"))
  }

  def indexRedirect = Action { implicit request: Request[AnyContent] =>
    Redirect(routes.Application.index())
  }
}
