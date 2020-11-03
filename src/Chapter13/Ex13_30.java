package Chapter13;

import java.util.Scanner;

//Задание 13.30
//        Производственный участок выпускает стальные шарики, диаметр которых
//        должен быть равен 24 миллиметрам (допустимое отклонение не
//        более 2 миллиметров), а вес - 74 граммам (допустимое отклонение не
//        более 3 грамм).
//        Напишите класс, который принимает данные 120 шариков, для каждого
//        из них определяет, соответствуют ли его параметры указанным
//        стандартам, и выводит на экран для каждого шарика соответствующее
//        текстовое сообщение.
public class Ex13_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fail = "Не соответствует стандарту";
        for (int i = 1; i <= 2; i++) {
            System.out.println("Введите диаметр в миллиметрах");
            int a = scanner.nextInt();
            if (a > 26) {
                System.out.println(fail);
                continue;
            } else {
                System.out.println("Введите вес в граммах");
                int b = scanner.nextInt();
                if (b > 77) {
                    System.out.println(fail);
                    continue;
                } else {
                    System.out.println("Шарик под номером " + i + " имеет диаметр " + a + "  мм, и вес " + b + " гр. И соответствует стандарту");
                }
            }
        }
    }
}
