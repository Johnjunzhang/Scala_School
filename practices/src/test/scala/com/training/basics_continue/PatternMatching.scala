package com.training.basics_continue

import org.junit.runner.RunWith
import org.scalatest.{Matchers, FunSpec}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PatternMatching extends FunSpec with Matchers{
  describe("PatternMatching"){
    it("should get ‘one' given 1, 'two' given 2 and 'other number' given 4 using pattern matching on value") {
//      matchedValue(1) should be("one")
//      matchedValue(2) should be("two")
//      matchedValue(4) should be("other number")
    }

    it("should get 'int' given 1, 'double' given 2.0 and 'string' given 'text' using pattern matching on type") {
//      matchedType(1) should be("int")
//      matchedType(2.0) should be("double")
//      matchedType("text") should be("string")
    }

    it("should get 'financial' given case brand is hp and model is 20B and " +
      "get 'scientific' given case brand is hp and model is 48G using case class")
    {
//      calcType(Calculator("hp", "20B")) should be("financial")
//      calcType(Calculator("hp", "48G")) should be("scientific")
    }
  }
}
