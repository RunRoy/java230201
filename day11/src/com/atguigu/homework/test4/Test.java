package com.atguigu.homework.test4;

import static com.atguigu.homework.test4.Data.EQUIPMENTS;

/**
 * @author lystart
 * @create 2023-02-15 20:28
 */
public class Test {
    public static void main(String[] args) {
        Equipment[] equipment = new Equipment[EQUIPMENTS.length];
        for (int i = 0; i < equipment.length; i++) {
            equipment[i] = new Equipment(
                    Integer.parseInt(Data.EQUIPMENTS[i][0]),
                    (Data.EQUIPMENTS[i][1]),
                    Double.parseDouble(Data.EQUIPMENTS[i][2]),
                    (Data.EQUIPMENTS[i][3]),
                    Status.getByValue(Integer.parseInt(Data.EQUIPMENTS[i][4])));
        }
        for (Equipment value : equipment) {
            System.out.println(value);
        }
//        System.out.print(Arrays.toString(equipment));
    }
}
