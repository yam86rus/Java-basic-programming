package Chapter9;

import java.util.Scanner;

//Задание 9.33
//        Напишите класс, который принимает с клавиатуры два целых положительных
//        числа, которые должны представлять числитель (первое) и
//        знаменатель(второе)дроби.
//        В случае если введенные значения образуют правильную дробь, следует
//        вывести на экран соответствующее текстовое сообщение.
//        В случае если введенные значения образуют неправильную дробь, следует
//        вывести ее на экран в виде смешанной дроби.
public class Ex9_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель");
        int a = scanner.nextInt();
        System.out.println("Введите знаменатель");
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println("Правильная дробь");
        } else if (a > b) {
            System.out.println(a / b + " " + a % b + '/' + b);
        }
    }
}
