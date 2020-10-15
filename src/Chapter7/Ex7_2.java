package Chapter7;
//Задание 7.2
//        Дан программный блок (часть программы):

//1. Заполните недостающие текстовые сообщения (в скобках) в соответствии
//        со смыслом получаемых результатов.
//        2. Приведите несколько примеров вводимых с клавиатуры выражений,
//        для которых на экран выводятся соответствующие текстовые
//        сообщения.
import java.util.Scanner;

public class Ex7_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int digitl = a / 10;
        int digit2 = a % 10;
        if (digitl == digitl) System.out.println("первая и последния цифры - равны");
        else System.out.println("первая и последния цифры - не равны");
    }
}
