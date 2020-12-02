package Chapter19;

//Задание 19.16
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы значение первого элемента было равно значению последнего,
//        значение второго элемента было равно значению предпоследнего и
//        так далее.
public class Ex19_16 {
    public static int[] foo(int[] array) {
        int down = 10;
        int up = 99;
        for (int i = 0; i <= array.length / 2 - 1; i++) {
            int random = down + (int) ((up - down + 1) * Math.random());
            array[i] = random;
            array[array.length - 1 - i] = random;
        }
        if ((array.length) % 2 != 0) {
            array[array.length / 2] = down + (int) ((up - down + 1) * Math.random());;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ar = foo(new int[10]);
        for (int n : ar) {
            System.out.print(n + " ");
        }


    }
}
