
object AddToGit {

  def main(args: Array[String])={

    val a = 10
    val b = "hello all"
    println(a)
    println(b)
  }

  def isEven(number: Int): Boolean =
    if(number % 2 == 0)
      true
    else
      false

  println("This value is: "+ isEven(2))
  println(isEven(3))

}
