object Vectors {

  def main(args: Array[String]): Unit = {

    //vectors are fairly straight forward

    val vector = Vector(1,2,3)

    vector updated(1,5)

    // even though we updated the vector, it's immutable so retains its original values of 1,2,3
    println(vector)

  }
}
