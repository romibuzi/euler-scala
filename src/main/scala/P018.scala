import scala.annotation.tailrec
import scala.io.Source

object P018 {
  def readTriangle: List[List[Int]] =
    Source
      .fromResource("p018_triangle.txt")
      .getLines
      .map(line => line.split(" ").map(_.toInt).toList)
      .toList

  @tailrec
  def maxBottomPaths(tops: List[List[Int]], bottom: List[Int]): Int = {
    val bottomMaxs = bottom.sliding(2).map(pair => pair.head max pair.last).toList
    val nodes = tops.last.zip(bottomMaxs).map(p => p._1 + p._2)

    if (nodes.length == 1) // We reach the top
      nodes.head
    else
      maxBottomPaths(tops.init, nodes)
  }

  def maximumPathSum: Int = {
    val triangle = readTriangle
    maxBottomPaths(triangle.init, triangle.last)
  }
}
