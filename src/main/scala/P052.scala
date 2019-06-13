object P052 {
  def hasPermutedMultiples(number: Int): Boolean = {
    val numberDigits = MathHelper.numberDigits(number).toSet

    (2 to 6).forall { x =>
      val multipleDigits = MathHelper.numberDigits(number * x).toSet
      multipleDigits == numberDigits
    }
  }

  def firstNumberWithPermutedMultiples: Option[Int] = {
    LazyList.from(1).find(hasPermutedMultiples)
  }
}
