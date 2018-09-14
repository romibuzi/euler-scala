object P010 {
  def sumOfPrimes(limit: Long): Long =
    EratosthenesSieve(limit).sum
}
