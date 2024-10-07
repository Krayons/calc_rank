import input.aggregator.ScoreAggregator
import input.handlers.FileHandler
import input.validators.StandardValidator


val usage = """
  Usage: scala main.scala <input_file>
"""

@main
def main(filepath: String): Unit = {
  if (filepath.isEmpty) {
    println(usage)
    return
  }

  /**
   * If this was in Spring / Java I would inject the correct implementation at runtime
   */
  val fileHandler = new FileHandler()
  val validator = new StandardValidator()
  val scoreAggregator = new ScoreAggregator()

  val lines = fileHandler.handleInput(filepath)
  val scores = lines.map(validator.validateInput)
  val scoreCard = scoreAggregator.aggregateScores(scores.toList)

  println(scoreCard)

}