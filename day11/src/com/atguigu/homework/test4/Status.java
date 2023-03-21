package com.atguigu.homework.test4;

import org.junit.Test;

import javax.swing.plaf.metal.MetalIconFactory;
import java.sql.SQLOutput;

/**
 * @author lystart
 * @create 2023-02-15 19:35
 */
public enum Status {
    FREE("空闲"),
    USED("在用"),
    SCRAP("报废");

    final String description;
    final int value = ordinal();

    @Test
public void aa(){
        System.out.println(value);
}

    public static Status getByValue(int value){
        Status[] status = Status.values();
        return status[value];
//        return Status.values()[value];
    }

    @Override
    public String toString() {
        return "Status{" +
                "description='" + description + '\'' +
                '}';
    }

    Status(String description) {
        this.description = description;
    }

}
