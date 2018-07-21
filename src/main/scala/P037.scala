import MathHelper.primesIndices

import scala.annotation.tailrec

sealed trait Direction
case object RightToLeft extends Direction
case object LeftToRight extends Direction

object P037 {
  val MILLION = 1000000
  val primes: Array[Boolean] = primesIndices(MILLION)

  @tailrec
  def isTruncatablePrime(number: Int, direction: Direction): Boolean = {
    if (!primes(number)) return false
    if (number.toString.length == 1) return true

    val truncated = direction match {
      case LeftToRight => number.toString.drop(1).toInt
      case RightToLeft => number.toString.dropRight(1).toInt
    }

    isTruncatablePrime(truncated, direction)
  }

  def elevenTruncatablePrimesSum: Int = {
    Stream.from(11)
      .filter(isTruncatablePrime(_, LeftToRight))
      .filter(isTruncatablePrime(_, RightToLeft))
      .take(11)
      .sum
  }
}
