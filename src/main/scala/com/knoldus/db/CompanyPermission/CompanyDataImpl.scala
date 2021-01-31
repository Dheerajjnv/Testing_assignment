package com.knoldus.db.CompanyPermission
import com.knoldus.db.datamodels.CompanyData
import com.knoldus.db.validation.CompanyValidator

class CompanyUserImpl(companyValidator: CompanyValidator) {

  def createCompany(company: CompanyData): Option[String] = {
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}
