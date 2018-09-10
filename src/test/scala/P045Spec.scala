import org.scalatest._

class P045Spec extends FlatSpec with Matchers {
  "P045 " should "find the hexagonal of the given number" in {
    P045.hexagonal(1) shouldBe 1
    P045.hexagonal(2) shouldBe 6
    P045.hexagonal(3) shouldBe 15
    P045.hexagonal(4) shouldBe 28
  }

  "P045 " should "find the next triangle number that is also pentagonal and hexagonal" in {
    P045.nextHexagonalAndPentagonalTriangle shouldBe 1533776805L
  }
}
