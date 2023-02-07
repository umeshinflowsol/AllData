package com.inflow.annoBean;

import org.springframework.stereotype.Component;

/*
@Component
*/
public class Book {
    private String isbn;
    private String year;
    private Author author;

    public Author getAuthor() {

        return author;
    }


    public Book(String isbn, String year, Author author) {
        this.isbn = isbn;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", isbn='" + isbn + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
