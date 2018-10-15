package fr.upem.course2

/**
  * Utilisez la récursivité pour résourdre les exercices suivants
  */
object _7_Recursivity {

  sealed trait Tree[+A]

  case object Leaf extends Tree[Nothing]

  case class Branch[A](l: Tree[A], r: Tree[A], value: A) extends Tree[A]

  def sumTree(tree: Tree[Int]): Int =
    tree match {
      case Leaf => 0
      case Branch(l, r, v) => v + sumTree(l) + sumTree(r)
    }

  def countChars(tree: Tree[String]): Int =
    tree match {
      case Leaf => 0
      case Branch(l, r, v) => v.length + countChars(l) + countChars(r)
    }

  def factorial(n: Int): Option[Int] =
    if (n < 0)
      None
    else if (n == 0)
      Some(1)
    else
      factorial(n - 1).map(fact => n * fact)

  // Implémenter indexOf SANS utiliser l(index)
  def indexOf[A](l: List[A], index: Int): Option[A] =
    l match {
      case Nil => None
      case h :: t if index == 0 => Some(h)
      case _ :: t => indexOf(t, index - 1)
    }

  // Créer une liste de length élements
  def fillList[A](length: Int, a: A): List[A] =
    if (length > 0)
      a :: fillList(length - 1, a)
    else
      Nil

}
