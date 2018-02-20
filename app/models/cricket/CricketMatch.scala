package models.cricket

case class CricketMatch(teams: Array[CricketTeam], var noOfInnings: Int, var oversPerInnings: Int,
                        var noOfDays: Int, var oversPerDay: Int, var battingTeam: Int, var whichInnings: Int) {}

object CricketMatch {
  val currentMatch = CricketMatch(Array(CricketTeam.blankTeam, CricketTeam.blankTeam), 1, 10, 1, 20, 0, 0)


}

