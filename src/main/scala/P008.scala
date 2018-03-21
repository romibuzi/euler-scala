import scala.io.Source

object P008 {
  private def readSeries: List[Long] =
    Source
      .fromResource("p008_series.txt")
      .getLines()
      .mkString("")
      .map(_.asDigit.toLong)
      .toList

  def largestProductInSeries(length: Int): Long =
    readSeries.sliding(length).map(_.product).max
}
