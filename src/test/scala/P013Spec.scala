import org.scalatest._

class P013Spec extends FlatSpec with Matchers {
  "P013 " should "find first ten digits of the large numbers sum" in {
    P013.firstTenDigitsOfNumbersSum() shouldBe "5537376230"
  }
}
