import scala.collection.mutable.ArrayBuffer   //mutable arrays
import java.util.Date
import scala.util.control.Breaks._     //allows breaks
import java.io._

class ClockingInOut (WorkerList: Array[ArrayBuffer[String]]) {
  println("Please enter your name")
  var Name = scala.io.StdIn.readLine()
  var dNow : Date = new Date( ) //takes current date and time
  var d = dNow.toString
  for (a <- WorkerList){
    breakable{
      if(a(0) == Name){
        a += d
        break
      }
    }
  }
  println("Input to return to main menu")
  var c : String = scala.io.StdIn.readLine()
}