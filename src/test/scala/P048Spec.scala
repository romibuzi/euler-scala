import org.scalatest._

class P048Spec extends FlatSpec with Matchers {
  "P048 " should "find the sum of the the series 1^1 + 2^2 + 3^3 + ... + 10^10" in {
    P048.selfPowers(10) shouldBe "10405071317"
  }

  "P048 " should "find the last ten digits of the series 1^1 + 2^2 + 3^3 + ... + 1000^1000" in {
    P048.selfPowers(1000).takeRight(10) shouldBe "9110846700"
  }
}
