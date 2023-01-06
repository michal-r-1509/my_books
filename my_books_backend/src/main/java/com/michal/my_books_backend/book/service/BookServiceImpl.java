package com.michal.my_books_backend.book.service;

import com.michal.my_books_backend.book.repository.BookRepository;
import com.michal.my_books_backend.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(final Book book) {
        bookRepository.save(book);
    }
}
