package Chapter11;

//Задание 11.41
//        Напишите класс, который выводит на экран целые положительные
//        трехзначные числа, составленные целиком из четных цифр.
public class Ex11_41 {
    public static void main(String[] args) {
        for (int i = 200; i <= 888; i++) {
            int n1 = i / 100;
            int n2 = i / 10 % 10;
            int n3 = i % 10;
            if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
