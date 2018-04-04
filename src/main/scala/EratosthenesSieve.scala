import MathHelper.square

import scala.annotation.tailrec

/**
  * Find prime numbers in given list using Sieve of Eratosthenes algorithm in a recursive way
  * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
  */
object EratosthenesSieve {
  @tailrec
  private def sieve(numbers: List[Long], primes: List[Long]): List[Long] = {
    val first = numbers.head
    if (square(first) > numbers.last) return primes ::: numbers

    sieve(numbers.filter(x => x % first != 0), primes :+ first)
  }

  def apply(numbers: List[Long]): List[Long] = sieve(numbers, List.empty)
}
