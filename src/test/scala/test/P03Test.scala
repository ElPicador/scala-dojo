package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P03Test extends FlatSpec with ShouldMatchers {

  it should "return first element given a list with one element" in {
    val list = List(1)
    P03.nth(0,list) should be(1)
  }
 
  it should "return second element given a list with 2 element" in {
    val list = List(1,2)
    P03.nth(1,list) should be(2)
  }
  
  it should "return second element given a list with 3 element" in {
    val list = List(1, 2, 3)
    P03.nth(2,list) should be(3)
  }
  
  it should "return second element given a list with 3 element for nth2" in {
    val list = List(1, 2, 3)
    P03.nth2(2,list) should be(3)    
  }
 
}