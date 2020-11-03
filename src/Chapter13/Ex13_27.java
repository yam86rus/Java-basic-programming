package Chapter13;

import java.util.Scanner;

//Задание 13.27
//        Напишите класс, который принимает с клавиатуры три целых числа и
//        проверяет, являются ли они тремя последовательными членами арифметической
//        прогрессии.
//        В случае если являются, класс должен вывести на экран еще 14 следующих
//        членов этой же прогрессии; в ином случае - вывести на экран
//        соответствующее текстовое сообщение.
public class Ex13_27 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        if (a2-a1 == a3-a2){
            System.out.print(a1 + " " + a2 + " " + a3 + " : ");
            for (int i=4; i<=17; i++){
                System.out.print((a3-a2)*i + " ");
            }
        }
    }
}
