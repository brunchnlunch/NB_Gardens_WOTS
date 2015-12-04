

object HelloWorld {
  def main(args: Array[String]) {
   greeting("Charlie")
  }
  
  def greeting(name: String) {
     println("hello, " + name + "!")
  }
  
}