package fr.upem.course2

/**
  * Transformer les fonctions suivantes pour utiliser une approche déclarative plutôt
  * qu'une approche impérative
  */
object _6_DeclarativeProgramming {

  // 6.1 Utilisez une approche déclarative
  def cond(boolean: Boolean): String = {
    if (boolean) {
      return "true";
    }
    else {
      return "false";
    }
  }
  def condDecl(boolean: Boolean): String = if (boolean) "true" else "false"

  // 6.2 Utilisez la récursivité pour éviter l'approche impérative
  def countEvenNumbers(l: List[Int]): Int = {
    var i = 0;
    var count = 0;
    while (i < l.length) {
      if (l(i) % 2 == 0)
        count = count + 1;
      i = i + 1
    }
    return count;
  }
  def countEvenNumbersDecl(l: List[Int]): Int = l match {
    case x :: xs if x % 2 == 0 => 1 + countEvenNumbersDecl(xs)
    case _ :: xs => countEvenNumbersDecl(xs)
    case Nil => 0
  }

  // 6.3 Utilisez une approche déclarative
  def price(age: Int): Int = {
    if (age < 4) return 0
    else if (age < 12) return 4
    else if (age < 16) return 6
    else if (age < 18) return 12

    return 25
  }
  def priceDecl(age: Int): Int = age match {
    case x if x < 4 => 0
    case x if x < 12 => 4
    case x if x < 16 => 6
    case x if x < 18 => 12
    case _ => 25
  }

}
