package Chapter22;
import java.util.Arrays;

import static Chapter22.Ex22_9.setRandomNumbersToArray;

//Задание 22.18
//        Напишите метод, который получает в качестве параметра двумерный
//        массив целых чисел и выводит на экран:
//        • максимальное и минимальное значения, содержащиеся в массиве;
//        • положение (индексы ячеек) всех минимумов и максимумов.
public class Ex22_18 {
    public static void showMaxAndMinInArray(int[][] da){
        int min =da[0][0];
        int max = da[0][0];
        for (int i=0; i<da.length;i++){
            for(int j=0; j<da[i].length;j++){
                if (da[i][j]>max){
                    max=da[i][j];
                }if (da[i][j]<min){
                    min=da[i][j];
                }
            }
        }
        System.out.println("Максиммальное значение в массиве " + max);
        System.out.println("Минимальное значение в массиве " + min);
    }
    public static void main(String[] args) {
        int[][] myDoubleArray = new int[5][5];
        myDoubleArray = setRandomNumbersToArray(myDoubleArray);
        for (int[] numbers: myDoubleArray){
            System.out.println(Arrays.toString(numbers));
        }
        showMaxAndMinInArray(myDoubleArray);

    }
}
