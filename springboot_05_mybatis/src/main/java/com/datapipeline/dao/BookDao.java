package com.datapipeline.dao;

import com.datapipeline.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
   @Select("select * from a_flink_test where id = #{id}")
    Book getByid(long id);
}
