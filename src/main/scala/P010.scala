object P010 {
  def sumOfPrimes(limit: Int): Long =
    EratosthenesSieve(limit).sum
}
