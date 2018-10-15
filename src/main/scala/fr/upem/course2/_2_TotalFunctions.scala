package fr.upem.course2

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive
import eu.timepit.refined._

import scala.util.Try

/**
  * Rendre les fonctions suivantes totales,
  * Fonction totale: La fonction retourne une valeur pour tous les arguments.
  * Les exceptions sont donc interdites !
  * Les valeurs "spéciales" (-1, null) ne doivent pas être utilisés non plus.
  */
object _2_TotalFunctions {

  // 2.1 Rendre la fonction divPartial totale
  def divPartial(num: Int, demom: Int): Int = num / demom
  def divTotal(num: Int, demom: Int): Option[Int] = if (demom == 0) None else Some(num / demom)

  // 2.2 Rendre la fonction indexOf totale
  def indexOfPartial[A](l: List[A], index: Int): A = l(index)
  def indexOfTotal[A](l: List[A], index: Int): Option[A] = if(index > l.length) None else Some(l(index))

  // 2.3 Trouvez deux facon de rendre cette fonction totale
  def mul2Partial(amount: String): Int = amount.toInt * 2
  def mul2Total1(amount: String): Try[Int] = Try(amount.toInt).map(_ * 2)
  def mul2Total2(amount: Int): Int = amount * 2

  // 2.4 Rendre la fonction fib totale
  def fibPartial(n: Int): Int =
    if (n == 1 || n == 2) 1
    else fibPartial(n-1) + fibPartial(n-2)

  def fibTotal(n: Int): Option[Int] = if (n < 1) None else Some(fibPartial(n))

  // 2.5 (difficile)
  // De la même façon que pour la question 2.3, pouvez-vous imaginer une deuxième façon de rendre la fonction fib totale ?
  // Pensez à agir sur le domaine (parametres) plutôt que le codomaine (sortie)
  // Essayez d'écrire ladite fonction en psoeudo-code et si possible en utilisant
  // Refined: https://github.com/fthomas/refined
 def fibTotalRefined(a: Any): Any = ???

  // 2.6 Écrivez une fonction totale en réutilisant la fonction partielle
  def parsePartial: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case "three" => 3
  }

  def parseTotal: Function[String, Option[Int]] = parsePartial.lift

}
