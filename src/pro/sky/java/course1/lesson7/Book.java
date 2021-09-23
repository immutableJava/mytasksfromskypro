package pro.sky.java.course1.lesson7;

public class Book {
    private final String name;
    private final Author author;
    private int dateOfPublish;

    public Book(String name, int dateOfPublish, Author author) {
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
}
