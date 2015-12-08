import java.io._
import scala.io.Source

class UserSelection {
  println("Please select what you'd like to do from below: ")
  println("(1): Be assigned a new order")
  println("(2): Report damaged stock")
  println("(3): Clocking in/out")
  println("(4): View orders")
  println("(5): Item location")
  println("(6): Pick box size")
  var choice = scala.io.StdIn.readLine()
  println("You have chosen choice (" + choice +")")
  
  def GetChoice() : String = {
    choice
  }
}