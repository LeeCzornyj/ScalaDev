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


    //the scenario below will take Salt and vinegar and convert to lower case in case 1, if any of them match, display
    // i dont like them
    val crispsImEating: Any = "Salt and Vinegar"
    crispsImEating match{
      case crisps:String if crisps.toLowerCase.contains("vinegar") => "i dont like them"
      case crisps:String if !crisps.toLowerCase.contains("vinegar") => "i like them"
      case _ => "i dont recognise the taste"
    }


    def whatTimeIsIt(time: Any): String = time match {
      case _ => s"$time Is no time"
    }
    whatTimeIsIt("9:30") // will be evaluated to -> 9:30 Is no time
    whatTimeIsIt(9,30)  // will be evaluated to -> (9,30) Is no time


    case class Time(hours:Int, minutes:Int)
    def whatTimeIssIt(time: Any): String = time match {
      case time:Time => s"It’s ${time.hours}:${time.minutes}"
      case x => s"$x Is no time"
    }
    whatTimeIssIt(Time(9,30))

    //so if i understand this right, it'll takea time, and try and match it to the cases, if it's 12:00 it'll be high
    //noon, otherwise it'll be no time.
    def whatTimeeIsIt(time: Any): String = time match {
      case "12:00" => s"It’s high noon"
      case _ => s"$time Is no time"
    }
    whatTimeeIsIt("12:00") // will be evaluated to -> It’s high noon
    whatTimeeIsIt("11:31") // will be evaluated to -> 11:31 Is no time

    def whatTimeIsItNow(time: Any): String = time match{
      case (x,"12:00") => s"it's $x to high noon"
      case _ => s"$time it's no time"

    }

    //This will currently deal with minutes and hours referencing noon, so 12,0 = 12:00, 12,25 = its 25 past noon
    //everything else, its no time
    case class Time(hours:Int, minutes:Int)
    def whatTimeIsIts(time: Any): String = time match {
      case Time(12, 0) | Time(0,0) => s"High noon or midnight"
      case Time(12, minutes) => s"It’s $minutes past noon"
      case _ => s"$time Is no time"
    }
    whatTimeIsIts(Time(12,0)) // will be evaluated to -> High noon or midnight
    whatTimeIsIts(Time(12,25)) // will be evaluated to -> It’s 25 past noon


    case class Time(hours:Int, minutes:Int)
    def whatTTimeIsIt(time: Any): String = time match {
      case timeObject @ Time(_, _) => s"It’s ${timeObject.hours}:${timeObject.minutes}"
      case _ => s"$time Is no time"
    }
    whatTTimeIsIt(Time(12,0)) // will be evaluated to -> It’s 12:0
    whatTTimeIsIt(Time(12,25)) // will be evaluated to -> It’s 12:25


    case class Time(hours:Int, minutes:Int)
    def wwhatTimeIsIt(time: Any): String = time match {
      case timeObject @ Time(_, _) if timeObject.hours > 12 => s"It’s ${timeObject.hours}:${timeObject.minutes}"
      case _ => s"$time Is no time"
    }
    wwhatTimeIsIt(Time(12,0)) // will be evaluated to -> It’s 12:0
    wwhatTimeIsIt(Time(12,25)) // will be evaluated to -> It’s 12:25
  }

}
