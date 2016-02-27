package problems_1_100.problems_1_10

object Problem6 extends App {
  println("The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385")
  println("The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025")
  println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.")
  println("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.")

  val values = 1 to 100

  def square(n: Int) = n * n

  val value = square(values.sum) - values.map(square).sum

  println(s"The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is $value")
}
