package models.cricket

case class BowlStats(var runs: Int, var overs: Int, var balls: Int, var wickets: Int, wicketTypes: Map[String, Int]) {}

object BowlStats {
  val blankBowlStats = BowlStats(0, 0, 0, 0, Map("Bowled" -> 0, "Caught" -> 0, "LBW" -> 0, "Stumped" -> 0))
}

