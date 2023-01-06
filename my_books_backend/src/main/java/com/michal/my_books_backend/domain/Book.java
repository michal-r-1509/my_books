package com.michal.my_books_backend.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "books")
public class Book extends BaseEntity{
    private String name;
    private String author;
    private int publishYear;
}
