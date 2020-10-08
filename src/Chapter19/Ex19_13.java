package Chapter19;

//Задание 19.13
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами, у
//        каждого из которых сумма цифр делится на 9 без остатка.
public class Ex19_13 {
    public static int[] randomGenerate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 100);
            boolean result = true;
            while ((number % 10 + number / 10) % 9 != 0 | number < 10) {
                number = (int) (Math.random() * 100);
            }
            array[i] = number;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = new int[20];
        randomGenerate(myArray);
        for (int i : myArray) {
            System.out.print(i + " ");
        }

    }
}
