package Chapter22;

import java.util.Arrays;

//Задание 20.21
//        Транспортная компания осушествляет работу 10 маршрутов городских
//        автобусов. В конце каждого дня регистрируется выручка по каждому из
//        маршрутов, а в конце недели составляется итоговый отчет.
//        Напишите класс, который моделирует сбор соответствующей информации
//        и выводит на экран итоговые недельные поступления от каждого
//        из 10 маршрутов.
public class Ex22_21 extends Ex22_21_Base{

    public static void main(String[] args) {
        int[][] buses = generateArray(7,10);
        buses = setRandomNumbersToArrayWithParam(buses, 10000, 20000);
        showWeekInfo(buses);
    }
}
