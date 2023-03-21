package com.atguigu.test3;

import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        // 服务器端
        try {
            ServerSocket ss = new ServerSocket(8888);
            while(true) {
                Socket socket = ss.accept();// 监听客户端请求，返回客户端请求的Socket对象
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
