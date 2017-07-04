package org.library;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sbacho on 03.07.2017.
 */
public class InternetLibrary implements Library {
    String name;
    ArrayList<Book> listOfBooks;

    public InternetLibrary(){
        this.name = "Default Library";
        this.listOfBooks = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    @Override
    public void removeBook(Book book) {
        listOfBooks.remove(book);
    }

    @Override
    public String findBook(String name) {
        StringBuilder s = new StringBuilder();
        for (Book book : listOfBooks) {
            if (book.getName().equals(name)) {
                s.append(book.toString());
            }
        }
        if (s.toString().equals("")){
            s.append("No matches found");
        }
        return s.toString();
        }
    public String findBookByAuthor(String author) {
        StringBuilder s = new StringBuilder();
        for (Book book : listOfBooks) {
            if (book.getAuthor().equals(author)) {
                s.append(book.toString());
            }
        }
        if (s.toString().equals("")){
            s.append("No matches found");
        }
        return s.toString();
    }
    @Override
    public String findBook(long isbn) {
        StringBuilder s = new StringBuilder();
        for (Book book : listOfBooks) {
            if (book.getIsbn() == isbn) {
                s.append(book.toString());
            }
        }
        if (s.toString().equals("")){
            s.append("No matches found");
        }
        return s.toString();
    }

    @Override
    public String findBook(Date date) {
        StringBuilder s = new StringBuilder();
        for (Book book : listOfBooks) {
            if (book.getDate() == date) {
                s.append(book.toString());
            }
        }
        if (s.toString().equals("")){
            s.append("No matches found");
        }
        return s.toString();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Library sort() {
        for (int i = listOfBooks.size() -1; i >= 0 ; i--){
            for(int k = 0; k < i; k++){
                if(listOfBooks.get(k).getIsbn() > listOfBooks.get(k+1).getIsbn()){
                    Book bin = listOfBooks.get(k+1);
                    listOfBooks.set((k + 1), listOfBooks.get(k));
                    listOfBooks.set(k, bin);
                }
            }
        }
        return this;
    }

    @Override
    public String getAddress() {
        return "There is no address";
    }
    public int size(){
        return listOfBooks.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Library " +name + ":" +"\n");
        for (Book book: listOfBooks){
            s.append(book.toString());
        }
        return s.toString();
    }
}
