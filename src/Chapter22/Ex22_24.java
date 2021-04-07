package Chapter22;

//Задание 22.24
//        Напишите метод, который получает в качестве параметров два двумерных
//        массива целых чисел.
//        Метод должен проверить, имеют ли массивы одинаковую «форму», то
//        есть содержат ли в строках с одинаковыми. индексами одинаковое количество
//        ячеек.
public class Ex22_24 {
    public static boolean checkForm(int[][] doubleArray1, double[][] doubleArray2) {
        if (doubleArray1.length != doubleArray2.length) {
            return false;
        }
        for (int i = 0; i < doubleArray1.length; i++) {
            if (doubleArray1[i].length != doubleArray2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] firstDoubleArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        double[][] secondDoubleArray = new double[][]{{10.00, 11.00, 12.00}, {13.00, 14.00, 15.00}};
//        double[][] secondDoubleArray = new double[][]{{10.00, 11.00, 12.00}, {13.00, 14.00, 15.00}, {17.00, 18.00, 19.00}};
        double[][] secondDoubleArray = new double[][]{{10.00, 11.00, 12.00}, {13.00, 14.00, 15.00}, {17.00, 18.00, 19.00, 20.00, 21.00, 22.00}};
        System.out.println(checkForm(firstDoubleArray, secondDoubleArray));
    }
}
