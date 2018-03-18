object P001 {
  private def isMultipleOf3: Int => Boolean = _ % 3 == 0
  private def isMultipleOf5: Int => Boolean = _ % 5 == 0

  def multiplesOf3And5Below(n: Int): Int =
    (1 until n).filter(x => isMultipleOf3(x) || isMultipleOf5(x)).sum
}
