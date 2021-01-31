package com.knoldus.ValidationTest

import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.db.datamodels.UserData
class UserValidationTest extends AnyFlatSpec {
  val userValidator: UserValidator = new UserValidator()
  behavior of "this user"

  it should "be valid as its company exist in database and the email id is also valid" in {
    val newUser: User = User("Bulbul","Mishra","Knoldus","bulbulmishrajnv@gmail.com")
    assert(userValidator.userIsValid(newUser))
  }

  it should "not be valid as its company exist in database and the emailid is the also not valid" in
    {
      val newUser = UserData("Dheeraj","Mishra","Accenture","Dheerajmishragmail.com")
      assert(!userValidator.userIsValid(newUser))
    }

}