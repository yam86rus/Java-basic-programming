package Chapter20;
//Задание 20.5
//        Напишите класс, который генерирует серию из 100 случайных однозначных
//        неотрицательных чисел (цифр).
//        Класс должен определить, какая из цифр встречалась в серии чаще всего,
//        и вывести на экран соответствующую информацию. В случае если
//        максимальная «частота появления» в серии была у нескольких цифр,
//        следует вывести на экран информацию о каждой такой цифре.
public class Ex20_5 {
    public static void main(String[] args) {
        int down = 0;
        int up = 9;
        for (int i=0; i<100; i++){
            int random = down + (int) ((up - down + 1) * Math.random());
            // TODO Доделать
        }
    }
}
