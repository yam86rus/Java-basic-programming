package Chapter9;

import java.util.Scanner;

//Задание 9.9
//        Напишите класс, который принимает с клавиатуры коэффициенты а и
//        Ь линейного уравнения (уравнения первой степени - ах+Ь=О) и решает
//        его, - то есть выводит на экран или корень (корни) уравнения, или соответствующее
//        смыслу текстовое сообщение.
public class Ex9_9 {
    void abc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дано линейное уравнение вида: ax + b = 0");
        System.out.println("Введите первый коэфициент линейного уравнения");
        int a = scanner.nextInt();
        System.out.println("Введите второй коэфициент линейного уравнения");
        int b = scanner.nextInt();
        double result = (b * -1) / a;
        if (a == 0 && b == 0) {
            System.out.println("решений бесконечно много");
        } else if (a == 0 && b != 0) {
            System.out.println("у уравнения не может быть корней");
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Ex9_9 test = new Ex9_9();
        test.abc();
    }

}
