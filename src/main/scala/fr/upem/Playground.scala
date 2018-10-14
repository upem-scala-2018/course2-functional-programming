package fr.upem

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive
import eu.timepit.refined._

object Playground extends App {

  type PositiveInt = Refined[Int, Positive]

  def fib(n : PositiveInt): PositiveInt = {
    if(n.value == 1 || n.value == 2) refineMV(1)
    else fib(refineV(n.value - 1))
  }

  fib(refineMV(5))

}

