package collections.school

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class FunctionalCombinators extends FunSpec with Matchers{
  describe("Functional Combinators"){
    it("should get doubledList with number 2, 4, 6, 8 using map") {
      val list = List(1, 2, 3, 4)
      val doubledList = list.map(_ * 2)
      doubledList.length should be(4)
//      assert(doubledList.length === 4)
//      assert(doubledList(0) === 2)
//      assert(doubledList(1) === 4)
//      assert(doubledList(2) === 6)
//      assert(doubledList(3) === 8)
    }

    it("should get summed result using foreach") {
      var result = 0;
      def add(number:Int) {
        result += number;
      }

      val list = List(1, 2, 3, 4)
//      assert(result === 10)
    }

    it("should get numbers which mod two and evaluate to 0 using filter") {
      val list = List(1, 2, 3, 4)
//      assert(filteredList(0) == 2)
//      assert(filteredList(1) == 4)
    }

    it("should multiply the number by two given has value, otherwise should return 0.") {
      val map = Map("one" -> 1, "two" -> 2)
//      assert(resultByOne === 2)
//      assert(resultByThree === 0)
    }

    it("should aggregates the contents of two lists into a single list of pairs using zip") {
      val numbers = List(1, 2, 3)
      val numberWords = List("one", "two", "three")
//      assert(aggregatedList.length === 3)
//      assert(aggregatedList(0)._1 === 1)
//      assert(aggregatedList(0)._2 === "one")
//      assert(aggregatedList(1)._1 === 2)
//      assert(aggregatedList(1)._2 === "two")
//      assert(aggregatedList(2)._1 === 3)
//      assert(aggregatedList(2)._2 === "three")
    }

    it("should splits lists to two lists according to whether can mod 2 and evaluate to 0 using partition") {
      val numbers = List(1, 2, 3, 4)
//      assert(partitionedList._1(0) === 2)
//      assert(partitionedList._1(1) === 4)
//      assert(partitionedList._2(0) === 1)
//      assert(partitionedList._2(1) === 3)
    }

    it("should get 3 given condition is greater than 2 using find") {
      val numbers = List(1, 2, 3, 4)
//      assert(foundNumber === 3)
    }

    it("should drop 1, 2 given condition is 2 using drop") {
      val numbers = List(1, 2, 3, 4)
//      assert(droppedNumbers(0) === 3)
//      assert(droppedNumbers(1) === 4)
    }

    it("should drop 1 given condition is mode 2 and evaluate not equal to 0") {
      val numbers = List(1, 2, 3, 4)
//      assert(droppedNumbers(0) === 2)
//      assert(droppedNumbers(1) === 3)
//      assert(droppedNumbers(2) === 4)
    }

    it("should collapses nested lists to one level using flatten") {
      val numbers = List(List(1, 2), List(3, 4))
//      assert(flattenedNumbers.length === 4)
//      assert(flattenedNumbers(0) === 1)
//      assert(flattenedNumbers(1) === 2)
//      assert(flattenedNumbers(2) === 3)
//      assert(flattenedNumbers(3) === 4)
    }

    it("should get doubledList with number 2, 4, 6, 8 given nested lists using flatMap") {
      val numbers = List(List(1, 2), List(3, 4))
//      assert(flatMappedNumbers.length === 4)
//      assert(flatMappedNumbers(0) === 2)
//      assert(flatMappedNumbers(1) === 4)
//      assert(flatMappedNumbers(2) === 6)
//      assert(flatMappedNumbers(3) === 8)
    }

    it("should get filtered map given condition is map's value greater than 2 using filter") {
      val numberMaps = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
//      assert(filteredMap.size === 2)
//      assert(filteredMap.head === ("three" -> 3))
//      assert(filteredMap.last === ("four" -> 4))
    }
  }
}
