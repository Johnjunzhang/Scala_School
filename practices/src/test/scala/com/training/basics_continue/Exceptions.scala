package com.training.basics_continue

import org.junit.runner.RunWith
import org.scalatest.{Matchers, FunSpec}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Exceptions extends FunSpec with Matchers{
  describe("Exceptions"){
    it("should get Throw Exception error message given throw new customException") {
//      val thrown = intercept[Exception] {
//      }
//
//      thrown.getClass should be(classOf[customException])
//      thrown.getMessage should be("Throw Exception")
    }

    it("should get Throw Exception log message given catch exception and log the message") {
//      var log = "";
//      try {
//        throw new Exception("this is exception")
//      }
//
//      log should be("Throw Exception")
    }
  }
}
