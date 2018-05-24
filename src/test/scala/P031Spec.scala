import org.scalatest._

class P031Spec extends FlatSpec with Matchers {
  "P031 " should "find how many different ways can £2 be made using any number of coins" in {
    P031.coinSumsWays shouldBe 73682
  }
}
