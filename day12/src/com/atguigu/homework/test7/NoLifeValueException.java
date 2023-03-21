package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-17 18:46
 */
public class NoLifeValueException extends RuntimeException{
    public NoLifeValueException() {

    }
    public NoLifeValueException(String abnormal){
        super(abnormal);
    }
}
