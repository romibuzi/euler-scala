import scala.annotation.tailrec

object P046 {
  val primes = EratosthenesSieve(10000)

  private def isSumOfPrimeAndTwiceSquare(number: Int): Boolean = {
    primes.takeWhile(_ < number).exists { prime =>
      Math.sqrt((number - prime) / 2).isWhole
    }
  }

  @tailrec
  def findComposite(number: Int = 3): Int = {
    if (MathHelper.isPrime(number) || isSumOfPrimeAndTwiceSquare(number))
      findComposite(number + 2)
    else
      number
  }
}
