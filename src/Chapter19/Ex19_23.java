package Chapter19;

import java.util.Arrays;
import java.util.Scanner;

//Задание 19.23
//        Напишите метод, который принимает два параметра: массив целых
//        чисел М и еще одно целое число Х. Метод проверяет, находится ли
//        число Х в массиве.
public class Ex19_23 {
    private static int[] fillArray(int[] array) {
        int down = 10, up = 20;
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        Arrays.sort(array);
        return array;
    }

    private static void showInfo(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private static boolean isIn(int[] array, int a) {
        System.out.println(Arrays.binarySearch(array, a));
        return (Arrays.binarySearch(array, a) > 0) ? true : false;
    }

    public static void main(String[] args) {
        int[] myArray = fillArray(new int[10]);
        showInfo(myArray);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        String result1 = (isIn(myArray, a) == true) ? " Число есть  в массиве" : "числа нет в массиве";
        System.out.println(result1);
    }
}
