package com.knoldus

import com.knoldus.method.Pelindrom
import org.scalatest.flatspec.AnyFlatSpec


class Pelindromspec extends AnyFlatSpec {
  "pelindorm" should "equal to result" in {
    val res:Int= new Pelindrom.checkpelindrom(121)
    assert(res == 121)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      (res != 121)

    }
  }
}