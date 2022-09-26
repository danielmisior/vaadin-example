package com.vaadin.books.domain;

import com.vaadin.books.BookType;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publicationYear;
    private BookType type;

    public Book() {
    }

    public Book(String title, String author, String publicationYear, BookType type) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public BookType getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publicationYear, book.publicationYear) && Objects.equals(type, book.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear, type);
    }
}