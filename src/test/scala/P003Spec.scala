import org.scalatest._

class P003Spec extends FlatSpec with Matchers {
  "P003 " should "find largest prime factor of given number" in {
    P003.maxPrimeFactor(13195L) shouldBe 29
    P003.maxPrimeFactor(600851475143L) shouldBe 6857
  }
}
