import MathHelper.isPentagonal

import scala.annotation.tailrec

object P044 {
  def pentagonal(number: Int): Int =
    number * (3 * number - 1) / 2

  @tailrec
  def findPairDifference(j: Int = 1, k: Int = 2): Int = {
    val Pj = pentagonal(j)
    val Pk = pentagonal(k)

    val sum = Pj + Pk
    val diff = Pk - Pj

    if (isPentagonal(sum) && isPentagonal(diff)) {
      diff
    } else if (j == k) {
      findPairDifference(1, k + 1)
    } else {
      findPairDifference(j + 1, k)
    }
  }
}
