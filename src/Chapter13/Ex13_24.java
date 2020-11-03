package Chapter13;

//Задание 13.24
//        Напишите класс, который создает серию из 20 случайных чисел из
//        диапазона 30 ... 49. Числа в серии следует вывести на экран в одну строку
//        следующим образом:
//        • перед значениями, которые меньше первого в серии, вывести знак
//        «минус»;
//        • перед значениями, которые больше первого в серии, вывести знак
//        «ПЛЮС».
public class Ex13_24 {
    public static void main(String[] args) {
        int down = 30, up = 49;
        int firstNumber = down + (int) ((up - down + 1) * Math.random());
        System.out.print(firstNumber + " ");
        for (int i = 1; i <= 19; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            if (a<firstNumber) {
                System.out.print("-"+a);
            } else if (a>firstNumber){
                System.out.print("+"+a);
            }
        }
    }
}
