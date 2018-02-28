package models.cricket

case class CricketTeam(name: String, rating: Int, players: Array[CricketPlayer], innings: Array[Innings],
                       var onStrike: Int, var waiting: Int, var currBowler: Int, var changeBowler: Int, var wicketkeeper: Int) {}

object CricketTeam {
  val blankTeam = CricketTeam("Team", 0, Array(), Array(), 0, 1, 11, 10, 7)

//  def getBatterOnStrike = players(innings.onStrike)
//  def getBatterWaiting = players(innings.Waiting)
//
//  def getBowlerBowling = players(innings.currBowler)
//  def getBowlerWaiting = players(innings.changeBowler)
//
//  def getWicketkeeper = players(innings.wicketkeeper)
}
