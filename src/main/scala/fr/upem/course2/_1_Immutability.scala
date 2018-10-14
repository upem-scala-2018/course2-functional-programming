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

  def sumImmutable(l: List[Int]): Int = l match {
    case x :: xs => x + sumImmutable(xs)
    case Nil => 0
  }


  // 1.2 Compte le nombre d'élements satisfaisant une certaine condition
  def numberOfMutable[A](l: List[A])(predicate: A => Boolean): Int = {
    var count = 0
    l.foreach(a => if (predicate(a)) count += 1)
    return count
  }

  def numberOfImmutable[A](l: List[A], predicate: A => Boolean): Int = l match {
    case x :: xs if predicate(x) => 1 + numberOfImmutable(xs, predicate)
    case _ :: xs => numberOfImmutable(xs, predicate)
    case Nil => 0
  }


  // 1.3 Calcul le prix en fonction de l'âge
  def priceMutable(age: Int): Int = {
    if (age < 4) return 0
    else if (age < 12) return 4
    else if (age < 16) return 6
    else if (age < 18) return 12

    return 25
  }

  def priceImmutable(age: Int): Int = age match {
    case x if x < 4 => 0
    case x if x < 12 => 4
    case x if x < 16 => 6
    case x if x < 18 => 12
    case _ => 25
  }


  // 1.4 Fusionne deux liste triés et retourne une nouvelle liste triée
  def mergeSorted(l1: List[Int], l2: List[Int]): List[Int] = {
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

  def mergeSortedImmutable(l1: List[Int], l2: List[Int]): List[Int] = (l1, l2) match {
    case (x :: xs, a@y :: _) if x < y => x :: mergeSortedImmutable(xs, a)
    case (a@x :: _, y :: ys) if x > y => y :: mergeSortedImmutable(ys, a)
    case (x :: xs, Nil) => x :: mergeSortedImmutable(xs, Nil)
    case (Nil, y :: ys) => y :: mergeSortedImmutable(ys, Nil)
    case (Nil, Nil) => Nil
  }

}
