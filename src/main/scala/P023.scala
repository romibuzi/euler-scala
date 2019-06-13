import MathHelper.sumOfProperDivisors

object P023 {
  val LIMIT = 28123
  val abundants: Array[Boolean] = abundantsIndices(LIMIT)

  def isAbundant(number: Int): Boolean =
    sumOfProperDivisors(number) > number

  // Array(0, limit) where non-abundants are `false` and abundants are `true`
  def abundantsIndices(limit: Int): Array[Boolean] = {
    val abundants = Array.fill(limit + 1)(false)

    for (number <- 1 to abundants.length) {
      if (isAbundant(number)) abundants(number) = true
    }

    abundants
  }

  def isSumOf2Abundants(number: Int): Boolean = {
    (0 until number).exists { i =>
      abundants(i) && abundants(number - i)
    }
  }

  def findAllNotSumOf2Abundants: Int =
    (1 to LIMIT)
      .filterNot(number => isSumOf2Abundants(number))
      .sum
}
