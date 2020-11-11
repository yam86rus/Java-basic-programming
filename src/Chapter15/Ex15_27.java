package Chapter15;

import java.util.Scanner;

//Задание 15.27
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число, а затем генерирует случайную цифру.
//        Класс должен определить, встречается ли во введенном с клавиатуры
//        числе сгенерированная цифра (сколько раз и на каких позициях), и
//        вывести на экран соответствующую информацию.
public class Ex15_27 {
    static int summ (int a){ // количество цифр
        int result = 0;
        while (a>0){
            result++;
            a /=10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a= scanner.nextInt();
        int iter = summ(a); // количество цифр
        int b = (int)((10)*Math.random());
        System.out.println("Сгенерировано случайная цифра " + b);
        int count = 0; // сколько раз встречается цифра
        StringBuilder pos = new StringBuilder(); // на каких позициях храним
        for (int i=1; i<=iter;i++){
            if (a%10 == b){
                count++;
                pos.append(a%10);
            }
            a /=10;
        }
        System.out.println(pos.reverse());
        System.out.println("Встретилось " + count + " раз");


    }
}
