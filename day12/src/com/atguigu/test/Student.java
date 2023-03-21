package com.atguigu.test;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    // throws关键字声明方法抛出何种异常，一旦方法声明抛出某种异常，则编译器不会强制该方法处理该类异常
    // 方法声明抛出异常，则该异常会抛给调用点处理
    public void setStuAge(int stuAge)throws StudentAgeException{
        if(stuAge >= 20 && stuAge <= 40) {
            this.stuAge = stuAge;
        }else{
            // this.stuAge = 20;
            // throw关键字用于抛出手动创建的异常对象
            // try {
                // throw new Exception("学员年龄必须在20-40之间");
                // throw new RuntimeException("学员年龄必须在20-40之间");
                throw new StudentAgeException("学员年龄必须在20-40之间");
//            }catch (Exception ex){
//                ex.printStackTrace();
//            }
        }
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }
}
