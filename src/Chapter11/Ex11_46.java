package Chapter11;

//Задание 11.46
//        Напишите класс, который выводит на экран (в строку с пробелами) все
//        трехзначные целые положительные числа, соответствующие следующему
//        требованию: две последних цифры (десятков и единиц) образуют
//        двузначное число, делящееся без остатка на первую цифру (сотен).
public class Ex11_46 {
    public static void main(String[] args) {
        int n1, n2, n3, summ;
        for (int i = 100; i <= 999; i++) {
            n1 = i / 100;
            n2 = i / 10 % 10;
            n3 = i % 10;
            summ = n1 * 10 + n2;
            if (summ % n1 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}