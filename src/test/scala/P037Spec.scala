import org.scalatest._

class P037Spec extends FlatSpec with Matchers {
  "P037 " should "find the sum of the eleven primes that are both truncatable from left to right and right to left " in {
    P037.elevenTruncatablePrimesSum shouldBe 748317
  }
}
