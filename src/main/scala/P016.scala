object P016 {
  def sumOfPowerDigits: Int =
    MathHelper.numberDigits(BigInt(2).pow(1000)).sum
}
