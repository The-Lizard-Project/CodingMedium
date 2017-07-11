package pl.sda.library;

public class Book {

    public final int index;
    public final String title;
    public final String author;
    public final int pages;
    public final int year;

    public boolean isAvailable = true;

    public Book(int index, String title, String author, int pages, int year) {
        this.index = index;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getFullInformation() {
        return "Index: " + index + ", Title: " + title + ", Author: " + author + ", Year: " + year + ", Pages: " + pages + ", IsAvailable: " + isAvailable;
    }
}