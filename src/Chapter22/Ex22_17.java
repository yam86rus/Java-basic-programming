package Chapter22;
import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;
//Задание 22.17
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и выводит на экран:
//        • максимальное и минимальное значения, содержащиеся в массиве;
//        • количество максимумов и количество минимумов.
public class Ex22_17 {
    public static void showMaxAndMinValues (int [][] doubleArray){
        int max = doubleArray[0][0];
        int min = doubleArray[0][0];
        for (int[] numbers: doubleArray){
            for (int number: numbers){
                if(number>max){
                    max=number;
                }
                if (number<min){
                    min = number;
                }
            }
        }
        System.out.println("Максимальное значение в массиве " + max);
        System.out.println("Минимальное значение в массие " + min);
    }

    public static void showCountMaxAndMinValues(int[][] doubleArray){
        int max = doubleArray[0][0];
        int count = 0;
        for (int[] numbers: doubleArray){
            for (int number: numbers){
                if(number==max){
                    count++;
                }if (number>max){
                    max=number;
                    count=1;
                }
            }
        }
        System.out.println("Максимальное значение в массиве "+ max);
        System.out.println("Количество значений " + max + " в массиве " + count);
    }
    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][6];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);
        System.out.println(Arrays.deepToString(myDoubleArray));
        showMaxAndMinValues(myDoubleArray);
        System.out.println("****");
        showCountMaxAndMinValues(myDoubleArray);

    }
}
