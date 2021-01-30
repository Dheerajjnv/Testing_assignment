package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.data.CheckPassword


class Testpassword extends AnyFlatSpec{
  val passcode = new CheckPassword()
  "passcode will be valid if " should "not contain any whitespace" in{
    var results = true
    assert(results,passcode.passwordValidation("User@9"))
  }
}
