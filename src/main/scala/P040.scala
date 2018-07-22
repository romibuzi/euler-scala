object P040 {
  def champernowneConstant: Int = {
    val fraction = (1 to 200000).map(_.toString).mkString

    List(1, 10, 100, 1000, 10000, 100000, 1000000).foldLeft(1) {
      case (acc, idx) => acc * fraction.charAt(idx - 1).asDigit
    }
  }
}
