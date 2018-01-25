object TuplesPartOne {

  def main(args: Array[String]): Unit = {

    //tuples can contain various types of characters and are immutible as well
    val tuple = ("a","b", 1, 4.56)

    tuple._1 // this will be evaluated as a
    tuple._4 // will be evaluated as 4.56

    tuple.productIterator.foreach(value => println(value))
    val tuples = ("a", "b", 3)
    val longerTuple = ("a", "b", 3, 4.56)
    def matchTuple(tuple: Any): Unit = tuple match {
      case (a, b, c) => println(s"We got a tuple with three elements: $a $b $c")
      case (a, b, c, d) => println(s"We got a tuple with three elements: $a $b $c $d")
      case _ => println("Unrecognised tuple")
    }

    matchTuple(tuple)
  }
}
