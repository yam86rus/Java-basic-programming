package Chapter19;


import java.util.*;

//Задание 19.18
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы они образовывали неубывающую последовательность (каждый
//        элемент не меньше предыдущего).
public class Ex19_18 {
    static List<Integer> arrayGenerate(int length) {
        List<Integer> list = new ArrayList<>();
        int down = 10;
        int up = 99;
        int count = 0;
        while (count < length) {
            int a = down + (int) ((up - down + 1) * Math.random());
            if (!list.contains(a)) {
                list.add(a);
                count++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int a = scanner.nextInt();
        List<Integer> list2 = arrayGenerate(a);
        Collections.sort(list2);
        System.out.println(list2);

    }
}
