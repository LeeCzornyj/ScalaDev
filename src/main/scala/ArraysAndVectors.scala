object ArraysAndVectors {

  def main(args: Array[String]): Unit = {

    /*
      Can't add to this list anymore as it's been created, will need to define a new list if want to add to it
     */

    val list: List[String] = List(
      "red",
      "yellow",
      "blue"
    )
    println(s"getting first value from list: ${list(0)} ")

    println(s"getting all but first value from list: ${list.tail}")

    println(s"getting the last value from the list: ${list.last}")

    println(s"getting first element from list without using list(0): ${list.head}")

    // This will create a new list of the same elements as above but add green onto the end
    val list2 = list :+ "green"

    println(list2)

    // This will add list 1 and list 2 together to form list 3
    val list3 = list ::: list2

    println(list3)

    //list buffer allows us to add to a list without creating a new one

    val listbuffer = scala.collection.mutable.ListBuffer.empty[Int]

    listbuffer += 22
    listbuffer += 33

    println(listbuffer)

  }

}
