package com.datapipeline.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datapipeline.dao.BookDao;
import com.datapipeline.model.Book;
import com.datapipeline.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {
}
