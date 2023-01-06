package com.michal.my_books_backend.support;

import com.michal.my_books_backend.book.service.BookServiceImpl;
import com.michal.my_books_backend.domain.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Slf4j
@RequiredArgsConstructor
@Service
@ConditionalOnProperty(name = "spring.profiles.active", havingValue = "local")
public class BooksInit {
    private final BookServiceImpl bookService;

    @EventListener
    public void onStartup (ApplicationReadyEvent event){
        bookInit();
        log.info("DUMMY DATABASE INITIALIZED");
    }

    private void bookInit() {
        bookService.saveBook(
                Book.builder()
                        .name("Hobbit")
                        .author("Tolkien")
//                        .year(1955)
                        .build());
        bookService.saveBook(
                Book.builder()
                        .name("Jurassic Park")
                        .author("Crichton")
//                        .year(1993)
                        .build());
    }
}
