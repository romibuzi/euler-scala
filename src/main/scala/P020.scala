object P020 {
  def factorialDigitSum(n: Int): Int =
    MathHelper.factorial(n).toString.map(_.asDigit).sum
}
