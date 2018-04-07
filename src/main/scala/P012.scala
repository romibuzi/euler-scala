import MathHelper.square

import scala.annotation.tailrec

object P012 {
  private def countDivisors(number: Int): Int = {
    val sqrt = Math.sqrt(number).toInt
    val perfectSquare = number % sqrt match {
      case 0 => if (square(sqrt) == number) 1 else 2
      case _ => 0
    }
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
