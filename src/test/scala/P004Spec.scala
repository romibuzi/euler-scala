import org.scalatest._

class P004Spec extends FlatSpec with Matchers {
  "P004 " should "find largest Palindrome Product of n-length-digit numbers" in {
    P004.largestPalindromeProduct(1).get shouldBe 9
    P004.largestPalindromeProduct(2).get shouldBe 9009
    P004.largestPalindromeProduct(3).get shouldBe 99000099
  }
}
