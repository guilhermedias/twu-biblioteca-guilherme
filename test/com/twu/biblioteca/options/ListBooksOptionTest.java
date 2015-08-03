package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.MenuOptionsConsts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gdias on 8/3/15.
 */
public class ListBooksOptionTest {
    @Test
    public void execute_ShouldReturnAListOfBooksAsString() throws Exception {
        AbstractOption listBooksOption = new ListBooksOption(MenuOptionsConsts.LIST_BOOKS_OPTION_NUMBER, MenuOptionsConsts.LIST_BOOKS_OPTION_NAME);
        assertEquals("Harry Potter - J. K. Rowling - 1997\n", listBooksOption.execute(new Biblioteca()));
    }
}
