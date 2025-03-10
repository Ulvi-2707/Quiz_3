package class_objects.task1;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nYear: " + year);
    }
}
