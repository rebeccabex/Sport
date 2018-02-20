package models.cricket

case class FieldStats(var catches: Int, var stumpings: Int, var runOuts: Int) {}

object FieldStats{
  val blankFieldStats = FieldStats(0, 0, 0)
}
