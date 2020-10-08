package Chapter19;
//Задание 19.11
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами, у
//        каждого из которых цифра десятков равна цифре единиц.
public class Ex19_11 {
    public static int[] randomGenerate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = (int) (Math.random() * 10);
            array[i] = number+10;
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
