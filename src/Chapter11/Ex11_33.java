package Chapter11;

//Задание 11.П
//        Напишите класс, который выводит на экран положительные трехзначные
//        числа, делящиеся без остатка на 11 (начиная с наименьшего).
public class Ex11_33 {
    public static void main(String[] args) {
        for (int i = 110; i <= 990; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
