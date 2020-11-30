package Chapter16;

//Задание 16. 7
//        Напишите класс, который будет выводить на экран делители каждого
//        числа от 1 до75.
public class Ex16_7 {
    static void foo(int i) {
        System.out.println("Делители числа " + i);
        for (int j = 1; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 75; i++) {
            foo(i);
        }
    }
}
