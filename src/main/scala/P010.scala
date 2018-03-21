object P010 {
  def sumOfPrimes(limit: Int): Long = {
    EratosthenesSieve.sieve((2L until limit).toList).sum
  }
}
