package Chapter19;

import java.util.Arrays;
import java.util.Scanner;

//Задание 19.71
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число N, создает массив размером N и заполняет его случайными
//        числами вновь и вновь до получения полноrо массива. Класс должен
//        вывести на экран окончательный массив и число итераций, которые
//        понадобились для получения полноrо массива.
public class Ex19_71 {
    static int[] createArray(int n) {
        int[] a = new int[n];
        int down = 0;
        int up = 10;
        for (int i = 0; i < n; i++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            a[i] = random;
        }
        return a;
    }

    static boolean foo1(int[] arr) {
        boolean result = false;
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int re = 0;
        while (foo1(createArray(n))!=true){
            int[] abc = createArray(n);
            System.out.println(Arrays.toString(abc));
            foo1(abc);
            re++;
        }
        System.out.println(re);


    }
}
