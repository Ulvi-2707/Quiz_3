package static_members.task_2;

public class Main {
    public static void main(String[] args) {

        int number1 = 3;
        int number2 = 4;
        int number3 = 5;
        int number4 = 6;

        System.out.println(number1 + " cube: " +MathUtils.cube(number1));
        System.out.println(number2 + " cube: " +MathUtils.cube(number2));

        System.out.println(number3 + " square: " +MathUtils.square(number3));
        System.out.println(number4 + " square: " +MathUtils.square(number4));
    }
}
