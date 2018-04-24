import scala.annotation.tailrec

object P028 {
  /*
    21 22 23 24 25
    20  7  8  9 10
    19  6  1  2 11
    18  5  4  3 12
    17 16 15 14 13

    1st spiral: 3 5 7 9   => incremented by 2
    2nd spiral: 13 17 21 25 => incremented by 4
    3rd spiral will be: 31 37 43 49 => incremented by 6
    etc

    all spirals are 4 numbers length
   */
  @tailrec
  def nextSpiralSum(previousSpiralsSum: Int, previousSpiralLast: Int, increment: Int): Int = {
    if (previousSpiralLast >= MathHelper.square(1001)) return previousSpiralsSum

    val spiral = (1 to 4).scanLeft(previousSpiralLast) {
      (previous, _) => previous + increment
    }.drop(1)

    nextSpiralSum(previousSpiralsSum + spiral.sum, spiral.last, increment + 2)
  }

  def sumOfDiagonals: Int = nextSpiralSum(1, 1, 2)
}
