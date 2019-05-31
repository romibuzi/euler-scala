import org.scalatest._

class P050Spec extends FlatSpec with Matchers {
  "P050 " should "find the longest sum of consecutive primes that adds to a prime" in {
    P050.findLongestPrimesSumBeingPrime(100).get shouldBe 41
    P050.findLongestPrimesSumBeingPrime(1000).get shouldBe 953
    P050.findLongestPrimesSumBeingPrime(1000000).get shouldBe 997651
  }
}
