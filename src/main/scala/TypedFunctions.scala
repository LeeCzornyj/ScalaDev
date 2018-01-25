object TypedFunctions {

  def main(args: Array[String]): Unit = {

    //So notes had them with the same name, but from what i can tell, that doesnt work,
    def applyDiscount(discount: String): Unit = println(s"You will receive the discount of $discount")
    def applyDiscounts(discount: Double): Unit = println(s"You will receive the discount of $discount")

    applyDiscount("0.5")
    applyDiscounts(0.5)

    // matching again, i still dont get how this whole matching thing works, specially in this sort of scenario
    def applyDiscountt[T](discount: T): Unit = {
      discount match {
        case disc: String => println(s"You will receive the discount of $discount")
        case disc: Double => println(s"You will receive the discount of $discount")
        case _ => println(s"Unrecognised discount")
      }
    }


    def appplyDiscount[T](discount: T): List[T] = {
      discount match {
        case disc: String => List[T](discount)
        case disc: Double => List[T](discount)
        case _ => List[T](discount)
      }
    }
    applyDiscountt("10%")
  }

}
