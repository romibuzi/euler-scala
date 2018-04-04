import org.scalatest._

class P021Spec extends FlatSpec with Matchers {
  "P021 " should "find the sum of all amicable numbers below 10000" in {
    P021.amicableNumbersSumBelow10000 shouldBe 31626
  }
}
