package controllers

import play.api.mvc._
import models.cricket.CricketMatch.currentMatch
import models.cricket.CricketPlayer
import models.cricket.CricketTeam
import models.cricket.Innings
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
      val teamName = matchFormData.get(s"team${i}").head
      val teamRating = matchFormData.get(s"team${i}Rating").head.toInt
      val wicketkeeper = matchFormData.get(s"team${i}Wicketkeeper").head.toInt
      val currBowler = matchFormData.get(s"team${i}Bowler1").head.toInt
      val changeBowler = matchFormData.get(s"team${i}Bowler2").head.toInt

      val players = new Array[CricketPlayer](11)
      for (j <- 1 to 11) {
        val playerName = matchFormData.get(s"team${i}Player${j}").head
        val isWicketkeeper = (wicketkeeper == j)
        val player = CricketPlayer(j, isWicketkeeper, playerName, Array(blankBatStats), Array(blankBowlStats), Array(blankFieldStats))
        players(j-1) = player
      }

      val innings = Innings(0, 0, 0, 0, 0, 0, 1, currBowler, changeBowler, wicketkeeper, false)

      val team = CricketTeam(teamName, teamRating, players, Array(innings, blankInnings), 0, 1, currBowler, changeBowler, wicketkeeper)
      currentMatch.teams(i-1) = team
    }

    if (matchFormData.get("matchFormat") == "Test") {
      currentMatch.noOfInnings = 2
      currentMatch.noOfDays = matchFormData.get("noOfDays").head.toInt
      currentMatch.oversPerDay = matchFormData.get("oversPerDay").head.toInt
    } else {
      currentMatch.noOfInnings = 1
      currentMatch.oversPerInnings = matchFormData.get("oversPerInnings").head.toInt
    }



    Ok(views.html.cricketScoreboard(currentMatch))
  }

}