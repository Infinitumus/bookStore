package com.bookstore.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> bookList;

    public Store() {
        this.bookList = new ArrayList<>();

        this.bookList.add(new Book(1, "Java", "Alex", "Test Book"));
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public void insertBook(Book book) {
        if (book != null) {
            book.setId(bookList.size() + 1);
            bookList.add(book);
        }
    }
}
