import scala.collection.mutable.ArrayBuffer

object Months extends Enumeration {
  val January, February, March, April, May,
  June, July, August, September,
  October, November, December = Value
}

object P019 {
  import Months._

  private def isLeapYear(year: Int): Boolean =
    year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

  private def numberOfDaysPerMonthAndYear: Array[Int] = {
    val buf = ArrayBuffer.empty[Int]
    for {
      year <- 1900 to 2000
      month <- Months.values
    } {
      val nbDays = month match {
        case February => if (isLeapYear(year)) 29 else 28
        case April | June | September | November => 30
        case _  => 31
      }
      buf += nbDays
    }
    buf.toArray
  }

  def countingSundays: Int = {
    val firstDaysOfMonths = numberOfDaysPerMonthAndYear.scanLeft(1) {
      (previous, nbDays) => previous + nbDays
    }

    // Being known that 1st January 1900 was a Monday
    // all first of months that are disible by 7
    // are also Sundays
    firstDaysOfMonths
      .drop(12)
      .count(_ % 7 == 0)
  }
}
