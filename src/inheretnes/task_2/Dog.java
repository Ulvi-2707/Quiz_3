package inheretnes.task_2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("'Hav-hav' - this is a dog sound.");
    }
}
