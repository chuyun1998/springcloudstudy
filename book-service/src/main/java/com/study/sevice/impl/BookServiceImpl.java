package com.study.sevice.impl;

import com.study.entity.Book;
import com.study.mapper.BookMapper;
import com.study.sevice.BookService;

import javax.annotation.Resource;

public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
