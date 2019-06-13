import scala.annotation.tailrec

object MathHelper {
  val ONE_TO_NINE: List[Int] = (1 to 9).toList

  def factorial(n: BigInt): BigInt = {
    @tailrec
    def fact(acc: BigInt, x: BigInt): BigInt = {
      x match {
        case _ if x == 0 => acc
        case _ => fact(acc * x, x - 1)
      }
    }
    fact(1, n)
  }

  def isPalindrome(number: String): Boolean = number == number.reverse

  def is1to9Pandigital(number: String): Boolean = {
    val digits = numberDigits(number)
    digits.length == ONE_TO_NINE.length && ONE_TO_NINE.diff(digits).isEmpty
  }

  // https://en.wikipedia.org/wiki/Pentagonal_number#Tests_for_pentagonal_numbers
  def isPentagonal(number: Long): Boolean =
    ((Math.sqrt(1 + number * 24) + 1.0) / 6.0).isWhole

  def isPrime[T: Integral](number: T)(implicit numeric: Integral[T]): Boolean = {
    import numeric._
    number match {
      case _ if number == 0 || number == 1 => false
      case _ if number == 2 => true
      case _ if number % numeric.fromInt(2) == 0 => false
      case _ =>
        val end = Math.sqrt(numeric.toDouble(number)).toInt
        (3 to end by 2).forall(number % numeric.fromInt(_) != 0)
    }
  }

  def numberDigits[T](number: T): List[Int] =
    number.toString.map(_.asDigit).toList

  // Array(0, end) where non-primes are `false` and primes are `true`
  def primesIndices(end: Int): Array[Boolean] = {
    val indices = Array.fill(end + 1)(true)
    indices(0) = false
    indices(1) = false

    val primesBelowSqrt = 2 +: (3 to Math.sqrt(end).toInt by 2).toList
    for {
      p <- primesBelowSqrt
      nonPrime <- p * 2 to end by p
    } {
      if (indices(nonPrime)) indices(nonPrime) = false
    }

    indices
  }

  def square[T: Integral](n: T)(implicit numeric: Integral[T]): T = numeric.times(n, n)

  def sumOfProperDivisors(n: Int): Int = {
    val sqrt = Math.sqrt(n).toInt
    1 + (2 to sqrt).filter(n % _ == 0).flatMap(x => List(x, n / x)).toSet.sum
  }
}
