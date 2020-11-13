package Chapter15;

import java.util.Scanner;

//Задание 15.37
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число х. Класс должен найти наименьшее целое положительное
//        двузначное число, сумма цифр которого равна х.
//        Если такого двузначного числа не существует, следует вывести на экран
//        соответствующее текстовое сообщение.
public class Ex15_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i/10 +i%10)==a){
                result = i;
                break;
            }
        }
        if (result==0){
            System.out.println("Такого двухзначного числа не существует");
        } else System.out.println(result);
    }
}
