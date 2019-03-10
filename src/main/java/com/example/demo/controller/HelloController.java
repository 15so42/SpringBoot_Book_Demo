package com.example.demo.controller;

import com.example.demo.pojo.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.IBookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Autowired
    private  IBookService bookService;

    ///查询所有书籍
    @RequestMapping(value = "book/all",method = RequestMethod.GET)
    public String getAllBook(){

        String rs=bookService.getAllBook().toString();

        return rs;
    }

    ///根据id查找书籍
    @RequestMapping(value = "book/{isbn}",method = RequestMethod.GET)
    public String getBookByIsbn(@PathVariable String isbn){
        return bookService.getBookByIsbn(isbn).toString();
    }

    ///插入
    @RequestMapping(value="book",method = RequestMethod.POST)
    public String insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }


    ///输入要修改的书籍编号和要修改的内容
    @RequestMapping(value="book/{isbn}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable String isbn,@RequestBody Book book){
        return bookService.updateBookByIsbn(isbn,book);
    }

    ///根据书籍删除书
    @RequestMapping(value="book/{isbn}",method = RequestMethod.DELETE)
    public String delBookByIsbn(@PathVariable("isbn") String isbn){
        return bookService.delBookByIsbn(isbn);
    }


}
