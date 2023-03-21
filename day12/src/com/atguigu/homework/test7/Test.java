package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-17 18:57
 */
public class Test {
    public static void main(String[] args) {

        try {
            Person person = new Person("拉亚斯特", 9999);
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person per = new Person();
        per.setName("亚托克斯");
        try {
            per.setLifeValue(2888);
            per.setLifeValue(999);
        System.out.println(per);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
