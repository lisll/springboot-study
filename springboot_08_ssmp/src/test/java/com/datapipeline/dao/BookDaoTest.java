package com.datapipeline.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.datapipeline.model.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    BookDao bookDao;

    @Test
    public void selectById(){
        Book book = bookDao.selectById(1);
    System.out.println(book);
    }

    @Test
    public void saveBook(){
        Book book = new Book();
        book.setName("spring学习");
        book.setType("spring学习");
        book.setDescription("spring学习");
        bookDao.insert(book);
    }

    @Test
    public void getPage(){
        IPage iPage = new Page(3,5);
        bookDao.selectPage(iPage,null);

    System.out.println("pages->"+iPage.getPages());
    System.out.println(iPage.getCurrent());
    System.out.println(iPage.getSize());
    System.out.println(iPage.getTotal());
    System.out.println(iPage.getRecords());
    }

    // 根据条件查询
    @Test
    public void getBy(){
        String name = "Spring";
        IPage page = new Page(1,10);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isEmpty(name), Book::getName,"Spring");
        bookDao.selectPage(page,lqw);
//        IPage<Book> page = new Page<>(2,5);
//        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper();
//        wrapper.like(Book::getName,"Java");
//        bookDao.selectPage(page,wrapper);
    }
}
