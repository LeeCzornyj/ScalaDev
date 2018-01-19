import java.lang.Character.Subset

object Subsets {

  def main(args: Array[String]): Unit = {

    val set = Set(1,2,3,4,5)
    val subset = Set(1,2,3)
    val subset2 = Set(3,6,7)

    //if subset is a subset of set, then the below statement will return true
    subset subsetOf(set)

    //adding multiple sets together will combine the 2 sets, without duplicates
    val set2 = set ++ subset2
    println(set2)

    //can also subtract the common set and subset values
    val set3 = subset2 -- set
    println(set3)

    //can also use symbols such as | or & which are basically, whats in either, and what's only in both
    // i.e set | subset2 will return 1,2,3,4,5,6,7, where as set & subset2 will return 3

    //using "set retain(x => x > y) will keep everything in the set above y, have to use scala.collection.mutible.Set
    //though for that to work
  }

}
