import org.scalatest._

class P016Spec extends FlatSpec with Matchers {
  "P016 " should "find the sum of the digits of 2 ** 1000" in {
    P016.sumOfPowerDigits shouldBe 1366
  }
}
