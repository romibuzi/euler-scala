import MathHelper.square

import scala.annotation.tailrec

/**
  * Find prime numbers in given list using Sieve of Eratosthenes algorithm in a recursive way
  * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
  */
object EratosthenesSieve {
  @tailrec
  private def sieve(numbers: Vector[Long], primes: Vector[Long]): Vector[Long] = {
    val first = numbers.head
    if (square(first) > numbers.last) return primes ++ numbers

    sieve(numbers.filter(x => x % first != 0), primes :+ first)
  }

  def apply(limit: Int): Vector[Long] =
    sieve((2L until limit.toLong).toVector, Vector.empty)
}
