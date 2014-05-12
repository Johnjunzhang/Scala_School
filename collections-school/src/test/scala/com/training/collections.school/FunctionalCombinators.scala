package collections.school

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class FunctionalCombinators extends FunSpec with Matchers{
  describe("Functional Combinators"){
    it("should get doubledList with number 2, 4, 6, 8 using map") {
      val list = List(1, 2, 3, 4)
//      doubledList.length should be (4)
//      doubledList(0) should be (2)
//      doubledList(1) should be (4)
//      doubledList(2) should be (6)
//      doubledList(3) should be (8)
    }

    it("should get summed result using foreach") {
      var result = 0;
      def add(number:Int) {
        result += number;
      }

      val list = List(1, 2, 3, 4)
//      result should be (10)
    }

    it("should get numbers which mod two and evaluate to 0 using filter") {
      val list = List(1, 2, 3, 4)
//      filteredList(0) should be (2)
//      filteredList(1) should be (4)
    }

    it("should aggregates the contents of two lists into a single list of pairs using zip") {
      val numbers = List(1, 2, 3)
      val numberWords = List("one", "two", "three")
//      aggregatedList.length should be (3)
//      aggregatedList(0)._1 should be (1)
//      aggregatedList(0)._2 should be ("one")
//      aggregatedList(1)._1 should be (2)
//      aggregatedList(1)._2 should be ("two")
//      aggregatedList(2)._1 should be (3)
//      aggregatedList(2)._2 should be ("three")
    }

    it("should splits lists to two lists according to whether can mod 2 and evaluate to 0 using partition") {
      val numbers = List(1, 2, 3, 4)
//      partitionedList._1(0) should be (2)
//      partitionedList._1(1) should be (4)
//      partitionedList._2(0) should be (1)
//      partitionedList._2(1) should be (3)
    }

    it("should get 3 given condition is greater than 2 using find") {
      val numbers = List(1, 2, 3, 4)
//      foundNumber should be(3)
    }

    it("should drop 1, 2 given condition is 2 using drop") {
      val numbers = List(1, 2, 3, 4)
//      droppedNumbers(0) should be (3)
//      droppedNumbers(1) should be (4)
    }

    it("should drop 1 given condition is mode 2 and evaluate not equal to 0 using dropWhile") {
      val numbers = List(1, 2, 3, 4)
//      droppedNumbers(0) should be (2)
//      droppedNumbers(1) should be (3)
//      droppedNumbers(2) should be (4)
    }

    it("should collapses nested lists to one level using flatten") {
      val numbers = List(List(1, 2), List(3, 4))
//      flattenedNumbers.length should be (4)
//      flattenedNumbers(0) should be (1)
//      flattenedNumbers(1) should be (2)
//      flattenedNumbers(2) should be (3)
//      flattenedNumbers(3) should be (4)
    }

    it("should get doubledList with number 2, 4, 6, 8 given nested lists using flatMap") {
      val numbers = List(List(1, 2), List(3, 4))
//      flatMappedNumbers.length should be (4)
//      flatMappedNumbers(0) should be (2)
//      flatMappedNumbers(1) should be (4)
//      flatMappedNumbers(2) should be (6)
//      flatMappedNumbers(3) should be (8)
    }

    it("should get filtered map given condition is map's value greater than 2 using filter") {
      val numberMaps = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
//      filteredMap.size should be (2)
//      filteredMap.head should be (("three" -> 3))
//      filteredMap.last should be (("four" -> 4))
    }
  }
}