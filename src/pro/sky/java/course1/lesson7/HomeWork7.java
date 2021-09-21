package pro.sky.java.course1.lesson7;

public class HomeWork7 {

    public static void main(String[] args) {
        Author firstAuthor = new Author("George", "Orwell");
        Author secondAuthor = new Author("Chuck", "Palahniuk");
        Book firstBook = new Book("1984", "1949", firstAuthor);
        Book secondBook = new Book("Invisible Monsters", "1990", secondAuthor);
        secondBook.setDateOfPublish("фывощфы");
        Library library = new Library(5);
        library.addBook(firstBook);
        library.addBook(secondBook);
        library.changeDate("1984", "1959");
    }
}
