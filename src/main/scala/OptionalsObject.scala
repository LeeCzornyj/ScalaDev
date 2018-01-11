object OptionalsObject {

  def main(args: Array[String]): Unit = {

    val mediumRareSteak: Option[String] = None
    println(s"medium-rare steaks are ${mediumRareSteak.getOrElse("nasty")}")

    val mediumSteak: Option[String] = Some("Tasty")
    println(s"medium steaks are ${mediumSteak.getOrElse("nasty")}")

  }

/* top 1 will realise that the option is none and use the default version in the mediumRareSteak.getOrElse statement
  of nasty.
  However the second statement has Some("Tasty"), so when rather than use the default value it will access this tasty
  and use that in it's statement.
  */

}
