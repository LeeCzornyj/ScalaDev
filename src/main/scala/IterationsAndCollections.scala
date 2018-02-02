object IterationsAndCollections {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5)
    list map (value => value * 10) // will be evaluated to -> List(10, 20, 30, 40, 50)

    val lists = List("Hello", "World")
    lists map (_.toList) // will be evaluated to -> List(List(H, e, l, l, o), List(W, o, r, l, d))
    lists flatMap (_.toList) // will be evaluated to -> List(H, e, l, l, o, W, o, r, l, d)

    var sum = 0
    val listed = List (1,2,3,4,5)
    listed foreach (element => sum += element)
    sum // this will be evaluated to 15, as it adds up all the values inside the list

    //create a list of 1 to 10 as the name suggests, doesnt specify whether inclusive or exclusive
    val oneToTen = List.range(1,10)

    //filter out the list for everything mod2 so List(2,4,6,8,10)
    val evenNumbers = oneToTen.filter((i:Int) => i%2 ==0)

    //basic mutiplication function, takes in 2 integers and mutiplies when called (learning this sort of stuff is more
    //beneficial for me, as it's using it in a practical sense
    var multiply(x:Int, y:Int) => x*y
    multiply(2,30)
  }
}
