package pro.sky.java.course1.lesson7;

public class Library {
    private final Book[] books;

    public Library(int length) {
        books = new Book[length];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void print(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.printf("%s %s: %s: %s", book.getAuthor().getName(), book.getAuthor().getSurname(), book.getName(), book.getDate());
            }
        }
    }

    public void info(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                System.out.printf("%s by %s %s was published in %s", book.getName(), book.getAuthor().getName(), book.getAuthor().getSurname(), book.getDate());
            }
        }
    }

    public void changeDate(String name, String date) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                book.setDate(date);
            }
        }
    }
}
