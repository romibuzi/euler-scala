import org.scalatest._

class P035Spec extends FlatSpec with Matchers {
  "P035 " should "count the number of circular primes below 1 million" in {
    P035.countCircularPrimesBelow1Million shouldBe 55
  }
}
