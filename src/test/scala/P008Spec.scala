import org.scalatest._

class P008Spec extends FlatSpec with Matchers {
  "P008 " should "find largest possible product of n-length in Series" in {
    P008.largestProductInSeries(4) shouldBe 5832L
    P008.largestProductInSeries(13) shouldBe 23514624000L
  }
}
