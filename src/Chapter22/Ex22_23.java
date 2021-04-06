package Chapter22;

import static Chapter22.Ex22_21.setRandomNumbersToArrayWithParam;
import static Chapter22.Ex22_21.showDoubleArray;

//Задание 22.23
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и возвращает количество простых чисел, содержащихся
//        в этом массиве.
public class Ex22_23 {
    static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int getCountPrimeNumbersFromDoubleArray(int[][] doubleArray) {
        int result = 0;
        for (int[] numbers : doubleArray) {
            for (int number : numbers) {
                if ((isPrime(number))) {
                    result++;
                }
            }
        }
        System.out.println("");
        return result;
    }

    public static void main(String[] args) {
        int[][] myDoubleArray = setRandomNumbersToArrayWithParam(new int[3][3], 1, 10);
        System.out.println("Всего целых числе в двумерном массиве: " + getCountPrimeNumbersFromDoubleArray(myDoubleArray));
    }
}
