package com.training.basics

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class Generic extends FunSpec with Matchers{
  describe("Generic"){
    it("should can cache both key with int and string for database with cache trait") {
//      class Database
//      val databaseWithIntKeyCache = new Database with Cache[Int, String]
//      databaseWithIntKeyCache.put(1, "one")
//      databaseWithIntKeyCache.get(1) should be("one")
//      databaseWithIntKeyCache.put(2, "two")
//      databaseWithIntKeyCache.get(2) should be("two")
//
//      val databaseWithStringKeyCache = new Database with Cache[String, Int]
//      databaseWithStringKeyCache.put("one", 1)
//      databaseWithStringKeyCache.get("one") should be(1)
//      databaseWithStringKeyCache.put("two", 2)
//      databaseWithStringKeyCache.get("two") should be(2)
    }
  }
}
