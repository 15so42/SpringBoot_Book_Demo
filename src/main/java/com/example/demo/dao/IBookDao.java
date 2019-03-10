package com.example.demo.dao;

import com.example.demo.pojo.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface IBookDao {

    //查询所有书籍
    @Select("select * from bookta")
    public List<Book> getAllBook();

    //根据isbn查询书籍
    @Select("select * from bookta where isbn=#{isbn}")
    public Book getBookByIsbn(String isbn);

    //插入书籍
    @Insert("insert into bookta values (#{isbn},#{title},#{type},#{price})")
    public int insertBook(Book book);

    //修改书籍
    @Update("update bookta set title=#{book.title},type=#{book.type},price=#{book.price} where isbn=#{isbn}")
    public int updateBookByIsbn(@Param("isbn") String isbn,@Param("book")Book book);


    //删除书籍
    @Delete("delete from bookta where isbn=#{isbn}")
    public int delBookByIsbn(String isbn);
}
