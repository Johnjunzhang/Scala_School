package com.training.basics

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class Functions extends FunSpec with Matchers{
  describe("Expressions And Functions"){
    it("should get value two two given expression is 1 + 1") {
//      two should be(2)
    }

    it("should get variable name given 'steve' then change to 'marius'") {
//      name = "marius"
//      name should be("marius")
}

    it("should get 3 given call function addOne(2)") {
//      val three = addOne(2)
//      three should be(3)
    }

    it("should get 3 given pass anonymous function addOne value to addOneAgain function") {
//      def addOneAgain(preAddOne:Int => Int) = preAddOne(1) + 1
//      val three = addOneAgain(addOne)
//      three should be(3)
    }

    it("should get 3 given pass anonymous function addOne value to addOneAgain function using partial application") {
//      def addOneAgain(preAddOne:Int => Int) = preAddOne(1) + 1
//      val three = addOneAgain(addOne)
//      three should be(3)
    }

    it("should get 6 by call multiply 2 and then 3 using curried functions") {
//      val timesTwo = multiply(2)_
//      val timesThree = timesTwo(3)
//      timesThree should be(6)
    }

    it("should sum all parameters by sum functions using variable length arguments") {
//      sum(2, 3) should be(5)
//      sum(2, 3, 4) should be(9)
    }
  }
}
