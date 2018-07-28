object P043 {
  val firstPrimes = List(2, 3, 5, 7, 11, 13, 17)

  def addMissingZero(n: String): String =
    if (n.toInt < 100) s"0$n" else n

  def addMissingDistinctNumber(n: String): String = {
    for (digit <- "0123456789") {
      if (!(n contains digit)) return digit + n
    }

    n
  }

  def isDistinctNumber(n: String): Boolean =
    n == n.distinct

  def multiplesBelow1000(number: Int): List[String] =
    Stream
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
