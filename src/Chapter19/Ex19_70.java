package Chapter19;

//Задание 19.70
//        Массив целых чисел размером N называется полным, если он содержит
//        все числа от 1 до N включительно. Напишите метод, который принимает
//        в качестве параметра массив и проверяет, является ли он полным.
public class Ex19_70 {
    static boolean foo(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i + 1)
                result = true;
            else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(foo(arr));
    }
}
