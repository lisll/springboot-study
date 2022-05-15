package com.datapipeline.springboot_04_junit.dao.impl;

import com.datapipeline.springboot_04_junit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
  @Override
  public void save() {
    System.out.println("bookdao is running");
  }
}
