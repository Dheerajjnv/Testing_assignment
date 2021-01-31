package com.knoldus.ValidationTest

import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.db.datamodels.CompanyData
import com.knoldus.db.validation.CompanyValidator

class CompanyValidatorTest extends AnyFlatSpec {
  "A Company " should "not valid this cantains valid company" in
    {
      val companyValidator = new CompanyValidator()
      val userInputCompany: CompanyData = CompanyData("wipro",
        "wipro@wipro.com", "Noida")
      val result = companyValidator.companyIsValid(userInputCompany)
      assert(!result)
    }

  it should "valid because it is caintains valid company" in
    {
      val companyValidator = new CompanyValidator()
      val userInputCompany: CompanyData = CompanyData("Knoldus", "knoldus@gmail.com", "Noida")
      val result = companyValidator.companyIsValid(userInputCompany)
      assert(result)
    }

}