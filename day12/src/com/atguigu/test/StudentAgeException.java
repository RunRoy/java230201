package com.atguigu.test;

// 自定义受检异常
public class StudentAgeException extends Exception{
// 自定义非受检异常
// public class StudentAgeException extends RuntimeException{
    public StudentAgeException(){
    }

    public StudentAgeException(String info){// 通过构造方法传递动态的异常信息
        super(info);
    }

    // 重写getMessage方法返回固定异常信息的优先级更高
    @Override
    public String getMessage() {
        return "学员年龄必须在20到40之间";// 返回固定的异常信息
    }
}
