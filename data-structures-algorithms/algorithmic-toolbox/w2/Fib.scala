package w2

import java.util.Scanner

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

  override def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
//    val (result, _) = fib(sc.nextInt())
    val n = sc.nextInt()
//    println(s"${fibArr(n)}\n${fibMemo(n)._1}")
    println(s"${fibArr(n)}")
  }
}
