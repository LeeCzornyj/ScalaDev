object MapsPartOne {

  def main(args: Array[String]): Unit = {

    val map = Map(1 -> "a", 2 -> "b")
    map(1) // will be evaluated to -> a
    map.get(1)
    // using .get will result in the value being returned as an optional, this expression will be evaluated
    // to -> Some(a)
    map.getOrElse(9,"No value found")

    val map2 = Map(3 -> "c")

    // can use "map + (5 -> "e" ) and that will add the pair to map, but only locally as immutable
    // can also add two different maps together, using map ++ map2
    // can also update a map by using "map update(1,"z") etc
    // can use the opposite functions to remove away from

    //a neat function is the 1 below, it will remove all the sets of keys in map that are in map2

    map -- map2.keys

    //using .keys gets the keys to the pair, i.e in the example below, it will be evalutated to 1,2, using .keySet
    //does the same thing
    map.keys

    //using .values will get the values to the keys, in this scenario, it will be evaluated to a,b
    map.values

    //using .filterKeys will filter the map based on that requirement, so in this example, getting everything above
    //where the value is 1
    map.filterKeys(value => value > 1)

    //you can also use "map mapValues()" which will perform the operation on the values assigned to the keys, in this
    //scenario, everything will be multipled by 2, so will be evaluated as (1 -> aa, 2 -> bb)
    map mapValues(value => value * 2)

  }

}
