import java.io._
import scala.util.control.Breaks._     //allows breaks


class AssignOrder (OrdersList: Array[Array[String]]) {
  println("You have been assigned the following order:")
  breakable {
    for (a <- OrdersList)    
      if (a(1) == "No") {    //checks if order has already been completed
        if (a(2) == "No"){   //checks if order has already been assigned
          for(b <- a) {
            println(b)
          }
          break
        }
      }
   }
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}