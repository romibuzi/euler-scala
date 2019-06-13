import scala.annotation.tailrec

object P005 {
  private def isCommonMultiplier(multiple: Int, numbers: List[Int]): Boolean = {
    numbers.forall(multiple % _ == 0)
  }

  private def findCommonMultiple(numbers: List[Int]): Int = {
    // The common multiplier of a list of numbers is a multiple of the largest value in this list
    // This will be the step to test the next possible multiplier
    val max = numbers.max

    @tailrec
    def commonMultiple(multiple: Int, numbers: List[Int]): Int = {
      if (isCommonMultiplier(multiple, numbers)) return multiple
      commonMultiple(multiple + max, numbers)
    }

    // reverse the order of numbers from max to min
    // so we get a higher probability to break earlier when testing multipliers
    commonMultiple(max, numbers.sortWith(_ > _))
  }

  def smallestCommonMultiple(max: Int): Int = {
    val range = (1 to max).toList
    findCommonMultiple(range)
  }
}
