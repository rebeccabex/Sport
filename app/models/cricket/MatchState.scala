package models.cricket

case class MatchState(var battingTeam: CricketTeam, var bowlingTeam: CricketTeam, var batterOnStrike: CricketPlayer,
                      var batterWaiting: CricketPlayer, var bowlerBowling: CricketPlayer, var bowlerChange: CricketPlayer,
                      var inningsRuns: Int, var inningsWickets: Int, var inningsOvers: Int, var inningsBalls: Int,
                      var onStrikeRuns: Int, var waitingRuns: Int)

object MatchState {
}
