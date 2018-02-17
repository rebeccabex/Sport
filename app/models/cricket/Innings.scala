package models.cricket

case class Innings(runs: Int, wickets: Int, extras: Int, overs: Int, balls: Int, completed: Boolean) {}

object Innings {
  val blankInnings = Innings(0, 0, 0, 0, 0, false)
}
