import org.scalatest._

class P002Spec extends FlatSpec with Matchers {
  "P002 " should "find the sum of the even-valued terms in the fibonacci secquence below 4 Million" in {
    P002.evenFibonacci(0, 1, 2) shouldBe 4613732L
  }
}
