package com.atguigu.test;// 表明当前类所在包

import java.util.Scanner;// 将该类导入到当前包
import java.util.*;// 将一个包下所有的类都导入到当前包
import java.lang.*;// 默认导入lang包下所有类

// 包可以解决类同名问题，不同的包下可以有同名的类
// Java语法规定，只能访问和当前类同包的类
// 如果想访问其他包的类，必须使用import关键字将该类导入到当前包下
// 任何一个java类默认导入java.lang.*
// 只有public修饰的类才可以被其他包import
public class Teacher {
    Scanner input = new Scanner(System.in);
    String word = "hello world";
}
