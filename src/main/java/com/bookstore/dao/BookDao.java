package com.bookstore.dao;

import com.bookstore.models.Book;
import com.bookstore.models.Store;

import java.util.List;

public class BookDao {
    private final Store bookStore;

    public BookDao() {
        this.bookStore = new Store();
    }

    public boolean createBook(Book book) {
        if (book != null) {
            bookStore.insertBook(book);
            return true;
        }
        return false;
    }

    public List<Book> getListBook(){
        return bookStore.getBooks();
    }
}
