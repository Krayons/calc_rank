import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import input.handlers.FileHandler

class FileHandlerSpec extends AnyFlatSpec with Matchers {

  "FileHandler" should "correctly read lines from a valid file" in {
    val fileHandler = new FileHandler()
    val filepath = "src/test/resources/correct_input.txt"
    val lines = fileHandler.handleInput(filepath).toList

    lines should contain inOrderOnly (
      "Lions 3, Snakes 3",
      "Tarantulas 1, FC Awesome 0",
      "Lions 1, FC Awesome 1",
      "Tarantulas 3, Snakes 1",
      "Lions 4, Grouches 0"
    )
  }

  it should "throw an exception for a non-existent file" in {
    val fileHandler = new FileHandler()
    val filepath = "non_existent_file.txt"

    an [Exception] should be thrownBy {
      fileHandler.handleInput(filepath).toList
    }
  }
}