package problems_1_100.problems_1_10

object Problem7 extends App {
  println("By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, " +
    "we can see that the 6th prime is 13. What is the 10 001st prime number?")

  def isPrime(n: Int) = (2 to math.sqrt(n).toInt).forall(n % _ > 0)

  val value = Stream.from(2).filter(isPrime).take(10001).last

  println(s"The 10 001st prime number is $value")
}
