object P017 {
  val FIRSTS = List(
    "", // empty first element to match given number, ex: FIRSTS(1) = "one"
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
  )
  val DECADES = List(
    "",
    "ten",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
  )

  val HUNDRED = "hundred"
  val THOUSAND = "thousand"

  val HYPHEN = "-"
  val SPACE = " "
  val AND = SPACE + "and" + SPACE

  def sumOfNumbersLetters(limit: Int): Long =
    (1 to limit).map(numberToLetters).map(countNumberLetters).sum

  private def countNumberLetters(letters: String): Int =
    letters.replace(SPACE, "").replace(HYPHEN, "").length

  private def numberToLetters(number: Int): String = {
    if (number < 100) return twoDigitNumberToLetter(number)
    if (number < 1000) return threeDigitNumberToLetter(number)

    FIRSTS(1) + SPACE + THOUSAND
  }

  private def twoDigitNumberToLetter(number: Int): String = {
    if (number < 20) return FIRSTS(number)

    val base = DECADES(number / 10)

    if (number % 10 == 0)
      base
    else
      base + HYPHEN + FIRSTS(number % 10)
  }

  private def threeDigitNumberToLetter(number: Int): String = {
    val base = FIRSTS(number / 100) + SPACE + HUNDRED

    if (number % 100 == 0)
      base
    else
      base + AND + twoDigitNumberToLetter(number % 100)
  }
}
