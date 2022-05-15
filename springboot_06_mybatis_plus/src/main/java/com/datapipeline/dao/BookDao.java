package com.datapipeline.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datapipeline.model.A_flink_test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<A_flink_test> {
}
