package w2

object FibonacciSumSquares extends App {

  def getFibonacciLastDigit(n: Long): BigInt = {
    val patternSize = 60
    val first60LastFibsChars = (3 to patternSize)
      .foldLeft(Seq[BigInt](1, 1)) {
        case (acc, _) =>
          val fibi = acc.takeRight(2).sum
          acc :+ fibi
      }.map(f => f * f)

    val multiplier = n / patternSize
    val sum = first60LastFibsChars
      .map(_ * multiplier)
      .sum + first60LastFibsChars.take((n % patternSize).toInt).sum

    sum % 10
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong()
    println(s"${getFibonacciLastDigit(n)}")
  }
}
