package models.cricket

case class Innings(var runs: Int, var wickets: Int, var extras: Int, var overs: Int, var balls: Int,
                   var onStrike: Int, var waiting: Int, var currBowler: Int, var changeBowler: Int, var wicketkeeper: Int,
                   var completed: Boolean) {}

object Innings {
  val blankInnings = Innings(0, 0, 0, 0, 0, 0, 1, 11, 10, 7, false)
}
