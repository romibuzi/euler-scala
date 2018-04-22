object P029 {
  def distinctPowers(n: Int): Int = {
    val values = (2 to n) flatMap { a =>
      (2 to n) map { b =>
        Math.pow(a, b)
      }
    }
    values.distinct.length
  }
}
