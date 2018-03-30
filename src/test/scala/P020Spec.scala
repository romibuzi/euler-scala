import org.scalatest._

class P020Spec extends FlatSpec with Matchers {
  "P020 " should "find the sum of digit of given number factorial" in {
    P020.factorialDigitSum(10) shouldBe 27
    P020.factorialDigitSum(100) shouldBe 648
  }
}
