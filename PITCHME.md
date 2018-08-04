# Functional programming

---

# Un paradigme de programmation

---


# Imutabilité

---

# La fonction

- Totale
- Pure

---

## La fonction totale

```scala
def max(a: Int, b: Int) = if (a >= b) a else b
```

la fonction partielle
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

## Une expression 

---

## Des instructions

---

## Ambiguïtés de l'approche hybride


---


