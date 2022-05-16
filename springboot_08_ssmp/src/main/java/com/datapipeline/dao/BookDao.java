package com.datapipeline.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datapipeline.model.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
