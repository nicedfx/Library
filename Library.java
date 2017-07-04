package org.library;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sbacho on 03.07.2017.
 */
public interface Library {
    void addBook(Book book);
    void removeBook(Book book);
    ArrayList<Book> findBook(String name);
    ArrayList<Book> findBook(long isbn);
    ArrayList<Book> findBook(Date date);
    String getName();
    Library sort();
    String getAddress();
}
