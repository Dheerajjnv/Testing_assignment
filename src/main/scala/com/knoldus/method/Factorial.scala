package com.knoldus.method

class Factorial {
  def factorialCalculation(n: Int): Int = {
    if (n == 0) 1
    else factorialCalculation(n - 1) * n
  }
}