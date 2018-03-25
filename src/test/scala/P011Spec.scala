import org.scalatest._

class P011Spec extends FlatSpec with Matchers {
  "P011 " should "find the largest product in grid" in {
    P011.largestProductInGrid() shouldBe 70600674
  }
}
