package com.knoldus.ValidationTest

package com.knoldus.db.validation.EmailValidater
import org.scalatest.flatspec.AnyFlatSpec
class EmailValidatorTest extends AnyFlatSpec {

  "An email " should "be Valid " in
    {
      val emailvalidator = new EmailValidater()
      val result = emailvalidator.EmailValidater("bulbulmishrajnv@gmail.com")
      assert(result)
    }
  it should "be not valid " in
    {
      val emailvalidator = new EmailValidater()

      val result = emailvalidator.EmailValidater("bulbulmishra/jnv@gmail.com")

      assert(!result)
    }
}
