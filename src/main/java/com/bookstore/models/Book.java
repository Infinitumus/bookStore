package com.bookstore.models;

public class Book {
    private int id;
    private String nameBook;
    private String authorBook;
    private String descriptionBook;

    public Book() {
    }

    public Book(String nameBook, String authorBook, String descriptionBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.descriptionBook = descriptionBook;
    }

    public Book(int id, String nameBook, String authorBook, String descriptionBook) {
        this.id = id;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.descriptionBook = descriptionBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", descriptionBook='" + descriptionBook + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public String getDescriptionBook() {
        return descriptionBook;
    }
}
