import scala.annotation.tailrec

object P027 {
  def isPrime(n: Int): Boolean = n match {
    case _ if n == 0 || n == 1 => false
    case _ if n % 2 == 0 => false
    case _ if n == 2 => true
    case _ =>
      val end = Math.sqrt(n).toInt
      for (i <- 3 until end by 2) {
        if (n % i == 0) return false
      }
      true
  }

  @tailrec
  def lengthQuadratic(a: Int, b: Int, n: Int): Int = {
    if (!isPrime(Math.abs(n * n + a * n + b))) return n
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
