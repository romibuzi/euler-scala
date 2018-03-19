import scala.annotation.tailrec

object P005 {
  private def isCommonMultiplier(multiple: Long,
                                 numbers: List[Int]): Boolean = {
    for (number <- numbers) {
      if (multiple % number != 0) return false
    }
    true
  }

  private def findCommonMultiple(numbers: List[Int]): Long = {
    // The common multiplier of a list of numbers is a multiple of the largest value in this list
    // This will be the step to test the next possible multiplier
    val max = numbers.max

    @tailrec
    def commonMultiple(multiple: Long, numbers: List[Int]): Long = {
      if (isCommonMultiplier(multiple, numbers)) return multiple
      commonMultiple(multiple + max, numbers)
    }

    // reverse the order of numbers from max to min
    // so we get a higher probability to break earlier when testing multipliers
    commonMultiple(max, numbers.sortWith(_ > _))
  }

  def smallestCommonMultiple(max: Int): Long = {
    val range = (1 to max).toList
    findCommonMultiple(range)
  }
}
