package com.training.basics

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class Classes extends FunSpec with Matchers{
  describe("Classes"){
    it("should get added value 5 and brand name 'HP' given class Calculator") {
//      val calculator = new Calculator
//      calculator.add(2, 3) should be(5)
//      calculator.brand should be("HP")
    }

    it("should get added color is black given pass brand name 'HP' to class Calculator's constructor") {
//      val calculator = new Calculator("HP")
//      calculator.color should be("black")
    }
  }
}
