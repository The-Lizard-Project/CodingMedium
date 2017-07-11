package pl.sda.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {

    private final List<Book> books = new ArrayList<>();
    private final List<Reader> readers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        Book book = findBook(b -> b.index == index);
        books.remove(book);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void borrowBook(String title, int readerIndex) {
        Reader reader = readers.stream().filter(r -> r.index == readerIndex)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("The reader is not registered in the library"));

        Book book = findBook(b -> b.title.equals(title) && b.isAvailable);

        book.isAvailable = false;
        reader.addBook(book);
    }

    public Book getOldestBook() {
        if (books.isEmpty()) {
            throw new IllegalStateException("There is no books in the Library");
        }

        return books.stream()
                .min(Comparator.comparingInt(b -> b.year))
                .get();
    }

    public Book getYoungestBook() {
        if (books.isEmpty()) {
            throw new IllegalStateException("There is no books in the Library");
        }

        return books.stream()
                .max(Comparator.comparingInt(b -> b.year))
                .get();
    }

    public Book getLongestBook() {
        if (books.isEmpty()) {
            throw new IllegalStateException("There is no books in the Library");
        }

        return books.stream()
                .max(Comparator.comparingInt(b -> b.pages))
                .get();
    }

    public Book getShortestBook() {
        if (books.isEmpty()) {
            throw new IllegalStateException("There is no books in the Library");
        }

        return books.stream()
                .min(Comparator.comparingInt(b -> b.pages))
                .get();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getAvailableBooks() {
        return books.stream()
                .filter(b -> b.isAvailable)
                .collect(Collectors.toList());
    }

    public List<Book> getUnavailableBooks() {
        return books.stream()
                .filter(b -> !b.isAvailable)
                .collect(Collectors.toList());
    }

    private Book findBook(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Can't find the book!"));
    }
}