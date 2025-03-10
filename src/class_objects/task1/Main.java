package class_objects.task1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", "Ali", 1999);
        Book book2 = new Book("C#", "Kamran", 2023);
        book.displayDetails();
        System.out.println("==================");
        book2.displayDetails();
    }

}
