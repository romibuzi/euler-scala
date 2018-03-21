import org.scalatest._

class P010Spec extends FlatSpec with Matchers {
  "P010 " should "find the sum of all the primes below given limit" in {
    P010.sumOfPrimes(10) shouldBe 17
    P010.sumOfPrimes(2000000) shouldBe 142913828922L
  }
}
