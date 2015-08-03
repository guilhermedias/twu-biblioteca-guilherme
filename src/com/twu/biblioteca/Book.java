package com.twu.biblioteca;

/**
 * Created by fmorais on 7/30/15.
 */
public class Book {
    public String name;
    public String author;
    public int year;
    public boolean isChecked;


    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.isChecked = false;
    }

    public String showDetails() {
        String separator = " - ";
        return name + separator + author + separator + Integer.toString(year);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Book) {
            Book otherBook = (Book) other;

            return this.showDetails().equals(otherBook.showDetails());
        }

        return false;
    }

    public boolean checkout() {
        if (isChecked) {
            return  false;
        } else {
            this.isChecked = true;
            return true;
        }
    }

    public boolean returnBook() {
        if(isChecked) {
            this.isChecked = false;
            return true;
        } else {
            return false;
        }
    }
}
