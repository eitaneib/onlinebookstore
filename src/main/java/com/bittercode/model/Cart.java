package com.bittercode.model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Cart implements Serializable {

    private List<Book> books;

    public Cart(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
