object AlgebraicDataTypes {
  def main(args: Array[String]): Unit = {
    val fizzbuzz:(Int) => Unit = (i) => {
      if(i % 3 == 0 && i % 5==0)
        println("fizzbuz")
      else if(i%3==0)
        println("fizz")
      else if(i%5==0)
        println("buzz")
      else
        println(i)
    }
    for(i <- 1 to 15) fizzbuzz(i)


    val modulusCheck: (Int, Int) => Boolean = (num, mod) => num % mod == 0
    // a function that checks if the number modulus 3 is equal to 0
    val modulus3Check: (Int) => Boolean = modulusCheck(_, 3)
    // a function that checks if the number modulus 5 is equal to 0
    val modulus5Check: (Int) => Boolean = modulusCheck(_, 5)
    // a function that for a given number checks what to print based on the pattern matching conditions
    val fizzBuzz: Int => Unit = {
      case number if modulus3Check(number) && modulus5Check(number) =>
        println("FizzBuzz")
      case number if modulus3Check(number) =>
        println("FizzBuzz")
      case number if modulus5Check(number) =>
        println("FizzBuzz")
      case number => println(number)
    }
    for (i <- 1 to 15) fizzBuzz(i)



    sealed abstract class FizzBuzzADT(i: Int) {
      override def toString: String = i.toString
    }
    case class Fizz(i: Int) extends FizzBuzzADT(i){
      override def toString: String = "Fizz"
    }
    case class Buzz(i: Int) extends FizzBuzzADT(i){
      override def toString: String = "Buzz"
    }
    case class FizzBuzz(i: Int) extends FizzBuzzADT(i){
      override def toString: String = "FizzBuzz"
    }
    case class JustInt(i: Int) extends FizzBuzzADT(i)

    val modulusChecks: (Int, Int) => Boolean = (num, mod) => num % mod == 0
    // a function that checks if the number modulus 3 is equal to 0
    val modulus3Checks: (Int) => Boolean = modulusChecks(_, 3)
    // a function that checks if the number modulus 5 is equal to 0
    val modulus5Checks: (Int) => Boolean = modulusChecks(_, 5)
    // companion object that implements the apply method and
    // using pattern matching then return an appropriate object
    object FizzBuzzADT {
      def apply(i: Int): FizzBuzzADT = i match {
        case _ if modulus3Checks(i) && modulus5Checks(i) =>
          FizzBuzz(i)
        case _ if modulus3Checks(i) => Fizz(i)
        case _ if modulus5Checks(i) => Buzz(i)
        case _ => JustInt(i)
      }
    }
    var numbers = 1 to 15
    // creating a list of numbers to use
    // using the map function to go over the list of number where by creating the FizzBuzzADT
    // the apply method will be returning the appropriate object created
    val fizzBuzzed = numbers map ( number => FizzBuzzADT(number))
    // fizzBuzzed will be now equal to ->
    // Vector(1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz)
  }
}
