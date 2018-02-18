package controllers

import play.api.mvc._
import models.cricket.CricketMatch.currentMatch
import models.cricket.CricketPlayer
import models.cricket.CricketTeam
import models.cricket.Innings.blankInnings
import models.cricket.BatStats.blankBatStats
import models.cricket.BowlStats.blankBowlStats
import models.cricket.FieldStats.blankFieldStats

class Cricket extends Controller {

  def setup = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.cricketMain(currentMatch))
  }

  def startMatch = Action { implicit request: Request[AnyContent] =>
    val matchFormData = request.body.asFormUrlEncoded

    for (i <- 1 to 2) {
      val players = new Array[CricketPlayer](11)
      for (j <- 1 to 11) {
        val playerName = matchFormData.get(s"team${i}Player${j}").head
        val player = CricketPlayer(j, 12-j, false, playerName, Array(blankBatStats), Array(blankBowlStats), Array(blankFieldStats))
        players(j-1) = player
      }
      val teamName = matchFormData.get(s"team${i}").head
      val teamRating = matchFormData.get(s"team${i}Rating").head.toInt
      val team = CricketTeam(teamName, teamRating, players, Array(blankInnings))
      currentMatch.teams(i-1) = team
    }

    if (matchFormData.get("matchFormat") == "Test") {
      currentMatch.noOfInnings = 2
      currentMatch.noOfDays = matchFormData.get("noOfDays").head.toInt
    }



    Ok(views.html.cricketScoreboard(currentMatch))
  }

}