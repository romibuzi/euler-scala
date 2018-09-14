import org.scalatest._

class P046Spec extends FlatSpec with Matchers {
  "P046 " should "find the smallest odd composite that cannot be written " +
                 "as the sum of a prime and twice a square" in {
    P046.findComposite() shouldBe 5777
  }
}
