package Chapter11;

import javafx.scene.effect.ImageInput;

//Задание 11.18
//        Напишите КJ1асс, который выводит на экран в строку положительные
//        четырехзначные числа, заканчивающиеся на 00 (в убывающем порядке).
//        Числа должны отделяться друг от друга знаком «пробел». Перед
//        началом и после окончания вывода серии чисел на экран вывода следует
//        вывести текстовые сообщения (по выбору).
public class Ex11_18 {
    public static void main(String[] args) {
        System.out.println("Начало");
        for (int i = 9900; i >= 1000; i -= 100) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Конец");
    }
}
