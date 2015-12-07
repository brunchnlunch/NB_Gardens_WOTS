

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.OptionValues
import org.scalatest.Inside
import org.scalatest.Inspectors

class TestSystem extends FlatSpec with Matchers with OptionValues with Inside with Inspectors{
  
  //Customer buying process
  
  def TestFindItemLocation() {
    "a location" should "give the location of the selected item" in{
      var Location = System.FindLocation("ItemName")
      var ExpectedListSize = 5
      assert(ExpectedListSize == Location.length)
    }
  } 
  //I.e. Location is a list of 5 numbers: Section 1 of the the warehouse, Row 3 of section 1, column 4 of row 3...
  
  def TestFindOptimalBox() {
    "a box" should "be the right size" in{
      var BoxVolume = System.FindOptimalBox("OrderList")
      var TotalOrderVolume = 0
      for (i <- 0 until OrderList.length) {
        TotalOrderVolume += OrderList(i).Volume
      }
      assert(BoxVolume >= TotalOrderVolume)
    }
  }
 //Given an OrderList where each item on the list has a volume the total volume of the box is greater thant he total volume of all items
  
  def TestCourierInfo() {
    "CouerierDetails" should "have contact details for the courier" in{
      var CourierDetails = System.CouerierInfo()
      CourierDetails.toString
      assert(CourierDetails.length == 11)
    }
  }
  //I.e. CourierDetails is a 11 digit phone number
  
  def TestOrderSent() {
    "The system" should "store given infromation" and "notify accounts" in{
      System.OrderSent("OrderInformation")
    }
  }
  
  //Checking damages/missing items process ---------------------
  
  def TestDamagedStock() {
    "The system" should "store given information" in{
      var OriginalQuantity = StockDatabase.Quantity("StockName")
      System.DamagedStock("StockName")
      var ExpectedQuantity = OriginalQuantity - 1
      var Quantity = StockDatabase.Quantity("StockName")
      assert(ExpectedQuantity = Quantity)
    }
  }
  //reporting a damaged item should decrement the quantity of that item by 1 in the Stock database
}
