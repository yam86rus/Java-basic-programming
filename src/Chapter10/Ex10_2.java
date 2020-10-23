package Chapter10;

//Задание 10.2
//        Напишите класс, который генерирует и выводит на экран 2 случайных
//        целых числа из диапазона «однозначные» (включая и положительные,
//        и отрицательные).
//        После этого в отдельной строке класс должен вывести наибольшее из
//        этих двух чисел - с соответствующим текстовым сообщением.
public class Ex10_2 {
    public static void main(String[] args) {
        int a, b, down = -10, up = 10;
        a = down + (int) ((up - down + 1) * Math.random());
        b = down + (int) ((up - down + 1) * Math.random());
        System.out.println(a + " " + b);
        int max = (a > b) ? a : b;
        System.out.println(max);


    }
}
