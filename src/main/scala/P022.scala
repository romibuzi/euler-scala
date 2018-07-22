import scala.io.Source

object P022 {
  val DOUBLE_QUOTE = '"'

  private def readNames: List[String] =
    Source
      .fromResource("p022_names.txt")
      .getLines()
      .mkString
      .split(",")
      .toList
      .sorted

  // 'a'.toInt = 97
  // 'z'.toInt = 122
  private def alphabeticalPosition: Char => Int = _.toLower.toInt - 96

  private def nameScore: String => Int =
    _.filter(_ != DOUBLE_QUOTE).map(alphabeticalPosition).sum

  def sumOfNameScores: Int =
    readNames
      .map(nameScore)
      .zipWithIndex
      .map { case (score, idx) => score * (idx + 1) }
      .sum
}
