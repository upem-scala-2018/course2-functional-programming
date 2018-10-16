package fr.upem.course2

/**
  * Rappel:
  * Une fonction currifiée est une fonction a un argument (qui retourne éventuellement
  * d'autres fonctions a un argument)
  * Une fonction partiellement appliquée est une fonction dont un ou plusieurs arguments
  * ont été "fixés"
  */
object _4_Curryfication {

  // 4.1 Currifiez la fonction add
  def add(a: Int, b: Int): Int = a + b
  val addValueFunction: (Int, Int) => Int = add

  // Créer une méthode currifiée
  def addCurriedMethod(a: Int)(b: Int) = a + b

  // Créer une value function currifiée
  lazy val addCurriedValueFunction = (a: Int) => (b: Int) => a + b
  // Créer une value function currifiée (en utilisant la méthode "curried" définie sur FunctionN) à partir de addValueFunction
  lazy val addCurriedStdLib = ((a: Int, b: Int) => a + b).curried


  // 4.2 Appliquer partiellement la fonction addCurriedValueFunction précédente
  lazy val add5: Int => Int = addCurriedValueFunction(5)

  // 4.3 Appliquer partiellement la méthode add précédente
  lazy val add3: Int => Int = add(3, _)

  // 4.4 Currifiez la fonction filter
  def filter[A](l: List[A], pred: A => Boolean): List[A] =
    l match {
      case Nil => Nil
      case h :: t if pred(h) => h :: filter(t, pred)
      case _ :: t => filter(t, pred)
    }

  def filterCurried[A](l: List[A])(pred: A => Boolean) = filter(l, pred)

  // 4.5 Appliquer partiellement la méthode filter (fixer le prédicat avec isEven)
  def isEven(i: Int): Boolean = i % 2 == 0

  lazy val keepEvenNumbers: List[Int] => List[Int] = l => l.filter(isEven)

}
