package Chapter19;

//Задание 19.9
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными четными
//        числами.
public class Ex19_9 {
    public static int[] randomGenerate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 100);
            while (number % 2 != 0 | number < 10) {
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