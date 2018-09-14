object P048 {
  def selfPowers(limit: Int): String =
    (1 to limit)
      .map(n => BigInt(n).pow(n))
      .sum
      .toString
}
