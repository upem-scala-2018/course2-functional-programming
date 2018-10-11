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


}
