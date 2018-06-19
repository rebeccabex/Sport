package controllers

import play.api.mvc._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

class Randomisers extends Controller {

  def setup = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.randomisersMain(List()))
  }

  def roll = Action { implicit request: Request[AnyContent] =>

    val diceSides = request.body.asFormUrlEncoded.get("diceSides").head.toInt
    val noOfDice = request.body.asFormUrlEncoded.get("noOfDice").head.toInt

    var rolls = ArrayBuffer[Int]()

    for (i <- 1 to noOfDice) {
      rolls += rollDie(diceSides)
    }

    Ok(views.html.randomisersMain(rolls.toList))
  }

  def rollDie(noOfSides: Int) = {
    val rand = new scala.util.Random
    rand.nextInt(noOfSides) + 1
  }
}

