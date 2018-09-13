import scala.annotation.tailrec

object MaximumPathSum {
  @tailrec
  private def maxPathSum(tops: List[List[Int]], bottom: List[Int]): Int = {
    val bottomMaxs = bottom.sliding(2).map(pair => pair.head max pair.last).toList
    val nodes = tops.last.zip(bottomMaxs).map(p => p._1 + p._2)

    if (nodes.length == 1) // We reached the top
      nodes.head
    else
      maxPathSum(tops.init, nodes)
  }

  def apply(trianglePath: String): Int = {
    val triangle = Reader.readNumbersGrid(trianglePath)
    maxPathSum(triangle.init, triangle.last)
  }
}
