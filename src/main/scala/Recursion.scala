object Recursion {

  def main(args: Array[String]): Unit = {

    val arrayOfBeers = Array("Guinness", "Stella", "Fosters", "Corona")
    def searchBeer(beername: String, beers: Array[String], index: Int = 0): Option[Boolean] = {
      if (beers.length == index) { // check to see if we reached the end of the list
        None
      } else if (beers(index) == beername) { // check if the value stored at this index is the one we’re looking for
          Some(true)
      } else {
        val nextIndex = index + 1 // increment the index by one
        searchBeer(beername, beers, nextIndex) // the function calls itself with an incremented index
      }
    }
    // initial call to the function
    searchBeer("Fosters", arrayOfBeers).getOrElse("Nothing found")
    // will be evaluated to -> true
    searchBeer("Desperados", arrayOfBeers).getOrElse("Nothing found")
    // will be evaluated to -> Nothing found


    import scala.util.control.TailCalls._
    val arrayOfBeerss = Array("Guinness", "Stella", "Fosters","Corona")
    def searchBeers(beernames: String, beerss: Array[String],
                   index: Int = 0): TailRec[Option[Boolean]] = {
      if (beerss.length == index) {
        // check to see if we reached the end of the list
        done(None)
      } else if (beerss(index) == beernames) {
        // check if the value stored at this index is the one we’re looking for
          done(Some(true))
      } else {
        val nextIndex = index + 1 // increment the index by one
        tailcall(searchBeers(beernames, beerss, nextIndex))
        // the function calls itself with an incremented index
      }
    }
    // initial call to the function
    searchBeers("Fosters", arrayOfBeerss).result.getOrElse("Nothing found")
    // will be evaluated to -> true
    searchBeers("Desperados", arrayOfBeerss).result.
      getOrElse("Nothing found")
    // will be evaluated to -> Nothing found


  }
}
