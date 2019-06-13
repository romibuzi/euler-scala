object P038 {
  def largestPandigitalMultiple: Option[Int] = {
    (9678 to 9123 by -1).view
      .map(n => List(n, n * 2).mkString)
      .find(MathHelper.is1to9Pandigital)
      .map(_.toInt)
  }
}
