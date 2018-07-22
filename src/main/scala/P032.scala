import MathHelper.is1to9Pandigital

object P032 {
  def sumOfPandigitalProducts: Int = {
    val products = for {
      a <- 2 until 100
      start = if (a < 10) 1000 else 100
      b <- start until 10000 / a
      product = a * b
      if is1to9Pandigital(List(product, a, b).mkString)
    } yield product

    products.distinct.sum
  }
}
