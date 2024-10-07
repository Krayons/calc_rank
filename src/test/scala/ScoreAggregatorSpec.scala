import domain.Score
import input.aggregator.ScoreAggregator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ScoreAggregatorSpec extends AnyFlatSpec with Matchers {

  "ScoreAggregator" should "correctly aggregate scores for a list of scores" in {
    val aggregator = new ScoreAggregator()
    val scores = List(
      Score("Lions", 3, "Snakes", 3),
      Score("Tigers", 1, "Bears", 0),
      Score("Lions", 2, "Bears", 1)
    )

    val scoreCard = aggregator.aggregateScores(scores)

    scoreCard.toString should include ("1. Lions, 4 pts")
    scoreCard.toString should include ("2. Tigers, 3 pts")
    scoreCard.toString should include ("3. Snakes, 1 pts")
    scoreCard.toString should include ("4. Bears, 0 pts")
  }

  it should "handle an empty list of scores" in {
    val aggregator = new ScoreAggregator()
    val scores = List()

    val scoreCard = aggregator.aggregateScores(scores)

    scoreCard.toString shouldEqual ""
  }
}