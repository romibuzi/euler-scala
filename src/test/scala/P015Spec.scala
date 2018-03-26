import org.scalatest._

class P015Spec extends FlatSpec with Matchers {
  "P015 " should "find all possible path combinations in given square grid to reach from (0, 0) to (weight, height)" in {
    P015.numberOfPathsInSquareGrid(2) shouldBe 6
    P015.numberOfPathsInSquareGrid(20) shouldBe 137846528820L
  }
}
