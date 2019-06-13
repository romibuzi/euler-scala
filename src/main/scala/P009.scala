import MathHelper.square

case class Triplet(a: Int, b: Int, c: Double) {
  def sum: Double = a + b + c
  def product: Double = a * b * c
}

object P009 {
  // sum = a + b + c
  // where a*a + b*b = c*c
  // and a < b < c
  def findPythagoreanTriplet(sum: Int): Option[Double] = {
    (2 to sum).view.flatMap { a =>
      (a + 1 to sum).map { b =>
        val c = Math.sqrt(square(a) + square(b))
        Triplet(a, b, c)
      }
    }.find(_.sum == sum.toDouble).map(_.product)
  }
}
