package com.example.sample.sas.service

import com.example.sample.sas.entity
import org.junit.Test
import org.junit.Assert._
import org.junit.runner.RunWith
import org.seasar.extension.jdbc.JdbcManager
import org.seasar.framework.unit.Seasar2

@RunWith(classOf[Seasar2])
class HelloActionTest {
  var bookService:BookService = _
//  var book:Book = _
  @Test
  def testHello {
    assertTrue("is true?", true)
  }
  @Test
  def testHelloAgain {
    assertNotNull(new Book())
  }
}

