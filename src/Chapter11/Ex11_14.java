package Chapter11;

import org.w3c.dom.ls.LSOutput;

//Задание 11.14
//        Напишите класс, который выводит на экран в строку все однозначные
//        числа (в возрастающем порядке). Числа должны отделяться друг от друга
//        знаком «запятая» (допускается вывод запятой и после последнего
//        числа в серии). Перед началом вывода на экран (в отдельной строке)
//        следует вывести слова От ... , а после окончания вывода чисел (тоже в
//        отдельной строке) - слова ... и до.
public class Ex11_14 {
    public static void main(String[] args) {
        System.out.println("От ...");
        for (int i = 1; i <= 9; i++) {
            if (i < 9) {
                System.out.print(i + ",");
            } else if (i == 9) {
                System.out.print(i);

            }
        }
        System.out.println();
        System.out.println("... и до");
    }
}
