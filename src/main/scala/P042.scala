import Reader.readWords
import Word.wordValue

object P042 {
  val triangles: LazyList[Int] = LazyList.from(1).map(number => number * (number + 1) / 2)

  def isTriangle(number: Int): Boolean =
    triangles.takeWhile(_ <= number).contains(number)

  def sumOfTriangles: Int =
    readWords("p042_words.txt")
      .map(wordValue)
      .count(isTriangle)
}
