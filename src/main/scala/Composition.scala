object Composition {

  def main(args: Array[String]): Unit = {
    val totalCost = 10.58
    // a function that takes a double and then returns a double
    val applyDiscount = (amount: Double) => {
      println("Applying discount")
      val discount = 0.1
      amount - amount * discount
    }
    // a function that takes a double and then returns a double
    val applyTax = (amount: Double) => {
      println("Applying Tax")
      val tax = 0.2
      amount + amount * tax
    }
    println(f"The total after tax is ${(applyDiscount andThen applyTax)(totalCost)}%5.2f")

    val totalCosts = 10.58
    // a function that takes a double and then returns a double
    val applyDiscounts = (amount: Double) => {
      println("Applying discount")
      val discount = 0.1
      amount - amount * discount
    }
    // a function that takes a double and then returns a double
    val applyTaxs = (amount: Double) => {
      println("Applying Tax")
      val tax = 0.2
      amount + amount * tax
    }
    println(f"The total after tax is ${(applyTax compose applyDiscount)(totalCosts)}%5.2f")

  }

}
