import org.scalatest._

class P023Spec extends FlatSpec with Matchers {
  "P023 " should "find the sum of all the sum of all the positive integers which cannot be written as the sum of two abundant numbers" in {
    P023.findAllNotSumOf2Abundants shouldBe 4179871
  }
}
