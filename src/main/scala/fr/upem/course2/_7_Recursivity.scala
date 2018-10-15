package fr.upem.course2

/**
  * Utilisez la récursivité pour résourdre les exercices suivants
  */
object _7_Recursivity {

  sealed trait Tree[+A]
  case object Leaf extends Tree[Nothing]
  case class Branch[A](l: Tree[A], r: Tree[A], value: A) extends Tree[A]

  def sumTree(tree: Tree[Int]): Int = ???

  def countChars(tree: Tree[String]): Int = ???

  def factorial(n: Int): Option[Int] = ???

  // Implémenter indexOf SANS utiliser l(index)
  def indexOf[A](l: List[A], index: Int): Option[A] = ???

  // Créer une liste de length élements
  def fillList[A](length: Int, a: A): List[A] = ???

}
