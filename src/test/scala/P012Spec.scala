import org.scalatest._

class P012Spec extends FlatSpec with Matchers {
  "P012 " should "find the first triangular number to have over five hundred divisors" in {
    P012.highlyDivisibleTriangular() shouldBe 76576500
  }
}
