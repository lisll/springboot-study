package com.datapipeline;

import com.datapipeline.dao.BookDao;
import com.datapipeline.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {


  @Autowired
  BookDao bookDao;

  @Test
  void contextLoads() {
    Book byid = bookDao.getByid(1);
    System.out.println(byid);
  }
}
