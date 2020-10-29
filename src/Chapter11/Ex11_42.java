package Chapter11;

//Задание 11.42
//        Напишите класс, который выводит на экран все целые трехзначные
//        числа (и положительные, и отрицательные), соответствующие следующему
//        требованию: эти числа делятся без остатка на сумму собственных
//        цифр.
public class Ex11_42 {
    public static void main(String[] args) {
        for (int i = -999; i <= -100; i++) {
            int summa = i / 100 + i / 10 % 10 + i % 10;
            if (i % summa == 0) System.out.print(i + " ");
        }
        for (int i = 100; i <= 999; i++) {
            int summa = i / 100 + i / 10 % 10 + i % 10;
            if (i % summa == 0) System.out.print(i + " ");
        }
    }
}
