import org.scalatest._

class P042Spec extends FlatSpec with Matchers {
  "P042 " should "find the number of triangle words in the given file" in {
    P042.sumOfTriangles shouldBe 162
  }
}
