import java.io._
import scala.util.control.Breaks._     //allows breaks

class ItemLocation (StockList : Array[Array[String]]) {
  println("Please enter an item number")
  var ItemNumber = scala.io.StdIn.readLine()
  breakable {
    for (a <- StockList){
      if (a(0) == ItemNumber){
        println(a(3))
      }
    }
  }
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}