
object Callback {

  def main(args: Array[String]): Unit = {

    def printReceit(sendReceitCallBack: () => Unit): Unit = {
      println("Starting printing")
      // assume that we print out all the merchandise data on it here
      println("Ending printing")
      sendReceitCallBack()
    }
    // calling the function
    printReceit( () => {
      println("Finished printing")
    })

    def printReceits(sendReceitCallBack: () => Unit): Unit = {
      println("Starting printing")
      // assume that we print out all the merchandise data on ithere
      println("Ending printing")
      sendReceitCallBack()
    }
    printReceits( () => {})

    def printReceipts(sendReceitCallBacks: Option[() => Unit] = None): Unit = {
      println("Starting printing")
      // assume that we print out all the merchandise data on it here
      println("Ending printing")
      sendReceitCallBacks map (callback => callback)
    }
      printReceipts( Some(() => {}))
      printReceipts()
  }

}
