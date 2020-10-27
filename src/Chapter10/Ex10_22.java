package Chapter10;

//Задание 10.22
//        Отрезок в прямоугольной (декартовой) системе координат задается
//        двумя парами чисел: xl, yl определяют положение (координаты) начала
//        отрезка (точка А), а х2, у2 определяют положение (координаты)
//        конца отрезка (точка В).
//        Напишите класс, который генерирует и выводит на экран две пары
//        случайных целых числа из диапазона от -30 до +30: первая пара - координаты
//        точки А, вторая - координаты точки В.
//        Класс должен определить (и вывести на экран соответствующую информацию):
//        • длину отрезка;
//        • округленную длину отрезка (но не больше истинного!);
//        • угол (в градусах), который образует отрезок с осью Х;
//        • какую ось пересекает отрезок, и пересекает ли он какую-либо ось
//        вообще.
public class Ex10_22 {
    public static void main(String[] args) {
        int down = -30, up = 30;
        int x1 = down + (int) ((up - down + 1) * Math.random());
        int y1 = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Координаты первой точки: x1=" + x1 + ", y1=" + y1);
        int x2 = down + (int) ((up - down + 1) * Math.random());
        int y2 = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Координаты второй точки: x2=" + x2 + ", y2=" + y2);

        // расчет длины
        double dlina = 0.00;
        int resX = 0, resY = 0;
        if (x1 > 0 && x2 > 0 || x1 < 0 && x2 < 0) {
            resX = Math.abs(Math.abs(x1) - Math.abs(x2)); // длина по X
        }
        if (y1 > 0 && y2 > 0 || y1 < 0 && y2 < 0) {
            resY = Math.abs(Math.abs(y1) - Math.abs(y2)); // длина по Y
        }
        if (x1 > 0 && x2 < 0 || x1 < 0 && x2 > 0) {
            resX = Math.abs(x1) + Math.abs(x2);
        }
        if (y1 > 0 && y2 < 0 || y1 < 0 && y2 > 0) {
            resY = Math.abs(y1) + Math.abs(y2);
        }
        dlina = Math.sqrt(resX * resX + resY * resY);
        System.out.println("Длина отрезка " + dlina);
        System.out.println("Округленная длина отрезка " + (int) dlina);
        System.out.println("Угол (в градусах), который образует отрезок с осью Х: " + Math.sin(resY / dlina));

        if (x1 > 0 && x2 < 0 || x1 < 0 && x2 > 0) {
            System.out.println("Пересекает ось X");
        }
        if (y1 > 0 && y2 < 0 || y1 < 0 && y2 > 0) {
            System.out.println("Пересекает ось Y");
        }
        if ((x1 > 0 && x2 > 0 || x1 < 0 && x2 < 0) && (y1 > 0 && y2 > 0 || y1 < 0 && y2 < 0)) {
            System.out.println("Не пересекат ни одну из осей");
        }
    }
}
