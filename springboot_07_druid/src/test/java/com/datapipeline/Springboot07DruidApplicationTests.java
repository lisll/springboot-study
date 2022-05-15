package com.datapipeline;

import com.datapipeline.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07DruidApplicationTests {

  @Autowired
  BookDao bookDao;
  @Test
  void contextLoads() {
    System.out.println(bookDao.getByid(2));
  }
}
