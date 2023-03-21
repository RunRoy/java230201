package com.atguigu.morningtest;

public class Book {
    private String bookName;
    private String author;
    private double price;
    private String bookInfo;

    public Book() {
    }

    public Book(String bookName, String author, double price, String bookInfo) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.bookInfo = bookInfo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(String bookInfo) {
        this.bookInfo = bookInfo;
    }

    public String getMessage(){
        return "书名："+bookName+",作者："+author+",单价："+price+",简介："+bookInfo;
    }
}
