# La programmation fonctionelle

---

# Un paradigme de programmation

Une approche/façon de programmer

- La programmation orienté objet
- La programmation impérative
- La programmation fonctionelle

---

## Régles et objectifs du paradigme


---

# Immuabilité

La déclaration de variables est définitive.
On peut apparenter cela à une équation mathématique.
```
val n = 5
```

Cela s'oppose à l'assignation/réasignation de la programmation impérative
```
var n = 5
n = 6
```

Le symbole *=* sert à la *déclaration*, oubliez l'assignation intrinsequement impérative.

---

# La fonction

Penser à la fonction mathématique avec les propriétés suivantes:
- Totale
- Pure

*⚠* Ca n'est pas simplement une fonction au sens programmation! *⚠*

---

## La fonction totale

Une fonction est dite totale si elle admet, pour toute valeur du 
domaine un valeur du codomaine.

En maths: ℤ => ℤ
En programmation: Int => Int

En maths: ℤ => ℕ
En programmation: Int => ???

---

## La fonction totale

```scala
def max(a: Int, b: Int) = if (a >= b) a else b
```

la fonction partielle (bottom element/Nothing)
```scala
def partial(unit: String) = 
  if (unit == "kilo") 1000
  else if (unit == "mega") 1000000
  else throw new IllegalArgumentException("Unkown unit")
```

```scala
def fib(n: Int): Int = 
  if (n == 0 || n == 1) 1 
  else fib(n-1) + fib(n-2)
```

---

### Fonctions partielles connues

```scala
myList.head
myList.reduce(_ + _)
myCollection.get(5)
myString.indexOf()
Math.sqrt
Math.div
```

---

## Fonctions totales et types primitifs

Contrairement aux mathematiques il n'est pas possible de directement
restreindre le domaine d'une fonction.
Les briques de bases en programmation sont les types primitifs (Int, Boolean).

Exemple: 
Pour tout n >= 1, Fib(n) = Fib(n-1) + Fib(n-2)
def fib(n: ???) = fib(n-1) + fib(n-2)

---

### Modification du codomaine

Au lieu de restreindre le domaine, on étend le codomaine

```scala
def fib(n: Int): Option[Int] = ???
```

---

### Modification du domaine

```scala
def fib(n: PositiveInteger): Int = ???
```

---

## La fonction pure
```scala
def add(a: Int, b: Int) = a + b
```

la fonction impure (utilisation d'un état)
```scala
def add(a: Int, b: Int) = a + b + globalVar
```

la fonction impure (effet de bord)
```scala
def add(a: Int, b: Int) = {
  writeFile("log.txt")
  a + b
}
```

---

### Définition effet de bord
Une fonction est dite à effet de bord si elle a 
une interaction *observable* avec le monde exterieur autre que 
sa valeur de retour.

---

## Fonction d'ordre supérieur

---

## Curryfication

```
def add(n: Int)(m: Int) = n + m
```

---

## Application partielle
L'application partielle est le dual de la curryfication.

Appliquer partiellement une fonction currifiée
```
def add5 = add(5)
```

En scala il est aussi possible de :
Appliquer partiellement une fonction non currifiée
```
def add5 = add(5, _)
```
Appliquer partiellement les paramètre non linéairement
```
def add5 = add(_, 5)
def add5 = add(_)(5)
```

---

# Expressions vs instructions

Les instructions sont des *commandes* et sont donc à proscrire (impératif)
```
if (cond)
    return "yes"
else
    return "no"
```

Les expression décrivent une valeur
```
if (cond) "yes" else "no"
``` 

---

## Programmation déclarative et impérative

---

## Une expression 

---

## Des instructions

---

## Ambiguïtés de l'approche hybride


---

# Algebraic Data Types (ADT)

Les types de données algébriques sont une union de produits.

Type union
```
data Bool = True | False
Bool peut prendre les valeurs True *ou* False
complexité du type = 2
```

Type produit
```
data Point = P Int Int Bool
P peut pendre toutes les combinaison de Int et Int et Bool
complexité du type = Int * Int * Bool
```

En scala
```
sealed trait Tree
case object Empty extends Tree
case class Node(v: Int) extends Tree
case class Branch(left: Tree, right: Tree, v: Int) extends Tree
```

---

# Generalized Algebraic Data Types (GADT)

---

# A retenir

Functions mathématiques (*totales* et *pure*)
Utilisation d'expressions
Des ADT pour la modélisation de données

