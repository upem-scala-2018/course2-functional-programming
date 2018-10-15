package fr.upem.course2

import fr.upem.course2._1_Immutability._
import org.scalatest.{FlatSpec, Matchers}

class _1_ImmutabilityTest extends FlatSpec with Matchers {

  "Sum" should "compute the sum of given integers" in {
    sumImmutable(List(7, 3, 10, 1)) should be(21)
  }

  "NumberOf" should "compute the sum of given integers" in {
    val isPair: Int => Boolean = i => (i % 2) == 0
    numberOfImmutable(List(7, 3, 10, 1), isPair) should be(1)
  }

  "MergeSorted" should "merge two sorted list into a sorted list" in {
    val sorted1 = List(10, 20, 30, 40)
    val sorted2 = List(9, 11, 12, 45)

    mergeSortedImmutable(sorted1, sorted2) should equal(List(9, 10, 11, 12, 20, 30, 40, 45))
  }

}
