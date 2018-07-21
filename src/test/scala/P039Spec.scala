import org.scalatest._

class P039Spec extends FlatSpec with Matchers {
  "P039 " should "find the most common perimeter P of a right angle triangle for P < 1000" in {
    P039.integerRightTriangles shouldBe 840
  }
}
