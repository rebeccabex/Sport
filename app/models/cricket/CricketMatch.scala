package models.cricket

case class CricketMatch(teams: Array[CricketTeam], var noOfInnings: Int, var oversPerInnings: Int,
                        var noOfDays: Int, var oversPerDay: Int,
                        var battingTeam: Int, var bowlingTeam: Int, var whichInnings: Int) {}

object CricketMatch {
  val currentMatch = CricketMatch(Array(CricketTeam.blankTeam, CricketTeam.blankTeam), 1, 10, 1, 20, 0, 1, 0)

//  def getBattingTeam = currentMatch.teams(currentMatch.battingTeam)
//  def getBowlingTeam = currentMatch.teams(-(currentMatch.battingTeam - 1))



}

