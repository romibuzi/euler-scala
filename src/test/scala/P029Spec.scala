import org.scalatest._

class P029Spec extends FlatSpec with Matchers {
  "P029 " should "compute distinct power combinations to given limit" in {
    P029.distinctPowers(5) shouldBe 15
    P029.distinctPowers(1000) shouldBe 118168
  }
}
