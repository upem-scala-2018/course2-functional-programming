package fr.upem.course2

import scala.collection.mutable.ListBuffer

/**
  * Écrire les versions immuables des programmes suivant.
  * Aucune réassignation ou mutation n'est autorisée
  * Autrement-dit, ne pas utiliser de "var" ni de structures mutables (comme scala.collection.mutable.*)
  */
object _1_Immutability {

  // 1.1 Calcul de la comme des entier passés en argument
  def sumMutable(l: List[Int]): Int = {
    var sum = 0
    l.foreach(i => sum += i)
    return sum
  }

  def sumImmutable(l: List[Int]): Int = ???


  // 1.2 Compte le nombre d'élements satisfaisant une certaine condition
  def numberOfMutable[A](l: List[A], predicate: A => Boolean): Int = {
    var count = 0
    l.foreach(a => if (predicate(a)) count += 1)
    return count
  }

  def numberOfImmutable[A](l: List[A], predicate: A => Boolean): Int = ???


  // 1.3 Fusionne deux liste triés et retourne une nouvelle liste triée
  def mergeSortedMutable(l1: List[Int], l2: List[Int]): List[Int] = {
    var result = new ListBuffer[Int]
    var rest1 = ListBuffer.concat(l1)
    var rest2 = ListBuffer.concat(l2)

    var totalSize = l1.length + l2.length
    var i = 0

    while (i < totalSize) {
      if (rest1.isEmpty && rest2.isEmpty)
        return result.toList

      if (rest1.isEmpty) {
        result.append(rest2.head)
        rest2 = rest2.tail
      }
      else if (rest2.isEmpty) {
        result.append(rest1.head)
        rest1 = rest1.tail
      }
      else if (rest1.head < rest2.head) {
        result.append(rest1.head)
        rest1 = rest1.tail
      }
      else {
        result.append(rest2.head)
        rest2 = rest2.tail
      }
      i += 1
    }

    return result.toList
  }
  def mergeSortedImmutable(l1: List[Int], l2: List[Int]): List[Int] = ???

}
