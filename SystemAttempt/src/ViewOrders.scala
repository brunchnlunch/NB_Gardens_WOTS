import java.io._
import scala.util.control.Breaks._     //allows breaks


class ViewOrders (OrdersList : Array[Array[String]]) {
  println("please entre order number")
  var OrderNumber = scala.io.StdIn.readLine()
  for (a <- OrdersList){
    breakable{
      if (a(0) == OrderNumber){
        for(b <- a){
          println(b)
        }
        break
      }
    }
  }
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}