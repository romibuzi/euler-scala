import org.scalatest._

class P030Spec extends FlatSpec with Matchers {
  "P030 " should " find the sum of numbers that can be written as the sum of fifth powers of their digits" in {
    P030.digitFifthPowers shouldBe 443839
  }
}
