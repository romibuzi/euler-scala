import scala.annotation.tailrec
import scala.collection.mutable

object MathHelper {
  val DISTINCT_NUMBERS: List[Int] = (1 to 9).toList

  def factorial(n: BigInt): BigInt = {
    @tailrec
    def fact(acc: BigInt, x: BigInt): BigInt = {
      x match {
        case zero if x == 0 => acc
        case _ => fact(acc * x, x - 1)
      }
    }
    fact(1, n)
  }

  def isPalindrome(number: String): Boolean = number == number.reverse

  def isPandigital(number: String): Boolean = {
    val digits = numberDigits(number)
    digits.length == DISTINCT_NUMBERS.length && DISTINCT_NUMBERS.diff(digits).isEmpty
  }

  def isPrime(n: Int): Boolean = n match {
    case _ if n == 0 || n == 1 => false
    case _ if n == 2 => true
    case _ if n % 2 == 0 => false
    case _ =>
      val end = Math.sqrt(n).toInt
      for (i <- 3 to end by 2) {
        if (n % i == 0) return false
      }
      true
  }

  def numberDigits[T](number: T): List[Int] =
    number.toString.map(_.asDigit).toList

  // Array(0, end) where non-primes are `false` and primes are `true`
  def primesIndices(end: Int): Array[Boolean] = {
    val indices = mutable.ArrayBuffer.fill(end + 1)(true)
    indices(0) = false
    indices(1) = false

    val primesBelowSqrt = 2 +: (3 to Math.sqrt(end).toInt by 2).toList
    for {
      p <- primesBelowSqrt
      nonPrime <- p * 2 to end by p
    } {
      if (indices(nonPrime)) indices(nonPrime) = false
    }

    indices.toArray
  }

  def square[T](n: T)(implicit numeric: Numeric[T]): T = numeric.times(n, n)

  def sumOfProperDivisors(n: Int): Int = {
    val sqrt = Math.sqrt(n).toInt
    1 + (2 to sqrt).filter(n % _ == 0).flatMap(x => List(x, n / x)).toSet.sum
  }
}
