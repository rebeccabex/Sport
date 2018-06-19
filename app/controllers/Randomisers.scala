package controllers

import play.api.mvc._

class Randomisers extends Controller {

  def setup = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.randomisersMain("Dice and Cards"))
  }

}

