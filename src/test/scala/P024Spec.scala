import org.scalatest._

class P024Spec extends FlatSpec with Matchers {
  "P024 " should "find the millionth lexicographic permutation of digits from 0 to 9" in {
    P024.millionthLexicographicPermutation.get shouldBe "2783915460"
  }
}
