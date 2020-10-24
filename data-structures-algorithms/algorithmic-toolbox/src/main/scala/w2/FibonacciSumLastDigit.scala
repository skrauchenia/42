object FibonacciSumLastDigit extends App {

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
  def getFibonacciLastDigit(n: Long): BigInt = {
    val first60LastFibsChars = (3 to 60)
      .foldLeft(Seq[BigInt](1, 1)) {
        case (acc, _) =>
          val fibi = acc.takeRight(2).sum
          acc :+ fibi
      }
      .map(_ % 10)

    val multiplier = n / 60
    val sum = first60LastFibsChars
      .map(_ * multiplier)
      .sum + first60LastFibsChars.take((n % 60).toInt).sum

    sum % 10
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong()
    println(s"${getFibonacciLastDigit(n)}")
  }
}
