package com.knoldus.PermissionTest

import com.knoldus.db.datamodels.UserData
import com.knoldus.db.validation.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.mockito.MockitoSugar.{when,mock}
class UserDataImplTest extends AnyFlatSpec {
  //unit test for user

  "A UserImpl" should "create User because not exist in db" in{

    val newUser = UserData("Sonu","Kumar","Knoldus","sonuraj1926@gmail.com")
    val mockuserValidator = mock[UserValidator]
    when(mockuserValidator.userIsValid((newUser))) thenReturn(true)

    val userImpl = new UserImpl(mockuserValidator)
    var result = userImpl.createUser(newUser)

    assert(result==Option(newUser.emailId))
  }
  it should "not create User because emaild is not valid" in{

    val newUser = User("Varun ","Singh","varunsinghgmail.com","knoldus")
    val mockuserValidator = mock[UserValidator]
    when(mockuserValidator.userIsValid((newUser))) thenReturn(false)

    val userImpl = new UserImpl(mockuserValidator)
    var result = userImpl.createUser(newUser)

    assert(result == None)
  }
}
