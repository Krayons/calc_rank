package input.aggregator

import domain.{Score, ScoreCard}

class ScoreAggregator extends InputAggregator{
  /**
   * In this league, a draw (tie) is worth 1 point and a win is worth 3 points. A loss is worth 0 points.
   * If two or more teams have the same number of points, they should have the same rank and be
   * printed in alphabetical order (as in the tie for 3rd place in the sample data).
   */
  override def aggregateScores(scores: List[Score]): ScoreCard = {
    val scoreCard = new ScoreCard()
    scores.foreach(score => {
      if (score.isDraw) {
        scoreCard.addScore(score.teamOne, 1)
        scoreCard.addScore(score.teamTwo, 1)
      } else {
        scoreCard.addScore(score.winner, 3)
        scoreCard.addScore(score.loser, 0)
      }
    })
    scoreCard
  }
}
