package Chapter19;

//Задание 19.17
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы первая и вторая половины массива были идентичными.
public class Ex19_17 {
    public static void main(String[] args) {
        int[] array = new int[9];
        int down = 10;
        int up = 99;
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            int a = down + (int) ((up - down + 1) * Math.random());
            array[i] = a;
            array[(array.length - 1) - i] = a;
        }
        if (array.length % 2 != 0) {
            array[array.length / 2] = down + (int) ((up - down + 1) * Math.random());;
        }

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
