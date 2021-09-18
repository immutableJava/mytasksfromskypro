package pro.sky.java.course1.lesson7;

public class HomeWork7 {
    static Book[] books = new Book[5];

    public static void main(String[] args) {
        Author firstAuthor = new Author("George", "Orwell");
        Author secondAuthor = new Author("Chuck", "Palahniuk");
        Book firstBook = new Book("1984", "1949", firstAuthor);
        Book secondBook = new Book("Invisible Monsters", "1990", secondAuthor);
        secondBook.setDate("1999");
        addBook(firstBook);
        print(books);
    }

    public static void addBook(Book book) {
        book = new Book(book.getName(), book.getDate(), book.getAuthor());
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void print(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.printf("%s %s: %s: %s", book.getAuthor().getName(), book.getAuthor().getSurname(), book.getName(), book.getDate());
            }
        }
    }
}
