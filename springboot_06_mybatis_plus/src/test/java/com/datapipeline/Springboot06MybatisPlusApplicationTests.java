package com.datapipeline;

import com.datapipeline.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

  @Autowired
  BookDao bookDao;


  @Test
  void contextLoads() {
    System.out.println(bookDao.selectBatchIds(Collections.singletonList(2)));
  }

  @Test
  void test(){
    System.out.println(bookDao.selectList(null));
  }
}
