package Chapter10;

import org.w3c.dom.ls.LSOutput;

//Задание 10.17
//        Напишите класс, который генерирует длины сторон катетов прямоугольного
//        треугольника так, чтобы длина катета не превышала 10.5 см.
//        Класс должен подсчитать длину гипотенузы этого треугольника, его
//        площадь и периметр и вывести их на экран.
//        Затем эти вычисленные значения следует округлить и вывести результат
//        на экран в отдельной строке вместе с соответствующим текстовым
//        сообщением.
public class Ex10_17 {
    public static void main(String[] args) {
        double down = 1.00, up = 10.5;
        double a = down + ((up - down + 1) * Math.random()); // 1-й катет
        double b = down + ((up - down + 1) * Math.random()); // 2-й катет
        double f = Math.sqrt(a * a + b * b); // гипотенуза
        double areaTriangle = 0.5 * ((int)a * (int)b); // площадь прямоугольного треугольника
        double perimeter = (int)a + (int)b + (int)f; // периметр
        System.out.println("Дан прямоугольный треугольник");
        System.out.println("1-й катет длинной " + a + " с округлением " + (int) a);
        System.out.println("2-й катет длинной " + b + " с округлением " + (int) b);
        System.out.println("гипотенуза  " + f + " с округлением " + (int) f);
        System.out.println("Площадь прямоугольного треугольника (окрегление): " + (int)areaTriangle + " ед. кв.");
        System.out.println("Периметр треугольника: (округление) " + (int) perimeter + " ед.");
    }
}
