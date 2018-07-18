object P030 {
  def isSumOfItsFifthPowersDigits(n: Int): Boolean =
    MathHelper.numberDigits(n).map(digit => Math.pow(digit, 5).toInt).sum == n

  def digitFifthPowers: Int = {
    val upper = 5 * Math.pow(9, 5).toInt
    (2 to upper).filter(isSumOfItsFifthPowersDigits).sum
  }
}
