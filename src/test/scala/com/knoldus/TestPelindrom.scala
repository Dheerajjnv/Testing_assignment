package com.knoldus
import com.knoldus.method.Pelindrom
import org.scalatest.flatspec.AnyFlatSpec

class TestPelindrom extends AnyFlatSpec{
    val pelindroms = new Pelindrom()

    "pelindrom " should "equal to the reverse of number" in{
      var values = true
      assert(values,pelindroms.checkpelindrom(121))

}}
