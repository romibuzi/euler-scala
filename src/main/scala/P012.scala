import scala.annotation.tailrec

object P012 {
  private def countDivisors(number: Int): Int = {
    val sqrt = Math.sqrt(number).toInt
    val perfectSquare = if (number % sqrt == 0) 1 else 0

    // multiply by 2 as counting until sqrt(number)
    2 * (1 until sqrt).count(number % _ == 0) + perfectSquare
  }

  @tailrec
  def highlyDivisibleTriangular(triangle: Int = 1, i: Int = 2): Int = {
    if (countDivisors(triangle) >= 500) return triangle

    // (triangle + i) is the next triangle
    highlyDivisibleTriangular(triangle + i, i + 1)
  }
}
