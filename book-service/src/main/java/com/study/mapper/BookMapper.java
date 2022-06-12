package com.study.mapper;

import com.study.entity.Book;
import org.apache.ibatis.annotations.Select;

public interface BookMapper {

    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);
}
