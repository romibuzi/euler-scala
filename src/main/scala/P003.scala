import scala.annotation.tailrec

object P003 {
  @tailrec
  def maxPrimeFactor(n: Long, prime: Int = 2): Int = {
    if (prime >= n) return prime

    n % prime match {
      case 0 => maxPrimeFactor(n / prime, prime)
      case _ => maxPrimeFactor(n, if (prime > 2) prime + 2 else 3)
    }
  }
}
