package Chapter17;

//Задание 17.12
//        Напишите метод, который принимает в качестве параметра целое число
//        и возвращает самую большую цифру в этом числе.
public class Ex17_12 {

//    мое решение
    static int foo(int a) {
        int result = 0;
        StringBuilder sb = new StringBuilder("" + a);
        for (int i = 0; i < sb.length(); i++) {
            if((sb.charAt(i)-'0')> result){
                result = sb.charAt(i)-'0';
            }
        }
        return result;
    }


//    решение из учебника
    public static int what (int t) {
        int max = t%10;
        while(t>0){
            t /=10;
            if(t%10>max) max=t%10;
        }
        return max;
    }

    public static void main(String[] args) {
//        мое решение
        System.out.println("Максимальное цифра: " + foo(234));
        System.out.println("Максимальное цифра: " + what(234));



    }
}
