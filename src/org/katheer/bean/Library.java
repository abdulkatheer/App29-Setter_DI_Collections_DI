package org.katheer.bean;

import java.util.Iterator;
import java.util.Set;

public class Library {
    private Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void showBooks() {
        System.out.println(String.format("%-15s%-15s%-15s", "Name", "ID", "Author"));
        Iterator<Book> itr = books.iterator();
        while(itr.hasNext()){
            itr.next().getBookDetails();
        }
    }
}
