package com.knoldus

import com.knoldus.data.Person
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class TestPasscode extends AnyFlatSpec with Matchers{
  it should "let us check different parts of a string" in {
    val sample:String = new Person().passcode("User@9")
    sample should contain atLeastOneOf('@','!','$','%','#','*','&','~' )
    sample should contain atLeastOneOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    sample should contain atLeastOneOf('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
    sample should contain atLeastOneOf('0','1','2','3','4','5','6','7','8','9')
    sample should have length>=(8)
    sample should have length<=(15)
    sample should not contain(sample.isWhitespace)
  }
}