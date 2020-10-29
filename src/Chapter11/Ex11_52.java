package Chapter11;

import java.util.Scanner;

//Задание 11.52
//        Напишите класс, который принимает с клавиатуры целое положительное
//        число N и выводит на экран серию N+(N-l)+(N-2)+ ... + 1, то есть серию
//        целых положительных последовательных чисел, начиная с введенного
//        с клавиатуры значения и до 1 (числа при выводе на экран
//        должны разделяться знаком+).
public class Ex11_52 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
        if(i==1){
            System.out.println(i);
        } else
            System.out.print(i + "+");
        }
    }
}
