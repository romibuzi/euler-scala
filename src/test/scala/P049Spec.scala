import org.scalatest._

class P049Spec extends FlatSpec with Matchers {
  "P049 " should "find the sequence in which each of the terms increases by 3330 " +
                 "and each of the three terms are prime and permutations of one another" in {
    P049.primePermutations shouldBe "296962999629"
  }
}
