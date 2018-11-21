object P047 {
  def distinctPrimeFactorsPerNumber: Array[Int] = {
    val primes = EratosthenesSieve(1000).map(_.toInt)
    val numbers = Array.fill(200000)(0)

    for {
      prime <- primes
      multiple <- prime * 2 until numbers.length by prime
    } {
      numbers(multiple) += 1
    }

    numbers
  }

  def consecutiveFourDistinctPrimeFactors: Option[Int] = {
    val numbers = distinctPrimeFactorsPerNumber

    (0 to (numbers.length - 4)).find { n =>
      numbers.slice(n, n + 4) sameElements Seq(4, 4, 4, 4)
    }
  }
}
