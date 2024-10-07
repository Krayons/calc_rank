package domain

class Score(val teamOne: String, val scoreOne: Int, val teamTwo: String, val scoreTwo: Int) {
  def isDraw: Boolean = scoreOne == scoreTwo

  def winner: String = {
    if (scoreOne > scoreTwo) teamOne
    else teamTwo
  }
  
  def loser: String = {
    if (scoreOne < scoreTwo) teamOne
    else teamTwo
  }
}