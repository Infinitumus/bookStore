package com.bookstore.controllers;

import com.bookstore.dao.BookDao;
import com.bookstore.models.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/bookcontroller")
public class BookController extends HttpServlet {

    private BookDao bookDao;

    @Override
    public void init() {
        bookDao = new BookDao();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameBook = req.getParameter("nameBook");
        String authorBook = req.getParameter("authorBook");
        String descriptionBook = req.getParameter("descriptionBook");
        Book book = new Book(nameBook, authorBook, descriptionBook);
        bookDao.createBook(book);

        List<Book> books = bookDao.getListBook();
        req.setAttribute("books", books);
        req.getRequestDispatcher("/books.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Hello");
    }
}
