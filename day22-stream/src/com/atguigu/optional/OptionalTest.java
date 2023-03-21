package com.atguigu.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * 包名:com.atguigu.optional
 * @author Leevi
 * 日期2023-03-03  15:06
 *
 * Optional到底是干嘛的?
 * 1. 防止出现空指针异常
 * 2. 可以让你的非空判断更优雅
 */
public class OptionalTest {
    @Test
    public void test01(){
        //创建Optional
        //1. 创建一个空的Optional容器
        //Optional<Object> optional = Optional.empty();

        //2. 创建一个非空的Optional
        //Optional<String> optional = Optional.of("hello");

        //3. 创建一个可能为空，也可能非空的Optional
        Optional<Object> optional = Optional.ofNullable(null);
    }

    @Test
    public void test02(){
        //怎么从Optional中将值取出来
        //Optional<String> optional = Optional.of("hello");

        Optional<String> optional = Optional.ofNullable(null);
        //1. get()方法，只有当optional中有值的时候才能用get()方法获取
        //String s = optional.get();

        //2. orElse():如果optional中有值就获取那个值，如果没有值就自己给其一个值
        //String s = optional.orElse("aolafu");

        //3. orElseGet():如果optional中有值就获取那个值，如果没有值就通过供给型接口给其一个值
        /*Optional<Person> optional = Optional.ofNullable(null);
        Person p = optional.orElseGet(() -> {
            Person person = new Person();
            person.setName("aobama");
            return person;
        });*/

        //4. orElseThrow():如果optional中有值就获取那个值，如果没有就自己抛一个异常
        String s = optional.orElseThrow(RuntimeException :: new);
        System.out.println(s);
    }

    @Test
    public void test03(){
        Optional<String> optional = Optional.ofNullable(null);

        //判断optional中是否有元素
       //boolean flag = optional.isPresent();
       //System.out.println(flag);

        //ifPresent():如果optional中有元素，则使用消费型接口消费
        //optional.ifPresent(item -> System.out.println(item));

        //如果optional中有元素，则使用功能型接口操作元素
        Optional<String> opt1 = optional.map(item -> "hello:" + item);

        opt1.ifPresent(System.out :: println);
    }
}
