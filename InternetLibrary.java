package org.library;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sbacho on 03.07.2017.
 */
public class InternetLibrary implements Library {
    String name;
    String address;
    ArrayList<Book> listOfBooks;

    public InternetLibrary(){
        this.name = "Default Library";
        this.address = "Default address";
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
    public ArrayList<Book> findBook(String name) {
        ArrayList<Book> arr = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getName().equals(name)) {
                arr.add(book);
            }
        }
        if(arr.isEmpty() == true){
            arr.add(new Book(0,"No matches", "No matches", new Date()));
        }
        return arr;
         }


    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> arr = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getAuthor().equals(author)) {
                arr.add(book);
            }
        }
        if(arr.isEmpty() == true){
            arr.add(new Book(0,"No matches", "No matches", new Date()));
        }
        return arr;
    }
    @Override
    public ArrayList<Book> findBook(long isbn) {
        ArrayList<Book> arr = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getIsbn() == isbn) {
                arr.add(book);
            }
        }
        if(arr.isEmpty() == true){
            arr.add(new Book(0,"No matches", "No matches", new Date()));
        }
        return arr;
    }

    @Override
    public ArrayList<Book> findBook(Date date) {
        ArrayList<Book> arr = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getDate() == date) {
                arr.add(book);
            }
        }
        if(arr.isEmpty() == true){
            arr.add(new Book(0,"No matches", "No matches", new Date()));
        }
        return arr;
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
        return this.address;
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
