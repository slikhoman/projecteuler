package problems_1_100.problems_1_10

object Problem9 extends App {
  println("A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.")
  println("For example, 32 + 42 = 9 + 16 = 25 = 52. There exists exactly one Pythagorean triplet for which a + b + c = 1000.")
  println("Find the product abc.")

  def square(n: Int) = n * n

  val value = for {
    a <- 1 to 1000
    b <- 1 to 1000
    c = 1000 - a - b
    if square(a) + square(b) == square(c)
    if a + b + c == 1000
  } yield a * b * c

  println(s"The product abc is $value")
}
