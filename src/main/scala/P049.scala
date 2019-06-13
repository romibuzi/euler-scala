object P049 {
  val START = 1000
  val LIMIT = 10000
  val STEP = 3330

  def intoSequence(number: Int): Seq[Int] =
    Seq(number, number + STEP, number + 2 * STEP)

  def isSequenceOfPrimes(sequence: Seq[Int]): Boolean =
    sequence.forall(MathHelper.isPrime)

  def isSequenceOfPermutations(sequence: Seq[Int]): Boolean =
    sequence.map(_.toString.toSeq.sorted.unwrap).distinct.length == 1

  def primePermutations: String = {
    (START to LIMIT - 2 * STEP)
      .filterNot(_ == 1487)
      .map(intoSequence)
      .filter(isSequenceOfPrimes)
      .filter(isSequenceOfPermutations)
      .head
      .mkString
  }
}
