package com.atguigu.bean;

/**
 * 包名:com.atguigu.bean
 *
 * @author Leevi
 * 日期2023-03-01  15:23
 */
public class Cat {
    private int id;
    private String catName;
    private String info;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", catName='" + catName + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
