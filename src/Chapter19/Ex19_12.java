package Chapter19;
//Задание 19.12
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами, у
//        каждого из которых цифра десятков больше цифры единиц.
public class Ex19_12 {
    public static int[] randomGenerate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 100);
            while (number < 21) {
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
