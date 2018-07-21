import scala.annotation.tailrec

object P027 {
  val primes: Array[Boolean] = MathHelper.primesIndices(20000)

  @tailrec
  def lengthQuadratic(a: Int, b: Int, n: Int): Int = {
    if (!primes(Math.abs(n * n + a * n + b))) return n
    lengthQuadratic(a, b, n + 1)
  }

  def quadraticPrimes: Int = {
    val quadraticLengths = for {
      a <- -999 to 1000 by 2
      b <- EratosthenesSieve((2L to 1000).toVector).map(_.toInt)
      q = lengthQuadratic(a, b, 0)
    } yield (a * b, q)

    quadraticLengths.maxBy(_._2)._1
  }
}
