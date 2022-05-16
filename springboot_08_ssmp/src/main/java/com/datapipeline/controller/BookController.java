package com.datapipeline.controller;


import com.datapipeline.model.Book;
import com.datapipeline.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    private IBookService bookService;

    @GetMapping("{id}")
    public Book getByid(@PathVariable Integer id ){
       return  bookService.getById(id);
    }


    @GetMapping("/all")
    public List<Book> getList(){
        return bookService.list();
    }

    @PutMapping
    public Boolean update(@RequestBody  Book book){
      return bookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable  Integer id){
        return bookService.removeById(id);
    }

}
