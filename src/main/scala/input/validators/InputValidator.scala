package input.validators

import domain.Score

trait InputValidator {
  def validateInput(line: String): Score
}





