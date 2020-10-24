package w2

object Fib extends App {

  type Acc = Map[Int, BigInt]

  def fibMemo(n: Int, acc: Acc = Map(0 -> 0, 1 -> 1)): (BigInt, Acc) = {
    if (acc.contains(n)) (acc(n), acc)
    else {
      val (m1, m1Acc) = fibMemo(n - 1)
      val (m2, m2Acc) = fibMemo(n - 2, m1Acc)
      val result = m1 + m2
      (result, m2Acc ++ Map(n -> result))
    }
  }

  def fibArr(n: Int): BigInt = if (n <= 1) n else {
    (2 to n).foldLeft(Seq[BigInt](0, 1)) { case (acc, _) =>
      val fibi = acc.takeRight(2).sum
      acc :+ fibi
    }.last
  }

  def fibFast(n: Int): BigInt = {
    if (n <= 1) n
    else {
      var previous: BigInt = 0
      var current: BigInt = 1

      (0 until n - 1).foreach { _ =>
        val tmp_previous = previous
        previous = current

        current = tmp_previous + previous
      }

      current
    }
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    println(s"${fibFast(n)}")
  }
}
