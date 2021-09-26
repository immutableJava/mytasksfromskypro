package pro.sky.java.course1.lesson8;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int dateOfPublish;

    public Book(String name, Author author, int dateOfPublish) {
        this.name = name;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
    }

    public String getName() {
        return name;
    }


    public int getDate() {
        return dateOfPublish;
    }

    public void setDateOfPublish(int dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return dateOfPublish == book.dateOfPublish && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, dateOfPublish);
    }

    @Override
    public String toString() {
        return "Book: " + name + " by " + author;
    }
}
