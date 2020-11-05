package Chapter14;

//Задание 14.7
//        Напишите класс, который генерирует 20 целых положительных двузначных
//        чисел и выводит на экран число, сумма цифр которого была
//        максимальной.
public class Ex14_7 {
    public static void main(String[] args) {
        int down = 10, up = 99;
        int b = down + (int) ((up - down + 1) * Math.random());
        int max = b / 10 + b % 10;
        int n =1;
        for (int i = 1; i <= 19; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            System.out.print(a + " ");
            if ((a / 10) + (a % 10) > max) {
                max = (a / 10) + (a % 10);
                n = i;
            }
        }
        System.out.println();
        System.out.println("Ответ " + max + " получено он числа под номером " + n);
    }
}
