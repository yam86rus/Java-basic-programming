package Chapter17;

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
