package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P01Test extends FlatSpec with ShouldMatchers {
   
   it should "get the last element of a non-empty list returns 1" in {
     val list = List(1)
     P01.last(list) should equal (1)
   }
   
   it should "get the last element of a non-empty list returns 3" in {
     val list = List(3)
     P01.last(list) should equal (3)
   }

   it should "get the last element of a non-empty list" in {
     val list = List(1, 2, 3)
     P01.last(list) should equal (3)
   }
   
   it should "check property" in {
     check( Prop.forAll { list: List[Int] => (list.length > 0) ==> (P01.last(list) == list.last) } )
     check( Prop.forAll { list: List[String] => (list.length > 0) ==> (list.contains(P01.last(list))) })
   }
   
   // it should "return Nil if the list is Nil" in {
   //   val list = Nil
   //   P01.last(Nil) should equal (Nil)
   // }
}