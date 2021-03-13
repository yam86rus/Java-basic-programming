package Chapter22;

import java.util.Arrays;

//Задание 22.8
//        Напишите метод, который получает в качестве параметров двумерный
//        массив целых чисел и целое число Х.
//        Метод заменяет в массиве-параметре все значения, отличные от Х, на
//        значение О (ноль).
public class Ex22_8 {
    static int[][] foo(int[][] da) {
        int down = 1;
        int up = 3;
        for (int i = 0; i < da.length; i++) {
            int rn = down + (int) ((up - down + 1) * Math.random());
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = rn;
            }
        }
        return da;
    }
    static int[][] foo1 (int[][] da, int n){
        for (int i=0; i< da.length;i++){
            for (int j=0; j<da[i].length; j++){
                if (da[i][j]!=n){
                    da[i][j]=0;
                }
            }
        }
        return da;
    }

    public static void main(String[] args) {
        int[][] da = new int[5][5];
        int[][] dq1 = foo(da);
        for(int [] i: dq1){
            System.out.println(Arrays.toString(i));
        }
        int n = 3;
        System.out.println("---");
        dq1 = foo1(dq1,n);
        for (int[] i: dq1){
            System.out.println(Arrays.toString(i));
        }

    }
}
