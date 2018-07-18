import MathHelper.{numberDigits, factorial}

object P020 {
  def factorialDigitSum(n: Int): Int =
    numberDigits(factorial(n)).sum
}
