object P007 {
  def nthPrimeNumber(n: Int): Long = {
    n match {
      case _ if n < 2  => 2
      case _ if n == 2 => 3
      case _ if n == 3 => 5
      case _ if n == 4 => 7
      case _ if n == 5 => 11
      case _           =>
        // Quoting Daniel Fischer on https://stackoverflow.com/a/9704912/1995266
        // Prime Number Theorem says π(x) ~= x /log x
        // where π(x) is the number of primes not exceeding x

        // we can define that p(n) ~= n * log n
        // where p(n) is the nth prime
        // This will be the upper bound of the Sieve
        val limit = (n * (Math.log(n) + Math.log(Math.log(n)))).toInt

        // List is indexed from 0, so nth prime is (n - 1) of the list
        EratosthenesSieve(limit)(n - 1)
    }
  }
}
