object P016 {
  private def decomposerNumber(number: BigInt): List[Int] =
    number.toString.map(_.asDigit).toList

  def sumOfPowerDigits: Int =
    decomposerNumber(BigInt(2).pow(1000)).sum
}
