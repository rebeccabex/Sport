package models.cricket

case class FieldStats(catches: Int, stumpings: Int, runOuts: Int) {}

object FieldStats{
  val blankFieldStats = FieldStats(0, 0, 0)
}
