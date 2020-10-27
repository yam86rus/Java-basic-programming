package Chapter10;

//Задание 10.21
//        Положение точки в прямоугольной (декартовой) системе координат
//        определяется двумя числам: координатами Х и У.
//        Напишите класс, который генерирует и выводит на экран два случайных
//        целых числа из диапазона от-30 до +30.
//        Класс должен определить (и вывести на экран соответствующую информацию):
//        • в какой четверти расположена точка;
//        • к какой из осей она ближе;
public class Ex10_21 {
    public static void main(String[] args) {
        int down = -30, up = 30;
        int x = down + (int) ((up - down + 1) * Math.random());
        int y = down + (int) ((up - down + 1) * Math.random());
        System.out.println("Сгенерированы случайные координаты точки. x=" + x + " y=" + y);
        int chetvert = 0;
        if (x < 0 && y > 0) {
            chetvert = 1;
        } else if (x > 0 && y > 0) {
            chetvert = 2;
        } else if (x < 0 && y < 0) {
            chetvert = 3;
        } else if (x > 0 && y < 0) {
            chetvert = 4;
        } else {
            chetvert = 0; //невозможно определить четверть
        }

        if (chetvert == 0) {
            System.out.println("Невозможно определить в какой четверти расположена точка, так как она лежит на оси/осях");
        } else {
            System.out.println("Точка расположена в " + chetvert + " четверти");
        }
//        System.out.println("Точка ближе к оси");
        if (Math.abs(x) < Math.abs(y)) {
            System.out.println("Точка ближе к оси X");
        } else if (Math.abs(y) < Math.abs(x)) {
            System.out.println("Точка ближе к оси y");
        } else {
            System.out.println("Точка одинаково близка к оси X и Y");

        }
    }
}
