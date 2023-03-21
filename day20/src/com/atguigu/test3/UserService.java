package com.atguigu.test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> getAllUsers(){
        List<User> list = new ArrayList<>();
        try{
            File file = new File("day20\\file\\users.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(true){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                User user = new User();
                String[] datas = line.split("-");
                user.setUserName(datas[0]);
                user.setUserPwd(datas[1]);
                list.add(user);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    public boolean checkUserLogin(User user){
        boolean flag = false;
        List<User> list = getAllUsers();
        for (User userOne : list) {
            if(user.getUserName().equals(userOne.getUserName())
                    &&user.getUserPwd().equals(userOne.getUserPwd())){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
