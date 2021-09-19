package pro.sky.java.course1.lesson7;

public class Book {
    private final String name;
    private final Author author;
    private String date;

    public Book(String name, String date, Author author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    public String getName() {
        return name;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }
}
