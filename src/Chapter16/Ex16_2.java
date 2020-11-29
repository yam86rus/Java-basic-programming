package Chapter16;

//Задание 16.2
//        Перед вами фрагмент класса:
//        for (int i =О; i < 4; i++)
//        for(int j=O; j<i ; j++)
//        System.out.print (ij);
public class Ex16_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < i; j++)
                System.out.print(i*j);
    }
}
