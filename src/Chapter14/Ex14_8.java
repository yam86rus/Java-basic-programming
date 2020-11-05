package Chapter14;

//Задание 14.8
//        Напишите класс, который генерирует 15 целых положительных трехзначных
//        чисел и выводит на экран число, сумма цифр которого была
//        минимальной.
public class Ex14_8 {
    public static void main(String[] args) {
        int down = 100, up = 999;
        int b = down + (int) ((up - down + 1) * Math.random());
        int max = b / 100 + b / 10 % 10 + b % 10;
        int n = 1;
        for (int i = 1; i <= 14; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            System.out.print(a + " ");
            if ((a / 100) + (a / 10 % 10) + (a % 10) > max) {
                max = (a / 100) + (a / 10 % 10) + (a % 10);
                n = i;
            }
        }
        System.out.println();
        System.out.println("Ответ " + max + " получено он числа под номером " + n);
    }
}
