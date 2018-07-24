import scala.io.Source

object Reader {
  def getLines(resourcePath: String): Iterator[String] =
    Source.fromResource(resourcePath).getLines

  def readNumbersGrid(resourcePath: String): List[List[Int]] =
    getLines(resourcePath)
      .map(line => line.split(" ").map(_.toInt).toList)
      .toList

  def readWords(resourcePath: String): List[String] =
    getLines(resourcePath)
      .mkString
      .replace("\"", "")
      .split(",")
      .toList
}
