package fr.upem.course2

import org.scalatest.{FlatSpec, Matchers}
import _4_Curryfication._

class _4_CurryficationTest extends FlatSpec with Matchers {

  "4.2 Add5" should "add 5 to given argument" in {
    add5(2) should equal(7)
  }

  "4.3 Add3" should "add 3 to given argument" in {
    add3(2) should equal(5)
  }

  "4.5 KeepEvenNumbers" should "keep even numbers of given list" in {
    keepEvenNumbers(List(1, 2, 3, 4)) should equal(List(2, 4))
  }

}
