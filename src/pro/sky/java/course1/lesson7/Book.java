package pro.sky.java.course1.lesson7;

public class Book {
    private final String name;
    private final Author author;
    private String dateOfPublish;

    public Book(String name, String dateOfPublish, Author author) {
        this.name = name;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
    }

    public String getName() {
        return name;
    }


    public String getDate() {
        return dateOfPublish;
    }

    public void setDateOfPublish(String dateOfPublish) {
        try {
            int i = Integer.parseInt(dateOfPublish);
        } catch (Exception e) {
            System.out.println("Это не дата!");
            return;
        }
        this.dateOfPublish = dateOfPublish;
    }

    public Author getAuthor() {
        return author;
    }
}
