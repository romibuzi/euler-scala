import org.scalatest._

class P044Spec extends FlatSpec with Matchers {
  "P044 " should "find the pentagonal of the given number" in {
    P044.pentagonal(4) shouldBe 22
    P044.pentagonal(7) shouldBe 70
    P044.pentagonal(8) shouldBe 92
  }

  "P044 " should "find the difference of the pair of pentagonal numbers Pj and Pk, " +
                 "for which their sum and difference are pentagonal and diff = |Pk − Pj| is minimised" in {
    P044.findPairDifference() shouldBe 5482660
  }
}
