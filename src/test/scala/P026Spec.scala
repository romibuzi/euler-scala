import org.scalatest._

class P026Spec extends FlatSpec with Matchers {
  "P026 " should "find the number with the longest recurring cycle in its decimal fraction part" in {
    P026.largestRecurringCycleBelow(10) shouldBe 7
    P026.largestRecurringCycleBelow(1000) shouldBe 983
  }
}
