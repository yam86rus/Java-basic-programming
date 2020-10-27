package Chapter11;

//Задание 11.8
//        Напишите класс, который выводит на экран (в одну строку) 15 случайных
//        чисел из диапазона -20".+35. После каждого отрицательного числа
//        следует вывести (вплотную к числу) символ«?» (знак вопроса).
public class Ex11_8 {
    public static void main(String[] args) {
        int down = -20, up = 35;
        for (int i = 1; i <= 15; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            String result = (a < 0) ? "?" : "";
            System.out.print(a + result + " ");
        }
    }
}
