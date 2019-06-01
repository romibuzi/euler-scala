import org.scalatest._

class P052Spec extends FlatSpec with Matchers {
  "P052 " should "find the smallest positive integer, x, " +
                 "such that 2x, 3x, 4x, 5x, and 6x, contain the same digits" in {
    P052.firstNumberWithPermutedMultiples.get shouldBe 142857
  }
}
