import MathHelper.sumOfProperDivisors

object P021 {
  // just a wrapper method to be close to problem terms
  private def d(n: Int): Int = sumOfProperDivisors(n)

  def amicableNumbersSumBelow10000: Int = {
    (1 until 10000).filter { a =>
      val b = d(a)
      d(b) == a && a != b
    }.sum
  }
}
