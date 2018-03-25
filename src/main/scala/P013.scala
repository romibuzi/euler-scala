import scala.io.Source

object P013 {
  private def readNumbers: List[BigInt] =
    Source
      .fromResource("p013_numbers.txt")
      .getLines()
      .map(BigInt(_))
      .toList

  def firstTenDigitsOfNumbersSum(): String =
    readNumbers.sum.toString().take(10)
}
