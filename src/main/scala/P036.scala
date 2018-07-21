import MathHelper.isPalindrome

object P036 {
  private def isPalindromeInBothBase(n: Int): Boolean =
    isPalindrome(n.toString) && isPalindrome(n.toBinaryString)

  def doubleBasePalindromesSum: Int =
    (1 until 1000000).filter(isPalindromeInBothBase).sum
}
