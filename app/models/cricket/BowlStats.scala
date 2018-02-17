package models.cricket

case class BowlStats(runs: Int, overs: Int, balls: Int, wickets: Int, wicketTypes: Map[String, Int]) {}

object BowlStats {
  val blankBowlStats = BowlStats(0, 0, 0, 0, Map("Bowled" -> 0, "Caught" -> 0, "LBW" -> 0, "Stumped" -> 0))
}

