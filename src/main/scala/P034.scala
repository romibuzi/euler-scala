object P034 {
  val factorials: IndexedSeq[Int] = (0 to 9).map(MathHelper.factorial(_).toInt)

  def isSumOfItsDigitsFactorials(n: Int): Boolean =
    MathHelper.numberDigits(n).map(digit => factorials(digit)).sum == n

  def digitFactorials: Int = {
    val upper = factorials(9) * 7
    (3 to upper).filter(isSumOfItsDigitsFactorials).sum
  }
}
