

import java.io._
import scala.io.Source
import java.util.Date
import scala.collection.mutable.ArrayBuffer   //mutable arrays

//----------------------------------------------------------



object SystemAttempt {
  def main(args: Array[String]) {
    
    
    //create fake orders.
    //(OrderNumber, OrderCompleted, OrderAssigned, ItemNumber, ItemQuantity)
    var Order1 = Array("0001", "Yes", "Yes", "0001", "3")
    var Order2 = Array("0002", "No", "Yes", "0002", "5")
    var Order3 = Array("0003", "No", "No", "0003", "1", "0004", "1")
    
    var OrdersList = Array(Order1, Order2, Order3)
    
    
    //create fake workers list.
    var Worker1 = ArrayBuffer("Dave Bloggs")
    var Worker2 = ArrayBuffer("Joe Volvic")
    var Worker3 = ArrayBuffer("Dave Prodesk")
    
    var WorkerList = Array(Worker1, Worker2, Worker3)
    
    
    //create fake stock list
    //(ItemNumber, ItemName, Quantity, Location, Volume in cm^3,)
    var Item1 = Array("0001", "ChristmasGnome", "100", "52341", "25")
    var Item2 = Array("0002", "BigGnome", "50", "52342", "100")
    var Item3 = Array("0003", "TinyGnome", "60", "42132", "4")
    var Item4 = Array("0004", "PurpleGnome", "2", "32142", "15")
    
    var StockList = Array(Item1, Item2, Item3, Item4)
    
    
    //define a function to match user choice to a result.
    def matchTest(x: String): Unit = x match {
      case "1" => var a : AssignOrder = new AssignOrder(OrdersList)
      case "2" => var b : ReportDamagedStock = new ReportDamagedStock(StockList)
      case "3" => var c : ClockingInOut = new ClockingInOut(WorkerList)
      case "4" => var d : ViewOrders = new ViewOrders(OrdersList)
      case "5" => var e : ItemLocation = new ItemLocation(StockList)
      case "6" => var f : PickBoxSize = new PickBoxSize(OrdersList, StockList)   // -------------------<<<<
      case _ => var z : InvalidChoice = new InvalidChoice
      }
    
    //start user selection process
    while(true) {
      var aa : UserSelection = new UserSelection
      matchTest(aa.GetChoice)
      }
    
    
    
    

    
    
  }
}

