object PatternMatching {

  def main(args: Array[String]): Unit = {

    val beerType = "lager"

    // match appears to operate like a switch statement
    beerType match{
        case "lager" => println("it's the worst drink in the world")
        case "ale" => println("a pile of dirty piss water")
        case _=> println("probably alot nicer than the other options")
    }

    // something wrong with this initial statement
    val whatBeerAmIDrinking match{
      case "lager" => "It may be pale, golden, amber or dark"
      case "ale" => "Mostly dark brown"
      case _ => "Some other colour"
    }

    println(s"i am drinking $beerType which is of colour $whatBeerAmIDrinking")
  }

}
