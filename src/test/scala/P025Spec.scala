import org.scalatest._

class P025Spec extends FlatSpec with Matchers {
  "P025 " should "find the index of the first term in the Fibonacci sequence that contains 1000 digits" in {
    P025.thousandDigitFibonaccinumber() shouldBe 4782
  }
}
