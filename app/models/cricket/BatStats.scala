package models.cricket

case class BatStats(runs: Int, balls: Int, batted: Boolean, howOut: String, fours: Int, sixes: Int) {}

object BatStats {
  val blankBatStats = BatStats(0, 0, false, "Not Out", 0, 0)
}

