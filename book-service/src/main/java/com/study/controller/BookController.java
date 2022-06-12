package com.study.controller;

import com.study.entity.Book;
import com.study.sevice.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    BookService bookService;

    @RequestMapping("book/{bid}")
    public Book findBookByid(@PathVariable("bid") int bid){
        return bookService.getBookById(bid);
    }
}
