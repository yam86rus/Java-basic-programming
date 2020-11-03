package Chapter13;

//Задание 13.20
//        Напишите класс, который выводит на экран все двузначные числа, у
//        которых куб суммы его цифр равен квадрату самого числа.
//        Класс также должен подсчитывать (и выводить на экран с соответствующим
//        текстовым сообщением) количество и сумму этих чисел.
public class Ex13_20 {
    public static void main(String[] args) {
        int count = 0;
        int summa = 0;
        for (int i = 10; i <= 99; i++) {
            int n1 = i / 10;
            int n2 = i % 10;
            double n3 = Math.pow((n1 + n2), 3);


            if (n3 == i*i) {
                System.out.print(i + " ");
                count++;
                summa += i;
            }
        }
        System.out.println();
        System.out.println("Количество чисел = " + count);
        System.out.println("Сумма чисел = " + summa);
    }
}
