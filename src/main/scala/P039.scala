import MathHelper.square

object P039 {
  def integerRightTriangles: Int = {
    val result = for {
      a <- 2 until 500
      b <- a + 1 until 500
      c = Math.sqrt(square(a) + square(b))

      if c.toInt == c && a + b + c <= 1000
    } yield a + b + c.toInt

    result
      .groupBy(identity)
      .maxBy(_._2.length)
      ._1
  }
}
