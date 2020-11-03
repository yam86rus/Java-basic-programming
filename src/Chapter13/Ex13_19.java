package Chapter13;

import org.w3c.dom.ls.LSOutput;

//Задание 13.19
//        Назовем «стабильным» положительное двузначное число, которое при
//        умножении на 2 дает такое двузначное число, в котором сумма цифр
//        равна сумме цифр в двузначном числе до умножения.
//        Напишите класс, который выводит на экран все «стабильные» числа, а
//        также их количество и сумму этих чисел.
public class Ex13_19 {
    public static void main(String[] args) {
        int count = 0;
        int summa = 0;
        for (int i = 10; i <= 50; i++) {
            int n = i * 2;
            int n1 = n / 10;
            int n2 = n % 10;
            if (n1 + n2 == i / 10 + i % 10) {
                System.out.print(i + " ");
                count++;
                summa +=i;
            }
        }
        System.out.println();
        System.out.println("Количество \"стабильных\" чисел = " + count);
        System.out.println("Сумма \"стабильных\" чисел = " + summa);
    }
}
