package Chapter19;

//Задание 19.30
//        Напишите метод, который принимает в качестве параметра массив и
//        проверяет, являются ли его элементы упорядоченными по возрастанию.
public class Ex19_30 {
    public static boolean isUprise(int[] array) {
        boolean result = false;
        if (array.length <= 1) {
            return result;
        }
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] <= array[i - 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isUprise(array));
    }
}
