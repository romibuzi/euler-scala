import org.scalatest._

class P040Spec extends FlatSpec with Matchers {
  "P040 " should "find the value of d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000 in continued fraction" in {
    P040.champernowneConstant shouldBe 210
  }
}
