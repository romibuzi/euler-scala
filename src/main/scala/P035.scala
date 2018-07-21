import scala.annotation.tailrec

object P035 {
  val MILLION = 1000000
  val primes: Array[Boolean] = MathHelper.primesIndices(MILLION)

  def rotateRight(seq: Seq[Int]): Seq[Int] =
    seq.takeRight(1) ++ seq.dropRight(1)

  @tailrec
  def isCircularPrime(digits: Seq[Int], idx: Int = 0): Boolean = {
    if (idx == digits.length) return true
    if (!primes(digits.mkString.toInt)) return false

    isCircularPrime(rotateRight(digits), idx + 1)
  }

  def countCircularPrimesBelow1Million: Int = {
    (2 until MILLION)
      .map(MathHelper.numberDigits)
      .count(isCircularPrime(_))
  }
}
