package w2

object GCD extends App {

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    val a = sc.nextInt()
    val b = sc.nextInt()

    println(gcd(a, b))
  }
}
