package com.example.demo.service;

import com.example.demo.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBookService {

    public List<Book> getAllBook();
    public Book getBookByIsbn(String isbn);
    public String insertBook(Book book);
    public String updateBookByIsbn(String targetBook,Book newBook);
    public String delBookByIsbn(String isbn);
}
