package Chapter19;

import java.util.Arrays;

//Задание 19.67
//        Напишите метод, который принимает в качестве параметра массив четного
//        размера, пары ячеек которого (первая и вторая, третья и четвертая,
//        пятая и шестая ... и так далее) содержат координаты (Х и У) точек.
//        Массив должен вернуть номер точки наиболее удаленной от начала
//        координат.
public class Ex19_67 {
    static int foo(int[] arr) {
        int result = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (result < (arr[i] + arr[i + 1])) {
                result = arr[i] + arr[i + 1];
                n = i;
            }
        }
        return n;

    }

    public static void main(String[] args) {
        int[] a = {3,10,1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Пара № " + (foo(a)));

    }
}
