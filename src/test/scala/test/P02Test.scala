package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P02Test extends FlatSpec with ShouldMatchers {
  
  it should "return none when giving empty list" in {
    val list = List()
    P02.penultimate(list) should be (None)
  }
  
  it should "return the only element of a list with one element" in {
    val list = List("1")
    P02.penultimate(list) should be (Some("1"))
  }
  
  it should "return the penultimate element of a list" in {
    val list = List("1","2")
    P02.penultimate(list) should be (Some("1"))
  }
  
  it should "return the penultimate element of a list with 3 elements" in {
    val list = List("1","2", "3")
    P02.penultimate(list) should be (Some("2"))
  }
  
    
}