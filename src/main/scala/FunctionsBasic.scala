object FunctionsBasic {

  def main(args: Array[String]): Unit = {

    // standard here, will display my favourite beer is guiness
    def favouritebeer() : String = "guiness"
    println(s"my favourite beer is ${favouritebeer()}")

    //an alternative is to just define rather than use String
    def myFavouriteJuice() = "apple"
    println(s"my favourite juice is ${myFavouriteJuice()} juice")

    //so this will take in an int into the function and as a result, multiply it by 3.5, so in this case resulting in
    // three pints of guniess will be 10.5
    def priceOfGuinness(quantity: Int): Double = quantity * 3.5
    println(s"Three pints of Guinness will be ${priceOfGuinness(3)}")

    // this is just another way of doing the same as above, results in the same outcome
    //first statement gives you a orange juice at 2.5, 2nd statement takes default value of 0 and gives orange juice at 0
    def priceOfOrangeJuice(qountity: Int = 0): Double = qountity* 2.5
    println(s"One glass of orange juice will be ${priceOfOrangeJuice(1)}")
    println(s"the glass of orange juice will be ${priceOfOrangeJuice()}")

    def favouriteBeerPrice(quanity: Int, discountCode: Option[String] = None):Double= {
      discountCode match {
        case Some(discount) => (quanity * 3.5) * 0.9
        case None => quanity * 3.5
      }
    }
      println(s"Five pints of Guinness with discount code will be " +
        s"${favouriteBeerPrice(5, Some("Buy 5 pints get 10% off"))}")
      println(s"Three pints of Guinness without the discount" +
        "code will be ${favouriteBeerPrice(3, None)}")


    def  dailyCoupon() : Option[String] = {
      Some("Coupon value that we retrieved from DB")
    }
    println(s"The coupon for today is ${dailyCoupon().get}")
    println(s"The coupon for today is ${dailyCoupon().getOrElse("There are no coupons for today")}")

    dailyCoupon() match {
      case Some(value) => println(s"The coupon for today is $value")
      case None => println("There are no coupons for today")
    }

  }


}
