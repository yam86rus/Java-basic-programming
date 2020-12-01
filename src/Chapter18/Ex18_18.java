package Chapter18;

import java.util.Scanner;

//Задание 18.18
//        Напишите класс, который заполняет случайными двузначными числами
//        массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива
//        следующим образом:
//        • в первой строке - значения из первой половины массива, начиная
//        с «начала));
//        • во второй строке - значения из второй половины массива, начиная
//        с «КОНЦА).
public class Ex18_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        int down = 10;
        int up = 99;
        for (int i = 0; i <= a - 1; i++) {
            numbers[i] = down + (int) ((up - down + 1) * Math.random());
        }
        System.out.println("Массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("----------");
        for (int i = 0; i <= numbers.length / 2; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i=numbers.length-1;i>=numbers.length/2+1;i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
