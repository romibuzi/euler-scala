import org.scalatest._

class P005Spec extends FlatSpec with Matchers {
  "P005 " should "find the smallest multiple of given numbers" in {
    P005.smallestCommonMultiple(10) shouldBe 2520
    P005.smallestCommonMultiple(20) shouldBe 232792560
  }
}
