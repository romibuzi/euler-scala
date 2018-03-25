import org.scalatest._

class P014Spec extends FlatSpec with Matchers {
  "P014 " should "find the number under million that produces the longest Collatz sequence" in {
    P014.largestCollatzSecquence(1000000) shouldBe 837799
  }
}
