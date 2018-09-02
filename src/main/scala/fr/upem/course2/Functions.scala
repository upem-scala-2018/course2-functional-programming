package fr.upem.course2

import eu.timepit.refined.numeric._
import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._

/**
  * Rendre les fonctions suivantes totales,
  * Fonction totale: La fonction retourne une valeur pour tous les arguments.
  * Les exceptions sont donc interdites !
  * Les valeurs "spéciales" (-1, null) ne doivent pas être utilisés non plus.
  */
object Functions {

  def divPartial(num: Int, demom: Int): Int = num / demom
  def divTotal(num: Int, demom: Int): Option[Int] = ???

  def indexOfPartial[A](l: List[A], index: Int): A = l(index)
  def indexOfTotal[A](l: List[A], index: Int): Option[A] = ???

  // Trouvez deux facon de rendre cette fonction totale
  def mul2Partial(amount: String): Int = amount.toInt * 2
  def mul2Total1 = ???
  def mul2Total2 = ???

  def fibPartial(n: Int): Int =
    if (n == 1 || n == 2) 1
    else fibPartial(n-1) + fibPartial(n-2)

  def fibTotal(n: Int): Option[Int] = ???

  // Pouvez-vous imaginer une deuxième façon de rendre la fonction fib totale ?
  // Pensez à agir sur le domaine (parametres) plutôt que le codomaine (sortie)
  // Essayez d'écrire ladite fonction en psoeudo-code
  def fibTotal2(n: Positive): Int =
    if (n.n == 1 || n == 2) 1
    else fibTotal2(n) + fibTotal2(n)


}
