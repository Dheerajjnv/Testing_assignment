package com.knoldus
import com.knoldus.method.Factorial
import org.scalatest.flatspec.AnyFlatSpec

class Testfactorial extends AnyFlatSpec{
  val factorialcalculater = new Factorial()

  "factorial " should "equal to the expected result" in {
    assert(factorialcalculater.factorialCalculation(0) == 1)
    assert(factorialcalculater.factorialCalculation(1) == 1)
    assert(factorialcalculater.factorialCalculation(5) == 120)
  }

}
