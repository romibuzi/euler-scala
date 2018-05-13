import scala.annotation.tailrec

object P026 {
  @tailrec
  def recurringCycleLength(number: Int, dividend: Int, decimals: List[Int]): Int = {
    val remain = dividend % number
    val idx = decimals.indexOf(remain)

    if (idx >= 0)
      idx + 1
    else
      recurringCycleLength(number, remain * 10, remain :: decimals)
  }

  def largestRecurringCycleBelow(n: Int): Int = {
    (1 until n).map { number =>
      (number, recurringCycleLength(number, 1, List.empty))
    }.maxBy(_._2)._1
  }
}
