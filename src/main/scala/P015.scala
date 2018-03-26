import MathHelper.factorial

object P015 {
  // Inspired by this excellent article :
  // https://betterexplained.com/articles/navigate-a-grid-using-combinations-and-permutations/
  def numberOfPathsInSquareGrid(size: Int): BigInt = {
    val width, height = size
    val total = width + height

    factorial(total) / (factorial(width) * factorial(total - height))
  }
}
