package w2

object LCM extends App {

  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a else gcd(b, a % b)

  def lcm(a: BigInt, b: BigInt): BigInt = (a * b).abs / gcd(a, b)

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    val a = sc.nextInt()
    val b = sc.nextInt()

    println(lcm(a, b))
  }
}
