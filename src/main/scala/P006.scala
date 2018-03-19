import MathHelper.square

object P006 {
  def sumSquareDiff(min: Int, max: Int): Long = {
    val numbers = min to max

    val sumSquare = numbers.map(square).sum
    val squareSum = square(numbers.sum)

    squareSum - sumSquare
  }
}
