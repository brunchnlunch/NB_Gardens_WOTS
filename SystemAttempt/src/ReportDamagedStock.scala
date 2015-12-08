import java.io._
import scala.io.Source
import scala.util.control.Breaks._     //allows breaks


class ReportDamagedStock (StockList: Array[Array[String]]) {
  println("Please input item number of damaged stock:")
  var ItemNumber = scala.io.StdIn.readLine()
  println("Please input the quantity of damaged stock")
  var Quantity = scala.io.StdIn.readLine()
  breakable {
    for (a <- StockList){
      if (a(0) == ItemNumber) { 
        var Quant = a(2).toInt - Quantity.toInt
        a(2) = Quant.toString
      }
    }
  }
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}