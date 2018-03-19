import org.scalatest._

class P006Spec extends FlatSpec with Matchers {
  "P006 " should "compute the sum square difference of numbers between min and max" in {
    P006.sumSquareDiff(1, 10) shouldBe 2640L
    P006.sumSquareDiff(1, 100) shouldBe 25164150L
  }
}
