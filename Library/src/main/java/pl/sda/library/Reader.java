package pl.sda.library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    public final int index;
    public final String name;

    private final List<Book> borrowedBooks = new ArrayList<>();

    public Reader(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }
}