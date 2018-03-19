object P004 {
  private def isPalindrome(number: Long): Boolean =
    number.toString == number.toString.reverse

  def largestPalindromeProduct(numberDigits: Int = 2): Option[Long] = {
    val (min, max) = numberDigits match {
      case 1 => (1, 9)
      case 2 => (10, 99)
      case _ =>
        // 3 => max: 999, min: 100, 4 => max: 9999, min: 1000, etc
        (
          Math.pow(10, numberDigits).toInt,
          (Math.pow(10, numberDigits + 1) - 1).toInt
        )
    }

    // Brute force approach
    // test all products of two n-digits numbers
    // return the first palindrome found which corresponds to the largest possible one
    for {
      a <- max to min by -1
      b <- max to min by -1
      if isPalindrome(a * b)
    } return Some(a * b)

    None
  }
}
