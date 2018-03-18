import org.scalatest._

class P001Spec extends FlatSpec with Matchers {
  "P001 " should "compute the sum of multiples of 3 and 5 for numbers below max given" in {
    P001.multiplesOf3And5Below(10) shouldBe 23
    P001.multiplesOf3And5Below(1000) shouldBe 233168
  }
}
