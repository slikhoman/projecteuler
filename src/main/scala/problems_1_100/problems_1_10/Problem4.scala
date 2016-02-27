package problems_1_100.problems_1_10

object Problem4 extends App {
  println("A palindromic number reads the same both ways.")
  println("The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.")
  println("Find the largest palindrome made from the product of two 3-digit numbers.")

  val palindromes: Seq[Int] = for {
    first <- 1 until 999
    second <- 1 until 999
    product = first * second
    if isPalindrome(product)
  } yield product

  def isPalindrome(n: Int): Boolean = n.toString == n.toString.reverse

  val value = palindromes.max

  println(s"The largest palindrome made from the product of two 3-digit numbers is $value")
}
