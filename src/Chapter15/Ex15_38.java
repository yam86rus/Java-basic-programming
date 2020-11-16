package Chapter15;

//Задание 15.38
//        Напишите класс, который находит наибольшее положительное двузначное число,
//        которое делится на произведение своих цифр.
public class Ex15_38 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 10; i <= 99; i++) {
            int n1 = i / 10;
            int n2 = i % 10;
            if (i % 10 != 0) {
                if ((i / (n1 * n2)) > max) {
                    max = ((i / (n1 * n2)));
                } else {
                    continue;
                }
            }
        }
        System.out.println("Ответ " + max);
    }
}
