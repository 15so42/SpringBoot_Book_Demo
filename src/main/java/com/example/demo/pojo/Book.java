package com.example.demo.pojo;

public class Book {
    public String isbn ="undefind";
    public String title ="undefind";
    public String type ="undefind";
    public Double price =0.0;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book() {

    }

    public Book(String isbn, String title, String type, Double price) {

        this.isbn = isbn;
        this.title = title;
        this.type = type;

        this.price = price;
    }

    public String toString(){
        return "isbn: "+isbn+"<br>"+
                "title: "+title+"<br>"+
                "type: "+type+"<br>"+
                "price: "+price+"<br><br>";


    }

}
