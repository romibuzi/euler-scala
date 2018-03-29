import org.scalatest._

class P017Spec extends FlatSpec with Matchers {
  "P017 " should "find the number of all number letters to the given one" in {
    P017.sumOfNumbersLetters(5) shouldBe 19
    P017.sumOfNumbersLetters(1000) shouldBe 21124
  }
}
