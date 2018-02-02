object LazyAndFunctional {
  def main(args: Array[String]): Unit = {
   def lessThanI(i: Int): Boolean = {
     println(s"$i less than 35?")
       i<35
   }
    def moreThanI(i:Int) : Boolean = {
      println(s"$i more than 25?")
      i>25
    }
    val sampleList = List( 3,29,28,36,35 )
    val firstFilter = sampleList.withFilter(lessThanI)
    val secondFilter = sampleList.withFilter(moreThanI)

    secondFilter.foreach(println(_))


    def lessThan35(i: Int): Boolean = {
      println(s"$i less than 35?")
      i < 35
    }
    // a function to check if the number is more than 25
    def moreThan25(i: Int): Boolean = {
      println(s"$i more than 25?")
      i > 25
    }
    // sample list
    val sampleLists = List(3, 29, 45, 32, 21)
    val firstFilterList = sampleLists.filter(lessThan35) // first time applying the filter to the list
    val secondFilterList = firstFilterList.filter(moreThan25)
    //second time applying the filter to the list that already had the first filter applied
    // going through the collection after the two filters were applied
    secondFilterList.foreach(println(_))
  }
}
