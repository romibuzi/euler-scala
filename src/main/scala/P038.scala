object P038 {
  def largestPandigitalMultiple: Option[Int] = {
    for (n <- 9678 to 9123 by -1) {
      val result = List(n, n * 2).mkString
      if (MathHelper.is1to9Pandigital(result)) {
        return Some(result.toInt)
      }
    }

    None
  }
}
