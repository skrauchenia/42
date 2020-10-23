

object FibonacciHuge extends App {

  def fibHuge(n: Long, m: Int): Long = {
    if (n <= 1) n
    else {
      var previous: Int = 0
      var current: Int = 1

      var i: Long = 0
      while ( {
        i < n - 1
      }) {
//        val tmp_previous: Int = previous
//        previous = current
//        current = (tmp_previous + current) % m

        i += 1
      }

      current
    }
  }

  override def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLong()
    val m = sc.nextInt()
    println(s"${fibHuge(n, m)}")
  }
}
