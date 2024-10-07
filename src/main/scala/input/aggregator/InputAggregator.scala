package input.aggregator

import domain.{Score, ScoreCard}

trait InputAggregator {
  def aggregateScores(scores: List[Score]): ScoreCard
  
}
