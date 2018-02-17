package models.cricket

case class CricketPlayer(batNo: Int, bowlNo: Int, wicketKeeper: Boolean, name: String, batStats: Array[BatStats],
                         bowlStats: Array[BowlStats], fieldStats: Array[FieldStats]) {}

object CricketPlayer {
  val nullPlayer = CricketPlayer(0, 0, false, "Player", Array(), Array(), Array())
}


