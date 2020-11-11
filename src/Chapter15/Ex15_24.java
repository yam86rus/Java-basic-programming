package Chapter15;

import java.util.Collections;
import java.util.Scanner;

//Задание 15.24
//        Напишите класс, который принимает с клавиатуры целое число и выводит
//        на экран:
//        • в первой строке - все четные (по месту) цифры этого числа, через
//        пробел;
//        • во второй строке - все нечетные (по месту) цифры этого числа,
//        через пробел.
//        Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
//        а во второй строке - 7 5 7.
public class Ex15_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        String str = "" + a;
        int count = 0;

        StringBuilder str1 = new StringBuilder(); // четные по месту
        StringBuilder str2 = new StringBuilder(); // нечетные по месту
        for (int i = 1; i <= str.length(); i++) {
            if (i%2==0){
                str2.append(a%10 +" ");
                a /=10;
            } else {
                str1.append(a%10 + " ");
                a /=10;
            }
        }

        System.out.println(str1.reverse().toString().trim());
        System.out.println(str2.reverse().toString().trim());

    }

}
