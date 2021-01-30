

package com.knoldus
import com.knoldus.method.Factorial
import org.scalatest.flatspec.AnyFlatSpec


class Factorialspec extends AnyFlatSpec {

  "Factorial" should "equal to result" in {
    val answer: Int = new Factorial().factorialCalculation(5)
  }
  assert(answer == 120)
it should "produce NoSuchElementException when head is invoked" in {
  assertThrows[NoSuchElementException] {
  (answer.factorialCalculation(5)!=120)
}}
}



