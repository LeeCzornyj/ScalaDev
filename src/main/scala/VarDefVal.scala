class Person (var name : String ,var age : Int)

object VarDefVal extends App {

  def showEvaluationOnCall() : Unit = {

    def person = new Person("John", 36)
    println("Persons age is: " + person.age)

    person.age = 32

    println("Persons new age is: " +person.age)
  }
  // we still get initial age, even though we redefined it afterwards to be 32

  showEvaluationOnCall()

  def showEvaluationOnDefine() : Unit = {

    val person = new Person("James", 21)
    println("Persons age is: "+ person.age)

    person.age = 18

    println("Persons new age is: " + person.age)

  }
  showEvaluationOnDefine()
}
