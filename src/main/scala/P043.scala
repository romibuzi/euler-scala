object P043 {
  val firstPrimes = List(2, 3, 5, 7, 11, 13, 17)

  def addMissingZero(number: String): String =
    if (number.toInt < 100) s"0$number" else number

  def addMissingDistinctNumber(number: String): String = {
    "0123456789"
      .find(digit => !(number contains digit))
      .map(digit => s"$digit$number")
      .getOrElse(number)
  }

  def isDistinctNumber(number: String): Boolean =
    number == number.toSeq.distinct.unwrap

  def multiplesBelow1000(number: Int): List[String] =
    LazyList
      .from(1)
      .map(i => (i * number).toString)
      .map(addMissingZero)
      .filter(isDistinctNumber)
      .takeWhile(_.toInt < 1000)
      .toList

  def matchDistinctMultiplesPairs(firstMultiples: Seq[String],
                                  nextMultiples: Seq[String])
  : Seq[String] = {
    for {
      a <- firstMultiples
      b <- nextMultiples
      if a.take(2) == b.takeRight(2)
      pair = b.take(1) + a
      if isDistinctNumber(pair)
    } yield pair
  }

  // Algorithm taken from http://radiusofcircle.blogspot.com
  def sumOfPandigitalWithSubStringDivisibility: Long = {
    val multiplesPerPrime: Seq[List[String]] =
      firstPrimes.reverse.map(multiplesBelow1000)

    multiplesPerPrime
      .reduce(matchDistinctMultiplesPairs)
      .map(addMissingDistinctNumber)
      .map(_.toLong)
      .sum
  }
}
