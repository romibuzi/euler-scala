import Reader.readWords
import Word.wordValue

object P022 {
  def sumOfNameScores: Int =
    readWords("p022_names.txt")
      .sorted
      .map(wordValue)
      .zipWithIndex
      .map { case (score, idx) => score * (idx + 1) }
      .sum
}
