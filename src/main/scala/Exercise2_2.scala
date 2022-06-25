import scala.annotation.tailrec

object Exercise2_2 {

  @main
  def main(): Unit = {
    val a = Array(1, 2, 3, 4)
    val b = Array(1, 2, 4, 3)
    val c = Array(2, 1, 3, 4)
    val d = Array(1, 2, 3, 3)

    println(isSorted(a, (a, b) => a <= b))
    println(isSorted(b, (a, b) => a <= b))
    println(isSorted(c, (a, b) => a <= b))
    println(isSorted(d, (a, b) => a <= b))

    val countries = Array("america", "bangladesh", "chile")

    println(isSorted(countries, (a, b) => a.compareTo(b) <= 0));
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean =
    @tailrec
    def loop(i: Int): Boolean =
      if i >= as.length - 1 then true
      else if !ordered(as(i), as(i + 1)) then false
      else loop(i + 1)

    loop(0)
}
