import org.scalatest._

class P036Spec extends FlatSpec with Matchers {
  "P036 " should "find the sum of palindromic numbers in both base 10 and base 2 below 1 million" in {
    P036.doubleBasePalindromesSum shouldBe 872187
  }
}
