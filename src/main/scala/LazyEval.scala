import scala.util.Random

object LazyEval {

  def main(args: Array[String]): Unit = {


    def randomInt = Random.nextInt()
    println(randomInt) // will be evaluated to a new value each time like: -1503480485
    println(randomInt) // will be evaluated to a new value each time like: 1295895529
    println(randomInt) // will be evaluated to a new value each time like: -951915374

    val randomDouble = Random.nextDouble()
    println(randomDouble) // will be evaluate to the same value each time like : 0.05763428656827829
    println(randomDouble) // will be evaluate to the same value each time like : 0.05763428656827829
    println(randomDouble) // will be evaluate to the same value each time like : 0.05763428656827829

    lazy val randomLazyLong = Random.nextLong()
    println(randomLazyLong)
    // will be evaluated on the first call and then the value won’t change like: 1686381307780112820
    println(randomLazyLong)
    // will be evaluated on the first call and then the value won’t change like: 1686381307780112820
    println(randomLazyLong)
    // will be evaluated on the first call and then the value won’t change like: 1686381307780112820
  }

}
