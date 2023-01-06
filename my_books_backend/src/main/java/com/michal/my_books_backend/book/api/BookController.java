package com.michal.my_books_backend.book.api;

import com.michal.my_books_backend.book.service.BookService;
import com.michal.my_books_backend.book.service.BookServiceImpl;
import com.michal.my_books_backend.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/books")
public class BookController {
    private final BookService bookService;

    @GetMapping
    ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }
}
