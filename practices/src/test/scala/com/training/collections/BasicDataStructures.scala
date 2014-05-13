package collections.school

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class BasicDataStructures extends FunSpec with Matchers{
  describe("Basic Data Structures"){
    it("should get list with number 1, 2, 3, 4") {
//      list.length should be(4)
//      list(0) should be(1)
//      list(1) should be(2)
//      list(2) should be(3)
//      list(3) should be(4)
    }

    it("should get set with number 1, 2 given init 1, 1, 2") {
//      set.size should be(2)
//      set.head should be(1)
//      set.last should be(2)
}

    it("should get tuple with two values 'localhost' and 80") {
//      tuple._1 should be("localhost")
//      tuple._2 should be(80)
    }

    it("should multiply the number by two given has value, otherwise should return 0.") {
      val map = Map("one" -> 1, "two" -> 2)
//      resultByOne should be(2)
//      resultByThree should be(0)
    }
  }
}
