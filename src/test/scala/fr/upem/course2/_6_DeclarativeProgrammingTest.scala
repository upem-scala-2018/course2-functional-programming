package fr.upem.course2

import org.scalatest.{FlatSpec, Matchers}

class _6_DeclarativeProgrammingTest extends FlatSpec with Matchers {

  "Cond" should "return boolean as string value" in {
    _6_DeclarativeProgramming.cond(true) should equal("true")
    _6_DeclarativeProgramming.cond(false) should equal("false")
  }

  "CountEventNumber" should "count event numbers" in {
    _6_DeclarativeProgramming.countEvenNumbers(List(2, 2, 3)) should equal(2)
  }

}
