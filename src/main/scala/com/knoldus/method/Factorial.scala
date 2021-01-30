package com.knoldus.method

class Factorial {
  def factorialCalculation(n: Int): Int = {

    var f = 1
    for(i <- 1 to n)
    {
      f = f * i
    }

    return f
  }

}
