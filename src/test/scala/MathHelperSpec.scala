import org.scalacheck.Gen
import org.scalatest._
import org.scalatest.prop.GeneratorDrivenPropertyChecks

class MathHelperSpec extends FlatSpec with Matchers with GeneratorDrivenPropertyChecks {
  "MathHelper " should "identify pentagonal numbers" in {
    val pentagonalNumbers =
      for (n <- Gen.choose(1, 10000)) yield (3 * MathHelper.square(n) - n) / 2

    forAll(pentagonalNumbers) { number: Int =>
      MathHelper.isPentagonal(number) shouldBe true
    }
  }

  "MathHelper " should "compute the square of a number" in {
    val numbers = for (n <- Gen.choose(0, Math.sqrt(Int.MaxValue).toInt)) yield n
    forAll(numbers) { n: Int =>
      val square = MathHelper.square(n)
      Math.sqrt(square).toInt shouldBe n
    }
  }

  "MathHelper " should "identify prime numbers" in {
    val primes = Gen.oneOf(EratosthenesSieve.apply(1000))
    forAll(primes) { n: Long =>
      MathHelper.isPrime(n) shouldBe true
    }
  }

  "MathHelper " should "identify palindrome numbers" in {
    forAll { n: Int =>
      whenever (n >= 0) {
        val palindrome =  s"$n${n.toString.reverse}"
        MathHelper.isPalindrome(palindrome) shouldBe true
      }
    }
  }
}
