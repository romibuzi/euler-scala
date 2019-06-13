object P024 {
  def millionthLexicographicPermutation: Option[String] = {
    (0 to 9).toList.permutations.zipWithIndex.find { case (_, idx) =>
      idx == 999999
    }.map(_._1.mkString)
  }
}
