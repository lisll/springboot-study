package com.datapipeline.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.datapipeline.model.Book;

import java.util.List;

public interface BookService {
  boolean save(Book book);

  boolean delete(Integer id);

  boolean update(Book book);

  Book getByid(Integer id);

  List<Book> getAll();

  IPage<Book> getpages(int current,int pageSize);
}
