object P052 {
  def hasPermutedMultiples(number: Int): Boolean = {
    val numberDigits = MathHelper.numberDigits(number).toSet

    for (x <- 2 to 6) {
      val multipleDigits = MathHelper.numberDigits(number * x).toSet
      if (multipleDigits != numberDigits) {
        return false
      }
    }

    true
  }

  def firstNumberWithPermutedMultiples: Option[Int] = {
    Stream.from(1).find(hasPermutedMultiples)
  }
}
