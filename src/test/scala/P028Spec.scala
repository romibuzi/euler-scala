import org.scalatest._

class P028Spec extends FlatSpec with Matchers {
  "P028 " should "find the sum of the numbers on the diagonals in a 1001 by 1001 spiral " in {
    P028.sumOfDiagonals shouldBe 669171001
  }
}
