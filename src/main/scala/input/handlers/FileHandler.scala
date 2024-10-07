package input.handlers

import scala.io.Source

class FileHandler extends InputHandler {
  def handleInput(filepath: String): Iterator[String] = {
    try {
      val source = Source.fromFile(filepath)
      source.getLines()
    } catch {
      case e: Exception =>
        println(s"An error occurred while reading the file at ${filepath}: ${e.getMessage}")
        throw e
    }
  }
}
