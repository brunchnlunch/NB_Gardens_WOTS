

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.OptionValues
import org.scalatest.Inside
import org.scalatest.Inspectors

class TestHelloWorld extends FlatSpec with Matchers with OptionValues with Inside with Inspectors{
  def tesGreeting() {
    "a greeting" should "greet the user" in{
      HelloWorld.greeting("Charlie");
    }
  }
}