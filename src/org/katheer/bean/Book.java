package org.katheer.bean;

public class Book {
    private String name;
    private String id;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getBookDetails() {
        System.out.println(String.format("%-15s%-15s%-15s",
                this.getName(), this.getId(), this.getAuthor()));
    }
}
