import org.scalatest._

class MathHelperSpec extends FlatSpec with Matchers {
  "MathHelper " should "know if given number is pentagonal or not" in {
    val pentagonalNumbers = List(1, 5, 12, 22, 35, 51, 70, 92, 117, 145)
    val nonPentagonalNumbers = List(2, 3, 10, 25, 42, 60, 100)

    pentagonalNumbers.foreach(MathHelper.isPentagonal(_) shouldBe true)
    nonPentagonalNumbers.foreach(MathHelper.isPentagonal(_) shouldBe false)
  }
}
