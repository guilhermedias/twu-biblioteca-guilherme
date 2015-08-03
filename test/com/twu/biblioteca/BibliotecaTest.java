package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    Biblioteca biblioteca = new Biblioteca();
    @Test
    public void welcomeUser_ShouldReturnDefaultWelcomeMessage_WhenNoMessageIsGiven() {
        biblioteca = new Biblioteca();
        assertEquals("Welcome to Biblioteca", biblioteca.welcomeUser());
    }

    @Test
    public void welcomeUser_ShouldReturnGivenMessage() throws Exception {
        biblioteca = new Biblioteca("Given Message");
        assertEquals("Given Message", biblioteca.welcomeUser());
    }

    @Test
    public void listBooks_ShouldListAllBooks() throws Exception {
        biblioteca = new Biblioteca();
        String separator = " - ";
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);
        List<Book> expected = new ArrayList<Book>();
        expected.add(book);
        Book expectedBook = expected.get(0);

        assertEquals(expected.size(), biblioteca.listBooks().size());
        assertEquals(expectedBook.name + separator + expectedBook.author + separator + expectedBook.year , biblioteca.listBooks().get(0).showDetails());
    }
}