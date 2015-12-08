
import scala.util.Random
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

trait Animal {
  def Eat(food: Int){
    println("ate the number " + food)
  }
}

class Pet {
  def Sit(){
    println("The pet sits")
  }
}

class Dog extends Pet with Animal {
  def Woof(){
    println("woof")
  }
  
}

class Cat extends Pet {
  def Meow(){
    println("meow")
  }
}

/*
class MineSweeper {
  val mines = 5
  var x=3
  var y=3
  def GenerateGrid: Array[Array[Int]] = {
    val grid: Array[Array[Int]] = Array.ofDim[Int](x, y)
    
    def PlaceMines(mLs: Array[Array[Int]], placed : Int) : Array[Array[Int]] ={
      if (placed == mines){
        mLs
      } else{
        val xcoord = Random.nextInt(x)
        val ycoord = Random.nextInt(y)
        if (mLs(xcoord)(ycoord) == 9)
          PlaceMines(mLs, placed)
        else{
          mLs(xcoord)(ycoord) = 9
          PlaceMines(mLs, placed.+(1))
        }
      }
    }
    PlaceMines(grid, 0)
  }
}
*/



/*
object Stuff {
  def main(args: Array[String]) {
    /*
   val dog: Dog = new Dog
   val cat: Cat = new Cat
    println("doooog")
    dog.Eat(2)
    dog.Woof()
    dog.Sit()
    
    val a = 1
    
    if (a == 0) {
      dog.Woof()
    } else {
      cat.Meow()
    }
    
    var b = List(1,2,3,4,5)
    println(b)
    */
  
    /*
    var a = 10
    println(a)    
    
    val sayHello =Future {
      Thread.sleep(1000)
      a= 0
      "hello"
    }
    
    sayHello onSuccess {
      case message =>
        println("he said '$message'")
    }
    
    println("waiting..")
    Thread.sleep(5000)
    println(a)
    */
    
    /*
    val tryDivideByZero = Future {
      Thread.sleep(1000)
      1/0
    }
    
    tryDivideByZero onFailure {
      case e: ArithmeticException => println("Don't be silly")
    }
    
    println("Try dividing by zero")
    Thread.sleep(2000)
    */
    
    /*
    val firstLove = Future {
      Thread.sleep(500)
      "I love you"
    }
    val thenBetray = firstLove map {
      case loveLetter => {
        println(loveLetter)
        Thread.sleep(500)
        "Not really"
      }
    }
    thenBetray onSuccess {
      case partingWords =>
        println(partingWords)
    }
    Thread.sleep(2000)
    */
    
    /*
    val calculateMyScore = Future {
      Thread.sleep(500)
      new Random().nextInt(10)
    }
    val calculateYourScore = Future {
      Thread.sleep(500)
      new Random().nextInt(10)
    }
    val doIWin = for {
      myScore <- calculateMyScore
      yourScore <- calculateYourScore
    } yield myScore > yourScore
    doIWin onSuccess{
      case b: Boolean =>
        println(if(b) "yes" else "no")
    }
    println("Do I win?")
    Thread.sleep(2000)
    */
    
    /*
    val a: List[ (Int, Int)] = List((1,2), (3,4), (3,6))
    for(i <- a)
      print(i)
     
      val b: List[Int] = a.map(tup => tup._1 + tup._2)
      for(j <- b)
        print(j)
      
      val c:List[Int] = a.par.map( tup => tup._1 + tup._2).toList
      for(k <- c)
        print(k)
        */
        
  }
}
*/


