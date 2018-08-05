# Functional programming

---

# Un paradigme de programmation

---

## Régles et objectifs du paradigme


---

# Immuabilité

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

---

## Application partielle

---

# Expressions vs instructions

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


---

# Generalized Algebraic Data Types (GADT)

---

# A retenir

Functions mathématiques (*totales* et *pure*)

