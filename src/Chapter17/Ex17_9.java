package Chapter17;
//Задание 17.9
//        Напишите метод, который получает в качестве параметра два числа
//        (А и В) и выводит на экран все четные числа из диапазона А ... В.

public class Ex17_9 {
    static void foo(int a, int b) {
        int min = 0;
        int max = 0;
        if (a < b) {
            min = a;
            max = b;
        } else if (a > b) {
            max = a;
            min = b;
        } else {
            System.out.println("Числа равны. Диапазона нет.");
            return;
        }
        for (; min <= max; min++) {
            if (min % 2 == 0) {
                System.out.println(min);
            }
        }
    }

    public static void main(String[] args) {
//        foo(9, 21);
        foo(50, 50);
    }
}
