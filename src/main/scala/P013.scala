object P013 {
  private def readNumbers: List[BigInt] =
    Reader.getLines("p013_numbers.txt")
      .map(BigInt(_))
      .toList

  def firstTenDigitsOfNumbersSum(): String =
    readNumbers.sum.toString().take(10)
}
