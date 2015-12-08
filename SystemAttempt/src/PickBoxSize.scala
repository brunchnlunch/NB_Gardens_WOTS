import java.io._
import scala.io.Source
import scala.util.control.Breaks._     //allows breaks
import scala.collection.mutable.ArrayBuffer   //mutable arrays

class PickBoxSize (OrdersList : Array[Array[String]], StockList : Array[Array[String]]) {
  
  var Order : Array[String] = null
  
  println("Please enter the order number")
  var OrderNumber = scala.io.StdIn.readLine()
  breakable{
    for (a <- OrdersList) {
      if (a(0) == OrderNumber) {
        Order = a
        break
      }
    }
  }
  
  
  var RequiredVolume : Int = 0
  var ItemNumbers : ArrayBuffer[String] = ArrayBuffer.empty[String]
  
  println(Order.length - 1)
  
  for (a <- 3 to (Order.length -1)) {   //puts out of the items in the order, puts item numbers into an array
    if(a%2 == 1){
      println(a)
      ItemNumbers += Order(a)
      println(a) 
    }
  }
  
  
  for (a <- 0 to (ItemNumbers.length -1)){  //turn OrderNumbers from a list of item numbers into a list of item sizes
    for (b <- StockList){
      if (ItemNumbers(a) == b(0)){
        ItemNumbers(a) = b(4)
      }
    }
  }
  for (a <- ItemNumbers){
    RequiredVolume = RequiredVolume + a.toInt
  }
  
  println(RequiredVolume)
  
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}