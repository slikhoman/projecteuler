package problems_1_100.problems_1_10

object Problem10 extends App {
  println("The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.")
  println("Find the sum of all the primes below two million.")

  def isPrime(n: Int): Boolean = (2 to math.sqrt(n).toInt).forall(n % _ > 0)

  val value = (2 to 2000000).filter(isPrime).map(BigInt(_)).sum

  println(s"Sum of all the primes below two million is $value")
}
