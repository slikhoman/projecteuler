package problems_1_100.problems_1_10

object Problem3 extends App {
  println("The prime factors of 13195 are 5, 7, 13 and 29.")
  println("What is the largest prime factor of the number 600851475143?")

  def factors(n: Long): List[Long] = (2 to math.sqrt(n).toInt)
    .find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n / i))

  val value = factors(600851475143L).last

  println(s"The largest prime factor of the number 600851475143 is $value")
}
