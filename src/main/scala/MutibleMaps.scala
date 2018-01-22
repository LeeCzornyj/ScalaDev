object MutibleMaps {

  def main(args: Array[String]): Unit = {

    val map = scala.collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")

    val map2 = Map(6 -> "d", 7 ->"z")

    //now that the map is mutible we can change values within it that will carry over?
    map(1) = "d"

    //now its mutible we can add to the map and maintain it
    map += (4->"d")

    //this will find 1 and update it with m as the value, if there is no key of 1, then it will create 1
    map.getOrElseUpdate(1,"m")

    //using map -= key will remove that pair from the map
    //using map --= map2.keysIterator will remove all but matching pairs inside map

    // map2.retain((key,value) => key > 1) makes no sense in the document,

    //map.clear() removes everything from the map
    map.clear()

    //this will basically mean that your key will be multiplied by your value, so if you have map(1->"a", 2->"b", 3->"c")
    //it'll become map(1->"a",2->"bb",3->"ccc")
    map.transform((key,value) => value * key)
  }

}
