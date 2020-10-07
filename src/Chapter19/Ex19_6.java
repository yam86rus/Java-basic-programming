package Chapter19;

import java.util.Iterator;

//Задание 19.6
//        Напишите метод, который получает в качестве параметра массив и
//        выводит на экран содержащиеся в нем значения в одну строку через
//        пробел между значениями.
public class Ex19_6 {

//    public static void show(String[] array) {
//        System.out.println(array.toString());
//    }

    public static void show(String[] array){
        // первый вариант
        for (String s: array){
            System.out.print(s + " ");
        }
//        второй вариант
//        for (int i=0; i<array.length; i++){
//            System.out.print(array[i] + " ");
//        }


    }

    public static void main(String[] args) {
        String[] array1 = {"one", "two", "three"};
        show(array1);
        System.out.println();
        show(new String[]{"Иванов", "Петров", "Cидоров"});

    }
}
