package inheretnes.task_2;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Leo", 12);
        dog.makeSound();
        System.out.println(dog);

        Cat cat = new Cat("Tiger", 5);
        cat.makeSound();
        System.out.println(cat);
    }
}
