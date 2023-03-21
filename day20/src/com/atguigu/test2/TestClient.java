package com.atguigu.test2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) {
        // 客户端
        try {
            do {
                Socket socket = new Socket("localhost", 8888);
                Scanner input = new Scanner(System.in);
                User user = new User();

                System.out.println("请输入用户名");
                user.setUserName(input.next());
                System.out.println("请输入密码");
                user.setUserPwd(input.next());

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject(user);
                oos.flush();

                socket.shutdownOutput();

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ResultInfo result = (ResultInfo) ois.readObject();
                System.out.println(result.getInfo());
                if (result.isFlag()) {
                    System.out.println("显示主菜单");
                    break;
                }
                socket.close();
            } while (true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
