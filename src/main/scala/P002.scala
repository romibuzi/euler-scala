import scala.annotation.tailrec

object P002 {
  private def isEven: Int => Boolean = _ % 2 == 0

  @tailrec
  def evenFibonacci(evenSum: Int, a: Int, b: Int): Long = {
    b match {
      case `b` if b <= 4000000 =>
        val sum = if (isEven(b)) evenSum + b else evenSum
        evenFibonacci(sum, b, a + b)
      case _ => evenSum
    }
  }
}
