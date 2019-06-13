object P050 {
  def takePrimesNotExceedingLimitWithTheirSum(primes: Vector[Long], limit: Int): Vector[Long] = {
    primes.takeWhile(prime => primes.takeWhile(_ <= prime).sum <= limit)
  }

  def findLongestPrimesSumBeingPrime(limit: Int): Option[Long] = {
    val primes = EratosthenesSieve(limit)
    val searchablePrimes = takePrimesNotExceedingLimitWithTheirSum(primes, limit)

    (searchablePrimes.length to 1 by -1).view.map { length =>
      searchablePrimes
        .sliding(length)
        .map(_.sum)
        .filter(primesSum => primes.contains(primesSum))
    }.find(_.hasNext).map(_.max)
  }
}
