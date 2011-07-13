package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P03Test extends FlatSpec with ShouldMatchers {

  it should "return 1 when n is 0 and list is (1)" in {
    val maListe = List(1)
    P03.nth(0, maListe) should equal (1)
  }
  
  it should "return 1 when n is 1 and list is (2, 1)" in {
    val maListe = List(2, 1)
    P03.nth(1, maListe) should equal (1)
  }
  
  it should "cast exception if n too big" in {
    val maListe = List()
    try{
      P03.nth(42, maListe)
      true should equal (false)
    } catch {
      case _ => true should equal (true)
    }
  }
  
}