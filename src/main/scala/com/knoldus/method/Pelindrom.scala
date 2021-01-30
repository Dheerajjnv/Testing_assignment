package com.knoldus.method

case class Pelindrom() {
  def checkpelindrom(number: Int): Boolean = {
    var num = number
    var reversedInteger = 0
    var remainder = 0
    val originalInteger = num
    while (num != 0) {
      remainder = num % 10
      reversedInteger = reversedInteger * 10 + remainder
      num /= 10
    }
    if (originalInteger == reversedInteger) {
      println("Number is pelindrom")
    }
    return true
  };
}

