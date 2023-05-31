package com.czy.booktest02.demos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czy.booktest02.demos.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 **/
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
