package com.atguigu.test3;

import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        List<User> list = userService.getAllUsers();
//        for (User user : list) {
//            System.out.println(user);
//        }
        User user = new User("Jerry","666666");
        System.out.println(userService.checkUserLogin(user));
    }
}
