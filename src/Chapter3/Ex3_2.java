package Chapter3;

import java.util.Scanner;

//Задание 3.2
//        Во многих странах для измерения небольших размеров используется
//        не только единица длины «сантиметр», но и такая единица, как
//        «дюйм>> (1дюйм=2.54 сантиметра).
//        Напишите класс, который принимает с клавиатуры значение, равное
//        размеру в сантиметрах, и затем подсчитывает и выводит на экран это
//        же значение, но в дюймах.
public class Ex3_2 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значение в сантиметрах");
        int a = reader.nextInt();
        System.out.println("" + a + " см. = " + (a / 2.54) + " дюйма");
    }
}
