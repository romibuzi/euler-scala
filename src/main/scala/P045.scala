object P045 {
  def hexagonal(number: Long): Long =
    number * (2 * number - 1)

  // hexagonal numbers is a subset of triangle numbers
  // so only search hexagonal numbers that are also pentagonal
  def nextHexagonalAndPentagonalTriangle: Long =
    Iterator
      .iterate(144L)(_ + 1)
      .map(hexagonal)
      .filter(MathHelper.isPentagonal)
      .next()
}
