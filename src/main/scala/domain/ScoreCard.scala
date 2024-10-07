package domain

class ScoreCard {
  private var scoreMap: Map[String, Int] = Map[String, Int]()

  def addScore(team: String, score: Int): Unit = {
    val currentScore = scoreMap.getOrElse(team, 0)
    scoreMap = scoreMap.updated(team, currentScore + score)
  }

  override def toString: String = {
    val sortedByValue = scoreMap.toSeq.sortBy(-_._2)
    sortedByValue.zipWithIndex.map { case ((key, value), index) => s"${index + 1}. $key, $value pts" }.mkString("\n")
  }
}