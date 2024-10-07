package input.handlers

trait InputHandler {
  /**
   * Handles input from the given source.
   *
   * @param source the input source
   * @return an iterator over the lines of the input
   */
  def handleInput(source: String): Iterator[String]
}
