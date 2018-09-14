import scala.annotation.tailrec

object P046 {
  val primes = EratosthenesSieve(10000)

  private def isSumOfPrimeAndTwiceSquare(number: Int): Boolean = {
    for (prime <- primes if prime < number) {
      if (Math.sqrt((number - prime) / 2).isWhole) {
        return true
      }
    }

    false
  }

  @tailrec
  def findComposite(number: Int = 3): Int = {
    if (MathHelper.isPrime(number) || isSumOfPrimeAndTwiceSquare(number))
      findComposite(number + 2)
    else
      number
  }
}
