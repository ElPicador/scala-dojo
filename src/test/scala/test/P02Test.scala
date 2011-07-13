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
    
  it should "return 3 if the given list is (3,2)" in {
    val sut = new P02
    sut.penultimate(List(3,2)) should equal (3)
  }
  it should "return 3 if the given list is (1,2,3,2)" in {
     val sut = new P02
     sut.penultimate(List(1,2,3,2)) should equal (3)
   }
}