package com.knoldus.data

class CheckPassword {
  def passwordValidation(password:String):Boolean = {
    if (password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[*&^%$#@!\\?]).{8,15}")
      && !password.matches(".*\\s.*"))
      true
    else
      false
  }
}