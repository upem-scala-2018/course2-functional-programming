package fr.upem.course2

/**
  * Rappel: Les ADT servent pour la modélisation de la donnée de votre domaine (métier)
  * Type somme: Union de types, A ou B (A | B)
  * Type produit: A et B (A * B)
  */
object _5_ADT {

  // 5.1 Créer un type somme pour les composantes couleur (Red, Blue, Green)
  sealed trait Color
  case object Red
  case object Green
  case object Blue

  // 5.2 Créer un type produit pour un rectangle avec son hauteur et largeur

  // 5.3 Créer un type produit pour un cercle avec son rayon

  // 5.4 Combiner les deux types produits précedants dans un ADT
  sealed trait Shape
  case class Rectangle(height: Int, width: Int) extends Shape
  case class Circle(radius: Int) extends Shape


  // 5.5 L'ADT suivant décrit un simple DSL
  // Generaliser (GADT) l'ADT afin d'ajouter trois constructeur au langage: EPrtLn, ESucc et ECond
  // EAdd additionne les deux expression entières
  // ESucc retourne le successeur de l'expression entière (i + 1)
  // EPrtLn affiche l'expression String
  // ECond représente le if/else d'un langage de programmation, il a donc trois paramétres
  // - expression booléenne
  // - expression si vrai (le if)
  // - expression si faux (le else)
  sealed trait Expr[Int]
  case object Exit extends Expr[Nothing]
  case class EInt(a: Int) extends Expr[Int]
  case class EBool(a: Int) extends Expr[Boolean]
  case class EString(a: String) extends Expr[String]
  case class EAdd(lhs: Expr[Int], rhs: Expr[Int]) extends Expr[Int]
  case class ESucc(n: Expr[Int]) extends Expr[Int]
  case class EPrtLn(s: Expr[String]) extends Expr[Unit]
  case class ECond[A](b: Expr[Boolean], ifTrue: Expr[A], ifElse: Expr[A]) extends Expr[A]

}
