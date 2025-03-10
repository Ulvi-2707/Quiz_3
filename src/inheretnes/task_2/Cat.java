package inheretnes.task_2;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("'Miyav-miyav' - this is a cat sound.");
    }
}
