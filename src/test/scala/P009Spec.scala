import org.scalatest._

class P009Spec extends FlatSpec with Matchers {
  "P009 " should "find pythagorean triplet of given sum" in {
    P009.findPythagoreanTriplet(12).get shouldBe 60
    P009.findPythagoreanTriplet(1000).get shouldBe 31875000
  }
}
