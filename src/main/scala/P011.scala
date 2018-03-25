import scala.io.Source

object P011 {
  def readGrid: List[List[Int]] = {
    Source
      .fromResource("p011_grid.txt")
      .getLines
      .map(line => line.split(" ").map(_.toInt).toList)
      .toList
  }

  def largestProductInGrid(): Int = {
    val grid = readGrid

    grid.zipWithIndex.flatMap {
      case (lineNumbers, y) => lineNumbers.zipWithIndex.map {
        case (number, x) =>
          val right = if (x < 17) number * grid(y)(x+1) * grid(y)(x+2) * grid(y)(x+3) else 0
          val down  = if (y < 17) number * grid(y+1)(x) * grid(y+2)(x) * grid(y+3)(x) else 0
          val diagRight = if (y < 17 && x < 17) number * grid(y+1)(x+1) * grid(y+2)(x+2) * grid(y+3)(x+3) else 0
          val diagLeft  = if (y < 17 && x > 2)  number * grid(y+1)(x-1) * grid(y+2)(x-2) * grid(y+3)(x-3) else 0

          List(right, down, diagRight, diagLeft)
      }
    }.flatten.max
  }
}
