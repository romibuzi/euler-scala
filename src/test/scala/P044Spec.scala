import org.scalatest._

class P044Spec extends FlatSpec with Matchers {
  "P044 " should "find the pentagonal of the given number" in {
    P044.pentagonal(4) shouldBe 22
    P044.pentagonal(7) shouldBe 70
    P044.pentagonal(8) shouldBe 92
  }

  "P044 " should "know if given number is pentagonal or not" in {
    val pentagonalNumbers = List(1, 5, 12, 22, 35, 51, 70, 92, 117, 145)
    val nonPentagonalNumbers = List(2, 3, 10, 25, 42, 60, 100)

    pentagonalNumbers.foreach(P044.isPentagonal(_) shouldBe true)
    nonPentagonalNumbers.foreach(P044.isPentagonal(_) shouldBe false)
  }

  "P044 " should "find the difference of the pair of pentagonal numbers Pj and Pk, " +
                 "for which their sum and difference are pentagonal and diff = |Pk − Pj| is minimised" in {
    P044.findPairDifference() shouldBe 5482660
  }
}
