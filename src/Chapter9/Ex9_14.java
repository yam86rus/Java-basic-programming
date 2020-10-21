package Chapter9;

import java.util.Scanner;

//Задание 9.14
//        Определим «текстовую форму оценки» следующим образом: 1 или 2 -
//        «неудовлетворительно», 3 - «удовлетворительно», 4 - «хорошо», 5 -
//        «ОТЛИЧНО».
//        Напишите класс, который принимает с клавиатуры целое число и, если
//        оно соответствует оценке, выводит на экран соответствующую «тек-
//        стовую форму оценки». В случае если число не является оценкой, следует
//        вывести на экран соответствующее текстовое сообщение.
public class Ex9_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 5");
        int a = scanner.nextInt();
        switch (a){
            case 1:
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("ОТЛИЧНО");
                break;
        }
    }
}
