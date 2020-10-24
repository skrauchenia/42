import scala.annotation.tailrec

object FibonacciHuge extends App {

  def getFibonacciLastDigit(n: Long, m: Int): Long =
    if (n <= 1) n
    else {
      if (n <= 1) {
        return n
      }

      var previous: Int = 0
      var current: Int = 1

      var i: Int = 0
      while ({
        i < n - 1
      }) {
        val tmp_previous: Int = previous
        previous = current
        current = (tmp_previous + current) % m

        i += 1
      }

      current
    }

  @tailrec
  def generatePattern(m: Int,
                      size: Int = 2,
                      cache: Seq[Int] = Seq(0, 1)): (Int, Seq[Int]) = {
    val justifiedSize = size * 2
    val startFibFrom = cache.size + 1
    val fibs = (startFibFrom to justifiedSize)
      .foldLeft(cache) {
        case (acc, _) =>
          val fibi = acc.takeRight(2).sum
          acc :+ fibi % m
      }

    val seqString = fibs.mkString

    val pattern = fibs.take(size).mkString
//    println(s"$size (${seq.size}) - $pattern, ${seqString.replace(pattern, "")}")
    if (seqString.replace(pattern, "").isEmpty) (size, fibs.take(size))
    else generatePattern(m, size + 1, fibs)
  }

  def fibHuge(n: Long, m: Int): Int = {
    if (n < m) {
      getFibonacciLastDigit(n, m).toInt
    } else {
      val (size, pattern) = generatePattern(m, m)
//      println(s"pattern size: $size")

      pattern((n % size).toInt) % m
    }
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong()
    val m = sc.nextInt()
    println(s"${fibHuge(n, m)}")
  }
}
