package org.library;
import java.util.Date;

/**
 * Created by sbacho on 03.07.2017.
 */
public class Book {
    public Book(){}

    public Book(long isbn, String author, String name, Date date){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.date = date;
    }

    private String name;
    private String author;
    private long isbn;
    private Date date;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbn() {
        return isbn;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", date=" + date +
                '}' + "\n";
    }
}
