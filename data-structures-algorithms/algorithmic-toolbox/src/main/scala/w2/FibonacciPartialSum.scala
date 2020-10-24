package w2

object FibonacciPartialSum extends App {

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

    sum
  }

  def getFibonacciLastDigit(start: Long, end: Long): BigInt = {
    val total = getFibonacciLastDigit(end)
    val head = getFibonacciLastDigit(start - 1)

    (total - head) % 10
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val from = sc.nextLong()
    val to = sc.nextLong()
    println(s"${getFibonacciLastDigit(from, to)}")
  }
}
