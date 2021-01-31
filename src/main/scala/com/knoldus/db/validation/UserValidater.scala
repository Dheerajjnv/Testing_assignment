package com.knoldus.db.validation
import  com.knoldus.db.data.ReadCompany
import com.knoldus.db.datamodels.{CompanyData, UserData}


class UserValidator {
  def userIsValid(user: UserData): Boolean= {
    val database: ReadCompany = new ReadCompany()

    val dbResult: Option[CompanyData] = database.getCompanyByName(user.company)

    //email should be valid
    val emailDatabase: EmailValidator = new EmailValidator()
    val emailResult = emailDatabase.emailIdIsValid(user.emailId)

    if (dbResult.isDefined && emailResult)  true

    else false
  }
}