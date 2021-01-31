package com.knoldus.db.validation
import com.knoldus.db.Company
import com.knoldus.db.datamodels.{CompanyData, CompanyUser}
class UserValidater{
  def userIsValid(user: CompanyUser): Boolean= {
    val database: Company = new Company()

    val dbResult: Option[Company] = database.getCompanyByName(user.CompanyData)

    //email should be valid
    val emailDatabase: EmailValidator = new EmailValidator()
    val emailResult = emailDatabase.emailIdIsValid(user.emailId)

    if (dbResult.isDefined && emailResult)  true

    else false
  }
}
