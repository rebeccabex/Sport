package models.cricket

case class CricketMatch(teams: Array[CricketTeam], noOfInnings: Int, oversPerInnings: Int, noOfDays: Int, oversPerDay: Int) {}

object CricketMatch {
  val blankMatch = CricketMatch(Array(), 0, 0, 0, 0)
}

