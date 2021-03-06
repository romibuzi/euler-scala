object P041 {
  def maxPandigitalPrime: Option[Int] = {
    // From https://blog.dreamshire.com :
    // Only pandigital numbers of length 4 and 7 can form a prime number
    // The others cannot because any combination of their digits will sum to a number divisible by 3
    val limit = 7654321
    val primes = MathHelper.primesIndices(limit)

    MathHelper.numberDigits(limit)
      .permutations
      .map(_.mkString.toInt)
      .find(primes(_))
  }
}
