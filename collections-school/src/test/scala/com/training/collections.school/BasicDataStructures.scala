package collections.school

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class BasicDataStructures extends FunSpec with Matchers{
  describe("Basic Data Structures"){
    it("should get list with number 1, 2, 3, 4") {
//      assert(list.length === 4)
//      assert(list(0) === 1)
//      assert(list(1) === 2)
//      assert(list(2) === 3)
//      assert(list(3) === 4)
    }

    it("should get set with number 1, 2 given init 1, 1, 2") {
//      assert(set.size === 2)
//      assert(set.head === 1)
//      assert(set.last === 2)
    }

    it("should get tuple with two values 'localhost' and 80") {
//      assert(tuple._1 === "localhost")
//      assert(tuple._2 === 80)
    }

    it("should multiply the number by two given has value, otherwise should return 0.") {
      val map = Map("one" -> 1, "two" -> 2)
//      assert(resultByOne === 2)
//      assert(resultByThree === 0)
    }
  }
}
