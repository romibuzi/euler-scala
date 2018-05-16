object P032 {
  val DISTINCT_NUMBERS: Set[Int] = (1 to 9).toSet

  def isPandigital(product: Int, a: Int, b: Int): Boolean = {
    val numbers = Set(product, a, b).flatMap(_.toString.map(_.asDigit))
    numbers.size == DISTINCT_NUMBERS.size && DISTINCT_NUMBERS.diff(numbers).isEmpty
  }

  def sumOfPandigitalProducts: Int = {
    val products = for {
      a <- 2 until 100
      start = if (a < 10) 1000 else 100
      b <- start until 10000 / a
      product = a * b
      if isPandigital(product, a, b)
    } yield product

    products.distinct.sum
  }
}
