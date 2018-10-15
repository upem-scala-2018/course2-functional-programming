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

  // 6.3 Calcul le prix en fonction de l'âge
  def priceMutable(age: Int): Int = {
    if (age < 4) return 0
    else if (age < 12) return 4
    else if (age < 16) return 6
    else if (age < 18) return 12

    return 25
  }


}
