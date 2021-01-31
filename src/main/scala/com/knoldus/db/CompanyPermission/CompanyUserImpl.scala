package com.knoldus.db.CompanyPermission

import com.knoldus.db.datamodels.CompanyUser
import com.knoldus.db.validation.UserValidater

class CompanyUserImpl(userValidator : UserValidater){

  def createUser(user: CompanyUser): Option[String] = {
    if (userValidator.userIsValid(user)) Option(user.emailId)
    else None
  }
}