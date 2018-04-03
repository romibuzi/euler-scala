import org.scalatest._

class P019Spec extends FlatSpec with Matchers {
  "P019 " should "count number of sundays that were first day of the month in the 20st century" in {
    P019.countingSundays shouldBe 171
  }
}
