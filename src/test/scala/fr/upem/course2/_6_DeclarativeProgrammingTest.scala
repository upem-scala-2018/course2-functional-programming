package fr.upem.course2

import fr.upem.course2._6_DeclarativeProgramming._
import org.scalatest.{FlatSpec, Matchers}

class _6_DeclarativeProgrammingTest extends FlatSpec with Matchers {

  "Cond" should "return boolean as string value" in {
    cond(true) should equal("true")
    cond(false) should equal("false")

    condDecl(true) should equal("true")
    condDecl(false) should equal("false")
  }

  "CountEventNumber" should "count event numbers" in {
    countEvenNumbers(List(2, 2, 3)) should equal(2)
    countEvenNumbersDecl(List(2, 2, 3)) should equal(2)
  }

  "Price" should "return a price for the given age" in {
    price(2) should be(0)
    price(19) should be(25)
    priceDecl(2) should be(0)
    priceDecl(19) should be(25)
  }

}
