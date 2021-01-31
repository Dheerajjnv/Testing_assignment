package com.knoldus.db.data

import com.knoldus.db.datamodels.CompanyData

import scala.collection.immutable.HashMap

class ReadCompany{

  val knoldusCompany: CompanyData = CompanyData ("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: CompanyData = CompanyData("Philips", "philips123@gmail.com", "Noida")
  val companies: HashMap[String, CompanyData] = HashMap("Knoldus" -> knoldusCompany, "Philips" -> philipsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}