package com.knoldus.db.validation
import com.knoldus.db.data.ReadCompany
import com.knoldus.db.datamodels.CompanyData

class CompanyValidator {

  def companyIsValid(company: CompanyData): Boolean =
  {
    //company name is exist or not
    val companyResult = new ReadCompany()
    val dbResult: Option[Company] = companyResult.getCompanyByName(company.name)
    //emailValidation
    val emailValid = new EmailValidator()

    val emailValidResult = emailValid.emailIdIsValid(company.emailId)

    if(emailValidResult && dbResult.isDefined)
      return true
    false
  }

}