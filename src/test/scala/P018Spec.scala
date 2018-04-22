import org.scalatest._

class P018Spec extends FlatSpec with Matchers {
  "P018 " should "find the maximum total from top to bottom of the triangle" in {
    P018.maximumPathSum shouldBe 1074
  }
}
