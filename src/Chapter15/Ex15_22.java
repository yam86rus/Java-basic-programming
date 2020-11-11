package Chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Задание 15.22
//        Напишите класс, который вводит с клавиатуры 15 целых положительных
//        чисел, для каждого введенного числа класс должен напечатать
//        сумму его цифр.
//        После окончания ввода класс выведет на экран порядковый номер
//        числа с самой большой суммой цифр.
public class Ex15_22 {
    int summ(int a) {
        int result = 0;
        while (a > 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex15_22 test = new Ex15_22();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            int c = scanner.nextInt();
            System.out.println("Сумма цифр числа " + c + ":  " + test.summ(c));
            arrayList.add(c);
        }
        System.out.println(arrayList);
        Integer maxValue = Collections.max(arrayList);
        Integer maxIdx = arrayList.indexOf(maxValue);
        System.out.println("Самое большое значение из всех введеных " + maxValue);
        System.out.println("Номер этого значения  " + maxIdx);
    }
}
