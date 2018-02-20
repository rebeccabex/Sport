package models.cricket

case class BatStats(var runs: Int, var balls: Int, var batted: Boolean, var howOut: String,
                    var fours: Int, var sixes: Int) {}

object BatStats {
  val blankBatStats = BatStats(0, 0, false, "Not Out", 0, 0)
}

