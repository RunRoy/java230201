package com.atguigu.morningtest;

public class TestFly {
    public static void main(String[] args) {
        // 匿名内部类有名对象
        Fly fly = new Fly(){
            @Override
            public void flying() {
                System.out.println("in flying~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        };
        fly.flying();
        System.out.println("-----------------------------------------------");
        // 匿名内部类匿名对象
        new Fly(){
            @Override
            public void flying() {
                System.out.println("in flyingone~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }.flying();
        System.out.println("-----------------------------------------------------");
        // 匿名内部类有名对象传参
        Fly fly1 = new Fly() {
            @Override
            public void flying() {
                System.out.println("in flyingtwo~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        };
        test(fly1);
        System.out.println("------------------------------------------------------");
        // 匿名内部类匿名对象传参
        test(new Fly(){
            @Override
            public void flying() {
                System.out.println("in flythree~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        });
    }

    public static void test(Fly fly){
        fly.flying();
    }
}
