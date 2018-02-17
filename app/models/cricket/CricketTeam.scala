package models.cricket

case class CricketTeam(name: String, rating: Int, players: Array[CricketPlayer], innings: Array[Innings]) {}

object CricketTeam {
  val blankTeam = CricketTeam("Team", 0, Array(), Array())
}
