import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import input.validators.StandardValidator

class StandardValidatorSpec extends AnyFlatSpec with Matchers {

  "StandardValidator" should "correctly parse a valid input line" in {
    val validator = new StandardValidator()
    val line = "Lions 3, Snakes 3"
    val score = validator.validateInput(line)

    score.teamOne shouldEqual "Lions"
    score.scoreOne shouldEqual 3
    score.teamTwo shouldEqual "Snakes"
    score.scoreTwo shouldEqual 3
  }

  it should "throw an exception for an invalid input line" in {
    val validator = new StandardValidator()
    val line = "Invalid input line"

    an [IllegalArgumentException] should be thrownBy {
      validator.validateInput(line)
    }
  }
}