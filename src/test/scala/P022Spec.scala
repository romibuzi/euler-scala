import org.scalatest._

class P022Spec extends FlatSpec with Matchers {
  "P022 " should "find the sum of all name scores in the given file" in {
    P022.sumOfNameScores shouldBe 871198282
  }
}
