object NestedFunctions {
  def main(args: Array[String]): Unit = {
    val beerList = List("Guinness", "Stella", "Fosters", "Corona")
    def checkBeerAvailability(beerName: String): Boolean = {
      beerName.nonEmpty && beerList.contains(beerName)
      // we check that the beerlist we’re using isn’t empty and that it contains the beer we’re looking for
    }
    checkBeerAvailability("Fosters") // will be evaluated to -> true
    checkBeerAvailability("Desperados") // will be evaluated to -> false

    val beerLists = List("Guinness", "Stella", "Fosters", "Corona")
    def checkBeersAvailability(beerName: String): Boolean = {
      val validateName = (beerName: String) => beerName.nonEmpty && beerName.length < 50
      validateName(beerName) && beerLists.contains(beerName)
      // we check that the beerlist we’re using isn’t empty and that it contains the beer we’re looking for
    }
    checkBeersAvailability("Fosters") // will be evaluated to -> true
    checkBeersAvailability("Desperados") // will be evaluated to -> false
  }
}
