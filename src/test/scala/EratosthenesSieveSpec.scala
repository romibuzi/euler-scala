import org.scalatest._

class EratosthenesSieveSpec extends FlatSpec with Matchers {
  "EratosthenesSieve " should "generate all primes between 1 and 100" in {
    val expectedPrimes = List(
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
      43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    )

    EratosthenesSieve.apply(100) should contain theSameElementsAs expectedPrimes
  }
}
