object Arrays {

  def main(args: Array[String]): Unit = {

    val array = Array(
      "harry",
      "Bob",
      "marcus"
    )
      // can perform same operations on the array as you can the list with .head .tail etc

    //multidimensional arrays are defined in 1 bracket and are then assigned in multiple brackets. 2x2 is the dimention
    //and then you deal with the index of the array as you would a loop

    val multiarray = Array.ofDim[Int](2, 2)

    multiarray(0)(0) = 1
    multiarray(0)(1) = 2
    multiarray(1)(0) = 3
    multiarray(1)(1) = 4

    println(multiarray(0)(1))

    //short way of doing a 1xX array is using toArray

    val quickarray = (1 to 10).toArray[Int]

    //this print doesnt work either
    println(quickarray)

    val arraybuffer = scala.collection.mutable.ListBuffer.empty[Int]
    arraybuffer += 3
    arraybuffer += 4

    // The toArray same as the toList, takes the buffer type and converts it to an Array type
    arraybuffer.toArray

  }

}
