object P024 {
  def millionthLexicographicPermutation: Option[String] = {
    for ((permutation, idx) <- (0 to 9).toList.permutations.zipWithIndex) {
      if (idx == 999999) return Some(permutation.mkString)
    }
    None
  }
}
