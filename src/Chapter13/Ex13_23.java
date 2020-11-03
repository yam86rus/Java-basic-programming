package Chapter13;

//Задание 13.23
//        Напишите класс, который выводит на экран все двузначные числа, у
//        которых удвоенная сумма цифр равна их произведению.
//        Класс также должен подсчитывать (и выводить на экран с соответствующим
//        текстовым сообщением) количество и сумму этих чисел.
public class Ex13_23 {
    public static void main(String[] args) {
        int count = 0, summ = 0;
        for (int i = 10; i <= 99; i++) {
            int n1 = i / 10;
            int n2 = i % 10;
            if ((n1 + n2) * 2 == n1 * n2) {
                System.out.print(i + " ");
                summ += i;
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество " + count);
        System.out.println("Сумма " + summ);
    }
}
