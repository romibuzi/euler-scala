import org.scalatest._

class P043Spec extends FlatSpec with Matchers {
  "P043 " should "find the sum of 0 to 9 pandigital numbers with sub-string divisibility properties" in {
    P043.sumOfPandigitalWithSubStringDivisibility shouldBe 16695334890L
  }
}
