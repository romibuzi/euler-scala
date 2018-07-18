import scala.annotation.tailrec

object MathHelper {
  def factorial(n: BigInt): BigInt = {
    @tailrec
    def fact(acc: BigInt, x: BigInt): BigInt = {
      x match {
        case zero if x == 0 => acc
        case _ => fact(acc * x, x - 1)
      }
    }
    fact(1, n)
  }

  def numberDigits[T](number: T): List[Int] =
    number.toString.map(_.asDigit).toList

  def square[T](n: T)(implicit numeric: Numeric[T]): T =
    numeric.times(n, n)

  def sumOfProperDivisors(n: Int): Int = {
    val sqrt = Math.sqrt(n).toInt
    1 + (2 to sqrt).filter(n % _ == 0).flatMap(x => List(x, n / x)).toSet.sum
  }
}
