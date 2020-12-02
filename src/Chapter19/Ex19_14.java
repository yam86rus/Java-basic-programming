package Chapter19;

//Задание 19.14
//        Напишите метод, который получает в качестве параметра массив и
//        заполняет его положительными случайными двузначными числами
//        так, чтобы цифра десятков каждого элемента массива была равна цифре
//        единиц следующего элемента.
public class Ex19_14 {
    static int[] foo(int[] array) {
        int down = 10;
        int up = 99;
        array[0] = down + (int) ((up - down + 1) * Math.random());
        for (int i = 1; i <= array.length - 1; i++) {
            int randomNumber = (down + (int) ((up - down + 1) * Math.random()));
            array[i] = (randomNumber / 10 * 10) + (array[i - 1] / 10);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] newArray = new int[10];
        int[] array2 = foo(newArray);
        for (int n : array2) {
            System.out.print(n + " ");
        }
    }
}
