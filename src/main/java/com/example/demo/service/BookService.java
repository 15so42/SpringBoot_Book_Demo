package com.example.demo.service;

import com.example.demo.dao.IBookDao;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> getAllBook()
    {
        return bookDao.getAllBook();
    }

    @Override
    public Book getBookByIsbn(String isbn)
    {
        return  bookDao.getBookByIsbn(isbn);
    }

    @Override
    public String insertBook(Book book) {
        try{
            bookDao.insertBook(book);
        }catch (Exception e){
            return  "插入失败:"+e.getMessage();
        }
        return "插入成功";
    }

    @Override
    public String updateBookByIsbn(String targetBook, Book newBook) {

            try{
                bookDao.updateBookByIsbn(targetBook,newBook);
            }catch (Exception e){
                return  "修改失败:"+e.getMessage();
            }
            return "修改成功";


    }

    @Override
    public String delBookByIsbn(String isbn) {
        try{
            bookDao.delBookByIsbn(isbn);
        }catch (Exception e){
            return  "删除失败:"+e.getMessage();
        }
        return "删除成功";
    }
}
