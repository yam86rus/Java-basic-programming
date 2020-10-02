package Chapter17;

//Задание 17.8
//        Напишите метод, который принимает в качестве параметра число и
//        возвращает:
//        • -1 - в случае если число отрицательное;
//        • О - в случае если число равно О;
//        • 1 - в случае если число положительное.


public class Ex17_8 {
    //    мой 1 вариант
//    public static int check(int i) {
//        int result = 0;
//        if (i > 0) result = 1;
//        if (i < 0) result = -1;
//        if (i == 0) result = 0;
//        return result;
//    }
//    вариант из учебника
//    public static int check(int i) {
//        if (i > 0) {
//            return 1;
//        } else if(i == 0) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    //    3 вариант
    static int check(int i) {
        if(i<0) return -1;
        if(i>0) return 1;
        else return 0;
    }
}

class Ex17_8Test {
    public static void main(String[] args) {
        System.out.println(Ex17_8.check(10));
        System.out.println(Ex17_8.check(-10));
        System.out.println(Ex17_8.check(0));
    }
}
