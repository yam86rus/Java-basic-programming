package Chapter20;

import java.util.Arrays;

//Задание 20.5
//        Напишите класс, который генерирует серию из 100 случайных однозначных
//        неотрицательных чисел (цифр).
//        Класс должен определить, какая из цифр встречалась в серии чаще всего,
//        и вывести на экран соответствующую информацию. В случае если
//        максимальная «частота появления» в серии была у нескольких цифр,
//        следует вывести на экран информацию о каждой такой цифре.
public class Ex20_5 {
    public static void main(String[] args) {
        int [] array = new int[100];
        int down = 0;
        int up = 9;
        for (int i=0; i<100; i++){
            array[i] = down + (int) ((up - down + 1) * Math.random());
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int count=0;
        int result=0;
        for(int i=0; i<array.length-1;i++){
            if (array[i]==array[i+1]){
                count++;
                result = array[i];
            }
        }
        System.out.println(result + " встречается " + count + " раз");
    }
}
