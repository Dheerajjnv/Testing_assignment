package com.knoldus.db.datamodels

import com.knoldus.db.Company

import scala.collection.immutable.HashMap

class CompanyData {
  val knoldusCompany: Company = new Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = new Company("Philips", "philips123@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Philips" -> philipsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
