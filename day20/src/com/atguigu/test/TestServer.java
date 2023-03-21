package com.atguigu.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) {
        // 服务器端
        try{
            ServerSocket ss = new ServerSocket(8888);
            Socket socket = ss.accept();// 监听客户端请求，返回客户端请求的Socket对象
            // 从socket对象上获取一个输入流用于读取socket上数据
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
            System.out.println("这里是服务器，客户端的请求信息是："+s);
            socket.shutdownInput();// 关闭输入流，准备开启输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("你好，客户端，我是服务器，我收到了你的消息");
            bw.flush();
            bw.close();
            socket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
