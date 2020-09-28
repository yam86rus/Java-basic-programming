package Chapter6;

import java.util.Scanner;

public class Ex6_1 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = reader.nextInt();
        if (x < y) System.out.println("x меньше y");
        if (x < y) System.out.println("x теперь меньше y");
        if (x == y) System.out.println("x теперь равна y");
        if (x > y) System.out.println("x теперь больше y");
    }
}

//1. "x меньше y"
//2. "x теперь равна y"
//3. "x теперь больше y"
//4. 1,2
//5. 2,1
//6. изменить первое условие на if(x < y) System.out.println("x теперь меньше y");