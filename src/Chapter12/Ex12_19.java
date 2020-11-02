package Chapter12;

import java.util.Scanner;

//Задание 12.19
//        Напишите класс, который принимает с клавиатуры следующие данные:
//        • центр окружности (два действительных числа);
//        • радиус окружности;
//        • 15 пар координат точек на плоскости.
//        Класс должен вывести на экран количество точек, лежащих внутри окружности
//        и количество точек, лежащих на окружности.
public class Ex12_19 {

    //метод возвращает длину отрезка по 4-м координатам
    static double dlinaOtrezka(int x1, int y1, int x2, int y2) {
        // расчет длины отрезка по координатам
        // x1,y1 - координаты первой точки
        // x2,y2 - координаты второй точки

        double dlina = 0.00; // длина отрезка

        int resX = 0, resY = 0;
        if (x1 > 0 && x2 > 0 || x1 < 0 && x2 < 0) {
            resX = Math.abs(Math.abs(x1) - Math.abs(x2)); // проекция ортезка по оси X
        }
        if (y1 > 0 && y2 > 0 || y1 < 0 && y2 < 0) {
            resY = Math.abs(Math.abs(y1) - Math.abs(y2)); // проекция ортезка по оси Y
        }
        if (x1 > 0 && x2 < 0 || x1 < 0 && x2 > 0) {
            resX = Math.abs(x1) + Math.abs(x2); // проекция ортезка по оси X
        }
        if (y1 > 0 && y2 < 0 || y1 < 0 && y2 > 0) {
            resY = Math.abs(y1) + Math.abs(y2); // проекция ортезка по оси Y
        }
        dlina = Math.sqrt(resX * resX + resY * resY); // длина отрезка в системе координат
        return dlina;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите центр окружность, координата X");
        int x = scanner.nextInt();
        System.out.println("Введите центр окружность, координата Y");
        int y = scanner.nextInt();
        System.out.println("Введите радиус окружности");
        int r = scanner.nextInt();
        int pointIn = 0; // количество точека, лежащие внутри
        int pointOut = 0; // количество точека, лежащие снаружи
        for (int i = 1; i <= 2; i++) {
            System.out.println("Введите координуту X точки " + i);
            int a = scanner.nextInt();
            System.out.println("Введите координуту Y точки " + i);
            int b = scanner.nextInt();
            if (dlinaOtrezka(x, y, a, b) < r) pointIn++;
            if (dlinaOtrezka(x, y, a, b) > r) pointOut++;
        }
        System.out.println("количество точек, лежащее внутри окружности: " + pointIn);
        System.out.println("количество точек, лежащее снаружи окружности: " + pointOut);

    }
}
