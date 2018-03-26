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

  def square[T](n: T)(implicit numeric: Numeric[T]): T =
    numeric.times(n, n)
}
