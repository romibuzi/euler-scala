import org.scalatest._

class P067Spec extends FlatSpec with Matchers {
  "P067 " should "find the maximum total from top to bottom of the triangle" in {
    P067.maximumPathSum shouldBe 7273
  }
}
