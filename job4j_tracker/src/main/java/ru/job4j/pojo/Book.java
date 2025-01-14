package ru.job4j.pojo;

public class Book {
    private String bookName;
    private int bookpage;

    public Book(String bookName, int bookpage) {
        this.bookName = bookName;
        this.bookpage = bookpage;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookpage() {
        return bookpage;
    }

    public void setBookpage(int bookpage) {
        this.bookpage = bookpage;
    }
}
