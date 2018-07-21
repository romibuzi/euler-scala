object P031 {
  def coinSumsWays: Int = {
    val target = 200
    val coins = Array(1, 2, 5, 10, 20, 50, 100, target)
    val ways = new Array[Int](target + 1)
    ways(0) = 1

    for (coin <- coins; n <- coin to target) {
      ways(n) += ways(n - coin)
    }

    ways(target)
  }
}
