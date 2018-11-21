import org.scalatest._

class P047Spec extends FlatSpec with Matchers {
  "P047 " should "find the first four consecutive integers to have four distinct prime factors each" in {
    P047.consecutiveFourDistinctPrimeFactors.get shouldBe 134043
  }
}
