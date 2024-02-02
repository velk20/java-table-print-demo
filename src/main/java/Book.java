/*
 * Book.java
 *
 * created at 2024-02-02 by a.mladenov <a.mladenov@seeburger.com>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */


public class Book
{
    private String bookId;
    private String title;
    private Integer pages;
    private String author;


    public Book()
    {
    }


    public Book(String title, Integer pages, String author)
    {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }


    public Book(String bookId, String title, Integer pages, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }


    public String getBookId()
    {
        return bookId;
    }


    public void setBookId(String bookId)
    {
        this.bookId = bookId;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }


    public Integer getPages()
    {
        return pages;
    }


    public void setPages(Integer pages)
    {
        this.pages = pages;
    }


    public String getAuthor()
    {
        return author;
    }


    public void setAuthor(String author)
    {
        this.author = author;
    }
}
