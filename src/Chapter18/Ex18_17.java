package Chapter18;

import java.util.Scanner;

//Задание 18.17
//        Напишите класс, который заполняет случайными трехзначными числами
//        массив, размер которого при инициализации вводится с клавиатуры.
//        После заполнения класс должен вывести на экран значения массива
//        следующим образом: в каждой строке выводится значения из двух ячеек,
//        симметрично расположенных по отношению к середине массива.
//        В случае если массив имеет нечетный размер, центральную ячейку
//        следует выводить в отдельной строке.
//        Например, массив 345, 455, 677, 175, 985 выводится на экран следующим
//        образом:
//        345 и 985
//        455и175
//        677
public class Ex18_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        int down = 100;
        int up = 999;
        for (int i = 0; i <= a - 1; i++) {
            numbers[i] = down + (int) ((up - down + 1) * Math.random());
        }
        System.out.println("Массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("----------");
        for (int i = 0; i <= numbers.length / 2 - 1; i++) {
            System.out.println(numbers[i] + " и " + numbers[a - 1 - i]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[a / 2]);
        }
    }
}
