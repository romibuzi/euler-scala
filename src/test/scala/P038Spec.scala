import org.scalatest._

class P038Spec extends FlatSpec with Matchers {
  "P038 " should "find the largest 9-digit pandigital number that can be formed as the concatenated product of an integer" in {
    P038.largestPandigitalMultiple.get shouldBe 932718654
  }
}
