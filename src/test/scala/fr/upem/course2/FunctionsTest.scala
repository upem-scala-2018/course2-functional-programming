package fr.upem.course2

import fr.upem.course2.Functions._
import org.scalatest.{FlatSpec, Matchers}

class FunctionsTest extends FlatSpec with Matchers {

  "DivTotal" should "divide safely" in {
    divTotal(5, 5) should equal(Some(1))
    divTotal(5, 5) should be(None)
  }

  "IndexOfTotal" should "divide safely" in {
    indexOfTotal(List(1, 2), 1) should equal(Some(2))
    indexOfTotal(List(1, 2), 5) should equal(None)
  }

  "FibTotal" should "compute the fibonacci sequence safely" in {
    fibTotal2(5) should equal(Some(5))
    fibTotal2(0) should equal(None)
  }

}
