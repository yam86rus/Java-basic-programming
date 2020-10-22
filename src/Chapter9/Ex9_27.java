package Chapter9;

import java.util.Scanner;

//Задание 9.27
//        Напишите класс, который принимает с клавиатуры два положительных
//        числа - двузначное и четырехзначное - и проверяет, сколько раз двузначное
//        число фигурирует как «внутреннее» по отношению к четырехзначному.
public class Ex9_27 {
    static int showCount(int n1, int n2) {
        int result = 0;
        if (n2 / 100 == n1) result++;
        if (n2 % 100 == n1) result++;
        if (n2 / 10 % 100 == n1) result++;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
        int n1 = scanner.nextInt();
        System.out.println("Введите четырехзначное число");
        int n2 = scanner.nextInt();
        System.out.println("Число повторений " + showCount(n1, n2));
    }
}
