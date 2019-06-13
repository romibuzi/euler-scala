object P004 {
  def largestPalindromeProduct(numberDigits: Int): Option[Int] = {
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

    (max to min by -1).view.flatMap { a =>
      (max to min by -1).map { b =>
        a * b
      }
    }.find(product => MathHelper.isPalindrome(product.toString))
  }
}
