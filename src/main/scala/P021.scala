object P021 {
  // Let d(n) be defined as the sum of proper divisors of n
  // (numbers less than n which divide evenly into n)
  private def d(number: Int): Int = {
    val sqrt = Math.sqrt(number).toInt
    val base = if (number % sqrt == 0) 1 + sqrt else 1

    base + (2 until sqrt).filter(number % _ == 0).map(x => x + (number / x)).sum
  }

  def amicableNumbersSumBelow10000: Int = {
    (1 until 10000).filter { a =>
      val b = d(a)
      d(b) == a && a != b
    }.sum
  }
}
