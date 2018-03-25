import scala.annotation.tailrec

object P014 {
  private def isEven: Long => Boolean = _ % 2 == 0

  def largestCollatzSecquence(below: Int): Int = {
    @tailrec
    def collatz(number: Long, length: Int = 0): Int =
      number match {
        case 1              => length + 1
        case x if isEven(x) => collatz(number / 2, length + 1)
        case _              => collatz(3 * number + 1, length + 1)
      }

    (1 until below).map(n => (n, collatz(n))).maxBy(_._2)._1
  }
}
