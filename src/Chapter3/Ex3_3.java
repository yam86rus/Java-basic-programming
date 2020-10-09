package Chapter3;

import java.util.Scanner;

//Задание 3.3
//        Во многих странах для измерения небольших размеров используется
//        не только единица длины «сантиметр», но и такая единица, как
//        «дюйм» (1 дюйм= 2.54 сантиметра).
//        Напишите класс, который принимает с клавиатуры значение, равное
//        размеру в дюймах, и затем подсчитывает и выводит на экран это же
//        значение, но в сантиметрах.
public class Ex3_3 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значение в дюймах");
        int a = reader.nextInt();
        System.out.println("" + a + " дюймов = " + (a * 2.54) + " см.");
    }
}
