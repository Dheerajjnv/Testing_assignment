package com.knoldus.PermissionTest

import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.db.datamodels.CompanyData
import com.knoldus.db.validation.CompanyValidator
import org.mockito.MockitoSugar.{when, mock}

class CompanyDataImplTest extends AnyFlatSpec {

  //unit Test Cases
  "A CompanyImpl" should "create company because not exist in db" in{
    val testCompany: CompanyData = Company("Dell","dell@gmail.com","Pune")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn(true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result==Option(testCompany.name))
  }
  "it" should "not create company because exist in db" in{
    val testCompany: CompanyData = CompanyData("Knoldus", "knoldus@gmail.com", "Noida")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn(true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result == Option(testCompany.name))
  }

}