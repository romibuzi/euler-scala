import org.scalatest._

class P034Spec extends FlatSpec with Matchers {
  "P034 " should "find the sum of numbers that can be written as the sum of their digits factorials sum" in {
    P034.digitFactorials shouldBe 40730
  }
}
