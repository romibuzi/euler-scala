import MathHelper.sumOfProperDivisors

import scala.annotation.tailrec

object P023 {
  def isAbundant(n: Int): Boolean = sumOfProperDivisors(n) > n

  def findAllAbundants(limit: Int): Int = {
    val abundants = (1 to limit).filter(isAbundant).toSet

    @tailrec
    def notSumAbundantNumbers(num: Int, numbers: List[Int]): List[Int] = {
      if (num >= limit) return numbers

      val lowerAbundants = abundants.filter(_ < num)
      if (!lowerAbundants.exists(x => lowerAbundants.contains(num - x)))
        notSumAbundantNumbers(num + 1, numbers :+ num)
      else
        notSumAbundantNumbers(num + 1, numbers)
    }

    notSumAbundantNumbers(1, List.empty).sum
  }
}
