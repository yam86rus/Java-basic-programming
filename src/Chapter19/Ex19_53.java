package Chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 19.53
//        Напишите метод, который принимает в качестве параметра массив
//        целых чисел А и возвращает новый массив В, состоящий из элементов
//        массива А, упорядоченных так, чтобы все четные элементы массива А
//        находились в начале массива В, а все нечетные - в его конце.
public class Ex19_53 {
    static int[] foo (int[] arr){
        List <Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        int [] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int [] B = foo(A);
        System.out.println(Arrays.toString(B));
    }
}
