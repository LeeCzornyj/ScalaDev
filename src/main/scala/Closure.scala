object Closure {

  def main(args: Array[String]): Unit = {

    var militaryAge = 16
    // This will evaluate to either true of false when passed a integer
    val isOfMilitary = (age: Int) => age >= militaryAge

    isOfMilitary(14) //under the military age so therefore false
    isOfMilitary(19) //over the military age so therefore true

    def printResult(function: Int => Boolean, age:Int): Unit = {
    println(s"The person is above military age of $militaryAge," + function(age))
    }
    printResult(isOfMilitary,16) //this will put out that the person is above the military age of 16, true
    //we can then change the military age and then rerun the function
    militaryAge = 18

    printResult(isOfMilitary,16) // this will now evaluate to false as the new military age will be 18 instead of 16
  }
}
