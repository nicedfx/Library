package org.library;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sbacho on 03.07.2017.
 */
public interface Library {
    void addBook(Book book);
    void removeBook(Book book);
    String findBook(String name);
    String findBook(long isbn);
    String findBook(Date date);
    String getName();
    Library sort();
    String getAddress();
}
