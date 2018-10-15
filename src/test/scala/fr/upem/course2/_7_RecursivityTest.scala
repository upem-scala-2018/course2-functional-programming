package fr.upem.course2

import fr.upem.course2._7_Recursivity._
import org.scalatest.{FlatSpec, FunSuite, Matchers}

class _7_RecursivityTest extends FlatSpec with Matchers {

  "SumTree" should "sum tree" in {
    val tree = Branch(Branch(Leaf, Branch(Leaf, Leaf, 2), 3), Leaf, 5)

    sumTree(tree) should equal(10)
  }

  it should "sum empty tree" in {
    val tree = Leaf

    sumTree(tree) should equal(0)
  }

  "CountChars" should "count characters all string in the tree" in {
    val tree = Branch(Branch(Leaf, Branch(Leaf, Leaf, "a"), "abc"), Leaf, "ab")

    countChars(tree) should equal(6)
  }

  it should "count characters of empty tree" in {
    val tree = Leaf

    countChars(tree) should equal(0)
  }

  "Factorial" should "compute factorial" in {
    factorial(0) should equal(Some(1))
    factorial(5) should equal(Some(120))
  }

  it should "return None for negative numbers" in {
    factorial(-1) should equal(None)
  }

  "IndexOf" should "return element at given index" in {
    indexOf(List(1, 2, 3, 4), 2) should equal(Some(3))
  }

  it should "return non for out-of-range index" in {
    indexOf(List(1, 2), 5) should equal(None)
  }

  it should "return non for out-of-range (negative) index" in {
    indexOf(List(1, 2), -3) should equal(None)
  }

  "FillList" should "create list of given length" in {
    fillList(4, "a") should equal(List("a", "a", "a", "a"))
  }

  it should "create empty list for negative length" in {
    fillList(-1, "a") should equal(Nil)
  }

}
