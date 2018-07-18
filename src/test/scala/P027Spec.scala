import org.scalatest._

class P027Spec extends FlatSpec with Matchers {
  "P027 " should "find the product of the coefficients a and b, " +
                 "for the quadratic expression that produces the maximum number of primes" in {
    P027.quadraticPrimes shouldBe -59231
  }
}
