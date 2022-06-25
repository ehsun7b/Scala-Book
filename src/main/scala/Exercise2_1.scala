import scala.annotation.tailrec

object Exercise2_1 {

  def main(): Unit = {
    println(fibonacci(0))
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))

    println("--------------")

    println(fibonacciTailRec(0))
    println(fibonacciTailRec(1))
    println(fibonacciTailRec(2))
    println(fibonacciTailRec(3))
    println(fibonacciTailRec(4))
    println(fibonacciTailRec(5))
    println(fibonacciTailRec(6))
  }

  def fibonacci(n: Int): Int = {
    if n < 2 then n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciTailRec(n: Int): Int = {
    @tailrec
    def go(n: Int, acc1: Int, acc2: Int): Int =
      if n <= 0 then acc1
      else go(n - 1, acc2, acc1 + acc2)

    go(n, 0, 1)
  }
}
