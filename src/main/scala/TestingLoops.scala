import util.control.Breaks

object TestingLoops {


    def main(args: Array[String]): Unit = {

        for (i <- 1 to 10) {
          println(i)
          if (i > 4) {
            Breaks
          }
        }
      }
}
