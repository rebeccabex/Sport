package models.cricket

case class Innings(var runs: Int, var wickets: Int, var extras: Int, var overs: Int, var balls: Int,
                   var completed: Boolean) {}

object Innings {
  val blankInnings = Innings(0, 0, 0, 0, 0, false)
}
