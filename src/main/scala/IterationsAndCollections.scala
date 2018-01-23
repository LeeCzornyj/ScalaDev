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

  }

}
