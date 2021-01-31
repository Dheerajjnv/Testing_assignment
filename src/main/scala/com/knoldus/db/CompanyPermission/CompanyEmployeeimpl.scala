package com.knoldus.db.CompanyPermission
import com.knoldus.db.datamodels.CompanyEmployee
import com.knoldus.db.validation.EmployeeValidater

class EmployeeImpl(employeeValidator: EmployeeValidater) {

  def createEmployee(employee: CompanyEmployee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee)) Option(employee.emailId)
    else None
  }
}