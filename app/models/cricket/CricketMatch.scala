package models.cricket

case class CricketMatch(teams: Array[CricketTeam], noOfInnings: Int, oversPerInnings: Int, noOfDays: Int, oversPerDay: Int) {}

object CricketMatch {
  val currentMatch = CricketMatch(Array(CricketTeam.blankTeam, CricketTeam.blankTeam), 0, 0, 0, 0)


}

