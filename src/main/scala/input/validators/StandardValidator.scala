package input.validators

import domain.Score

import scala.util.matching.Regex

class StandardValidator extends InputValidator {
  override def validateInput(line: String): Score = {
    val pattern: Regex = """^(\w+(?:\s+\w+)*)\s+(\d+),\s+(\w+(?:\s+\w+)*)\s+(\d+)$""".r
    line match {
      case pattern(teamOne, scoreOne, teamTwo, scoreTwo) =>
        new Score(teamOne, scoreOne.toInt, teamTwo, scoreTwo.toInt)
      case _ =>
        throw new IllegalArgumentException(s"Invalid input: $line")
    }
  }
}
