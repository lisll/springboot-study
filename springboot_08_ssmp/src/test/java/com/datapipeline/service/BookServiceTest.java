package com.datapipeline.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.datapipeline.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {
  @Autowired BookService bookService;

  @Test
  public void save() {
    Book book = new Book();
    book.setName("spring学习1");
    book.setType("spring学习1");
    book.setDescription("spring学习1");
    bookService.save(book);
  }

  @Test
  public void delete() {
    Integer id = 22;
    boolean delete = bookService.delete(id);
    System.out.println("delete->" + delete);
  }

  @Test
  public void update(){
    Book book = new Book();
    book.setId(22);
    book.setName("spring学习");
    book.setType("spring学习");
    book.setDescription("spring学习");
    bookService.update(book);
  }

  @Test
  public void selectByid(){
    Book book = bookService.getByid(3);
    System.out.println("book->"+book);
  }

  @Test
  public void queryAll(){
    List<Book> all = bookService.getAll();
    all.forEach(book -> System.out.println(book));
  }

  @Test
  public void queryPage(){
    IPage<Book> getpages = bookService.getpages(2, 5);
    long pages = getpages.getPages();
    System.out.println("pages->"+pages);
  }
}
