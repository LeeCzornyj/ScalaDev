import scala.util.Random

object HighOrder {

  def main(args: Array[String]): Unit = {

    def totalPrice(quanitty: Int, beerType: String, discount:Double => Double) = {
      val price = 3.5
      discount(price*quanitty)
    }

    /* This statement doesnt work, not sure why though,
    println(s"the final price is: ${totalPrice(7)("guiness")(
      totalCost: Double) => {
        val discount = 1.25
        totalCost - discount
      }
    }")

    */


    def totalPrices(qountity: Int)(beerType: String)(discount:Double => Double) = {
      val price = 3.5
      discount(price * qountity)
    }
    val applyDiscount = (totalCost: Double) => {
      val discount = 0.1
      totalCost - totalCost * discount
    }
    println(s"The final price is: ${totalPrices(10)("Guinness") (applyDiscount(_))}")

    val beerList = List(
      ("Guinness", 10, 2.75),
      ("Stella", 5, 2.46),
      ("Fosters", 15, 2.0)
    )

    // this function takes in a list with string, int, double as parameters, initialises a double
    def placeDrinkOrder(items: List[(String, Int, Double)])(exchangeRate: Double): Double = {
      var totalCost: Double = 0
      items.foreach( item => {
        val itemCost = item._2 * item._3 * exchangeRate
        println(f"The price for ${item._1} is £$itemCost%5.2f")
        totalCost += itemCost
      })
      totalCost
    }
    println(f"Your order comes to: £${placeDrinkOrder(beerList)(1.06)}%5.2f")

    val beerLists = List(
      ("Guinness", 10, 2.75),
    ("Stella", 5, 2.46),
    ("Fosters", 15, 2.0)
    )
    val randomRate = new Random(10)
    def usdToGbp: Double = {
      val exchangeRate = randomRate.nextDouble()
      println(s"The exchange rate for USD to GBP is: $exchangeRate")
      exchangeRate
    }
    // a curried function that takes in a list of beers and for
    //the second group of arguments a double as an exchange rate
    def placeDrinkOrders(items: List[(String, Int, Double)])(exchangeRate: Double): Double = {
      var totalCost: Double = 0
      items.foreach( item => {
        val itemCost = item._2 * item._3 * exchangeRate
        println(f"The price for ${item._1} is £$itemCost%5.2f")
        totalCost += itemCost
      })
      totalCost
    }
    // running our implementation
    println(f"Your order comes to: £${placeDrinkOrders(beerLists) (1.06)}%5.2f")


    def totalPricers(qountity: Int)(beerType: String)(discount: Double => Double) = {
      val price = 3.5
      discount(price * qountity)
    }
    val applyDiscounts = (totalCost: Double) => {
      val discount = 0.1
      totalCost - totalCost * discount
    }
    // passing a named function as an argument and use the underscore to act as a wildcard which
    // allows to pass any number
    println(f"The final price is: ${totalPricers(10)("Guinness")(applyDiscounts(_))}%5.2")
  }
}
