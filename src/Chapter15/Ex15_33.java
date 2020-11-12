package Chapter15;

import java.util.Scanner;

//Задание 15.33
//        Напишите класс, который принимает с клавиатуры целое число (для
//        переменной х) и выводит на экран серию значений: х, х2 , х3 ••• х0 до тех
//        пор, пока очередное значение остается меньше 1000.
public class Ex15_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        while (a<1000){
            System.out.print(a + ", ");
            a++;
        }
    }
}
