import org.scalatest._

class P032Spec extends FlatSpec with Matchers {
  "P032 " should "find the sum of products which can be written as a 1 through 9 pandigital" in {
    P032.sumOfPandigitalProducts shouldBe 45228
  }
}
