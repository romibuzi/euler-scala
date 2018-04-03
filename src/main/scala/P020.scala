import MathHelper.factorial

object P020 {
  def factorialDigitSum(n: Int): Int =
    factorial(n).toString.map(_.asDigit).sum
}
