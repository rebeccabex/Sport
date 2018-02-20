package models.cricket

case class CricketTeam(name: String, rating: Int, players: Array[CricketPlayer], innings: Array[Innings],
                       var onStrike: Int, var waiting: Int, var currBowler: Int, var changeBowler: Int) {}

object CricketTeam {
  val blankTeam = CricketTeam("Team", 0, Array(), Array(), 0, 1, 11, 10)
}
