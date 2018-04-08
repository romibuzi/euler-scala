import scala.annotation.tailrec

object P025 {
  @tailrec
  def thousandDigitFibonaccinumber(idx: Int = 0, a: BigInt = 0, b: BigInt = 1): Int = {
    if (a >= BigInt(10).pow(999)) return idx

    thousandDigitFibonaccinumber(idx + 1, b, a + b)
  }
}
