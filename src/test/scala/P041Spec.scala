import org.scalatest._

class P041Spec extends FlatSpec with Matchers {
  "P041 " should "find the largest n-digit pandigital prime" in {
    P041.maxPandigitalPrime.get shouldBe 7652413
  }
}
