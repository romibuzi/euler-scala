object P010 {
  def sumOfPrimes(limit: Long): Long =
    EratosthenesSieve((2L until limit).toVector).sum
}
