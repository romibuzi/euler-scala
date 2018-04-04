object P010 {
  def sumOfPrimes(limit: Int): Long =
    EratosthenesSieve((2L until limit).toList).sum
}
