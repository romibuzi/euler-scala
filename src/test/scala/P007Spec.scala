import org.scalatest._

class P007Spec extends FlatSpec with Matchers {
  "P007 " should "compute the nth prime number" in {
    P007.nthPrimeNumber(2) shouldBe 3
    P007.nthPrimeNumber(3) shouldBe 5
    P007.nthPrimeNumber(4) shouldBe 7
    P007.nthPrimeNumber(5) shouldBe 11
    P007.nthPrimeNumber(100) shouldBe 541
    P007.nthPrimeNumber(10001) shouldBe 104743
  }
}
