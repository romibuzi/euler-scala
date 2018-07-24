object Word {
  // 'a'.toInt = 97
  // 'z'.toInt = 122
  def alphabeticalPosition: Char => Int = _.toLower.toInt - 96

  def wordValue: String => Int = _.map(alphabeticalPosition).sum
}
