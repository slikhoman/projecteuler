package problems_1_100.problems_1_10

object Problem5 extends App {
  println("2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.")
  println("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?")

  val value = Range(20, Int.MaxValue).find(isEvenlyDivisible)

  def isEvenlyDivisible(n: Int) = (1 until 20).forall(n % _ == 0)

  println(s"The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is $value")

}
