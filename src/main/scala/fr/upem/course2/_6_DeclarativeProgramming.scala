package fr.upem.course2

/**
  * Transformer les fonctions suivantes pour utiliser une approche déclarative plutôt
  * qu'une approche impérative
  */
object _6_DeclarativeProgramming {

  // 6.1 Utilisez une approche déclarative
  def cond(boolean: Boolean): String = if (boolean) "true" else "false"

  // 6.2 Utilisez la récursivité pour éviter l'approche impérative
  def countEvenNumbers(l: List[Int]): Int = l match {
    case x :: xs if x % 2 == 0 => 1 + countEvenNumbers(xs)
    case _ :: xs => countEvenNumbers(xs)
    case Nil => 0
  }


}
