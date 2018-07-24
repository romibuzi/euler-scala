object P008 {
  private def readSeries: List[Long] =
    Reader.getLines("p008_series.txt")
      .mkString
      .map(_.asDigit.toLong)
      .toList

  def largestProductInSeries(length: Int): Long =
    readSeries.sliding(length).map(_.product).max
}
