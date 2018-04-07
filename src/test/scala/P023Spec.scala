import org.scalatest._

class P023Spec extends FlatSpec with Matchers {
  "P023 " should "find the sum of all non abundant numbers under given limit" in {
    P023.findAllAbundants(28123) shouldBe 4179871
  }
}
