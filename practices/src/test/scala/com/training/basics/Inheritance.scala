package com.training.basics

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class Inheritance extends FunSpec with Matchers{
  describe("Inheritance"){
    it("should get occupation is developer given class Developer is inherit Person") {
      class Person {
        def Occupation:String = {
          "NA"
        }
      }

//      val employee = new Developer
//      employee.Occupation should be("developer")
    }

    it("should get area is 4 given side is 2 for square inherit abstract class Shape") {
      abstract class Shape {
        def getArea:Int
      }

//      val square = new Square(2)
//      square.getArea should be(4)
    }
  }
}
