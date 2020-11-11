package Chapter15;

import java.util.Scanner;

//        Задание 15.26
//                Напишите класс, который принимает с клавиатуры целое положительное
//                число, а затем генерирует случайную цифру.
//                Класс должен определить, встречается ли во введенном с клавиатуры
//                числе сгенерированная цифра, и вывести на экран соответствующее
//                сообщение.
public class Ex15_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        String a= scanner.next();
        int b = (int)((10)*Math.random());
        System.out.println("Сгенерировано случайная цифра " + b);
        if (a.contains(""+b)){
            System.out.println("В числе " + a + " есть случайно сгенерированная цифра " + b);
        } else {
            System.out.println("В числе " + a + " нет случайно сгенерированной цифры " + b);
        }
    }
}
