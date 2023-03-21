package com.atguigu.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno {
    // 注解中定义属性，调用注解时必须给属性赋值
    // 赋值的方式是：属性名=属性值
    // 如果属性名是value且注解中只有这一个属性，则赋值时可以省略属性名直接给出属性值
    // 可以通过default关键字给出一个属性的默认值，如果调用注解时没给属性赋值，则使用默认值
    String value() default "ok";
    // int age();
}
