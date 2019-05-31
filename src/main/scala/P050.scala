object P050 {
  def takePrimesNotExceedingLimitWithTheirSum(primes: Vector[Long], limit: Int): Vector[Long] = {
    primes.takeWhile(prime => primes.takeWhile(_ <= prime).sum <= limit)
  }

  def findLongestPrimesSumBeingPrime(limit: Int): Option[Long] = {
    val primes = EratosthenesSieve(limit)
    val searchablePrimes = takePrimesNotExceedingLimitWithTheirSum(primes, limit)

    for (consecutiveLength <- searchablePrimes.length to 1 by -1) {
      val primesSumsBeingPrime: Iterator[Long] = searchablePrimes
        .sliding(consecutiveLength)
        .map(_.sum)
        .filter(primesSum => primes.contains(primesSum))

      if (primesSumsBeingPrime.hasNext) {
        return Some(primesSumsBeingPrime.max)
      }
    }

    None
  }
}
