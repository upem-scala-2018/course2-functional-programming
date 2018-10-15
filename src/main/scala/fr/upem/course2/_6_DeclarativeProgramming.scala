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

  // 6.3 Calcul le prix en fonction de l'âge
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

}
