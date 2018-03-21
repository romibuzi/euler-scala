import MathHelper.square

object P009 {
  // sum = a + b + c
  // where a*a + b*b = c*c
  // and a < b < c
  def findPythagoreanTriplet(sum: Int): Option[Int] = {
    for {
      a <- 2 to sum
      b <- a + 1 to sum
      c = Math.sqrt(square(a) + square(b))
      if a + b + c == sum
    } return Some((a * b * c).toInt)

    None
  }
}
