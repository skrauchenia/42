package w2

object FibonacciLastDigit extends App {

  /**
   * 2. 1 - 1
   * 3. 2 - 2
   * 4. 3 - 3
   * 5. 5 - 5
   * 6. 8 - 8
   * 7. 3 - 13
   * 8. 1 - 21
   * 9. 4 - 34
   * 10. 5 - 55
   * 11. 9 - 89
   * 12. 4 - 144
   * 13. 3 - 233
   * 14. 7 - 377
   * 15. 0 - 610
   * 16. 7 - 987
   * 17. 7 - 1597
   * 18. 4 - 2584
   * 19. 1 - 4181
   * 20. 5 - 6765
   * @param n
   * @return
   */

  def getFibonacciLastDigit(n: Int): Int = if (n <= 1) n else {
    if (n <= 1) {
      return n
    }

    var previous: Int = 0
    var current: Int = 1

    var i: Int = 0
    while ( {
      i < n - 1
    }) {
      val tmp_previous: Int = previous
      previous = current
      current = (tmp_previous + current) % 10

      i += 1
    }

    current
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    println(s"${getFibonacciLastDigit(n)}")
  }
}
