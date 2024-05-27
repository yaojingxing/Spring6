package com.yao.di;

public class Book {
    public Book(String bname, String author){
        this.author = author;
        this.bname = bname;
    }
    private String bname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
