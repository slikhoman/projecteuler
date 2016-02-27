package problems_1_100.problems_1_10

object Problem1 extends App {
  println("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.")
  println("The sum of these multiples is 23.")
  println("Find the sum of all the multiples of 3 or 5 below 1000.")

  val value = (1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum

  println(s"Sum of all the multiples of 3 or 5 below 1000 is $value")
}
