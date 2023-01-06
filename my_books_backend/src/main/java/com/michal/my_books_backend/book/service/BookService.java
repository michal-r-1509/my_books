package com.michal.my_books_backend.book.service;

import com.michal.my_books_backend.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    void saveBook(Book book);
}
