object Currying {

  def main(args: Array[String]): Unit = {


    def totalPrice(qountity: Int)(discount: Double)(beerType:String) = {
      val price = 3.5
      price * qountity - discount
    }
    println(s"The final price is: ${totalPrice(7)(2.25)("Guinness")}")

    def totalPrices(qountity: Int)(discount: Double)(beerType: String) = {
      val price = 3.5
      price * qountity - discount
    }
    // so this will only pass the first arguement to the function above, i assume this is due to the _ at the end of
    // the call
    val stella = totalPrices(9) _
    //we can now carry on passing the arguements by refering to the values name and then passing the arguments afterwards
    stella(0.1)("stella")


  }

}
