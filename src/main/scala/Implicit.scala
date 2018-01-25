object Implicit {

  def main(args: Array[String]): Unit = {

    // implicit values can be defined anywhere in the code
    implicit val discount: Double = 0.1

    def totalPrice(qountity:Int, price:Double)(implicit discount:Double):Double = qountity*price*(1-discount)

    totalPrice(10, 3.5)

    //takes in 3 variables, string, double, and 1 optional,
    // if i understand this right, the case class defines the variables, then the object is what happens with those
    // variables, in this case, it takes in "Beer" which is all the variables, and then converts into a string
    case class Beer (beerName: String, price: Double, productCode: Option[Long])
    object BeerImplicits {
      implicit class ImprovingBeer(beer: Beer) {
        def uuid: String = {
          s"Name: ${beer.beerName}, price: ${beer.price}, " +
            s"code: ${beer.productCode.getOrElse("no code found")}"
        }
      }
    }
    //This imports the method above, but not sure how it knows to format in the method above, unless it's from the uuid
    //part?
    import BeerImplicits._
    val guinness: String = Beer("Guinness", 2.5, None).uuid
    val stella: String = Beer("Stella", 2.5, Some(321)).uuid
    println(guinness)// will be evaluated to -> Name: Guinness, price: 2.5, code: no code found
  }

}
