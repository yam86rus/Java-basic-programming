package Chapter16;

//Задание 16.5
//        Напишите класс, который выводит на экран:
//        в первой строке все четные двузначные числа,
//        во второй строке - двузначные числа, делящиеся на 3 без остатка,
//        в третьей строке - двузначные числа, делящиеся на 4 без остатка,
//        и так далее.
public class Ex16_5 {
    public static void main(String[] args) {
        for (int j = 2; j <= 9; j++) {
            for (int i = j; i <= 99; i += j) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
