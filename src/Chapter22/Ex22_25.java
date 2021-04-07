package Chapter22;

import static Chapter22.Ex22_21.setRandomNumbersToArrayWithParam;

//Задание 22.2 5
//        Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и целое число К, которое является индексом одной
//        из строк массива-параметра.
//        Метод должен проверить, содержит ли строка номер К значения, упорядоченные
//        по возрастанию.
public class Ex22_25 {
    public static boolean isIncreasing(int[][] doubleArray, int row) {
        if (row > doubleArray.length) {
            return false;
        }
        int temp = doubleArray[0][0];

        try {
            temp = doubleArray[row][0];
        } catch (Exception e) {
            System.out.println("Ахтунг! " + e);
            return false;
        }

        for (int i = 0; i < doubleArray[row].length; i++) {
            if (doubleArray[row][i] < temp) {
                return false;
            } else {
                temp = doubleArray[row][i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] myDoubleArray = new int[3][3];
        setRandomNumbersToArrayWithParam(myDoubleArray, 10, 20);
        System.out.println(isIncreasing(myDoubleArray, 2));

    }
}
